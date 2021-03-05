package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bm */
final class C2183bm implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzag f8204a;

    /* renamed from: b */
    private final /* synthetic */ String f8205b;

    /* renamed from: c */
    private final /* synthetic */ C2168ay f8206c;

    C2183bm(C2168ay ayVar, zzag zzag, String str) {
        this.f8206c = ayVar;
        this.f8204a = zzag;
        this.f8205b = str;
    }

    public final /* synthetic */ Object call() {
        this.f8206c.f8159a.mo14538l();
        return this.f8206c.f8159a.mo14532f().mo14425a(this.f8204a, this.f8205b);
    }
}
