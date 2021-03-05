package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.p041a.C0771c;

/* renamed from: com.google.android.gms.common.util.d */
public class C0968d {
    /* renamed from: a */
    public static boolean m1465a() {
        return false;
    }

    /* renamed from: a */
    public static int m1464a(Context context, String str) {
        Bundle bundle;
        PackageInfo c = m1467c(context, str);
        if (c == null || c.applicationInfo == null || (bundle = c.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Nullable
    /* renamed from: c */
    private static PackageInfo m1467c(Context context, String str) {
        try {
            return C0771c.m904a(context).mo9540b(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m1466b(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C0771c.m904a(context).mo9535a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
