package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.p034v4.view.ViewCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzc;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C0980p;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
@ParametersAreNonnullByDefault
public final class agz extends ahk implements ags {

    /* renamed from: A */
    private View.OnAttachStateChangeListener f1732A;

    /* renamed from: a */
    private afl f1733a;

    /* renamed from: b */
    private final C1353hl<afl> f1734b = new C1353hl<>();

    /* renamed from: c */
    private final Object f1735c = new Object();

    /* renamed from: d */
    private bqf f1736d;

    /* renamed from: e */
    private zzn f1737e;

    /* renamed from: f */
    private agt f1738f;

    /* renamed from: g */
    private agu f1739g;

    /* renamed from: h */
    private zzb f1740h;

    /* renamed from: i */
    private zzd f1741i;

    /* renamed from: j */
    private agv f1742j;

    /* renamed from: k */
    private boolean f1743k = false;

    /* renamed from: l */
    private volatile boolean f1744l;
    @GuardedBy("mLock")

    /* renamed from: m */
    private boolean f1745m;
    @GuardedBy("mLock")

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f1746n;
    @GuardedBy("mLock")

    /* renamed from: o */
    private ViewTreeObserver.OnScrollChangedListener f1747o;
    @GuardedBy("mLock")

    /* renamed from: p */
    private boolean f1748p;

    /* renamed from: q */
    private zzt f1749q;

    /* renamed from: r */
    private C1513nj f1750r;

    /* renamed from: s */
    private zzw f1751s;

    /* renamed from: t */
    private C1504na f1752t;

    /* renamed from: u */
    private agw f1753u;
    @Nullable

    /* renamed from: v */
    private C1736vq f1754v;

    /* renamed from: w */
    private boolean f1755w;

    /* renamed from: x */
    private boolean f1756x;

    /* renamed from: y */
    private int f1757y;

    /* renamed from: z */
    private boolean f1758z;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10499a(afl afl, boolean z) {
        C1513nj njVar = new C1513nj(afl, afl.mo10377p(), new bug(afl.getContext()));
        this.f1733a = afl;
        this.f1744l = z;
        this.f1750r = njVar;
        this.f1752t = null;
        this.f1734b.mo12598a(afl);
    }

