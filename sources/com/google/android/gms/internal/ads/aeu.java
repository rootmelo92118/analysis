package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONObject;

@C1598qn
public final class aeu implements zzu<adc> {
    /* renamed from: a */
    private static Integer m1891a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            C1772wz.m1630e(sb.toString());
            return null;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        aeo aeo;
        adc adc = (adc) obj;
        if (C1772wz.m1623a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            C1772wz.m1624b(sb.toString());
        }
        zzbv.zzmd();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                ael b = aen.m1871b(adc);
                if (b != null) {
                    aeo = b.f1520b;
                } else {
                    C1772wz.m1630e("Precache must specify a source.");
                    return;
                }
            } else if (aen.m1871b(adc) != null) {
                C1772wz.m1630e("Precache task is already running.");
                return;
            } else if (adc.mo10175e() == null) {
                C1772wz.m1630e("Precache requires a dependency provider.");
                return;
            } else {
                adb adb = new adb((String) map.get("flags"));
                Integer a = m1891a(map, "player");
                if (a == null) {
                    a = 0;
                }
                aeo = adc.mo10175e().zzbms.mo10281a(adc, a.intValue(), (String) null, adb);
                new ael(adc, aeo, str).zzwa();
            }
            Integer a2 = m1891a(map, "minBufferMs");
            if (a2 != null) {
                aeo.mo10296c(a2.intValue());
            }
            Integer a3 = m1891a(map, "maxBufferMs");
            if (a3 != null) {
                aeo.mo10288a(a3.intValue());
            }
            Integer a4 = m1891a(map, "bufferForPlaybackMs");
            if (a4 != null) {
                aeo.mo10297d(a4.intValue());
            }
            Integer a5 = m1891a(map, "bufferForPlaybackAfterRebufferMs");
            if (a5 != null) {
                aeo.mo10298e(a5.intValue());
            }
        } else if (!aen.m1870a(adc)) {
            C1772wz.m1630e("Precache abort but no precache task running.");
        }
    }
}
