package com.google.android.gms.internal.ads;

public final class bbh implements C1018ac {

    /* renamed from: a */
    private int f3419a;

    /* renamed from: b */
    private int f3420b;

    /* renamed from: c */
    private final int f3421c;

    /* renamed from: d */
    private final float f3422d;

    public bbh() {
        this(2500, 1, 1.0f);
    }

    private bbh(int i, int i2, float f) {
        this.f3419a = 2500;
        this.f3421c = 1;
        this.f3422d = 1.0f;
    }

    /* renamed from: a */
    public final int mo10102a() {
        return this.f3419a;
    }

    /* renamed from: b */
    public final int mo10104b() {
        return this.f3420b;
    }

    /* renamed from: a */
    public final void mo10103a(C1236dd ddVar) {
        boolean z = true;
        this.f3420b++;
        this.f3419a += (int) (((float) this.f3419a) * this.f3422d);
        if (this.f3420b > this.f3421c) {
            z = false;
        }
        if (!z) {
            throw ddVar;
        }
    }
}
