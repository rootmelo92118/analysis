package com.google.firebase.iid;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.p047a.C2328a;
import com.google.firebase.p047a.C2329b;

/* renamed from: com.google.firebase.iid.aq */
final /* synthetic */ class C2382aq implements C2329b {

    /* renamed from: a */
    private final FirebaseInstanceId.C2362a f8868a;

    C2382aq(FirebaseInstanceId.C2362a aVar) {
        this.f8868a = aVar;
    }

    /* renamed from: a */
    public final void mo14905a(C2328a aVar) {
        FirebaseInstanceId.C2362a aVar2 = this.f8868a;
        synchronized (aVar2) {
            if (aVar2.mo14970a()) {
                FirebaseInstanceId.this.m11615l();
            }
        }
    }
}
