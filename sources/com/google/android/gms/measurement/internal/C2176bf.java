package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bf */
final class C2176bf implements Callable<List<C2263ek>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f8180a;

    /* renamed from: b */
    private final /* synthetic */ String f8181b;

    /* renamed from: c */
    private final /* synthetic */ String f8182c;

    /* renamed from: d */
    private final /* synthetic */ C2168ay f8183d;

    C2176bf(C2168ay ayVar, zzk zzk, String str, String str2) {
        this.f8183d = ayVar;
        this.f8180a = zzk;
        this.f8181b = str;
        this.f8182c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f8183d.f8159a.mo14538l();
        return this.f8183d.f8159a.mo14529d().mo14760a(this.f8180a.f8661a, this.f8181b, this.f8182c);
    }
}
