package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C1598qn
public final class aej implements zzu<adc> {

    /* renamed from: a */
    private boolean f1518a;

    /* renamed from: a */
    private static int m1868a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                bre.m6317a();
                return C1851zx.m8582a(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                C1772wz.m1630e(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    private static void m1869a(zzbdk zzbdk, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                zzbdk.mo13361b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                C1772wz.m1630e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzbdk.mo13362c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbdk.mo13363d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbdk.mo13364e(Integer.parseInt(str4));
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        adc adc = (adc) obj;
        String str = (String) map.get("action");
        if (str == null) {
            C1772wz.m1630e("Action missing from video GMSG.");
            return;
        }
        if (C1772wz.m1623a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            C1772wz.m1624b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C1772wz.m1630e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                adc.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                C1772wz.m1630e("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    C1772wz.m1630e("No MIME types specified for decoder properties inspection.");
                    zzbdk.m8648a(adc, "missingMimeTypes");
                } else if (Build.VERSION.SDK_INT < 16) {
                    C1772wz.m1630e("Video decoder properties available on API versions >= 16.");
                    zzbdk.m8648a(adc, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, C1849zv.m8572a(str4.trim()));
                    }
                    zzbdk.m8649a(adc, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                act a = adc.mo10166a();
                if (a == null) {
                    C1772wz.m1630e("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = adc.getContext();
                    int a2 = m1868a(context, map, "x", 0);
                    int a3 = m1868a(context, map, "y", 0);
                    int a4 = m1868a(context, map, "w", -1);
                    int a5 = m1868a(context, map, "h", -1);
                    int min = Math.min(a4, adc.mo10182k() - a2);
                    int min2 = Math.min(a5, adc.mo10181j() - a3);
                    try {
                        i = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || a.mo10133a() != null) {
                        a.mo10134a(a2, a3, min, min2);
                        return;
                    }
                    a.mo10135a(a2, a3, min, min2, i, parseBoolean, new adb((String) map.get("flags")));
                    zzbdk a6 = a.mo10133a();
                    if (a6 != null) {
                        m1869a(a6, map);
                        return;
                    }
                    return;
                }
                aga b = adc.mo10172b();
                if (b != null) {
                    if ("timeupdate".equals(str)) {
                        String str5 = (String) map.get("currentTime");
                        if (str5 == null) {
                            C1772wz.m1630e("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            b.mo10462a(Float.parseFloat(str5));
                        } catch (NumberFormatException unused3) {
                            String valueOf = String.valueOf(str5);
                            C1772wz.m1630e(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        }
                    } else if ("skip".equals(str)) {
                        b.mo10479k();
                    }
                }
                zzbdk a7 = a.mo10133a();
                if (a7 == null) {
                    zzbdk.m8647a(adc);
                } else if ("click".equals(str)) {
                    Context context2 = adc.getContext();
                    int a8 = m1868a(context2, map, "x", 0);
                    int a9 = m1868a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    a7.mo13358a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str6 = (String) map.get("time");
                    if (str6 == null) {
                        C1772wz.m1630e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a7.mo13356a((int) (Float.parseFloat(str6) * 1000.0f));
                    } catch (NumberFormatException unused4) {
                        String valueOf2 = String.valueOf(str6);
                        C1772wz.m1630e(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.mo13366h();
                } else if ("loadControl".equals(str)) {
                    m1869a(a7, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        a7.mo13369k();
                    } else {
                        a7.mo13370l();
                    }
                } else if ("pause".equals(str)) {
                    a7.mo13367i();
                } else if ("play".equals(str)) {
                    a7.mo13368j();
                } else if ("show".equals(str)) {
                    a7.setVisibility(0);
                } else if ("src".equals(str)) {
                    a7.mo13359a((String) map.get("src"));
                } else if ("touchMove".equals(str)) {
                    Context context3 = adc.getContext();
                    a7.mo13355a((float) m1868a(context3, map, "dx", 0), (float) m1868a(context3, map, "dy", 0));
                    if (!this.f1518a) {
                        adc.mo10176f();
                        this.f1518a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str7 = (String) map.get("volume");
                    if (str7 == null) {
                        C1772wz.m1630e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a7.setVolume(Float.parseFloat(str7));
                    } catch (NumberFormatException unused5) {
                        String valueOf3 = String.valueOf(str7);
                        C1772wz.m1630e(valueOf3.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf3) : new String("Could not parse volume parameter from volume video GMSG: "));
                    }
                } else if ("watermark".equals(str)) {
                    a7.mo13371m();
                } else {
                    String valueOf4 = String.valueOf(str);
                    C1772wz.m1630e(valueOf4.length() != 0 ? "Unknown video action: ".concat(valueOf4) : new String("Unknown video action: "));
                }
            }
        }
    }
}
