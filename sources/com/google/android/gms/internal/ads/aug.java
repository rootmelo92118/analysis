package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aug;

public abstract class aug<M extends aug<M>> extends aum {

    /* renamed from: Z */
    protected aui f2569Z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10482a() {
        if (this.f2569Z == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f2569Z.mo11286a(); i2++) {
            i += this.f2569Z.mo11289b(i2).mo11293a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo10484a(aue aue) {
        if (this.f2569Z != null) {
            for (int i = 0; i < this.f2569Z.mo11286a(); i++) {
                this.f2569Z.mo11289b(i).mo11294a(aue);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11281a(aud aud, int i) {
        int j = aud.mo11268j();
        if (!aud.mo11257b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        aup aup = new aup(i, aud.mo11254a(j, aud.mo11268j() - j));
        auj auj = null;
        if (this.f2569Z == null) {
            this.f2569Z = new aui();
        } else {
            auj = this.f2569Z.mo11287a(i2);
        }
        if (auj == null) {
            auj = new auj();
            this.f2569Z.mo11288a(i2, auj);
        }
        auj.mo11295a(aup);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ aum mo11282c() {
        return (aug) clone();
    }

    public /* synthetic */ Object clone() {
        aug aug = (aug) super.clone();
        auk.m4180a(this, aug);
        return aug;
    }
}
