package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0879aj;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0973i;

/* renamed from: com.google.android.gms.common.d */
public class C0851d {

    /* renamed from: a */
    private static final C0851d f947a = new C0851d();

    /* renamed from: b */
    public static final int f948b = C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    public static C0851d m1126b() {
        return f947a;
    }

    C0851d() {
    }

    /* renamed from: a */
    public int mo9712a(Context context) {
        return mo9722b(context, f948b);
    }

    /* renamed from: b */
    public int mo9722b(Context context, int i) {
        int isGooglePlayServicesAvailable = C0858g.isGooglePlayServicesAvailable(context, i);
        if (C0858g.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: a */
    public boolean mo9719a(int i) {
        return C0858g.isUserRecoverableError(i);
    }

    @Nullable
    /* renamed from: a */
    public Intent mo9716a(Context context, int i, @Nullable String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !C0973i.m1488b(context)) {
                    return C0879aj.m1203a("com.google.android.gms", m1127b(context, str));
                }
                return C0879aj.m1201a();
            case 3:
                return C0879aj.m1202a("com.google.android.gms");
            default:
                return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo9714a(Context context, int i, int i2) {
        return mo9727a(context, i, i2, (String) null);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo9727a(Context context, int i, int i2, @Nullable String str) {
        Intent a = mo9716a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: c */
    public int mo9729c(Context context) {
        return C0858g.getApkVersion(context);
    }

    /* renamed from: a */
    public boolean mo9728a(Context context, String str) {
        return C0858g.isUninstalledAppPossiblyUpdating(context, str);
    }

    /* renamed from: b */
    public String mo9723b(int i) {
        return C0858g.getErrorString(i);
    }

    /* renamed from: b */
    private static String m1127b(@Nullable Context context, @Nullable String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f948b);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C0771c.m904a(context).mo9540b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}
