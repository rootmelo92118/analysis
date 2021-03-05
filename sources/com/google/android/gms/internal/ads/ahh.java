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
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
final class ahh extends zzbig implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, afl, C1349hh {

    /* renamed from: A */
    private WeakReference<View.OnClickListener> f1778A;
    @GuardedBy("this")

    /* renamed from: B */
    private zzd f1779B;

    /* renamed from: C */
    private C1850zw f1780C;

    /* renamed from: D */
    private final AtomicReference<C0719a> f1781D = new AtomicReference<>();

    /* renamed from: E */
    private int f1782E = -1;

    /* renamed from: F */
    private int f1783F = -1;

    /* renamed from: G */
    private int f1784G = -1;

    /* renamed from: H */
    private int f1785H = -1;

    /* renamed from: I */
    private float f1786I;

    /* renamed from: J */
    private Map<String, aeo> f1787J;

    /* renamed from: K */
    private final WindowManager f1788K;

    /* renamed from: a */
    private final agx f1789a;

    /* renamed from: b */
    private final agz f1790b;
    @Nullable

    /* renamed from: c */
    private final awy f1791c;

    /* renamed from: d */
    private final zzbbi f1792d;

    /* renamed from: e */
    private final zzbo f1793e;

    /* renamed from: f */
    private final zzv f1794f;
    @GuardedBy("this")

    /* renamed from: g */
    private zzd f1795g;
    @GuardedBy("this")

    /* renamed from: h */
    private agy f1796h;
    @GuardedBy("this")

    /* renamed from: i */
    private String f1797i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f1798j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f1799k;
    @GuardedBy("this")

    /* renamed from: l */
    private boolean f1800l;
    @GuardedBy("this")

    /* renamed from: m */
    private int f1801m;
    @GuardedBy("this")

    /* renamed from: n */
    private boolean f1802n = true;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f1803o = false;
    @GuardedBy("this")

    /* renamed from: p */
    private String f1804p = "";
    @GuardedBy("this")

    /* renamed from: q */
    private aga f1805q;
    @GuardedBy("this")

    /* renamed from: r */
    private boolean f1806r;
    @GuardedBy("this")

    /* renamed from: s */
    private boolean f1807s;
    @GuardedBy("this")

    /* renamed from: t */
    private C1130be f1808t;
    @GuardedBy("this")

    /* renamed from: u */
    private int f1809u;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: v */
    public int f1810v;

    /* renamed from: w */
    private C1016aa f1811w;

    /* renamed from: x */
    private C1016aa f1812x;

    /* renamed from: y */
    private C1016aa f1813y;

    /* renamed from: z */
    private C1017ab f1814z;

