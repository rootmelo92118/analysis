package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.wm */
final class C1759wm extends C1768wv {

    /* renamed from: a */
    private final /* synthetic */ C1757wk f6773a;

    C1759wm(C1757wk wkVar) {
        this.f6773a = wkVar;
    }

    public final void onStop() {
    }

    public final void zzki() {
        C1611r rVar = new C1611r(this.f6773a.f6763f, this.f6773a.f6764g.f7135a);
        synchronized (this.f6773a.f6758a) {
            try {
                zzbv.zzlo();
                C1692u.m8022a(this.f6773a.f6765h, rVar);
            } catch (IllegalArgumentException e) {
                C1772wz.m1627c("Cannot config CSI reporter.", e);
            }
        }
    }
}
