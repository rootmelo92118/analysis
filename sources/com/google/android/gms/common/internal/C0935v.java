package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.v */
final class C0935v extends C0909f {

    /* renamed from: a */
    private final /* synthetic */ Intent f1119a;

    /* renamed from: b */
    private final /* synthetic */ Activity f1120b;

    /* renamed from: c */
    private final /* synthetic */ int f1121c;

    C0935v(Intent intent, Activity activity, int i) {
        this.f1119a = intent;
        this.f1120b = activity;
        this.f1121c = i;
    }

    /* renamed from: a */
    public final void mo9895a() {
        if (this.f1119a != null) {
            this.f1120b.startActivityForResult(this.f1119a, this.f1121c);
        }
    }
}
