package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2109hy;

/* renamed from: com.google.android.gms.internal.measurement.hy */
public abstract class C2109hy<M extends C2109hy<M>> extends C2116ie {

    /* renamed from: L */
    protected C2112ia f7939L;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13500b() {
        if (this.f7939L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f7939L.mo14091a(); i2++) {
            i += this.f7939L.mo14094b(i2).mo14099a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo13499a(C2107hw hwVar) {
        if (this.f7939L != null) {
            for (int i = 0; i < this.f7939L.mo14091a(); i++) {
                this.f7939L.mo14094b(i).mo14100a(hwVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14082a(C2106hv hvVar, int i) {
        int i2 = hvVar.mo14067i();
        if (!hvVar.mo14057b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        C2118ig igVar = new C2118ig(i, hvVar.mo14054a(i2, hvVar.mo14067i() - i2));
        C2113ib ibVar = null;
        if (this.f7939L == null) {
            this.f7939L = new C2112ia();
        } else {
            ibVar = this.f7939L.mo14092a(i3);
        }
        if (ibVar == null) {
            ibVar = new C2113ib();
            this.f7939L.mo14093a(i3, ibVar);
        }
        ibVar.mo14101a(igVar);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ C2116ie mo14083c() {
        return (C2109hy) clone();
    }

    public /* synthetic */ Object clone() {
        C2109hy hyVar = (C2109hy) super.clone();
        C2114ic.m10269a(this, hyVar);
        return hyVar;
    }
}
