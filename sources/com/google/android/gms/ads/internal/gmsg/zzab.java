package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C0970f;
import com.google.android.gms.internal.ads.C1499mw;
import com.google.android.gms.internal.ads.C1504na;
import com.google.android.gms.internal.ads.C1506nc;
import com.google.android.gms.internal.ads.C1507nd;
import com.google.android.gms.internal.ads.C1515nl;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.bre;
import java.util.Map;

@C1598qn
public final class zzab implements zzu<afl> {
    private static final Map<String, Integer> zzdge = C0970f.m1475a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzw zzdgb;
    private final C1504na zzdgc;
    private final C1515nl zzdgd;

    public zzab(zzw zzw, C1504na naVar, C1515nl nlVar) {
        this.zzdgb = zzw;
        this.zzdgc = naVar;
        this.zzdgd = nlVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        int intValue = zzdge.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && this.zzdgb != null && !this.zzdgb.zzju()) {
            this.zzdgb.zzas((String) null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new C1507nd(afl, map).mo12816a();
                    return;
                case 4:
                    new C1499mw(afl, map).mo12801a();
                    return;
                case 5:
                    new C1506nc(afl, map).mo12815a();
                    return;
                case 6:
                    this.zzdgc.mo12812a(true);
                    return;
                case 7:
                    if (((Boolean) bre.m6321e().mo12778a(C1557p.f5875J)).booleanValue()) {
                        this.zzdgd.zzjv();
                        return;
                    }
                    return;
                default:
                    C1772wz.m1628d("Unknown MRAID command called.");
                    return;
            }
        } else {
            this.zzdgc.mo12811a((Map<String, String>) map);
        }
    }
}
