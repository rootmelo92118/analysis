package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.measurement.internal.C2196bz;

/* renamed from: com.google.android.gms.internal.measurement.ai */
final class C1884ai extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ C2196bz f7354c;

    /* renamed from: d */
    private final /* synthetic */ C2128r f7355d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1884ai(C2128r rVar, C2196bz bzVar) {
        super(rVar);
        this.f7355d = rVar;
        this.f7354c = bzVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        C2128r.C2131c cVar = (C2128r.C2131c) this.f7355d.f7975f.get(this.f7354c);
        if (cVar == null) {
            Log.w(this.f7355d.f7972c, "OnEventListener had not been registered.");
            return;
        }
        this.f7355d.f7979j.mo13887c((C2122l) cVar);
        this.f7355d.f7975f.remove(this.f7354c);
    }
}
