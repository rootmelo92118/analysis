package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.en */
final class C2266en {

    /* renamed from: A */
    private boolean f8453A;

    /* renamed from: B */
    private long f8454B;

    /* renamed from: C */
    private long f8455C;

    /* renamed from: a */
    private final C2166aw f8456a;

    /* renamed from: b */
    private final String f8457b;

    /* renamed from: c */
    private String f8458c;

    /* renamed from: d */
    private String f8459d;

    /* renamed from: e */
    private String f8460e;

    /* renamed from: f */
    private String f8461f;

    /* renamed from: g */
    private long f8462g;

    /* renamed from: h */
    private long f8463h;

    /* renamed from: i */
    private long f8464i;

    /* renamed from: j */
    private String f8465j;

    /* renamed from: k */
    private long f8466k;

    /* renamed from: l */
    private String f8467l;

    /* renamed from: m */
    private long f8468m;

    /* renamed from: n */
    private long f8469n;

    /* renamed from: o */
    private boolean f8470o;

    /* renamed from: p */
    private long f8471p;

    /* renamed from: q */
    private boolean f8472q;

    /* renamed from: r */
    private boolean f8473r;

    /* renamed from: s */
    private String f8474s;

    /* renamed from: t */
    private long f8475t;

    /* renamed from: u */
    private long f8476u;

    /* renamed from: v */
    private long f8477v;

    /* renamed from: w */
    private long f8478w;

    /* renamed from: x */
    private long f8479x;

    /* renamed from: y */
    private long f8480y;

    /* renamed from: z */
    private String f8481z;

    @WorkerThread
    C2266en(C2166aw awVar, String str) {
        C0926p.m1306a(awVar);
        C0926p.m1308a(str);
        this.f8456a = awVar;
        this.f8457b = str;
        this.f8456a.mo14234q().mo14221d();
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14597a() {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A = false;
    }

    @WorkerThread
    /* renamed from: b */
    public final String mo14601b() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8457b;
    }

    @WorkerThread
    /* renamed from: c */
    public final String mo14605c() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8458c;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14599a(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8458c, str);
        this.f8458c = str;
    }

    @WorkerThread
    /* renamed from: d */
    public final String mo14609d() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8459d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14603b(String str) {
        this.f8456a.mo14234q().mo14221d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8453A |= !C2264el.m11033c(this.f8459d, str);
        this.f8459d = str;
    }

    @WorkerThread
    /* renamed from: e */
    public final String mo14612e() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8474s;
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo14607c(String str) {
        this.f8456a.mo14234q().mo14221d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8453A |= !C2264el.m11033c(this.f8474s, str);
        this.f8474s = str;
    }

    @WorkerThread
    /* renamed from: f */
    public final String mo14615f() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8460e;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo14611d(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8460e, str);
        this.f8460e = str;
    }

    @WorkerThread
    /* renamed from: g */
    public final String mo14618g() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8461f;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo14614e(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8461f, str);
        this.f8461f = str;
    }

    @WorkerThread
    /* renamed from: h */
    public final long mo14621h() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8463h;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14598a(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8463h != j;
        this.f8463h = j;
    }

    @WorkerThread
    /* renamed from: i */
    public final long mo14624i() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8464i;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14602b(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8464i != j;
        this.f8464i = j;
    }

    @WorkerThread
    /* renamed from: j */
    public final String mo14626j() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8465j;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo14617f(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8465j, str);
        this.f8465j = str;
    }

    @WorkerThread
    /* renamed from: k */
    public final long mo14628k() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8466k;
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo14606c(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8466k != j;
        this.f8466k = j;
    }

    @WorkerThread
    /* renamed from: l */
    public final String mo14630l() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8467l;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo14620g(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8467l, str);
        this.f8467l = str;
    }

    @WorkerThread
    /* renamed from: m */
    public final long mo14632m() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8468m;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo14610d(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8468m != j;
        this.f8468m = j;
    }

    @WorkerThread
    /* renamed from: n */
    public final long mo14634n() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8469n;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo14613e(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8469n != j;
        this.f8469n = j;
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo14637o() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8470o;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14600a(boolean z) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8470o != z;
        this.f8470o = z;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo14616f(long j) {
        boolean z = false;
        C0926p.m1316b(j >= 0);
        this.f8456a.mo14234q().mo14221d();
        boolean z2 = this.f8453A;
        if (this.f8462g != j) {
            z = true;
        }
        this.f8453A = z | z2;
        this.f8462g = j;
    }

    @WorkerThread
    /* renamed from: p */
    public final long mo14638p() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8462g;
    }

    @WorkerThread
    /* renamed from: q */
    public final long mo14639q() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8454B;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo14619g(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8454B != j;
        this.f8454B = j;
    }

    @WorkerThread
    /* renamed from: r */
    public final long mo14640r() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8455C;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo14622h(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8455C != j;
        this.f8455C = j;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo14641s() {
        this.f8456a.mo14234q().mo14221d();
        long j = this.f8462g + 1;
        if (j > 2147483647L) {
            this.f8456a.mo14235r().mo14833i().mo14842a("Bundle index overflow. appId", C2295r.m11413a(this.f8457b));
            j = 0;
        }
        this.f8453A = true;
        this.f8462g = j;
    }

    @WorkerThread
    /* renamed from: t */
    public final long mo14642t() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8475t;
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo14625i(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8475t != j;
        this.f8475t = j;
    }

    @WorkerThread
    /* renamed from: u */
    public final long mo14643u() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8476u;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo14627j(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8476u != j;
        this.f8476u = j;
    }

    @WorkerThread
    /* renamed from: v */
    public final long mo14644v() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8477v;
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo14629k(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8477v != j;
        this.f8477v = j;
    }

    @WorkerThread
    /* renamed from: w */
    public final long mo14645w() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8478w;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14631l(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8478w != j;
        this.f8478w = j;
    }

    @WorkerThread
    /* renamed from: x */
    public final long mo14646x() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8480y;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14633m(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8480y != j;
        this.f8480y = j;
    }

    @WorkerThread
    /* renamed from: y */
    public final long mo14647y() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8479x;
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14635n(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8479x != j;
        this.f8479x = j;
    }

    @WorkerThread
    /* renamed from: z */
    public final String mo14648z() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8481z;
    }

    @WorkerThread
    /* renamed from: A */
    public final String mo14593A() {
        this.f8456a.mo14234q().mo14221d();
        String str = this.f8481z;
        mo14623h((String) null);
        return str;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo14623h(String str) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= !C2264el.m11033c(this.f8481z, str);
        this.f8481z = str;
    }

    @WorkerThread
    /* renamed from: B */
    public final long mo14594B() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8471p;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo14636o(long j) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A |= this.f8471p != j;
        this.f8471p = j;
    }

    @WorkerThread
    /* renamed from: C */
    public final boolean mo14595C() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8472q;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14604b(boolean z) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A = this.f8472q != z;
        this.f8472q = z;
    }

    @WorkerThread
    /* renamed from: D */
    public final boolean mo14596D() {
        this.f8456a.mo14234q().mo14221d();
        return this.f8473r;
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo14608c(boolean z) {
        this.f8456a.mo14234q().mo14221d();
        this.f8453A = this.f8473r != z;
        this.f8473r = z;
    }
}
