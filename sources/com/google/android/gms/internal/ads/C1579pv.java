package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.pv */
public final class C1579pv implements C1575pr<afl> {

    /* renamed from: a */
    private abg<afl> f6218a;

    /* renamed from: b */
    private final zzaa f6219b = new zzaa(this.f6221d);

    /* renamed from: c */
    private final C1138bl f6220c;

    /* renamed from: d */
    private final Context f6221d;

    /* renamed from: e */
    private final zzbbi f6222e;

    /* renamed from: f */
    private final zzbb f6223f;

    /* renamed from: g */
    private final awy f6224g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f6225h;

    public C1579pv(Context context, zzbb zzbb, String str, awy awy, zzbbi zzbbi) {
        C1772wz.m1628d("Webview loading for native ads.");
        this.f6221d = context;
        this.f6223f = zzbb;
        this.f6224g = awy;
        this.f6222e = zzbbi;
        this.f6225h = str;
        zzbv.zzlg();
        abg<afl> a = afr.m2017a(this.f6221d, this.f6222e, (String) bre.m6321e().mo12778a(C1557p.f5995bx), this.f6224g, this.f6223f.zzid());
        this.f6220c = new C1138bl(zzbb, str);
        this.f6218a = aau.m1648a(a, new C1580pw(this), abl.f1314b);
        aas.m1642a(this.f6218a, "WebViewNativeAdsUtil.constructor");
    }

    /* renamed from: a */
    public final abg<JSONObject> mo12883a(JSONObject jSONObject) {
        return aau.m1648a(this.f6218a, new C1581px(this, jSONObject), abl.f1313a);
    }

    /* renamed from: b */
    public final abg<JSONObject> mo12887b(JSONObject jSONObject) {
        return aau.m1648a(this.f6218a, new C1582py(this, jSONObject), abl.f1313a);
    }

    /* renamed from: c */
    public final abg<JSONObject> mo12889c(JSONObject jSONObject) {
        return aau.m1648a(this.f6218a, new C1583pz(this, jSONObject), abl.f1313a);
    }

    /* renamed from: d */
    public final abg<JSONObject> mo12890d(JSONObject jSONObject) {
        return aau.m1648a(this.f6218a, new C1585qa(this, jSONObject), abl.f1313a);
    }

    /* renamed from: a */
    public final void mo12885a(String str, zzu<? super afl> zzu) {
        aau.m1653a(this.f6218a, new C1588qd(this, str, zzu), abl.f1313a);
    }

    /* renamed from: b */
    public final void mo12888b(String str, zzu<? super afl> zzu) {
        aau.m1653a(this.f6218a, new C1589qe(this, str, zzu), abl.f1313a);
    }

    /* renamed from: a */
    public final void mo12886a(String str, JSONObject jSONObject) {
        aau.m1653a(this.f6218a, new C1590qf(this, str, jSONObject), abl.f1313a);
    }

    /* renamed from: a */
    public final void mo12884a() {
        aau.m1653a(this.f6218a, new C1591qg(this), abl.f1313a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ abg mo12892a(JSONObject jSONObject, afl afl) {
        jSONObject.put("ads_id", this.f6225h);
        afl.mo10448b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return aau.m1646a(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ abg mo12893b(JSONObject jSONObject, afl afl) {
        jSONObject.put("ads_id", this.f6225h);
        afl.mo10448b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return aau.m1646a(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ abg mo12894c(JSONObject jSONObject, afl afl) {
        jSONObject.put("ads_id", this.f6225h);
        afl.mo10448b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return aau.m1646a(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ abg mo12895d(JSONObject jSONObject, afl afl) {
        jSONObject.put("ads_id", this.f6225h);
        abq abq = new abq();
        afl.mo10347a("/nativeAdPreProcess", (zzu<? super afl>) new C1586qb(this, afl, abq));
        afl.mo10448b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return abq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ abg mo12891a(afl afl) {
        C1772wz.m1628d("Javascript has loaded for native ads.");
        afl.mo10388u().mo10404a(this.f6223f, this.f6223f, this.f6223f, this.f6223f, this.f6223f, false, (zzy) null, new zzw(this.f6221d, (C1736vq) null, (zzaso) null), (C1515nl) null, (C1736vq) null);
        afl.mo10347a("/logScionEvent", (zzu<? super afl>) this.f6219b);
        afl.mo10347a("/logScionEvent", (zzu<? super afl>) this.f6220c);
        return aau.m1646a(afl);
    }
}
