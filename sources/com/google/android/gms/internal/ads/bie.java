package com.google.android.gms.internal.ads;

import java.util.List;

public final class bie extends bic {

    /* renamed from: g */
    final bij f4386g;

    /* renamed from: h */
    final bij f4387h;

    public bie(bhw bhw, long j, long j2, int i, long j3, List<bif> list, bij bij, bij bij2) {
        super(bhw, j, j2, i, j3, list);
        this.f4386g = bij;
        this.f4387h = bij2;
    }

    /* renamed from: a */
    public final bhw mo11968a(bhx bhx) {
        if (this.f4386g != null) {
            return new bhw(this.f4386g.mo11973a(bhx.f4366a.f7205a, 0, bhx.f4366a.f7206b, 0), 0, -1);
        }
        return super.mo11968a(bhx);
    }

    /* renamed from: a */
    public final bhw mo11971a(bhx bhx, int i) {
        long j;
        bhx bhx2 = bhx;
        if (this.f4384f != null) {
            j = ((bif) this.f4384f.get(i - this.f4382d)).f4388a;
        } else {
            j = ((long) (i - this.f4382d)) * this.f4383e;
        }
        long j2 = j;
        return new bhw(this.f4387h.mo11973a(bhx2.f4366a.f7205a, i, bhx2.f4366a.f7206b, j2), 0, -1);
    }

    /* renamed from: a */
    public final int mo11969a(long j) {
        if (this.f4384f != null) {
            return this.f4384f.size();
        }
        if (j != -9223372036854775807L) {
            return (int) bkp.m5812a(j, (this.f4383e * 1000000) / this.f4380b);
        }
        return -1;
    }
}
