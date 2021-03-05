package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C0885ap;
import com.google.android.gms.common.internal.C0886aq;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p039a.C0722b;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.l */
final class C0942l {

    /* renamed from: a */
    private static volatile C0885ap f1133a;

    /* renamed from: b */
    private static final Object f1134b = new Object();

    /* renamed from: c */
    private static Context f1135c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m1397a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.l> r0 = com.google.android.gms.common.C0942l.class
            monitor-enter(r0)
            android.content.Context r1 = f1135c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f1135c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C0942l.m1397a(android.content.Context):void");
    }

    /* renamed from: a */
    static C0987v m1395a(String str, C0944n nVar, boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m1398b(str, nVar, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    private static C0987v m1398b(String str, C0944n nVar, boolean z) {
        try {
            if (f1133a == null) {
                C0926p.m1306a(f1135c);
                synchronized (f1134b) {
                    if (f1133a == null) {
                        f1133a = C0886aq.m1217a(DynamiteModule.m1533a(f1135c, DynamiteModule.f1241c, "com.google.android.gms.googlecertificates").mo10004a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C0926p.m1306a(f1135c);
            try {
                if (f1133a.mo9826a(new zzk(str, nVar, z), C0722b.m769a(f1135c.getPackageManager()))) {
                    return C0987v.m1521a();
                }
                return C0987v.m1524a((Callable<String>) new C0943m(z, str, nVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C0987v.m1523a("module call", e);
            }
        } catch (DynamiteModule.C0990a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C0987v.m1523a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m1396a(boolean z, String str, C0944n nVar) {
        boolean z2 = true;
        if (z || !m1398b(str, nVar, true).f1232a) {
            z2 = false;
        }
        return C0987v.m1525a(str, nVar, z, z2);
    }
}
