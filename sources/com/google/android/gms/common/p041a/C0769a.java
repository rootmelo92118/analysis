package com.google.android.gms.common.p041a;

import android.content.Context;
import com.google.android.gms.common.util.C0979o;

/* renamed from: com.google.android.gms.common.a.a */
public class C0769a {

    /* renamed from: a */
    private static Context f775a;

    /* renamed from: b */
    private static Boolean f776b;

    /* renamed from: a */
    public static synchronized boolean m894a(Context context) {
        synchronized (C0769a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f775a == null || f776b == null || f775a != applicationContext) {
                f776b = null;
                if (C0979o.m1510k()) {
                    f776b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f776b = true;
                    } catch (ClassNotFoundException unused) {
                        f776b = false;
                    }
                }
                f775a = applicationContext;
                boolean booleanValue = f776b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f776b.booleanValue();
            return booleanValue2;
        }
    }
}
