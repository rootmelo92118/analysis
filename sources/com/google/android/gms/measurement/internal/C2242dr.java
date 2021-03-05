package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.internal.measurement.C1961d;

/* renamed from: com.google.android.gms.measurement.internal.dr */
public final class C2242dr extends C2238dn {

    /* renamed from: a */
    private Handler f8380a;

    /* renamed from: b */
    private long f8381b = mo14230m().mo9997b();

    /* renamed from: c */
    private long f8382c = this.f8381b;

    /* renamed from: d */
    private final C2281fb f8383d = new C2243ds(this, this.f8222q);

    /* renamed from: e */
    private final C2281fb f8384e = new C2244dt(this, this.f8222q);

    /* renamed from: f */
    private final C2281fb f8385f = new C2245du(this, this.f8222q);

    C2242dr(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return false;
    }

    /* renamed from: z */
    private final void m10842z() {
        synchronized (this) {
            if (this.f8380a == null) {
                this.f8380a = new C1961d(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: b */
    public final void m10838b(long j) {
        mo14221d();
        m10842z();
        mo14235r().mo14838x().mo14842a("Activity resumed, time", Long.valueOf(j));
        this.f8381b = j;
        this.f8382c = this.f8381b;
        if (mo14237t().mo14741r(mo14224g().mo14808x())) {
            mo14492a(mo14230m().mo9996a());
            return;
        }
        this.f8383d.mo14798c();
        this.f8384e.mo14798c();
        if (mo14237t().mo14739p(mo14224g().mo14808x()) || mo14237t().mo14740q(mo14224g().mo14808x())) {
            this.f8385f.mo14798c();
        }
        if (mo14236s().mo14246a(mo14230m().mo9996a())) {
            mo14236s().f8054m.mo14263a(true);
            mo14236s().f8056o.mo14266a(0);
        }
        if (mo14236s().f8054m.mo14264a()) {
            this.f8383d.mo14796a(Math.max(0, mo14236s().f8052k.mo14265a() - mo14236s().f8056o.mo14265a()));
        } else {
            this.f8384e.mo14796a(Math.max(0, 3600000 - mo14236s().f8056o.mo14265a()));
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14492a(long j) {
        mo14221d();
        m10842z();
        mo14493a(j, false);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14493a(long j, boolean z) {
        mo14221d();
        m10842z();
        this.f8383d.mo14798c();
        this.f8384e.mo14798c();
        if (mo14237t().mo14739p(mo14224g().mo14808x()) || mo14237t().mo14740q(mo14224g().mo14808x())) {
            this.f8385f.mo14798c();
        }
        if (mo14236s().mo14246a(j)) {
            mo14236s().f8054m.mo14263a(true);
            mo14236s().f8056o.mo14266a(0);
        }
        if (mo14236s().f8054m.mo14264a()) {
            m10841d(j);
            return;
        }
        this.f8384e.mo14796a(Math.max(0, 3600000 - mo14236s().f8056o.mo14265a()));
        if (z && mo14237t().mo14742s(mo14224g().mo14808x())) {
            mo14236s().f8055n.mo14266a(j);
            if (mo14237t().mo14739p(mo14224g().mo14808x()) || mo14237t().mo14740q(mo14224g().mo14808x())) {
                this.f8385f.mo14798c();
                this.f8385f.mo14796a(mo14236s().f8053l.mo14265a());
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: c */
    public final void m10840c(long j) {
        mo14221d();
        m10842z();
        this.f8383d.mo14798c();
        this.f8384e.mo14798c();
        if (mo14237t().mo14739p(mo14224g().mo14808x()) || mo14237t().mo14740q(mo14224g().mo14808x())) {
            this.f8385f.mo14798c();
            this.f8385f.mo14796a(mo14236s().f8053l.mo14265a());
        }
        mo14235r().mo14838x().mo14842a("Activity paused, time", Long.valueOf(j));
        if (this.f8381b != 0) {
            mo14236s().f8056o.mo14266a(mo14236s().f8056o.mo14265a() + (j - this.f8381b));
        }
    }

    @WorkerThread
    /* renamed from: d */
    private final void m10841d(long j) {
        mo14221d();
        mo14235r().mo14838x().mo14842a("Session started, time", Long.valueOf(mo14230m().mo9997b()));
        long j2 = null;
        Long valueOf = mo14237t().mo14739p(mo14224g().mo14808x()) ? Long.valueOf(j / 1000) : null;
        if (mo14237t().mo14740q(mo14224g().mo14808x())) {
            j2 = -1L;
        }
        long j3 = j;
        mo14223f().mo14397a("auto", "_sid", (Object) valueOf, j3);
        mo14223f().mo14397a("auto", "_sno", (Object) j2, j3);
        mo14236s().f8054m.mo14263a(false);
        Bundle bundle = new Bundle();
        if (mo14237t().mo14739p(mo14224g().mo14808x())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo14223f().mo14394a("auto", "_s", j, bundle);
        mo14236s().f8055n.mo14266a(j);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: x */
    public final void mo14495x() {
        mo14221d();
        m10841d(mo14230m().mo9996a());
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final long mo14496y() {
        long b = mo14230m().mo9997b();
        long j = b - this.f8382c;
        this.f8382c = b;
        return j;
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14494a(boolean z, boolean z2) {
        mo14221d();
        mo14486E();
        long b = mo14230m().mo9997b();
        mo14236s().f8055n.mo14266a(mo14230m().mo9996a());
        long j = b - this.f8381b;
        if (z || j >= 1000) {
            mo14236s().f8056o.mo14266a(j);
            mo14235r().mo14838x().mo14842a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C2213cp.m10706a(mo14226i().mo14433x(), bundle, true);
            if (mo14237t().mo14743t(mo14224g().mo14808x())) {
                if (mo14237t().mo14723d(mo14224g().mo14808x(), C2284h.f8550ao)) {
                    if (!z2) {
                        mo14496y();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo14496y();
                }
            }
            if (!mo14237t().mo14723d(mo14224g().mo14808x(), C2284h.f8550ao) || !z2) {
                mo14223f().mo14395a("auto", "_e", bundle);
            }
            this.f8381b = b;
            this.f8384e.mo14798c();
            this.f8384e.mo14796a(Math.max(0, 3600000 - mo14236s().f8056o.mo14265a()));
            return true;
        }
        mo14235r().mo14838x().mo14842a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: A */
    public final void m10835A() {
        mo14221d();
        mo14494a(false, false);
        mo14222e().mo14216a(mo14230m().mo9997b());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2143a mo14222e() {
        return super.mo14222e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2200cc mo14223f() {
        return super.mo14223f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2289l mo14224g() {
        return super.mo14224g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2217ct mo14225h() {
        return super.mo14225h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2213cp mo14226i() {
        return super.mo14226i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2291n mo14227j() {
        return super.mo14227j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C2242dr mo14228k() {
        return super.mo14228k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
