package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.dl */
final class C1973dl extends C1971dj {

    /* renamed from: d */
    private final byte[] f7601d;

    /* renamed from: e */
    private final boolean f7602e;

    /* renamed from: f */
    private int f7603f;

    /* renamed from: g */
    private int f7604g;

    /* renamed from: h */
    private int f7605h;

    /* renamed from: i */
    private int f7606i;

    /* renamed from: j */
    private int f7607j;

    /* renamed from: k */
    private int f7608k;

    private C1973dl(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f7608k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7601d = bArr;
        this.f7603f = i2 + i;
        this.f7605h = i;
        this.f7606i = this.f7605h;
        this.f7602e = z;
    }

    /* renamed from: a */
    public final int mo13619a() {
        if (mo13645t()) {
            this.f7607j = 0;
            return 0;
        }
        this.f7607j = m9143v();
        if ((this.f7607j >>> 3) != 0) {
            return this.f7607j;
        }
        throw new C2015ep("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo13621a(int i) {
        if (this.f7607j != i) {
            throw C2015ep.m9575d();
        }
    }

    /* renamed from: b */
    public final boolean mo13623b(int i) {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f7603f - this.f7605h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f7601d;
                        int i3 = this.f7605h;
                        this.f7605h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw C2015ep.m9574c();
                }
                while (i2 < 10) {
                    if (m9142A() < 0) {
                        i2++;
                    }
                }
                throw C2015ep.m9574c();
                return true;
            case 1:
                mo13631f(8);
                return true;
            case 2:
                mo13631f(m9143v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo13631f(4);
                return true;
            default:
                throw C2015ep.m9576e();
        }
        do {
            a = mo13619a();
            if (a == 0 || !mo13623b(a)) {
                mo13621a(((i >>> 3) << 3) | 4);
                return true;
            }
            a = mo13619a();
            mo13621a(((i >>> 3) << 3) | 4);
            return true;
        } while (!mo13623b(a));
        mo13621a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo13622b() {
        return Double.longBitsToDouble(m9146y());
    }

    /* renamed from: c */
    public final float mo13624c() {
        return Float.intBitsToFloat(m9145x());
    }

    /* renamed from: d */
    public final long mo13627d() {
        return m9144w();
    }

    /* renamed from: e */
    public final long mo13628e() {
        return m9144w();
    }

    /* renamed from: f */
    public final int mo13630f() {
        return m9143v();
    }

    /* renamed from: g */
    public final long mo13632g() {
        return m9146y();
    }

    /* renamed from: h */
    public final int mo13633h() {
        return m9145x();
    }

    /* renamed from: i */
    public final boolean mo13634i() {
        return m9144w() != 0;
    }

    /* renamed from: j */
    public final String mo13635j() {
        int v = m9143v();
        if (v > 0 && v <= this.f7603f - this.f7605h) {
            String str = new String(this.f7601d, this.f7605h, v, C2010ek.f7747a);
            this.f7605h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw C2015ep.m9573b();
            }
            throw C2015ep.m9572a();
        }
    }

