package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.tm */
public final class C1678tm extends ContextWrapper {
    /* renamed from: a */
    public final synchronized void mo12988a(String str) {
        throw new NoSuchMethodError();
    }

    public final Context getApplicationContext() {
        throw new NoSuchMethodError();
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageName() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageResourcePath() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final synchronized void mo12987a(Activity activity) {
        throw new NoSuchMethodError();
    }

    public final synchronized void startActivity(Intent intent) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m7946a(Context context) {
        if (context instanceof C1678tm) {
            return ((C1678tm) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
