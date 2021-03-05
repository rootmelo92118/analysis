package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.eg */
final class C2259eg implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzk f8439a;

    /* renamed from: b */
    private final /* synthetic */ C2254ec f8440b;

    C2259eg(C2254ec ecVar, zzk zzk) {
        this.f8440b = ecVar;
        this.f8439a = zzk;
    }

    public final /* synthetic */ Object call() {
        C2266en enVar;
        if (this.f8440b.mo14522b().mo14733j(this.f8439a.f8661a)) {
            enVar = this.f8440b.m10927e(this.f8439a);
        } else {
            enVar = this.f8440b.mo14529d().mo14771b(this.f8439a.f8661a);
        }
        if (enVar != null) {
            return enVar.mo14605c();
        }
        this.f8440b.mo14235r().mo14833i().mo14841a("App info was null when attempting to get app instance id");
        return null;
    }
}
