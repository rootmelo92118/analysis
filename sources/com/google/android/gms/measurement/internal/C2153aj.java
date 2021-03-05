package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.p041a.C0770b;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.stats.C0959a;
import com.google.android.gms.internal.measurement.C1986dt;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.aj */
public final class C2153aj {

    /* renamed from: a */
    final C2166aw f8082a;

    C2153aj(C2166aw awVar) {
        this.f8082a = awVar;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14272a(String str) {
        if (str == null || str.isEmpty()) {
            this.f8082a.mo14235r().mo14836v().mo14841a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f8082a.mo14234q().mo14221d();
        if (!m10453a()) {
            this.f8082a.mo14235r().mo14836v().mo14841a("Install Referrer Reporter is not available");
            return;
        }
        this.f8082a.mo14235r().mo14836v().mo14841a("Install Referrer Reporter is initializing");
        C2154ak akVar = new C2154ak(this, str);
        this.f8082a.mo14234q().mo14221d();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f8082a.mo14231n().getPackageManager();
        if (packageManager == null) {
            this.f8082a.mo14235r().mo14833i().mo14841a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f8082a.mo14235r().mo14836v().mo14841a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m10453a()) {
                this.f8082a.mo14235r().mo14836v().mo14841a("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.f8082a.mo14235r().mo14836v().mo14842a("Install Referrer Service is", C0959a.m1447a().mo9988a(this.f8082a.mo14231n(), new Intent(intent), akVar, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f8082a.mo14235r().mo14830d_().mo14842a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private final boolean m10453a() {
        try {
            C0770b a = C0771c.m904a(this.f8082a.mo14231n());
            if (a == null) {
                this.f8082a.mo14235r().mo14836v().mo14841a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            } else if (a.mo9540b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f8082a.mo14235r().mo14836v().mo14842a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public final Bundle mo14271a(String str, C1986dt dtVar) {
        this.f8082a.mo14234q().mo14221d();
        if (dtVar == null) {
            this.f8082a.mo14235r().mo14833i().mo14841a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = dtVar.mo13772a(bundle);
            if (a != null) {
                return a;
            }
            this.f8082a.mo14235r().mo14830d_().mo14841a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f8082a.mo14235r().mo14830d_().mo14842a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
