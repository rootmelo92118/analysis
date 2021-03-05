package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0815b;
import com.google.android.gms.common.internal.C0914j;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C0835r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f914a;

    /* renamed from: b */
    private final /* synthetic */ C0815b.C0818c f915b;

    C0835r(C0815b.C0818c cVar, ConnectionResult connectionResult) {
        this.f915b = cVar;
        this.f914a = connectionResult;
    }

    public final void run() {
        if (this.f914a.mo9509b()) {
            boolean unused = this.f915b.f889f = true;
            if (this.f915b.f885b.requiresSignIn()) {
                this.f915b.m1048a();
                return;
            }
            try {
                this.f915b.f885b.getRemoteService((C0914j) null, Collections.emptySet());
            } catch (SecurityException unused2) {
                ((C0815b.C0816a) C0815b.this.f864m.get(this.f915b.f886c)).mo9590a(new ConnectionResult(10));
            }
        } else {
            ((C0815b.C0816a) C0815b.this.f864m.get(this.f915b.f886c)).mo9590a(this.f914a);
        }
    }
}
