package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mo */
final class C1491mo implements ahu<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C1474ly f5717a;

    /* renamed from: b */
    private final /* synthetic */ C1443ku f5718b;

    C1491mo(C1490mn mnVar, C1474ly lyVar, C1443ku kuVar) {
        this.f5717a = lyVar;
        this.f5718b = kuVar;
    }

    /* renamed from: a */
    public final void mo10568a(String str) {
        try {
            this.f5717a.mo12777a(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
