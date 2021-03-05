package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C1598qn
abstract class acb {

    /* renamed from: a */
    private final WeakReference<View> f1334a;

    public acb(View view) {
        this.f1334a = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10099a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo10100b(ViewTreeObserver viewTreeObserver);

    /* renamed from: a */
    public final void mo10106a() {
        ViewTreeObserver c = m1697c();
        if (c != null) {
            mo10099a(c);
        }
    }

    /* renamed from: b */
    public final void mo10107b() {
        ViewTreeObserver c = m1697c();
        if (c != null) {
            mo10100b(c);
        }
    }

    /* renamed from: c */
    private final ViewTreeObserver m1697c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f1334a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
