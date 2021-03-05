package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;

final class bog implements C0892c.C0894b {

    /* renamed from: a */
    private final /* synthetic */ boc f4903a;

    bog(boc boc) {
        this.f4903a = boc;
    }

    /* renamed from: a */
    public final void mo9870a(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f4903a.f4896b) {
            bom unused = this.f4903a.f4899e = null;
            if (this.f4903a.f4897c != null) {
                boi unused2 = this.f4903a.f4897c = null;
            }
            this.f4903a.f4896b.notifyAll();
        }
    }
}
