package com.crashlytics.android.answers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p001a.p002a.p003a.C0139c;

class BackgroundManager {
    private static final int BACKGROUND_DELAY = 5000;
    final AtomicReference<ScheduledFuture<?>> backgroundFutureRef = new AtomicReference<>();
    private final ScheduledExecutorService executorService;
    private volatile boolean flushOnBackground = true;
    boolean inBackground = true;
    private final List<Listener> listeners = new ArrayList();

    public interface Listener {
        void onBackground();
    }

    public BackgroundManager(ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    public void setFlushOnBackground(boolean z) {
        this.flushOnBackground = z;
    }

    /* access modifiers changed from: private */
    public void notifyBackground() {
        for (Listener onBackground : this.listeners) {
            onBackground.onBackground();
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void onActivityResumed() {
        this.inBackground = false;
        ScheduledFuture andSet = this.backgroundFutureRef.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    public void onActivityPaused() {
        if (this.flushOnBackground && !this.inBackground) {
            this.inBackground = true;
            try {
                this.backgroundFutureRef.compareAndSet((Object) null, this.executorService.schedule(new Runnable() {
                    public void run() {
                        BackgroundManager.this.backgroundFutureRef.set((Object) null);
                        BackgroundManager.this.notifyBackground();
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                C0139c.m394g().mo282a(Answers.TAG, "Failed to schedule background detector", (Throwable) e);
            }
        }
    }
}
