package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.sr */
final class C1656sr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzasi f6419a;

    /* renamed from: b */
    private final /* synthetic */ C1632ru f6420b;

    /* renamed from: c */
    private final /* synthetic */ C1654sp f6421c;

    C1656sr(C1654sp spVar, zzasi zzasi, C1632ru ruVar) {
        this.f6421c = spVar;
        this.f6419a = zzasi;
        this.f6420b = ruVar;
    }

    public final void run() {
        zzasm zzasm;
        try {
            zzasm = this.f6421c.mo12927a(this.f6419a);
        } catch (Exception e) {
            zzbv.zzlj().mo13119a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            C1772wz.m1627c("Could not fetch ad response due to an Exception.", e);
            zzasm = null;
        }
        if (zzasm == null) {
            zzasm = new zzasm(0);
        }
        try {
            this.f6420b.mo12922a(zzasm);
        } catch (RemoteException e2) {
            C1772wz.m1627c("Fail to forward ad response.", e2);
        }
    }
}
