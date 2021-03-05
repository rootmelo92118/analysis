package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.tc */
final class C1668tc implements Callable<C1663sy> {

    /* renamed from: a */
    private final /* synthetic */ Context f6536a;

    /* renamed from: b */
    private final /* synthetic */ C1667tb f6537b;

    C1668tc(C1667tb tbVar, Context context) {
        this.f6537b = tbVar;
        this.f6536a = context;
    }

    public final /* synthetic */ Object call() {
        C1663sy syVar;
        C1669td tdVar = (C1669td) this.f6537b.f6535a.get(this.f6536a);
        if (tdVar != null) {
            if (!(tdVar.f6538a + ((Long) bre.m6321e().mo12778a(C1557p.f5916aX)).longValue() < zzbv.zzlm().mo9996a())) {
                syVar = new C1666ta(this.f6536a, tdVar.f6539b).mo12965a();
                this.f6537b.f6535a.put(this.f6536a, new C1669td(this.f6537b, syVar));
                return syVar;
            }
        }
        syVar = new C1666ta(this.f6536a).mo12965a();
        this.f6537b.f6535a.put(this.f6536a, new C1669td(this.f6537b, syVar));
        return syVar;
    }
}
