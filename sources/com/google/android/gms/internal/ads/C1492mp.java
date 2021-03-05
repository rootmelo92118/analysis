package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mp */
final class C1492mp implements ahu<ahv, Object> {

    /* renamed from: a */
    private final /* synthetic */ C1478mb f5719a;

    /* renamed from: b */
    private final /* synthetic */ C1443ku f5720b;

    /* renamed from: c */
    private final /* synthetic */ C1490mn f5721c;

    C1492mp(C1490mn mnVar, C1478mb mbVar, C1443ku kuVar) {
        this.f5721c = mnVar;
        this.f5719a = mbVar;
        this.f5720b = kuVar;
    }

    /* renamed from: a */
    public final void mo10568a(String str) {
        try {
            this.f5719a.mo12783a(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
