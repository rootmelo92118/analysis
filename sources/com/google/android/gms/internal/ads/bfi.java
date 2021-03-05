package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class bfi implements bcj, bfs, bga, bjq<bfn> {

    /* renamed from: A */
    private boolean[] f4062A;

    /* renamed from: B */
    private boolean f4063B;

    /* renamed from: C */
    private long f4064C;

    /* renamed from: D */
    private long f4065D;

    /* renamed from: E */
    private long f4066E;

    /* renamed from: F */
    private int f4067F;

    /* renamed from: G */
    private boolean f4068G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f4069H;

    /* renamed from: a */
    private final Uri f4070a;

    /* renamed from: b */
    private final bje f4071b;

    /* renamed from: c */
    private final int f4072c;

    /* renamed from: d */
    private final Handler f4073d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final bfr f4074e;

    /* renamed from: f */
    private final bfv f4075f;

    /* renamed from: g */
    private final bjc f4076g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f4077h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f4078i;

    /* renamed from: j */
    private final bjp f4079j = new bjp("Loader:ExtractorMediaPeriod");

    /* renamed from: k */
    private final bfo f4080k;

    /* renamed from: l */
    private final bka f4081l;

    /* renamed from: m */
    private final Runnable f4082m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Runnable f4083n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Handler f4084o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<bfy> f4085p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public bft f4086q;

    /* renamed from: r */
    private bco f4087r;

    /* renamed from: s */
    private boolean f4088s;

    /* renamed from: t */
    private boolean f4089t;

    /* renamed from: u */
    private boolean f4090u;

    /* renamed from: v */
    private boolean f4091v;

    /* renamed from: w */
    private int f4092w;

    /* renamed from: x */
    private bgh f4093x;

    /* renamed from: y */
    private long f4094y;

    /* renamed from: z */
    private boolean[] f4095z;

    public bfi(Uri uri, bje bje, bcg[] bcgArr, int i, Handler handler, bfr bfr, bfv bfv, bjc bjc, String str, int i2) {
        this.f4070a = uri;
        this.f4071b = bje;
        this.f4072c = i;
        this.f4073d = handler;
        this.f4074e = bfr;
        this.f4075f = bfv;
        this.f4076g = bjc;
        this.f4077h = str;
        this.f4078i = (long) i2;
        this.f4080k = new bfo(bcgArr, this);
        this.f4081l = new bka();
        this.f4082m = new bfj(this);
        this.f4083n = new bfk(this);
        this.f4084o = new Handler();
        this.f4066E = -9223372036854775807L;
        this.f4085p = new SparseArray<>();
        this.f4064C = -1;
    }

    /* renamed from: b */
    public final void mo11828b(long j) {
    }

    /* renamed from: b */
    public final void mo11827b() {
        this.f4079j.mo12023a((Runnable) new bfl(this, this.f4080k));
        this.f4084o.removeCallbacksAndMessages((Object) null);
        this.f4069H = true;
    }

    /* renamed from: a */
    public final void mo11822a(bft bft, long j) {
        this.f4086q = bft;
        this.f4081l.mo12040a();
        m5220i();
    }

    /* renamed from: c */
    public final void mo11830c() {
        this.f4079j.mo12022a(Integer.MIN_VALUE);
    }

    /* renamed from: d */
    public final bgh mo11831d() {
        return this.f4093x;
    }

    /* renamed from: a */
    public final long mo11820a(biv[] bivArr, boolean[] zArr, bgb[] bgbArr, boolean[] zArr2, long j) {
        bjy.m5691b(this.f4089t);
        for (int i = 0; i < bivArr.length; i++) {
            if (bgbArr[i] != null && (bivArr[i] == null || !zArr[i])) {
                int a = bgbArr[i].f4115a;
                bjy.m5691b(this.f4095z[a]);
                this.f4092w--;
                this.f4095z[a] = false;
                this.f4085p.valueAt(a).mo11871b();
                bgbArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < bivArr.length; i2++) {
            if (bgbArr[i2] == null && bivArr[i2] != null) {
                biv biv = bivArr[i2];
                bjy.m5691b(biv.mo11979b() == 1);
                bjy.m5691b(biv.mo11980b(0) == 0);
                int a2 = this.f4093x.mo11893a(biv.mo11976a());
                bjy.m5691b(!this.f4095z[a2]);
                this.f4092w++;
                this.f4095z[a2] = true;
                bgbArr[i2] = new bfp(this, a2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f4090u) {
            int size = this.f4085p.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f4095z[i3]) {
                    this.f4085p.valueAt(i3).mo11871b();
                }
            }
        }
        if (this.f4092w == 0) {
            this.f4091v = false;
            if (this.f4079j.mo12024a()) {
                this.f4079j.mo12025b();
            }
        } else if (!this.f4090u ? j != 0 : z) {
            j = mo11829c(j);
            for (int i4 = 0; i4 < bgbArr.length; i4++) {
                if (bgbArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f4090u = true;
        return j;
    }

    /* renamed from: a */
    public final boolean mo11812a(long j) {
        if (this.f4068G) {
            return false;
        }
        if (this.f4089t && this.f4092w == 0) {
            return false;
        }
        boolean a = this.f4081l.mo12040a();
        if (this.f4079j.mo12024a()) {
            return a;
        }
        m5220i();
        return true;
    }

    /* renamed from: a_ */
    public final long mo11813a_() {
        if (this.f4092w == 0) {
            return Long.MIN_VALUE;
        }
        return mo11833f();
    }

    /* renamed from: e */
    public final long mo11832e() {
        if (!this.f4091v) {
            return -9223372036854775807L;
        }
        this.f4091v = false;
        return this.f4065D;
    }

    /* renamed from: f */
    public final long mo11833f() {
        long j;
        if (this.f4068G) {
            return Long.MIN_VALUE;
        }
        if (m5223l()) {
            return this.f4066E;
        }
        if (this.f4063B) {
            j = Long.MAX_VALUE;
            int size = this.f4085p.size();
            for (int i = 0; i < size; i++) {
                if (this.f4062A[i]) {
                    j = Math.min(j, this.f4085p.valueAt(i).mo11875f());
                }
            }
        } else {
            j = m5222k();
        }
        return j == Long.MIN_VALUE ? this.f4065D : j;
    }

    /* renamed from: c */
    public final long mo11829c(long j) {
        if (!this.f4087r.mo11666a()) {
            j = 0;
        }
        this.f4065D = j;
        int size = this.f4085p.size();
        boolean z = !m5223l();
        int i = 0;
        while (z && i < size) {
            if (this.f4095z[i]) {
                z = this.f4085p.valueAt(i).mo11870a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f4066E = j;
            this.f4068G = false;
            if (this.f4079j.mo12024a()) {
                this.f4079j.mo12025b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f4085p.valueAt(i2).mo11869a(this.f4095z[i2]);
                }
            }
        }
        this.f4091v = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo11826a(int i) {
        if (!this.f4068G) {
            return !m5223l() && this.f4085p.valueAt(i).mo11872c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11834g() {
        this.f4079j.mo12022a(Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11818a(int i, baa baa, bbw bbw, boolean z) {
        if (this.f4091v || m5223l()) {
            return -3;
        }
        return this.f4085p.valueAt(i).mo11865a(baa, bbw, z, this.f4068G, this.f4065D);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11821a(int i, long j) {
        bfy valueAt = this.f4085p.valueAt(i);
        if (!this.f4068G || j <= valueAt.mo11875f()) {
            valueAt.mo11870a(j, true);
        } else {
            valueAt.mo11876g();
        }
    }

    /* renamed from: a */
    public final bcq mo11688a(int i, int i2) {
        bfy bfy = this.f4085p.get(i);
        if (bfy != null) {
            return bfy;
        }
        bfy bfy2 = new bfy(this.f4076g);
        bfy2.mo11868a((bga) this);
        this.f4085p.put(i, bfy2);
        return bfy2;
    }

    /* renamed from: a */
    public final void mo11689a() {
        this.f4088s = true;
        this.f4084o.post(this.f4082m);
    }

    /* renamed from: a */
    public final void mo11690a(bco bco) {
        this.f4087r = bco;
        this.f4084o.post(this.f4082m);
    }

    /* renamed from: a */
    public final void mo11825a(zzfs zzfs) {
        this.f4084o.post(this.f4082m);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: h */
    public final void m5218h() {
        /*
            r8 = this;
            boolean r0 = r8.f4069H
            if (r0 != 0) goto L_0x009e
            boolean r0 = r8.f4089t
            if (r0 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.bco r0 = r8.f4087r
            if (r0 == 0) goto L_0x009e
            boolean r0 = r8.f4088s
            if (r0 != 0) goto L_0x0012
            goto L_0x009e
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.bfy> r0 = r8.f4085p
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.bfy> r3 = r8.f4085p
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.bfy r3 = (com.google.android.gms.internal.ads.bfy) r3
            com.google.android.gms.internal.ads.zzfs r3 = r3.mo11874e()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.bka r2 = r8.f4081l
            r2.mo12041b()
            com.google.android.gms.internal.ads.bgf[] r2 = new com.google.android.gms.internal.ads.bgf[r0]
            boolean[] r3 = new boolean[r0]
            r8.f4062A = r3
            boolean[] r3 = new boolean[r0]
            r8.f4095z = r3
            com.google.android.gms.internal.ads.bco r3 = r8.f4087r
            long r3 = r3.mo11667b()
            r8.f4094y = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.bfy> r5 = r8.f4085p
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.bfy r5 = (com.google.android.gms.internal.ads.bfy) r5
            com.google.android.gms.internal.ads.zzfs r5 = r5.mo11874e()
            com.google.android.gms.internal.ads.bgf r6 = new com.google.android.gms.internal.ads.bgf
            com.google.android.gms.internal.ads.zzfs[] r7 = new com.google.android.gms.internal.ads.zzfs[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f7209e
            boolean r6 = com.google.android.gms.internal.ads.bkd.m5754b(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.bkd.m5753a(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.f4062A
            r5[r3] = r4
            boolean r5 = r8.f4063B
            r4 = r4 | r5
            r8.f4063B = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.bgh r0 = new com.google.android.gms.internal.ads.bgh
            r0.<init>(r2)
            r8.f4093x = r0
            r8.f4089t = r4
            com.google.android.gms.internal.ads.bfv r0 = r8.f4075f
            com.google.android.gms.internal.ads.bge r1 = new com.google.android.gms.internal.ads.bge
            long r2 = r8.f4094y
            com.google.android.gms.internal.ads.bco r4 = r8.f4087r
            boolean r4 = r4.mo11666a()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo11492a(r1, r2)
            com.google.android.gms.internal.ads.bft r0 = r8.f4086q
            r0.mo11493a(r8)
            return
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfi.m5218h():void");
    }

    /* renamed from: a */
    private final void m5210a(bfn bfn) {
        if (this.f4064C == -1) {
            this.f4064C = bfn.f4110i;
        }
    }

    /* renamed from: i */
    private final void m5220i() {
        bfn bfn = new bfn(this, this.f4070a, this.f4071b, this.f4080k, this.f4081l);
        if (this.f4089t) {
            bjy.m5691b(m5223l());
            if (this.f4094y == -9223372036854775807L || this.f4066E < this.f4094y) {
                bfn.mo11840a(this.f4087r.mo11668b(this.f4066E), this.f4066E);
                this.f4066E = -9223372036854775807L;
            } else {
                this.f4068G = true;
                this.f4066E = -9223372036854775807L;
                return;
            }
        }
        this.f4067F = m5221j();
        int i = this.f4072c;
        if (i == -1) {
            i = (this.f4089t && this.f4064C == -1 && (this.f4087r == null || this.f4087r.mo11667b() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f4079j.mo12021a(bfn, this, i);
    }

    /* renamed from: j */
    private final int m5221j() {
        int size = this.f4085p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f4085p.valueAt(i2).mo11864a();
        }
        return i;
    }

    /* renamed from: k */
    private final long m5222k() {
        int size = this.f4085p.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f4085p.valueAt(i).mo11875f());
        }
        return j;
    }

    /* renamed from: l */
    private final boolean m5223l() {
        return this.f4066E != -9223372036854775807L;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo11819a(bjs bjs, long j, long j2, IOException iOException) {
        bfn bfn = (bfn) bjs;
        m5210a(bfn);
        if (!(this.f4073d == null || this.f4074e == null)) {
            this.f4073d.post(new bfm(this, iOException));
        }
        if (iOException instanceof bgi) {
            return 3;
        }
        boolean z = m5221j() > this.f4067F;
        if (this.f4064C == -1 && (this.f4087r == null || this.f4087r.mo11667b() == -9223372036854775807L)) {
            this.f4065D = 0;
            this.f4091v = this.f4089t;
            int size = this.f4085p.size();
            for (int i = 0; i < size; i++) {
                this.f4085p.valueAt(i).mo11869a(!this.f4089t || this.f4095z[i]);
            }
            bfn.mo11840a(0, 0);
        }
        this.f4067F = m5221j();
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11824a(bjs bjs, long j, long j2, boolean z) {
        m5210a((bfn) bjs);
        if (!z && this.f4092w > 0) {
            int size = this.f4085p.size();
            for (int i = 0; i < size; i++) {
                this.f4085p.valueAt(i).mo11869a(this.f4095z[i]);
            }
            this.f4086q.mo11495a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11823a(bjs bjs, long j, long j2) {
        m5210a((bfn) bjs);
        this.f4068G = true;
        if (this.f4094y == -9223372036854775807L) {
            long k = m5222k();
            this.f4094y = k == Long.MIN_VALUE ? 0 : k + 10000;
            this.f4075f.mo11492a(new bge(this.f4094y, this.f4087r.mo11666a()), (Object) null);
        }
        this.f4086q.mo11495a(this);
    }
}
