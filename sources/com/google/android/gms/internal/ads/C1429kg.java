package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.kg */
public final class C1429kg {
    /* renamed from: a */
    public static List<String> m7185a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m7186a(Context context, String str, C1752wf wfVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m7184a(m7184a(m7184a(m7184a(m7184a(m7184a(m7184a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", wfVar.f6715r.f5574i), "@gw_sdkver@", str), "@gw_sessid@", bre.m6322f()), "@gw_seqnum@", wfVar.f6707j), "@gw_adnetstatus@", wfVar.f6717t);
                if (wfVar.f6712o != null) {
                    a2 = m7184a(m7184a(a2, "@gw_adnetid@", wfVar.f6712o.f5546b), "@gw_allocid@", wfVar.f6712o.f5548d);
                }
                String a3 = C1744vy.m8201a(a2, context, wfVar.f6693P);
                zzbv.zzlf();
                C1782xi.m8372a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static void m7187a(Context context, String str, List<String> list, @Nullable String str2, @Nullable String str3, @Nullable zzawd zzawd) {
        if (list != null && !list.isEmpty()) {
            String a = m7183a(str2);
            String a2 = m7183a(str3);
            long a3 = zzbv.zzlm().mo9996a();
            for (String a4 : list) {
                String a5 = m7184a(m7184a(m7184a(a4, "@gw_rwd_userid@", Uri.encode(a)), "@gw_rwd_custom_data@", Uri.encode(a2)), "@gw_tmstmp@", Long.toString(a3));
                if (zzawd != null) {
                    a5 = m7184a(m7184a(a5, "@gw_rwd_itm@", Uri.encode(zzawd.f7125a)), "@gw_rwd_amt@", Integer.toString(zzawd.f7126b));
                }
                zzbv.zzlf();
                C1782xi.m8372a(context, str, a5);
            }
        }
    }

    /* renamed from: a */
    private static String m7184a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    @Nullable
    /* renamed from: a */
    private static String m7183a(@Nullable String str) {
        return (TextUtils.isEmpty(str) || !aab.m1602c()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public static boolean m7188a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
