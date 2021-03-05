package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import p000a.p001a.p002a.p003a.p004a.p009d.C0085e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0112b;

interface SessionAnalyticsManagerStrategy extends C0085e {
    void deleteAllEvents();

    void processEvent(SessionEvent.Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(C0112b bVar, String str);
}
