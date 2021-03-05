package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.ag */
public final class C2150ag {

    /* renamed from: a */
    private final String f8067a;

    /* renamed from: b */
    private final long f8068b;

    /* renamed from: c */
    private boolean f8069c;

    /* renamed from: d */
    private long f8070d;

    /* renamed from: e */
    private final /* synthetic */ C2147ad f8071e;

    public C2150ag(C2147ad adVar, String str, long j) {
        this.f8071e = adVar;
        C0926p.m1308a(str);
        this.f8067a = str;
        this.f8068b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo14265a() {
        if (!this.f8069c) {
            this.f8069c = true;
            this.f8070d = this.f8071e.m10423y().getLong(this.f8067a, this.f8068b);
        }
        return this.f8070d;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14266a(long j) {
        SharedPreferences.Editor edit = this.f8071e.m10423y().edit();
        edit.putLong(this.f8067a, j);
        edit.apply();
        this.f8070d = j;
    }
}
