package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1419jx;
import com.google.android.gms.internal.ads.C1420jy;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1440kr;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1680to;
import com.google.android.gms.internal.ads.C1717uy;
import com.google.android.gms.internal.ads.C1718uz;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1805ye;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.bsp;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzay extends bsp {
    private static final Object sLock = new Object();
    @Nullable
    @GuardedBy("sLock")
    private static zzay zzbpr;
    private final Context mContext;
    private final Object mLock = new Object();
    private boolean zzbps;
    private zzbbi zzbpt;

    public static zzay zza(Context context, zzbbi zzbbi) {
        zzay zzay;
        synchronized (sLock) {
            if (zzbpr == null) {
                zzbpr = new zzay(context.getApplicationContext(), zzbbi);
            }
            zzay = zzbpr;
        }
        return zzay;
    }

    public final void zza(C1437ko koVar) {
    }

    public final void zzau(String str) {
    }

    private zzay(Context context, zzbbi zzbbi) {
        this.mContext = context;
        this.zzbpt = zzbbi;
        this.zzbps = false;
    }

    public final void zza() {
        synchronized (sLock) {
            if (this.zzbps) {
                C1772wz.m1630e("Mobile ads is initialized already.");
                return;
            }
            this.zzbps = true;
            C1557p.m7741a(this.mContext);
            zzbv.zzlj().mo13117a(this.mContext, this.zzbpt);
            zzbv.zzll().mo12271a(this.mContext);
        }
    }

    public final void zzat(String str) {
        C1557p.m7741a(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5957bL)).booleanValue()) {
                zzbv.zzln().zza(this.mContext, this.zzbpt, str, (Runnable) null);
            }
        }
    }

    public final void zza(String str, C0719a aVar) {
        if (!TextUtils.isEmpty(str)) {
            C1557p.m7741a(this.mContext);
            boolean booleanValue = ((Boolean) bre.m6321e().mo12778a(C1557p.f5957bL)).booleanValue() | ((Boolean) bre.m6321e().mo12778a(C1557p.f5935aq)).booleanValue();
            zzaz zzaz = null;
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5935aq)).booleanValue()) {
                booleanValue = true;
                zzaz = new zzaz(this, (Runnable) C0722b.m770a(aVar));
            }
            if (booleanValue) {
                zzbv.zzln().zza(this.mContext, this.zzbpt, str, zzaz);
            }
        }
    }

    public final void setAppVolume(float f) {
        zzbv.zzlk().mo13245a(f);
    }

    public final float zzkj() {
        return zzbv.zzlk().mo13244a();
    }

    public final void setAppMuted(boolean z) {
        zzbv.zzlk().mo13246a(z);
    }

    public final boolean zzkk() {
        return zzbv.zzlk().mo13247b();
    }

    public final String zzkl() {
        return this.zzbpt.f7135a;
    }

    public final void zzb(C0719a aVar, String str) {
        if (aVar == null) {
            C1772wz.m1626c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C0722b.m770a(aVar);
        if (context == null) {
            C1772wz.m1626c("Context is null. Failed to open debug menu.");
            return;
        }
        C1805ye yeVar = new C1805ye(context);
        yeVar.mo13251a(str);
        yeVar.mo13254b(this.zzbpt.f7135a);
        yeVar.mo13248a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Runnable runnable) {
        Context context = this.mContext;
        C0926p.m1315b("Adapters must be initialized on the main thread.");
        Map<String, C1420jy> e = zzbv.zzlj().mo13131k().mo13187h().mo13115e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C1772wz.m1627c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C1680to a = C1680to.m7968a();
            if (a != null) {
                Collection<C1420jy> values = e.values();
                HashMap hashMap = new HashMap();
                C0719a a2 = C0722b.m769a(context);
                for (C1420jy jyVar : values) {
                    for (C1419jx next : jyVar.f5566a) {
                        String str = next.f5555k;
                        for (String next2 : next.f5547c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        C1717uy a3 = a.mo12994a(str2);
                        if (a3 != null) {
                            C1440kr a4 = a3.mo13047a();
                            if (!a4.mo12698g()) {
                                if (a4.mo12704m()) {
                                    a4.mo12683a(a2, (C1718uz) a3.mo13048b(), (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    C1772wz.m1624b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        C1772wz.m1627c(sb.toString(), th2);
                    }
                }
            }
        }
    }
}
