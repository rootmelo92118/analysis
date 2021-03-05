package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p000a.p001a.p002a.p003a.p004a.p007c.p008a.C0060b;
import p000a.p001a.p002a.p003a.p004a.p007c.p008a.C0061c;
import p000a.p001a.p002a.p003a.p004a.p007c.p008a.C0063e;
import p000a.p001a.p002a.p003a.p004a.p009d.C0086f;

class AnswersRetryFilesSender implements C0086f {
    private static final int BACKOFF_MS = 1000;
    private static final int BACKOFF_POWER = 8;
    private static final double JITTER_PERCENT = 0.1d;
    private static final int MAX_RETRIES = 5;
    private final SessionAnalyticsFilesSender filesSender;
    private final RetryManager retryManager;

    public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionAnalyticsFilesSender) {
        return new AnswersRetryFilesSender(sessionAnalyticsFilesSender, new RetryManager(new C0063e(new RandomBackoff(new C0061c(1000, 8), JITTER_PERCENT), new C0060b(5))));
    }

    AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionAnalyticsFilesSender, RetryManager retryManager2) {
        this.filesSender = sessionAnalyticsFilesSender;
        this.retryManager = retryManager2;
    }

    public boolean send(List<File> list) {
        long nanoTime = System.nanoTime();
        if (!this.retryManager.canRetry(nanoTime)) {
            return false;
        }
        if (this.filesSender.send(list)) {
            this.retryManager.reset();
            return true;
        }
        this.retryManager.recordRetry(nanoTime);
        return false;
    }
}
