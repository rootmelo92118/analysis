package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;

final class apq extends apo {

    /* renamed from: d */
    private final byte[] f2194d;

    /* renamed from: e */
    private final boolean f2195e;

    /* renamed from: f */
    private int f2196f;

    /* renamed from: g */
    private int f2197g;

    /* renamed from: h */
    private int f2198h;

    /* renamed from: i */
    private int f2199i;

    /* renamed from: j */
    private int f2200j;

    /* renamed from: k */
    private int f2201k;

    private apq(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f2201k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2194d = bArr;
        this.f2196f = i2 + i;
        this.f2198h = i;
        this.f2199i = this.f2198h;
        this.f2195e = z;
    }

    /* renamed from: a */
    public final int mo10817a() {
        if (mo10843t()) {
            this.f2200j = 0;
            return 0;
        }
        this.f2200j = m3063v();
        if ((this.f2200j >>> 3) != 0) {
            return this.f2200j;
        }
        throw aqv.m3510d();
    }

    /* renamed from: a */
    public final void mo10819a(int i) {
        if (this.f2200j != i) {
            throw aqv.m3511e();
        }
    }

    /* renamed from: b */
    public final boolean mo10821b(int i) {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f2196f - this.f2198h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f2194d;
                        int i3 = this.f2198h;
                        this.f2198h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw aqv.m3509c();
                }
                while (i2 < 10) {
                    if (m3062A() < 0) {
                        i2++;
                    }
                }
                throw aqv.m3509c();
                return true;
            case 1:
                mo10829f(8);
                return true;
            case 2:
                mo10829f(m3063v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo10829f(4);
                return true;
            default:
                throw aqv.m3512f();
        }
        do {
            a = mo10817a();
            if (a == 0 || !mo10821b(a)) {
                mo10819a(((i >>> 3) << 3) | 4);
                return true;
            }
            a = mo10817a();
            mo10819a(((i >>> 3) << 3) | 4);
            return true;
        } while (!mo10821b(a));
        mo10819a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo10820b() {
        return Double.longBitsToDouble(m3066y());
    }

    /* renamed from: c */
    public final float mo10822c() {
        return Float.intBitsToFloat(m3065x());
    }

    /* renamed from: d */
    public final long mo10825d() {
        return m3064w();
    }

    /* renamed from: e */
    public final long mo10826e() {
        return m3064w();
    }

    /* renamed from: f */
    public final int mo10828f() {
        return m3063v();
    }

    /* renamed from: g */
    public final long mo10830g() {
        return m3066y();
    }

    /* renamed from: h */
    public final int mo10831h() {
        return m3065x();
    }

    /* renamed from: i */
    public final boolean mo10832i() {
        return m3064w() != 0;
    }

