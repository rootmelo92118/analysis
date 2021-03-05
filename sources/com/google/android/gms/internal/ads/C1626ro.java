package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ro */
public final class C1626ro extends C1633rv {

    /* renamed from: a */
    private final WeakReference<C1616re> f6356a;

    public C1626ro(C1616re reVar) {
        this.f6356a = new WeakReference<>(reVar);
    }

    /* renamed from: a */
    public final void mo12922a(zzasm zzasm) {
        C1616re reVar = (C1616re) this.f6356a.get();
        if (reVar != null) {
            reVar.mo12906a(zzasm);
        }
    }
}
