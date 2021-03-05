package com.google.android.gms.internal.ads;

public final class bcd implements bco {

    /* renamed from: a */
    public final int f3510a;

    /* renamed from: b */
    public final int[] f3511b;

    /* renamed from: c */
    public final long[] f3512c;

    /* renamed from: d */
    public final long[] f3513d;

    /* renamed from: e */
    public final long[] f3514e;

    /* renamed from: f */
    private final long f3515f;

    public bcd(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3511b = iArr;
        this.f3512c = jArr;
        this.f3513d = jArr2;
        this.f3514e = jArr3;
        this.f3510a = iArr.length;
        if (this.f3510a > 0) {
            this.f3515f = jArr2[this.f3510a - 1] + jArr3[this.f3510a - 1];
        } else {
            this.f3515f = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo11666a() {
        return true;
    }

    /* renamed from: a */
    public final int mo11665a(long j) {
        return bkp.m5811a(this.f3514e, j, true, true);
    }

    /* renamed from: b */
    public final long mo11667b() {
        return this.f3515f;
    }

    /* renamed from: b */
    public final long mo11668b(long j) {
        return this.f3512c[mo11665a(j)];
    }
}
