package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import android.support.annotation.MainThread;
import com.google.android.gms.common.C0849c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.ai */
final class C0811ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0809ag f848a;

    /* renamed from: b */
    private final C0810ah f849b;

    C0811ai(C0809ag agVar, C0810ah ahVar) {
        this.f848a = agVar;
        this.f849b = ahVar;
    }

    @MainThread
    public final void run() {
        if (this.f848a.f842b) {
            ConnectionResult b = this.f849b.mo9642b();
            if (b.mo9508a()) {
                this.f848a.f823a.startActivityForResult(GoogleApiActivity.m907a(this.f848a.mo9600a(), b.mo9511d(), this.f849b.mo9641a(), false), 1);
            } else if (this.f848a.f844d.mo9719a(b.mo9510c())) {
                this.f848a.f844d.mo9720a(this.f848a.mo9600a(), this.f848a.f823a, b.mo9510c(), 2, this.f848a);
            } else if (b.mo9510c() == 18) {
                this.f848a.f844d.mo9717a(this.f848a.mo9600a().getApplicationContext(), (C0836s) new C0812aj(this, C0849c.m1106a(this.f848a.mo9600a(), (DialogInterface.OnCancelListener) this.f848a)));
            } else {
                this.f848a.mo9636a(b, this.f849b.mo9641a());
            }
        }
    }
}
