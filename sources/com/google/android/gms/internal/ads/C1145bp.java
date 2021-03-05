package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bp */
final class C1145bp implements zzu<Object> {

    /* renamed from: a */
    private final /* synthetic */ C1575pr f4962a;

    /* renamed from: b */
    private final /* synthetic */ C1139bm f4963b;

    C1145bp(C1139bm bmVar, C1575pr prVar) {
        this.f4963b = bmVar;
        this.f4962a = prVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        afl afl = (afl) this.f4963b.f4736a.get();
        if (afl == null) {
            this.f4962a.mo12888b("/showOverlay", this);
        } else {
            afl.getView().setVisibility(0);
        }
    }
}
