package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.vy */
public final class C1744vy {
    /* renamed from: a */
    public static String m8201a(String str, Context context, boolean z) {
        String e;
        if ((((Boolean) bre.m6321e().mo12778a(C1557p.f5929ak)).booleanValue() && !z) || !zzbv.zzmf().mo13075a(context) || TextUtils.isEmpty(str) || (e = zzbv.zzmf().mo13082e(context)) == null) {
            return str;
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5924af)).booleanValue()) {
            String str2 = (String) bre.m6321e().mo12778a(C1557p.f5925ag);
            if (str.contains(str2)) {
                if (zzbv.zzlf().mo13213d(str)) {
                    zzbv.zzmf().mo13081d(context, e);
                    return str.replace(str2, e);
                } else if (zzbv.zzlf().mo13214e(str)) {
                    zzbv.zzmf().mo13083e(context, e);
                    return str.replace(str2, e);
                }
            }
        } else if (!str.contains("fbs_aeid")) {
            if (zzbv.zzlf().mo13213d(str)) {
                zzbv.zzmf().mo13081d(context, e);
                return m8198a(str, "fbs_aeid", e).toString();
            } else if (zzbv.zzlf().mo13214e(str)) {
                zzbv.zzmf().mo13083e(context, e);
                return m8198a(str, "fbs_aeid", e).toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m8200a(String str, Context context) {
        String e;
        if (!zzbv.zzmf().mo13075a(context) || TextUtils.isEmpty(str) || (e = zzbv.zzmf().mo13082e(context)) == null || !zzbv.zzlf().mo13214e(str)) {
            return str;
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5924af)).booleanValue()) {
            String str2 = (String) bre.m6321e().mo12778a(C1557p.f5925ag);
            if (str.contains(str2)) {
                return str.replace(str2, e);
            }
        } else if (!str.contains("fbs_aeid")) {
            return m8198a(str, "fbs_aeid", e).toString();
        }
        return str;
    }

    /* renamed from: a */
    public static String m8199a(Uri uri, Context context) {
        if (!zzbv.zzmf().mo13075a(context)) {
            return uri.toString();
        }
        String e = zzbv.zzmf().mo13082e(context);
        if (e == null) {
            return uri.toString();
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5924af)).booleanValue()) {
            String str = (String) bre.m6321e().mo12778a(C1557p.f5925ag);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzbv.zzmf().mo13081d(context, e);
                return uri2.replace(str, e);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m8198a(uri.toString(), "fbs_aeid", e);
            zzbv.zzmf().mo13081d(context, e);
        }
        return uri.toString();
    }

    /* renamed from: a */
    private static Uri m8198a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