    /* renamed from: k */
    public final String mo13636k() {
        int v = m9143v();
        if (v > 0 && v <= this.f7603f - this.f7605h) {
            String b = C2092hh.m10114b(this.f7601d, this.f7605h, v);
            this.f7605h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw C2015ep.m9573b();
            }
            throw C2015ep.m9572a();
        }
    }

    /* renamed from: a */
    public final <T extends C2043fq> T mo13620a(C2055gb<T> gbVar, C1988dv dvVar) {
        int v = m9143v();
        if (this.f7596a < this.f7597b) {
            int d = mo13626d(v);
            this.f7596a++;
            T t = (C2043fq) gbVar.mo13829a(this, dvVar);
            mo13621a(0);
            this.f7596a--;
            mo13629e(d);
            return t;
        }
        throw C2015ep.m9577f();
    }

    /* renamed from: l */
    public final C1958cx mo13637l() {
        byte[] bArr;
        int v = m9143v();
        if (v > 0 && v <= this.f7603f - this.f7605h) {
            C1958cx a = C1958cx.m9076a(this.f7601d, this.f7605h, v);
            this.f7605h += v;
            return a;
        } else if (v == 0) {
            return C1958cx.f7583a;
        } else {
            if (v > 0 && v <= this.f7603f - this.f7605h) {
                int i = this.f7605h;
                this.f7605h += v;
                bArr = Arrays.copyOfRange(this.f7601d, i, this.f7605h);
            } else if (v > 0) {
                throw C2015ep.m9572a();
            } else if (v == 0) {
                bArr = C2010ek.f7748b;
            } else {
                throw C2015ep.m9573b();
            }
            return C1958cx.m9075a(bArr);
        }
    }

    /* renamed from: m */
    public final int mo13638m() {
        return m9143v();
    }

    /* renamed from: n */
    public final int mo13639n() {
        return m9143v();
    }

    /* renamed from: o */
    public final int mo13640o() {
        return m9145x();
    }

    /* renamed from: p */
    public final long mo13641p() {
        return m9146y();
    }

    /* renamed from: q */
    public final int mo13642q() {
        int v = m9143v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo13643r() {
        long w = m9144w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m9143v() {
        /*
            r5 = this;
            int r0 = r5.f7605h
            int r1 = r5.f7603f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f7601d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f7605h = r2
            return r0
        L_0x0011:
            int r3 = r5.f7603f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.f7605h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo13644s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1973dl.m9143v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m9144w() {
        /*
            r11 = this;
            int r0 = r11.f7605h
            int r1 = r11.f7603f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f7601d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f7605h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f7603f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x00bb
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0025:
            r9 = r0
            r0 = r3
        L_0x0027:
            r2 = r9
            goto L_0x00b8
        L_0x002a:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0039
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r0 = r2
            goto L_0x0027
        L_0x0039:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0048
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0025
        L_0x0048:
            long r4 = (long) r0
            int r0 = r3 + 1
            byte r2 = r1[r3]
            long r2 = (long) r2
            r6 = 28
            long r2 = r2 << r6
            long r2 = r2 ^ r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x005d
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x005d:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r2
        L_0x0070:
            r2 = r0
        L_0x0071:
            r0 = r6
            goto L_0x00b8
        L_0x0073:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x0087:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r2
            goto L_0x0070
        L_0x009b:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b8
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r0 = (long) r0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00bb
            goto L_0x0071
        L_0x00b8:
            r11.f7605h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo13644s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1973dl.m9144w():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo13644s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m9142A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw C2015ep.m9574c();
    }

    /* renamed from: x */
    private final int m9145x() {
        int i = this.f7605h;
        if (this.f7603f - i >= 4) {
            byte[] bArr = this.f7601d;
            this.f7605h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C2015ep.m9572a();
    }

    /* renamed from: y */
    private final long m9146y() {
        int i = this.f7605h;
        if (this.f7603f - i >= 8) {
            byte[] bArr = this.f7601d;
            this.f7605h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C2015ep.m9572a();
    }

    /* renamed from: d */
    public final int mo13626d(int i) {
        if (i >= 0) {
            int u = i + mo13646u();
            int i2 = this.f7608k;
            if (u <= i2) {
                this.f7608k = u;
                m9147z();
                return i2;
            }
            throw C2015ep.m9572a();
        }
        throw C2015ep.m9573b();
    }

    /* renamed from: z */
    private final void m9147z() {
        this.f7603f += this.f7604g;
        int i = this.f7603f - this.f7606i;
        if (i > this.f7608k) {
            this.f7604g = i - this.f7608k;
            this.f7603f -= this.f7604g;
            return;
        }
        this.f7604g = 0;
    }

    /* renamed from: e */
    public final void mo13629e(int i) {
        this.f7608k = i;
        m9147z();
    }

    /* renamed from: t */
    public final boolean mo13645t() {
        return this.f7605h == this.f7603f;
    }

    /* renamed from: u */
    public final int mo13646u() {
        return this.f7605h - this.f7606i;
    }

    /* renamed from: A */
    private final byte m9142A() {
        if (this.f7605h != this.f7603f) {
            byte[] bArr = this.f7601d;
            int i = this.f7605h;
            this.f7605h = i + 1;
            return bArr[i];
        }
        throw C2015ep.m9572a();
    }

    /* renamed from: f */
    public final void mo13631f(int i) {
        if (i >= 0 && i <= this.f7603f - this.f7605h) {
            this.f7605h += i;
        } else if (i < 0) {
            throw C2015ep.m9573b();
        } else {
            throw C2015ep.m9572a();
        }
    }
}
