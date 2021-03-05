package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0772a.C0776d;
import com.google.android.gms.common.internal.C0924o;

/* renamed from: com.google.android.gms.common.api.internal.ae */
public final class C0807ae<O extends C0772a.C0776d> {

    /* renamed from: a */
    private final boolean f833a;

    /* renamed from: b */
    private final int f834b;

    /* renamed from: c */
    private final C0772a<O> f835c;

    /* renamed from: d */
    private final O f836d;

    /* renamed from: a */
    public final String mo9631a() {
        return this.f835c.mo9561b();
    }

    public final int hashCode() {
        return this.f834b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0807ae)) {
            return false;
        }
        C0807ae aeVar = (C0807ae) obj;
        return !this.f833a && !aeVar.f833a && C0924o.m1303a(this.f835c, aeVar.f835c) && C0924o.m1303a(this.f836d, aeVar.f836d);
    }
}
