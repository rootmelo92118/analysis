package com.google.android.gms.common.api.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0772a.C0774b;
import com.google.android.gms.p040b.C0742h;

/* renamed from: com.google.android.gms.common.api.internal.g */
public abstract class C0824g<A extends C0772a.C0774b, L> {

    /* renamed from: a */
    private final C0822f<L> f899a;

    /* renamed from: b */
    private final Feature[] f900b;

    /* renamed from: c */
    private final boolean f901c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9680a(A a, C0742h<Void> hVar);

    /* renamed from: a */
    public void mo9679a() {
        this.f899a.mo9676a();
    }

    @Nullable
    /* renamed from: b */
    public Feature[] mo9681b() {
        return this.f900b;
    }

    /* renamed from: c */
    public final boolean mo9682c() {
        return this.f901c;
    }
}
