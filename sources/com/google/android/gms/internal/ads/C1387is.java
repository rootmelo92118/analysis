package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.internal.ads.is */
public final class C1387is extends abw<C1355hn> {

    /* renamed from: a */
    private final Object f5501a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1816yp<C1355hn> f5502b;

    /* renamed from: c */
    private boolean f5503c;

    /* renamed from: d */
    private int f5504d;

    public C1387is(C1816yp<C1355hn> ypVar) {
        this.f5502b = ypVar;
        this.f5503c = false;
        this.f5504d = 0;
    }

    /* renamed from: a */
    public final C1383io mo12625a() {
        C1383io ioVar = new C1383io(this);
        synchronized (this.f5501a) {
            mo10093a(new C1388it(this, ioVar), new C1389iu(this, ioVar));
            C0926p.m1312a(this.f5504d >= 0);
            this.f5504d++;
        }
        return ioVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12626b() {
        synchronized (this.f5501a) {
            C0926p.m1312a(this.f5504d > 0);
            C1772wz.m8287a("Releasing 1 reference for JS Engine");
            this.f5504d--;
            m7065f();
        }
    }

    /* renamed from: c */
    public final void mo12627c() {
        synchronized (this.f5501a) {
            C0926p.m1312a(this.f5504d >= 0);
            C1772wz.m8287a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f5503c = true;
            m7065f();
        }
    }

    /* renamed from: f */
    private final void m7065f() {
        synchronized (this.f5501a) {
            C0926p.m1312a(this.f5504d >= 0);
            if (!this.f5503c || this.f5504d != 0) {
                C1772wz.m8287a("There are still references to the engine. Not destroying.");
            } else {
                C1772wz.m8287a("No reference is left (including root). Cleaning up engine.");
                mo10093a(new C1390iv(this), new abu());
            }
        }
    }
}
