package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.af */
public final class C2149af {

    /* renamed from: a */
    private final String f8062a;

    /* renamed from: b */
    private final boolean f8063b = true;

    /* renamed from: c */
    private boolean f8064c;

    /* renamed from: d */
    private boolean f8065d;

    /* renamed from: e */
    private final /* synthetic */ C2147ad f8066e;

    public C2149af(C2147ad adVar, String str, boolean z) {
        this.f8066e = adVar;
        C0926p.m1308a(str);
        this.f8062a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14264a() {
        if (!this.f8064c) {
            this.f8064c = true;
            this.f8065d = this.f8066e.m10423y().getBoolean(this.f8062a, this.f8063b);
        }
        return this.f8065d;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14263a(boolean z) {
        SharedPreferences.Editor edit = this.f8066e.m10423y().edit();
        edit.putBoolean(this.f8062a, z);
        edit.apply();
        this.f8065d = z;
    }
}
