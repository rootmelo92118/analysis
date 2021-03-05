package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.measurement.C1961d;

/* renamed from: com.google.android.gms.measurement.internal.fb */
abstract class C2281fb {

    /* renamed from: b */
    private static volatile Handler f8502b;

    /* renamed from: a */
    private final C2191bu f8503a;

    /* renamed from: c */
    private final Runnable f8504c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f8505d;

    C2281fb(C2191bu buVar) {
        C0926p.m1306a(buVar);
        this.f8503a = buVar;
        this.f8504c = new C2282fc(this, buVar);
    }

    /* renamed from: a */
    public abstract void mo14452a();

    /* renamed from: a */
    public final void mo14796a(long j) {
        mo14798c();
        if (j >= 0) {
            this.f8505d = this.f8503a.mo14230m().mo9996a();
            if (!m11271d().postDelayed(this.f8504c, j)) {
                this.f8503a.mo14235r().mo14830d_().mo14842a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo14797b() {
        return this.f8505d != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14798c() {
        this.f8505d = 0;
        m11271d().removeCallbacks(this.f8504c);
    }

    /* renamed from: d */
    private final Handler m11271d() {
        Handler handler;
        if (f8502b != null) {
            return f8502b;
        }
        synchronized (C2281fb.class) {
            if (f8502b == null) {
                f8502b = new C1961d(this.f8503a.mo14231n().getMainLooper());
            }
            handler = f8502b;
        }
        return handler;
    }
}
