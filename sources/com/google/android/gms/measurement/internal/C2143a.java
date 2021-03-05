package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C2143a extends C2215cr {

    /* renamed from: a */
    private final Map<String, Long> f8027a = new ArrayMap();

    /* renamed from: b */
    private final Map<String, Integer> f8028b = new ArrayMap();

    /* renamed from: c */
    private long f8029c;

    public C2143a(C2166aw awVar) {
        super(awVar);
    }

    /* renamed from: a */
    public final void mo14217a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo14235r().mo14830d_().mo14841a("Ad unit id must be a non-empty string");
        } else {
            mo14234q().mo14296a((Runnable) new C2303z(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: c */
    public final void m10393c(String str, long j) {
        mo14218b();
        mo14221d();
        C0926p.m1308a(str);
        if (this.f8028b.isEmpty()) {
            this.f8029c = j;
        }
        Integer num = this.f8028b.get(str);
        if (num != null) {
            this.f8028b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f8028b.size() >= 100) {
            mo14235r().mo14833i().mo14841a("Too many ads visible");
        } else {
            this.f8028b.put(str, 1);
            this.f8027a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo14219b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo14235r().mo14830d_().mo14841a("Ad unit id must be a non-empty string");
        } else {
            mo14234q().mo14296a((Runnable) new C2171ba(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: d */
    public final void m10394d(String str, long j) {
        mo14218b();
        mo14221d();
        C0926p.m1308a(str);
        Integer num = this.f8028b.get(str);
        if (num != null) {
            C2212co x = mo14226i().mo14433x();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f8028b.remove(str);
                Long l = this.f8027a.get(str);
                if (l == null) {
                    mo14235r().mo14830d_().mo14841a("First ad unit exposure time was never set");
                } else {
                    this.f8027a.remove(str);
                    m10390a(str, j - l.longValue(), x);
                }
                if (!this.f8028b.isEmpty()) {
                    return;
                }
                if (this.f8029c == 0) {
                    mo14235r().mo14830d_().mo14841a("First ad exposure time was never set");
                    return;
                }
                m10387a(j - this.f8029c, x);
                this.f8029c = 0;
                return;
            }
            this.f8028b.put(str, Integer.valueOf(intValue));
            return;
        }
        mo14235r().mo14830d_().mo14842a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    /* renamed from: a */
    private final void m10387a(long j, C2212co coVar) {
        if (coVar == null) {
            mo14235r().mo14838x().mo14841a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo14235r().mo14838x().mo14842a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C2213cp.m10706a(coVar, bundle, true);
            mo14223f().mo14395a("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final void m10390a(String str, long j, C2212co coVar) {
        if (coVar == null) {
            mo14235r().mo14838x().mo14841a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo14235r().mo14838x().mo14842a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C2213cp.m10706a(coVar, bundle, true);
            mo14223f().mo14395a("am", "_xu", bundle);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14216a(long j) {
        C2212co x = mo14226i().mo14433x();
        for (String next : this.f8027a.keySet()) {
            m10390a(next, j - this.f8027a.get(next).longValue(), x);
        }
        if (!this.f8027a.isEmpty()) {
            m10387a(j - this.f8029c, x);
        }
        m10391b(j);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: b */
    public final void m10391b(long j) {
        for (String put : this.f8027a.keySet()) {
            this.f8027a.put(put, Long.valueOf(j));
        }
        if (!this.f8027a.isEmpty()) {
            this.f8029c = j;
        }
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
