package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class blq implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    protected final blo f4698a;

    /* renamed from: b */
    private final Object f4699b = new Object();

    /* renamed from: c */
    private final WeakReference<C1752wf> f4700c;

    /* renamed from: d */
    private WeakReference<ViewTreeObserver> f4701d;

    /* renamed from: e */
    private final bnb f4702e;

    /* renamed from: f */
    private final Context f4703f;

    /* renamed from: g */
    private final WindowManager f4704g;

    /* renamed from: h */
    private final PowerManager f4705h;

    /* renamed from: i */
    private final KeyguardManager f4706i;

    /* renamed from: j */
    private final DisplayMetrics f4707j;
    @Nullable

    /* renamed from: k */
    private blx f4708k;

    /* renamed from: l */
    private boolean f4709l;

    /* renamed from: m */
    private boolean f4710m = false;

    /* renamed from: n */
    private boolean f4711n = false;

    /* renamed from: o */
    private boolean f4712o;

    /* renamed from: p */
    private boolean f4713p;

    /* renamed from: q */
    private boolean f4714q;
    @Nullable

    /* renamed from: r */
    private BroadcastReceiver f4715r;

    /* renamed from: s */
    private final HashSet<bln> f4716s = new HashSet<>();

    /* renamed from: t */
    private C1840zm f4717t;

    /* renamed from: u */
    private final HashSet<bmm> f4718u = new HashSet<>();

    /* renamed from: v */
    private final Rect f4719v = new Rect();

    /* renamed from: w */
    private final blt f4720w;

    /* renamed from: x */
    private float f4721x;

    public blq(Context context, zzwf zzwf, C1752wf wfVar, zzbbi zzbbi, bnb bnb) {
        this.f4700c = new WeakReference<>(wfVar);
        this.f4702e = bnb;
        this.f4701d = new WeakReference<>((Object) null);
        this.f4712o = true;
        this.f4714q = false;
        this.f4717t = new C1840zm(200);
        this.f4698a = new blo(UUID.randomUUID().toString(), zzbbi, zzwf.f7292a, wfVar.f6708k, wfVar.mo13096a(), zzwf.f7299h);
        this.f4704g = (WindowManager) context.getSystemService("window");
        this.f4705h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f4706i = (KeyguardManager) context.getSystemService("keyguard");
        this.f4703f = context;
        this.f4720w = new blt(this, new Handler());
        this.f4703f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f4720w);
        this.f4707j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f4704g.getDefaultDisplay();
        this.f4719v.right = defaultDisplay.getWidth();
        this.f4719v.bottom = defaultDisplay.getHeight();
        mo12152a();
    }

    /* renamed from: a */
    public final void mo12152a() {
        this.f4721x = C1803yc.m8487a(this.f4703f);
    }

    /* renamed from: b */
    public final void mo12158b() {
        synchronized (this.f4699b) {
            if (this.f4712o) {
                this.f4713p = true;
                try {
                    JSONObject i = m5942i();
                    i.put("doneReasonCode", "u");
                    m5939a(i, true);
                } catch (JSONException e) {
                    C1772wz.m1625b("JSON failure while processing active view data.", e);
                } catch (RuntimeException e2) {
                    C1772wz.m1625b("Failure while processing active view data.", e2);
                }
                String valueOf = String.valueOf(this.f4698a.mo12140d());
                C1772wz.m1624b(valueOf.length() != 0 ? "Untracking ad unit: ".concat(valueOf) : new String("Untracking ad unit: "));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cd, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12153a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4699b
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.bmm> r1 = r7.f4718u     // Catch:{ all -> 0x00ce }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ce }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.bmm r2 = (com.google.android.gms.internal.ads.bmm) r2     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo12174a()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x00cc
            boolean r1 = r7.f4712o     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0028
            goto L_0x00cc
        L_0x0028:
            com.google.android.gms.internal.ads.bnb r1 = r7.f4702e     // Catch:{ all -> 0x00ce }
            android.view.View r1 = r1.mo12169a()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.xi r2 = com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x00ce }
            android.os.PowerManager r5 = r7.f4705h     // Catch:{ all -> 0x00ce }
            android.app.KeyguardManager r6 = r7.f4706i     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo13206a((android.view.View) r1, (android.os.PowerManager) r5, (android.app.KeyguardManager) r6)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00ce }
            r5.<init>()     // Catch:{ all -> 0x00ce }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            com.google.android.gms.internal.ads.bnb r6 = r7.f4702e     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo12170b()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x0061
            r7.mo12158b()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0061:
            if (r8 != r4) goto L_0x0071
            com.google.android.gms.internal.ads.zm r6 = r7.f4717t     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo13287a()     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x0071
            boolean r6 = r7.f4714q     // Catch:{ all -> 0x00ce }
            if (r5 != r6) goto L_0x0071
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0071:
            if (r5 != 0) goto L_0x007b
            boolean r6 = r7.f4714q     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x007b
            if (r8 != r4) goto L_0x007b
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x007b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            org.json.JSONObject r8 = r7.m5937a((android.view.View) r1, (java.lang.Boolean) r8)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.m5939a((org.json.JSONObject) r8, (boolean) r3)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.f4714q = r5     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            goto L_0x008f
        L_0x0089:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.C1772wz.m1622a(r1, r8)     // Catch:{ all -> 0x00ce }
        L_0x008f:
            com.google.android.gms.internal.ads.bnb r8 = r7.f4702e     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.bnb r8 = r8.mo12171c()     // Catch:{ all -> 0x00ce }
            android.view.View r8 = r8.mo12169a()     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00c7
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f4701d     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00ce }
            if (r8 == r1) goto L_0x00c7
            r7.m5941h()     // Catch:{ all -> 0x00ce }
            boolean r2 = r7.f4709l     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00c0
        L_0x00b8:
            r7.f4709l = r4     // Catch:{ all -> 0x00ce }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00ce }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00ce }
        L_0x00c0:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ce }
            r1.<init>(r8)     // Catch:{ all -> 0x00ce }
            r7.f4701d = r1     // Catch:{ all -> 0x00ce }
        L_0x00c7:
            r7.m5940g()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.blq.mo12153a(int):void");
    }

    /* renamed from: g */
    private final void m5940g() {
        if (this.f4708k != null) {
            this.f4708k.mo12143a(this);
        }
    }

    /* renamed from: c */
    public final boolean mo12162c() {
        boolean z;
        synchronized (this.f4699b) {
            z = this.f4712o;
        }
        return z;
    }

    /* renamed from: a */
    private static int m5936a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12157a(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f4698a.mo12140d())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12160b(Map<String, String> map) {
        mo12153a(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12156a(bmm bmm, Map<String, String> map) {
        String valueOf = String.valueOf(this.f4698a.mo12140d());
        C1772wz.m1624b(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
        mo12159b(bmm);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12161c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator<bln> it = this.f4716s.iterator();
            while (it.hasNext()) {
                it.next().mo12136a(this, z);
            }
        }
    }

    /* renamed from: h */
    private final void m5941h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4701d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: i */
    private final JSONObject m5942i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f4698a.mo12138b()).put("activeViewJSON", this.f4698a.mo12139c()).put("timestamp", zzbv.zzlm().mo9997b()).put("adFormat", this.f4698a.mo12137a()).put("hashCode", this.f4698a.mo12140d()).put("isMraid", this.f4698a.mo12141e()).put("isStopped", this.f4711n).put("isPaused", this.f4710m).put("isNative", this.f4698a.mo12142f()).put("isScreenOn", m5943j()).put("appMuted", zzbv.zzlk().mo13247b()).put("appVolume", (double) zzbv.zzlk().mo13244a()).put("deviceVolume", (double) this.f4721x);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m5938a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m5939a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m5938a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f4718u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bmm) obj).mo12173a(a, z);
            }
        } catch (Throwable th) {
            C1772wz.m1625b("Skipping active view message.", th);
        }
    }

    /* renamed from: a */
    public final void mo12155a(bmm bmm) {
        if (this.f4718u.isEmpty()) {
            synchronized (this.f4699b) {
                if (this.f4715r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f4715r = new blr(this);
                    zzbv.zzmc().mo13294a(this.f4703f, this.f4715r, intentFilter);
                }
            }
            mo12153a(3);
        }
        this.f4718u.add(bmm);
        try {
            bmm.mo12173a(m5938a(m5937a(this.f4702e.mo12169a(), (Boolean) null)), false);
        } catch (JSONException e) {
            C1772wz.m1625b("Skipping measurement update for new client.", e);
        }
    }

    /* renamed from: b */
    public final void mo12159b(bmm bmm) {
        this.f4718u.remove(bmm);
        bmm.mo12175b();
        if (this.f4718u.isEmpty()) {
            synchronized (this.f4699b) {
                m5941h();
                synchronized (this.f4699b) {
                    if (this.f4715r != null) {
                        try {
                            zzbv.zzmc().mo13293a(this.f4703f, this.f4715r);
                        } catch (IllegalStateException e) {
                            C1772wz.m1625b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            zzbv.zzlj().mo13119a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f4715r = null;
                    }
                }
                this.f4703f.getContentResolver().unregisterContentObserver(this.f4720w);
                int i = 0;
                this.f4712o = false;
                m5940g();
                ArrayList arrayList = new ArrayList(this.f4718u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo12159b((bmm) obj);
                }
            }
        }
    }

    /* renamed from: a */
    private final JSONObject m5937a(@Nullable View view, @Nullable Boolean bool) {
        if (view == null) {
            return m5942i().put("isAttachedToWindow", false).put("isScreenOn", m5943j()).put("isVisible", false);
        }
        boolean a = zzbv.zzlh().mo13233a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C1772wz.m1625b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, (Point) null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m5942i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m5936a(this.f4719v.top, this.f4707j)).put("bottom", m5936a(this.f4719v.bottom, this.f4707j)).put("left", m5936a(this.f4719v.left, this.f4707j)).put("right", m5936a(this.f4719v.right, this.f4707j))).put("adBox", new JSONObject().put("top", m5936a(rect.top, this.f4707j)).put("bottom", m5936a(rect.bottom, this.f4707j)).put("left", m5936a(rect.left, this.f4707j)).put("right", m5936a(rect.right, this.f4707j))).put("globalVisibleBox", new JSONObject().put("top", m5936a(rect2.top, this.f4707j)).put("bottom", m5936a(rect2.bottom, this.f4707j)).put("left", m5936a(rect2.left, this.f4707j)).put("right", m5936a(rect2.right, this.f4707j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m5936a(rect3.top, this.f4707j)).put("bottom", m5936a(rect3.bottom, this.f4707j)).put("left", m5936a(rect3.left, this.f4707j)).put("right", m5936a(rect3.right, this.f4707j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m5936a(rect4.top, this.f4707j)).put("bottom", m5936a(rect4.bottom, this.f4707j)).put("left", m5936a(rect4.left, this.f4707j)).put("right", m5936a(rect4.right, this.f4707j))).put("screenDensity", (double) this.f4707j.density);
        if (bool == null) {
            bool = Boolean.valueOf(zzbv.zzlf().mo13206a(view, this.f4705h, this.f4706i));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    /* renamed from: j */
    private final boolean m5943j() {
        if (Build.VERSION.SDK_INT >= 20) {
            return this.f4705h.isInteractive();
        }
        return this.f4705h.isScreenOn();
    }

    public final void onScrollChanged() {
        mo12153a(1);
    }

    public final void onGlobalLayout() {
        mo12153a(2);
    }

    /* renamed from: a */
    public final void mo12154a(blx blx) {
        synchronized (this.f4699b) {
            this.f4708k = blx;
        }
    }

    /* renamed from: d */
    public final void mo12163d() {
        synchronized (this.f4699b) {
            this.f4711n = true;
            mo12153a(3);
        }
    }

    /* renamed from: e */
    public final void mo12164e() {
        synchronized (this.f4699b) {
            this.f4710m = true;
            mo12153a(3);
        }
    }

    /* renamed from: f */
    public final void mo12165f() {
        synchronized (this.f4699b) {
            this.f4710m = false;
            mo12153a(3);
        }
    }
}
