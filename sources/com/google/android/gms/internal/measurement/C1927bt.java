package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.bt */
public class C1927bt {

    /* renamed from: a */
    private static volatile UserManager f7537a;

    /* renamed from: b */
    private static volatile boolean f7538b = (!m8989a());

    private C1927bt() {
    }

    /* renamed from: a */
    public static boolean m8989a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m8990a(Context context) {
        return !m8989a() || m8991b(context);
    }

    @TargetApi(24)
    @RequiresApi(24)
    /* renamed from: b */
    private static boolean m8991b(Context context) {
        boolean z = f7538b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager c = m8992c(context);
                if (c == null) {
                    f7538b = true;
                    return true;
                }
                try {
                    if (!c.isUserUnlocked()) {
                        if (c.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            f7538b = z2;
                        }
                    }
                    z2 = true;
                    f7538b = z2;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    f7537a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                f7537a = null;
            }
        }
        return z;
    }

    @VisibleForTesting
    @TargetApi(24)
    @RequiresApi(24)
    /* renamed from: c */
    private static UserManager m8992c(Context context) {
        UserManager userManager = f7537a;
        if (userManager == null) {
            synchronized (C1927bt.class) {
                userManager = f7537a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    f7537a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
