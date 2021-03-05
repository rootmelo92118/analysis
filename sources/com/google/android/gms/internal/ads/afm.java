package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p034v4.app.NotificationCompat;
import android.support.p034v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import com.google.android.gms.internal.ads.boz;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
@ParametersAreNonnullByDefault
public class afm extends WebViewClient implements ags {

    /* renamed from: b */
    private static final String[] f1588b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c */
    private static final String[] f1589c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f1590A;

    /* renamed from: B */
    private int f1591B;

    /* renamed from: C */
    private boolean f1592C;

    /* renamed from: D */
    private View.OnAttachStateChangeListener f1593D;
    @Nullable

    /* renamed from: a */
    protected C1736vq f1594a;

    /* renamed from: d */
    private afl f1595d;
    @Nullable

    /* renamed from: e */
    private final box f1596e;

    /* renamed from: f */
    private final HashMap<String, List<zzu<? super afl>>> f1597f;

    /* renamed from: g */
    private final Object f1598g;

    /* renamed from: h */
    private bqf f1599h;

    /* renamed from: i */
    private zzn f1600i;

    /* renamed from: j */
    private agt f1601j;

    /* renamed from: k */
    private agu f1602k;

    /* renamed from: l */
    private zzb f1603l;

    /* renamed from: m */
    private zzd f1604m;

    /* renamed from: n */
    private agv f1605n;

    /* renamed from: o */
    private boolean f1606o;
    @GuardedBy("mLock")

    /* renamed from: p */
    private boolean f1607p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private boolean f1608q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private ViewTreeObserver.OnGlobalLayoutListener f1609r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private ViewTreeObserver.OnScrollChangedListener f1610s;
    @GuardedBy("mLock")

    /* renamed from: t */
    private boolean f1611t;

    /* renamed from: u */
    private zzt f1612u;

    /* renamed from: v */
    private final C1513nj f1613v;

    /* renamed from: w */
    private zzw f1614w;

    /* renamed from: x */
    private C1504na f1615x;

    /* renamed from: y */
    private agw f1616y;

    /* renamed from: z */
    private boolean f1617z;

    public afm(afl afl, box box, boolean z) {
        this(afl, box, z, new C1513nj(afl, afl.mo10377p(), new bug(afl.getContext())), (C1504na) null);
    }

    private afm(afl afl, box box, boolean z, C1513nj njVar, C1504na naVar) {
        this.f1597f = new HashMap<>();
        this.f1598g = new Object();
        this.f1606o = false;
        this.f1596e = box;
        this.f1595d = afl;
        this.f1607p = z;
        this.f1613v = njVar;
        this.f1615x = null;
    }

