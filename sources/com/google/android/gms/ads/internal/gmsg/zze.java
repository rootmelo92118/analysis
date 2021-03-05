package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import java.util.Map;

@C1598qn
public final class zze implements zzu<afl> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C1772wz.m1630e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C1772wz.m1630e("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = zzbv.zzlm().mo9997b() + (Long.parseLong(str4) - zzbv.zzlm().mo9996a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    afl.mo10179h().mo10055a(str2, str3, b);
                } catch (NumberFormatException e) {
                    C1772wz.m1627c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C1772wz.m1630e("No value given for CSI experiment.");
                return;
            }
            C1019ad a = afl.mo10179h().mo10053a();
            if (a == null) {
                C1772wz.m1630e("No ticker for WebView, dropping experiment ID.");
            } else {
                a.mo10153a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                C1772wz.m1630e("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                C1772wz.m1630e("No name given for CSI extra.");
            } else {
                C1019ad a2 = afl.mo10179h().mo10053a();
                if (a2 == null) {
                    C1772wz.m1630e("No ticker for WebView, dropping extra parameter.");
                } else {
                    a2.mo10153a(str6, str7);
                }
            }
        }
    }
}
