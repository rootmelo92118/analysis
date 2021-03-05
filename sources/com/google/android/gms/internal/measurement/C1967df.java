package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.df */
final class C1967df {

    /* renamed from: a */
    private final C1976do f7593a;

    /* renamed from: b */
    private final byte[] f7594b;

    private C1967df(int i) {
        this.f7594b = new byte[i];
        this.f7593a = C1976do.m9229a(this.f7594b);
    }

    /* renamed from: a */
    public final C1958cx mo13616a() {
        if (this.f7593a.mo13710b() == 0) {
            return new C1969dh(this.f7594b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final C1976do mo13617b() {
        return this.f7593a;
    }

    /* synthetic */ C1967df(int i, C1959cy cyVar) {
        this(i);
    }
}
