package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cf */
final class C2203cf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8262a;

    /* renamed from: b */
    private final /* synthetic */ String f8263b;

    /* renamed from: c */
    private final /* synthetic */ Object f8264c;

    /* renamed from: d */
    private final /* synthetic */ long f8265d;

    /* renamed from: e */
    private final /* synthetic */ C2200cc f8266e;

    C2203cf(C2200cc ccVar, String str, String str2, Object obj, long j) {
        this.f8266e = ccVar;
        this.f8262a = str;
        this.f8263b = str2;
        this.f8264c = obj;
        this.f8265d = j;
    }

    public final void run() {
        this.f8266e.mo14397a(this.f8262a, this.f8263b, this.f8264c, this.f8265d);
    }
}
