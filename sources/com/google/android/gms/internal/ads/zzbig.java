package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
public class zzbig extends ahj implements aho {

    /* renamed from: a */
    private final ahk f7195a;
    @GuardedBy("this")

    /* renamed from: b */
    private boolean f7196b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f7197c;

    public zzbig(Context context, ahk ahk) {
        super(context);
        zzbv.zzlj().mo13128h();
        this.f7195a = ahk;
        super.setWebViewClient(ahk);
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    /* renamed from: g */
    public void mo10525g(boolean z) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* renamed from: A */
    public final synchronized boolean mo13392A() {
        return this.f7196b;
    }

    public synchronized void destroy() {
        if (!this.f7196b) {
            this.f7196b = true;
            this.f7195a.mo10536a((aho) this);
            mo10525g(false);
            C1772wz.m8287a("Initiating WebView self destruct sequence in 3...");
            C1772wz.m8287a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzbv.zzlj().mo13119a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo10548a(ahl ahl) {
        C1772wz.m8287a("Blank page loaded, 1...");
        mo10332B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public synchronized void mo10332B() {
        C1772wz.m8287a("Destroying WebView!");
        mo10166a();
        abl.f1313a.execute(new ahm(this));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!mo13392A()) {
                    mo10525g(true);
                }
                mo10166a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: a */
    private final synchronized void mo10166a() {
        if (!this.f7197c) {
            this.f7197c = true;
            zzbv.zzlj().mo13129i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo13392A()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbig.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!mo13392A()) {
            super.loadUrl(str);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo13392A()) {
            super.loadData(str, str2, str3);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo13392A()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C1772wz.m1630e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo13392A() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!mo13392A()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo13392A()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo13392A()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!mo13392A()) {
            super.stopLoading();
        }
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo10449d(String str) {
        super.mo10449d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo13393K() {
        super.destroy();
    }
}
