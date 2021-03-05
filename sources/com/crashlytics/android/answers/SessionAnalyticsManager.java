package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager;
import com.crashlytics.android.answers.SessionEvent;
import java.util.concurrent.ScheduledExecutorService;
import p000a.p001a.p002a.p003a.C0000a;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0029n;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;
import p000a.p001a.p002a.p003a.p004a.p010e.C0091b;
import p000a.p001a.p002a.p003a.p004a.p011f.C0108b;
import p000a.p001a.p002a.p003a.p004a.p012g.C0112b;

class SessionAnalyticsManager implements BackgroundManager.Listener {
    static final String EXECUTOR_SERVICE = "Answers Events Handler";
    static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    final BackgroundManager backgroundManager;
    final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final C0000a lifecycleManager;
    final AnswersPreferenceManager preferenceManager;

    public void onError(String str) {
    }

    public static SessionAnalyticsManager build(C0150i iVar, Context context, C0036r rVar, String str, String str2, long j) {
        Context context2 = context;
        C0036r rVar2 = rVar;
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, rVar, str, str2);
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new C0108b(iVar));
        C0091b bVar = new C0091b(C0139c.m394g());
        C0000a aVar = new C0000a(context);
        ScheduledExecutorService b = C0029n.m95b(EXECUTOR_SERVICE);
        BackgroundManager backgroundManager2 = new BackgroundManager(b);
        return new SessionAnalyticsManager(new AnswersEventsHandler(iVar, context, answersFilesManagerProvider, sessionMetadataCollector, bVar, b, new FirebaseAnalyticsApiAdapter(context)), aVar, backgroundManager2, AnswersPreferenceManager.build(context), j);
    }

    SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, C0000a aVar, BackgroundManager backgroundManager2, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = aVar;
        this.backgroundManager = backgroundManager2;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.mo2a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public void disable() {
        this.lifecycleManager.mo1a();
        this.eventsHandler.disable();
    }

    public void onCustom(CustomEvent customEvent) {
        C0153l g = C0139c.m394g();
        g.mo281a(Answers.TAG, "Logged custom event: " + customEvent);
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        C0153l g = C0139c.m394g();
        g.mo281a(Answers.TAG, "Logged predefined event: " + predefinedEvent);
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C0139c.m394g().mo281a(Answers.TAG, "Logged crash");
            this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
            return;
        }
        throw new IllegalStateException(ON_CRASH_ERROR_MSG);
    }

    public void onInstall(long j) {
        C0139c.m394g().mo281a(Answers.TAG, "Logged install");
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j));
    }

    public void onLifecycle(Activity activity, SessionEvent.Type type) {
        C0153l g = C0139c.m394g();
        g.mo281a(Answers.TAG, "Logged lifecycle event: " + type.name());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onBackground() {
        C0139c.m394g().mo281a(Answers.TAG, "Flush events when app is backgrounded");
        this.eventsHandler.flushEvents();
    }

    public void setAnalyticsSettingsData(C0112b bVar, String str) {
        this.backgroundManager.setFlushOnBackground(bVar.f214j);
        this.eventsHandler.setAnalyticsSettingsData(bVar, str);
    }

    /* access modifiers changed from: package-private */
    public boolean isFirstLaunch() {
        return !this.preferenceManager.hasAnalyticsLaunched();
    }
}
