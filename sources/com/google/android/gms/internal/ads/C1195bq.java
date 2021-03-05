package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bq */
final class C1195bq implements zzu<Object> {

    /* renamed from: a */
    private final /* synthetic */ C1575pr f5060a;

    /* renamed from: b */
    private final /* synthetic */ C1139bm f5061b;

    C1195bq(C1139bm bmVar, C1575pr prVar) {
        this.f5061b = bmVar;
        this.f5060a = prVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        afl afl = (afl) this.f5061b.f4736a.get();
        if (afl == null) {
            this.f5060a.mo12888b("/hideOverlay", this);
        } else {
            afl.getView().setVisibility(8);
        }
    }
}
