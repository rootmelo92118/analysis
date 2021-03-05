package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.hy */
public final class C1366hy {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f5455a;

    /* renamed from: b */
    private final Context f5456b;

    /* renamed from: c */
    private final String f5457c;

    /* renamed from: d */
    private final zzbbi f5458d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1816yp<C1355hn> f5459e;

    /* renamed from: f */
    private C1816yp<C1355hn> f5460f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public C1387is f5461g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f5462h;

    public C1366hy(Context context, zzbbi zzbbi, String str) {
        this.f5455a = new Object();
        this.f5462h = 1;
        this.f5457c = str;
        this.f5456b = context.getApplicationContext();
        this.f5458d = zzbbi;
        this.f5459e = new C1382in();
        this.f5460f = new C1382in();
    }

    public C1366hy(Context context, zzbbi zzbbi, String str, C1816yp<C1355hn> ypVar, C1816yp<C1355hn> ypVar2) {
        this(context, zzbbi, str);
        this.f5459e = ypVar;
        this.f5460f = ypVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1387is mo12613a(@Nullable awy awy) {
        C1387is isVar = new C1387is(this.f5460f);
        abl.f1313a.execute(new C1367hz(this, awy, isVar));
        isVar.mo10093a(new C1379ik(this, isVar), new C1380il(this, isVar));
        return isVar;
    }

    /* renamed from: b */
    public final C1383io mo12617b(@Nullable awy awy) {
        synchronized (this.f5455a) {
            synchronized (this.f5455a) {
                if (this.f5461g != null && this.f5462h == 0) {
                    if (((Boolean) bre.m6321e().mo12778a(C1557p.f5945b)).booleanValue()) {
                        this.f5461g.mo10093a(new C1369ia(this), C1370ib.f5467a);
                    }
                }
            }
            if (this.f5461g != null) {
                if (this.f5461g.mo10098e() != -1) {
                    if (this.f5462h == 0) {
                        C1383io a = this.f5461g.mo12625a();
                        return a;
                    } else if (this.f5462h == 1) {
                        this.f5462h = 2;
                        mo12613a((awy) null);
                        C1383io a2 = this.f5461g.mo12625a();
                        return a2;
                    } else if (this.f5462h == 2) {
                        C1383io a3 = this.f5461g.mo12625a();
                        return a3;
                    } else {
                        C1383io a4 = this.f5461g.mo12625a();
                        return a4;
                    }
                }
            }
            this.f5462h = 2;
            this.f5461g = mo12613a((awy) null);
            C1383io a5 = this.f5461g.mo12625a();
            return a5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12615a(C1355hn hnVar) {
        if (hnVar.mo12586b()) {
            this.f5462h = 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12614a(awy awy, C1387is isVar) {
        C1355hn hnVar;
        try {
            Context context = this.f5456b;
            zzbbi zzbbi = this.f5458d;
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5932an)).booleanValue()) {
                hnVar = new C1340gz(context, zzbbi);
            } else {
                hnVar = new C1357hp(context, zzbbi, awy, (zzv) null);
            }
            hnVar.mo12583a((C1356ho) new C1371ic(this, isVar, hnVar));
            hnVar.mo12606a("/jsLoaded", new C1375ig(this, isVar, hnVar));
            C1841zn znVar = new C1841zn();
            C1376ih ihVar = new C1376ih(this, awy, hnVar, znVar);
            znVar.mo13289a(ihVar);
            hnVar.mo12606a("/requestReload", ihVar);
            if (this.f5457c.endsWith(".js")) {
                hnVar.mo12584a(this.f5457c);
            } else if (this.f5457c.startsWith("<html>")) {
                hnVar.mo12585b(this.f5457c);
            } else {
                hnVar.mo12588c(this.f5457c);
            }
            C1782xi.f6838a.postDelayed(new C1377ii(this, isVar, hnVar), (long) C1381im.f5494a);
        } catch (Throwable th) {
            C1772wz.m1625b("Error creating webview.", th);
            zzbv.zzlj().mo13119a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            isVar.mo10097d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12616a(com.google.android.gms.internal.ads.C1387is r4, com.google.android.gms.internal.ads.C1355hn r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5455a
            monitor-enter(r0)
            int r1 = r4.mo10098e()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo10098e()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo10097d()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.abl.f1313a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.C1373ie.m7051a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.C1772wz.m8287a(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1366hy.mo12616a(com.google.android.gms.internal.ads.is, com.google.android.gms.internal.ads.hn):void");
    }
}
