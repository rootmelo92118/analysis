package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.common.util.C0980p;
import com.google.android.gms.p039a.C0719a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
final class afx extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, afl {
    @GuardedBy("this")

    /* renamed from: A */
    private C1130be f1645A;
    @GuardedBy("this")

    /* renamed from: B */
    private int f1646B;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: C */
    public int f1647C;

    /* renamed from: D */
    private C1016aa f1648D;

    /* renamed from: E */
    private C1016aa f1649E;

    /* renamed from: F */
    private C1016aa f1650F;

    /* renamed from: G */
    private C1017ab f1651G;

    /* renamed from: H */
    private WeakReference<View.OnClickListener> f1652H;
    @GuardedBy("this")

    /* renamed from: I */
    private zzd f1653I;
    @GuardedBy("this")

    /* renamed from: J */
    private boolean f1654J;

    /* renamed from: K */
    private C1850zw f1655K;

    /* renamed from: L */
    private int f1656L = -1;

    /* renamed from: M */
    private int f1657M = -1;

    /* renamed from: N */
    private int f1658N = -1;

    /* renamed from: O */
    private int f1659O = -1;

    /* renamed from: P */
    private Map<String, aeo> f1660P;

    /* renamed from: Q */
    private final WindowManager f1661Q;

    /* renamed from: R */
    private final box f1662R;

    /* renamed from: a */
    private final agx f1663a;
    @Nullable

    /* renamed from: b */
    private final awy f1664b;

    /* renamed from: c */
    private final zzbbi f1665c;

    /* renamed from: d */
    private final zzbo f1666d;

    /* renamed from: e */
    private final zzv f1667e;

    /* renamed from: f */
    private final DisplayMetrics f1668f;

    /* renamed from: g */
    private final float f1669g;

    /* renamed from: h */
    private boolean f1670h = false;

    /* renamed from: i */
    private boolean f1671i = false;

    /* renamed from: j */
    private afm f1672j;
    @GuardedBy("this")

    /* renamed from: k */
    private zzd f1673k;
    @GuardedBy("this")

    /* renamed from: l */
    private C0719a f1674l;
    @GuardedBy("this")

    /* renamed from: m */
    private agy f1675m;
    @GuardedBy("this")

    /* renamed from: n */
    private String f1676n;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f1677o;
    @GuardedBy("this")

    /* renamed from: p */
    private boolean f1678p;
    @GuardedBy("this")

    /* renamed from: q */
    private boolean f1679q;
    @GuardedBy("this")

    /* renamed from: r */
    private boolean f1680r;
    @GuardedBy("this")

    /* renamed from: s */
    private Boolean f1681s;
    @GuardedBy("this")

    /* renamed from: t */
    private int f1682t;
    @GuardedBy("this")

    /* renamed from: u */
    private boolean f1683u = true;
    @GuardedBy("this")

    /* renamed from: v */
    private boolean f1684v = false;
    @GuardedBy("this")

    /* renamed from: w */
    private String f1685w = "";
    @GuardedBy("this")

    /* renamed from: x */
    private aga f1686x;
    @GuardedBy("this")

    /* renamed from: y */
    private boolean f1687y;
    @GuardedBy("this")

    /* renamed from: z */
    private boolean f1688z;

    /* renamed from: a */
    static afx m2031a(Context context, agy agy, String str, boolean z, boolean z2, @Nullable awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv, box box) {
        Context context2 = context;
        return new afx(new agx(context), agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv, box);
    }

