package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ie */
public abstract class C2116ie {

    /* renamed from: M */
    protected volatile int f7955M = -1;

    /* renamed from: a */
    public abstract C2116ie mo13498a(C2106hv hvVar);

    /* renamed from: a */
    public void mo13499a(C2107hw hwVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13500b() {
        return 0;
    }

    /* renamed from: d */
    public final int mo14105d() {
        if (this.f7955M < 0) {
            mo14106e();
        }
        return this.f7955M;
    }

    /* renamed from: e */
    public final int mo14106e() {
        int b = mo13500b();
        this.f7955M = b;
        return b;
    }

    public String toString() {
        return C2117if.m10283a(this);
    }

    /* renamed from: c */
    public C2116ie clone() {
        return (C2116ie) super.clone();
    }
}
