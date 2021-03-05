package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bx */
final class C1202bx implements C1130be {

    /* renamed from: a */
    private final /* synthetic */ View f5302a;

    /* renamed from: b */
    private final /* synthetic */ C1200bv f5303b;

    C1202bx(C1200bv bvVar, View view) {
        this.f5303b = bvVar;
        this.f5302a = view;
    }

    /* renamed from: a */
    public final void mo11425a() {
        if (this.f5303b.m6581a(C1200bv.f5289a)) {
            this.f5303b.onClick(this.f5302a);
        }
    }

    /* renamed from: a */
    public final void mo11426a(MotionEvent motionEvent) {
        this.f5303b.onTouch((View) null, motionEvent);
    }
}
