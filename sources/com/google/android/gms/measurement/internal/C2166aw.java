package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C0819c;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0972h;
import com.google.android.gms.internal.measurement.C1941cg;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.aw */
public class C2166aw implements C2191bu {

    /* renamed from: a */
    private static volatile C2166aw f8124a;

    /* renamed from: A */
    private long f8125A;

    /* renamed from: B */
    private volatile Boolean f8126B;

    /* renamed from: C */
    private Boolean f8127C;

    /* renamed from: D */
    private Boolean f8128D;

    /* renamed from: E */
    private int f8129E;

    /* renamed from: F */
    private AtomicInteger f8130F = new AtomicInteger(0);

    /* renamed from: G */
    private final long f8131G;

    /* renamed from: b */
    private final Context f8132b;

    /* renamed from: c */
    private final String f8133c;

    /* renamed from: d */
    private final String f8134d;

    /* renamed from: e */
    private final String f8135e;

    /* renamed from: f */
    private final boolean f8136f;

    /* renamed from: g */
    private final C2270er f8137g;

    /* renamed from: h */
    private final C2272et f8138h;

    /* renamed from: i */
    private final C2147ad f8139i;

    /* renamed from: j */
    private final C2295r f8140j;

    /* renamed from: k */
    private final C2161ar f8141k;

    /* renamed from: l */
    private final C2242dr f8142l;

    /* renamed from: m */
    private final AppMeasurement f8143m;

    /* renamed from: n */
    private final C2264el f8144n;

    /* renamed from: o */
    private final C2293p f8145o;

    /* renamed from: p */
    private final C0969e f8146p;

    /* renamed from: q */
    private final C2213cp f8147q;

    /* renamed from: r */
    private final C2200cc f8148r;

    /* renamed from: s */
    private final C2143a f8149s;

    /* renamed from: t */
    private C2291n f8150t;

    /* renamed from: u */
    private C2217ct f8151u;

    /* renamed from: v */
    private C2170b f8152v;

    /* renamed from: w */
    private C2289l f8153w;

    /* renamed from: x */
    private C2153aj f8154x;

    /* renamed from: y */
    private boolean f8155y = false;

    /* renamed from: z */
    private Boolean f8156z;

