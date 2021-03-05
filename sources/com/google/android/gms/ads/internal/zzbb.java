package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p034v4.util.SimpleArrayMap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1068ap;
import com.google.android.gms.internal.ads.C1084as;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1123ay;
import com.google.android.gms.internal.ads.C1127bb;
import com.google.android.gms.internal.ads.C1130be;
import com.google.android.gms.internal.ads.C1132bf;
import com.google.android.gms.internal.ads.C1133bg;
import com.google.android.gms.internal.ads.C1134bh;
import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1210ce;
import com.google.android.gms.internal.ads.C1233da;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1247do;
import com.google.android.gms.internal.ads.C1420jy;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1440kr;
import com.google.android.gms.internal.ads.C1450la;
import com.google.android.gms.internal.ads.C1453ld;
import com.google.android.gms.internal.ads.C1456lg;
import com.google.android.gms.internal.ads.C1526nw;
import com.google.android.gms.internal.ads.C1543om;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1575pr;
import com.google.android.gms.internal.ads.C1579pv;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1780xg;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.abg;
import com.google.android.gms.internal.ads.abq;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.bls;
import com.google.android.gms.internal.ads.bnb;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.bte;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzbb extends zzc implements C1134bh {
    private final Object mLock;
    private boolean zzbme;
    private boolean zzbpv;
    private abq<C1135bi> zzbpw;
    private afl zzbpx;
    @Nullable
    private afl zzbpy;
    private int zzbpz;
    @GuardedBy("mLock")
    private C1575pr zzbqa;
    private final String zzbqb;

    public zzbb(Context context, zzv zzv, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi) {
        this(context, zzv, zzwf, str, koVar, zzbbi, false);
    }

    public zzbb(Context context, zzv zzv, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi, boolean z) {
        super(context, zzwf, str, koVar, zzbbi, zzv);
        this.mLock = new Object();
        this.zzbpw = new abq<>();
        this.zzbpz = 1;
        this.zzbqb = UUID.randomUUID().toString();
        this.zzbpv = z;
    }

    public final String getUuid() {
        return this.zzbqb;
    }

    public final boolean zza(zzwb zzwb, C1019ad adVar) {
        try {
            zzkm();
            return super.zza(zzwb, adVar, this.zzbpz);
        } catch (Exception e) {
            if (!aai.m1623a(4)) {
                return false;
            }
            Log.i("Ads", "Error initializing webview.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzkm() {
        synchronized (this.mLock) {
            C1772wz.m8287a("Initializing webview native ads utills");
            this.zzbqa = new C1579pv(this.zzbls.zzsp, this, this.zzbqb, this.zzbls.zzbso, this.zzbls.zzbsp);
        }
    }

    @Nullable
    public final C1575pr zzkn() {
        C1575pr prVar;
        synchronized (this.mLock) {
            prVar = this.zzbqa;
        }
        return prVar;
    }

    public final void zza(C1753wg wgVar, C1019ad adVar) {
        if (wgVar.f6727d != null) {
            this.zzbls.zzbst = wgVar.f6727d;
        }
        if (wgVar.f6728e != -2) {
            C1782xi.f6838a.post(new zzbc(this, wgVar));
            return;
        }
        int i = wgVar.f6724a.f7021Y;
        if (i == 1) {
            this.zzbls.zzbtw = 0;
            zzbw zzbw = this.zzbls;
            zzbv.zzle();
            zzbw.zzbss = C1543om.m7705a(this.zzbls.zzsp, this, wgVar, this.zzbls.zzbso, (afl) null, this.zzbma, this, adVar);
            String valueOf = String.valueOf(this.zzbls.zzbss.getClass().getName());
            C1772wz.m1624b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(wgVar.f6725b.f7083b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray optJSONArray = jSONArray2.getJSONObject(i2).optJSONArray("ads");
                int i3 = 0;
                while (optJSONArray != null && i3 < optJSONArray.length()) {
                    jSONArray.put(optJSONArray.get(i3));
                    i3++;
                }
            }
            zzkt();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(C1780xg.m8354a(new zzbe(this, i4, jSONArray, i, wgVar)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C1782xi.f6838a.post(new zzbf(this, (C1135bi) ((abg) arrayList.get(i5)).get(((Long) bre.m6321e().mo12778a(C1557p.f5974bc)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    aai.m1627c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    aai.m1627c("", e2);
                }
            }
        } catch (JSONException e3) {
            C1772wz.m1627c("Malformed native ad response", e3);
            zzbr(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzbr(int i) {
        zzg(i, false);
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i, boolean z) {
        zzkt();
        super.zzg(i, z);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzwb zzwb, C1752wf wfVar, boolean z) {
        return this.zzblr.zzkv();
    }

    /* access modifiers changed from: protected */
    public final boolean zza(C1752wf wfVar, C1752wf wfVar2) {
        C1752wf wfVar3 = wfVar2;
        View view = null;
        zzd((List<String>) null);
        if (this.zzbls.zzmj()) {
            if (wfVar3.f6711n) {
                zzkt();
                try {
                    C1456lg p = wfVar3.f6713p != null ? wfVar3.f6713p.mo12707p() : null;
                    C1450la h = wfVar3.f6713p != null ? wfVar3.f6713p.mo12699h() : null;
                    C1453ld i = wfVar3.f6713p != null ? wfVar3.f6713p.mo12700i() : null;
                    C1233da n = wfVar3.f6713p != null ? wfVar3.f6713p.mo12705n() : null;
                    String zzc = zzc(wfVar2);
                    if (p != null && this.zzbls.zzbte != null) {
                        String a = p.mo12748a();
                        List b = p.mo12751b();
                        String c = p.mo12753c();
                        C1210ce d = p.mo12754d() != null ? p.mo12754d() : null;
                        String e = p.mo12755e();
                        String f = p.mo12756f();
                        double g = p.mo12757g();
                        String h2 = p.mo12758h();
                        String i2 = p.mo12759i();
                        btb j = p.mo12760j();
                        if (p.mo12763m() != null) {
                            view = (View) C0722b.m770a(p.mo12763m());
                        }
                        C1127bb bbVar = new C1127bb(a, b, c, d, e, f, g, h2, i2, (C1068ap) null, j, view, p.mo12764n(), zzc, p.mo12765o());
                        bbVar.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, p, (C1135bi) bbVar));
                        zza(bbVar);
                    } else if (h != null && this.zzbls.zzbte != null) {
                        String a2 = h.mo12708a();
                        List b2 = h.mo12711b();
                        String c2 = h.mo12713c();
                        C1210ce d2 = h.mo12715d() != null ? h.mo12715d() : null;
                        String e2 = h.mo12716e();
                        double f2 = h.mo12717f();
                        String g2 = h.mo12718g();
                        String h3 = h.mo12719h();
                        btb m = h.mo12724m();
                        if (h.mo12727p() != null) {
                            view = (View) C0722b.m770a(h.mo12727p());
                        }
                        C1127bb bbVar2 = new C1127bb(a2, b2, c2, d2, e2, (String) null, f2, g2, h3, (C1068ap) null, m, view, h.mo12728q(), zzc, h.mo12723l());
                        bbVar2.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, h, (C1135bi) bbVar2));
                        zza(bbVar2);
                    } else if (h != null && this.zzbls.zzbtc != null) {
                        String a3 = h.mo12708a();
                        List b3 = h.mo12711b();
                        String c3 = h.mo12713c();
                        C1210ce d3 = h.mo12715d() != null ? h.mo12715d() : null;
                        String e3 = h.mo12716e();
                        double f3 = h.mo12717f();
                        String g3 = h.mo12718g();
                        String h4 = h.mo12719h();
                        Bundle l = h.mo12723l();
                        btb m2 = h.mo12724m();
                        if (h.mo12727p() != null) {
                            view = (View) C0722b.m770a(h.mo12727p());
                        }
                        C1090au auVar = new C1090au(a3, b3, c3, d3, e3, f3, g3, h4, (C1068ap) null, l, m2, view, h.mo12728q(), zzc);
                        auVar.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, h, (C1135bi) auVar));
                        zza(auVar);
                    } else if (i != null && this.zzbls.zzbte != null) {
                        String a4 = i.mo12729a();
                        List b4 = i.mo12732b();
                        String c4 = i.mo12734c();
                        C1210ce d4 = i.mo12736d() != null ? i.mo12736d() : null;
                        String e4 = i.mo12737e();
                        String f4 = i.mo12738f();
                        btb l2 = i.mo12744l();
                        if (i.mo12746n() != null) {
                            view = (View) C0722b.m770a(i.mo12746n());
                        }
                        C1127bb bbVar3 = new C1127bb(a4, b4, c4, d4, e4, f4, -1.0d, (String) null, (String) null, (C1068ap) null, l2, view, i.mo12747o(), zzc, i.mo12742j());
                        C1453ld ldVar = i;
                        C1127bb bbVar4 = bbVar3;
                        bbVar4.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, ldVar, (C1135bi) bbVar3));
                        zza(bbVar4);
                    } else if (i != null && this.zzbls.zzbtd != null) {
                        String a5 = i.mo12729a();
                        List b5 = i.mo12732b();
                        String c5 = i.mo12734c();
                        C1210ce d5 = i.mo12736d() != null ? i.mo12736d() : null;
                        String e5 = i.mo12737e();
                        String f5 = i.mo12738f();
                        Bundle j2 = i.mo12742j();
                        btb l3 = i.mo12744l();
                        if (i.mo12746n() != null) {
                            view = (View) C0722b.m770a(i.mo12746n());
                        }
                        C1120aw awVar = new C1120aw(a5, b5, c5, d5, e5, f5, (C1068ap) null, j2, l3, view, i.mo12747o(), zzc);
                        C1453ld ldVar2 = i;
                        C1120aw awVar2 = awVar;
                        awVar2.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, ldVar2, (C1135bi) awVar));
                        zza(awVar2);
                    } else if (n == null || this.zzbls.zzbth == null || this.zzbls.zzbth.get(n.mo11093b()) == null) {
                        C1772wz.m1630e("No matching mapper/listener for retrieved native ad template.");
                        zzbr(0);
                        return false;
                    } else {
                        C1782xi.f6838a.post(new zzbk(this, n));
                    }
                } catch (RemoteException e6) {
                    C1772wz.m1629d("#007 Could not call remote method.", e6);
                }
            } else {
                C1135bi biVar = wfVar3.f6680C;
                if (this.zzbpv) {
                    zzd("Google", wfVar3.f6691N);
                    this.zzbpw.mo10087b(biVar);
                } else {
                    boolean z = biVar instanceof C1120aw;
                    if (z && this.zzbls.zzbte != null) {
                        zzd("Google", wfVar3.f6691N);
                        zza(zza(wfVar3.f6680C));
                    } else if (!z || this.zzbls.zzbtd == null) {
                        boolean z2 = biVar instanceof C1090au;
                        if (z2 && this.zzbls.zzbte != null) {
                            zzd("Google", wfVar3.f6691N);
                            zza(zza(wfVar3.f6680C));
                        } else if (!z2 || this.zzbls.zzbtc == null) {
                            if ((biVar instanceof C1123ay) && this.zzbls.zzbth != null) {
                                C1123ay ayVar = (C1123ay) biVar;
                                if (this.zzbls.zzbth.get(ayVar.mo11093b()) != null) {
                                    C1782xi.f6838a.post(new zzbj(this, ayVar.mo11093b(), wfVar3));
                                }
                            }
                            if (!(biVar instanceof C1084as) || this.zzbls.zzbtf == null) {
                                C1772wz.m1630e("No matching listener for retrieved native ad template.");
                                zzbr(0);
                                return false;
                            }
                            C1782xi.f6838a.post(new zzbd(this, (C1084as) biVar));
                        } else {
                            zzd("Google", wfVar3.f6691N);
                            zza((C1090au) wfVar3.f6680C);
                        }
                    } else {
                        zzd("Google", wfVar3.f6691N);
                        zza((C1120aw) wfVar3.f6680C);
                    }
                }
            }
            return super.zza(wfVar, wfVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* access modifiers changed from: protected */
    public final void zzb(@Nullable C0719a aVar) {
        Object a = aVar != null ? C0722b.m770a(aVar) : null;
        if (a instanceof C1133bg) {
            ((C1133bg) a).mo11793e();
        }
        super.zzb(this.zzbls.zzbsu, false);
    }

    /* access modifiers changed from: protected */
    public final Future<C1135bi> zzko() {
        return this.zzbpw;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    private final void zza(C1090au auVar) {
        C1782xi.f6838a.post(new zzbg(this, auVar));
    }

    private final void zza(C1127bb bbVar) {
        C1782xi.f6838a.post(new zzbh(this, bbVar));
    }

    private final void zza(C1120aw awVar) {
        C1782xi.f6838a.post(new zzbi(this, awVar));
    }

    private final void zzd(String str, boolean z) {
        String str2;
        if (z) {
            if (this.zzbpy != null || this.zzbpx != null) {
                boolean z2 = false;
                boolean z3 = this.zzbpy != null;
                if (this.zzbpx != null) {
                    z2 = true;
                }
                afl afl = null;
                if (z3) {
                    str2 = null;
                    afl = this.zzbpy;
                } else if (z2) {
                    afl = this.zzbpx;
                    str2 = "javascript";
                } else {
                    str2 = null;
                }
                if (afl.getWebView() != null && zzbv.zzlw().mo12836a(this.zzbls.zzsp)) {
                    int i = this.zzbls.zzbsp.f7136b;
                    int i2 = this.zzbls.zzbsp.f7137c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.zzblx = zzbv.zzlw().mo12833a(sb.toString(), afl.getWebView(), "", "javascript", str2, str);
                    if (this.zzblx != null) {
                        afl.mo10343a(this.zzblx);
                        if (z2) {
                            C0719a aVar = this.zzblx;
                            View view = this.zzbpx.getView();
                            if (view != null) {
                                zzbv.zzlw().mo12835a(aVar, view);
                            }
                        }
                        zzbv.zzlw().mo12834a(this.zzblx);
                    }
                }
            }
        }
    }

    private final boolean zzjj() {
        return this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6691N;
    }

    public final void zzi(View view) {
        boolean z = this.zzbpy != null;
        if (zzjj() && this.zzblx != null && z && view != null) {
            zzbv.zzlw().mo12835a(this.zzblx, view);
        }
    }

    public final void zzjl() {
        if (zzjj() && this.zzblx != null) {
            afl afl = null;
            if (this.zzbpy != null) {
                afl = this.zzbpy;
            } else if (this.zzbpx != null) {
                afl = this.zzbpx;
            }
            if (afl != null) {
                afl.mo10443a("onSdkImpression", (Map<String, ?>) new HashMap());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzil() {
        zzm(false);
    }

    /* access modifiers changed from: protected */
    public final void zzm(boolean z) {
        super.zzm(z);
        if (this.zzbme) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5948bC)).booleanValue()) {
                zzkp();
            }
        }
    }

    public final void zza(C1133bg bgVar) {
        if (this.zzbls.zzbsu.f6708k != null && this.zzbls.zzbtk == null) {
            zzbv.zzlj().mo13126f().mo12148a(this.zzbls.zzbst, this.zzbls.zzbsu, (bnb) new bls(bgVar), (afl) null);
        }
    }

    public final void zzkp() {
        if (this.zzbls.zzbsu == null || this.zzbpx == null) {
            this.zzbme = true;
            C1772wz.m1630e("Request to enable ActiveView before adState is available.");
            return;
        }
        zzbv.zzlj().mo13126f().mo12147a(this.zzbls.zzbst, this.zzbls.zzbsu, this.zzbpx.getView(), this.zzbpx);
        this.zzbme = false;
    }

    public final void zzkq() {
        this.zzbme = false;
        if (this.zzbls.zzbsu == null || this.zzbpx == null) {
            C1772wz.m1630e("Request to enable ActiveView before adState is available.");
        } else {
            zzbv.zzlj().mo13126f().mo12144a(this.zzbls.zzbsu);
        }
    }

    public final String getAdUnitId() {
        return this.zzbls.zzbsn;
    }

    public final void zzd(@Nullable List<String> list) {
        C0926p.m1315b("setNativeTemplates must be called on the main UI thread.");
        this.zzbls.zzbtt = list;
    }

    @Nullable
    public final C1244dl zzar(String str) {
        C0926p.m1315b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.zzbls.zzbtg == null) {
            return null;
        }
        return this.zzbls.zzbtg.get(str);
    }

    public final SimpleArrayMap<String, C1247do> zzkr() {
        C0926p.m1315b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzbls.zzbth;
    }

    public final void zzbs(int i) {
        C0926p.m1315b("setMaxNumberOfAds must be called on the main UI thread.");
        this.zzbpz = i;
    }

    public final void zzf(afl afl) {
        this.zzbpx = afl;
    }

    public final void zzg(@Nullable afl afl) {
        this.zzbpy = afl;
    }

    public final void zzjn() {
        if (this.zzbpx != null) {
            this.zzbpx.destroy();
            this.zzbpx = null;
        }
    }

    public final void zzjm() {
        this.zzblx = null;
        if (this.zzbpy != null) {
            this.zzbpy.destroy();
            this.zzbpy = null;
        }
    }

    public final void zza(C1130be beVar) {
        if (this.zzbpx != null) {
            this.zzbpx.mo10346a(beVar);
        }
    }

    public final void zzks() {
        if (this.zzbpx != null && this.zzbpx.mo10172b() != null && this.zzbls.zzbti != null && this.zzbls.zzbti.f6977f != null) {
            this.zzbpx.mo10172b().mo10466a(this.zzbls.zzbti.f6977f);
        } else if (this.zzbls.zzbtf != null && this.zzbpx != null && this.zzbpx.mo10172b() != null) {
            this.zzbpx.mo10172b().mo10469a(false, true, false);
        }
    }

    public final boolean zzjo() {
        if (zzjr() != null) {
            return zzjr().f5581p;
        }
        return false;
    }

    public final boolean zzjp() {
        if (zzjr() != null) {
            return zzjr().f5582q;
        }
        return false;
    }

    public final boolean zzjq() {
        if (zzjr() != null) {
            return zzjr().f5583r;
        }
        return false;
    }

    @Nullable
    private final C1420jy zzjr() {
        if (this.zzbls.zzbsu == null || !this.zzbls.zzbsu.f6711n) {
            return null;
        }
        return this.zzbls.zzbsu.f6715r;
    }

    public final void zza(C1526nw nwVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void zza(C1026aj ajVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zziy() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.f6714q)) {
            super.zziy();
        } else {
            zzin();
        }
    }

    public final void zzjd() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.f6714q)) {
            super.zzjd();
        } else {
            zzim();
        }
    }

    public final void zzix() {
        bte g;
        C1752wf wfVar = this.zzbls.zzbsu;
        if (wfVar.f6713p == null) {
            super.zzix();
            return;
        }
        try {
            C1440kr krVar = wfVar.f6713p;
            btb btb = null;
            C1450la h = krVar.mo12699h();
            if (h != null) {
                btb = h.mo12724m();
            } else {
                C1453ld i = krVar.mo12700i();
                if (i != null) {
                    btb = i.mo12744l();
                } else {
                    C1233da n = krVar.mo12705n();
                    if (n != null) {
                        btb = n.mo11412g();
                    }
                }
            }
            if (btb != null && (g = btb.mo10475g()) != null) {
                g.mo12354d();
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C1127bb zza(com.google.android.gms.internal.ads.C1135bi r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C1120aw
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.aw r0 = (com.google.android.gms.internal.ads.C1120aw) r0
            com.google.android.gms.internal.ads.bb r1 = new com.google.android.gms.internal.ads.bb
            r3 = r1
            java.lang.String r4 = r0.mo11328e()
            java.util.List r5 = r0.mo11236f()
            java.lang.String r6 = r0.mo11331i()
            com.google.android.gms.internal.ads.ce r7 = r0.mo11332j()
            java.lang.String r8 = r0.mo11333k()
            java.lang.String r9 = r0.mo11334l()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.ap r14 = r0.mo11094c()
            com.google.android.gms.internal.ads.btb r15 = r0.mo11335m()
            android.view.View r16 = r0.mo11095d()
            com.google.android.gms.a.a r17 = r0.mo11329g()
            java.lang.String r18 = r0.mo11330h()
            android.os.Bundle r19 = r0.mo11337o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.a.a r3 = r0.mo11336n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.a.a r0 = r0.mo11336n()
            java.lang.Object r0 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r0)
        L_0x0051:
            r2 = r0
            goto L_0x00a8
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C1090au
            if (r1 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.au r0 = (com.google.android.gms.internal.ads.C1090au) r0
            com.google.android.gms.internal.ads.bb r1 = new com.google.android.gms.internal.ads.bb
            r3 = r1
            java.lang.String r4 = r0.mo11235e()
            java.util.List r5 = r0.mo11236f()
            java.lang.String r6 = r0.mo11237g()
            com.google.android.gms.internal.ads.ce r7 = r0.mo11238h()
            java.lang.String r8 = r0.mo11239i()
            r9 = 0
            double r10 = r0.mo11240j()
            java.lang.String r12 = r0.mo11241k()
            java.lang.String r13 = r0.mo11242l()
            com.google.android.gms.internal.ads.ap r14 = r0.mo11094c()
            com.google.android.gms.internal.ads.btb r15 = r0.mo11243m()
            android.view.View r16 = r0.mo11095d()
            com.google.android.gms.a.a r17 = r0.mo11246p()
            java.lang.String r18 = r0.mo11247q()
            android.os.Bundle r19 = r0.mo11245o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.a.a r3 = r0.mo11244n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.a.a r0 = r0.mo11244n()
            java.lang.Object r0 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r0)
            goto L_0x0051
        L_0x00a7:
            r1 = r2
        L_0x00a8:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.C1137bk
            if (r0 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.bk r2 = (com.google.android.gms.internal.ads.C1137bk) r2
            r1.mo11092a((com.google.android.gms.internal.ads.C1133bg) r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbb.zza(com.google.android.gms.internal.ads.bi):com.google.android.gms.internal.ads.bb");
    }

    /* access modifiers changed from: private */
    public static void zza(zzbw zzbw, zzbw zzbw2) {
        if (zzbw2.zzbtc == null) {
            zzbw2.zzbtc = zzbw.zzbtc;
        }
        if (zzbw2.zzbtd == null) {
            zzbw2.zzbtd = zzbw.zzbtd;
        }
        if (zzbw2.zzbtg == null) {
            zzbw2.zzbtg = zzbw.zzbtg;
        }
        if (zzbw2.zzbth == null) {
            zzbw2.zzbth = zzbw.zzbth;
        }
        if (zzbw2.zzbtj == null) {
            zzbw2.zzbtj = zzbw.zzbtj;
        }
        if (zzbw2.zzbti == null) {
            zzbw2.zzbti = zzbw.zzbti;
        }
        if (zzbw2.zzbtt == null) {
            zzbw2.zzbtt = zzbw.zzbtt;
        }
        if (zzbw2.zzbsw == null) {
            zzbw2.zzbsw = zzbw.zzbsw;
        }
        if (zzbw2.zzbtu == null) {
            zzbw2.zzbtu = zzbw.zzbtu;
        }
        if (zzbw2.zzbsx == null) {
            zzbw2.zzbsx = zzbw.zzbsx;
        }
        if (zzbw2.zzbsy == null) {
            zzbw2.zzbsy = zzbw.zzbsy;
        }
        if (zzbw2.zzbst == null) {
            zzbw2.zzbst = zzbw.zzbst;
        }
        if (zzbw2.zzbsu == null) {
            zzbw2.zzbsu = zzbw.zzbsu;
        }
        if (zzbw2.zzbsv == null) {
            zzbw2.zzbsv = zzbw.zzbsv;
        }
    }

    private final void zzkt() {
        C1575pr zzkn = zzkn();
        if (zzkn != null) {
            zzkn.mo12884a();
        }
    }
}
