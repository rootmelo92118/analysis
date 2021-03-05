package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import p000a.p001a.p002a.p003a.p004a.p012g.C0112b;

class DisabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    public void cancelTimeBasedFileRollOver() {
    }

    public void deleteAllEvents() {
    }

    public void processEvent(SessionEvent.Builder builder) {
    }

    public boolean rollFileOver() {
        return false;
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    public void sendEvents() {
    }

    public void setAnalyticsSettingsData(C0112b bVar, String str) {
    }

    DisabledSessionAnalyticsManagerStrategy() {
    }
}
