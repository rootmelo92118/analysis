package p000a.p001a.p002a.p003a.p004a.p012g;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0152k;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0045u;
import p000a.p001a.p002a.p003a.p004a.p010e.C0093c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

/* renamed from: a.a.a.a.a.g.a */
/* compiled from: AbstractAppSpiCall */
abstract class C0111a extends C0008a {
    public C0111a(C0150i iVar, String str, String str2, C0102e eVar, C0093c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* renamed from: a */
    public boolean mo260a(C0114d dVar) {
        C0094d b = m323b(m322a(getHttpRequest(), dVar), dVar);
        C0153l g = C0139c.m394g();
        g.mo281a("Fabric", "Sending app info to " + getUrl());
        if (dVar.f228j != null) {
            C0153l g2 = C0139c.m394g();
            g2.mo281a("Fabric", "App icon hash is " + dVar.f228j.f252a);
            C0153l g3 = C0139c.m394g();
            g3.mo281a("Fabric", "App icon size is " + dVar.f228j.f254c + "x" + dVar.f228j.f255d);
        }
        int b2 = b.mo211b();
        String str = "POST".equals(b.mo234o()) ? "Create" : "Update";
        C0153l g4 = C0139c.m394g();
        g4.mo281a("Fabric", str + " app request ID: " + b.mo213b(C0008a.HEADER_REQUEST_ID));
        C0153l g5 = C0139c.m394g();
        g5.mo281a("Fabric", "Result was " + b2);
        return C0045u.m155a(b2) == 0;
    }

    /* renamed from: a */
    private C0094d m322a(C0094d dVar, C0114d dVar2) {
        return dVar.mo201a(C0008a.HEADER_API_KEY, dVar2.f219a).mo201a(C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE).mo201a(C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p000a.p001a.p002a.p003a.p004a.p010e.C0094d m323b(p000a.p001a.p002a.p003a.p004a.p010e.C0094d r8, p000a.p001a.p002a.p003a.p004a.p012g.C0114d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "app[identifier]"
            java.lang.String r1 = r9.f220b
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = "app[name]"
            java.lang.String r1 = r9.f224f
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = "app[display_version]"
            java.lang.String r1 = r9.f221c
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = "app[build_version]"
            java.lang.String r1 = r9.f222d
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = "app[source]"
            int r1 = r9.f225g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            a.a.a.a.a.e.d r8 = r8.mo200a((java.lang.String) r0, (java.lang.Number) r1)
            java.lang.String r0 = "app[minimum_sdk_version]"
            java.lang.String r1 = r9.f226h
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = "app[built_sdk_version]"
            java.lang.String r1 = r9.f227i
            a.a.a.a.a.e.d r8 = r8.mo221e(r0, r1)
            java.lang.String r0 = r9.f223e
            boolean r0 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m73d((java.lang.String) r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "app[instance_identifier]"
            java.lang.String r1 = r9.f223e
            r8.mo221e(r0, r1)
        L_0x004b:
            a.a.a.a.a.g.n r0 = r9.f228j
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            a.a.a.a.i r1 = r7.kit     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            a.a.a.a.a.g.n r2 = r9.f228j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            int r2 = r2.f253b     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.lang.String r0 = "app[icon][hash]"
            a.a.a.a.a.g.n r2 = r9.f228j     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = r2.f252a     // Catch:{ NotFoundException -> 0x0092 }
            a.a.a.a.a.e.d r0 = r8.mo221e(r0, r2)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][data]"
            java.lang.String r3 = "icon.png"
            java.lang.String r4 = "application/octet-stream"
            a.a.a.a.a.e.d r0 = r0.mo205a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.io.InputStream) r1)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][width]"
            a.a.a.a.a.g.n r3 = r9.f228j     // Catch:{ NotFoundException -> 0x0092 }
            int r3 = r3.f254c     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0092 }
            a.a.a.a.a.e.d r0 = r0.mo200a((java.lang.String) r2, (java.lang.Number) r3)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][height]"
            a.a.a.a.a.g.n r3 = r9.f228j     // Catch:{ NotFoundException -> 0x0092 }
            int r3 = r3.f255d     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0092 }
            r0.mo200a((java.lang.String) r2, (java.lang.Number) r3)     // Catch:{ NotFoundException -> 0x0092 }
            goto L_0x00b9
        L_0x0092:
            r0 = move-exception
            goto L_0x009b
        L_0x0094:
            r8 = move-exception
            r1 = r0
            goto L_0x00c0
        L_0x0097:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x009b:
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0139c.m394g()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r4.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed to find app icon with resource ID: "
            r4.append(r5)     // Catch:{ all -> 0x00bf }
            a.a.a.a.a.g.n r5 = r9.f228j     // Catch:{ all -> 0x00bf }
            int r5 = r5.f253b     // Catch:{ all -> 0x00bf }
            r4.append(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00bf }
            r2.mo291e(r3, r4, r0)     // Catch:{ all -> 0x00bf }
        L_0x00b9:
            java.lang.String r0 = "Failed to close app icon InputStream."
            p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m58a((java.io.Closeable) r1, (java.lang.String) r0)
            goto L_0x00c6
        L_0x00bf:
            r8 = move-exception
        L_0x00c0:
            java.lang.String r9 = "Failed to close app icon InputStream."
            p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m58a((java.io.Closeable) r1, (java.lang.String) r9)
            throw r8
        L_0x00c6:
            java.util.Collection<a.a.a.a.k> r0 = r9.f229k
            if (r0 == 0) goto L_0x00f3
            java.util.Collection<a.a.a.a.k> r9 = r9.f229k
            java.util.Iterator r9 = r9.iterator()
        L_0x00d0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r9.next()
            a.a.a.a.k r0 = (p000a.p001a.p002a.p003a.C0152k) r0
            java.lang.String r1 = r7.mo259a((p000a.p001a.p002a.p003a.C0152k) r0)
            java.lang.String r2 = r0.mo337b()
            r8.mo221e(r1, r2)
            java.lang.String r1 = r7.mo261b(r0)
            java.lang.String r0 = r0.mo338c()
            r8.mo221e(r1, r0)
            goto L_0x00d0
        L_0x00f3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p012g.C0111a.m323b(a.a.a.a.a.e.d, a.a.a.a.a.g.d):a.a.a.a.a.e.d");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo259a(C0152k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{kVar.mo336a()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo261b(C0152k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{kVar.mo336a()});
    }
}
