package com.google.android.gms.internal.ads;

import android.support.p034v4.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;

public final class aed extends avl {

    /* renamed from: b */
    private Date f1496b;

    /* renamed from: c */
    private Date f1497c;

    /* renamed from: d */
    private long f1498d;

    /* renamed from: e */
    private long f1499e;

    /* renamed from: f */
    private double f1500f = 1.0d;

    /* renamed from: g */
    private float f1501g = 1.0f;

    /* renamed from: h */
    private avw f1502h = avw.f2728a;

    /* renamed from: i */
    private long f1503i;

    /* renamed from: j */
    private int f1504j;

    /* renamed from: k */
    private int f1505k;

    /* renamed from: l */
    private int f1506l;

    /* renamed from: m */
    private int f1507m;

    /* renamed from: n */
    private int f1508n;

    /* renamed from: o */
    private int f1509o;

    public aed() {
        super("mvhd");
    }

    /* renamed from: b */
    public final long mo10271b() {
        return this.f1498d;
    }

    /* renamed from: c */
    public final long mo10272c() {
        return this.f1499e;
    }

    /* renamed from: a */
    public final void mo10270a(ByteBuffer byteBuffer) {
        mo11306b(byteBuffer);
        if (mo11307e() == 1) {
            this.f1496b = avr.m4299a(aae.m1614c(byteBuffer));
            this.f1497c = avr.m4299a(aae.m1614c(byteBuffer));
            this.f1498d = aae.m1612a(byteBuffer);
            this.f1499e = aae.m1614c(byteBuffer);
        } else {
            this.f1496b = avr.m4299a(aae.m1612a(byteBuffer));
            this.f1497c = avr.m4299a(aae.m1612a(byteBuffer));
            this.f1498d = aae.m1612a(byteBuffer);
            this.f1499e = aae.m1612a(byteBuffer);
        }
        this.f1500f = aae.m1615d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f1501g = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)))))) / 256.0f;
        aae.m1613b(byteBuffer);
        aae.m1612a(byteBuffer);
        aae.m1612a(byteBuffer);
        this.f1502h = avw.m4303a(byteBuffer);
        this.f1504j = byteBuffer.getInt();
        this.f1505k = byteBuffer.getInt();
        this.f1506l = byteBuffer.getInt();
        this.f1507m = byteBuffer.getInt();
        this.f1508n = byteBuffer.getInt();
        this.f1509o = byteBuffer.getInt();
        this.f1503i = aae.m1612a(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.f1496b + ";" + "modificationTime=" + this.f1497c + ";" + "timescale=" + this.f1498d + ";" + "duration=" + this.f1499e + ";" + "rate=" + this.f1500f + ";" + "volume=" + this.f1501g + ";" + "matrix=" + this.f1502h + ";" + "nextTrackId=" + this.f1503i + "]";
    }
}
