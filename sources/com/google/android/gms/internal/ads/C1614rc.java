package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C0858g;

/* renamed from: com.google.android.gms.internal.ads.rc */
final class C1614rc implements C1617rf {

    /* renamed from: a */
    private final /* synthetic */ Context f6286a;

    C1614rc(Context context) {
        this.f6286a = context;
    }

    /* renamed from: a */
    public final boolean mo12915a(zzbbi zzbbi) {
        bre.m6317a();
        boolean c = C1851zx.m8599c(this.f6286a, C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        boolean z = ((Boolean) bre.m6321e().mo12778a(C1557p.f6047cw)).booleanValue() && zzbbi.f7138d;
        zzbv.zzlf();
        return !C1613rb.m7822b(this.f6286a, zzbbi.f7138d) || !c || z || C1782xi.m8402f(this.f6286a.getPackageName());
    }
}
