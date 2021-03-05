package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;

final class bov implements C0892c.C0894b {

    /* renamed from: a */
    private final /* synthetic */ abq f4924a;

    /* renamed from: b */
    private final /* synthetic */ bop f4925b;

    bov(bop bop, abq abq) {
        this.f4925b = bop;
        this.f4924a = abq;
    }

    /* renamed from: a */
    public final void mo9870a(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f4925b.f4912d) {
            this.f4924a.mo10086a(new RuntimeException("Connection failed."));
        }
    }
}
