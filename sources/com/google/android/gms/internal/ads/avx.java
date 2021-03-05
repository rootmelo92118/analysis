package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class avx {

    /* renamed from: a */
    private static String f2741a;

    /* renamed from: a */
    public static String m4304a(Context context) {
        if (f2741a != null) {
            return f2741a;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f2741a = null;
        } else if (arrayList.size() == 1) {
            f2741a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str) && !m4305a(context, intent) && arrayList.contains(str)) {
            f2741a = str;
        } else if (arrayList.contains("com.android.chrome")) {
            f2741a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f2741a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f2741a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f2741a = "com.google.android.apps.chrome";
        }
        return f2741a;
    }

    /* renamed from: a */
    private static boolean m4305a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
    }
}