    /* renamed from: a */
    public final act mo10166a() {
        return null;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    private afx(agx agx, agy agy, String str, boolean z, boolean z2, @Nullable awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv, box box) {
        super(agx);
        this.f1663a = agx;
        this.f1675m = agy;
        this.f1676n = str;
        this.f1679q = z;
        this.f1682t = -1;
        this.f1664b = awy;
        this.f1665c = zzbbi;
        this.f1666d = zzbo;
        this.f1667e = zzv;
        this.f1661Q = (WindowManager) getContext().getSystemService("window");
        zzbv.zzlf();
        this.f1668f = C1782xi.m8358a(this.f1661Q);
        this.f1669g = this.f1668f.density;
        this.f1662R = box;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C1772wz.m1625b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzlf().mo13201a((Context) agx, zzbbi.f7135a, settings);
        zzbv.zzlh().mo13232a(getContext(), settings);
        setDownloadListener(this);
        m2023O();
        if (C0979o.m1503d()) {
            addJavascriptInterface(agd.m2132a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f1655K = new C1850zw(this.f1663a.mo10488a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        m2028T();
        this.f1651G = new C1017ab(new C1019ad(true, "make_wv", this.f1676n));
        this.f1651G.mo10053a().mo10151a(adVar);
        this.f1649E = C1719v.m8117a(this.f1651G.mo10053a());
        this.f1651G.mo10054a("native:view_create", this.f1649E);
        this.f1650F = null;
        this.f1648D = null;
        zzbv.zzlh().mo13236b((Context) agx);
        zzbv.zzlj().mo13128h();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof afm) {
            this.f1672j = (afm) webViewClient;
        }
    }

    /* renamed from: e */
    public final zzv mo10175e() {
        return this.f1667e;
    }

    /* renamed from: K */
    private final boolean m2019K() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f1672j.mo10413b() && !this.f1672j.mo10414c()) {
            return false;
        }
        bre.m6317a();
        int b = C1851zx.m8593b(this.f1668f, this.f1668f.widthPixels);
        bre.m6317a();
        int b2 = C1851zx.m8593b(this.f1668f, this.f1668f.heightPixels);
        Activity a = this.f1663a.mo10488a();
        if (a == null || a.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzbv.zzlf();
            int[] a2 = C1782xi.m8383a(a);
            bre.m6317a();
            int b3 = C1851zx.m8593b(this.f1668f, a2[0]);
            bre.m6317a();
            i = C1851zx.m8593b(this.f1668f, a2[1]);
            i2 = b3;
        }
        if (this.f1657M == b && this.f1656L == b2 && this.f1658N == i2 && this.f1659O == i) {
            return false;
        }
        if (!(this.f1657M == b && this.f1656L == b2)) {
            z = true;
        }
        this.f1657M = b;
        this.f1656L = b2;
        this.f1658N = i2;
        this.f1659O = i;
        new C1514nk(this).mo12827a(b, b2, i2, i, this.f1668f.density, this.f1661Q.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final void mo10443a(String str, Map<String, ?> map) {
        try {
            mo10444a(str, zzbv.zzlf().mo13200a(map));
        } catch (JSONException unused) {
            C1772wz.m1630e("Could not convert parameters to JSON.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo10331A()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C1772wz.m1631f(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afx.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: c */
    private final synchronized void m2035c(String str) {
        if (!mo10331A()) {
            loadUrl(str);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo10331A()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                zzbv.zzlj().mo13119a(e, "AdWebViewImpl.loadUrl");
                C1772wz.m1627c("Could not call loadUrl. ", e);
            }
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: e */
    private final synchronized void m2036e(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            zzbv.zzlj().mo13119a(e, "AdWebViewImpl.loadUrlUnsafe");
            C1772wz.m1627c("Could not call loadUrl. ", e);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo10331A()) {
            super.loadData(str, str2, str3);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo10331A()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo10349a(String str, String str2, @Nullable String str3) {
        if (!mo10331A()) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5933ao)).booleanValue()) {
                str2 = agn.m2144a(str2, agn.m2143a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m2033a(String str, ValueCallback<String> valueCallback) {
        if (!mo10331A()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: f */
    private final void m2037f(String str) {
        if (C0979o.m1505f()) {
            if (m2021M() == null) {
                m2020L();
            }
            if (m2021M().booleanValue()) {
                m2033a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            m2035c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        m2035c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    /* renamed from: d */
    public final void mo10449d(String str) {
        m2037f(str);
    }

    /* renamed from: L */
    private final synchronized void m2020L() {
        this.f1681s = zzbv.zzlj().mo13121b();
        if (this.f1681s == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                m2032a((Boolean) true);
            } catch (IllegalStateException unused) {
                m2032a((Boolean) false);
            }
        }
    }

    /* renamed from: a */
    private final void m2032a(Boolean bool) {
        synchronized (this) {
            this.f1681s = bool;
        }
        zzbv.zzlj().mo13118a(bool);
    }

    /* renamed from: M */
    private final synchronized Boolean m2021M() {
        return this.f1681s;
    }

    /* renamed from: b */
    public final void mo10448b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m2037f(sb.toString());
    }

    /* renamed from: a */
    public final void mo10444a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C1772wz.m1624b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        m2037f(sb.toString());
    }

    /* renamed from: m */
    public final void mo10371m() {
        m2022N();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1665c.f7135a);
        mo10443a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo10341a(int i) {
        if (i == 0) {
            C1719v.m8118a(this.f1651G.mo10053a(), this.f1649E, "aebb2");
        }
        m2022N();
        if (this.f1651G.mo10053a() != null) {
            this.f1651G.mo10053a().mo10153a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f1665c.f7135a);
        mo10443a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: N */
    private final void m2022N() {
        C1719v.m8118a(this.f1651G.mo10053a(), this.f1649E, "aeh2");
    }

    /* renamed from: n */
    public final void mo10373n() {
        if (this.f1648D == null) {
            C1719v.m8118a(this.f1651G.mo10053a(), this.f1649E, "aes2");
            this.f1648D = C1719v.m8117a(this.f1651G.mo10053a());
            this.f1651G.mo10054a("native:view_show", this.f1648D);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1665c.f7135a);
        mo10443a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: o */
    public final void mo10374o() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzlk().mo13247b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzlk().mo13244a()));
        hashMap.put("device_volume", String.valueOf(C1803yc.m8487a(getContext())));
        mo10443a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo10171a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        mo10443a("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    /* renamed from: q */
    public final synchronized zzd mo10378q() {
        return this.f1673k;
    }

    /* renamed from: y */
    public final synchronized C0719a mo10392y() {
        return this.f1674l;
    }

    /* renamed from: r */
    public final synchronized zzd mo10379r() {
        return this.f1653I;
    }

    /* renamed from: s */
    public final synchronized agy mo10380s() {
        return this.f1675m;
    }

    /* renamed from: t */
    public final synchronized String mo10387t() {
        return this.f1676n;
    }

    /* renamed from: v */
    public final WebViewClient mo10389v() {
        return this.f1672j;
    }

    /* renamed from: w */
    public final synchronized boolean mo10390w() {
        return this.f1677o;
    }

    /* renamed from: x */
    public final awy mo10391x() {
        return this.f1664b;
    }

    /* renamed from: i */
    public final zzbbi mo10180i() {
        return this.f1665c;
    }

    /* renamed from: z */
    public final synchronized boolean mo10393z() {
        return this.f1679q;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzbv.zzlf();
            C1782xi.m8370a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C1772wz.m1624b(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1672j.mo10414c()) {
            synchronized (this) {
                if (this.f1645A != null) {
                    this.f1645A.mo11426a(motionEvent);
                }
            }
        } else if (this.f1664b != null) {
            this.f1664b.mo11353a(motionEvent);
        }
        if (mo10331A()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x01fa=Splitter:B:122:0x01fa, B:64:0x00de=Splitter:B:64:0x00de} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo10331A()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r7.f1679q     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo10495f()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0021
            goto L_0x01fa
        L_0x0021:
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo10497h()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo10496g()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C1557p.f5950bE     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo12778a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.aga r0 = r7.mo10172b()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo10476h()     // Catch:{ all -> 0x01ff }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            float r1 = (float) r9     // Catch:{ all -> 0x01ff }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01ff }
            float r2 = (float) r8     // Catch:{ all -> 0x01ff }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ff }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01ff }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01ff }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01ff }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo10493d()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C1557p.f5955bJ     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo12778a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.C0979o.m1503d()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.afy r1 = new com.google.android.gms.internal.ads.afy     // Catch:{ all -> 0x01ff }
            r1.<init>(r7)     // Catch:{ all -> 0x01ff }
            r7.mo10347a((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.afl>) r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m2037f((java.lang.String) r0)     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r0 = r7.f1668f     // Catch:{ all -> 0x01ff }
            float r0 = r0.density     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r1 = r7.f1647C     // Catch:{ all -> 0x01ff }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.f1647C     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo10494e()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f1668f     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r9 = r7.f1668f     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.agy r2 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r2 = r2.f1730b     // Catch:{ all -> 0x01ff }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.agy r2 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r2 = r2.f1729a     // Catch:{ all -> 0x01ff }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f6003cE     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r4 = r6.mo12778a(r4)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ff }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.agy r4 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r4 = r4.f1730b     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r6 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r6 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r0 = r0.f1729a     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01ff }
            float r5 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r0 = r2
        L_0x0168:
            r2 = 8
            if (r0 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.agy r0 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r0 = r0.f1730b     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.agy r4 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r4 = r4.f1729a     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r5 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01ff }
            float r8 = (float) r8     // Catch:{ all -> 0x01ff }
            float r5 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r5 = r7.f1669g     // Catch:{ all -> 0x01ff }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r6.<init>(r5)     // Catch:{ all -> 0x01ff }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01ff }
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r4)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            r6.append(r9)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.C1772wz.m1630e(r8)     // Catch:{ all -> 0x01ff }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01c5
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01ff }
        L_0x01c5:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            boolean r8 = r7.f1670h     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.box r8 = r7.f1662R     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.boz$a$b r9 = com.google.android.gms.internal.ads.boz.C1142a.C1144b.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01ff }
            r8.mo12285a((com.google.android.gms.internal.ads.boz.C1142a.C1144b) r9)     // Catch:{ all -> 0x01ff }
            r7.f1670h = r3     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01d7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01e0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01ff }
        L_0x01e0:
            boolean r8 = r7.f1671i     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.box r8 = r7.f1662R     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.boz$a$b r9 = com.google.android.gms.internal.ads.boz.C1142a.C1144b.BANNER_SIZE_VALID     // Catch:{ all -> 0x01ff }
            r8.mo12285a((com.google.android.gms.internal.ads.boz.C1142a.C1144b) r9)     // Catch:{ all -> 0x01ff }
            r7.f1671i = r3     // Catch:{ all -> 0x01ff }
        L_0x01ed:
            com.google.android.gms.internal.ads.agy r8 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r8 = r8.f1730b     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.agy r9 = r7.f1675m     // Catch:{ all -> 0x01ff }
            int r9 = r9.f1729a     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            monitor-exit(r7)
            return
        L_0x01fa:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01ff:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afx.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean K = m2019K();
        zzd q = mo10378q();
        if (q != null && K) {
            q.zzvu();
        }
    }

    /* renamed from: a */
    public final synchronized void mo10344a(zzd zzd) {
        this.f1673k = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo10343a(C0719a aVar) {
        this.f1674l = aVar;
    }

    /* renamed from: b */
    public final synchronized void mo10350b(zzd zzd) {
        this.f1653I = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo10345a(agy agy) {
        this.f1675m = agy;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo10353b(boolean z) {
        boolean z2 = z != this.f1679q;
        this.f1679q = z;
        m2023O();
        if (z2) {
            new C1514nk(this).mo12831c(z ? "expanded" : "default");
        }
    }

    /* renamed from: F */
    public final void mo10336F() {
        this.f1655K.mo13296a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo10331A()) {
            this.f1655K.mo13299c();
        }
        boolean z = this.f1687y;
        if (this.f1672j != null && this.f1672j.mo10414c()) {
            if (!this.f1688z) {
                ViewTreeObserver.OnGlobalLayoutListener d = this.f1672j.mo10415d();
                if (d != null) {
                    zzbv.zzme();
                    aby.m1688a((View) this, d);
                }
                ViewTreeObserver.OnScrollChangedListener e = this.f1672j.mo10416e();
                if (e != null) {
                    zzbv.zzme();
                    aby.m1689a((View) this, e);
                }
                this.f1688z = true;
            }
            m2019K();
            z = true;
        }
        m2038g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo10331A()) {
                this.f1655K.mo13300d();
            }
            super.onDetachedFromWindow();
            if (this.f1688z && this.f1672j != null && this.f1672j.mo10414c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener d = this.f1672j.mo10415d();
                if (d != null) {
                    zzbv.zzlh().mo13230a(getViewTreeObserver(), d);
                }
                ViewTreeObserver.OnScrollChangedListener e = this.f1672j.mo10416e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f1688z = false;
            }
        }
        m2038g(false);
    }

    /* renamed from: a */
    public final void mo10342a(Context context) {
        this.f1663a.setBaseContext(context);
        this.f1655K.mo13297a(this.f1663a.mo10488a());
    }

    /* renamed from: c */
    public final synchronized void mo10354c(boolean z) {
        if (this.f1673k != null) {
            this.f1673k.zza(this.f1672j.mo10413b(), z);
        } else {
            this.f1677o = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f1682t;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f1682t = i;
        if (this.f1673k != null) {
            this.f1673k.setRequestedOrientation(this.f1682t);
        }
    }

    /* renamed from: d */
    public final Activity mo10174d() {
        return this.f1663a.mo10488a();
    }

    /* renamed from: p */
    public final Context mo10377p() {
        return this.f1663a.mo10489b();
    }

    /* renamed from: O */
    private final synchronized void m2023O() {
        if (!this.f1679q) {
            if (!this.f1675m.mo10494e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C1772wz.m1624b("Disabling hardware acceleration on an AdView.");
                    m2024P();
                    return;
                }
                C1772wz.m1624b("Enabling hardware acceleration on an AdView.");
                m2025Q();
                return;
            }
        }
        C1772wz.m1624b("Enabling hardware acceleration on an overlay.");
        m2025Q();
    }

    /* renamed from: P */
    private final synchronized void m2024P() {
        if (!this.f1680r) {
            zzbv.zzlh().mo13240c((View) this);
        }
        this.f1680r = true;
    }

    /* renamed from: Q */
    private final synchronized void m2025Q() {
        if (this.f1680r) {
            zzbv.zzlh().mo13237b((View) this);
        }
        this.f1680r = false;
    }

    public final synchronized void destroy() {
        m2028T();
        this.f1655K.mo13298b();
        if (this.f1673k != null) {
            this.f1673k.close();
            this.f1673k.onDestroy();
            this.f1673k = null;
        }
        this.f1674l = null;
        this.f1672j.mo10422k();
        if (!this.f1678p) {
            zzbv.zzmd();
            aen.m1870a((adc) this);
            m2027S();
            this.f1678p = true;
            C1772wz.m8287a("Initiating WebView self destruct sequence in 3...");
            C1772wz.m8287a("Loading blank page in WebView, 2...");
            m2036e("about:blank");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f1678p) {
                    this.f1672j.mo10422k();
                    zzbv.zzmd();
                    aen.m1870a((adc) this);
                    m2027S();
                    m2026R();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: B */
    public final synchronized void mo10332B() {
        C1772wz.m8287a("Destroying WebView!");
        m2026R();
        C1782xi.f6838a.post(new afz(this));
    }

    /* renamed from: R */
    private final synchronized void m2026R() {
        if (!this.f1654J) {
            this.f1654J = true;
            zzbv.zzlj().mo13129i();
        }
    }

    /* renamed from: A */
    public final synchronized boolean mo10331A() {
        return this.f1678p;
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo10331A()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (this.f1672j != null && this.f1672j.mo10423l() != null) {
                    this.f1672j.mo10423l().zzjw();
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo10337G() {
        if (this.f1650F == null) {
            this.f1650F = C1719v.m8117a(this.f1651G.mo10053a());
            this.f1651G.mo10054a("native:view_load", this.f1650F);
        }
    }

    public final void onPause() {
        if (!mo10331A()) {
            try {
                super.onPause();
            } catch (Exception e) {
                C1772wz.m1625b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo10331A()) {
            try {
                super.onResume();
            } catch (Exception e) {
                C1772wz.m1625b("Could not resume webview.", e);
            }
        }
    }

    /* renamed from: J */
    public final void mo10340J() {
        C1772wz.m8287a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo10358f(boolean z) {
        this.f1672j.mo10412b(z);
    }

    public final void stopLoading() {
        if (!mo10331A()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C1772wz.m1625b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo10355d(boolean z) {
        this.f1683u = z;
    }

    /* renamed from: C */
    public final synchronized boolean mo10333C() {
        return this.f1683u;
    }

    /* renamed from: D */
    public final synchronized boolean mo10334D() {
        return this.f1684v;
    }

    public final synchronized void zzjf() {
        this.f1684v = true;
        if (this.f1666d != null) {
            this.f1666d.zzjf();
        }
    }

    public final synchronized void zzjg() {
        this.f1684v = false;
        if (this.f1666d != null) {
            this.f1666d.zzjg();
        }
    }

    /* renamed from: S */
    private final synchronized void m2027S() {
        if (this.f1660P != null) {
            for (aeo a : this.f1660P.values()) {
                a.mo9592a();
            }
        }
        this.f1660P = null;
    }

    /* renamed from: a */
    public final synchronized void mo10169a(String str, aeo aeo) {
        if (this.f1660P == null) {
            this.f1660P = new HashMap();
        }
        this.f1660P.put(str, aeo);
    }

    /* renamed from: a */
    public final synchronized aeo mo10167a(String str) {
        if (this.f1660P == null) {
            return null;
        }
        return this.f1660P.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo10351b(String str) {
        if (str == null) {
            str = "";
        }
        this.f1685w = str;
    }

    /* renamed from: g */
    public final synchronized String mo10177g() {
        return this.f1685w;
    }

    /* renamed from: l */
    public final synchronized void mo10183l() {
    }

    /* renamed from: c */
    public final C1016aa mo10173c() {
        return this.f1649E;
    }

    /* renamed from: h */
    public final C1017ab mo10179h() {
        return this.f1651G;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1652H = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final View.OnClickListener getOnClickListener() {
        return (View.OnClickListener) this.f1652H.get();
    }

    /* renamed from: a */
    public final synchronized void mo10346a(C1130be beVar) {
        this.f1645A = beVar;
    }

    /* renamed from: H */
    public final synchronized C1130be mo10338H() {
        return this.f1645A;
    }

    /* renamed from: b */
    public final synchronized aga mo10172b() {
        return this.f1686x;
    }

    /* renamed from: a */
    public final synchronized void mo10168a(aga aga) {
        if (this.f1686x != null) {
            C1772wz.m1626c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f1686x = aga;
        }
    }

    /* renamed from: E */
    public final synchronized boolean mo10335E() {
        return this.f1646B > 0;
    }

    /* renamed from: e */
    public final synchronized void mo10357e(boolean z) {
        this.f1646B += z ? 1 : -1;
        if (this.f1646B <= 0 && this.f1673k != null) {
            this.f1673k.zzvx();
        }
    }

    /* renamed from: T */
    private final void m2028T() {
        C1019ad a;
        if (this.f1651G != null && (a = this.f1651G.mo10053a()) != null && zzbv.zzlj().mo13116a() != null) {
            zzbv.zzlj().mo13116a().mo12936a(a);
        }
    }

    /* renamed from: I */
    public final void mo10339I() {
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo10170a(boolean z) {
        this.f1672j.mo10407a(z);
    }

    /* renamed from: f */
    public final void mo10176f() {
        zzd q = mo10378q();
        if (q != null) {
            q.zzvw();
        }
    }

    /* renamed from: j */
    public final int mo10181j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo10182k() {
        return getMeasuredWidth();
    }

    /* renamed from: a */
    public final void mo10441a(zzc zzc) {
        this.f1672j.mo10399a(zzc);
    }

    /* renamed from: a */
    public final void mo10445a(boolean z, int i) {
        this.f1672j.mo10408a(z, i);
    }

    /* renamed from: a */
    public final void mo10446a(boolean z, int i, String str) {
        this.f1672j.mo10409a(z, i, str);
    }

    /* renamed from: a */
    public final void mo10447a(boolean z, int i, String str, String str2) {
        this.f1672j.mo10410a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo10442a(bmq bmq) {
        synchronized (this) {
            this.f1687y = bmq.f4778a;
        }
        m2038g(bmq.f4778a);
    }

    /* renamed from: g */
    private final void m2038g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo10443a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo10347a(String str, zzu<? super afl> zzu) {
        if (this.f1672j != null) {
            this.f1672j.mo10405a(str, zzu);
        }
    }

    /* renamed from: b */
    public final void mo10352b(String str, zzu<? super afl> zzu) {
        if (this.f1672j != null) {
            this.f1672j.mo10411b(str, zzu);
        }
    }

    /* renamed from: a */
    public final void mo10348a(String str, C0980p<zzu<? super afl>> pVar) {
        if (this.f1672j != null) {
            this.f1672j.mo10406a(str, pVar);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ ags mo10388u() {
        return this.f1672j;
    }
}
