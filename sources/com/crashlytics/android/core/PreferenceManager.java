package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import p000a.p001a.p002a.p003a.p004a.p011f.C0109c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0110d;

@SuppressLint({"CommitPrefEdits"})
class PreferenceManager {
    static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final CrashlyticsCore kit;
    private final C0109c preferenceStore;

    public static PreferenceManager create(C0109c cVar, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(cVar, crashlyticsCore);
    }

    public PreferenceManager(C0109c cVar, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = cVar;
        this.kit = crashlyticsCore;
    }

    /* access modifiers changed from: package-private */
    public void setShouldAlwaysSendReports(boolean z) {
        this.preferenceStore.mo257a(this.preferenceStore.mo258b().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    /* access modifiers changed from: package-private */
    public boolean shouldAlwaysSendReports() {
        if (!this.preferenceStore.mo256a().contains(PREF_MIGRATION_COMPLETE)) {
            C0110d dVar = new C0110d(this.kit);
            if (!this.preferenceStore.mo256a().contains(PREF_ALWAYS_SEND_REPORTS_KEY) && dVar.mo256a().contains(PREF_ALWAYS_SEND_REPORTS_KEY)) {
                this.preferenceStore.mo257a(this.preferenceStore.mo258b().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, dVar.mo256a().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false)));
            }
            this.preferenceStore.mo257a(this.preferenceStore.mo258b().putBoolean(PREF_MIGRATION_COMPLETE, true));
        }
        return this.preferenceStore.mo256a().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }
}
