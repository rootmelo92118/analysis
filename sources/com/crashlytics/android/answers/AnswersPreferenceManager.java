package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import p000a.p001a.p002a.p003a.p004a.p011f.C0109c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0110d;

class AnswersPreferenceManager {
    static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final String PREF_STORE_NAME = "settings";
    private final C0109c prefStore;

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new C0110d(context, PREF_STORE_NAME));
    }

    AnswersPreferenceManager(C0109c cVar) {
        this.prefStore = cVar;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        this.prefStore.mo257a(this.prefStore.mo258b().putBoolean(PREFKEY_ANALYTICS_LAUNCHED, true));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return this.prefStore.mo256a().getBoolean(PREFKEY_ANALYTICS_LAUNCHED, false);
    }
}
