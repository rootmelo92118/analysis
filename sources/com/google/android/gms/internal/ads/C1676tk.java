package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0722b;
import java.util.HashMap;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.tk */
public final class C1676tk {

    /* renamed from: a */
    private static final C1436kn f6547a = new C1436kn();

    /* renamed from: b */
    private final C1437ko f6548b;

    /* renamed from: c */
    private final zzbw f6549c;

    /* renamed from: d */
    private final Map<String, C1717uy> f6550d = new HashMap();

    /* renamed from: e */
    private final C1710ur f6551e;

    /* renamed from: f */
    private final zzb f6552f;

    /* renamed from: g */
    private final C1544on f6553g;

    public C1676tk(zzbw zzbw, C1437ko koVar, C1710ur urVar, zzb zzb, C1544on onVar) {
        this.f6549c = zzbw;
        this.f6548b = koVar;
        this.f6551e = urVar;
        this.f6552f = zzb;
        this.f6553g = onVar;
    }

    /* renamed from: a */
    public static boolean m7931a(C1752wf wfVar, C1752wf wfVar2) {
        return true;
    }

    /* renamed from: a */
    public final zzb mo12972a() {
        return this.f6552f;
    }

    /* renamed from: b */
    public final C1544on mo12977b() {
        return this.f6553g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    @android.support.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1717uy mo12973a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.uy> r0 = r4.f6550d
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.uy r0 = (com.google.android.gms.internal.ads.C1717uy) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.ko r1 = r4.f6548b     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.kn r1 = f6547a     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.uy r2 = new com.google.android.gms.internal.ads.uy     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.kr r1 = r1.mo12677a(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.ur r3 = r4.f6551e     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.uy> r0 = r4.f6550d     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.C1772wz.m1627c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1676tk.mo12973a(java.lang.String):com.google.android.gms.internal.ads.uy");
    }

    /* renamed from: c */
    public final void mo12978c() {
        this.f6549c.zzbtw = 0;
        zzbw zzbw = this.f6549c;
        zzbv.zzle();
        C1713uu uuVar = new C1713uu(this.f6549c.zzsp, this.f6549c.zzbsv, this);
        String valueOf = String.valueOf(uuVar.getClass().getName());
        C1772wz.m1624b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        uuVar.zzwa();
        zzbw.zzbss = uuVar;
    }

    /* renamed from: a */
    public final void mo12976a(boolean z) {
        C1717uy a = mo12973a(this.f6549c.zzbsu.f6714q);
        if (a != null && a.mo13047a() != null) {
            try {
                a.mo13047a().mo12692a(z);
                a.mo13047a().mo12697f();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo12979d() {
        C0926p.m1315b("pause must be called on the main UI thread.");
        for (String str : this.f6550d.keySet()) {
            try {
                C1717uy uyVar = this.f6550d.get(str);
                if (!(uyVar == null || uyVar.mo13047a() == null)) {
                    uyVar.mo13047a().mo12695d();
                }
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo12980e() {
        C0926p.m1315b("resume must be called on the main UI thread.");
        for (String str : this.f6550d.keySet()) {
            try {
                C1717uy uyVar = this.f6550d.get(str);
                if (!(uyVar == null || uyVar.mo13047a() == null)) {
                    uyVar.mo13047a().mo12696e();
                }
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final void mo12981f() {
        C0926p.m1315b("destroy must be called on the main UI thread.");
        for (String str : this.f6550d.keySet()) {
            try {
                C1717uy uyVar = this.f6550d.get(str);
                if (!(uyVar == null || uyVar.mo13047a() == null)) {
                    uyVar.mo13047a().mo12694c();
                }
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo12975a(@NonNull Context context) {
        for (C1717uy a : this.f6550d.values()) {
            try {
                a.mo13047a().mo12682a(C0722b.m769a(context));
            } catch (RemoteException e) {
                C1772wz.m1625b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: g */
    public final void mo12982g() {
        if (this.f6549c.zzbsu != null && this.f6549c.zzbsu.f6712o != null) {
            zzbv.zzlz();
            C1429kg.m7186a(this.f6549c.zzsp, this.f6549c.zzbsp.f7135a, this.f6549c.zzbsu, this.f6549c.zzbsn, false, this.f6549c.zzbsu.f6712o.f5556l);
        }
    }

    /* renamed from: h */
    public final void mo12983h() {
        if (this.f6549c.zzbsu != null && this.f6549c.zzbsu.f6712o != null) {
            zzbv.zzlz();
            C1429kg.m7186a(this.f6549c.zzsp, this.f6549c.zzbsp.f7135a, this.f6549c.zzbsu, this.f6549c.zzbsn, false, this.f6549c.zzbsu.f6712o.f5558n);
        }
    }

    /* renamed from: a */
    public final zzawd mo12974a(zzawd zzawd) {
        if (!(this.f6549c.zzbsu == null || this.f6549c.zzbsu.f6715r == null || TextUtils.isEmpty(this.f6549c.zzbsu.f6715r.f5576k))) {
            zzawd = new zzawd(this.f6549c.zzbsu.f6715r.f5576k, this.f6549c.zzbsu.f6715r.f5577l);
        }
        if (!(this.f6549c.zzbsu == null || this.f6549c.zzbsu.f6712o == null)) {
            zzbv.zzlz();
            C1429kg.m7187a(this.f6549c.zzsp, this.f6549c.zzbsp.f7135a, this.f6549c.zzbsu.f6712o.f5557m, this.f6549c.zzbtr, this.f6549c.zzbts, zzawd);
        }
        return zzawd;
    }
}
