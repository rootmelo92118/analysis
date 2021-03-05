package com.google.android.gms.internal.ads;

public abstract class bgj extends bgv {

    /* renamed from: j */
    private bgk f4185j;

    /* renamed from: k */
    private int[] f4186k;

    public bgj(bje bje, bji bji, zzfs zzfs, int i, Object obj, long j, long j2, int i2) {
        super(bje, bji, zzfs, i, obj, j, j2, i2);
    }

    /* renamed from: a */
    public final void mo11898a(bgk bgk) {
        this.f4185j = bgk;
        this.f4186k = bgk.mo11902a();
    }

    /* renamed from: a */
    public final int mo11897a(int i) {
        return this.f4186k[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bgk mo11899d() {
        return this.f4185j;
    }
}
