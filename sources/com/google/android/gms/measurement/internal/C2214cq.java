package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cq */
final class C2214cq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f8295a;

    /* renamed from: b */
    private final /* synthetic */ C2212co f8296b;

    /* renamed from: c */
    private final /* synthetic */ C2212co f8297c;

    /* renamed from: d */
    private final /* synthetic */ C2213cp f8298d;

    C2214cq(C2213cp cpVar, boolean z, C2212co coVar, C2212co coVar2) {
        this.f8298d = cpVar;
        this.f8295a = z;
        this.f8296b = coVar;
        this.f8297c = coVar2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f8298d.mo14237t().mo14743t(this.f8298d.mo14224g().mo14808x())) {
            z = this.f8295a && this.f8298d.f8289a != null;
            if (z) {
                this.f8298d.m10707a(this.f8298d.f8289a, true);
            }
        } else {
            if (this.f8295a && this.f8298d.f8289a != null) {
                this.f8298d.m10707a(this.f8298d.f8289a, true);
            }
            z = false;
        }
        if (this.f8296b == null || this.f8296b.f8287c != this.f8297c.f8287c || !C2264el.m11033c(this.f8296b.f8286b, this.f8297c.f8286b) || !C2264el.m11033c(this.f8296b.f8285a, this.f8297c.f8285a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C2213cp.m10706a(this.f8297c, bundle, true);
            if (this.f8296b != null) {
                if (this.f8296b.f8285a != null) {
                    bundle.putString("_pn", this.f8296b.f8285a);
                }
                bundle.putString("_pc", this.f8296b.f8286b);
                bundle.putLong("_pi", this.f8296b.f8287c);
            }
            if (this.f8298d.mo14237t().mo14743t(this.f8298d.mo14224g().mo14808x()) && z) {
                long y = this.f8298d.mo14228k().mo14496y();
                if (y > 0) {
                    this.f8298d.mo14233p().mo14568a(bundle, y);
                }
            }
            this.f8298d.mo14223f().mo14404b("auto", "_vs", bundle);
        }
        this.f8298d.f8289a = this.f8297c;
        this.f8298d.mo14225h().mo14440a(this.f8297c);
    }
}
