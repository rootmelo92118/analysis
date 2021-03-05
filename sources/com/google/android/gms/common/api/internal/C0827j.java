package com.google.android.gms.common.api.internal;

import android.support.p034v4.util.ArraySet;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.j */
public class C0827j extends C0809ag {

    /* renamed from: e */
    private final ArraySet<C0807ae<?>> f904e;

    /* renamed from: f */
    private C0815b f905f;

    /* renamed from: b */
    public void mo9604b() {
        super.mo9604b();
        m1070i();
    }

    /* renamed from: c */
    public void mo9606c() {
        super.mo9606c();
        m1070i();
    }

    /* renamed from: d */
    public void mo9607d() {
        super.mo9607d();
        this.f905f.mo9650b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9636a(ConnectionResult connectionResult, int i) {
        this.f905f.mo9649b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo9638f() {
        this.f905f.mo9646a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final ArraySet<C0807ae<?>> mo9687g() {
        return this.f904e;
    }

    /* renamed from: i */
    private final void m1070i() {
        if (!this.f904e.isEmpty()) {
            this.f905f.mo9647a(this);
        }
    }
}
