package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.du */
final class C2245du extends C2281fb {

    /* renamed from: a */
    private final /* synthetic */ C2242dr f8388a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2245du(C2242dr drVar, C2191bu buVar) {
        super(buVar);
        this.f8388a = drVar;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14452a() {
        C2242dr drVar = this.f8388a;
        drVar.mo14221d();
        drVar.mo14235r().mo14838x().mo14841a("Current session is expired, remove the session number and Id");
        if (drVar.mo14237t().mo14739p(drVar.mo14224g().mo14808x())) {
            drVar.mo14223f().mo14397a("auto", "_sid", (Object) null, drVar.mo14230m().mo9996a());
        }
        if (drVar.mo14237t().mo14740q(drVar.mo14224g().mo14808x())) {
            drVar.mo14223f().mo14397a("auto", "_sno", (Object) null, drVar.mo14230m().mo9996a());
        }
    }
}