    /* renamed from: a */
    public final void mo10397a(int i, int i2, boolean z) {
        this.f1750r.mo12825a(i, i2);
        if (this.f1752t != null) {
            this.f1752t.mo12810a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo10501a(String str, zzu<? super afl> zzu) {
        this.f1734b.mo12599a(str, zzu);
    }

    /* renamed from: b */
    public final void mo10508b(String str, zzu<? super afl> zzu) {
        this.f1734b.mo12602b(str, zzu);
    }

    /* renamed from: a */
    public final void mo10502a(String str, C0980p<zzu<? super afl>> pVar) {
        this.f1734b.mo12600a(str, pVar);
    }

    /* renamed from: a */
    public final void mo10404a(bqf bqf, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, @Nullable zzy zzy, zzw zzw, C1515nl nlVar, @Nullable C1736vq vqVar) {
        if (zzw == null) {
            zzw = new zzw(this.f1733a.getContext(), vqVar, (zzaso) null);
        }
        this.f1752t = new C1504na(this.f1733a, nlVar);
        this.f1754v = vqVar;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5937as)).booleanValue()) {
            mo10501a("/adMetadata", (zzu<? super afl>) new zza(zzb));
        }
        mo10501a("/appEvent", (zzu<? super afl>) new zzc(zzd));
        mo10501a("/backButton", (zzu<? super afl>) zzf.zzdfc);
        mo10501a("/refresh", (zzu<? super afl>) zzf.zzdfd);
        mo10501a("/canOpenURLs", (zzu<? super afl>) zzf.zzdet);
        mo10501a("/canOpenIntents", (zzu<? super afl>) zzf.zzdeu);
        mo10501a("/click", (zzu<? super afl>) zzf.zzdev);
        mo10501a("/close", (zzu<? super afl>) zzf.zzdew);
        mo10501a("/customClose", (zzu<? super afl>) zzf.zzdex);
        mo10501a("/instrument", (zzu<? super afl>) zzf.zzdfg);
        mo10501a("/delayPageLoaded", (zzu<? super afl>) zzf.zzdfi);
        mo10501a("/delayPageClosed", (zzu<? super afl>) zzf.zzdfj);
        mo10501a("/getLocationInfo", (zzu<? super afl>) zzf.zzdfk);
        mo10501a("/httpTrack", (zzu<? super afl>) zzf.zzdey);
        mo10501a("/log", (zzu<? super afl>) zzf.zzdez);
        mo10501a("/mraid", (zzu<? super afl>) new zzab(zzw, this.f1752t, nlVar));
        mo10501a("/mraidLoaded", (zzu<? super afl>) this.f1750r);
        mo10501a("/open", (zzu<? super afl>) new zzac(zzw, this.f1752t));
        mo10501a("/precache", (zzu<? super afl>) new aeu());
        mo10501a("/touch", (zzu<? super afl>) zzf.zzdfb);
        mo10501a("/video", (zzu<? super afl>) zzf.zzdfe);
        mo10501a("/videoMeta", (zzu<? super afl>) zzf.zzdff);
        if (zzbv.zzmf().mo13075a(this.f1733a.getContext())) {
            mo10501a("/logScionEvent", (zzu<? super afl>) new zzaa(this.f1733a.getContext()));
        }
        if (zzy != null) {
            mo10501a("/setInterstitialProperties", (zzu<? super afl>) new zzx(zzy));
        }
        this.f1736d = bqf;
        this.f1737e = zzn;
        this.f1740h = zzb;
        this.f1741i = zzd;
        this.f1749q = zzt;
        this.f1751s = zzw;
        this.f1743k = z;
    }

    /* renamed from: a */
    public final zzw mo10395a() {
        return this.f1751s;
    }

    /* renamed from: b */
    public final boolean mo10413b() {
        return this.f1744l;
    }

    /* renamed from: c */
    public final boolean mo10510c() {
        boolean z;
        synchronized (this.f1735c) {
            z = this.f1745m;
        }
        return z;
    }

    /* renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener mo10512d() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f1735c) {
            onGlobalLayoutListener = this.f1746n;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final ViewTreeObserver.OnScrollChangedListener mo10514e() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f1735c) {
            onScrollChangedListener = this.f1747o;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo10417f() {
        boolean z;
        synchronized (this.f1735c) {
            z = this.f1748p;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo10500a(ahl ahl) {
        this.f1755w = true;
        if (this.f1739g != null) {
            this.f1739g.mo10487a();
            this.f1739g = null;
        }
        m2183q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2178a(View view, C1736vq vqVar, int i) {
        if (vqVar.mo13059b() && i > 0) {
            vqVar.mo13054a(view);
            if (vqVar.mo13059b()) {
                C1782xi.f6838a.postDelayed(new ahb(this, view, vqVar, i), 100);
            }
        }
    }

    /* renamed from: p */
    private final void m2182p() {
        if (this.f1732A != null) {
            this.f1733a.getView().removeOnAttachStateChangeListener(this.f1732A);
        }
    }

    /* renamed from: g */
    public final void mo10418g() {
        C1736vq vqVar = this.f1754v;
        if (vqVar != null) {
            WebView webView = this.f1733a.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                m2178a((View) webView, vqVar, 10);
                return;
            }
            m2182p();
            this.f1732A = new ahc(this, vqVar);
            this.f1733a.getView().addOnAttachStateChangeListener(this.f1732A);
        }
    }

    /* renamed from: h */
    public final void mo10419h() {
        synchronized (this.f1735c) {
            this.f1748p = true;
        }
        this.f1757y++;
        m2183q();
    }

    /* renamed from: i */
    public final void mo10420i() {
        this.f1757y--;
        m2183q();
    }

    /* renamed from: j */
    public final void mo10421j() {
        this.f1756x = true;
        m2183q();
    }

    /* renamed from: q */
    private final void m2183q() {
        if (this.f1738f != null && ((this.f1755w && this.f1757y <= 0) || this.f1756x)) {
            this.f1738f.zzp(!this.f1756x);
            this.f1738f = null;
        }
        this.f1733a.mo10337G();
    }

    /* renamed from: a */
    public final void mo10498a(com.google.android.gms.ads.internal.overlay.zzc zzc) {
        zzn zzn;
        boolean z = this.f1733a.mo10393z();
        bqf bqf = (!z || this.f1733a.mo10380s().mo10494e()) ? this.f1736d : null;
        if (z) {
            zzn = null;
        } else {
            zzn = this.f1737e;
        }
        m2179a(new AdOverlayInfoParcel(zzc, bqf, zzn, this.f1749q, this.f1733a.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10504a(boolean z, int i) {
        m2179a(new AdOverlayInfoParcel((!this.f1733a.mo10393z() || this.f1733a.mo10380s().mo10494e()) ? this.f1736d : null, this.f1737e, this.f1749q, this.f1733a, z, i, this.f1733a.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10505a(boolean z, int i, String str) {
        ahd ahd;
        boolean z2 = this.f1733a.mo10393z();
        bqf bqf = (!z2 || this.f1733a.mo10380s().mo10494e()) ? this.f1736d : null;
        if (z2) {
            ahd = null;
        } else {
            ahd = new ahd(this.f1733a, this.f1737e);
        }
        m2179a(new AdOverlayInfoParcel(bqf, ahd, this.f1740h, this.f1741i, this.f1749q, this.f1733a, z, i, str, this.f1733a.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10506a(boolean z, int i, String str, String str2) {
        ahd ahd;
        boolean z2 = this.f1733a.mo10393z();
        bqf bqf = (!z2 || this.f1733a.mo10380s().mo10494e()) ? this.f1736d : null;
        if (z2) {
            ahd = null;
        } else {
            ahd = new ahd(this.f1733a, this.f1737e);
        }
        m2179a(new AdOverlayInfoParcel(bqf, ahd, this.f1740h, this.f1741i, this.f1749q, this.f1733a, z, i, str, str2, this.f1733a.mo10180i()));
    }

    /* renamed from: a */
    private final void m2179a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f1752t != null ? this.f1752t.mo12813a() : false;
        zzbv.zzld();
        Context context = this.f1733a.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f1754v != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdrs != null) {
                str = adOverlayInfoParcel.zzdrs.url;
            }
            this.f1754v.mo13055a(str);
        }
    }

    /* renamed from: k */
    public final void mo10515k() {
        if (this.f1754v != null) {
            this.f1754v.mo13062d();
            this.f1754v = null;
        }
        m2182p();
        this.f1734b.mo12603d();
        this.f1734b.mo12598a(null);
        synchronized (this.f1735c) {
            this.f1736d = null;
            this.f1737e = null;
            this.f1738f = null;
            this.f1739g = null;
            this.f1740h = null;
            this.f1741i = null;
            this.f1749q = null;
            this.f1742j = null;
            if (this.f1752t != null) {
                this.f1752t.mo12812a(true);
                this.f1752t = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo10400a(agt agt) {
        this.f1738f = agt;
    }

    /* renamed from: a */
    public final void mo10401a(agu agu) {
        this.f1739g = agu;
    }

    /* renamed from: a */
    public final void mo10402a(agv agv) {
        this.f1742j = agv;
    }

    /* renamed from: a */
    public final void mo10403a(agw agw) {
        this.f1753u = agw;
    }

    /* renamed from: l */
    public final agw mo10516l() {
        return this.f1753u;
    }

    /* renamed from: b */
    public final void mo10507b(ahl ahl) {
        this.f1734b.mo12601a(ahl.f1820b);
    }

    /* renamed from: c */
    public final boolean mo10511c(ahl ahl) {
        String valueOf = String.valueOf(ahl.f1819a);
        C1772wz.m8287a(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = ahl.f1820b;
        if (this.f1734b.mo12601a(uri)) {
            return true;
        }
        if (this.f1743k) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f1736d != null) {
                    this.f1736d.onAdClicked();
                    if (this.f1754v != null) {
                        this.f1754v.mo13055a(ahl.f1819a);
                    }
                    this.f1736d = null;
                }
                return false;
            }
        }
        if (!this.f1733a.getWebView().willNotDraw()) {
            try {
                awy x = this.f1733a.mo10391x();
                if (x != null && x.mo11354a(uri)) {
                    uri = x.mo11351a(uri, this.f1733a.getContext(), this.f1733a.getView(), this.f1733a.mo10174d());
                }
            } catch (awz unused) {
                String valueOf2 = String.valueOf(ahl.f1819a);
                C1772wz.m1630e(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            if (this.f1751s == null || this.f1751s.zzju()) {
                mo10498a(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.f1751s.zzas(ahl.f1819a);
            }
        } else {
            String valueOf3 = String.valueOf(ahl.f1819a);
            C1772wz.m1630e(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Nullable
    /* renamed from: d */
    public final WebResourceResponse mo10513d(ahl ahl) {
        WebResourceResponse webResourceResponse;
        zztv a;
        String str;
        if (this.f1754v != null) {
            this.f1754v.mo13056a(ahl.f1819a, ahl.f1821c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(ahl.f1819a).getName())) {
            webResourceResponse = null;
        } else {
            mo10425n();
            if (this.f1733a.mo10380s().mo10494e()) {
                str = (String) bre.m6321e().mo12778a(C1557p.f5873H);
            } else if (this.f1733a.mo10393z()) {
                str = (String) bre.m6321e().mo12778a(C1557p.f5872G);
            } else {
                str = (String) bre.m6321e().mo12778a(C1557p.f5871F);
            }
            zzbv.zzlf();
            webResourceResponse = C1782xi.m8390c(this.f1733a.getContext(), this.f1733a.mo10180i().f7135a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C1744vy.m8201a(ahl.f1819a, this.f1733a.getContext(), this.f1758z).equals(ahl.f1819a)) {
                return m2181e(ahl);
            }
            zzty a2 = zzty.m8826a(ahl.f1819a);
            if (a2 != null && (a = zzbv.zzll().mo12269a(a2)) != null && a.mo13449a()) {
                return new WebResourceResponse("", "", a.mo13450b());
            }
            if (aab.m1602c()) {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f5910aR)).booleanValue()) {
                    return m2181e(ahl);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbv.zzlj().mo13119a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: e */
    private final WebResourceResponse m2181e(ahl ahl) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(ahl.f1819a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(C0008a.DEFAULT_TIMEOUT);
                openConnection.setReadTimeout(C0008a.DEFAULT_TIMEOUT);
                for (Map.Entry next : ahl.f1821c.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzbv.zzlf().mo13203a(this.f1733a.getContext(), this.f1733a.mo10180i().f7135a, false, httpURLConnection);
                    aab aab = new aab();
                    aab.mo10031a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    aab.mo10030a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzbv.zzlf();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C1772wz.m1630e("Protocol is null");
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                C1772wz.m1624b(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                C1772wz.m1630e(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzbv.zzlf();
        return C1782xi.m8359a(httpURLConnection);
    }

    /* renamed from: a */
    public final void mo10503a(boolean z) {
        this.f1743k = z;
    }

    /* renamed from: m */
    public final C1736vq mo10424m() {
        return this.f1754v;
    }

    /* renamed from: a */
    public final void mo10398a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f1735c) {
            this.f1745m = true;
            this.f1733a.mo10336F();
            this.f1746n = onGlobalLayoutListener;
            this.f1747o = onScrollChangedListener;
        }
    }

    /* renamed from: n */
    public final void mo10425n() {
        synchronized (this.f1735c) {
            this.f1743k = false;
            this.f1744l = true;
            abl.f1313a.execute(new aha(this));
        }
    }

    /* renamed from: b */
    public final void mo10509b(boolean z) {
        this.f1758z = z;
    }

    /* renamed from: a */
    public final void mo10396a(int i, int i2) {
        if (this.f1752t != null) {
            this.f1752t.mo12809a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo10517o() {
        this.f1733a.mo10336F();
        com.google.android.gms.ads.internal.overlay.zzd q = this.f1733a.mo10378q();
        if (q != null) {
            q.zzvr();
        }
        if (this.f1742j != null) {
            this.f1742j.zzjx();
            this.f1742j = null;
        }
    }
}
