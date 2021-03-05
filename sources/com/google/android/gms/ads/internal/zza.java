package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0973i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1016aa;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1526nw;
import com.google.android.gms.internal.ads.C1534od;
import com.google.android.gms.internal.ads.C1544on;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1600qp;
import com.google.android.gms.internal.ads.C1677tl;
import com.google.android.gms.internal.ads.C1683tr;
import com.google.android.gms.internal.ads.C1686tu;
import com.google.android.gms.internal.ads.C1695uc;
import com.google.android.gms.internal.ads.C1744vy;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1754wh;
import com.google.android.gms.internal.ads.C1763wq;
import com.google.android.gms.internal.ads.C1765ws;
import com.google.android.gms.internal.ads.C1770wx;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.agy;
import com.google.android.gms.internal.ads.blp;
import com.google.android.gms.internal.ads.boy;
import com.google.android.gms.internal.ads.boz;
import com.google.android.gms.internal.ads.bqf;
import com.google.android.gms.internal.ads.bqn;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.brh;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.brx;
import com.google.android.gms.internal.ads.bsb;
import com.google.android.gms.internal.ads.bse;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzu;
import com.google.android.gms.internal.ads.zzzw;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public abstract class zza extends brx implements zzb, zzd, zzt, bqf, C1544on, C1600qp, C1763wq {
    protected C1019ad zzbln;
    protected C1016aa zzblo;
    private C1016aa zzblp;
    protected boolean zzblq = false;
    protected final zzbl zzblr;
    protected final zzbw zzbls;
    @Nullable
    protected transient zzwb zzblt;
    protected final blp zzblu;
    private final Bundle zzblv = new Bundle();
    private boolean zzblw = false;
    @Nullable
    protected C0719a zzblx;
    protected final zzv zzbly;

    protected static boolean zza(zzwb zzwb) {
        Bundle bundle = zzwb.f7283m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    public btb getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void zza(C1753wg wgVar, C1019ad adVar);

    /* access modifiers changed from: package-private */
    public boolean zza(C1752wf wfVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(@Nullable C1752wf wfVar, C1752wf wfVar2);

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzwb zzwb, C1019ad adVar);

    public final zzv zzid() {
        return this.zzbly;
    }

    zza(zzbw zzbw, @Nullable zzbl zzbl, zzv zzv) {
        this.zzbls = zzbw;
        this.zzblr = new zzbl(this);
        this.zzbly = zzv;
        zzbv.zzlf().mo13209b(this.zzbls.zzsp);
        zzbv.zzlf().mo13211c(this.zzbls.zzsp);
        C1770wx.m8286a(this.zzbls.zzsp);
        zzbv.zzlr().mo12596a(this.zzbls.zzsp);
        zzbv.zzlj().mo13117a(this.zzbls.zzsp, this.zzbls.zzbsp);
        zzbv.zzll().mo12271a(this.zzbls.zzsp);
        this.zzblu = zzbv.zzlj().mo13126f();
        zzbv.zzli().mo12225a(this.zzbls.zzsp);
        zzbv.zzmc().mo13292a(this.zzbls.zzsp);
    }

    public final void zza(C1016aa aaVar) {
        this.zzbln = new C1019ad(((Boolean) bre.m6321e().mo12778a(C1557p.f5876K)).booleanValue(), "load_ad", this.zzbls.zzbst.f7292a);
        this.zzblp = new C1016aa(-1, (String) null, (C1016aa) null);
        if (aaVar == null) {
            this.zzblo = new C1016aa(-1, (String) null, (C1016aa) null);
        } else {
            this.zzblo = new C1016aa(aaVar.mo10024a(), aaVar.mo10025b(), aaVar.mo10026c());
        }
    }

    public void destroy() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: destroy");
        this.zzblr.cancel();
        this.zzblu.mo12149b(this.zzbls.zzbsu);
        zzbw zzbw = this.zzbls;
        if (zzbw.zzbsq != null) {
            zzbw.zzbsq.zzmn();
        }
        zzbw.zzbsy = null;
        zzbw.zzbta = null;
        zzbw.zzbsz = null;
        zzbw.zzbto = null;
        zzbw.zzbtb = null;
        zzbw.zzr(false);
        if (zzbw.zzbsq != null) {
            zzbw.zzbsq.removeAllViews();
        }
        zzbw.zzmh();
        zzbw.zzmi();
        zzbw.zzbsu = null;
        this.zzblx = null;
    }

    public final C0719a zzie() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: getAdFrame");
        return C0722b.m769a(this.zzbls.zzbsq);
    }

    @Nullable
    public final zzwf zzif() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.zzbls.zzbst == null) {
            return null;
        }
        return new zzzu(this.zzbls.zzbst);
    }

    public final boolean isReady() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: isLoaded");
        return this.zzbls.zzbsr == null && this.zzbls.zzbss == null && this.zzbls.zzbsu != null;
    }

    public void setManualImpressionsEnabled(boolean z) {
        C1772wz.m1630e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean zzb(zzwb zzwb) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: loadAd");
        zzbv.zzll().mo12270a();
        this.zzblv.clear();
        this.zzblw = false;
        zzwb a = zzwb.mo13454a();
        a.f7273c.putInt("dv", DynamiteModule.m1537b(this.zzbls.zzsp, ModuleDescriptor.MODULE_ID));
        a.f7273c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
        if (C0973i.m1489c(this.zzbls.zzsp) && a.f7281k != null) {
            a = new bqn(a).mo12308a((Location) null).mo12309a();
        }
        if (this.zzbls.zzbsr == null && this.zzbls.zzbss == null) {
            C1772wz.m1628d("Starting ad request.");
            String valueOf = String.valueOf(this.zzbls.zzbsp.f7135a);
            C1772wz.m1628d(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
            zza((C1016aa) null);
            this.zzblo = this.zzbln.mo10149a();
            if (a.f7276f) {
                C1772wz.m1628d("This request is sent from a test device.");
            } else {
                bre.m6317a();
                String a2 = C1851zx.m8584a(this.zzbls.zzsp);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a2);
                sb.append("\") to get test ads on this device.");
                C1772wz.m1628d(sb.toString());
            }
            this.zzblr.zzf(a);
            this.zzblq = zza(a, this.zzbln);
            return this.zzblq;
        }
        if (this.zzblt != null) {
            C1772wz.m1630e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            C1772wz.m1630e("Loading already in progress, saving this object for future refreshes.");
        }
        this.zzblt = a;
        return false;
    }

    public final void zza(C1753wg wgVar) {
        if (wgVar.f6725b.f7094m != -1 && !TextUtils.isEmpty(wgVar.f6725b.f7104w)) {
            long zzaq = zzaq(wgVar.f6725b.f7104w);
            if (zzaq != -1) {
                C1016aa a = this.zzbln.mo10150a(wgVar.f6725b.f7094m + zzaq);
                this.zzbln.mo10155a(a, "stc");
            }
        }
        this.zzbln.mo10152a(wgVar.f6725b.f7104w);
        this.zzbln.mo10155a(this.zzblo, "arf");
        this.zzblp = this.zzbln.mo10149a();
        this.zzbln.mo10153a("gqi", wgVar.f6725b.f7105x);
        this.zzbls.zzbsr = null;
        this.zzbls.zzbsv = wgVar;
        wgVar.f6732i.mo12284a((boy) new zzb(this, wgVar));
        wgVar.f6732i.mo12285a(boz.C1142a.C1144b.AD_LOADED);
        zza(wgVar, this.zzbln);
    }

    public void zzb(C1752wf wfVar) {
        this.zzbln.mo10155a(this.zzblp, "awr");
        this.zzbls.zzbss = null;
        if (!(wfVar.f6701d == -2 || wfVar.f6701d == 3 || this.zzbls.zzmg() == null)) {
            zzbv.zzlj().mo13134n().mo13158a(this.zzbls.zzmg());
        }
        if (wfVar.f6701d == -1) {
            this.zzblq = false;
            return;
        }
        if (zza(wfVar)) {
            C1772wz.m1624b("Ad refresh scheduled.");
        }
        if (wfVar.f6701d != -2) {
            if (wfVar.f6701d == 3) {
                wfVar.f6688K.mo12285a(boz.C1142a.C1144b.AD_FAILED_TO_LOAD_NO_FILL);
            } else {
                wfVar.f6688K.mo12285a(boz.C1142a.C1144b.AD_FAILED_TO_LOAD);
            }
            zzbr(wfVar.f6701d);
            return;
        }
        if (this.zzbls.zzbtu == null) {
            this.zzbls.zzbtu = new C1765ws(this.zzbls.zzbsn);
        }
        if (this.zzbls.zzbsq != null) {
            this.zzbls.zzbsq.zzmm().mo13258d(wfVar.f6679B);
        }
        this.zzblu.mo12144a(this.zzbls.zzbsu);
        if (zza(this.zzbls.zzbsu, wfVar)) {
            this.zzbls.zzbsu = wfVar;
            zzbw zzbw = this.zzbls;
            if (zzbw.zzbsw != null) {
                if (zzbw.zzbsu != null) {
                    zzbw.zzbsw.mo13098a(zzbw.zzbsu.f6722y);
                    zzbw.zzbsw.mo13102b(zzbw.zzbsu.f6723z);
                    zzbw.zzbsw.mo13103b(zzbw.zzbsu.f6711n);
                }
                zzbw.zzbsw.mo13100a(zzbw.zzbst.f7295d);
            }
            this.zzbln.mo10153a("is_mraid", this.zzbls.zzbsu.mo13096a() ? "1" : "0");
            this.zzbln.mo10153a("is_mediation", this.zzbls.zzbsu.f6711n ? "1" : "0");
            if (!(this.zzbls.zzbsu.f6699b == null || this.zzbls.zzbsu.f6699b.mo10388u() == null)) {
                this.zzbln.mo10153a("is_delay_pl", this.zzbls.zzbsu.f6699b.mo10388u().mo10417f() ? "1" : "0");
            }
            this.zzbln.mo10155a(this.zzblo, "ttc");
            if (zzbv.zzlj().mo13116a() != null) {
                zzbv.zzlj().mo13116a().mo12936a(this.zzbln);
            }
            zziq();
            if (this.zzbls.zzmj()) {
                zzil();
            }
        }
        if (wfVar.f6687J != null) {
            zzbv.zzlf().mo13204a(this.zzbls.zzsp, wfVar.f6687J);
        }
    }

    public void onAdClicked() {
        if (this.zzbls.zzbsu == null) {
            C1772wz.m1630e("Ad state was null when trying to ping click URLs.");
            return;
        }
        C1772wz.m1624b("Pinging click URLs.");
        if (this.zzbls.zzbsw != null) {
            this.zzbls.zzbsw.mo13101b();
        }
        if (this.zzbls.zzbsu.f6700c != null) {
            zzbv.zzlf();
            C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, zza(this.zzbls.zzbsu.f6700c, this.zzbls.zzbsu.f6693P));
        }
        if (this.zzbls.zzbsx != null) {
            try {
                this.zzbls.zzbsx.mo12293a();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzig() {
        zzij();
    }

    public final void zza(String str, Bundle bundle) {
        this.zzblv.putAll(bundle);
        if (this.zzblw && this.zzbls.zzbta != null) {
            try {
                this.zzbls.zzbta.mo12307a();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onAppEvent(String str, @Nullable String str2) {
        if (this.zzbls.zzbsz != null) {
            try {
                this.zzbls.zzbsz.mo12315a(str, str2);
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzih() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.zzbls.zzbsu == null) {
            C1772wz.m1630e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C1772wz.m1624b("Pinging manual tracking URLs.");
        if (!this.zzbls.zzbsu.f6685H) {
            ArrayList arrayList = new ArrayList();
            if (this.zzbls.zzbsu.f6704g != null) {
                arrayList.addAll(this.zzbls.zzbsu.f6704g);
            }
            if (!(this.zzbls.zzbsu.f6712o == null || this.zzbls.zzbsu.f6712o.f5553i == null)) {
                arrayList.addAll(this.zzbls.zzbsu.f6712o.f5553i);
            }
            if (!arrayList.isEmpty()) {
                zzbv.zzlf();
                C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, (List<String>) arrayList);
                this.zzbls.zzbsu.f6685H = true;
            }
        }
    }

    public void pause() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: pause");
    }

    public void resume() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: resume");
    }

    /* access modifiers changed from: protected */
    public boolean zzc(zzwb zzwb) {
        if (this.zzbls.zzbsq == null) {
            return false;
        }
        ViewParent parent = this.zzbls.zzbsq.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzbv.zzlf().mo13205a(view, view.getContext());
    }

    public final void zza(brl brl) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setAdListener");
        this.zzbls.zzbsy = brl;
    }

    public final void zza(C1695uc ucVar) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.zzbls.zzbtp = ucVar;
    }

    public final void zza(C1686tu tuVar) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzbls.zzbtq = tuVar;
    }

    public final void setUserId(String str) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setUserId");
        this.zzbls.zzbtr = str;
    }

    public final void zzap(String str) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setCustomData");
        this.zzbls.zzbts = str;
    }

    public final void zza(brh brh) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.zzbls.zzbsx = brh;
    }

    public final void zza(zzwf zzwf) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setAdSize");
        this.zzbls.zzbst = zzwf;
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null || this.zzbls.zzbtw != 0)) {
            this.zzbls.zzbsu.f6699b.mo10345a(agy.m2170a(zzwf));
        }
        if (this.zzbls.zzbsq != null) {
            if (this.zzbls.zzbsq.getChildCount() > 1) {
                this.zzbls.zzbsq.removeView(this.zzbls.zzbsq.getNextView());
            }
            this.zzbls.zzbsq.setMinimumWidth(zzwf.f7297f);
            this.zzbls.zzbsq.setMinimumHeight(zzwf.f7294c);
            this.zzbls.zzbsq.requestLayout();
        }
    }

    public final void zza(bse bse) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.zzbls.zzbsz = bse;
    }

    public final void zza(bsb bsb) {
        this.zzbls.zzbta = bsb;
    }

    public final Bundle getAdMetadata() {
        if (this.zzblw) {
            return this.zzblv;
        }
        return new Bundle();
    }

    public void zza(C1526nw nwVar) {
        C1772wz.m1630e("#006 Unexpected call to a deprecated method.");
    }

    public void zza(C1026aj ajVar) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public final void zza(C1534od odVar, String str) {
        C1772wz.m1630e("#006 Unexpected call to a deprecated method.");
    }

    public final void zza(bsk bsk) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.zzbls.zzbtb = bsk;
    }

    public final void stopLoading() {
        C0926p.m1315b("#008 Must be called on the main UI thread.: stopLoading");
        this.zzblq = false;
        this.zzbls.zzr(true);
    }

    public final boolean isLoading() {
        return this.zzblq;
    }

    public final void zza(@Nullable zzzw zzzw) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.zzbls.zzbtj = zzzw;
    }

    public final void zza(@Nullable zzyv zzyv) {
        C0926p.m1315b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.zzbls.zzbtl = zzyv;
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    private static long zzaq(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            aai.m1625b("", e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzg(View view) {
        zzbx zzbx = this.zzbls.zzbsq;
        if (zzbx != null) {
            zzbx.addView(view, zzbv.zzlh().mo13241d());
        }
    }

    /* access modifiers changed from: protected */
    public void zzii() {
        C1772wz.m8287a("Ad closing.");
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12296a();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12545d();
            } catch (RemoteException e2) {
                C1772wz.m1629d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzij() {
        C1772wz.m8287a("Ad leaving application.");
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12298b();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12546e();
            } catch (RemoteException e2) {
                C1772wz.m1629d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzik() {
        C1772wz.m8287a("Ad opening.");
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12300d();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12543b();
            } catch (RemoteException e2) {
                C1772wz.m1629d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzil() {
        zzm(false);
    }

    /* access modifiers changed from: protected */
    public void zzm(boolean z) {
        C1772wz.m8287a("Ad finished loading.");
        this.zzblq = z;
        this.zzblw = true;
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12299c();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12540a();
            } catch (RemoteException e2) {
                C1772wz.m1629d("#007 Could not call remote method.", e2);
            }
        }
        if (this.zzbls.zzbta != null) {
            try {
                this.zzbls.zzbta.mo12307a();
            } catch (RemoteException e3) {
                C1772wz.m1629d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzbr(int i) {
        zzg(i, false);
    }

    /* access modifiers changed from: protected */
    public void zzg(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        C1772wz.m1630e(sb.toString());
        this.zzblq = z;
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12297a(i);
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12541a(i);
            } catch (RemoteException e2) {
                C1772wz.m1629d("#007 Could not call remote method.", e2);
            }
        }
        if (this.zzbls.zzbtf != null) {
            try {
                this.zzbls.zzbtf.mo12532a(i);
            } catch (RemoteException e3) {
                C1772wz.m1629d("#007 Could not call remote method.", e3);
            }
        }
    }

    public final void zzim() {
        C1772wz.m1628d("Ad impression.");
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12301e();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzin() {
        C1772wz.m1628d("Ad clicked.");
        if (this.zzbls.zzbsy != null) {
            try {
                this.zzbls.zzbsy.mo12302f();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzio() {
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12544c();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(@Nullable zzawd zzawd) {
        if (this.zzbls.zzbtp != null) {
            String str = "";
            int i = 1;
            if (zzawd != null) {
                try {
                    str = zzawd.f7125a;
                    i = zzawd.f7126b;
                } catch (RemoteException e) {
                    C1772wz.m1629d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C1677tl tlVar = new C1677tl(str, i);
            this.zzbls.zzbtp.mo12542a((C1683tr) tlVar);
            if (this.zzbls.zzbtq != null) {
                this.zzbls.zzbtq.mo13001a(tlVar, this.zzbls.zzbsv.f6724a.f7051v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzip() {
        if (this.zzbls.zzbtp != null) {
            try {
                this.zzbls.zzbtp.mo12547f();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final List<String> zzc(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(C1744vy.m8200a(a, this.zzbls.zzsp));
        }
        return arrayList;
    }

    public final void zziq() {
        C1752wf wfVar = this.zzbls.zzbsu;
        if (wfVar != null && !TextUtils.isEmpty(wfVar.f6679B) && !wfVar.f6686I && zzbv.zzlp().mo13269b()) {
            C1772wz.m1624b("Sending troubleshooting signals to the server.");
            zzbv.zzlp().mo13268b(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar.f6679B, this.zzbls.zzbsn);
            wfVar.f6686I = true;
        }
    }

    public final void zza(HashSet<C1754wh> hashSet) {
        this.zzbls.zza(hashSet);
    }

    /* access modifiers changed from: protected */
    public final List<String> zza(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(C1744vy.m8201a(a, this.zzbls.zzsp, z));
        }
        return arrayList;
    }

    public String getAdUnitId() {
        return this.zzbls.zzbsn;
    }

    public final bse zzir() {
        return this.zzbls.zzbsz;
    }

    public final brl zzis() {
        return this.zzbls.zzbsy;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final String zzit() {
        C1753wg wgVar = this.zzbls.zzbsv;
        if (wgVar == null || wgVar.f6725b == null) {
            return "javascript";
        }
        String str = wgVar.f6725b.f7075T;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            aai.m1627c("", e);
            return "javascript";
        }
    }
}
