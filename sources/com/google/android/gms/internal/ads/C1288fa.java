package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0892c;

/* renamed from: com.google.android.gms.internal.ads.fa */
final class C1288fa implements C0892c.C0893a {

    /* renamed from: a */
    private final /* synthetic */ abq f5357a;

    /* renamed from: b */
    private final /* synthetic */ C1283ew f5358b;

    C1288fa(C1283ew ewVar, abq abq) {
        this.f5358b = ewVar;
        this.f5357a = abq;
    }

    /* renamed from: a */
    public final void mo9869a(@Nullable Bundle bundle) {
        try {
            this.f5357a.mo10087b(this.f5358b.f5352a.mo12520a());
        } catch (DeadObjectException e) {
            this.f5357a.mo10086a(e);
        }
    }

    /* renamed from: a */
    public final void mo9868a(int i) {
        abq abq = this.f5357a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        abq.mo10086a(new RuntimeException(sb.toString()));
    }
}
