package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.C0926p;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.to */
public final class C1680to extends zzc implements C1710ur {

    /* renamed from: a */
    private static C1680to f6560a;

    /* renamed from: b */
    private boolean f6561b;

    /* renamed from: c */
    private boolean f6562c;

    /* renamed from: d */
    private final C1740vu f6563d;

    /* renamed from: e */
    private final C1676tk f6564e = new C1676tk(this.zzbls, this.zzbma, this, this, this);

    /* renamed from: a */
    public static C1680to m7968a() {
        return f6560a;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzwb zzwb, C1752wf wfVar, boolean z) {
        return false;
    }

    public C1680to(Context context, zzv zzv, zzwf zzwf, C1437ko koVar, zzbbi zzbbi) {
        super(context, zzwf, (String) null, koVar, zzbbi, zzv);
        f6560a = this;
        this.f6563d = new C1740vu(context, (String) null);
    }

    /* renamed from: a */
    public final void mo12996a(zzavh zzavh) {
        C0926p.m1315b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzavh.f7124b)) {
            C1772wz.m1630e("Invalid ad unit id. Aborting.");
            C1782xi.f6838a.post(new C1681tp(this));
            return;
        }
        this.f6561b = false;
        this.zzbls.zzbsn = zzavh.f7124b;
        this.f6563d.mo13070a(zzavh.f7124b);
        super.zzb(zzavh.f7123a);
    }

    public final void zza(C1753wg wgVar, C1019ad adVar) {
        if (wgVar.f6728e != -2) {
            C1782xi.f6838a.post(new C1682tq(this, wgVar));
            return;
        }
        this.zzbls.zzbsv = wgVar;
        if (wgVar.f6726c == null) {
            this.zzbls.zzbsv = m7969a(wgVar);
        }
        this.f6564e.mo12978c();
    }

    @Nullable
    /* renamed from: a */
    public final C1717uy mo12994a(String str) {
        return this.f6564e.mo12973a(str);
    }

    public final boolean zza(C1752wf wfVar, C1752wf wfVar2) {
        zzb(wfVar2, false);
        return C1676tk.m7931a(wfVar, wfVar2);
    }

    public final void pause() {
        this.f6564e.mo12979d();
    }

    public final void resume() {
        this.f6564e.mo12980e();
    }

    public final void destroy() {
        this.f6564e.mo12981f();
        super.destroy();
    }

    public final void setImmersiveMode(boolean z) {
        C0926p.m1315b("setImmersiveMode must be called on the main UI thread.");
        this.f6562c = z;
    }

    /* renamed from: b */
    public final void mo12997b() {
        C0926p.m1315b("showAd must be called on the main UI thread.");
        if (!mo12998c()) {
            C1772wz.m1630e("The reward video has not loaded.");
        } else {
            this.f6564e.mo12976a(this.f6562c);
        }
    }

    /* renamed from: c */
    public final boolean mo12998c() {
        C0926p.m1315b("isLoaded must be called on the main UI thread.");
        return this.zzbls.zzbsr == null && this.zzbls.zzbss == null && this.zzbls.zzbsu != null;
    }

    public final void onRewardedVideoAdOpened() {
        if (zzbv.zzmf().mo13075a(this.zzbls.zzsp)) {
            this.f6563d.mo13071a(true);
        }
        zza(this.zzbls.zzbsu, false);
        zzik();
    }

    public final void onRewardedVideoStarted() {
        this.f6564e.mo12982g();
        zzio();
    }

    public final void onRewardedVideoCompleted() {
        this.f6564e.mo12983h();
        zzip();
    }

    public final void onRewardedVideoAdClosed() {
        if (zzbv.zzmf().mo13075a(this.zzbls.zzsp)) {
            this.f6563d.mo13071a(false);
        }
        zzii();
    }

    /* access modifiers changed from: protected */
    public final void zzii() {
        this.zzbls.zzbsu = null;
        super.zzii();
    }

    public final void zzc(@Nullable zzawd zzawd) {
        zzawd a = this.f6564e.mo12974a(zzawd);
        if (zzbv.zzmf().mo13075a(this.zzbls.zzsp) && a != null) {
            zzbv.zzmf().mo13074a(this.zzbls.zzsp, zzbv.zzmf().mo13082e(this.zzbls.zzsp), this.zzbls.zzbsn, a.f7125a, a.f7126b);
        }
        zza(a);
    }

    public final void zzkh() {
        onAdClicked();
    }

    public final void onRewardedVideoAdLeftApplication() {
        zzij();
    }

    /* renamed from: a */
    public final void mo12995a(Context context) {
        this.f6564e.mo12975a(context);
    }

    /* renamed from: a */
    private static C1753wg m7969a(C1753wg wgVar) {
        C1753wg wgVar2 = wgVar;
        C1772wz.m8287a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C1659su.m7893a(wgVar2.f6725b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, wgVar2.f6724a.f7034e);
            String jSONObject2 = jSONObject.toString();
            C1420jy jyVar = new C1420jy(Arrays.asList(new C1419jx[]{new C1419jx(a.toString(), (String) null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1)}), ((Long) bre.m6321e().mo12778a(C1557p.f5974bc)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, (String) null, 0, -1, -1, false);
            return new C1753wg(wgVar2.f6724a, wgVar2.f6725b, jyVar, wgVar2.f6727d, wgVar2.f6728e, wgVar2.f6729f, wgVar2.f6730g, wgVar2.f6731h, wgVar2.f6732i, (Boolean) null);
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new C1753wg(wgVar2.f6724a, wgVar2.f6725b, (C1420jy) null, wgVar2.f6727d, 0, wgVar2.f6729f, wgVar2.f6730g, wgVar2.f6731h, wgVar2.f6732i, (Boolean) null);
        }
    }
}
