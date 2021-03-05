package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C0856e;
import com.google.android.gms.common.C0857f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.sd */
public final class C1642sd extends C1768wv {

    /* renamed from: a */
    private static final long f6369a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static final Object f6370b = new Object();
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f6371c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C1366hy f6372d = null;

    /* renamed from: e */
    private static HttpClient f6373e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static zzz f6374f = null;

    /* renamed from: g */
    private static zzu<Object> f6375g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1600qp f6376h;

    /* renamed from: i */
    private final C1624rm f6377i;

    /* renamed from: j */
    private final Object f6378j = new Object();

    /* renamed from: k */
    private final Context f6379k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1383io f6380l;

    /* renamed from: m */
    private bpc f6381m;

    public C1642sd(Context context, C1624rm rmVar, C1600qp qpVar, bpc bpc) {
        super(true);
        this.f6376h = qpVar;
        this.f6379k = context;
        this.f6377i = rmVar;
        this.f6381m = bpc;
        synchronized (f6370b) {
            if (!f6371c) {
                f6374f = new zzz();
                f6373e = new HttpClient(context.getApplicationContext(), rmVar.f6339j);
                f6375g = new C1650sl();
                f6372d = new C1366hy(this.f6379k.getApplicationContext(), this.f6377i.f6339j, (String) bre.m6321e().mo12778a(C1557p.f5892a), new C1649sk(), new C1648sj());
                f6371c = true;
            }
        }
    }

    /* renamed from: a */
    protected static void m7868a(C1355hn hnVar) {
        hnVar.mo12606a("/loadAd", f6374f);
        hnVar.mo12606a("/fetchHttpRequest", f6373e);
        hnVar.mo12606a("/invalidRequest", f6375g);
    }

    /* renamed from: b */
    protected static void m7871b(C1355hn hnVar) {
        hnVar.mo12607b("/loadAd", f6374f);
        hnVar.mo12607b("/fetchHttpRequest", f6373e);
        hnVar.mo12607b("/invalidRequest", f6375g);
    }

    public final void zzki() {
        C1772wz.m1624b("SdkLessAdLoaderBackgroundTask started.");
        String e = zzbv.zzmf().mo13082e(this.f6379k);
        zzasi zzasi = new zzasi(this.f6377i, -1, zzbv.zzmf().mo13078c(this.f6379k), zzbv.zzmf().mo13080d(this.f6379k), e, zzbv.zzmf().mo13084f(this.f6379k));
        zzasm a = m7866a(zzasi);
        if ((a.f7085d == -2 || a.f7085d == 3) && !TextUtils.isEmpty(e)) {
            zzbv.zzmf().mo13085f(this.f6379k, e);
        }
        long b = zzbv.zzlm().mo9997b();
        C1851zx.f6962a.post(new C1643se(this, new C1753wg(zzasi, a, (C1420jy) null, (zzwf) null, a.f7085d, b, a.f7094m, (JSONObject) null, this.f6381m)));
    }

    /* renamed from: a */
    private final zzasm m7866a(zzasi zzasi) {
        zzbv.zzlf();
        String a = C1782xi.m8362a();
        JSONObject a2 = m7867a(zzasi, a);
        if (a2 == null) {
            return new zzasm(0);
        }
        long b = zzbv.zzlm().mo9997b();
        Future<JSONObject> zzbu = f6374f.zzbu(a);
        C1851zx.f6962a.post(new C1644sf(this, a2, a));
        try {
            JSONObject jSONObject = zzbu.get(f6369a - (zzbv.zzlm().mo9997b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzasm(-1);
            }
            zzasm a3 = C1659su.m7888a(this.f6379k, zzasi, jSONObject.toString());
            return (a3.f7085d == -3 || !TextUtils.isEmpty(a3.f7083b)) ? a3 : new zzasm(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzasm(-1);
        } catch (TimeoutException unused2) {
            return new zzasm(2);
        } catch (ExecutionException unused3) {
            return new zzasm(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m7867a(zzasi zzasi, String str) {
        C1663sy syVar;
        AdvertisingIdClient.Info info;
        Bundle bundle = zzasi.f7032c.f7273c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            syVar = zzbv.zzlq().mo12966a(this.f6379k).get();
        } catch (Exception e) {
            C1772wz.m1627c("Error grabbing device info: ", e);
            syVar = null;
        }
        Context context = this.f6379k;
        C1652sn snVar = new C1652sn();
        snVar.f6398i = zzasi;
        snVar.f6399j = syVar;
        JSONObject a = C1659su.m7892a(context, snVar);
        if (a == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.f6379k);
        } catch (C0856e | C0857f | IOException | IllegalStateException e2) {
            C1772wz.m1627c("Cannot get advertising id info", e2);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return zzbv.zzlf().mo13200a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void onStop() {
        synchronized (this.f6378j) {
            C1851zx.f6962a.post(new C1647si(this));
        }
    }
}
