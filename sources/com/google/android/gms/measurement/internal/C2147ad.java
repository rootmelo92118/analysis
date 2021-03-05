package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.ad */
final class C2147ad extends C2190bt {

    /* renamed from: a */
    static final Pair<String, Long> f8042a = new Pair<>("", 0L);

    /* renamed from: b */
    public C2151ah f8043b;

    /* renamed from: c */
    public final C2150ag f8044c = new C2150ag(this, "last_upload", 0);

    /* renamed from: d */
    public final C2150ag f8045d = new C2150ag(this, "last_upload_attempt", 0);

    /* renamed from: e */
    public final C2150ag f8046e = new C2150ag(this, "backoff", 0);

    /* renamed from: f */
    public final C2150ag f8047f = new C2150ag(this, "last_delete_stale", 0);

    /* renamed from: g */
    public final C2150ag f8048g = new C2150ag(this, "midnight_offset", 0);

    /* renamed from: h */
    public final C2150ag f8049h = new C2150ag(this, "first_open_time", 0);

    /* renamed from: i */
    public final C2150ag f8050i = new C2150ag(this, "app_install_time", 0);

    /* renamed from: j */
    public final C2152ai f8051j = new C2152ai(this, "app_instance_id", (String) null);

    /* renamed from: k */
    public final C2150ag f8052k = new C2150ag(this, "time_before_start", 10000);

    /* renamed from: l */
    public final C2150ag f8053l = new C2150ag(this, "session_timeout", 1800000);

    /* renamed from: m */
    public final C2149af f8054m = new C2149af(this, "start_new_session", true);

    /* renamed from: n */
    public final C2150ag f8055n = new C2150ag(this, "last_pause_time", 0);

    /* renamed from: o */
    public final C2150ag f8056o = new C2150ag(this, "time_active", 0);

    /* renamed from: p */
    public boolean f8057p;

    /* renamed from: r */
    private SharedPreferences f8058r;

    /* renamed from: s */
    private String f8059s;

    /* renamed from: t */
    private boolean f8060t;

    /* renamed from: u */
    private long f8061u;

    /* access modifiers changed from: package-private */
    @WorkerThread
    @NonNull
    /* renamed from: a */
    public final Pair<String, Boolean> mo14244a(String str) {
        mo14221d();
        long b = mo14230m().mo9997b();
        if (this.f8059s != null && b < this.f8061u) {
            return new Pair<>(this.f8059s, Boolean.valueOf(this.f8060t));
        }
        this.f8061u = b + mo14237t().mo14715a(str, C2284h.f8570j);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo14231n());
            if (advertisingIdInfo != null) {
                this.f8059s = advertisingIdInfo.getId();
                this.f8060t = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f8059s == null) {
                this.f8059s = "";
            }
        } catch (Exception e) {
            mo14235r().mo14837w().mo14842a("Unable to get advertising id", e);
            this.f8059s = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f8059s, Boolean.valueOf(this.f8060t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14253e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final String mo14247b(String str) {
        mo14221d();
        String str2 = (String) mo14244a(str).first;
        MessageDigest i = C2264el.m11038i();
        if (i == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, i.digest(str2.getBytes()))});
    }

    C2147ad(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: f */
    public final void mo14254f() {
        this.f8058r = mo14231n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8057p = this.f8058r.getBoolean("has_been_opened", false);
        if (!this.f8057p) {
            SharedPreferences.Editor edit = this.f8058r.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8043b = new C2151ah(this, "health_monitor", Math.max(0, C2284h.f8571k.mo14804b().longValue()));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: y */
    public final SharedPreferences m10423y() {
        mo14221d();
        mo14377A();
        return this.f8058r;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo14249c(String str) {
        mo14221d();
        SharedPreferences.Editor edit = m10423y().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public final String mo14255g() {
        mo14221d();
        return m10423y().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: d */
    public final void mo14251d(String str) {
        mo14221d();
        SharedPreferences.Editor edit = m10423y().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h */
    public final String mo14256h() {
        mo14221d();
        return m10423y().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i */
    public final Boolean mo14257i() {
        mo14221d();
        if (!m10423y().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m10423y().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14245a(boolean z) {
        mo14221d();
        mo14235r().mo14838x().mo14842a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m10423y().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j */
    public final void mo14258j() {
        mo14221d();
        mo14235r().mo14838x().mo14841a("Clearing collection preferences.");
        if (mo14237t().mo14717a(C2284h.f8552aq)) {
            Boolean k = mo14259k();
            SharedPreferences.Editor edit = m10423y().edit();
            edit.clear();
            edit.apply();
            if (k != null) {
                mo14248b(k.booleanValue());
                return;
            }
            return;
        }
        boolean contains = m10423y().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo14250c(true);
        }
        SharedPreferences.Editor edit2 = m10423y().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            mo14248b(z);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14248b(boolean z) {
        mo14221d();
        mo14235r().mo14838x().mo14842a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m10423y().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final boolean mo14250c(boolean z) {
        mo14221d();
        return m10423y().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final Boolean mo14259k() {
        mo14221d();
        if (m10423y().contains("measurement_enabled")) {
            return Boolean.valueOf(m10423y().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: v */
    public final String mo14260v() {
        mo14221d();
        String string = m10423y().getString("previous_os_version", (String) null);
        mo14229l().mo14377A();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m10423y().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: d */
    public final void mo14252d(boolean z) {
        mo14221d();
        mo14235r().mo14838x().mo14842a("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m10423y().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final boolean mo14261w() {
        mo14221d();
        return m10423y().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final boolean mo14262x() {
        return this.f8058r.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14246a(long j) {
        return j - this.f8053l.mo14265a() > this.f8055n.mo14265a();
    }
}
