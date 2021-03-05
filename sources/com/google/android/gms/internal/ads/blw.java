package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class blw implements bnb {

    /* renamed from: a */
    private final WeakReference<View> f4728a;

    /* renamed from: b */
    private final WeakReference<C1752wf> f4729b;

    public blw(View view, C1752wf wfVar) {
        this.f4728a = new WeakReference<>(view);
        this.f4729b = new WeakReference<>(wfVar);
    }

    /* renamed from: a */
    public final View mo12169a() {
        return (View) this.f4728a.get();
    }

    /* renamed from: b */
    public final boolean mo12170b() {
        return this.f4728a.get() == null || this.f4729b.get() == null;
    }

    /* renamed from: c */
    public final bnb mo12171c() {
        return new blv((View) this.f4728a.get(), (C1752wf) this.f4729b.get());
    }
}
