package p000a.p001a.p002a.p003a.p004a.p012g;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p010e.C0093c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

/* renamed from: a.a.a.a.a.g.l */
/* compiled from: DefaultSettingsSpiCall */
class C0122l extends C0008a implements C0136x {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo273a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public C0122l(C0150i iVar, String str, String str2, C0102e eVar) {
        this(iVar, str, str2, eVar, C0093c.GET);
    }

    C0122l(C0150i iVar, String str, String str2, C0102e eVar, C0093c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo272a(p000a.p001a.p002a.p003a.p004a.p012g.C0135w r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.Map r1 = r7.m352b(r8)     // Catch:{ c -> 0x007a, all -> 0x0075 }
            a.a.a.a.a.e.d r2 = r7.getHttpRequest(r1)     // Catch:{ c -> 0x007a, all -> 0x0075 }
            a.a.a.a.a.e.d r8 = r7.m349a(r2, r8)     // Catch:{ c -> 0x0072, all -> 0x006f }
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0139c.m394g()     // Catch:{ c -> 0x006d }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ c -> 0x006d }
            r4.<init>()     // Catch:{ c -> 0x006d }
            java.lang.String r5 = "Requesting settings from "
            r4.append(r5)     // Catch:{ c -> 0x006d }
            java.lang.String r5 = r7.getUrl()     // Catch:{ c -> 0x006d }
            r4.append(r5)     // Catch:{ c -> 0x006d }
            java.lang.String r4 = r4.toString()     // Catch:{ c -> 0x006d }
            r2.mo281a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ c -> 0x006d }
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0139c.m394g()     // Catch:{ c -> 0x006d }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ c -> 0x006d }
            r4.<init>()     // Catch:{ c -> 0x006d }
            java.lang.String r5 = "Settings query params were: "
            r4.append(r5)     // Catch:{ c -> 0x006d }
            r4.append(r1)     // Catch:{ c -> 0x006d }
            java.lang.String r1 = r4.toString()     // Catch:{ c -> 0x006d }
            r2.mo281a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ c -> 0x006d }
            org.json.JSONObject r1 = r7.mo271a((p000a.p001a.p002a.p003a.p004a.p010e.C0094d) r8)     // Catch:{ c -> 0x006d }
            if (r8 == 0) goto L_0x006b
            a.a.a.a.l r0 = p000a.p001a.p002a.p003a.C0139c.m394g()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo213b((java.lang.String) r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r0.mo281a((java.lang.String) r2, (java.lang.String) r8)
        L_0x006b:
            r0 = r1
            goto L_0x00a9
        L_0x006d:
            r1 = move-exception
            goto L_0x007c
        L_0x006f:
            r0 = move-exception
            r8 = r2
            goto L_0x00ab
        L_0x0072:
            r1 = move-exception
            r8 = r2
            goto L_0x007c
        L_0x0075:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x00ab
        L_0x007a:
            r1 = move-exception
            r8 = r0
        L_0x007c:
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0139c.m394g()     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "Fabric"
            java.lang.String r4 = "Settings request failed."
            r2.mo291e(r3, r4, r1)     // Catch:{ all -> 0x00aa }
            if (r8 == 0) goto L_0x00a9
            a.a.a.a.l r1 = p000a.p001a.p002a.p003a.C0139c.m394g()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo213b((java.lang.String) r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r1.mo281a((java.lang.String) r2, (java.lang.String) r8)
        L_0x00a9:
            return r0
        L_0x00aa:
            r0 = move-exception
        L_0x00ab:
            if (r8 == 0) goto L_0x00cd
            a.a.a.a.l r1 = p000a.p001a.p002a.p003a.C0139c.m394g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Settings request ID: "
            r2.append(r3)
            java.lang.String r3 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo213b((java.lang.String) r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "Fabric"
            r1.mo281a((java.lang.String) r2, (java.lang.String) r8)
        L_0x00cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p012g.C0122l.mo272a(a.a.a.a.a.g.w):org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo271a(C0094d dVar) {
        int b = dVar.mo211b();
        C0153l g = C0139c.m394g();
        g.mo281a("Fabric", "Settings result was: " + b);
        if (mo273a(b)) {
            return m350a(dVar.mo220d());
        }
        C0153l g2 = C0139c.m394g();
        g2.mo290e("Fabric", "Failed to retrieve settings from " + getUrl());
        return null;
    }

    /* renamed from: a */
    private JSONObject m350a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C0153l g = C0139c.m394g();
            g.mo282a("Fabric", "Failed to parse settings JSON from " + getUrl(), (Throwable) e);
            C0153l g2 = C0139c.m394g();
            g2.mo281a("Fabric", "Settings response " + str);
            return null;
        }
    }

    /* renamed from: b */
    private Map<String, String> m352b(C0135w wVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", wVar.f296h);
        hashMap.put("display_version", wVar.f295g);
        hashMap.put("source", Integer.toString(wVar.f297i));
        if (wVar.f298j != null) {
            hashMap.put("icon_hash", wVar.f298j);
        }
        String str = wVar.f294f;
        if (!C0020i.m73d(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    private C0094d m349a(C0094d dVar, C0135w wVar) {
        m351a(dVar, C0008a.HEADER_API_KEY, wVar.f289a);
        m351a(dVar, C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE);
        m351a(dVar, C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        m351a(dVar, C0008a.HEADER_ACCEPT, C0008a.ACCEPT_JSON_VALUE);
        m351a(dVar, "X-CRASHLYTICS-DEVICE-MODEL", wVar.f290b);
        m351a(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", wVar.f291c);
        m351a(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", wVar.f292d);
        m351a(dVar, "X-CRASHLYTICS-INSTALLATION-ID", wVar.f293e);
        return dVar;
    }

    /* renamed from: a */
    private void m351a(C0094d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.mo201a(str, str2);
        }
    }
}
