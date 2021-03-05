package com.google.android.gms.internal.ads;

public final class bae {

    /* renamed from: a */
    public static final bae f3272a = new bae(1.0f, 1.0f);

    /* renamed from: b */
    public final float f3273b;

    /* renamed from: c */
    public final float f3274c;

    /* renamed from: d */
    private final int f3275d;

    public bae(float f, float f2) {
        this.f3273b = f;
        this.f3274c = f2;
        this.f3275d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo11515a(long j) {
        return j * ((long) this.f3275d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bae bae = (bae) obj;
        return this.f3273b == bae.f3273b && this.f3274c == bae.f3274c;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f3273b) + 527) * 31) + Float.floatToRawIntBits(this.f3274c);
    }
}
