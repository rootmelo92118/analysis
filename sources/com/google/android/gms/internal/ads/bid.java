package com.google.android.gms.internal.ads;

import java.util.List;

public final class bid extends bic {

    /* renamed from: g */
    final List<bhw> f4385g;

    public bid(bhw bhw, long j, long j2, int i, long j3, List<bif> list, List<bhw> list2) {
        super(bhw, j, j2, i, j3, list);
        this.f4385g = list2;
    }

    /* renamed from: a */
    public final boolean mo11972a() {
        return true;
    }

    /* renamed from: a */
    public final bhw mo11971a(bhx bhx, int i) {
        return this.f4385g.get(i - this.f4382d);
    }

    /* renamed from: a */
    public final int mo11969a(long j) {
        return this.f4385g.size();
    }
}