    /* renamed from: a */
    public final void mo10397a(int i, int i2, boolean z) {
        this.f1613v.mo12825a(i, i2);
        if (this.f1615x != null) {
            this.f1615x.mo12810a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo10404a(bqf bqf, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, @Nullable zzy zzy, zzw zzw, C1515nl nlVar, @Nullable C1736vq vqVar) {
        if (zzw == null) {
            zzw = new zzw(this.f1595d.getContext(), vqVar, (zzaso) null);
        }
        this.f1615x = new C1504na(this.f1595d, nlVar);
        this.f1594a = vqVar;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5937as)).booleanValue()) {
            mo10405a("/adMetadata", (zzu<? super afl>) new zza(zzb));
        }
        mo10405a("/appEvent", (zzu<? super afl>) new zzc(zzd));
        mo10405a("/backButton", (zzu<? super afl>) zzf.zzdfc);
        mo10405a("/refresh", (zzu<? super afl>) zzf.zzdfd);
        mo10405a("/canOpenURLs", (zzu<? super afl>) zzf.zzdet);
        mo10405a("/canOpenIntents", (zzu<? super afl>) zzf.zzdeu);
        mo10405a("/click", (zzu<? super afl>) zzf.zzdev);
        mo10405a("/close", (zzu<? super afl>) zzf.zzdew);
        mo10405a("/customClose", (zzu<? super afl>) zzf.zzdex);
        mo10405a("/instrument", (zzu<? super afl>) zzf.zzdfg);
        mo10405a("/delayPageLoaded", (zzu<? super afl>) zzf.zzdfi);
        mo10405a("/delayPageClosed", (zzu<? super afl>) zzf.zzdfj);
        mo10405a("/getLocationInfo", (zzu<? super afl>) zzf.zzdfk);
        mo10405a("/httpTrack", (zzu<? super afl>) zzf.zzdey);
        mo10405a("/log", (zzu<? super afl>) zzf.zzdez);
        mo10405a("/mraid", (zzu<? super afl>) new zzab(zzw, this.f1615x, nlVar));
        mo10405a("/mraidLoaded", (zzu<? super afl>) this.f1613v);
        mo10405a("/open", (zzu<? super afl>) new zzac(zzw, this.f1615x));
        mo10405a("/precache", (zzu<? super afl>) new aeu());
        mo10405a("/touch", (zzu<? super afl>) zzf.zzdfb);
        mo10405a("/video", (zzu<? super afl>) zzf.zzdfe);
        mo10405a("/videoMeta", (zzu<? super afl>) zzf.zzdff);
        if (zzbv.zzmf().mo13075a(this.f1595d.getContext())) {
            mo10405a("/logScionEvent", (zzu<? super afl>) new zzaa(this.f1595d.getContext()));
        }
        if (zzy != null) {
            mo10405a("/setInterstitialProperties", (zzu<? super afl>) new zzx(zzy));
        }
        this.f1599h = bqf;
        this.f1600i = zzn;
        this.f1603l = zzb;
        this.f1604m = zzd;
        this.f1612u = zzt;
        this.f1614w = zzw;
        this.f1606o = z;
    }

    /* renamed from: a */
    public final zzw mo10395a() {
        return this.f1614w;
    }

    /* renamed from: b */
    public final boolean mo10413b() {
        boolean z;
        synchronized (this.f1598g) {
            z = this.f1607p;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo10414c() {
        boolean z;
        synchronized (this.f1598g) {
            z = this.f1608q;
        }
        return z;
    }

    /* renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener mo10415d() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f1598g) {
            onGlobalLayoutListener = this.f1609r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final ViewTreeObserver.OnScrollChangedListener mo10416e() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f1598g) {
            onScrollChangedListener = this.f1610s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo10417f() {
        boolean z;
        synchronized (this.f1598g) {
            z = this.f1611t;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.f1602k == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.f1602k.mo10487a();
        r0.f1602k = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        m1983q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f1617z = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f1598g
            monitor-enter(r1)
            com.google.android.gms.internal.ads.afl r2 = r0.f1595d     // Catch:{ all -> 0x002b }
            boolean r2 = r2.mo10331A()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.C1772wz.m8287a(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.afl r2 = r0.f1595d     // Catch:{ all -> 0x002b }
            r2.mo10332B()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.f1617z = r1
            com.google.android.gms.internal.ads.agu r1 = r0.f1602k
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.agu r1 = r0.f1602k
            r1.mo10487a()
            r1 = 0
            r0.f1602k = r1
        L_0x0027:
            r0.m1983q()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afm.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1978a(View view, C1736vq vqVar, int i) {
        if (vqVar.mo13059b() && i > 0) {
            vqVar.mo13054a(view);
            if (vqVar.mo13059b()) {
                C1782xi.f6838a.postDelayed(new afo(this, view, vqVar, i), 100);
            }
        }
    }

    /* renamed from: p */
    private final void m1982p() {
        if (this.f1593D != null) {
            this.f1595d.getView().removeOnAttachStateChangeListener(this.f1593D);
        }
    }

    /* renamed from: g */
    public final void mo10418g() {
        C1736vq vqVar = this.f1594a;
        if (vqVar != null) {
            WebView webView = this.f1595d.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                m1978a((View) webView, vqVar, 10);
                return;
            }
            m1982p();
            this.f1593D = new afp(this, vqVar);
            this.f1595d.getView().addOnAttachStateChangeListener(this.f1593D);
        }
    }

    /* renamed from: h */
    public final void mo10419h() {
        synchronized (this.f1598g) {
            this.f1611t = true;
        }
        this.f1591B++;
        m1983q();
    }

    /* renamed from: i */
    public final void mo10420i() {
        this.f1591B--;
        m1983q();
    }

    /* renamed from: j */
    public final void mo10421j() {
        this.f1590A = true;
        m1983q();
    }

    /* renamed from: q */
    private final void m1983q() {
        if (this.f1601j != null && ((this.f1617z && this.f1591B <= 0) || this.f1590A)) {
            this.f1601j.zzp(!this.f1590A);
            this.f1601j = null;
        }
        this.f1595d.mo10337G();
    }

    /* renamed from: a */
    public final void mo10399a(com.google.android.gms.ads.internal.overlay.zzc zzc) {
        zzn zzn;
        boolean z = this.f1595d.mo10393z();
        bqf bqf = (!z || this.f1595d.mo10380s().mo10494e()) ? this.f1599h : null;
        if (z) {
            zzn = null;
        } else {
            zzn = this.f1600i;
        }
        m1979a(new AdOverlayInfoParcel(zzc, bqf, zzn, this.f1612u, this.f1595d.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10408a(boolean z, int i) {
        m1979a(new AdOverlayInfoParcel((!this.f1595d.mo10393z() || this.f1595d.mo10380s().mo10494e()) ? this.f1599h : null, this.f1600i, this.f1612u, this.f1595d, z, i, this.f1595d.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10409a(boolean z, int i, String str) {
        afq afq;
        boolean z2 = this.f1595d.mo10393z();
        bqf bqf = (!z2 || this.f1595d.mo10380s().mo10494e()) ? this.f1599h : null;
        if (z2) {
            afq = null;
        } else {
            afq = new afq(this.f1595d, this.f1600i);
        }
        m1979a(new AdOverlayInfoParcel(bqf, afq, this.f1603l, this.f1604m, this.f1612u, this.f1595d, z, i, str, this.f1595d.mo10180i()));
    }

    /* renamed from: a */
    public final void mo10410a(boolean z, int i, String str, String str2) {
        afq afq;
        boolean z2 = this.f1595d.mo10393z();
        bqf bqf = (!z2 || this.f1595d.mo10380s().mo10494e()) ? this.f1599h : null;
        if (z2) {
            afq = null;
        } else {
            afq = new afq(this.f1595d, this.f1600i);
        }
        m1979a(new AdOverlayInfoParcel(bqf, afq, this.f1603l, this.f1604m, this.f1612u, this.f1595d, z, i, str, str2, this.f1595d.mo10180i()));
    }

    /* renamed from: a */
    private final void m1979a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f1615x != null ? this.f1615x.mo12813a() : false;
        zzbv.zzld();
        Context context = this.f1595d.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f1594a != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdrs != null) {
                str = adOverlayInfoParcel.zzdrs.url;
            }
            this.f1594a.mo13055a(str);
        }
    }

    /* renamed from: a */
    public final void mo10405a(String str, zzu<? super afl> zzu) {
        synchronized (this.f1598g) {
            List list = this.f1597f.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f1597f.put(str, list);
            }
            list.add(zzu);
        }
    }

    /* renamed from: b */
    public final void mo10411b(String str, zzu<? super afl> zzu) {
        synchronized (this.f1598g) {
            List list = this.f1597f.get(str);
            if (list != null) {
                list.remove(zzu);
            }
        }
    }

    /* renamed from: a */
    public final void mo10406a(String str, C0980p<zzu<? super afl>> pVar) {
        synchronized (this.f1598g) {
            List<zzu> list = this.f1597f.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzu zzu : list) {
                    if (pVar.mo9999a(zzu)) {
                        arrayList.add(zzu);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: k */
    public final void mo10422k() {
        if (this.f1594a != null) {
            this.f1594a.mo13062d();
            this.f1594a = null;
        }
        m1982p();
        synchronized (this.f1598g) {
            this.f1597f.clear();
            this.f1599h = null;
            this.f1600i = null;
            this.f1601j = null;
            this.f1602k = null;
            this.f1603l = null;
            this.f1604m = null;
            this.f1606o = false;
            this.f1607p = false;
            this.f1608q = false;
            this.f1611t = false;
            this.f1612u = null;
            this.f1605n = null;
            if (this.f1615x != null) {
                this.f1615x.mo12812a(true);
                this.f1615x = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo10400a(agt agt) {
        this.f1601j = agt;
    }

    /* renamed from: a */
    public final void mo10401a(agu agu) {
        this.f1602k = agu;
    }

    /* renamed from: a */
    public final void mo10402a(agv agv) {
        this.f1605n = agv;
    }

    /* renamed from: a */
    public final void mo10403a(agw agw) {
        this.f1616y = agw;
    }

    /* renamed from: l */
    public final agw mo10423l() {
        return this.f1616y;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C1772wz.m8287a(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m1977a(parse);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        int i2;
        if (i >= 0 || (-i) - 1 >= f1588b.length) {
            str3 = String.valueOf(i);
        } else {
            str3 = f1588b[i2];
        }
        m1976a(this.f1595d.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f1589c.length) {
                str = String.valueOf(primaryError);
            } else {
                str = f1589c[primaryError];
            }
            m1976a(this.f1595d.getContext(), "ssl_err", str, zzbv.zzlh().mo13227a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* renamed from: a */
    private final void m1976a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5918aZ)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_ERROR, str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    zzbv.zzlf().mo13202a(context, this.f1595d.mo10180i().f7135a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            zzbv.zzlf().mo13202a(context, this.f1595d.mo10180i().f7135a, "gmob-apps", bundle, true);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C1772wz.m8287a(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f1606o && webView == this.f1595d.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f1599h != null) {
                        this.f1599h.onAdClicked();
                        if (this.f1594a != null) {
                            this.f1594a.mo13055a(str);
                        }
                        this.f1599h = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f1595d.getWebView().willNotDraw()) {
                try {
                    awy x = this.f1595d.mo10391x();
                    if (x != null && x.mo11354a(parse)) {
                        parse = x.mo11351a(parse, this.f1595d.getContext(), this.f1595d.getView(), this.f1595d.mo10174d());
                    }
                } catch (awz unused) {
                    String valueOf2 = String.valueOf(str);
                    C1772wz.m1630e(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                if (this.f1614w == null || this.f1614w.zzju()) {
                    mo10399a(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.f1614w.zzas(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                C1772wz.m1630e(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            m1977a(parse);
        }
        return true;
    }

    @Nullable
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo10394a(str, (Map<String, String>) Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final WebResourceResponse mo10394a(String str, Map<String, String> map) {
        zztv a;
        try {
            String a2 = C1744vy.m8201a(str, this.f1595d.getContext(), this.f1592C);
            if (!a2.equals(str)) {
                return m1981b(a2, map);
            }
            zzty a3 = zzty.m8826a(str);
            if (a3 != null && (a = zzbv.zzll().mo12269a(a3)) != null && a.mo13449a()) {
                return new WebResourceResponse("", "", a.mo13450b());
            }
            if (aab.m1602c()) {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f5910aR)).booleanValue()) {
                    return m1981b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbv.zzlj().mo13119a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: b */
    private final WebResourceResponse m1981b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(C0008a.DEFAULT_TIMEOUT);
                openConnection.setReadTimeout(C0008a.DEFAULT_TIMEOUT);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzbv.zzlf().mo13203a(this.f1595d.getContext(), this.f1595d.mo10180i().f7135a, false, httpURLConnection);
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
    public final void mo10407a(boolean z) {
        this.f1606o = z;
    }

    /* renamed from: m */
    public final C1736vq mo10424m() {
        return this.f1594a;
    }

    /* renamed from: a */
    public final void mo10398a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f1598g) {
            this.f1608q = true;
            this.f1595d.mo10336F();
            this.f1609r = onGlobalLayoutListener;
            this.f1610s = onScrollChangedListener;
        }
    }

    /* renamed from: n */
    public final void mo10425n() {
        synchronized (this.f1598g) {
            this.f1606o = false;
            this.f1607p = true;
            abl.f1313a.execute(new afn(this));
        }
    }

    /* renamed from: b */
    public final void mo10412b(boolean z) {
        this.f1592C = z;
    }

    /* renamed from: a */
    public final void mo10396a(int i, int i2) {
        if (this.f1615x != null) {
            this.f1615x.mo12809a(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: a */
    private final void m1977a(Uri uri) {
        String path = uri.getPath();
        List<zzu> list = this.f1597f.get(path);
        if (list != null) {
            zzbv.zzlf();
            Map<String, String> a = C1782xi.m8367a(uri);
            if (C1772wz.m1623a(2)) {
                String valueOf = String.valueOf(path);
                C1772wz.m8287a(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : a.keySet()) {
                    String str = a.get(next);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length());
                    sb.append("  ");
                    sb.append(next);
                    sb.append(": ");
                    sb.append(str);
                    C1772wz.m8287a(sb.toString());
                }
            }
            for (zzu zza : list) {
                zza.zza(this.f1595d, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        C1772wz.m8287a(sb2.toString());
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f1596e != null) {
            this.f1596e.mo12285a(boz.C1142a.C1144b.ANDROID_WEBVIEW_CRASH);
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo10426o() {
        this.f1595d.mo10336F();
        com.google.android.gms.ads.internal.overlay.zzd q = this.f1595d.mo10378q();
        if (q != null) {
            q.zzvr();
        }
        if (this.f1605n != null) {
            this.f1605n.zzjx();
            this.f1605n = null;
        }
    }
}
