package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.ads.C1504na;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1744vy;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.agh;
import com.google.android.gms.internal.ads.agi;
import com.google.android.gms.internal.ads.agm;
import com.google.android.gms.internal.ads.agp;
import com.google.android.gms.internal.ads.agr;
import com.google.android.gms.internal.ads.awy;
import com.google.android.gms.internal.ads.awz;
import java.net.URISyntaxException;
import java.util.Map;

@C1598qn
public final class zzac<T extends agh & agi & agm & agp & agr> implements zzu<T> {
    private final zzw zzdgb;
    private final C1504na zzdgc;

    public zzac(zzw zzw, C1504na naVar) {
        this.zzdgb = zzw;
        this.zzdgc = naVar;
    }

    private static boolean zzg(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzh(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return zzbv.zzlh().mo13235b();
        }
        if ("l".equalsIgnoreCase(str)) {
            return zzbv.zzlh().mo13222a();
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzbv.zzlh().mo13238c();
        }
        return -1;
    }

    private final void zzw(boolean z) {
        if (this.zzdgc != null) {
            this.zzdgc.mo12812a(z);
        }
    }

    static String zza(Context context, awy awy, String str, View view, @Nullable Activity activity) {
        if (awy == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (awy.mo11355b(parse)) {
                parse = awy.mo11351a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (awz unused) {
            return str;
        } catch (Exception e) {
            zzbv.zzlj().mo13119a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        agh agh = (agh) obj;
        String a = C1744vy.m8201a((String) map.get("u"), agh.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            C1772wz.m1630e("Action missing from an open GMSG.");
        } else if (this.zzdgb != null && !this.zzdgb.zzju()) {
            this.zzdgb.zzas(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((agi) agh).mo10393z()) {
                C1772wz.m1630e("Cannot expand WebView that is already expanded.");
                return;
            }
            zzw(false);
            ((agm) agh).mo10445a(zzg(map), zzh(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzw(false);
            if (a != null) {
                ((agm) agh).mo10446a(zzg(map), zzh(map), a);
            } else {
                ((agm) agh).mo10447a(zzg(map), zzh(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzw(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    C1772wz.m1625b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = zza(agh.getContext(), ((agp) agh).mo10391x(), uri, ((agr) agh).getView(), agh.mo10174d());
                    } catch (Exception e2) {
                        C1772wz.m1625b("Error occurred while adding signals.", e2);
                        zzbv.zzlj().mo13119a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String valueOf2 = String.valueOf(uri);
                        C1772wz.m1625b(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e3);
                        zzbv.zzlj().mo13119a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((agm) agh).mo10441a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = zza(agh.getContext(), ((agp) agh).mo10391x(), a, ((agr) agh).getView(), agh.mo10174d());
            }
            ((agm) agh).mo10441a(new zzc((String) map.get("i"), a, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            zzw(true);
            agh.getContext();
            if (TextUtils.isEmpty(a)) {
                C1772wz.m1630e("Destination url cannot be empty.");
                return;
            }
            try {
                ((agm) agh).mo10441a(new zzc(new zzad(agh.getContext(), ((agp) agh).mo10391x(), ((agr) agh).getView()).zzi(map)));
            } catch (ActivityNotFoundException e4) {
                C1772wz.m1630e(e4.getMessage());
            }
        }
    }
}
