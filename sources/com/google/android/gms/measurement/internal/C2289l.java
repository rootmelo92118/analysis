package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.C0969e;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C2289l extends C2238dn {

    /* renamed from: a */
    private String f8592a;

    /* renamed from: b */
    private String f8593b;

    /* renamed from: c */
    private int f8594c;

    /* renamed from: d */
    private String f8595d;

    /* renamed from: e */
    private String f8596e;

    /* renamed from: f */
    private long f8597f;

    /* renamed from: g */
    private long f8598g;

    /* renamed from: h */
    private int f8599h;

    /* renamed from: i */
    private String f8600i;

    /* renamed from: j */
    private String f8601j;

    C2289l(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019f A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a2 A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ab A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01be A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f3  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14489w() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "Unknown"
            android.content.Context r3 = r10.mo14231n()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r10.mo14231n()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.r r4 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()
            java.lang.String r7 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)
            r4.mo14842a(r7, r8)
            goto L_0x008b
        L_0x002d:
            java.lang.String r7 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x0033 }
            r0 = r7
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.r r7 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo14830d_()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)
            r7.mo14842a(r8, r9)
        L_0x0044:
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "manual_install"
            goto L_0x0053
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            android.content.Context r7 = r10.mo14231n()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x008b
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r8 != 0) goto L_0x0072
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            r2 = r4
        L_0x0072:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x007a }
            int r1 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0079 }
            r6 = r1
            r1 = r4
            goto L_0x008b
        L_0x0079:
            r1 = r4
        L_0x007a:
            com.google.android.gms.measurement.internal.r r4 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()
            java.lang.String r7 = "Error retrieving package info. appId, appName"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)
            r4.mo14843a(r7, r8, r2)
        L_0x008b:
            r10.f8592a = r3
            r10.f8595d = r0
            r10.f8593b = r1
            r10.f8594c = r6
            r10.f8596e = r2
            r0 = 0
            r10.f8597f = r0
            r10.mo14238u()
            android.content.Context r2 = r10.mo14231n()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C0819c.m1055a((android.content.Context) r2)
            r4 = 1
            if (r2 == 0) goto L_0x00af
            boolean r6 = r2.mo9553c()
            if (r6 == 0) goto L_0x00af
            r6 = 1
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            com.google.android.gms.measurement.internal.aw r7 = r10.f8222q
            java.lang.String r7 = r7.mo14329p()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cc
            java.lang.String r7 = "am"
            com.google.android.gms.measurement.internal.aw r8 = r10.f8222q
            java.lang.String r8 = r8.mo14330s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00cc
            r7 = 1
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f9
            if (r2 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.r r2 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.mo14841a(r7)
            goto L_0x00f9
        L_0x00e0:
            com.google.android.gms.measurement.internal.r r7 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo14830d_()
            java.lang.String r8 = "GoogleService failed to initialize, status"
            int r9 = r2.mo9554d()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo9552b()
            r7.mo14843a(r8, r9, r2)
        L_0x00f9:
            if (r6 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.et r2 = r10.mo14237t()
            java.lang.Boolean r2 = r2.mo14731i()
            com.google.android.gms.measurement.internal.et r6 = r10.mo14237t()
            boolean r6 = r6.mo14729h()
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.aw r2 = r10.f8222q
            boolean r2 = r2.mo14328o()
            if (r2 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.r r2 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14836v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo14841a(r4)
            goto L_0x0165
        L_0x0123:
            if (r2 == 0) goto L_0x0141
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x0141
            com.google.android.gms.measurement.internal.aw r2 = r10.f8222q
            boolean r2 = r2.mo14328o()
            if (r2 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.r r2 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14836v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo14841a(r4)
            goto L_0x0165
        L_0x0141:
            if (r2 != 0) goto L_0x0157
            boolean r2 = com.google.android.gms.common.api.internal.C0819c.m1058b()
            if (r2 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.r r2 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14836v()
            java.lang.String r4 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo14841a(r4)
            goto L_0x0165
        L_0x0157:
            com.google.android.gms.measurement.internal.r r2 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r6 = "Collection enabled"
            r2.mo14841a(r6)
            goto L_0x0166
        L_0x0165:
            r4 = 0
        L_0x0166:
            java.lang.String r2 = ""
            r10.f8600i = r2
            java.lang.String r2 = ""
            r10.f8601j = r2
            r10.f8598g = r0
            r10.mo14238u()
            com.google.android.gms.measurement.internal.aw r0 = r10.f8222q
            java.lang.String r0 = r0.mo14329p()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "am"
            com.google.android.gms.measurement.internal.aw r1 = r10.f8222q
            java.lang.String r1 = r1.mo14330s()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0195
            com.google.android.gms.measurement.internal.aw r0 = r10.f8222q
            java.lang.String r0 = r0.mo14329p()
            r10.f8601j = r0
        L_0x0195:
            java.lang.String r0 = com.google.android.gms.common.api.internal.C0819c.m1057a()     // Catch:{ IllegalStateException -> 0x01d0 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01d0 }
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = ""
            goto L_0x01a3
        L_0x01a2:
            r1 = r0
        L_0x01a3:
            r10.f8600i = r1     // Catch:{ IllegalStateException -> 0x01d0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01d0 }
            if (r0 != 0) goto L_0x01bc
            com.google.android.gms.common.internal.s r0 = new com.google.android.gms.common.internal.s     // Catch:{ IllegalStateException -> 0x01d0 }
            android.content.Context r1 = r10.mo14231n()     // Catch:{ IllegalStateException -> 0x01d0 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r1 = "admob_app_id"
            java.lang.String r0 = r0.mo9915a(r1)     // Catch:{ IllegalStateException -> 0x01d0 }
            r10.f8601j = r0     // Catch:{ IllegalStateException -> 0x01d0 }
        L_0x01bc:
            if (r4 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.r r0 = r10.mo14235r()     // Catch:{ IllegalStateException -> 0x01d0 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r1 = "App package, google app id"
            java.lang.String r2 = r10.f8592a     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r4 = r10.f8600i     // Catch:{ IllegalStateException -> 0x01d0 }
            r0.mo14843a(r1, r2, r4)     // Catch:{ IllegalStateException -> 0x01d0 }
            goto L_0x01e2
        L_0x01d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r1 = r10.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()
            java.lang.String r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)
            r1.mo14843a(r2, r3, r0)
        L_0x01e2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01f3
            android.content.Context r0 = r10.mo14231n()
            boolean r0 = com.google.android.gms.common.p041a.C0769a.m894a(r0)
            r10.f8599h = r0
            return
        L_0x01f3:
            r10.f8599h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2289l.mo14489w():void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final zzk mo14807a(String str) {
        String str2;
        mo14221d();
        mo14218b();
        String x = mo14808x();
        String y = mo14809y();
        mo14486E();
        String str3 = this.f8593b;
        long A = (long) mo14805A();
        mo14486E();
        String str4 = this.f8595d;
        long f = mo14237t().mo14725f();
        mo14486E();
        mo14221d();
        if (this.f8597f == 0) {
            this.f8597f = this.f8222q.mo14325j().mo14561a(mo14231n(), mo14231n().getPackageName());
        }
        long j = this.f8597f;
        boolean C = this.f8222q.mo14307C();
        boolean z = !mo14236s().f8057p;
        mo14221d();
        mo14218b();
        if (!mo14237t().mo14732i(this.f8592a) || this.f8222q.mo14307C()) {
            str2 = m11325C();
        } else {
            str2 = null;
        }
        mo14486E();
        boolean z2 = z;
        String str5 = str2;
        long j2 = this.f8598g;
        long D = this.f8222q.mo14308D();
        int B = mo14806B();
        C2272et t = mo14237t();
        t.mo14218b();
        Boolean b = t.mo14719b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        C2272et t2 = mo14237t();
        t2.mo14218b();
        Boolean b2 = t2.mo14719b("google_analytics_ssaid_collection_enabled");
        return new zzk(x, y, str3, A, str4, f, j, str, C, z2, str5, j2, D, B, booleanValue, Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue(), mo14236s().mo14261w(), mo14810z());
    }

    @WorkerThread
    /* renamed from: C */
    private final String m11325C() {
        try {
            Class<?> loadClass = mo14231n().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{mo14231n()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo14235r().mo14835k().mo14841a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo14235r().mo14834j().mo14841a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final String mo14808x() {
        mo14486E();
        return this.f8592a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final String mo14809y() {
        mo14486E();
        return this.f8600i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo14810z() {
        mo14486E();
        return this.f8601j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final int mo14805A() {
        mo14486E();
        return this.f8594c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final int mo14806B() {
        mo14486E();
        return this.f8599h;
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
