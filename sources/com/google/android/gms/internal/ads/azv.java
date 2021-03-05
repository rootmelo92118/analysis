package com.google.android.gms.internal.ads;

import android.util.Log;

final class azv {

    /* renamed from: a */
    public final bfs f3237a;

    /* renamed from: b */
    public final Object f3238b;

    /* renamed from: c */
    public final int f3239c;

    /* renamed from: d */
    public final bgb[] f3240d;

    /* renamed from: e */
    public final long f3241e;

    /* renamed from: f */
    public int f3242f;

    /* renamed from: g */
    public long f3243g;

    /* renamed from: h */
    public boolean f3244h;

    /* renamed from: i */
    public boolean f3245i;

    /* renamed from: j */
    public boolean f3246j;

    /* renamed from: k */
    public azv f3247k;

    /* renamed from: l */
    public bja f3248l;

    /* renamed from: m */
    private final boolean[] f3249m;

    /* renamed from: n */
    private final baf[] f3250n;

    /* renamed from: o */
    private final bah[] f3251o;

    /* renamed from: p */
    private final biy f3252p;

    /* renamed from: q */
    private final bac f3253q;

    /* renamed from: r */
    private final bfu f3254r;

    /* renamed from: s */
    private bja f3255s;

    public azv(baf[] bafArr, bah[] bahArr, long j, biy biy, bac bac, bfu bfu, Object obj, int i, int i2, boolean z, long j2) {
        this.f3250n = bafArr;
        this.f3251o = bahArr;
        this.f3241e = j;
        this.f3252p = biy;
        this.f3253q = bac;
        this.f3254r = bfu;
        this.f3238b = bjy.m5688a(obj);
        this.f3239c = i;
        this.f3242f = i2;
        this.f3244h = z;
        this.f3243g = j2;
        this.f3240d = new bgb[bafArr.length];
        this.f3249m = new boolean[bafArr.length];
        this.f3237a = bfu.mo11845a(i2, bac.mo10225d());
    }

    /* renamed from: a */
    public final long mo11502a() {
        return this.f3241e - this.f3243g;
    }

    /* renamed from: a */
    public final void mo11505a(int i, boolean z) {
        this.f3242f = i;
        this.f3244h = z;
    }

    /* renamed from: b */
    public final boolean mo11506b() {
        if (this.f3245i) {
            return !this.f3246j || this.f3237a.mo11833f() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11507c() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.biy r0 = r6.f3252p
            com.google.android.gms.internal.ads.bah[] r1 = r6.f3251o
            com.google.android.gms.internal.ads.bfs r2 = r6.f3237a
            com.google.android.gms.internal.ads.bgh r2 = r2.mo11831d()
            com.google.android.gms.internal.ads.bja r0 = r0.mo11992a(r1, r2)
            com.google.android.gms.internal.ads.bja r1 = r6.f3255s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.bix r5 = r0.f4437b
            int r5 = r5.f4432a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.mo12001a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.f3248l = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azv.mo11507c():boolean");
    }

    /* renamed from: a */
    public final long mo11503a(long j, boolean z) {
        return mo11504a(j, false, new boolean[this.f3250n.length]);
    }

    /* renamed from: a */
    public final long mo11504a(long j, boolean z, boolean[] zArr) {
        bix bix = this.f3248l.f4437b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= bix.f4432a) {
                break;
            }
            boolean[] zArr2 = this.f3249m;
            if (z || !this.f3248l.mo12001a(this.f3255s, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long a = this.f3237a.mo11820a(bix.mo11996a(), this.f3249m, this.f3240d, zArr, j);
        this.f3255s = this.f3248l;
        this.f3246j = false;
        for (int i2 = 0; i2 < this.f3240d.length; i2++) {
            if (this.f3240d[i2] != null) {
                bjy.m5691b(bix.mo11995a(i2) != null);
                this.f3246j = true;
            } else {
                bjy.m5691b(bix.mo11995a(i2) == null);
            }
        }
        this.f3253q.mo10218a(this.f3250n, this.f3248l.f4436a, bix);
        return a;
    }

    /* renamed from: d */
    public final void mo11508d() {
        try {
            this.f3254r.mo11848a(this.f3237a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
