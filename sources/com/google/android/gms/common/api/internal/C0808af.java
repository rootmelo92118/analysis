package com.google.android.gms.common.api.internal;

import android.support.annotation.Nullable;
import android.support.p034v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0789c;
import com.google.android.gms.p040b.C0742h;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.af */
public final class C0808af {

    /* renamed from: a */
    private final ArrayMap<C0807ae<?>, ConnectionResult> f837a;

    /* renamed from: b */
    private final ArrayMap<C0807ae<?>, String> f838b;

    /* renamed from: c */
    private final C0742h<Map<C0807ae<?>, String>> f839c;

    /* renamed from: d */
    private int f840d;

    /* renamed from: e */
    private boolean f841e;

    /* renamed from: a */
    public final Set<C0807ae<?>> mo9634a() {
        return this.f837a.keySet();
    }

    /* renamed from: a */
    public final void mo9635a(C0807ae<?> aeVar, ConnectionResult connectionResult, @Nullable String str) {
        this.f837a.put(aeVar, connectionResult);
        this.f838b.put(aeVar, str);
        this.f840d--;
        if (!connectionResult.mo9509b()) {
            this.f841e = true;
        }
        if (this.f840d != 0) {
            return;
        }
        if (this.f841e) {
            this.f839c.mo9486a((Exception) new C0789c(this.f837a));
            return;
        }
        this.f839c.mo9487a(this.f838b);
    }
}
