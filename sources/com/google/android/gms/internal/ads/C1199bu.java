package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bu */
final class C1199bu implements C1130be {

    /* renamed from: a */
    private final /* synthetic */ View f5283a;

    /* renamed from: b */
    private final /* synthetic */ C1198bt f5284b;

    C1199bu(C1198bt btVar, View view) {
        this.f5284b = btVar;
        this.f5283a = view;
    }

    /* renamed from: a */
    public final void mo11425a() {
        this.f5284b.onClick(this.f5283a);
    }

    /* renamed from: a */
    public final void mo11426a(MotionEvent motionEvent) {
        this.f5284b.onTouch((View) null, motionEvent);
    }
}
