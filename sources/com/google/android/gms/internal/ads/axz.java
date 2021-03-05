package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class axz implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private static final Handler f3087a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f3088b;

    /* renamed from: c */
    private Application f3089c;

    /* renamed from: d */
    private final PowerManager f3090d;

    /* renamed from: e */
    private final KeyguardManager f3091e;

    /* renamed from: f */
    private final axq f3092f;

    /* renamed from: g */
    private BroadcastReceiver f3093g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f3094h;

    /* renamed from: i */
    private WeakReference<View> f3095i;

    /* renamed from: j */
    private axd f3096j;

    /* renamed from: k */
    private boolean f3097k = false;

    /* renamed from: l */
    private int f3098l = -1;

    /* renamed from: m */
    private long f3099m = -3;

    public axz(axq axq, View view) {
        this.f3092f = axq;
        this.f3088b = axq.f3046a;
        this.f3090d = (PowerManager) this.f3088b.getSystemService("power");
        this.f3091e = (KeyguardManager) this.f3088b.getSystemService("keyguard");
        if (this.f3088b instanceof Application) {
            this.f3089c = (Application) this.f3088b;
            this.f3096j = new axd((Application) this.f3088b, this);
        }
        mo11394a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11394a(View view) {
        View view2 = this.f3095i != null ? (View) this.f3095i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m4444c(view2);
        }
        this.f3095i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m4442b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f3099m = -2;
            return;
        }
        this.f3099m = -3;
    }

    /* renamed from: b */
    private final void m4441b() {
        f3087a.post(new aya(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f3098l = -1;
        m4442b(view);
        m4443c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f3098l = -1;
        m4443c();
        m4441b();
        m4444c(view);
    }

    /* renamed from: a */
    private final void m4439a(Activity activity, int i) {
        Window window;
        if (this.f3095i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f3095i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f3098l = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4439a(activity, 0);
        m4443c();
    }

    public final void onActivityStarted(Activity activity) {
        m4439a(activity, 0);
        m4443c();
    }

    public final void onActivityResumed(Activity activity) {
        m4439a(activity, 0);
        m4443c();
        m4441b();
    }

    public final void onActivityPaused(Activity activity) {
        m4439a(activity, 4);
        m4443c();
    }

    public final void onActivityStopped(Activity activity) {
        m4443c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4443c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m4443c();
    }

    public final void onGlobalLayout() {
        m4443c();
    }

    public final void onScrollChanged() {
        m4443c();
    }

    /* renamed from: a */
    public final long mo11393a() {
        if (this.f3099m == -2 && this.f3095i.get() == null) {
            this.f3099m = -3;
        }
        return this.f3099m;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4443c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f3095i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f3095i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0017
            r2 = -3
            r9.f3099m = r2
            r9.f3097k = r1
            return
        L_0x0017:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.axq r4 = r9.f3092f
            boolean r4 = r4.mo11383j()
            r5 = 1
            if (r4 != 0) goto L_0x005d
            android.app.KeyguardManager r4 = r9.f3091e
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x005b
            android.app.Activity r4 = com.google.android.gms.internal.ads.axx.m4431a((android.view.View) r0)
            if (r4 == 0) goto L_0x0057
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0048
            r4 = 0
            goto L_0x004c
        L_0x0048:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r4 = 0
            goto L_0x005e
        L_0x005d:
            r4 = 1
        L_0x005e:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.f3098l
            r8 = -1
            if (r7 == r8) goto L_0x0069
            int r6 = r9.f3098l
        L_0x0069:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0086
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0086
            android.os.PowerManager r0 = r9.f3090d
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            r1 = 1
        L_0x0086:
            boolean r0 = r9.f3097k
            if (r0 == r1) goto L_0x0097
            if (r1 == 0) goto L_0x0091
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0093
        L_0x0091:
            r2 = -2
        L_0x0093:
            r9.f3099m = r2
            r9.f3097k = r1
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axz.m4443c():void");
    }

    /* renamed from: b */
    private final void m4442b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f3094h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f3093g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f3093g = new ayb(this);
            this.f3088b.registerReceiver(this.f3093g, intentFilter);
        }
        if (this.f3089c != null) {
            try {
                this.f3089c.registerActivityLifecycleCallbacks(this.f3096j);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4444c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f3094h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f3094h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f3094h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f3093g
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.f3088b     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.f3093g     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f3093g = r0
        L_0x003a:
            android.app.Application r4 = r3.f3089c
            if (r4 == 0) goto L_0x0046
            android.app.Application r4 = r3.f3089c     // Catch:{ Exception -> 0x0046 }
            com.google.android.gms.internal.ads.axd r0 = r3.f3096j     // Catch:{ Exception -> 0x0046 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axz.m4444c(android.view.View):void");
    }
}
