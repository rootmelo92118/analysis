package com.google.android.gms.internal.ads;

final class bhi {

    /* renamed from: a */
    public final boolean f4307a;

    /* renamed from: b */
    public final long f4308b;

    /* renamed from: c */
    public final long f4309c;

    /* renamed from: a */
    public static bhi m5476a(bhv bhv, long j) {
        int i;
        bhv bhv2 = bhv;
        long j2 = j;
        int size = bhv2.f4361c.size();
        int i2 = 0;
        long j3 = Long.MAX_VALUE;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        long j4 = 0;
        while (i3 < size) {
            bhl e = bhv2.f4361c.get(i3).f4333c.get(i2).mo11966e();
            if (e == null) {
                return new bhi(true, 0, j);
            }
            z2 |= e.mo11947b();
            int a = e.mo11942a(j2);
            if (a == 0) {
                i = i3;
                z = true;
                j4 = 0;
                j3 = 0;
            } else if (!z) {
                int a2 = e.mo11941a();
                i = i3;
                long max = Math.max(j4, e.mo11944a(a2));
                if (a != -1) {
                    int i4 = (a2 + a) - 1;
                    j3 = Math.min(j3, e.mo11944a(i4) + e.mo11945a(i4, j2));
                }
                j4 = max;
            } else {
                i = i3;
            }
            i3 = i + 1;
            i2 = 0;
        }
        return new bhi(z2, j4, j3);
    }

    private bhi(boolean z, long j, long j2) {
        this.f4307a = z;
        this.f4308b = j;
        this.f4309c = j2;
    }
}
