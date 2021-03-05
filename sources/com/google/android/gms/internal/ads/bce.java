package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

public final class bce implements bci {

    /* renamed from: a */
    private static final byte[] f3516a = new byte[4096];

    /* renamed from: b */
    private final bje f3517b;

    /* renamed from: c */
    private final long f3518c;

    /* renamed from: d */
    private long f3519d;

    /* renamed from: e */
    private byte[] f3520e = new byte[65536];

    /* renamed from: f */
    private int f3521f;

    /* renamed from: g */
    private int f3522g;

    public bce(bje bje, long j, long j2) {
        this.f3517b = bje;
        this.f3519d = j;
        this.f3518c = j2;
    }

    /* renamed from: a */
    public final int mo11670a(byte[] bArr, int i, int i2) {
        int d = m4914d(bArr, i, i2);
        if (d == 0) {
            d = m4911a(bArr, i, i2, 0, true);
        }
        m4916f(d);
        return d;
    }

    /* renamed from: a */
    public final boolean mo11672a(byte[] bArr, int i, int i2, boolean z) {
        int d = m4914d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m4911a(bArr, i, i2, d, z);
        }
        m4916f(d);
        return d != -1;
    }

    /* renamed from: b */
    public final void mo11675b(byte[] bArr, int i, int i2) {
        mo11672a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final int mo11669a(int i) {
        int d = m4913d(i);
        if (d == 0) {
            d = m4911a(f3516a, 0, Math.min(i, f3516a.length), 0, true);
        }
        m4916f(d);
        return d;
    }

    /* renamed from: b */
    public final void mo11674b(int i) {
        int d = m4913d(i);
        while (d < i && d != -1) {
            d = m4911a(f3516a, -d, Math.min(i, f3516a.length + d), d, false);
        }
        m4916f(d);
    }

    /* renamed from: c */
    public final void mo11678c(byte[] bArr, int i, int i2) {
        if (m4912a(i2, false)) {
            System.arraycopy(this.f3520e, this.f3521f - i2, bArr, i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m4912a(int i, boolean z) {
        int i2 = this.f3521f + i;
        if (i2 > this.f3520e.length) {
            this.f3520e = Arrays.copyOf(this.f3520e, bkp.m5810a(this.f3520e.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f3522g - this.f3521f, i);
        while (min < i) {
            min = m4911a(this.f3520e, this.f3521f, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.f3521f += i;
        this.f3522g = Math.max(this.f3522g, this.f3521f);
        return true;
    }

    /* renamed from: c */
    public final void mo11677c(int i) {
        m4912a(i, false);
    }

    /* renamed from: a */
    public final void mo11671a() {
        this.f3521f = 0;
    }

    /* renamed from: b */
    public final long mo11673b() {
        return this.f3519d;
    }

    /* renamed from: c */
    public final long mo11676c() {
        return this.f3518c;
    }

    /* renamed from: d */
    private final int m4913d(int i) {
        int min = Math.min(this.f3522g, i);
        m4915e(min);
        return min;
    }

    /* renamed from: d */
    private final int m4914d(byte[] bArr, int i, int i2) {
        if (this.f3522g == 0) {
            return 0;
        }
        int min = Math.min(this.f3522g, i2);
        System.arraycopy(this.f3520e, 0, bArr, i, min);
        m4915e(min);
        return min;
    }

    /* renamed from: e */
    private final void m4915e(int i) {
        this.f3522g -= i;
        this.f3521f = 0;
        byte[] bArr = this.f3520e;
        if (this.f3522g < this.f3520e.length - 524288) {
            bArr = new byte[(this.f3522g + 65536)];
        }
        System.arraycopy(this.f3520e, i, bArr, 0, this.f3522g);
        this.f3520e = bArr;
    }

    /* renamed from: a */
    private final int m4911a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f3517b.mo10211a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: f */
    private final void m4916f(int i) {
        if (i != -1) {
            this.f3519d += (long) i;
        }
    }
}
