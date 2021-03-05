package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C0821e;

/* renamed from: com.google.android.gms.common.internal.x */
final class C0937x extends C0909f {

    /* renamed from: a */
    private final /* synthetic */ Intent f1125a;

    /* renamed from: b */
    private final /* synthetic */ C0821e f1126b;

    /* renamed from: c */
    private final /* synthetic */ int f1127c;

    C0937x(Intent intent, C0821e eVar, int i) {
        this.f1125a = intent;
        this.f1126b = eVar;
        this.f1127c = i;
    }

    /* renamed from: a */
    public final void mo9895a() {
        if (this.f1125a != null) {
            this.f1126b.startActivityForResult(this.f1125a, this.f1127c);
        }
    }
}
