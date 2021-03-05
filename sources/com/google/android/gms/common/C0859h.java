package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.h */
public class C0859h {

    /* renamed from: a */
    private static C0859h f974a;

    /* renamed from: b */
    private final Context f975b;

    private C0859h(Context context) {
        this.f975b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C0859h m1143a(Context context) {
        C0926p.m1306a(context);
        synchronized (C0859h.class) {
            if (f974a == null) {
                C0942l.m1397a(context);
                f974a = new C0859h(context);
            }
        }
        return f974a;
    }

    /* renamed from: a */
    public boolean mo9742a(int i) {
        C0987v vVar;
        String[] a = C0771c.m904a(this.f975b).mo9539a(i);
        if (a != null && a.length != 0) {
            vVar = null;
            for (String a2 : a) {
                vVar = m1145a(a2, i);
                if (vVar.f1232a) {
                    break;
                }
            }
        } else {
            vVar = C0987v.m1522a("no pkgs");
        }
        vVar.mo10001c();
        return vVar.f1232a;
    }

    /* renamed from: a */
    public static boolean m1146a(PackageInfo packageInfo, boolean z) {
        C0944n nVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                nVar = m1144a(packageInfo, C0947q.f1143a);
            } else {
                nVar = m1144a(packageInfo, C0947q.f1143a[0]);
            }
            if (nVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo9743a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m1146a(packageInfo, false)) {
            return true;
        }
        if (m1146a(packageInfo, true)) {
            if (C0858g.honorsDebugCertificates(this.f975b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    private final C0987v m1145a(String str, int i) {
        try {
            return m1147b(C0771c.m904a(this.f975b).mo9536a(str, 64, i));
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C0987v.m1522a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: b */
    private final C0987v m1147b(PackageInfo packageInfo) {
        boolean honorsDebugCertificates = C0858g.honorsDebugCertificates(this.f975b);
        if (packageInfo == null) {
            return C0987v.m1522a("null pkg");
        }
        if (packageInfo.signatures.length != 1) {
            return C0987v.m1522a("single cert required");
        }
        C0945o oVar = new C0945o(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        C0987v a = C0942l.m1395a(str, (C0944n) oVar, honorsDebugCertificates);
        return (!a.f1232a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !C0942l.m1395a(str, (C0944n) oVar, false).f1232a)) ? a : C0987v.m1522a("debuggable release cert app rejected");
    }

    /* renamed from: a */
    private static C0944n m1144a(PackageInfo packageInfo, C0944n... nVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C0945o oVar = new C0945o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }
}
