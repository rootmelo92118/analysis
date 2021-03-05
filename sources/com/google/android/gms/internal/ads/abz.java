package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;

@C1598qn
final class abz extends acb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f1332a;

    public abz(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f1332a = new WeakReference<>(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f1332a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo10107b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10099a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10100b(ViewTreeObserver viewTreeObserver) {
        zzbv.zzlh().mo13230a(viewTreeObserver, (ViewTreeObserver.OnGlobalLayoutListener) this);
    }
}
