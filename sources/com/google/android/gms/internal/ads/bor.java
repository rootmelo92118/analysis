package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0892c;

final class bor implements C0892c.C0893a {

    /* renamed from: a */
    final /* synthetic */ bop f4914a;

    /* renamed from: b */
    private final /* synthetic */ zzty f4915b;

    /* renamed from: c */
    private final /* synthetic */ abq f4916c;

    bor(bop bop, zzty zzty, abq abq) {
        this.f4914a = bop;
        this.f4915b = zzty;
        this.f4916c = abq;
    }

    /* renamed from: a */
    public final void mo9868a(int i) {
    }

    /* renamed from: a */
    public final void mo9869a(@Nullable Bundle bundle) {
        synchronized (this.f4914a.f4912d) {
            if (!this.f4914a.f4910b) {
                boolean unused = this.f4914a.f4910b = true;
                boi d = this.f4914a.f4909a;
                if (d != null) {
                    this.f4916c.mo10059a(new bot(this.f4916c, C1780xg.m8353a((Runnable) new bos(this, d, this.f4915b, this.f4916c))), abl.f1314b);
                }
            }
        }
    }
}
