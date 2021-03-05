package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zw */
public final class C1850zw {

    /* renamed from: a */
    private final View f6955a;

    /* renamed from: b */
    private Activity f6956b;

    /* renamed from: c */
    private boolean f6957c;

    /* renamed from: d */
    private boolean f6958d;

    /* renamed from: e */
    private boolean f6959e;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f6960f;

    /* renamed from: g */
    private ViewTreeObserver.OnScrollChangedListener f6961g;

    public C1850zw(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f6956b = activity;
        this.f6955a = view;
        this.f6960f = onGlobalLayoutListener;
        this.f6961g = onScrollChangedListener;
    }

    /* renamed from: a */
    public final void mo13297a(Activity activity) {
        this.f6956b = activity;
    }

    /* renamed from: a */
    public final void mo13296a() {
        this.f6959e = true;
        if (this.f6958d) {
            m8575e();
        }
    }

    /* renamed from: b */
    public final void mo13298b() {
        this.f6959e = false;
        m8576f();
    }

    /* renamed from: c */
    public final void mo13299c() {
        this.f6958d = true;
        if (this.f6959e) {
            m8575e();
        }
    }

    /* renamed from: d */
    public final void mo13300d() {
        this.f6958d = false;
        m8576f();
    }

    /* renamed from: e */
    private final void m8575e() {
        if (!this.f6957c) {
            if (this.f6960f != null) {
                if (this.f6956b != null) {
                    Activity activity = this.f6956b;
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6960f;
                    ViewTreeObserver b = m8574b(activity);
                    if (b != null) {
                        b.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                zzbv.zzme();
                aby.m1688a(this.f6955a, this.f6960f);
            }
            if (this.f6961g != null) {
                if (this.f6956b != null) {
                    Activity activity2 = this.f6956b;
                    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f6961g;
                    ViewTreeObserver b2 = m8574b(activity2);
                    if (b2 != null) {
                        b2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                zzbv.zzme();
                aby.m1689a(this.f6955a, this.f6961g);
            }
            this.f6957c = true;
        }
    }

    /* renamed from: f */
    private final void m8576f() {
        if (this.f6956b != null && this.f6957c) {
            if (this.f6960f != null) {
                Activity activity = this.f6956b;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6960f;
                ViewTreeObserver b = m8574b(activity);
                if (b != null) {
                    zzbv.zzlh().mo13230a(b, onGlobalLayoutListener);
                }
            }
            if (this.f6961g != null) {
                Activity activity2 = this.f6956b;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f6961g;
                ViewTreeObserver b2 = m8574b(activity2);
                if (b2 != null) {
                    b2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f6957c = false;
        }
    }

    /* renamed from: b */
    private static ViewTreeObserver m8574b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
