package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import android.view.View;
import java.lang.ref.WeakReference;

public final class bls implements bnb {

    /* renamed from: a */
    private WeakReference<C1133bg> f4723a;

    public bls(C1133bg bgVar) {
        this.f4723a = new WeakReference<>(bgVar);
    }

    @Nullable
    /* renamed from: a */
    public final View mo12169a() {
        C1133bg bgVar = (C1133bg) this.f4723a.get();
        if (bgVar != null) {
            return bgVar.mo11886o();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo12170b() {
        return this.f4723a.get() == null;
    }

    /* renamed from: c */
    public final bnb mo12171c() {
        return new blu((C1133bg) this.f4723a.get());
    }
}
