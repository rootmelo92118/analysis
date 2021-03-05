package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0815b;
import com.google.android.gms.common.api.internal.C0822f;
import com.google.android.gms.p040b.C0742h;

/* renamed from: com.google.android.gms.common.api.internal.ad */
public final class C0806ad extends C0805ac<Boolean> {

    /* renamed from: b */
    private final C0822f.C0823a<?> f832b;

    public C0806ad(C0822f.C0823a<?> aVar, C0742h<Boolean> hVar) {
        super(4, hVar);
        this.f832b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9626a(@NonNull C0826i iVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo9628d(C0815b.C0816a<?> aVar) {
        C0838u remove = aVar.mo9658c().remove(this.f832b);
        if (remove != null) {
            remove.f920b.mo9683a(aVar.mo9656b(), this.f831a);
            remove.f919a.mo9679a();
            return;
        }
        this.f831a.mo9489b(false);
    }

    @Nullable
    /* renamed from: b */
    public final Feature[] mo9629b(C0815b.C0816a<?> aVar) {
        C0838u uVar = aVar.mo9658c().get(this.f832b);
        if (uVar == null) {
            return null;
        }
        return uVar.f919a.mo9681b();
    }

    /* renamed from: c */
    public final boolean mo9630c(C0815b.C0816a<?> aVar) {
        C0838u uVar = aVar.mo9658c().get(this.f832b);
        return uVar != null && uVar.f919a.mo9682c();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9627a(@NonNull RuntimeException runtimeException) {
        super.mo9627a(runtimeException);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9624a(@NonNull Status status) {
        super.mo9624a(status);
    }
}
