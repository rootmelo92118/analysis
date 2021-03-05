package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.io */
public final class C1383io extends abw<C1392ix> {

    /* renamed from: a */
    private final Object f5496a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1387is f5497b;

    /* renamed from: c */
    private boolean f5498c;

    public C1383io(C1387is isVar) {
        this.f5497b = isVar;
    }

    /* renamed from: a */
    public final void mo12624a() {
        synchronized (this.f5496a) {
            if (!this.f5498c) {
                this.f5498c = true;
                mo10093a(new C1384ip(this), new abu());
                mo10093a(new C1385iq(this), new C1386ir(this));
            }
        }
    }
}
