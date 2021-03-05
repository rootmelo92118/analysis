package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p041a.C0771c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.as */
public final class C0888as {

    /* renamed from: a */
    private static Object f1062a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f1063b;

    /* renamed from: c */
    private static String f1064c;

    /* renamed from: d */
    private static int f1065d;

    /* renamed from: a */
    public static String m1219a(Context context) {
        m1221c(context);
        return f1064c;
    }

    /* renamed from: b */
    public static int m1220b(Context context) {
        m1221c(context);
        return f1065d;
    }

    /* renamed from: c */
    private static void m1221c(Context context) {
        synchronized (f1062a) {
            if (!f1063b) {
                f1063b = true;
                try {
                    Bundle bundle = C0771c.m904a(context).mo9535a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f1064c = bundle.getString("com.google.app.id");
                        f1065d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
