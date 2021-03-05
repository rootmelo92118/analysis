package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.p045c.C1866a;

/* renamed from: com.google.firebase.iid.w */
final class C2413w extends C1866a {

    /* renamed from: a */
    private final /* synthetic */ C2412v f8924a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2413w(C2412v vVar, Looper looper) {
        super(looper);
        this.f8924a = vVar;
    }

    public final void handleMessage(Message message) {
        this.f8924a.m11753a(message);
    }
}