    /* renamed from: j */
    public final String mo10833j() {
        int v = m3063v();
        if (v > 0 && v <= this.f2196f - this.f2198h) {
            String str = new String(this.f2194d, this.f2198h, v, aqp.f2347a);
            this.f2198h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw aqv.m3508b();
            }
            throw aqv.m3507a();
        }
    }

    /* renamed from: k */
    public final String mo10834k() {
        int v = m3063v();
        if (v > 0 && v <= this.f2196f - this.f2198h) {
            String b = atp.m4011b(this.f2194d, this.f2198h, v);
            this.f2198h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw aqv.m3508b();
            }
            throw aqv.m3507a();
        }
    }

    /* renamed from: a */
    public final <T extends arw> T mo10818a(ash<T> ash, apz apz) {
        int v = m3063v();
        if (this.f2189a < this.f2190b) {
            int d = mo10824d(v);
            this.f2189a++;
            T t = (arw) ash.mo11031a(this, apz);
            mo10819a(0);
            this.f2189a--;
            mo10827e(d);
            return t;
        }
        throw aqv.m3513g();
    }

    /* renamed from: l */
    public final apc mo10835l() {
        byte[] bArr;
        int v = m3063v();
        if (v > 0 && v <= this.f2196f - this.f2198h) {
            apc a = apc.m2987a(this.f2194d, this.f2198h, v);
            this.f2198h += v;
            return a;
        } else if (v == 0) {
            return apc.f2174a;
        } else {
            if (v > 0 && v <= this.f2196f - this.f2198h) {
                int i = this.f2198h;
                this.f2198h += v;
                bArr = Arrays.copyOfRange(this.f2194d, i, this.f2198h);
            } else if (v > 0) {
                throw aqv.m3507a();
            } else if (v == 0) {
                bArr = aqp.f2348b;
            } else {
                throw aqv.m3508b();
            }
            return apc.m2990b(bArr);
        }
    }

    /* renamed from: m */
    public final int mo10836m() {
        return m3063v();
    }

    /* renamed from: n */
    public final int mo10837n() {
        return m3063v();
    }

    /* renamed from: o */
    public final int mo10838o() {
        return m3065x();
    }

    /* renamed from: p */
    public final long mo10839p() {
        return m3066y();
    }

    /* renamed from: q */
    public final int mo10840q() {
        return m3033g(m3063v());
    }

    /* renamed from: r */
    public final long mo10841r() {
        return m3030a(m3064w());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3063v() {
        /*
            r5 = this;
            int r0 = r5.f2198h
            int r1 = r5.f2196f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f2194d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f2198h = r2
            return r0
        L_0x0011:
            int r3 = r5.f2196f
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
            r5.f2198h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo10842s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apq.m3063v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m3064w() {
        /*
            r11 = this;
            int r0 = r11.f2198h
            int r1 = r11.f2196f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f2194d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f2198h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f2196f
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
            r11.f2198h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo10842s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apq.m3064w():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo10842s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m3062A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw aqv.m3509c();
    }

    /* renamed from: x */
    private final int m3065x() {
        int i = this.f2198h;
        if (this.f2196f - i >= 4) {
            byte[] bArr = this.f2194d;
            this.f2198h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw aqv.m3507a();
    }

    /* renamed from: y */
    private final long m3066y() {
        int i = this.f2198h;
        if (this.f2196f - i >= 8) {
            byte[] bArr = this.f2194d;
            this.f2198h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw aqv.m3507a();
    }

    /* renamed from: d */
    public final int mo10824d(int i) {
        if (i >= 0) {
            int u = i + mo10844u();
            int i2 = this.f2201k;
            if (u <= i2) {
                this.f2201k = u;
                m3067z();
                return i2;
            }
            throw aqv.m3507a();
        }
        throw aqv.m3508b();
    }

    /* renamed from: z */
    private final void m3067z() {
        this.f2196f += this.f2197g;
        int i = this.f2196f - this.f2199i;
        if (i > this.f2201k) {
            this.f2197g = i - this.f2201k;
            this.f2196f -= this.f2197g;
            return;
        }
        this.f2197g = 0;
    }

    /* renamed from: e */
    public final void mo10827e(int i) {
        this.f2201k = i;
        m3067z();
    }

    /* renamed from: t */
    public final boolean mo10843t() {
        return this.f2198h == this.f2196f;
    }

    /* renamed from: u */
    public final int mo10844u() {
        return this.f2198h - this.f2199i;
    }

    /* renamed from: A */
    private final byte m3062A() {
        if (this.f2198h != this.f2196f) {
            byte[] bArr = this.f2194d;
            int i = this.f2198h;
            this.f2198h = i + 1;
            return bArr[i];
        }
        throw aqv.m3507a();
    }

    /* renamed from: f */
    public final void mo10829f(int i) {
        if (i >= 0 && i <= this.f2196f - this.f2198h) {
            this.f2198h += i;
        } else if (i < 0) {
            throw aqv.m3508b();
        } else {
            throw aqv.m3507a();
        }
    }
}
