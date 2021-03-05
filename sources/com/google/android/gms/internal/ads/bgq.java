package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bgs;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class bgq<T extends bgs> implements bgb, bgc, bjq<bgl> {

    /* renamed from: a */
    long f4211a;

    /* renamed from: b */
    boolean f4212b;

    /* renamed from: c */
    private final int f4213c;

    /* renamed from: d */
    private final int[] f4214d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean[] f4215e;

    /* renamed from: f */
    private final T f4216f;

    /* renamed from: g */
    private final bgd<bgq<T>> f4217g;

    /* renamed from: h */
    private final bey f4218h;

    /* renamed from: i */
    private final int f4219i;

    /* renamed from: j */
    private final bjp f4220j = new bjp("Loader:ChunkSampleStream");

    /* renamed from: k */
    private final bgp f4221k = new bgp();

    /* renamed from: l */
    private final LinkedList<bgj> f4222l = new LinkedList<>();

    /* renamed from: m */
    private final List<bgj> f4223m = Collections.unmodifiableList(this.f4222l);

    /* renamed from: n */
    private final bfy f4224n;

    /* renamed from: o */
    private final bfy[] f4225o;

    /* renamed from: p */
    private final bgk f4226p;

    /* renamed from: q */
    private zzfs f4227q;

    /* renamed from: r */
    private long f4228r;

    public bgq(int i, int[] iArr, T t, bgd<bgq<T>> bgd, bjc bjc, long j, int i2, bey bey) {
        int i3;
        this.f4213c = i;
        this.f4214d = iArr;
        this.f4216f = t;
        this.f4217g = bgd;
        this.f4218h = bey;
        this.f4219i = i2;
        int i4 = 0;
        if (iArr == null) {
            i3 = 0;
        } else {
            i3 = iArr.length;
        }
        this.f4225o = new bfy[i3];
        this.f4215e = new boolean[i3];
        int i5 = i3 + 1;
        int[] iArr2 = new int[i5];
        bfy[] bfyArr = new bfy[i5];
        this.f4224n = new bfy(bjc);
        iArr2[0] = i;
        bfyArr[0] = this.f4224n;
        while (i4 < i3) {
            bfy bfy = new bfy(bjc);
            this.f4225o[i4] = bfy;
            int i6 = i4 + 1;
            bfyArr[i6] = bfy;
            iArr2[i6] = iArr[i4];
            i4 = i6;
        }
        this.f4226p = new bgk(iArr2, bfyArr);
        this.f4228r = j;
        this.f4211a = j;
    }

    /* renamed from: b */
    public final void mo11909b(long j) {
        for (int i = 0; i < this.f4225o.length; i++) {
            if (!this.f4215e[i]) {
                this.f4225o[i].mo11870a(j, true);
            }
        }
    }

    /* renamed from: a */
    public final bgr mo11908a(long j, int i) {
        for (int i2 = 0; i2 < this.f4225o.length; i2++) {
            if (this.f4214d[i2] == i) {
                bjy.m5691b(!this.f4215e[i2]);
                this.f4215e[i2] = true;
                this.f4225o[i2].mo11870a(j, true);
                return new bgr(this, this, this.f4225o[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final T mo11910c() {
        return this.f4216f;
    }

    /* renamed from: d */
    public final long mo11912d() {
        if (this.f4212b) {
            return Long.MIN_VALUE;
        }
        if (mo11914f()) {
            return this.f4228r;
        }
        long j = this.f4211a;
        bgj last = this.f4222l.getLast();
        if (!last.mo11921g()) {
            last = this.f4222l.size() > 1 ? this.f4222l.get(this.f4222l.size() - 2) : null;
        }
        if (last != null) {
            j = Math.max(j, last.f4195g);
        }
        return Math.max(j, this.f4224n.mo11875f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[LOOP:0: B:11:0x0022->B:15:0x003e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11911c(long r7) {
        /*
            r6 = this;
            r6.f4211a = r7
            boolean r0 = r6.mo11914f()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            com.google.android.gms.internal.ads.bfy r0 = r6.f4224n
            long r3 = r6.mo11813a_()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            boolean r0 = r0.mo11870a((long) r7, (boolean) r3)
            if (r0 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0052
        L_0x0022:
            java.util.LinkedList<com.google.android.gms.internal.ads.bgj> r0 = r6.f4222l
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x0044
            java.util.LinkedList<com.google.android.gms.internal.ads.bgj> r0 = r6.f4222l
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.bgj r0 = (com.google.android.gms.internal.ads.bgj) r0
            int r0 = r0.mo11897a((int) r1)
            com.google.android.gms.internal.ads.bfy r3 = r6.f4224n
            int r3 = r3.mo11873d()
            if (r0 > r3) goto L_0x0044
            java.util.LinkedList<com.google.android.gms.internal.ads.bgj> r0 = r6.f4222l
            r0.removeFirst()
            goto L_0x0022
        L_0x0044:
            com.google.android.gms.internal.ads.bfy[] r0 = r6.f4225o
            int r3 = r0.length
        L_0x0047:
            if (r1 >= r3) goto L_0x0051
            r4 = r0[r1]
            r4.mo11870a((long) r7, (boolean) r2)
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0051:
            return
        L_0x0052:
            r6.f4228r = r7
            r6.f4212b = r1
            java.util.LinkedList<com.google.android.gms.internal.ads.bgj> r7 = r6.f4222l
            r7.clear()
            com.google.android.gms.internal.ads.bjp r7 = r6.f4220j
            boolean r7 = r7.mo12024a()
            if (r7 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.bjp r7 = r6.f4220j
            r7.mo12025b()
            return
        L_0x0069:
            com.google.android.gms.internal.ads.bfy r7 = r6.f4224n
            r7.mo11869a((boolean) r2)
            com.google.android.gms.internal.ads.bfy[] r7 = r6.f4225o
            int r8 = r7.length
        L_0x0071:
            if (r1 >= r8) goto L_0x007b
            r0 = r7[r1]
            r0.mo11869a((boolean) r2)
            int r1 = r1 + 1
            goto L_0x0071
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgq.mo11911c(long):void");
    }

    /* renamed from: e */
    public final void mo11913e() {
        this.f4224n.mo11871b();
        for (bfy b : this.f4225o) {
            b.mo11871b();
        }
        this.f4220j.mo12023a((Runnable) null);
    }

    /* renamed from: a */
    public final boolean mo11815a() {
        if (!this.f4212b) {
            return !mo11914f() && this.f4224n.mo11872c();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo11817b() {
        this.f4220j.mo12022a(Integer.MIN_VALUE);
        if (!this.f4220j.mo12024a()) {
            this.f4216f.mo11916a();
        }
    }

    /* renamed from: a */
    public final int mo11814a(baa baa, bbw bbw, boolean z) {
        if (mo11914f()) {
            return -3;
        }
        int d = this.f4224n.mo11873d();
        if (!this.f4222l.isEmpty()) {
            while (this.f4222l.size() > 1 && this.f4222l.get(1).mo11897a(0) <= d) {
                this.f4222l.removeFirst();
            }
            bgj first = this.f4222l.getFirst();
            zzfs zzfs = first.f4191c;
            if (!zzfs.equals(this.f4227q)) {
                this.f4218h.mo11770a(this.f4213c, zzfs, first.f4192d, first.f4193e, first.f4194f);
            }
            this.f4227q = zzfs;
        }
        return this.f4224n.mo11865a(baa, bbw, z, this.f4212b, this.f4211a);
    }

    /* renamed from: a_ */
    public final void mo11816a_(long j) {
        if (!this.f4212b || j <= this.f4224n.mo11875f()) {
            this.f4224n.mo11870a(j, true);
        } else {
            this.f4224n.mo11876g();
        }
    }

    /* renamed from: a */
    public final boolean mo11812a(long j) {
        if (this.f4212b || this.f4220j.mo12024a()) {
            return false;
        }
        this.f4216f.mo11918a(this.f4222l.isEmpty() ? null : this.f4222l.getLast(), this.f4228r != -9223372036854775807L ? this.f4228r : j, this.f4221k);
        boolean z = this.f4221k.f4210b;
        bgl bgl = this.f4221k.f4209a;
        bgp bgp = this.f4221k;
        bgp.f4209a = null;
        bgp.f4210b = false;
        if (z) {
            this.f4228r = -9223372036854775807L;
            this.f4212b = true;
            return true;
        } else if (bgl == null) {
            return false;
        } else {
            if (bgl instanceof bgj) {
                this.f4228r = -9223372036854775807L;
                bgj bgj = (bgj) bgl;
                bgj.mo11898a(this.f4226p);
                this.f4222l.add(bgj);
            }
            this.f4218h.mo11771a(bgl.f4189a, bgl.f4190b, this.f4213c, bgl.f4191c, bgl.f4192d, bgl.f4193e, bgl.f4194f, bgl.f4195g, this.f4220j.mo12021a(bgl, this, this.f4219i));
            return true;
        }
    }

    /* renamed from: a_ */
    public final long mo11813a_() {
        if (mo11914f()) {
            return this.f4228r;
        }
        if (this.f4212b) {
            return Long.MIN_VALUE;
        }
        return this.f4222l.getLast().f4195g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo11914f() {
        return this.f4228r != -9223372036854775807L;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo11819a(bjs bjs, long j, long j2, IOException iOException) {
        boolean z;
        bgl bgl = (bgl) bjs;
        long e = bgl.mo11903e();
        boolean z2 = bgl instanceof bgj;
        if (this.f4216f.mo11919a(bgl, !z2 || e == 0 || this.f4222l.size() > 1, (Exception) iOException)) {
            if (z2) {
                bgj removeLast = this.f4222l.removeLast();
                bjy.m5691b(removeLast == bgl);
                this.f4224n.mo11866a(removeLast.mo11897a(0));
                int i = 0;
                while (i < this.f4225o.length) {
                    bfy bfy = this.f4225o[i];
                    i++;
                    bfy.mo11866a(removeLast.mo11897a(i));
                }
                if (this.f4222l.isEmpty()) {
                    this.f4228r = this.f4211a;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.f4218h.mo11773a(bgl.f4189a, bgl.f4190b, this.f4213c, bgl.f4191c, bgl.f4192d, bgl.f4193e, bgl.f4194f, bgl.f4195g, j, j2, e, iOException, z);
        if (!z) {
            return 0;
        }
        this.f4217g.mo11495a(this);
        return 2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11824a(bjs bjs, long j, long j2, boolean z) {
        bgl bgl = (bgl) bjs;
        bey bey = this.f4218h;
        bey.mo11777b(bgl.f4189a, bgl.f4190b, this.f4213c, bgl.f4191c, bgl.f4192d, bgl.f4193e, bgl.f4194f, bgl.f4195g, j, j2, bgl.mo11903e());
        if (!z) {
            this.f4224n.mo11869a(true);
            for (bfy a : this.f4225o) {
                a.mo11869a(true);
            }
            this.f4217g.mo11495a(this);
            return;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11823a(bjs bjs, long j, long j2) {
        bgl bgl = (bgl) bjs;
        this.f4216f.mo11917a(bgl);
        bey bey = this.f4218h;
        bgl bgl2 = bgl;
        bey bey2 = bey;
        bey2.mo11772a(bgl.f4189a, bgl.f4190b, this.f4213c, bgl.f4191c, bgl.f4192d, bgl.f4193e, bgl.f4194f, bgl.f4195g, j, j2, bgl2.mo11903e());
        this.f4217g.mo11495a(this);
    }
}
