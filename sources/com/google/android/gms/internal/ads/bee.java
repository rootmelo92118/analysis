package com.google.android.gms.internal.ads;

final class bee {

    /* renamed from: a */
    public final int f3915a;

    /* renamed from: b */
    public final long[] f3916b;

    /* renamed from: c */
    public final int[] f3917c;

    /* renamed from: d */
    public final int f3918d;

    /* renamed from: e */
    public final long[] f3919e;

    /* renamed from: f */
    public final int[] f3920f;

    public bee(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = false;
        bjy.m5689a(iArr.length == jArr2.length);
        bjy.m5689a(jArr.length == jArr2.length);
        bjy.m5689a(iArr2.length == jArr2.length ? true : z);
        this.f3916b = jArr;
        this.f3917c = iArr;
        this.f3918d = i;
        this.f3919e = jArr2;
        this.f3920f = iArr2;
        this.f3915a = jArr.length;
    }

    /* renamed from: a */
    public final int mo11732a(long j) {
        for (int a = bkp.m5811a(this.f3919e, j, true, false); a >= 0; a--) {
            if ((this.f3920f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo11733b(long j) {
        for (int b = bkp.m5823b(this.f3919e, j, true, false); b < this.f3919e.length; b++) {
            if ((this.f3920f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