    private C2166aw(C2198ca caVar) {
        C0926p.m1306a(caVar);
        this.f8137g = new C2270er(caVar.f8236a);
        C2284h.m11279a(this.f8137g);
        this.f8132b = caVar.f8236a;
        this.f8133c = caVar.f8237b;
        this.f8134d = caVar.f8238c;
        this.f8135e = caVar.f8239d;
        this.f8136f = caVar.f8240e;
        this.f8126B = caVar.f8241f;
        C2290m mVar = caVar.f8242g;
        if (!(mVar == null || mVar.f8608g == null)) {
            Object obj = mVar.f8608g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f8127C = (Boolean) obj;
            }
            Object obj2 = mVar.f8608g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f8128D = (Boolean) obj2;
            }
        }
        C1941cg.m9024a(this.f8132b);
        this.f8146p = C0972h.m1482d();
        this.f8131G = this.f8146p.mo9996a();
        this.f8138h = new C2272et(this);
        C2147ad adVar = new C2147ad(this);
        adVar.mo14378B();
        this.f8139i = adVar;
        C2295r rVar = new C2295r(this);
        rVar.mo14378B();
        this.f8140j = rVar;
        C2264el elVar = new C2264el(this);
        elVar.mo14378B();
        this.f8144n = elVar;
        C2293p pVar = new C2293p(this);
        pVar.mo14378B();
        this.f8145o = pVar;
        this.f8149s = new C2143a(this);
        C2213cp cpVar = new C2213cp(this);
        cpVar.mo14487F();
        this.f8147q = cpVar;
        C2200cc ccVar = new C2200cc(this);
        ccVar.mo14487F();
        this.f8148r = ccVar;
        this.f8143m = new AppMeasurement(this);
        C2242dr drVar = new C2242dr(this);
        drVar.mo14487F();
        this.f8142l = drVar;
        C2161ar arVar = new C2161ar(this);
        arVar.mo14378B();
        this.f8141k = arVar;
        C2270er erVar = this.f8137g;
        if (this.f8132b.getApplicationContext() instanceof Application) {
            C2200cc h = mo14323h();
            if (h.mo14231n().getApplicationContext() instanceof Application) {
                Application application = (Application) h.mo14231n().getApplicationContext();
                if (h.f8245a == null) {
                    h.f8245a = new C2209cl(h, (C2201cd) null);
                }
                application.unregisterActivityLifecycleCallbacks(h.f8245a);
                application.registerActivityLifecycleCallbacks(h.f8245a);
                h.mo14235r().mo14838x().mo14841a("Registered activity lifecycle callback");
            }
        } else {
            mo14235r().mo14833i().mo14841a("Application context is not an Application");
        }
        this.f8141k.mo14296a((Runnable) new C2167ax(this, caVar));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public final void m10530a(C2198ca caVar) {
        String str;
        C2297t tVar;
        mo14234q().mo14221d();
        C2272et.m11152e();
        C2170b bVar = new C2170b(this);
        bVar.mo14378B();
        this.f8152v = bVar;
        C2289l lVar = new C2289l(this);
        lVar.mo14487F();
        this.f8153w = lVar;
        C2291n nVar = new C2291n(this);
        nVar.mo14487F();
        this.f8150t = nVar;
        C2217ct ctVar = new C2217ct(this);
        ctVar.mo14487F();
        this.f8151u = ctVar;
        this.f8144n.mo14379C();
        this.f8139i.mo14379C();
        this.f8154x = new C2153aj(this);
        this.f8153w.mo14488G();
        mo14235r().mo14836v().mo14842a("App measurement is starting up, version", Long.valueOf(this.f8138h.mo14725f()));
        C2270er erVar = this.f8137g;
        mo14235r().mo14836v().mo14841a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        C2270er erVar2 = this.f8137g;
        String x = lVar.mo14808x();
        if (TextUtils.isEmpty(this.f8133c)) {
            if (mo14325j().mo14580f(x)) {
                tVar = mo14235r().mo14836v();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                tVar = mo14235r().mo14836v();
                String valueOf = String.valueOf(x);
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
            }
            tVar.mo14841a(str);
        }
        mo14235r().mo14837w().mo14841a("Debug-level message logging enabled");
        if (this.f8129E != this.f8130F.get()) {
            mo14235r().mo14830d_().mo14843a("Not all components initialized", Integer.valueOf(this.f8129E), Integer.valueOf(this.f8130F.get()));
        }
        this.f8155y = true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14313a() {
        mo14234q().mo14221d();
        if (mo14318c().f8044c.mo14265a() == 0) {
            mo14318c().f8044c.mo14266a(this.f8146p.mo9996a());
        }
        if (Long.valueOf(mo14318c().f8049h.mo14265a()).longValue() == 0) {
            mo14235r().mo14838x().mo14842a("Persisting first open", Long.valueOf(this.f8131G));
            mo14318c().f8049h.mo14266a(this.f8131G);
        }
        if (mo14312H()) {
            C2270er erVar = this.f8137g;
            if (!TextUtils.isEmpty(mo14336z().mo14809y()) || !TextUtils.isEmpty(mo14336z().mo14810z())) {
                mo14325j();
                if (C2264el.m11027a(mo14336z().mo14809y(), mo14318c().mo14255g(), mo14336z().mo14810z(), mo14318c().mo14256h())) {
                    mo14235r().mo14836v().mo14841a("Rechecking which service to use due to a GMP App Id change");
                    mo14318c().mo14258j();
                    mo14327l().mo14815x();
                    this.f8151u.mo14439C();
                    this.f8151u.mo14437A();
                    mo14318c().f8049h.mo14266a(this.f8131G);
                    mo14318c().f8051j.mo14270a((String) null);
                }
                mo14318c().mo14249c(mo14336z().mo14809y());
                mo14318c().mo14251d(mo14336z().mo14810z());
                if (this.f8138h.mo14741r(mo14336z().mo14808x())) {
                    this.f8142l.mo14492a(this.f8131G);
                }
            }
            mo14323h().mo14393a(mo14318c().f8051j.mo14269a());
            C2270er erVar2 = this.f8137g;
            if (!TextUtils.isEmpty(mo14336z().mo14809y()) || !TextUtils.isEmpty(mo14336z().mo14810z())) {
                boolean C = mo14307C();
                if (!mo14318c().mo14262x() && !this.f8138h.mo14729h()) {
                    mo14318c().mo14252d(!C);
                }
                if (!this.f8138h.mo14733j(mo14336z().mo14808x()) || C) {
                    mo14323h().mo14408y();
                }
                mo14334x().mo14446a((AtomicReference<String>) new AtomicReference());
            }
        } else if (mo14307C()) {
            if (!mo14325j().mo14579d("android.permission.INTERNET")) {
                mo14235r().mo14830d_().mo14841a("App is missing INTERNET permission");
            }
            if (!mo14325j().mo14579d("android.permission.ACCESS_NETWORK_STATE")) {
                mo14235r().mo14830d_().mo14841a("App is missing ACCESS_NETWORK_STATE permission");
            }
            C2270er erVar3 = this.f8137g;
            if (!C0771c.m904a(this.f8132b).mo9537a() && !this.f8138h.mo14745x()) {
                if (!C2156am.m10457a(this.f8132b)) {
                    mo14235r().mo14830d_().mo14841a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C2264el.m11022a(this.f8132b, false)) {
                    mo14235r().mo14830d_().mo14841a("AppMeasurementService not registered/enabled");
                }
            }
            mo14235r().mo14830d_().mo14841a("Uploading is not possible. App measurement disabled");
        }
    }

    /* renamed from: u */
    public final C2270er mo14238u() {
        return this.f8137g;
    }

    /* renamed from: b */
    public final C2272et mo14317b() {
        return this.f8138h;
    }

    /* renamed from: c */
    public final C2147ad mo14318c() {
        m10529a((C2189bs) this.f8139i);
        return this.f8139i;
    }

    /* renamed from: r */
    public final C2295r mo14235r() {
        m10531b((C2190bt) this.f8140j);
        return this.f8140j;
    }

    /* renamed from: d */
    public final C2295r mo14319d() {
        if (this.f8140j == null || !this.f8140j.mo14380z()) {
            return null;
        }
        return this.f8140j;
    }

    /* renamed from: q */
    public final C2161ar mo14234q() {
        m10531b((C2190bt) this.f8141k);
        return this.f8141k;
    }

    /* renamed from: e */
    public final C2242dr mo14320e() {
        m10532b((C2238dn) this.f8142l);
        return this.f8142l;
    }

    /* renamed from: f */
    public final C2153aj mo14321f() {
        return this.f8154x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C2161ar mo14322g() {
        return this.f8141k;
    }

    /* renamed from: h */
    public final C2200cc mo14323h() {
        m10532b((C2238dn) this.f8148r);
        return this.f8148r;
    }

    /* renamed from: i */
    public final AppMeasurement mo14324i() {
        return this.f8143m;
    }

    /* renamed from: j */
    public final C2264el mo14325j() {
        m10529a((C2189bs) this.f8144n);
        return this.f8144n;
    }

    /* renamed from: k */
    public final C2293p mo14326k() {
        m10529a((C2189bs) this.f8145o);
        return this.f8145o;
    }

    /* renamed from: l */
    public final C2291n mo14327l() {
        m10532b((C2238dn) this.f8150t);
        return this.f8150t;
    }

    /* renamed from: n */
    public final Context mo14231n() {
        return this.f8132b;
    }

    /* renamed from: o */
    public final boolean mo14328o() {
        return TextUtils.isEmpty(this.f8133c);
    }

    /* renamed from: p */
    public final String mo14329p() {
        return this.f8133c;
    }

    /* renamed from: s */
    public final String mo14330s() {
        return this.f8134d;
    }

    /* renamed from: t */
    public final String mo14331t() {
        return this.f8135e;
    }

    /* renamed from: v */
    public final boolean mo14332v() {
        return this.f8136f;
    }

    /* renamed from: m */
    public final C0969e mo14230m() {
        return this.f8146p;
    }

    /* renamed from: w */
    public final C2213cp mo14333w() {
        m10532b((C2238dn) this.f8147q);
        return this.f8147q;
    }

    /* renamed from: x */
    public final C2217ct mo14334x() {
        m10532b((C2238dn) this.f8151u);
        return this.f8151u;
    }

    /* renamed from: y */
    public final C2170b mo14335y() {
        m10531b((C2190bt) this.f8152v);
        return this.f8152v;
    }

    /* renamed from: z */
    public final C2289l mo14336z() {
        m10532b((C2238dn) this.f8153w);
        return this.f8153w;
    }

    /* renamed from: A */
    public final C2143a mo14305A() {
        if (this.f8149s != null) {
            return this.f8149s;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static C2166aw m10527a(Context context, C2290m mVar) {
        if (mVar != null && (mVar.f8606e == null || mVar.f8607f == null)) {
            mVar = new C2290m(mVar.f8602a, mVar.f8603b, mVar.f8604c, mVar.f8605d, (String) null, (String) null, mVar.f8608g);
        }
        C0926p.m1306a(context);
        C0926p.m1306a(context.getApplicationContext());
        if (f8124a == null) {
            synchronized (C2166aw.class) {
                if (f8124a == null) {
                    f8124a = new C2166aw(new C2198ca(context, mVar));
                }
            }
        } else if (!(mVar == null || mVar.f8608g == null || !mVar.f8608g.containsKey("dataCollectionDefaultEnabled"))) {
            f8124a.mo14316a(mVar.f8608g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f8124a;
    }

    /* renamed from: I */
    private final void m10526I() {
        if (!this.f8155y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: b */
    private static void m10531b(C2190bt btVar) {
        if (btVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!btVar.mo14380z()) {
            String valueOf = String.valueOf(btVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m10532b(C2238dn dnVar) {
        if (dnVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!dnVar.mo14485D()) {
            String valueOf = String.valueOf(dnVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m10529a(C2189bs bsVar) {
        if (bsVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14316a(boolean z) {
        this.f8126B = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: B */
    public final boolean mo14306B() {
        return this.f8126B != null && this.f8126B.booleanValue();
    }

    @WorkerThread
    /* renamed from: C */
    public final boolean mo14307C() {
        boolean z;
        mo14234q().mo14221d();
        m10526I();
        if (this.f8138h.mo14717a(C2284h.f8552aq)) {
            if (this.f8138h.mo14729h()) {
                return false;
            }
            if (this.f8128D != null && this.f8128D.booleanValue()) {
                return false;
            }
            Boolean k = mo14318c().mo14259k();
            if (k != null) {
                return k.booleanValue();
            }
            Boolean i = this.f8138h.mo14731i();
            if (i != null) {
                return i.booleanValue();
            }
            if (this.f8127C != null) {
                return this.f8127C.booleanValue();
            }
            if (C0819c.m1058b()) {
                return false;
            }
            if (!this.f8138h.mo14717a(C2284h.f8548am) || this.f8126B == null) {
                return true;
            }
            return this.f8126B.booleanValue();
        } else if (this.f8138h.mo14729h()) {
            return false;
        } else {
            Boolean i2 = this.f8138h.mo14731i();
            if (i2 != null) {
                z = i2.booleanValue();
            } else {
                z = !C0819c.m1058b();
                if (z && this.f8126B != null && C2284h.f8548am.mo14804b().booleanValue()) {
                    z = this.f8126B.booleanValue();
                }
            }
            return mo14318c().mo14250c(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final long mo14308D() {
        Long valueOf = Long.valueOf(mo14318c().f8049h.mo14265a());
        if (valueOf.longValue() == 0) {
            return this.f8131G;
        }
        return Math.min(this.f8131G, valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo14309E() {
        C2270er erVar = this.f8137g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo14310F() {
        C2270er erVar = this.f8137g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14314a(C2190bt btVar) {
        this.f8129E++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14315a(C2238dn dnVar) {
        this.f8129E++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo14311G() {
        this.f8130F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: H */
    public final boolean mo14312H() {
        m10526I();
        mo14234q().mo14221d();
        if (this.f8156z == null || this.f8125A == 0 || (this.f8156z != null && !this.f8156z.booleanValue() && Math.abs(this.f8146p.mo9997b() - this.f8125A) > 1000)) {
            this.f8125A = this.f8146p.mo9997b();
            C2270er erVar = this.f8137g;
            boolean z = true;
            this.f8156z = Boolean.valueOf(mo14325j().mo14579d("android.permission.INTERNET") && mo14325j().mo14579d("android.permission.ACCESS_NETWORK_STATE") && (C0771c.m904a(this.f8132b).mo9537a() || this.f8138h.mo14745x() || (C2156am.m10457a(this.f8132b) && C2264el.m11022a(this.f8132b, false))));
            if (this.f8156z.booleanValue()) {
                if (!mo14325j().mo14576b(mo14336z().mo14809y(), mo14336z().mo14810z()) && TextUtils.isEmpty(mo14336z().mo14810z())) {
                    z = false;
                }
                this.f8156z = Boolean.valueOf(z);
            }
        }
        return this.f8156z.booleanValue();
    }
}
