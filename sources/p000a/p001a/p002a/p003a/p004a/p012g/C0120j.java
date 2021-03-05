package p000a.p001a.p002a.p003a.p004a.p012g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;
import p000a.p001a.p002a.p003a.p004a.p006b.C0035q;
import p000a.p001a.p002a.p003a.p004a.p011f.C0109c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0110d;

/* renamed from: a.a.a.a.a.g.j */
/* compiled from: DefaultSettingsController */
class C0120j implements C0131s {

    /* renamed from: a */
    private final C0135w f240a;

    /* renamed from: b */
    private final C0134v f241b;

    /* renamed from: c */
    private final C0026k f242c;

    /* renamed from: d */
    private final C0117g f243d;

    /* renamed from: e */
    private final C0136x f244e;

    /* renamed from: f */
    private final C0150i f245f;

    /* renamed from: g */
    private final C0109c f246g = new C0110d(this.f245f);

    public C0120j(C0150i iVar, C0135w wVar, C0026k kVar, C0134v vVar, C0117g gVar, C0136x xVar) {
        this.f245f = iVar;
        this.f240a = wVar;
        this.f242c = kVar;
        this.f241b = vVar;
        this.f243d = gVar;
        this.f244e = xVar;
    }

    /* renamed from: a */
    public C0132t mo264a() {
        return mo265a(C0130r.USE_CACHE);
    }

    /* renamed from: a */
    public C0132t mo265a(C0130r rVar) {
        JSONObject a;
        C0132t tVar = null;
        if (!new C0035q().mo62f(this.f245f.getContext())) {
            C0139c.m394g().mo281a("Fabric", "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C0139c.m395h() && !mo269d()) {
                tVar = m333b(rVar);
            }
            if (tVar == null && (a = this.f244e.mo272a(this.f240a)) != null) {
                C0132t a2 = this.f241b.mo270a(this.f242c, a);
                try {
                    this.f243d.mo263a(a2.f285g, a);
                    m332a(a, "Loaded settings: ");
                    mo266a(mo267b());
                    tVar = a2;
                } catch (Exception e) {
                    e = e;
                    tVar = a2;
                    C0139c.m394g().mo291e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
                    return tVar;
                }
            }
            if (tVar == null) {
                return m333b(C0130r.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            e = e2;
            C0139c.m394g().mo291e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
            return tVar;
        }
        return tVar;
    }

    /* renamed from: b */
    private C0132t m333b(C0130r rVar) {
        C0132t tVar = null;
        try {
            if (C0130r.SKIP_CACHE_LOOKUP.equals(rVar)) {
                return null;
            }
            JSONObject a = this.f243d.mo262a();
            if (a != null) {
                C0132t a2 = this.f241b.mo270a(this.f242c, a);
                if (a2 != null) {
                    m332a(a, "Loaded cached settings: ");
                    long a3 = this.f242c.mo50a();
                    if (!C0130r.IGNORE_CACHE_EXPIRATION.equals(rVar)) {
                        if (a2.mo278a(a3)) {
                            C0139c.m394g().mo281a("Fabric", "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C0139c.m394g().mo281a("Fabric", "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        tVar = a2;
                        C0139c.m394g().mo291e("Fabric", "Failed to get cached settings", e);
                        return tVar;
                    }
                } else {
                    C0139c.m394g().mo291e("Fabric", "Failed to transform cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C0139c.m394g().mo281a("Fabric", "No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C0139c.m394g().mo291e("Fabric", "Failed to get cached settings", e);
            return tVar;
        }
    }

    /* renamed from: a */
    private void m332a(JSONObject jSONObject, String str) {
        C0153l g = C0139c.m394g();
        g.mo281a("Fabric", str + jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo267b() {
        return C0020i.m53a(C0020i.m82m(this.f245f.getContext()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo268c() {
        return this.f246g.mo256a().getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo266a(String str) {
        SharedPreferences.Editor b = this.f246g.mo258b();
        b.putString("existing_instance_identifier", str);
        return this.f246g.mo257a(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo269d() {
        return !mo268c().equals(mo267b());
    }
}
