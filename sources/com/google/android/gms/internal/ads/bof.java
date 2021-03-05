package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0892c;

final class bof implements C0892c.C0893a {

    /* renamed from: a */
    private final /* synthetic */ boc f4902a;

    bof(boc boc) {
        this.f4902a = boc;
    }

    /* renamed from: a */
    public final void mo9869a(@Nullable Bundle bundle) {
        synchronized (this.f4902a.f4896b) {
            try {
                if (this.f4902a.f4897c != null) {
                    bom unused = this.f4902a.f4899e = this.f4902a.f4897c.mo12275a();
                }
            } catch (DeadObjectException e) {
                C1772wz.m1625b("Unable to obtain a cache service instance.", e);
                this.f4902a.m6092c();
            }
            this.f4902a.f4896b.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo9868a(int i) {
        synchronized (this.f4902a.f4896b) {
            bom unused = this.f4902a.f4899e = null;
            this.f4902a.f4896b.notifyAll();
        }
    }
}
