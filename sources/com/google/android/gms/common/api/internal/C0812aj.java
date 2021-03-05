package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.aj */
final class C0812aj extends C0836s {

    /* renamed from: a */
    private final /* synthetic */ Dialog f850a;

    /* renamed from: b */
    private final /* synthetic */ C0811ai f851b;

    C0812aj(C0811ai aiVar, Dialog dialog) {
        this.f851b = aiVar;
        this.f850a = dialog;
    }

    /* renamed from: a */
    public final void mo9644a() {
        this.f851b.f848a.mo9639h();
        if (this.f850a.isShowing()) {
            this.f850a.dismiss();
        }
    }
}
