package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C0859h;
import com.google.android.gms.common.p041a.C0771c;

/* renamed from: com.google.android.gms.common.util.t */
public final class C0984t {
    /* renamed from: a */
    public static boolean m1517a(Context context, int i) {
        if (!m1518a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C0859h.m1143a(context).mo9743a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m1518a(Context context, int i, String str) {
        return C0771c.m904a(context).mo9538a(i, str);
    }
}
