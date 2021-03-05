package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0018g;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p009d.C0086f;
import p000a.p001a.p002a.p003a.p004a.p009d.C0089i;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0112b;

class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    C0018g apiKey = new C0018g();
    private final Context context;
    boolean customEventsEnabled = true;
    EventFilter eventFilter = new KeepAllEventFilter();
    private final ScheduledExecutorService executorService;
    private final SessionAnalyticsFilesManager filesManager;
    C0086f filesSender;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    boolean forwardToFirebaseAnalyticsEnabled = false;
    private final C0102e httpRequestFactory;
    boolean includePurchaseEventsInForwardedEvents = false;
    private final C0150i kit;
    final SessionEventMetadata metadata;
    boolean predefinedEventsEnabled = true;
    private final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference<>();
    volatile int rolloverIntervalSeconds = -1;

    public EnabledSessionAnalyticsManagerStrategy(C0150i iVar, Context context2, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, C0102e eVar, SessionEventMetadata sessionEventMetadata, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter2) {
        this.kit = iVar;
        this.context = context2;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = eVar;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter2;
    }

    public void setAnalyticsSettingsData(C0112b bVar, String str) {
        this.filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(this.kit, str, bVar.f205a, this.httpRequestFactory, this.apiKey.mo40a(this.context)));
        this.filesManager.setAnalyticsSettingsData(bVar);
        this.forwardToFirebaseAnalyticsEnabled = bVar.f210f;
        this.includePurchaseEventsInForwardedEvents = bVar.f211g;
        C0153l g = C0139c.m394g();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        sb.append(this.forwardToFirebaseAnalyticsEnabled ? "enabled" : "disabled");
        g.mo281a(Answers.TAG, sb.toString());
        C0153l g2 = C0139c.m394g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.includePurchaseEventsInForwardedEvents ? "enabled" : "disabled");
        g2.mo281a(Answers.TAG, sb2.toString());
        this.customEventsEnabled = bVar.f212h;
        C0153l g3 = C0139c.m394g();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.customEventsEnabled ? "enabled" : "disabled");
        g3.mo281a(Answers.TAG, sb3.toString());
        this.predefinedEventsEnabled = bVar.f213i;
        C0153l g4 = C0139c.m394g();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Predefined event tracking ");
        sb4.append(this.predefinedEventsEnabled ? "enabled" : "disabled");
        g4.mo281a(Answers.TAG, sb4.toString());
        if (bVar.f215k > 1) {
            C0139c.m394g().mo281a(Answers.TAG, "Event sampling enabled");
            this.eventFilter = new SamplingEventFilter(bVar.f215k);
        }
        this.rolloverIntervalSeconds = bVar.f206b;
        scheduleTimeBasedFileRollOver(0, (long) this.rolloverIntervalSeconds);
    }

    public void processEvent(SessionEvent.Builder builder) {
        SessionEvent build = builder.build(this.metadata);
        if (!this.customEventsEnabled && SessionEvent.Type.CUSTOM.equals(build.type)) {
            C0153l g = C0139c.m394g();
            g.mo281a(Answers.TAG, "Custom events tracking disabled - skipping event: " + build);
        } else if (!this.predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(build.type)) {
            C0153l g2 = C0139c.m394g();
            g2.mo281a(Answers.TAG, "Predefined events tracking disabled - skipping event: " + build);
        } else if (this.eventFilter.skipEvent(build)) {
            C0153l g3 = C0139c.m394g();
            g3.mo281a(Answers.TAG, "Skipping filtered event: " + build);
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (IOException e) {
                C0153l g4 = C0139c.m394g();
                g4.mo291e(Answers.TAG, "Failed to write event: " + build, e);
            }
            scheduleTimeBasedRollOverIfNeeded();
            boolean z = SessionEvent.Type.CUSTOM.equals(build.type) || SessionEvent.Type.PREDEFINED.equals(build.type);
            boolean equals = "purchase".equals(build.predefinedType);
            if (this.forwardToFirebaseAnalyticsEnabled && z) {
                if (!equals || this.includePurchaseEventsInForwardedEvents) {
                    try {
                        this.firebaseAnalyticsApiAdapter.processEvent(build);
                    } catch (Exception e2) {
                        C0153l g5 = C0139c.m394g();
                        g5.mo291e(Answers.TAG, "Failed to map event to Firebase: " + build, e2);
                    }
                }
            }
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver((long) this.rolloverIntervalSeconds, (long) this.rolloverIntervalSeconds);
        }
    }

    public void sendEvents() {
        if (this.filesSender == null) {
            C0020i.m55a(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C0020i.m55a(this.context, "Sending all files");
        List<File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (true) {
            try {
                if (batchOfFilesToSend.size() <= 0) {
                    break;
                }
                C0020i.m55a(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
                boolean send = this.filesSender.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e) {
                Context context2 = this.context;
                C0020i.m56a(context2, "Failed to send batch of analytics files to server: " + e.getMessage(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            C0020i.m55a(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.rolloverFutureRef.get().cancel(false);
            this.rolloverFutureRef.set((Object) null);
        }
    }

    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException e) {
            C0020i.m56a(this.context, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.rolloverFutureRef.get() == null) {
            C0089i iVar = new C0089i(this.context, this);
            Context context2 = this.context;
            C0020i.m55a(context2, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(iVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C0020i.m56a(this.context, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }
}
