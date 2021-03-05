package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0981q;
import com.google.android.gms.measurement.internal.C2284h;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.et */
public final class C2272et extends C2189bs {

    /* renamed from: a */
    private Boolean f8484a;
    @NonNull

    /* renamed from: b */
    private C2274ev f8485b = C2273eu.f8487a;

    /* renamed from: c */
    private Boolean f8486c;

    C2272et(C2166aw awVar) {
        super(awVar);
        C2284h.m11278a(awVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14716a(@NonNull C2274ev evVar) {
        this.f8485b = evVar;
    }

    /* renamed from: e */
    static String m11152e() {
        return C2284h.f8569i.mo14804b();
    }

    @WorkerThread
    /* renamed from: a */
    public final int mo14714a(@Size(min = 1) String str) {
        return mo14718b(str, C2284h.f8583w);
    }

    /* renamed from: f */
    public final long mo14725f() {
        mo14238u();
        return 14710;
    }

    /* renamed from: g */
    public final boolean mo14727g() {
        if (this.f8486c == null) {
            synchronized (this) {
                if (this.f8486c == null) {
                    ApplicationInfo applicationInfo = mo14231n().getApplicationInfo();
                    String a = C0981q.m1513a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f8486c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f8486c == null) {
                        this.f8486c = Boolean.TRUE;
                        mo14235r().mo14830d_().mo14841a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f8486c.booleanValue();
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo14715a(String str, @NonNull C2284h.C2285a<Long> aVar) {
        if (str == null) {
            return aVar.mo14804b().longValue();
        }
        String a = this.f8485b.mo14280a(str, aVar.mo14803a());
        if (TextUtils.isEmpty(a)) {
            return aVar.mo14804b().longValue();
        }
        try {
            return aVar.mo14802a(Long.valueOf(Long.parseLong(a))).longValue();
        } catch (NumberFormatException unused) {
            return aVar.mo14804b().longValue();
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final int mo14718b(String str, @NonNull C2284h.C2285a<Integer> aVar) {
        if (str == null) {
            return aVar.mo14804b().intValue();
        }
        String a = this.f8485b.mo14280a(str, aVar.mo14803a());
        if (TextUtils.isEmpty(a)) {
            return aVar.mo14804b().intValue();
        }
        try {
            return aVar.mo14802a(Integer.valueOf(Integer.parseInt(a))).intValue();
        } catch (NumberFormatException unused) {
            return aVar.mo14804b().intValue();
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final boolean mo14721c(String str, @NonNull C2284h.C2285a<Boolean> aVar) {
        if (str == null) {
            return aVar.mo14804b().booleanValue();
        }
        String a = this.f8485b.mo14280a(str, aVar.mo14803a());
        if (TextUtils.isEmpty(a)) {
            return aVar.mo14804b().booleanValue();
        }
        return aVar.mo14802a(Boolean.valueOf(Boolean.parseBoolean(a))).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo14723d(String str, C2284h.C2285a<Boolean> aVar) {
        return mo14721c(str, aVar);
    }

    /* renamed from: a */
    public final boolean mo14717a(C2284h.C2285a<Boolean> aVar) {
        return mo14721c((String) null, aVar);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final Boolean mo14719b(@Size(min = 1) String str) {
        C0926p.m1308a(str);
        try {
            if (mo14231n().getPackageManager() == null) {
                mo14235r().mo14830d_().mo14841a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C0771c.m904a(mo14231n()).mo9535a(mo14231n().getPackageName(), 128);
            if (a == null) {
                mo14235r().mo14830d_().mo14841a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo14235r().mo14830d_().mo14841a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo14235r().mo14830d_().mo14842a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo14729h() {
        mo14238u();
        Boolean b = mo14719b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: i */
    public final Boolean mo14731i() {
        mo14238u();
        return mo14719b("firebase_analytics_collection_enabled");
    }

    /* renamed from: j */
    public static long m11153j() {
        return C2284h.f8519L.mo14804b().longValue();
    }

    /* renamed from: k */
    public static long m11154k() {
        return C2284h.f8572l.mo14804b().longValue();
    }

    /* renamed from: v */
    public final String mo14744v() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo14235r().mo14830d_().mo14842a("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            mo14235r().mo14830d_().mo14842a("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            mo14235r().mo14830d_().mo14842a("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo14235r().mo14830d_().mo14842a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: w */
    public static boolean m11155w() {
        return C2284h.f8568h.mo14804b().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14720c(String str) {
        return "1".equals(this.f8485b.mo14280a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final boolean mo14722d(String str) {
        return "1".equals(this.f8485b.mo14280a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: e */
    public final boolean mo14724e(String str) {
        return mo14721c(str, C2284h.f8529V);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: f */
    public final boolean mo14726f(String str) {
        return mo14721c(str, C2284h.f8531X);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public final boolean mo14728g(String str) {
        return mo14721c(str, C2284h.f8532Y);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h */
    public final boolean mo14730h(String str) {
        return mo14721c(str, C2284h.f8523P);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo14732i(String str) {
        return mo14721c(str, C2284h.f8533Z);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j */
    public final boolean mo14733j(String str) {
        return mo14721c(str, C2284h.f8536aa);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo14734k(String str) {
        return mo14721c(str, C2284h.f8538ac);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: l */
    public final boolean mo14735l(String str) {
        return mo14721c(str, C2284h.f8539ad);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: m */
    public final boolean mo14736m(String str) {
        return mo14721c(str, C2284h.f8540ae);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final boolean mo14737n(String str) {
        return mo14721c(str, C2284h.f8542ag);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final boolean mo14745x() {
        if (this.f8484a == null) {
            this.f8484a = mo14719b("app_measurement_lite");
            if (this.f8484a == null) {
                this.f8484a = false;
            }
        }
        if (this.f8484a.booleanValue() || !this.f8222q.mo14332v()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final boolean mo14738o(String str) {
        return mo14721c(str, C2284h.f8541af);
    }

    @WorkerThread
    /* renamed from: y */
    static boolean m11156y() {
        return C2284h.f8543ah.mo14804b().booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final boolean mo14739p(String str) {
        return mo14721c(str, C2284h.f8544ai);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final boolean mo14740q(String str) {
        return mo14721c(str, C2284h.f8545aj);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final boolean mo14741r(String str) {
        return mo14721c(str, C2284h.f8546ak);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final boolean mo14742s(String str) {
        return mo14721c(str, C2284h.f8547al);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final boolean mo14743t(String str) {
        return mo14721c(str, C2284h.f8549an);
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
