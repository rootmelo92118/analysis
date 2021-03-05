package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mq */
final class C1493mq implements ahu<ahw, Object> {

    /* renamed from: a */
    private final /* synthetic */ C1482mf f5722a;

    /* renamed from: b */
    private final /* synthetic */ C1443ku f5723b;

    /* renamed from: c */
    private final /* synthetic */ C1490mn f5724c;

    C1493mq(C1490mn mnVar, C1482mf mfVar, C1443ku kuVar) {
        this.f5724c = mnVar;
        this.f5722a = mfVar;
        this.f5723b = kuVar;
    }

    /* renamed from: a */
    public final void mo10568a(String str) {
        try {
            this.f5722a.mo12785a(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
