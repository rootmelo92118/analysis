package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzah;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1419jx;
import com.google.android.gms.internal.ads.C1420jy;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1659su;
import com.google.android.gms.internal.ads.C1676tk;
import com.google.android.gms.internal.ads.C1736vq;
import com.google.android.gms.internal.ads.C1740vu;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.C1790xq;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.afr;
import com.google.android.gms.internal.ads.ags;
import com.google.android.gms.internal.ads.agv;
import com.google.android.gms.internal.ads.agy;
import com.google.android.gms.internal.ads.bmn;
import com.google.android.gms.internal.ads.bmr;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzal extends zzh implements zzah, zzy {
    private transient boolean zzbom;
    private int zzbon = -1;
    /* access modifiers changed from: private */
    public boolean zzboo;
    /* access modifiers changed from: private */
    public float zzbop;
    /* access modifiers changed from: private */
    public boolean zzboq;
    private C1740vu zzbor;
    private String zzbos;
    private final String zzbot;
    private final C1676tk zzbou;

    public zzal(Context context, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        super(context, zzwf, str, koVar, zzbbi, zzv);
        boolean z = false;
        this.zzbom = false;
        if (zzwf != null && "reward_mb".equals(zzwf.f7292a)) {
            z = true;
        }
        this.zzbot = z ? "/Rewarded" : "/Interstitial";
        this.zzbou = z ? new C1676tk(this.zzbls, this.zzbma, new zzan(this), this, this) : null;
    }

    private final boolean zzn(boolean z) {
        return this.zzbou != null && z;
    }

    public final boolean zza(zzwb zzwb, C1019ad adVar) {
        if (this.zzbls.zzbsu != null) {
            C1772wz.m1630e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.zzbor == null && zza(zzwb) && zzbv.zzmf().mo13075a(this.zzbls.zzsp) && !TextUtils.isEmpty(this.zzbls.zzbsn)) {
            this.zzbor = new C1740vu(this.zzbls.zzsp, this.zzbls.zzbsn);
        }
        return super.zza(zzwb, adVar);
    }

    public final void zza(C1753wg wgVar, C1019ad adVar) {
        if (wgVar.f6728e != -2) {
            super.zza(wgVar, adVar);
            return;
        }
        if (zzn(wgVar.f6726c != null)) {
            this.zzbou.mo12978c();
            return;
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5895aC)).booleanValue()) {
            super.zza(wgVar, adVar);
            return;
        }
        boolean z = !wgVar.f6725b.f7088g;
        if (zza(wgVar.f6724a.f7032c) && z) {
            this.zzbls.zzbsv = zzb(wgVar);
        }
        super.zza(this.zzbls.zzbsv, adVar);
    }

    /* access modifiers changed from: protected */
    public final afl zza(C1753wg wgVar, @Nullable zzw zzw, @Nullable C1736vq vqVar) {
        zzbv.zzlg();
        afl a = afr.m2018a(this.zzbls.zzsp, agy.m2170a(this.zzbls.zzbst), this.zzbls.zzbst.f7292a, false, false, this.zzbls.zzbso, this.zzbls.zzbsp, this.zzbln, this, this.zzbly, wgVar.f6732i);
        a.mo10388u().mo10404a(this, this, (zzn) null, this, this, true, this, zzw, this, vqVar);
        zza(a);
        a.mo10351b(wgVar.f6724a.f7051v);
        a.mo10347a("/reward", (zzu<? super afl>) new zzag(this));
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzwb zzwb, C1752wf wfVar, boolean z) {
        if (this.zzbls.zzmj() && wfVar.f6699b != null) {
            zzbv.zzlh();
            C1790xq.m8434a(wfVar.f6699b);
        }
        return this.zzblr.zzkv();
    }

    public final boolean zza(@Nullable C1752wf wfVar, C1752wf wfVar2) {
        if (zzn(wfVar2.f6711n)) {
            return C1676tk.m7931a(wfVar, wfVar2);
        }
        if (!super.zza(wfVar, wfVar2)) {
            return false;
        }
        if (!(this.zzbls.zzmj() || this.zzbls.zzbtv == null || wfVar2.f6708k == null)) {
            this.zzblu.mo12146a(this.zzbls.zzbst, wfVar2, this.zzbls.zzbtv);
        }
        zzb(wfVar2, false);
        return true;
    }

    public final void zziw() {
        ags u;
        recordImpression();
        super.zziw();
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null || (u = this.zzbls.zzbsu.f6699b.mo10388u()) == null)) {
            u.mo10418g();
        }
        if (!(!zzbv.zzmf().mo13075a(this.zzbls.zzsp) || this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null)) {
            zzbv.zzmf().mo13079c(this.zzbls.zzbsu.f6699b.getContext(), this.zzbos);
        }
        if (this.zzbor != null) {
            this.zzbor.mo13071a(true);
        }
        if (this.zzblx != null && this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6699b != null) {
            this.zzbls.zzbsu.f6699b.mo10443a("onSdkImpression", (Map<String, ?>) new HashMap());
        }
    }

    public final void zziv() {
        super.zziv();
        this.zzblu.mo12144a(this.zzbls.zzbsu);
        if (this.zzbor != null) {
            this.zzbor.mo13071a(false);
        }
        this.zzblx = null;
    }

    /* access modifiers changed from: protected */
    public final void zzii() {
        zzke();
        super.zzii();
    }

    public final void zzo(boolean z) {
        this.zzbls.zzbpa = z;
    }

    public final void zza(boolean z, float f) {
        this.zzboo = z;
        this.zzbop = f;
    }

    public final void showInterstitial() {
        Bitmap bitmap;
        String str;
        C0926p.m1315b("showInterstitial must be called on the main UI thread.");
        if (zzn(this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6711n)) {
            this.zzbou.mo12976a(this.zzboq);
            return;
        }
        if (zzbv.zzmf().mo13075a(this.zzbls.zzsp)) {
            this.zzbos = zzbv.zzmf().mo13076b(this.zzbls.zzsp);
            String valueOf = String.valueOf(this.zzbos);
            String valueOf2 = String.valueOf(this.zzbot);
            this.zzbos = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzbls.zzbsu == null) {
            C1772wz.m1630e("The interstitial has not loaded.");
            return;
        }
        if (!this.zzbom) {
            if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6005cG)).booleanValue()) {
                return;
            }
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5930al)).booleanValue()) {
            zzbv.zzlf();
            if (C1782xi.m8404h(this.zzbls.zzsp)) {
                C1772wz.m1630e("It is not recommended to show an interstitial when app is not in foreground.");
                return;
            }
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5917aY)).booleanValue()) {
            if (this.zzbls.zzsp.getApplicationContext() != null) {
                str = this.zzbls.zzsp.getApplicationContext().getPackageName();
            } else {
                str = this.zzbls.zzsp.getPackageName();
            }
            if (!this.zzbom) {
                C1772wz.m1630e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", str);
                bundle.putString("action", "show_interstitial_before_load_finish");
                zzb(bundle);
            }
            zzbv.zzlf();
            if (!C1782xi.m8403g(this.zzbls.zzsp)) {
                C1772wz.m1630e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", str);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                zzb(bundle2);
            }
        }
        if (!this.zzbls.zzmk()) {
            if (this.zzbls.zzbsu.f6711n && this.zzbls.zzbsu.f6713p != null) {
                try {
                    this.zzbls.zzbsu.f6713p.mo12692a(this.zzboq);
                    this.zzbls.zzbsu.f6713p.mo12693b();
                } catch (RemoteException e) {
                    C1772wz.m1627c("Could not show interstitial.", e);
                    zzke();
                }
            } else if (this.zzbls.zzbsu.f6699b == null) {
                C1772wz.m1630e("The interstitial failed to load.");
            } else if (this.zzbls.zzbsu.f6699b.mo10393z()) {
                C1772wz.m1630e("The interstitial is already showing.");
            } else {
                this.zzbls.zzbsu.f6699b.mo10353b(true);
                this.zzbls.zzj(this.zzbls.zzbsu.f6699b.getView());
                if (this.zzbls.zzbsu.f6708k != null) {
                    this.zzblu.mo12145a(this.zzbls.zzbst, this.zzbls.zzbsu);
                }
                if (C0979o.m1500a()) {
                    C1752wf wfVar = this.zzbls.zzbsu;
                    if (wfVar.mo13096a()) {
                        new bmn(this.zzbls.zzsp, wfVar.f6699b.getView()).mo12181a((bmr) wfVar.f6699b);
                    } else {
                        wfVar.f6699b.mo10388u().mo10402a((agv) new zzam(this, wfVar));
                    }
                }
                if (this.zzbls.zzbpa) {
                    zzbv.zzlf();
                    bitmap = C1782xi.m8405i(this.zzbls.zzsp);
                } else {
                    bitmap = null;
                }
                this.zzbon = zzbv.zzma().mo13284a(bitmap);
                if (bitmap != null) {
                    new zzao(this, this.zzbon).zzyz();
                    return;
                }
                boolean z = this.zzbls.zzbpa;
                zzbv.zzlf();
                zzaq zzaq = new zzaq(z, C1782xi.m8409o(this.zzbls.zzsp), false, 0.0f, -1, this.zzboq, this.zzbls.zzbsu.f6689L, this.zzbls.zzbsu.f6692O);
                int requestedOrientation = this.zzbls.zzbsu.f6699b.getRequestedOrientation();
                if (requestedOrientation == -1) {
                    requestedOrientation = this.zzbls.zzbsu.f6705h;
                }
                AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzbls.zzbsu.f6699b, requestedOrientation, this.zzbls.zzbsp, this.zzbls.zzbsu.f6678A, zzaq);
                zzbv.zzld();
                zzl.zza(this.zzbls.zzsp, adOverlayInfoParcel, true);
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        C0926p.m1315b("setImmersiveMode must be called on the main UI thread.");
        this.zzboq = z;
    }

    private final void zzb(Bundle bundle) {
        zzbv.zzlf().mo13208b(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, "gmob-apps", bundle, false);
    }

    /* access modifiers changed from: protected */
    public final void zzil() {
        afl afl = this.zzbls.zzbsu != null ? this.zzbls.zzbsu.f6699b : null;
        C1753wg wgVar = this.zzbls.zzbsv;
        if (!(wgVar == null || wgVar.f6725b == null || !wgVar.f6725b.f7072Q || afl == null || !zzbv.zzlw().mo12836a(this.zzbls.zzsp))) {
            int i = this.zzbls.zzbsp.f7136b;
            int i2 = this.zzbls.zzbsp.f7137c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.zzblx = zzbv.zzlw().mo12832a(sb.toString(), afl.getWebView(), "", "javascript", zzit());
            if (!(this.zzblx == null || afl.getView() == null)) {
                zzbv.zzlw().mo12835a(this.zzblx, afl.getView());
                afl.mo10343a(this.zzblx);
                zzbv.zzlw().mo12834a(this.zzblx);
            }
        }
        super.zzil();
        this.zzbom = true;
    }

    public final void zzke() {
        zzbv.zzma().mo13286b(Integer.valueOf(this.zzbon));
        if (this.zzbls.zzmj()) {
            this.zzbls.zzmh();
            this.zzbls.zzbsu = null;
            this.zzbls.zzbpa = false;
            this.zzbom = false;
        }
    }

    public final void zzkf() {
        if (zzn(this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6711n)) {
            this.zzbou.mo12982g();
            zzio();
            return;
        }
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6720w == null)) {
            zzbv.zzlf();
            C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, this.zzbls.zzbsu.f6720w);
        }
        zzio();
    }

    public final void zzb(zzawd zzawd) {
        if (zzn(this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6711n)) {
            zza(this.zzbou.mo12974a(zzawd));
            return;
        }
        if (this.zzbls.zzbsu != null) {
            if (this.zzbls.zzbsu.f6721x != null) {
                zzbv.zzlf();
                C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, this.zzbls.zzbsu.f6721x);
            }
            if (this.zzbls.zzbsu.f6719v != null) {
                zzawd = this.zzbls.zzbsu.f6719v;
            }
        }
        zza(zzawd);
    }

    public final void zzkg() {
        if (zzn(this.zzbls.zzbsu != null && this.zzbls.zzbsu.f6711n)) {
            this.zzbou.mo12983h();
        }
        zzip();
    }

    private static C1753wg zzb(C1753wg wgVar) {
        C1753wg wgVar2 = wgVar;
        try {
            String jSONObject = C1659su.m7893a(wgVar2.f6725b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, wgVar2.f6724a.f7034e);
            C1419jx jxVar = new C1419jx(jSONObject, (String) null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1);
            zzasm zzasm = wgVar2.f6725b;
            C1420jy jyVar = new C1420jy(Collections.singletonList(jxVar), ((Long) bre.m6321e().mo12778a(C1557p.f5974bc)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzasm.f7063H, zzasm.f7064I, "", -1, 0, 1, (String) null, 0, -1, -1, false);
            return new C1753wg(wgVar2.f6724a, new zzasm(wgVar2.f6724a, zzasm.f7082a, zzasm.f7083b, Collections.emptyList(), Collections.emptyList(), zzasm.f7087f, true, zzasm.f7089h, Collections.emptyList(), zzasm.f7091j, zzasm.f7092k, zzasm.f7093l, zzasm.f7094m, zzasm.f7095n, zzasm.f7096o, zzasm.f7097p, (String) null, zzasm.f7099r, zzasm.f7100s, zzasm.f7101t, zzasm.f7102u, zzasm.f7103v, zzasm.f7105x, zzasm.f7106y, zzasm.f7107z, (zzawd) null, Collections.emptyList(), Collections.emptyList(), zzasm.f7059D, zzasm.f7060E, zzasm.f7061F, zzasm.f7062G, zzasm.f7063H, zzasm.f7064I, zzasm.f7065J, (zzawo) null, zzasm.f7067L, zzasm.f7068M, zzasm.f7069N, zzasm.f7070O, 0, zzasm.f7072Q, Collections.emptyList(), zzasm.f7074S, zzasm.f7075T, zzasm.f7076U, zzasm.f7077V), jyVar, wgVar2.f6727d, wgVar2.f6728e, wgVar2.f6729f, wgVar2.f6730g, (JSONObject) null, wgVar2.f6732i, (Boolean) null);
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return wgVar2;
        }
    }

    public final void zzjv() {
        zzd q = this.zzbls.zzbsu.f6699b.mo10378q();
        if (q != null) {
            q.close();
        }
    }
}
