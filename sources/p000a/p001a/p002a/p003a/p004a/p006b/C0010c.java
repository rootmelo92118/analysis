package p000a.p001a.p002a.p003a.p004a.p006b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0109c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0110d;

/* renamed from: a.a.a.a.a.b.c */
/* compiled from: AdvertisingInfoProvider */
class C0010c {

    /* renamed from: a */
    private final Context f10a;

    /* renamed from: b */
    private final C0109c f11b;

    public C0010c(Context context) {
        this.f10a = context.getApplicationContext();
        this.f11b = new C0110d(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: a */
    public C0009b mo26a() {
        C0009b b = mo27b();
        if (m17c(b)) {
            C0139c.m394g().mo281a("Fabric", "Using AdvertisingInfo from Preference Store");
            m14a(b);
            return b;
        }
        C0009b e = m18e();
        m16b(e);
        return e;
    }

    /* renamed from: a */
    private void m14a(final C0009b bVar) {
        new Thread(new C0019h() {
            public void onRun() {
                C0009b a = C0010c.this.m18e();
                if (!bVar.equals(a)) {
                    C0139c.m394g().mo281a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    C0010c.this.m16b(a);
                }
            }
        }).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public void m16b(C0009b bVar) {
        if (m17c(bVar)) {
            this.f11b.mo257a(this.f11b.mo258b().putString("advertising_id", bVar.f8a).putBoolean("limit_ad_tracking_enabled", bVar.f9b));
        } else {
            this.f11b.mo257a(this.f11b.mo258b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0009b mo27b() {
        return new C0009b(this.f11b.mo256a().getString("advertising_id", ""), this.f11b.mo256a().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: c */
    public C0017f mo28c() {
        return new C0012d(this.f10a);
    }

    /* renamed from: d */
    public C0017f mo29d() {
        return new C0013e(this.f10a);
    }

    /* renamed from: c */
    private boolean m17c(C0009b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.f8a);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C0009b m18e() {
        C0009b a = mo28c().mo31a();
        if (!m17c(a)) {
            a = mo29d().mo31a();
            if (!m17c(a)) {
                C0139c.m394g().mo281a("Fabric", "AdvertisingInfo not present");
            } else {
                C0139c.m394g().mo281a("Fabric", "Using AdvertisingInfo from Service Provider");
            }
        } else {
            C0139c.m394g().mo281a("Fabric", "Using AdvertisingInfo from Reflection Provider");
        }
        return a;
    }
}
