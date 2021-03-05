package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@C1598qn
public final class bmn implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private static final long f4760a = ((Long) bre.m6321e().mo12778a(C1557p.f5915aW)).longValue();

    /* renamed from: b */
    private final Context f4761b;

    /* renamed from: c */
    private Application f4762c;

    /* renamed from: d */
    private final WindowManager f4763d;

    /* renamed from: e */
    private final PowerManager f4764e;

    /* renamed from: f */
    private final KeyguardManager f4765f;
    @Nullable

    /* renamed from: g */
    private BroadcastReceiver f4766g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f4767h;

    /* renamed from: i */
    private WeakReference<View> f4768i;

    /* renamed from: j */
    private bms f4769j;

    /* renamed from: k */
    private C1840zm f4770k = new C1840zm(f4760a);

    /* renamed from: l */
    private boolean f4771l = false;

    /* renamed from: m */
    private int f4772m = -1;

    /* renamed from: n */
    private final HashSet<bmr> f4773n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f4774o;

    /* renamed from: p */
    private final Rect f4775p;

    public bmn(Context context, View view) {
        this.f4761b = context.getApplicationContext();
        this.f4763d = (WindowManager) context.getSystemService("window");
        this.f4764e = (PowerManager) this.f4761b.getSystemService("power");
        this.f4765f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f4761b instanceof Application) {
            this.f4762c = (Application) this.f4761b;
            this.f4769j = new bms((Application) this.f4761b, this);
        }
        this.f4774o = context.getResources().getDisplayMetrics();
        this.f4775p = new Rect();
        this.f4775p.right = this.f4763d.getDefaultDisplay().getWidth();
        this.f4775p.bottom = this.f4763d.getDefaultDisplay().getHeight();
        View view2 = this.f4768i != null ? (View) this.f4768i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m6001b(view2);
        }
        this.f4768i = new WeakReference<>(view);
        if (view != null) {
            if (zzbv.zzlh().mo13233a(view)) {
                m5997a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo12181a(bmr bmr) {
        this.f4773n.add(bmr);
        m5995a(3);
    }

    /* renamed from: b */
    public final void mo12182b(bmr bmr) {
        this.f4773n.remove(bmr);
    }

    /* renamed from: b */
    private final void m6000b() {
        zzbv.zzlf();
        C1782xi.f6838a.post(new bmo(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4772m = -1;
        m5997a(view);
        m5995a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f4772m = -1;
        m5995a(3);
        m6000b();
        m6001b(view);
    }

    /* renamed from: a */
    private final void m5996a(Activity activity, int i) {
        Window window;
        if (this.f4768i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f4768i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f4772m = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m5996a(activity, 0);
        m5995a(3);
        m6000b();
    }

    public final void onActivityStarted(Activity activity) {
        m5996a(activity, 0);
        m5995a(3);
        m6000b();
    }

    public final void onActivityResumed(Activity activity) {
        m5996a(activity, 0);
        m5995a(3);
        m6000b();
    }

    public final void onActivityPaused(Activity activity) {
        m5996a(activity, 4);
        m5995a(3);
        m6000b();
    }

    public final void onActivityStopped(Activity activity) {
        m5995a(3);
        m6000b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m5995a(3);
        m6000b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m5995a(3);
        m6000b();
    }

    public final void onGlobalLayout() {
        m5995a(2);
        m6000b();
    }

    public final void onScrollChanged() {
        m5995a(1);
    }

    /* renamed from: a */
    public final void mo12180a() {
        m5995a(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m5995a(int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        if (this.f4773n.size() != 0 && this.f4768i != null) {
            View view = (View) this.f4768i.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    C1772wz.m1625b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f4772m != -1) {
                windowVisibility = this.f4772m;
            }
            boolean z5 = !z4 && zzbv.zzlf().mo13206a(view, this.f4764e, this.f4765f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f4770k.mo13287a() && z5 == this.f4771l) {
                return;
            }
            if (z5 || this.f4771l || i2 != 1) {
                bmq bmq = new bmq(zzbv.zzlm().mo9997b(), this.f4764e.isScreenOn(), view != null ? zzbv.zzlh().mo13233a(view) : false, view != null ? view.getWindowVisibility() : 8, m5994a(this.f4775p), m5994a(rect), m5994a(rect2), z2, m5994a(rect3), z, m5994a(rect4), this.f4774o.density, z5);
                Iterator<bmr> it = this.f4773n.iterator();
                while (it.hasNext()) {
                    it.next().mo10442a(bmq);
                }
                this.f4771l = z5;
            }
        }
    }

    /* renamed from: a */
    private final Rect m5994a(Rect rect) {
        return new Rect(m5999b(rect.left), m5999b(rect.top), m5999b(rect.right), m5999b(rect.bottom));
    }

    /* renamed from: b */
    private final int m5999b(int i) {
        return (int) (((float) i) / this.f4774o.density);
    }

    /* renamed from: a */
    private final void m5997a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4767h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f4766g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f4766g = new bmp(this);
            zzbv.zzmc().mo13294a(this.f4761b, this.f4766g, intentFilter);
        }
        if (this.f4762c != null) {
            try {
                this.f4762c.registerActivityLifecycleCallbacks(this.f4769j);
            } catch (Exception e) {
                C1772wz.m1625b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: b */
    private final void m6001b(View view) {
        try {
            if (this.f4767h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4767h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f4767h = null;
            }
        } catch (Exception e) {
            C1772wz.m1625b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C1772wz.m1625b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f4766g != null) {
            try {
                zzbv.zzmc().mo13293a(this.f4761b, this.f4766g);
            } catch (IllegalStateException e3) {
                C1772wz.m1625b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzbv.zzlj().mo13119a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f4766g = null;
        }
        if (this.f4762c != null) {
            try {
                this.f4762c.unregisterActivityLifecycleCallbacks(this.f4769j);
            } catch (Exception e5) {
                C1772wz.m1625b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }
}
