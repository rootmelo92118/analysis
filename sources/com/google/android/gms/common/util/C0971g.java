package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.C0926p;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.util.g */
public final class C0971g {

    /* renamed from: a */
    private static final String[] f1212a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static DropBoxManager f1213b = null;

    /* renamed from: c */
    private static boolean f1214c = false;

    /* renamed from: d */
    private static int f1215d = -1;
    @GuardedBy("CrashUtils.class")

    /* renamed from: e */
    private static int f1216e = 0;
    @GuardedBy("CrashUtils.class")

    /* renamed from: f */
    private static int f1217f = 0;

    /* renamed from: a */
    public static boolean m1480a(Context context, Throwable th) {
        return m1481a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m1481a(Context context, Throwable th, int i) {
        try {
            C0926p.m1306a(context);
            C0926p.m1306a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
