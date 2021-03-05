package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0979o;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@C1598qn
@ParametersAreNonnullByDefault
public final class bni extends Thread {

    /* renamed from: a */
    private boolean f4838a;

    /* renamed from: b */
    private boolean f4839b;

    /* renamed from: c */
    private boolean f4840c;

    /* renamed from: d */
    private final Object f4841d;

    /* renamed from: e */
    private final bnd f4842e;

    /* renamed from: f */
    private final int f4843f;

    /* renamed from: g */
    private final int f4844g;

    /* renamed from: h */
    private final int f4845h;

    /* renamed from: i */
    private final int f4846i;

    /* renamed from: j */
    private final int f4847j;

    /* renamed from: k */
    private final int f4848k;

    /* renamed from: l */
    private final int f4849l;

    /* renamed from: m */
    private final int f4850m;

    /* renamed from: n */
    private final String f4851n;

    /* renamed from: o */
    private final boolean f4852o;

    public bni() {
        this(new bnd());
    }

    private bni(bnd bnd) {
        this.f4838a = false;
        this.f4839b = false;
        this.f4840c = false;
        this.f4842e = bnd;
        this.f4841d = new Object();
        this.f4844g = ((Integer) bre.m6321e().mo12778a(C1557p.f5880O)).intValue();
        this.f4845h = ((Integer) bre.m6321e().mo12778a(C1557p.f5881P)).intValue();
        this.f4846i = ((Integer) bre.m6321e().mo12778a(C1557p.f5882Q)).intValue();
        this.f4847j = ((Integer) bre.m6321e().mo12778a(C1557p.f5883R)).intValue();
        this.f4848k = ((Integer) bre.m6321e().mo12778a(C1557p.f5885T)).intValue();
        this.f4849l = ((Integer) bre.m6321e().mo12778a(C1557p.f5886U)).intValue();
        this.f4850m = ((Integer) bre.m6321e().mo12778a(C1557p.f5887V)).intValue();
        this.f4843f = ((Integer) bre.m6321e().mo12778a(C1557p.f5884S)).intValue();
        this.f4851n = (String) bre.m6321e().mo12778a(C1557p.f5889X);
        this.f4852o = ((Boolean) bre.m6321e().mo12778a(C1557p.f5890Y)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final void mo12241a() {
        synchronized (this.f4841d) {
            if (this.f4838a) {
                C1772wz.m1624b("Content hash thread already started, quiting...");
                return;
            }
            this.f4838a = true;
            start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.ads.internal.zzbv.zzlj().mo13119a((java.lang.Throwable) r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.C1772wz.m1624b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        com.google.android.gms.internal.ads.C1772wz.m1625b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[LOOP:1: B:29:0x0083->B:41:0x0083, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m6053e()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.bne r0 = com.google.android.gms.ads.internal.zzbv.zzli()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            android.app.Activity r0 = r0.mo12224a()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m6054f()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0019:
            if (r0 == 0) goto L_0x0061
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo13119a((java.lang.Throwable) r0, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x004c:
            if (r1 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.bnj r0 = new com.google.android.gms.internal.ads.bnj     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.C1772wz.m1624b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m6054f()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x0061:
            int r0 = r4.f4843f     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C1772wz.m1625b(r1, r0)
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.ads.internal.zzbv.zzlj()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo13119a((java.lang.Throwable) r0, (java.lang.String) r2)
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C1772wz.m1625b(r1, r0)
        L_0x0080:
            java.lang.Object r0 = r4.f4841d
            monitor-enter(r0)
        L_0x0083:
            boolean r1 = r4.f4839b     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.C1772wz.m1624b(r1)     // Catch:{ InterruptedException -> 0x0083 }
            java.lang.Object r1 = r4.f4841d     // Catch:{ InterruptedException -> 0x0083 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0083 }
            goto L_0x0083
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0000
        L_0x0095:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bni.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12242a(View view) {
        try {
            bnc bnc = new bnc(this.f4844g, this.f4845h, this.f4846i, this.f4847j, this.f4848k, this.f4849l, this.f4850m);
            Context b = zzbv.zzli().mo12227b();
            if (b != null && !TextUtils.isEmpty(this.f4851n)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) bre.m6321e().mo12778a(C1557p.f5888W), "id", b.getPackageName()));
                if (str != null && str.equals(this.f4851n)) {
                    return;
                }
            }
            bnn a = m6052a(view, bnc);
            bnc.mo12215h();
            if (a.f4861a != 0 || a.f4862b != 0) {
                if (a.f4862b != 0 || bnc.mo12218j() != 0) {
                    if (a.f4862b != 0 || !this.f4842e.mo12221a(bnc)) {
                        this.f4842e.mo12223c(bnc);
                    }
                }
            }
        } catch (Exception e) {
            C1772wz.m1625b("Exception in fetchContentOnUIThread", e);
            zzbv.zzlj().mo13119a((Throwable) e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: e */
    private static boolean m6053e() {
        boolean z;
        try {
            Context b = zzbv.zzli().mo12227b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                if (powerManager == null) {
                                    z = false;
                                } else {
                                    z = powerManager.isScreenOn();
                                }
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzbv.zzlj().mo13119a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: a */
    private final bnn m6052a(@Nullable View view, bnc bnc) {
        boolean z;
        if (view == null) {
            return new bnn(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new bnn(this, 0, 0);
            }
            bnc.mo12208b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new bnn(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof afl)) {
            bnc.mo12214g();
            WebView webView = (WebView) view;
            if (!C0979o.m1505f()) {
                z = false;
            } else {
                bnc.mo12214g();
                webView.post(new bnk(this, bnc, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new bnn(this, 0, 1);
            }
            return new bnn(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new bnn(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                bnn a = m6052a(viewGroup.getChildAt(i3), bnc);
                i += a.f4861a;
                i2 += a.f4862b;
            }
            return new bnn(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12243a(bnc bnc, WebView webView, String str, boolean z) {
        bnc.mo12213f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f4852o || TextUtils.isEmpty(webView.getTitle())) {
                    bnc.mo12205a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    bnc.mo12205a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (bnc.mo12206a()) {
                this.f4842e.mo12222b(bnc);
            }
        } catch (JSONException unused) {
            C1772wz.m1624b("Json string may be malformed.");
        } catch (Throwable th) {
            C1772wz.m1622a("Failed to get webview content.", th);
            zzbv.zzlj().mo13119a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: b */
    public final bnc mo12244b() {
        return this.f4842e.mo12220a();
    }

    /* renamed from: c */
    public final void mo12245c() {
        synchronized (this.f4841d) {
            this.f4839b = false;
            this.f4841d.notifyAll();
            C1772wz.m1624b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: f */
    private final void m6054f() {
        synchronized (this.f4841d) {
            this.f4839b = true;
            boolean z = this.f4839b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C1772wz.m1624b(sb.toString());
        }
    }

    /* renamed from: d */
    public final boolean mo12246d() {
        return this.f4839b;
    }
}
