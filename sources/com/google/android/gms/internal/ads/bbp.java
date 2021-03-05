package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class bbp {

    /* renamed from: a */
    private final int f3451a;

    /* renamed from: b */
    private final int f3452b;

    /* renamed from: c */
    private final int f3453c;

    /* renamed from: d */
    private final int f3454d;

    /* renamed from: e */
    private final int f3455e = (this.f3454d * 2);

    /* renamed from: f */
    private final short[] f3456f = new short[this.f3455e];

    /* renamed from: g */
    private int f3457g = this.f3455e;

    /* renamed from: h */
    private short[] f3458h;

    /* renamed from: i */
    private int f3459i;

    /* renamed from: j */
    private short[] f3460j;

    /* renamed from: k */
    private int f3461k;

    /* renamed from: l */
    private short[] f3462l;

    /* renamed from: m */
    private int f3463m;

    /* renamed from: n */
    private int f3464n;

    /* renamed from: o */
    private float f3465o;

    /* renamed from: p */
    private float f3466p;

    /* renamed from: q */
    private int f3467q;

    /* renamed from: r */
    private int f3468r;

    /* renamed from: s */
    private int f3469s;

    /* renamed from: t */
    private int f3470t;

    /* renamed from: u */
    private int f3471u;

    /* renamed from: v */
    private int f3472v;

    /* renamed from: w */
    private int f3473w;

    /* renamed from: x */
    private int f3474x;

    public bbp(int i, int i2) {
        this.f3451a = i;
        this.f3452b = i2;
        this.f3453c = i / 400;
        this.f3454d = i / 65;
        this.f3458h = new short[(this.f3455e * i2)];
        this.f3459i = this.f3455e;
        this.f3460j = new short[(this.f3455e * i2)];
        this.f3461k = this.f3455e;
        this.f3462l = new short[(this.f3455e * i2)];
        this.f3463m = 0;
        this.f3464n = 0;
        this.f3471u = 0;
        this.f3465o = 1.0f;
        this.f3466p = 1.0f;
    }

    /* renamed from: a */
    public final void mo11635a(float f) {
        this.f3465o = f;
    }

    /* renamed from: b */
    public final void mo11638b(float f) {
        this.f3466p = f;
    }

    /* renamed from: a */
    public final void mo11636a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.f3452b;
        m4863b(remaining);
        shortBuffer.get(this.f3458h, this.f3467q * this.f3452b, ((this.f3452b * remaining) << 1) / 2);
        this.f3467q += remaining;
        m4865c();
    }

    /* renamed from: b */
    public final void mo11639b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f3452b, this.f3468r);
        shortBuffer.put(this.f3460j, 0, this.f3452b * min);
        this.f3468r -= min;
        System.arraycopy(this.f3460j, min * this.f3452b, this.f3460j, 0, this.f3468r * this.f3452b);
    }

    /* renamed from: a */
    public final void mo11634a() {
        int i = this.f3467q;
        int i2 = this.f3468r + ((int) ((((((float) i) / (this.f3465o / this.f3466p)) + ((float) this.f3469s)) / this.f3466p) + 0.5f));
        m4863b((this.f3455e * 2) + i);
        for (int i3 = 0; i3 < this.f3455e * 2 * this.f3452b; i3++) {
            this.f3458h[(this.f3452b * i) + i3] = 0;
        }
        this.f3467q += this.f3455e * 2;
        m4865c();
        if (this.f3468r > i2) {
            this.f3468r = i2;
        }
        this.f3467q = 0;
        this.f3470t = 0;
        this.f3469s = 0;
    }

    /* renamed from: b */
    public final int mo11637b() {
        return this.f3468r;
    }

    /* renamed from: a */
    private final void m4860a(int i) {
        if (this.f3468r + i > this.f3459i) {
            this.f3459i += (this.f3459i / 2) + i;
            this.f3460j = Arrays.copyOf(this.f3460j, this.f3459i * this.f3452b);
        }
    }

    /* renamed from: b */
    private final void m4863b(int i) {
        if (this.f3467q + i > this.f3457g) {
            this.f3457g += (this.f3457g / 2) + i;
            this.f3458h = Arrays.copyOf(this.f3458h, this.f3457g * this.f3452b);
        }
    }

    /* renamed from: a */
    private final void m4862a(short[] sArr, int i, int i2) {
        m4860a(i2);
        System.arraycopy(sArr, i * this.f3452b, this.f3460j, this.f3468r * this.f3452b, this.f3452b * i2);
        this.f3468r += i2;
    }

    /* renamed from: b */
    private final void m4864b(short[] sArr, int i, int i2) {
        int i3 = this.f3455e / i2;
        int i4 = this.f3452b * i2;
        int i5 = i * this.f3452b;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += sArr[(i6 * i4) + i5 + i8];
            }
            this.f3456f[i6] = (short) (i7 / i4);
        }
    }

    /* renamed from: a */
    private final int m4859a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f3452b;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f3473w = i5 / i6;
        this.f3474x = i7 / i8;
        return i6;
    }

    /* renamed from: c */
    private final void m4865c() {
        int i;
        int i2;
        int i3;
        int i4 = this.f3468r;
        float f = this.f3465o / this.f3466p;
        double d = (double) f;
        int i5 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            m4862a(this.f3458h, 0, this.f3467q);
            this.f3467q = 0;
        } else if (this.f3467q >= this.f3455e) {
            int i6 = this.f3467q;
            int i7 = 0;
            while (true) {
                if (this.f3470t > 0) {
                    int min = Math.min(this.f3455e, this.f3470t);
                    m4862a(this.f3458h, i7, min);
                    this.f3470t -= min;
                    i7 += min;
                } else {
                    short[] sArr = this.f3458h;
                    int i8 = this.f3451a > 4000 ? this.f3451a / 4000 : 1;
                    if (this.f3452b == i5 && i8 == i5) {
                        i = m4859a(sArr, i7, this.f3453c, this.f3454d);
                    } else {
                        m4864b(sArr, i7, i8);
                        int a = m4859a(this.f3456f, 0, this.f3453c / i8, this.f3454d / i8);
                        if (i8 != i5) {
                            int i9 = a * i8;
                            int i10 = i8 << 2;
                            int i11 = i9 - i10;
                            int i12 = i9 + i10;
                            if (i11 < this.f3453c) {
                                i11 = this.f3453c;
                            }
                            if (i12 > this.f3454d) {
                                i12 = this.f3454d;
                            }
                            if (this.f3452b == i5) {
                                i = m4859a(sArr, i7, i11, i12);
                            } else {
                                m4864b(sArr, i7, i5);
                                i = m4859a(this.f3456f, 0, i11, i12);
                            }
                        } else {
                            i = a;
                        }
                    }
                    int i13 = this.f3473w;
                    int i14 = i13 != 0 && this.f3471u != 0 && this.f3474x <= i13 * 3 && (i13 << 1) > this.f3472v * 3 ? this.f3471u : i;
                    this.f3472v = this.f3473w;
                    this.f3471u = i;
                    if (d > 1.0d) {
                        short[] sArr2 = this.f3458h;
                        if (f >= 2.0f) {
                            i3 = (int) (((float) i14) / (f - 1.0f));
                        } else {
                            this.f3470t = (int) ((((float) i14) * (2.0f - f)) / (f - 1.0f));
                            i3 = i14;
                        }
                        m4860a(i3);
                        int i15 = i3;
                        m4861a(i3, this.f3452b, this.f3460j, this.f3468r, sArr2, i7, sArr2, i7 + i14);
                        this.f3468r += i15;
                        i7 += i14 + i15;
                    } else {
                        int i16 = i14;
                        int i17 = i7;
                        short[] sArr3 = this.f3458h;
                        if (f < 0.5f) {
                            i2 = (int) ((((float) i16) * f) / (1.0f - f));
                        } else {
                            this.f3470t = (int) ((((float) i16) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                            i2 = i16;
                        }
                        int i18 = i16 + i2;
                        m4860a(i18);
                        System.arraycopy(sArr3, this.f3452b * i17, this.f3460j, this.f3468r * this.f3452b, this.f3452b * i16);
                        m4861a(i2, this.f3452b, this.f3460j, this.f3468r + i16, sArr3, i17 + i16, sArr3, i17);
                        this.f3468r += i18;
                        i7 = i17 + i2;
                    }
                }
                if (this.f3455e + i7 > i6) {
                    break;
                }
                i5 = 1;
            }
            int i19 = this.f3467q - i7;
            System.arraycopy(this.f3458h, i7 * this.f3452b, this.f3458h, 0, this.f3452b * i19);
            this.f3467q = i19;
        }
        if (this.f3466p != 1.0f) {
            float f2 = this.f3466p;
            if (this.f3468r != i4) {
                int i20 = (int) (((float) this.f3451a) / f2);
                int i21 = this.f3451a;
                while (true) {
                    if (i20 <= 16384 && i21 <= 16384) {
                        break;
                    }
                    i20 /= 2;
                    i21 /= 2;
                }
                int i22 = this.f3468r - i4;
                if (this.f3469s + i22 > this.f3461k) {
                    this.f3461k += (this.f3461k / 2) + i22;
                    this.f3462l = Arrays.copyOf(this.f3462l, this.f3461k * this.f3452b);
                }
                System.arraycopy(this.f3460j, this.f3452b * i4, this.f3462l, this.f3469s * this.f3452b, this.f3452b * i22);
                this.f3468r = i4;
                this.f3469s += i22;
                int i23 = 0;
                while (true) {
                    int i24 = 1;
                    if (i23 >= this.f3469s - 1) {
                        break;
                    }
                    while ((this.f3463m + i24) * i20 > this.f3464n * i21) {
                        m4860a(i24);
                        for (int i25 = 0; i25 < this.f3452b; i25++) {
                            short[] sArr4 = this.f3462l;
                            int i26 = (this.f3452b * i23) + i25;
                            short s = sArr4[i26];
                            short s2 = sArr4[i26 + this.f3452b];
                            int i27 = (this.f3463m + 1) * i20;
                            int i28 = i27 - (this.f3464n * i21);
                            int i29 = i27 - (this.f3463m * i20);
                            this.f3460j[(this.f3468r * this.f3452b) + i25] = (short) (((s * i28) + ((i29 - i28) * s2)) / i29);
                        }
                        i24 = 1;
                        this.f3464n++;
                        this.f3468r++;
                    }
                    this.f3463m += i24;
                    if (this.f3463m == i21) {
                        this.f3463m = 0;
                        bjy.m5691b(this.f3464n == i20);
                        this.f3464n = 0;
                    }
                    i23++;
                }
                int i30 = this.f3469s - 1;
                if (i30 != 0) {
                    System.arraycopy(this.f3462l, this.f3452b * i30, this.f3462l, 0, (this.f3469s - i30) * this.f3452b);
                    this.f3469s -= i30;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4861a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
