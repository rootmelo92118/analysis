package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bg */
final class C2177bg implements Callable<List<C2263ek>> {

    /* renamed from: a */
    private final /* synthetic */ String f8184a;

    /* renamed from: b */
    private final /* synthetic */ String f8185b;

    /* renamed from: c */
    private final /* synthetic */ String f8186c;

    /* renamed from: d */
    private final /* synthetic */ C2168ay f8187d;

    C2177bg(C2168ay ayVar, String str, String str2, String str3) {
        this.f8187d = ayVar;
        this.f8184a = str;
        this.f8185b = str2;
        this.f8186c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f8187d.f8159a.mo14538l();
        return this.f8187d.f8159a.mo14529d().mo14760a(this.f8184a, this.f8185b, this.f8186c);
    }
}
