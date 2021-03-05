package p000a.p001a.p002a.p003a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p000a.p001a.p002a.p003a.p004a.p006b.C0018g;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p010e.C0091b;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0114d;
import p000a.p001a.p002a.p003a.p004a.p012g.C0115e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0118h;
import p000a.p001a.p002a.p003a.p004a.p012g.C0124n;
import p000a.p001a.p002a.p003a.p004a.p012g.C0127q;
import p000a.p001a.p002a.p003a.p004a.p012g.C0132t;
import p000a.p001a.p002a.p003a.p004a.p012g.C0137y;

/* renamed from: a.a.a.a.m */
/* compiled from: Onboarding */
class C0154m extends C0150i<Boolean> {

    /* renamed from: a */
    private final C0102e f335a = new C0091b();

    /* renamed from: b */
    private PackageManager f336b;

    /* renamed from: c */
    private String f337c;

    /* renamed from: d */
    private PackageInfo f338d;

    /* renamed from: e */
    private String f339e;

    /* renamed from: f */
    private String f340f;

    /* renamed from: g */
    private String f341g;

    /* renamed from: h */
    private String f342h;

    /* renamed from: i */
    private String f343i;

    /* renamed from: j */
    private final Future<Map<String, C0152k>> f344j;

    /* renamed from: k */
    private final Collection<C0150i> f345k;

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.7.30";
    }

    public C0154m(Future<Map<String, C0152k>> future, Collection<C0150i> collection) {
        this.f344j = future;
        this.f345k = collection;
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        try {
            this.f341g = getIdManager().mo71i();
            this.f336b = getContext().getPackageManager();
            this.f337c = getContext().getPackageName();
            this.f338d = this.f336b.getPackageInfo(this.f337c, 0);
            this.f339e = Integer.toString(this.f338d.versionCode);
            this.f340f = this.f338d.versionName == null ? "0.0" : this.f338d.versionName;
            this.f342h = this.f336b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f343i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C0139c.m394g().mo291e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground() {
        boolean z;
        Map map;
        String k = C0020i.m80k(getContext());
        C0132t c = m444c();
        if (c != null) {
            try {
                if (this.f344j != null) {
                    map = this.f344j.get();
                } else {
                    map = new HashMap();
                }
                z = m442a(k, c.f279a, mo340a((Map<String, C0152k>) map, this.f345k).values());
            } catch (Exception e) {
                C0139c.m394g().mo291e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    private C0132t m444c() {
        try {
            C0127q.m357a().mo274a(this, this.idManager, this.f335a, this.f339e, this.f340f, mo341b()).mo276c();
            return C0127q.m357a().mo275b();
        } catch (Exception e) {
            C0139c.m394g().mo291e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C0152k> mo340a(Map<String, C0152k> map, Collection<C0150i> collection) {
        for (C0150i next : collection) {
            if (!map.containsKey(next.getIdentifier())) {
                map.put(next.getIdentifier(), new C0152k(next.getIdentifier(), next.getVersion(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: a */
    private boolean m442a(String str, C0115e eVar, Collection<C0152k> collection) {
        if ("new".equals(eVar.f231b)) {
            if (m443b(str, eVar, collection)) {
                return C0127q.m357a().mo277d();
            }
            C0139c.m394g().mo291e("Fabric", "Failed to create app with Crashlytics service.", (Throwable) null);
            return false;
        } else if ("configured".equals(eVar.f231b)) {
            return C0127q.m357a().mo277d();
        } else {
            if (eVar.f235f) {
                C0139c.m394g().mo281a("Fabric", "Server says an update is required - forcing a full App update.");
                m445c(str, eVar, collection);
            }
            return true;
        }
    }

    /* renamed from: b */
    private boolean m443b(String str, C0115e eVar, Collection<C0152k> collection) {
        return new C0118h(this, mo341b(), eVar.f232c, this.f335a).mo260a(m440a(C0124n.m356a(getContext(), str), collection));
    }

    /* renamed from: c */
    private boolean m445c(String str, C0115e eVar, Collection<C0152k> collection) {
        return m441a(eVar, C0124n.m356a(getContext(), str), collection);
    }

    /* renamed from: a */
    private boolean m441a(C0115e eVar, C0124n nVar, Collection<C0152k> collection) {
        return new C0137y(this, mo341b(), eVar.f232c, this.f335a).mo260a(m440a(nVar, collection));
    }

    /* renamed from: a */
    private C0114d m440a(C0124n nVar, Collection<C0152k> collection) {
        Context context = getContext();
        return new C0114d(new C0018g().mo40a(context), getIdManager().mo65c(), this.f340f, this.f339e, C0020i.m53a(C0020i.m82m(context)), this.f342h, C0027l.m90a(this.f341g).mo51a(), this.f343i, "0", nVar, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo341b() {
        return C0020i.m65b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
