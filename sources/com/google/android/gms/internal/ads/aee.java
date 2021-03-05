package com.google.android.gms.internal.ads;

import android.net.Uri;

@C1598qn
final class aee implements bje {

    /* renamed from: a */
    private final bje f1510a;

    /* renamed from: b */
    private final long f1511b;

    /* renamed from: c */
    private final bje f1512c;

    /* renamed from: d */
    private long f1513d;

    /* renamed from: e */
    private Uri f1514e;

    aee(bje bje, int i, bje bje2) {
        this.f1510a = bje;
        this.f1511b = (long) i;
        this.f1512c = bje2;
    }

    /* renamed from: a */
    public final long mo10212a(bji bji) {
        bji bji2;
        bji bji3;
        long j;
        bji bji4 = bji;
        this.f1514e = bji4.f4453a;
        if (bji4.f4456d >= this.f1511b) {
            bji2 = null;
        } else {
            long j2 = bji4.f4456d;
            if (bji4.f4457e != -1) {
                j = Math.min(bji4.f4457e, this.f1511b - j2);
            } else {
                j = this.f1511b - j2;
            }
            bji2 = new bji(bji4.f4453a, j2, j, (String) null);
        }
        if (bji4.f4457e == -1 || bji4.f4456d + bji4.f4457e > this.f1511b) {
            bji3 = new bji(bji4.f4453a, Math.max(this.f1511b, bji4.f4456d), bji4.f4457e != -1 ? Math.min(bji4.f4457e, (bji4.f4456d + bji4.f4457e) - this.f1511b) : -1, (String) null);
        } else {
            bji3 = null;
        }
        long j3 = 0;
        long a = bji2 != null ? this.f1510a.mo10212a(bji2) : 0;
        if (bji3 != null) {
            j3 = this.f1512c.mo10212a(bji3);
        }
        this.f1513d = bji4.f4456d;
        if (a == -1 || j3 == -1) {
            return -1;
        }
        return a + j3;
    }

    /* renamed from: a */
    public final int mo10211a(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f1513d < this.f1511b) {
            i3 = this.f1510a.mo10211a(bArr, i, (int) Math.min((long) i2, this.f1511b - this.f1513d));
            this.f1513d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f1513d < this.f1511b) {
            return i3;
        }
        int a = this.f1512c.mo10211a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a;
        this.f1513d += (long) a;
        return i4;
    }

    /* renamed from: b */
    public final Uri mo10214b() {
        return this.f1514e;
    }

    /* renamed from: a */
    public final void mo10213a() {
        this.f1510a.mo10213a();
        this.f1512c.mo10213a();
    }
}
