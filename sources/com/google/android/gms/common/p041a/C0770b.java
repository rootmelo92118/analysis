package com.google.android.gms.common.p041a;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C0979o;

/* renamed from: com.google.android.gms.common.a.b */
public class C0770b {

    /* renamed from: a */
    private final Context f777a;

    public C0770b(Context context) {
        this.f777a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo9535a(String str, int i) {
        return this.f777a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public PackageInfo mo9540b(String str, int i) {
        return this.f777a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo9536a(String str, int i, int i2) {
        return this.f777a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public final String[] mo9539a(int i) {
        return this.f777a.getPackageManager().getPackagesForUid(i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo9538a(int i, String str) {
        if (C0979o.m1505f()) {
            try {
                ((AppOpsManager) this.f777a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f777a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public int mo9533a(String str) {
        return this.f777a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int mo9534a(String str, String str2) {
        return this.f777a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: b */
    public CharSequence mo9541b(String str) {
        return this.f777a.getPackageManager().getApplicationLabel(this.f777a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public boolean mo9537a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C0769a.m894a(this.f777a);
        }
        if (!C0979o.m1510k() || (nameForUid = this.f777a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f777a.getPackageManager().isInstantApp(nameForUid);
    }
}
