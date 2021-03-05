package com.google.android.gms.internal.ads;

import java.util.List;

public abstract class bic extends bib {

    /* renamed from: d */
    final int f4382d;

    /* renamed from: e */
    final long f4383e;

    /* renamed from: f */
    final List<bif> f4384f;

    public bic(bhw bhw, long j, long j2, int i, long j3, List<bif> list) {
        super(bhw, j, j2);
        this.f4382d = i;
        this.f4383e = j3;
        this.f4384f = list;
    }

    /* renamed from: a */
    public abstract int mo11969a(long j);

    /* renamed from: a */
    public abstract bhw mo11971a(bhx bhx, int i);

    /* renamed from: a */
    public final long mo11970a(int i) {
        long j;
        if (this.f4384f != null) {
            j = this.f4384f.get(i - this.f4382d).f4388a - this.f4381c;
        } else {
            j = ((long) (i - this.f4382d)) * this.f4383e;
        }
        return bkp.m5813a(j, 1000000, this.f4380b);
    }

    /* renamed from: a */
    public boolean mo11972a() {
        return this.f4384f != null;
    }
}
