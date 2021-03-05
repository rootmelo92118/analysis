package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.common.api.internal.ah */
final class C0810ah {

    /* renamed from: a */
    private final int f846a;

    /* renamed from: b */
    private final ConnectionResult f847b;

    C0810ah(ConnectionResult connectionResult, int i) {
        C0926p.m1306a(connectionResult);
        this.f847b = connectionResult;
        this.f846a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo9641a() {
        return this.f846a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo9642b() {
        return this.f847b;
    }
}
