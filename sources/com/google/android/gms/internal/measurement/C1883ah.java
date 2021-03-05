package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.measurement.internal.C2196bz;

/* renamed from: com.google.android.gms.internal.measurement.ah */
final class C1883ah extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ C2196bz f7352c;

    /* renamed from: d */
    private final /* synthetic */ C2128r f7353d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1883ah(C2128r rVar, C2196bz bzVar) {
        super(rVar);
        this.f7353d = rVar;
        this.f7352c = bzVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        if (this.f7353d.f7975f.containsKey(this.f7352c)) {
            Log.w(this.f7353d.f7972c, "OnEventListener already registered.");
            return;
        }
        C2128r.C2131c cVar = new C2128r.C2131c(this.f7352c);
        this.f7353d.f7975f.put(this.f7352c, cVar);
        this.f7353d.f7979j.mo13882b((C2122l) cVar);
    }
}
