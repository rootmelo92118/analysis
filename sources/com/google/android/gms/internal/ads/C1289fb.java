package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;

/* renamed from: com.google.android.gms.internal.ads.fb */
final class C1289fb implements C0892c.C0894b {

    /* renamed from: a */
    private final /* synthetic */ abq f5359a;

    C1289fb(C1283ew ewVar, abq abq) {
        this.f5359a = abq;
    }

    /* renamed from: a */
    public final void mo9870a(@NonNull ConnectionResult connectionResult) {
        this.f5359a.mo10086a(new RuntimeException("Connection failed."));
    }
}
