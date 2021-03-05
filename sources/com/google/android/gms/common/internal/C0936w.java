package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.p034v4.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.w */
final class C0936w extends C0909f {

    /* renamed from: a */
    private final /* synthetic */ Intent f1122a;

    /* renamed from: b */
    private final /* synthetic */ Fragment f1123b;

    /* renamed from: c */
    private final /* synthetic */ int f1124c;

    C0936w(Intent intent, Fragment fragment, int i) {
        this.f1122a = intent;
        this.f1123b = fragment;
        this.f1124c = i;
    }

    /* renamed from: a */
    public final void mo9895a() {
        if (this.f1122a != null) {
            this.f1123b.startActivityForResult(this.f1122a, this.f1124c);
        }
    }
}
