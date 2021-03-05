package com.crashlytics.android.answers;

import p000a.p001a.p002a.p003a.p004a.p007c.p008a.C0063e;

class RetryManager {
    private static final long NANOSECONDS_IN_MS = 1000000;
    long lastRetry;
    private C0063e retryState;

    public RetryManager(C0063e eVar) {
        if (eVar != null) {
            this.retryState = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public boolean canRetry(long j) {
        return j - this.lastRetry >= this.retryState.mo111a() * NANOSECONDS_IN_MS;
    }

    public void recordRetry(long j) {
        this.lastRetry = j;
        this.retryState = this.retryState.mo112b();
    }

    public void reset() {
        this.lastRetry = 0;
        this.retryState = this.retryState.mo113c();
    }
}
