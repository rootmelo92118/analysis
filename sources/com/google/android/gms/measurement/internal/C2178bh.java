package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bh */
final class C2178bh implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f8188a;

    /* renamed from: b */
    private final /* synthetic */ String f8189b;

    /* renamed from: c */
    private final /* synthetic */ String f8190c;

    /* renamed from: d */
    private final /* synthetic */ C2168ay f8191d;

    C2178bh(C2168ay ayVar, zzk zzk, String str, String str2) {
        this.f8191d = ayVar;
        this.f8188a = zzk;
        this.f8189b = str;
        this.f8190c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f8191d.f8159a.mo14538l();
        return this.f8191d.f8159a.mo14529d().mo14772b(this.f8188a.f8661a, this.f8189b, this.f8190c);
    }
}