    protected ahh(agx agx, agz agz, agy agy, String str, boolean z, boolean z2, @Nullable awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv) {
        super(agx, agz);
        this.f1789a = agx;
        this.f1790b = agz;
        this.f1796h = agy;
        this.f1797i = str;
        this.f1799k = z;
        this.f1801m = -1;
        this.f1791c = awy;
        this.f1792d = zzbbi;
        this.f1793e = zzbo;
        this.f1794f = zzv;
        this.f1788K = (WindowManager) getContext().getSystemService("window");
        this.f1780C = new C1850zw(this.f1789a.mo10488a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzbv.zzlf().mo13201a((Context) agx, zzbbi.f7135a, getSettings());
        setDownloadListener(this);
        this.f1786I = agx.getResources().getDisplayMetrics().density;
        m2227N();
        if (C0979o.m1503d()) {
            addJavascriptInterface(agd.m2132a(this), "googleAdsJsInterface");
        }
        m2231R();
        this.f1814z = new C1017ab(new C1019ad(true, "make_wv", this.f1797i));
        this.f1814z.mo10053a().mo10151a(adVar);
        this.f1812x = C1719v.m8117a(this.f1814z.mo10053a());
        this.f1814z.mo10054a("native:view_create", this.f1812x);
        this.f1813y = null;
        this.f1811w = null;
        zzbv.zzlh().mo13236b((Context) agx);
    }

    /* renamed from: B */
    public final void mo10332B() {
    }

    /* renamed from: a */
    public final act mo10166a() {
        return null;
    }

    /* renamed from: a */
    public final void mo10524a(String str, String str2) {
        C1350hi.m6990a((C1349hh) this, str, str2);
    }

    /* renamed from: a */
    public final void mo10443a(String str, Map map) {
        C1350hi.m6991a((C1349hh) this, str, map);
    }

    /* renamed from: a */
    public final void mo10444a(String str, JSONObject jSONObject) {
        C1350hi.m6993b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo10448b(String str, JSONObject jSONObject) {
        C1350hi.m6992a((C1349hh) this, str, jSONObject);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: e */
    public final zzv mo10175e() {
        return this.f1794f;
    }

    /* renamed from: L */
    private final boolean m2225L() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f1790b.mo10413b() && !this.f1790b.mo10510c()) {
            return false;
        }
        zzbv.zzlf();
        DisplayMetrics a = C1782xi.m8358a(this.f1788K);
        bre.m6317a();
        int b = C1851zx.m8593b(a, a.widthPixels);
        bre.m6317a();
        int b2 = C1851zx.m8593b(a, a.heightPixels);
        Activity a2 = this.f1789a.mo10488a();
        if (a2 == null || a2.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzbv.zzlf();
            int[] a3 = C1782xi.m8383a(a2);
            bre.m6317a();
            i2 = C1851zx.m8593b(a, a3[0]);
            bre.m6317a();
            i = C1851zx.m8593b(a, a3[1]);
        }
        if (this.f1783F == b && this.f1782E == b2 && this.f1784G == i2 && this.f1785H == i) {
            return false;
        }
        if (!(this.f1783F == b && this.f1782E == b2)) {
            z = true;
        }
        this.f1783F = b;
        this.f1782E = b2;
        this.f1784G = i2;
        this.f1785H = i;
        new C1514nk(this).mo12827a(b, b2, i2, i, a.density, this.f1788K.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo10349a(String str, String str2, @Nullable String str3) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5933ao)).booleanValue()) {
            str2 = agn.m2144a(str2, agn.m2143a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: d */
    public final synchronized void mo10449d(String str) {
        if (!mo13392A()) {
            super.mo10449d(str);
        } else {
            C1772wz.m1630e("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final void mo10371m() {
        m2226M();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1792d.f7135a);
        C1350hi.m6991a((C1349hh) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo10341a(int i) {
        if (i == 0) {
            C1719v.m8118a(this.f1814z.mo10053a(), this.f1812x, "aebb2");
        }
        m2226M();
        if (this.f1814z.mo10053a() != null) {
            this.f1814z.mo10053a().mo10153a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f1792d.f7135a);
        C1350hi.m6991a((C1349hh) this, "onhide", (Map) hashMap);
    }

    /* renamed from: M */
    private final void m2226M() {
        C1719v.m8118a(this.f1814z.mo10053a(), this.f1812x, "aeh2");
    }

    /* renamed from: n */
    public final void mo10373n() {
        if (this.f1811w == null) {
            C1719v.m8118a(this.f1814z.mo10053a(), this.f1812x, "aes2");
            this.f1811w = C1719v.m8117a(this.f1814z.mo10053a());
            this.f1814z.mo10054a("native:view_show", this.f1811w);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1792d.f7135a);
        C1350hi.m6991a((C1349hh) this, "onshow", (Map) hashMap);
    }

    /* renamed from: o */
    public final void mo10374o() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzlk().mo13247b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzlk().mo13244a()));
        hashMap.put("device_volume", String.valueOf(C1803yc.m8487a(getContext())));
        C1350hi.m6991a((C1349hh) this, "volume", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo10171a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        C1350hi.m6991a((C1349hh) this, "onCacheAccessComplete", (Map) hashMap);
    }

    /* renamed from: q */
    public final synchronized zzd mo10378q() {
        return this.f1795g;
    }

    /* renamed from: y */
    public final C0719a mo10392y() {
        return this.f1781D.get();
    }

    /* renamed from: r */
    public final synchronized zzd mo10379r() {
        return this.f1779B;
    }

    /* renamed from: s */
    public final synchronized agy mo10380s() {
        return this.f1796h;
    }

    /* renamed from: t */
    public final synchronized String mo10387t() {
        return this.f1797i;
    }

    /* renamed from: v */
    public final WebViewClient mo10389v() {
        return this.f1790b;
    }

    /* renamed from: w */
    public final synchronized boolean mo10390w() {
        return this.f1798j;
    }

    /* renamed from: x */
    public final awy mo10391x() {
        return this.f1791c;
    }

    /* renamed from: i */
    public final zzbbi mo10180i() {
        return this.f1792d;
    }

    /* renamed from: z */
    public final synchronized boolean mo10393z() {
        return this.f1799k;
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
        if (this.f1790b.mo10510c()) {
            synchronized (this) {
                if (this.f1808t != null) {
                    this.f1808t.mo11426a(motionEvent);
                }
            }
        } else if (this.f1791c != null) {
            this.f1791c.mo11353a(motionEvent);
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
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d0 A[SYNTHETIC, Splitter:B:109:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x01e6=Splitter:B:116:0x01e6, B:64:0x00dc=Splitter:B:64:0x00dc} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo13392A()     // Catch:{ all -> 0x01eb }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r7.f1799k     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e6
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.mo10495f()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e6
        L_0x0021:
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.mo10497h()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.mo10496g()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C1557p.f5950bE     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r1.mo12778a(r0)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.aga r0 = r7.mo10172b()     // Catch:{ all -> 0x01eb }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo10476h()     // Catch:{ all -> 0x01eb }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
            float r1 = (float) r9     // Catch:{ all -> 0x01eb }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01eb }
            float r2 = (float) r8     // Catch:{ all -> 0x01eb }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01eb }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01eb }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01eb }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01eb }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01eb }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01eb }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.mo10493d()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x00e1
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C1557p.f5955bJ     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r1.mo12778a(r0)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = com.google.android.gms.common.util.C0979o.m1503d()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00dc
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.ahi r1 = new com.google.android.gms.internal.ads.ahi     // Catch:{ all -> 0x01eb }
            r1.<init>(r7)     // Catch:{ all -> 0x01eb }
            r7.mo10347a((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.afl>) r1)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo10449d(r0)     // Catch:{ all -> 0x01eb }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r0 = r7.f1810v     // Catch:{ all -> 0x01eb }
            r1 = -1
            if (r0 == r1) goto L_0x00d3
            int r9 = r7.f1810v     // Catch:{ all -> 0x01eb }
            float r9 = (float) r9     // Catch:{ all -> 0x01eb }
            float r0 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01eb }
            goto L_0x00d7
        L_0x00d3:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
        L_0x00d7:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x00dc:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x00e1:
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.mo10494e()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0100
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01eb }
            r8.<init>()     // Catch:{ all -> 0x01eb }
            android.view.WindowManager r9 = r7.f1788K     // Catch:{ all -> 0x01eb }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01eb }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01eb }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01eb }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0100:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01eb }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01eb }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0120
            if (r0 != r3) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0121
        L_0x0120:
            r0 = r8
        L_0x0121:
            if (r2 == r4) goto L_0x0125
            if (r2 != r3) goto L_0x0126
        L_0x0125:
            r5 = r9
        L_0x0126:
            com.google.android.gms.internal.ads.agy r2 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r2 = r2.f1730b     // Catch:{ all -> 0x01eb }
            r3 = 1
            if (r2 > r0) goto L_0x0136
            com.google.android.gms.internal.ads.agy r2 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r2 = r2.f1729a     // Catch:{ all -> 0x01eb }
            if (r2 <= r5) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r2 = 0
            goto L_0x0137
        L_0x0136:
            r2 = 1
        L_0x0137:
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f6003cE     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01eb }
            java.lang.Object r4 = r6.mo12778a(r4)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01eb }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.agy r4 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r4 = r4.f1730b     // Catch:{ all -> 0x01eb }
            float r4 = (float) r4     // Catch:{ all -> 0x01eb }
            float r6 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01eb }
            float r6 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.agy r0 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r0 = r0.f1729a     // Catch:{ all -> 0x01eb }
            float r0 = (float) r0     // Catch:{ all -> 0x01eb }
            float r4 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01eb }
            float r5 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d0
            com.google.android.gms.internal.ads.agy r2 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r2 = r2.f1730b     // Catch:{ all -> 0x01eb }
            float r2 = (float) r2     // Catch:{ all -> 0x01eb }
            float r3 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.agy r3 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r3 = r3.f1729a     // Catch:{ all -> 0x01eb }
            float r3 = (float) r3     // Catch:{ all -> 0x01eb }
            float r4 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01eb }
            float r8 = (float) r8     // Catch:{ all -> 0x01eb }
            float r4 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01eb }
            float r9 = (float) r9     // Catch:{ all -> 0x01eb }
            float r4 = r7.f1786I     // Catch:{ all -> 0x01eb }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01eb }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01eb }
            r5.<init>(r4)     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01eb }
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            r5.append(r3)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            r5.append(r9)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.C1772wz.m1630e(r8)     // Catch:{ all -> 0x01eb }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01eb }
            if (r8 == r0) goto L_0x01cb
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01eb }
        L_0x01cb:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01d0:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01eb }
            if (r8 == r0) goto L_0x01d9
            r7.setVisibility(r1)     // Catch:{ all -> 0x01eb }
        L_0x01d9:
            com.google.android.gms.internal.ads.agy r8 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r8 = r8.f1730b     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.agy r9 = r7.f1796h     // Catch:{ all -> 0x01eb }
            int r9 = r9.f1729a     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01e6:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01eb:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahh.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean L = m2225L();
        zzd q = mo10378q();
        if (q != null && L) {
            q.zzvu();
        }
    }

    /* renamed from: a */
    public final synchronized void mo10344a(zzd zzd) {
        this.f1795g = zzd;
    }

    /* renamed from: a */
    public final void mo10343a(C0719a aVar) {
        this.f1781D.set(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo10350b(zzd zzd) {
        this.f1779B = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo10345a(agy agy) {
        this.f1796h = agy;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo10353b(boolean z) {
        boolean z2 = z != this.f1799k;
        this.f1799k = z;
        m2227N();
        if (z2) {
            new C1514nk(this).mo12831c(z ? "expanded" : "default");
        }
    }

    /* renamed from: F */
    public final void mo10336F() {
        this.f1780C.mo13296a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo13392A()) {
            this.f1780C.mo13299c();
        }
        boolean z = this.f1806r;
        if (this.f1790b != null && this.f1790b.mo10510c()) {
            if (!this.f1807s) {
                ViewTreeObserver.OnGlobalLayoutListener d = this.f1790b.mo10512d();
                if (d != null) {
                    zzbv.zzme();
                    aby.m1688a((View) this, d);
                }
                ViewTreeObserver.OnScrollChangedListener e = this.f1790b.mo10514e();
                if (e != null) {
                    zzbv.zzme();
                    aby.m1689a((View) this, e);
                }
                this.f1807s = true;
            }
            m2225L();
            z = true;
        }
        m2234h(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo13392A()) {
                this.f1780C.mo13300d();
            }
            super.onDetachedFromWindow();
            if (this.f1807s && this.f1790b != null && this.f1790b.mo10510c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener d = this.f1790b.mo10512d();
                if (d != null) {
                    zzbv.zzlh().mo13230a(getViewTreeObserver(), d);
                }
                ViewTreeObserver.OnScrollChangedListener e = this.f1790b.mo10514e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f1807s = false;
            }
        }
        m2234h(false);
    }

    /* renamed from: a */
    public final void mo10342a(Context context) {
        this.f1789a.setBaseContext(context);
        this.f1780C.mo13297a(this.f1789a.mo10488a());
    }

    /* renamed from: c */
    public final synchronized void mo10354c(boolean z) {
        if (this.f1795g != null) {
            this.f1795g.zza(this.f1790b.mo10413b(), z);
        } else {
            this.f1798j = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f1801m;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f1801m = i;
        if (this.f1795g != null) {
            this.f1795g.setRequestedOrientation(this.f1801m);
        }
    }

    /* renamed from: d */
    public final Activity mo10174d() {
        return this.f1789a.mo10488a();
    }

    /* renamed from: p */
    public final Context mo10377p() {
        return this.f1789a.mo10489b();
    }

    /* renamed from: N */
    private final synchronized void m2227N() {
        if (!this.f1799k) {
            if (!this.f1796h.mo10494e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C1772wz.m1624b("Disabling hardware acceleration on an AdView.");
                    m2228O();
                    return;
                }
                C1772wz.m1624b("Enabling hardware acceleration on an AdView.");
                m2229P();
                return;
            }
        }
        C1772wz.m1624b("Enabling hardware acceleration on an overlay.");
        m2229P();
    }

    /* renamed from: O */
    private final synchronized void m2228O() {
        if (!this.f1800l) {
            zzbv.zzlh().mo13240c((View) this);
        }
        this.f1800l = true;
    }

    /* renamed from: P */
    private final synchronized void m2229P() {
        if (this.f1800l) {
            zzbv.zzlh().mo13237b((View) this);
        }
        this.f1800l = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final synchronized void mo10525g(boolean z) {
        if (!z) {
            try {
                m2231R();
                this.f1780C.mo13298b();
                if (this.f1795g != null) {
                    this.f1795g.close();
                    this.f1795g.onDestroy();
                    this.f1795g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1781D.set((Object) null);
        this.f1790b.mo10515k();
        zzbv.zzmd();
        aen.m1870a((adc) this);
        m2230Q();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (this.f1790b != null && this.f1790b.mo10516l() != null) {
                this.f1790b.mo10516l().zzjw();
            }
        }
    }

    /* renamed from: G */
    public final void mo10337G() {
        if (this.f1813y == null) {
            this.f1813y = C1719v.m8117a(this.f1814z.mo10053a());
            this.f1814z.mo10054a("native:view_load", this.f1813y);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            C1772wz.m1625b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            C1772wz.m1625b("Could not resume webview.", e);
        }
    }

    /* renamed from: J */
    public final void mo10340J() {
        C1772wz.m8287a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo10358f(boolean z) {
        this.f1790b.mo10509b(z);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C1772wz.m1625b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: d */
    public final synchronized void mo10355d(boolean z) {
        this.f1802n = z;
    }

    /* renamed from: C */
    public final synchronized boolean mo10333C() {
        return this.f1802n;
    }

    /* renamed from: D */
    public final synchronized boolean mo10334D() {
        return this.f1803o;
    }

    public final synchronized void zzjf() {
        this.f1803o = true;
        if (this.f1793e != null) {
            this.f1793e.zzjf();
        }
    }

    public final synchronized void zzjg() {
        this.f1803o = false;
        if (this.f1793e != null) {
            this.f1793e.zzjg();
        }
    }

    /* renamed from: Q */
    private final synchronized void m2230Q() {
        if (this.f1787J != null) {
            for (aeo a : this.f1787J.values()) {
                a.mo9592a();
            }
        }
        this.f1787J = null;
    }

    /* renamed from: a */
    public final synchronized void mo10169a(String str, aeo aeo) {
        if (this.f1787J == null) {
            this.f1787J = new HashMap();
        }
        this.f1787J.put(str, aeo);
    }

    /* renamed from: a */
    public final synchronized aeo mo10167a(String str) {
        if (this.f1787J == null) {
            return null;
        }
        return this.f1787J.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo10351b(String str) {
        if (str == null) {
            str = "";
        }
        this.f1804p = str;
    }

    /* renamed from: g */
    public final synchronized String mo10177g() {
        return this.f1804p;
    }

    /* renamed from: c */
    public final C1016aa mo10173c() {
        return this.f1812x;
    }

    /* renamed from: h */
    public final C1017ab mo10179h() {
        return this.f1814z;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1778A = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final View.OnClickListener getOnClickListener() {
        return (View.OnClickListener) this.f1778A.get();
    }

    /* renamed from: a */
    public final synchronized void mo10346a(C1130be beVar) {
        this.f1808t = beVar;
    }

    /* renamed from: H */
    public final synchronized C1130be mo10338H() {
        return this.f1808t;
    }

    /* renamed from: l */
    public final synchronized void mo10183l() {
    }

    /* renamed from: b */
    public final synchronized aga mo10172b() {
        return this.f1805q;
    }

    /* renamed from: a */
    public final synchronized void mo10168a(aga aga) {
        if (this.f1805q != null) {
            C1772wz.m1626c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f1805q = aga;
        }
    }

    /* renamed from: E */
    public final synchronized boolean mo10335E() {
        return this.f1809u > 0;
    }

    /* renamed from: e */
    public final synchronized void mo10357e(boolean z) {
        this.f1809u += z ? 1 : -1;
        if (this.f1809u <= 0 && this.f1795g != null) {
            this.f1795g.zzvx();
        }
    }

    /* renamed from: R */
    private final void m2231R() {
        C1019ad a;
        if (this.f1814z != null && (a = this.f1814z.mo10053a()) != null && zzbv.zzlj().mo13116a() != null) {
            zzbv.zzlj().mo13116a().mo12936a(a);
        }
    }

    /* renamed from: I */
    public final void mo10339I() {
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo10170a(boolean z) {
        this.f1790b.mo10503a(z);
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
        this.f1790b.mo10498a(zzc);
    }

    /* renamed from: a */
    public final void mo10445a(boolean z, int i) {
        this.f1790b.mo10504a(z, i);
    }

    /* renamed from: a */
    public final void mo10446a(boolean z, int i, String str) {
        this.f1790b.mo10505a(z, i, str);
    }

    /* renamed from: a */
    public final void mo10447a(boolean z, int i, String str, String str2) {
        this.f1790b.mo10506a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo10442a(bmq bmq) {
        synchronized (this) {
            this.f1806r = bmq.f4778a;
        }
        m2234h(bmq.f4778a);
    }

    /* renamed from: h */
    private final void m2234h(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        C1350hi.m6991a((C1349hh) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo10347a(String str, zzu<? super afl> zzu) {
        if (this.f1790b != null) {
            this.f1790b.mo10501a(str, zzu);
        }
    }

    /* renamed from: b */
    public final void mo10352b(String str, zzu<? super afl> zzu) {
        if (this.f1790b != null) {
            this.f1790b.mo10508b(str, zzu);
        }
    }

    /* renamed from: a */
    public final void mo10348a(String str, C0980p<zzu<? super afl>> pVar) {
        if (this.f1790b != null) {
            this.f1790b.mo10502a(str, pVar);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ ags mo10388u() {
        return this.f1790b;
    }
}
