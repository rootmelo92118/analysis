package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.ah */
public final class C2151ah {

    /* renamed from: a */
    private final String f8072a;

    /* renamed from: b */
    private final String f8073b;

    /* renamed from: c */
    private final String f8074c;

    /* renamed from: d */
    private final long f8075d;

    /* renamed from: e */
    private final /* synthetic */ C2147ad f8076e;

    private C2151ah(C2147ad adVar, String str, long j) {
        this.f8076e = adVar;
        C0926p.m1308a(str);
        C0926p.m1316b(j > 0);
        this.f8072a = String.valueOf(str).concat(":start");
        this.f8073b = String.valueOf(str).concat(":count");
        this.f8074c = String.valueOf(str).concat(":value");
        this.f8075d = j;
    }

    @WorkerThread
    /* renamed from: b */
    private final void m10447b() {
        this.f8076e.mo14221d();
        long a = this.f8076e.mo14230m().mo9996a();
        SharedPreferences.Editor edit = this.f8076e.m10423y().edit();
        edit.remove(this.f8073b);
        edit.remove(this.f8074c);
        edit.putLong(this.f8072a, a);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14268a(String str, long j) {
        this.f8076e.mo14221d();
        if (m10448c() == 0) {
            m10447b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f8076e.m10423y().getLong(this.f8073b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f8076e.m10423y().edit();
            edit.putString(this.f8074c, str);
            edit.putLong(this.f8073b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f8076e.mo14233p().mo14582h().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f8076e.m10423y().edit();
        if (z) {
            edit2.putString(this.f8074c, str);
        }
        edit2.putLong(this.f8073b, j3);
        edit2.apply();
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair<String, Long> mo14267a() {
        long j;
        this.f8076e.mo14221d();
        this.f8076e.mo14221d();
        long c = m10448c();
        if (c == 0) {
            m10447b();
            j = 0;
        } else {
            j = Math.abs(c - this.f8076e.mo14230m().mo9996a());
        }
        if (j < this.f8075d) {
            return null;
        }
        if (j > (this.f8075d << 1)) {
            m10447b();
            return null;
        }
        String string = this.f8076e.m10423y().getString(this.f8074c, (String) null);
        long j2 = this.f8076e.m10423y().getLong(this.f8073b, 0);
        m10447b();
        if (string == null || j2 <= 0) {
            return C2147ad.f8042a;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    @WorkerThread
    /* renamed from: c */
    private final long m10448c() {
        return this.f8076e.m10423y().getLong(this.f8072a, 0);
    }
}
