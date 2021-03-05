package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bi */
final class C2179bi implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ String f8192a;

    /* renamed from: b */
    private final /* synthetic */ String f8193b;

    /* renamed from: c */
    private final /* synthetic */ String f8194c;

    /* renamed from: d */
    private final /* synthetic */ C2168ay f8195d;

    C2179bi(C2168ay ayVar, String str, String str2, String str3) {
        this.f8195d = ayVar;
        this.f8192a = str;
        this.f8193b = str2;
        this.f8194c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f8195d.f8159a.mo14538l();
        return this.f8195d.f8159a.mo14529d().mo14772b(this.f8192a, this.f8193b, this.f8194c);
    }
}
