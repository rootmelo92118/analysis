package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class avw {

    /* renamed from: a */
    public static final avw f2728a = new avw(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    private static final avw f2729k = new avw(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    private static final avw f2730l = new avw(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    private static final avw f2731m = new avw(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b */
    private final double f2732b;

    /* renamed from: c */
    private final double f2733c;

    /* renamed from: d */
    private final double f2734d;

    /* renamed from: e */
    private final double f2735e;

    /* renamed from: f */
    private final double f2736f;

    /* renamed from: g */
    private final double f2737g;

    /* renamed from: h */
    private final double f2738h;

    /* renamed from: i */
    private final double f2739i;

    /* renamed from: j */
    private final double f2740j;

    private avw(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f2732b = d5;
        this.f2733c = d6;
        this.f2734d = d7;
        this.f2735e = d;
        this.f2736f = d2;
        this.f2737g = d3;
        this.f2738h = d4;
        this.f2739i = d8;
        this.f2740j = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avw avw = (avw) obj;
        return Double.compare(avw.f2735e, this.f2735e) == 0 && Double.compare(avw.f2736f, this.f2736f) == 0 && Double.compare(avw.f2737g, this.f2737g) == 0 && Double.compare(avw.f2738h, this.f2738h) == 0 && Double.compare(avw.f2739i, this.f2739i) == 0 && Double.compare(avw.f2740j, this.f2740j) == 0 && Double.compare(avw.f2732b, this.f2732b) == 0 && Double.compare(avw.f2733c, this.f2733c) == 0 && Double.compare(avw.f2734d, this.f2734d) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2732b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2733c);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2734d);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f2735e);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f2736f);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f2737g);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f2738h);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f2739i);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f2740j);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f2728a)) {
            return "Rotate 0°";
        }
        if (equals(f2729k)) {
            return "Rotate 90°";
        }
        if (equals(f2730l)) {
            return "Rotate 180°";
        }
        if (equals(f2731m)) {
            return "Rotate 270°";
        }
        double d = this.f2732b;
        double d2 = this.f2733c;
        double d3 = this.f2734d;
        double d4 = this.f2735e;
        double d5 = this.f2736f;
        double d6 = this.f2737g;
        double d7 = this.f2738h;
        double d8 = this.f2739i;
        double d9 = this.f2740j;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static avw m4303a(ByteBuffer byteBuffer) {
        double d = aae.m1615d(byteBuffer);
        double d2 = aae.m1615d(byteBuffer);
        double e = aae.m1616e(byteBuffer);
        return new avw(d, d2, aae.m1615d(byteBuffer), aae.m1615d(byteBuffer), e, aae.m1616e(byteBuffer), aae.m1616e(byteBuffer), aae.m1615d(byteBuffer), aae.m1615d(byteBuffer));
    }
}
