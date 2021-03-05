package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C0973i {

    /* renamed from: a */
    private static Boolean f1219a;

    /* renamed from: b */
    private static Boolean f1220b;

    /* renamed from: c */
    private static Boolean f1221c;

    /* renamed from: d */
    private static Boolean f1222d;

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m1487a(Context context) {
        if (f1219a == null) {
            f1219a = Boolean.valueOf(C0979o.m1506g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f1219a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: b */
    public static boolean m1488b(Context context) {
        if (!m1487a(context)) {
            return false;
        }
        if (C0979o.m1509j()) {
            return m1489c(context) && !C0979o.m1510k();
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m1489c(Context context) {
        if (f1220b == null) {
            f1220b = Boolean.valueOf(C0979o.m1507h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1220b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m1490d(Context context) {
        if (f1221c == null) {
            PackageManager packageManager = context.getPackageManager();
            f1221c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f1221c.booleanValue();
    }

    /* renamed from: e */
    public static boolean m1491e(Context context) {
        if (f1222d == null) {
            f1222d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f1222d.booleanValue();
    }

    /* renamed from: a */
    public static boolean m1486a() {
        return "user".equals(Build.TYPE);
    }
}
