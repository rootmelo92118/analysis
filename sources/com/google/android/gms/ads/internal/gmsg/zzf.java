package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1339gy;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1744vy;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1839zl;
import com.google.android.gms.internal.ads.adc;
import com.google.android.gms.internal.ads.aej;
import com.google.android.gms.internal.ads.aek;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.agh;
import com.google.android.gms.internal.ads.agp;
import com.google.android.gms.internal.ads.agq;
import com.google.android.gms.internal.ads.agr;
import com.google.android.gms.internal.ads.awy;
import com.google.android.gms.internal.ads.awz;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
public final class zzf {
    public static final zzu<afl> zzdet = zzg.zzdfl;
    public static final zzu<afl> zzdeu = zzh.zzdfl;
    public static final zzu<afl> zzdev = zzi.zzdfl;
    public static final zzu<afl> zzdew = new zzl();
    public static final zzu<afl> zzdex = new zzm();
    public static final zzu<afl> zzdey = zzj.zzdfl;
    public static final zzu<Object> zzdez = new zzn();
    public static final zzu<afl> zzdfa = new zzo();
    public static final zzu<afl> zzdfb = zzk.zzdfl;
    public static final zzu<afl> zzdfc = new zzp();
    public static final zzu<afl> zzdfd = new zzq();
    public static final zzu<adc> zzdfe = new aej();
    public static final zzu<adc> zzdff = new aek();
    public static final zzu<afl> zzdfg = new zze();
    public static final zzae zzdfh = new zzae();
    public static final zzu<afl> zzdfi = new zzr();
    public static final zzu<afl> zzdfj = new zzs();
    public static final zzu<afl> zzdfk = new zzt();

    static final /* synthetic */ void zza(agp agp, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            awy x = agp.mo10391x();
            if (x != null) {
                x.mo11352a().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C1772wz.m1630e("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void zza(agh agh, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C1772wz.m1630e("URL missing from httpTrack GMSG.");
        } else {
            new C1839zl(agh.getContext(), ((agq) agh).mo10180i().f7135a, str).zzyz();
        }
    }

    static final /* synthetic */ void zza(C1339gy gyVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C1772wz.m1630e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            awy x = ((agp) gyVar).mo10391x();
            if (x != null && x.mo11354a(parse)) {
                parse = x.mo11351a(parse, ((agh) gyVar).getContext(), ((agr) gyVar).getView(), ((agh) gyVar).mo10174d());
            }
        } catch (awz unused) {
            String valueOf = String.valueOf(str);
            C1772wz.m1630e(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        agh agh = (agh) gyVar;
        new C1839zl(agh.getContext(), ((agq) gyVar).mo10180i().f7135a, C1744vy.m8199a(parse, agh.getContext())).zzyz();
    }

    static final /* synthetic */ void zzb(agh agh, Map map) {
        PackageManager packageManager = agh.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                C1772wz.m1625b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            C1772wz.m1625b("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        C1772wz.m1625b("Error parsing the intent data.", e3);
                    }
                }
                ((C1339gy) agh).mo10444a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((C1339gy) agh).mo10444a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((C1339gy) agh).mo10444a("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void zzc(agh agh, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C1772wz.m1630e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = agh.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((C1339gy) agh).mo10443a("openableURLs", (Map<String, ?>) hashMap);
    }
}
