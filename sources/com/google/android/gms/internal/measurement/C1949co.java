package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.co */
final /* synthetic */ class C1949co implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C1948cn f7575a;

    C1949co(C1948cn cnVar) {
        this.f7575a = cnVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f7575a.mo13564a(sharedPreferences, str);
    }
}
