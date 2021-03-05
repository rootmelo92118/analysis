package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class bgm implements bcj {

    /* renamed from: a */
    public final bcg f4197a;

    /* renamed from: b */
    private final zzfs f4198b;

    /* renamed from: c */
    private final SparseArray<bgn> f4199c = new SparseArray<>();

    /* renamed from: d */
    private boolean f4200d;

    /* renamed from: e */
    private bgo f4201e;

    /* renamed from: f */
    private bco f4202f;

    /* renamed from: g */
    private zzfs[] f4203g;

    public bgm(bcg bcg, zzfs zzfs) {
        this.f4197a = bcg;
        this.f4198b = zzfs;
    }

    /* renamed from: b */
    public final bco mo11905b() {
        return this.f4202f;
    }

    /* renamed from: c */
    public final zzfs[] mo11906c() {
        return this.f4203g;
    }

    /* renamed from: a */
    public final void mo11904a(bgo bgo) {
        this.f4201e = bgo;
        if (!this.f4200d) {
            this.f4197a.mo11685a((bcj) this);
            this.f4200d = true;
            return;
        }
        this.f4197a.mo11684a(0, 0);
        for (int i = 0; i < this.f4199c.size(); i++) {
            this.f4199c.valueAt(i).mo11907a(bgo);
        }
    }

    /* renamed from: a */
    public final bcq mo11688a(int i, int i2) {
        bgn bgn = this.f4199c.get(i);
        if (bgn != null) {
            return bgn;
        }
        bjy.m5691b(this.f4203g == null);
        bgn bgn2 = new bgn(i, i2, this.f4198b);
        bgn2.mo11907a(this.f4201e);
        this.f4199c.put(i, bgn2);
        return bgn2;
    }

    /* renamed from: a */
    public final void mo11689a() {
        zzfs[] zzfsArr = new zzfs[this.f4199c.size()];
        for (int i = 0; i < this.f4199c.size(); i++) {
            zzfsArr[i] = this.f4199c.valueAt(i).f4204a;
        }
        this.f4203g = zzfsArr;
    }

    /* renamed from: a */
    public final void mo11690a(bco bco) {
        this.f4202f = bco;
    }
}
