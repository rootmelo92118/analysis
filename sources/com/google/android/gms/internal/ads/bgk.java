package com.google.android.gms.internal.ads;

import android.util.Log;

final class bgk implements bgo {

    /* renamed from: a */
    private final int[] f4187a;

    /* renamed from: b */
    private final bfy[] f4188b;

    public bgk(int[] iArr, bfy[] bfyArr) {
        this.f4187a = iArr;
        this.f4188b = bfyArr;
    }

    /* renamed from: a */
    public final bcq mo11900a(int i, int i2) {
        for (int i3 = 0; i3 < this.f4187a.length; i3++) {
            if (i2 == this.f4187a[i3]) {
                return this.f4188b[i3];
            }
        }
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unmatched track of type: ");
        sb.append(i2);
        Log.e("BaseMediaChunkOutput", sb.toString());
        return new bcf();
    }

    /* renamed from: a */
    public final int[] mo11902a() {
        int[] iArr = new int[this.f4188b.length];
        for (int i = 0; i < this.f4188b.length; i++) {
            if (this.f4188b[i] != null) {
                iArr[i] = this.f4188b[i].mo11864a();
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo11901a(long j) {
        for (bfy bfy : this.f4188b) {
            if (bfy != null) {
                bfy.mo11867a(j);
            }
        }
    }
}
