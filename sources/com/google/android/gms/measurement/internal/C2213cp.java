package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.cp */
public final class C2213cp extends C2238dn {

    /* renamed from: a */
    protected C2212co f8289a;

    /* renamed from: b */
    private volatile C2212co f8290b;

    /* renamed from: c */
    private C2212co f8291c;

    /* renamed from: d */
    private final Map<Activity, C2212co> f8292d = new ArrayMap();

    /* renamed from: e */
    private C2212co f8293e;

    /* renamed from: f */
    private String f8294f;

    public C2213cp(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return false;
    }

    @WorkerThread
    /* renamed from: x */
    public final C2212co mo14433x() {
        mo14486E();
        mo14221d();
        return this.f8289a;
    }

    /* renamed from: a */
    public final void mo14428a(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        if (this.f8290b == null) {
            mo14235r().mo14833i().mo14841a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f8292d.get(activity) == null) {
            mo14235r().mo14833i().mo14841a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m10704a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f8290b.f8286b.equals(str2);
            boolean c = C2264el.m11033c(this.f8290b.f8285a, str);
            if (equals && c) {
                mo14235r().mo14835k().mo14841a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo14235r().mo14833i().mo14842a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo14235r().mo14838x().mo14843a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C2212co coVar = new C2212co(str, str2, mo14233p().mo14581g());
                this.f8292d.put(activity, coVar);
                m10705a(activity, coVar, true);
            } else {
                mo14235r().mo14833i().mo14842a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: y */
    public final C2212co mo14434y() {
        mo14218b();
        return this.f8290b;
    }

    @MainThread
    /* renamed from: a */
    private final void m10705a(Activity activity, C2212co coVar, boolean z) {
        C2212co coVar2 = this.f8290b == null ? this.f8291c : this.f8290b;
        if (coVar.f8286b == null) {
            coVar = new C2212co(coVar.f8285a, m10704a(activity.getClass().getCanonicalName()), coVar.f8287c);
        }
        this.f8291c = this.f8290b;
        this.f8290b = coVar;
        mo14234q().mo14296a((Runnable) new C2214cq(this, z, coVar2, coVar));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public final void m10707a(@NonNull C2212co coVar, boolean z) {
        mo14222e().mo14216a(mo14230m().mo9997b());
        if (mo14228k().mo14494a(coVar.f8288d, z)) {
            coVar.f8288d = false;
        }
    }

    /* renamed from: a */
    public static void m10706a(C2212co coVar, Bundle bundle, boolean z) {
        if (bundle != null && coVar != null && (!bundle.containsKey("_sc") || z)) {
            if (coVar.f8285a != null) {
                bundle.putString("_sn", coVar.f8285a);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", coVar.f8286b);
            bundle.putLong("_si", coVar.f8287c);
        } else if (bundle != null && coVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14429a(String str, C2212co coVar) {
        mo14221d();
        synchronized (this) {
            if (this.f8294f == null || this.f8294f.equals(str) || coVar != null) {
                this.f8294f = str;
                this.f8293e = coVar;
            }
        }
    }

    /* renamed from: a */
    private static String m10704a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    @MainThread
    /* renamed from: d */
    private final C2212co m10709d(@NonNull Activity activity) {
        C0926p.m1306a(activity);
        C2212co coVar = this.f8292d.get(activity);
        if (coVar != null) {
            return coVar;
        }
        C2212co coVar2 = new C2212co((String) null, m10704a(activity.getClass().getCanonicalName()), mo14233p().mo14581g());
        this.f8292d.put(activity, coVar2);
        return coVar2;
    }

    @MainThread
    /* renamed from: a */
    public final void mo14427a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f8292d.put(activity, new C2212co(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @MainThread
    /* renamed from: a */
    public final void mo14426a(Activity activity) {
        m10705a(activity, m10709d(activity), false);
        C2143a e = mo14222e();
        e.mo14234q().mo14296a((Runnable) new C2199cb(e, e.mo14230m().mo9997b()));
    }

    @MainThread
    /* renamed from: b */
    public final void mo14430b(Activity activity) {
        C2212co d = m10709d(activity);
        this.f8291c = this.f8290b;
        this.f8290b = null;
        mo14234q().mo14296a((Runnable) new C2216cs(this, d));
    }

    @MainThread
    /* renamed from: b */
    public final void mo14431b(Activity activity, Bundle bundle) {
        C2212co coVar;
        if (bundle != null && (coVar = this.f8292d.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", coVar.f8287c);
            bundle2.putString("name", coVar.f8285a);
            bundle2.putString("referrer_name", coVar.f8286b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @MainThread
    /* renamed from: c */
    public final void mo14432c(Activity activity) {
        this.f8292d.remove(activity);
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
