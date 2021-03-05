package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.kb */
public final class C1424kb implements C1428kf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f5593a;

    /* renamed from: b */
    private final C1437ko f5594b;

    /* renamed from: c */
    private final long f5595c;

    /* renamed from: d */
    private final C1420jy f5596d;

    /* renamed from: e */
    private final C1419jx f5597e;

    /* renamed from: f */
    private zzwb f5598f;

    /* renamed from: g */
    private final zzwf f5599g;

    /* renamed from: h */
    private final Context f5600h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f5601i = new Object();

    /* renamed from: j */
    private final zzbbi f5602j;

    /* renamed from: k */
    private final boolean f5603k;

    /* renamed from: l */
    private final zzacp f5604l;

    /* renamed from: m */
    private final List<String> f5605m;

    /* renamed from: n */
    private final List<String> f5606n;

    /* renamed from: o */
    private final List<String> f5607o;

    /* renamed from: p */
    private final boolean f5608p;

    /* renamed from: q */
    private final boolean f5609q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public C1440kr f5610r;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: s */
    public int f5611s = -2;

    /* renamed from: t */
    private C1446kx f5612t;

    public C1424kb(Context context, String str, C1437ko koVar, C1420jy jyVar, C1419jx jxVar, zzwb zzwb, zzwf zzwf, zzbbi zzbbi, boolean z, boolean z2, zzacp zzacp, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        C1420jy jyVar2 = jyVar;
        C1419jx jxVar2 = jxVar;
        this.f5600h = context;
        this.f5594b = koVar;
        this.f5597e = jxVar2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f5593a = m7166b();
        } else {
            this.f5593a = str2;
        }
        this.f5596d = jyVar2;
        if (jxVar2.f5564t != -1) {
            this.f5595c = jxVar2.f5564t;
        } else if (jyVar2.f5567b != -1) {
            this.f5595c = jyVar2.f5567b;
        } else {
            this.f5595c = 10000;
        }
        this.f5598f = zzwb;
        this.f5599g = zzwf;
        this.f5602j = zzbbi;
        this.f5603k = z;
        this.f5608p = z2;
        this.f5604l = zzacp;
        this.f5605m = list;
        this.f5606n = list2;
        this.f5607o = list3;
        this.f5609q = z3;
    }

    /* renamed from: a */
    public final void mo12668a() {
        synchronized (this.f5601i) {
            try {
                if (this.f5610r != null) {
                    this.f5610r.mo12694c();
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Could not destroy mediation adapter.", e);
            }
            this.f5611s = -1;
            this.f5601i.notify();
        }
    }

    /* renamed from: b */
    private final String m7166b() {
        try {
            return (TextUtils.isEmpty(this.f5597e.f5549e) || !this.f5594b.mo12679b(this.f5597e.f5549e)) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (RemoteException unused) {
            C1772wz.m1630e("Fail to determine the custom event's version, assuming the old one.");
            return "com.google.ads.mediation.customevent.CustomEventAdapter";
        }
    }

    /* renamed from: a */
    public final void mo12669a(int i) {
        synchronized (this.f5601i) {
            this.f5611s = i;
            this.f5601i.notify();
        }
    }

    /* renamed from: a */
    public final void mo12670a(int i, C1446kx kxVar) {
        synchronized (this.f5601i) {
            this.f5611s = 0;
            this.f5612t = kxVar;
            this.f5601i.notify();
        }
    }

    /* renamed from: a */
    private static C1440kr m7157a(MediationAdapter mediationAdapter) {
        return new C1462lm(mediationAdapter);
    }

    /* renamed from: a */
    public final C1427ke mo12667a(long j, long j2) {
        C1427ke keVar;
        synchronized (this.f5601i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1423ka kaVar = new C1423ka();
            C1782xi.f6838a.post(new C1425kc(this, kaVar));
            long j3 = this.f5595c;
            while (this.f5611s == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                long j5 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    C1772wz.m1628d("Timed out waiting for adapter.");
                    this.f5611s = 3;
                } else {
                    try {
                        this.f5601i.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.f5611s = 5;
                    }
                }
            }
            keVar = new C1427ke(this.f5597e, this.f5610r, this.f5593a, kaVar, this.f5611s, m7169c(), zzbv.zzlm().mo9997b() - elapsedRealtime);
        }
        return keVar;
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    private final C1446kx m7169c() {
        if (this.f5611s != 0 || !m7172e()) {
            return null;
        }
        try {
            if (!(!m7167b(4) || this.f5612t == null || this.f5612t.mo12672a() == 0)) {
                return this.f5612t;
            }
        } catch (RemoteException unused) {
            C1772wz.m1630e("Could not get cpm value from MediationResponseMetadata");
        }
        return new C1426kd(m7174f());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final C1440kr m7170d() {
        String valueOf = String.valueOf(this.f5593a);
        C1772wz.m1628d(valueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(valueOf) : new String("Instantiating mediation adapter: "));
        if (!this.f5603k && !this.f5597e.mo12643b()) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5593a)) {
                return m7157a((MediationAdapter) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(this.f5593a)) {
                return m7157a((MediationAdapter) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f5593a)) {
                return new C1462lm(new zzanu());
            }
        }
        try {
            return this.f5594b.mo12677a(this.f5593a);
        } catch (RemoteException e) {
            String valueOf2 = String.valueOf(this.f5593a);
            C1772wz.m1622a(valueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(valueOf2) : new String("Could not instantiate mediation adapter: "), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m7161a(C1423ka kaVar) {
        String a = m7160a(this.f5597e.f5555k);
        try {
            if (this.f5602j.f7137c >= 4100000) {
                if (!this.f5603k) {
                    if (!this.f5597e.mo12643b()) {
                        if (this.f5599g.f7295d) {
                            this.f5610r.mo12686a(C0722b.m769a(this.f5600h), this.f5598f, a, this.f5597e.f5545a, (C1443ku) kaVar);
                            return;
                        } else if (!this.f5608p) {
                            this.f5610r.mo12689a(C0722b.m769a(this.f5600h), this.f5599g, this.f5598f, a, this.f5597e.f5545a, kaVar);
                            return;
                        } else if (this.f5597e.f5559o != null) {
                            this.f5610r.mo12687a(C0722b.m769a(this.f5600h), this.f5598f, a, this.f5597e.f5545a, kaVar, new zzacp(m7165b(this.f5597e.f5563s)), this.f5597e.f5562r);
                            return;
                        } else {
                            this.f5610r.mo12689a(C0722b.m769a(this.f5600h), this.f5599g, this.f5598f, a, this.f5597e.f5545a, kaVar);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f5605m);
                if (this.f5606n != null) {
                    for (String next : this.f5606n) {
                        String str = ":false";
                        if (this.f5607o != null && this.f5607o.contains(next)) {
                            str = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 7 + String.valueOf(str).length());
                        sb.append("custom:");
                        sb.append(next);
                        sb.append(str);
                        arrayList.add(sb.toString());
                    }
                }
                this.f5610r.mo12687a(C0722b.m769a(this.f5600h), this.f5598f, a, this.f5597e.f5545a, kaVar, this.f5604l, arrayList);
            } else if (this.f5599g.f7295d) {
                this.f5610r.mo12684a(C0722b.m769a(this.f5600h), this.f5598f, a, kaVar);
            } else {
                this.f5610r.mo12688a(C0722b.m769a(this.f5600h), this.f5599g, this.f5598f, a, (C1443ku) kaVar);
            }
        } catch (RemoteException e) {
            C1772wz.m1627c("Could not request ad from mediation adapter.", e);
            mo12669a(5);
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m7167b(int i) {
        Bundle bundle;
        try {
            if (this.f5603k) {
                bundle = this.f5610r.mo12703l();
            } else if (this.f5599g.f7295d) {
                bundle = this.f5610r.mo12702k();
            } else {
                bundle = this.f5610r.mo12701j();
            }
            if (bundle == null || (bundle.getInt("capabilities", 0) & i) != i) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
            C1772wz.m1630e("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m7172e() {
        return this.f5596d.f5578m != -1;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final String m7160a(String str) {
        if (str == null || !m7172e() || m7167b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException unused) {
            C1772wz.m1630e("Could not remove field. Returning the original value");
            return str;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final int m7174f() {
        if (this.f5597e.f5555k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f5597e.f5555k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5593a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m7167b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                return jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            C1772wz.m1630e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: b */
    private static NativeAdOptions m7165b(String str) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (JSONException e) {
            C1772wz.m1627c("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }
}
