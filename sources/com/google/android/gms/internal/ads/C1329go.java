package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.go */
final class C1329go extends brm {

    /* renamed from: a */
    private final brl f5388a;

    C1329go(brl brl) {
        this.f5388a = brl;
    }

    /* renamed from: a */
    public final void mo12296a() {
        if (C1338gx.m6960a()) {
            int intValue = ((Integer) bre.m6321e().mo12778a(C1557p.f5903aK)).intValue();
            int intValue2 = ((Integer) bre.m6321e().mo12778a(C1557p.f5904aL)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                zzbv.zzlt().mo12553a();
            } else {
                C1782xi.f6838a.postDelayed(C1330gp.f5389a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f5388a.mo12296a();
    }

    /* renamed from: a */
    public final void mo12297a(int i) {
        this.f5388a.mo12297a(i);
    }

    /* renamed from: b */
    public final void mo12298b() {
        this.f5388a.mo12298b();
    }

    /* renamed from: c */
    public final void mo12299c() {
        this.f5388a.mo12299c();
    }

    /* renamed from: d */
    public final void mo12300d() {
        this.f5388a.mo12300d();
    }

    /* renamed from: e */
    public final void mo12301e() {
        this.f5388a.mo12301e();
    }

    /* renamed from: f */
    public final void mo12302f() {
        this.f5388a.mo12302f();
    }
}
