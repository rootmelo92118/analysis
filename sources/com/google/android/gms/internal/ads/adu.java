package com.google.android.gms.internal.ads;

@C1598qn
public final class adu implements bac {

    /* renamed from: a */
    private final bjk f1464a;

    /* renamed from: b */
    private long f1465b;

    /* renamed from: c */
    private long f1466c;

    /* renamed from: d */
    private long f1467d;

    /* renamed from: e */
    private long f1468e;

    /* renamed from: f */
    private int f1469f;

    /* renamed from: g */
    private boolean f1470g;

    adu() {
        this(15000, 30000, 2500, 5000);
    }

    private adu(int i, int i2, long j, long j2) {
        this.f1464a = new bjk(true, 65536);
        this.f1465b = 15000000;
        this.f1466c = 30000000;
        this.f1467d = 2500000;
        this.f1468e = 5000000;
    }

    /* renamed from: a */
    public final void mo10216a() {
        m1792a(false);
    }

    /* renamed from: a */
    public final void mo10218a(baf[] bafArr, bgh bgh, bix bix) {
        this.f1469f = 0;
        for (int i = 0; i < bafArr.length; i++) {
            if (bix.mo11995a(i) != null) {
                this.f1469f += bkp.m5821b(bafArr[i].mo11444a());
            }
        }
        this.f1464a.mo12016a(this.f1469f);
    }

    /* renamed from: b */
    public final void mo10221b() {
        m1792a(true);
    }

    /* renamed from: c */
    public final void mo10223c() {
        m1792a(true);
    }

    /* renamed from: d */
    public final bjc mo10225d() {
        return this.f1464a;
    }

    /* renamed from: a */
    public final synchronized boolean mo10220a(long j, boolean z) {
        long j2;
        boolean z2;
        if (z) {
            try {
                j2 = this.f1468e;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j2 = this.f1467d;
        }
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public final synchronized boolean mo10219a(long j) {
        char c;
        boolean z = false;
        if (j > this.f1466c) {
            c = 0;
        } else {
            c = j < this.f1465b ? (char) 2 : 1;
        }
        boolean z2 = this.f1464a.mo12018e() >= this.f1469f;
        if (c == 2 || (c == 1 && this.f1470g && !z2)) {
            z = true;
        }
        this.f1470g = z;
        return this.f1470g;
    }

    /* renamed from: a */
    public final synchronized void mo10217a(int i) {
        this.f1465b = ((long) i) * 1000;
    }

    /* renamed from: b */
    public final synchronized void mo10222b(int i) {
        this.f1466c = ((long) i) * 1000;
    }

    /* renamed from: c */
    public final synchronized void mo10224c(int i) {
        this.f1467d = ((long) i) * 1000;
    }

    /* renamed from: d */
    public final synchronized void mo10226d(int i) {
        this.f1468e = ((long) i) * 1000;
    }

    /* renamed from: a */
    private final void m1792a(boolean z) {
        this.f1469f = 0;
        this.f1470g = false;
        if (z) {
            this.f1464a.mo12017d();
        }
    }
}
