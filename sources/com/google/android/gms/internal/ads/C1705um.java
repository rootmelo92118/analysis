package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;

/* renamed from: com.google.android.gms.internal.ads.um */
final class C1705um implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1440kr f6594a;

    /* renamed from: b */
    private final /* synthetic */ zzwb f6595b;

    /* renamed from: c */
    private final /* synthetic */ C1711us f6596c;

    /* renamed from: d */
    private final /* synthetic */ C1703uk f6597d;

    C1705um(C1703uk ukVar, C1440kr krVar, zzwb zzwb, C1711us usVar) {
        this.f6597d = ukVar;
        this.f6594a = krVar;
        this.f6595b = zzwb;
        this.f6596c = usVar;
    }

    public final void run() {
        try {
            this.f6594a.mo12685a(C0722b.m769a(this.f6597d.f6579c), this.f6595b, (String) null, (C1718uz) this.f6596c, this.f6597d.f6583g);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(this.f6597d.f6577a);
            C1772wz.m1627c(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e);
            this.f6597d.mo13017a(this.f6597d.f6577a, 0);
        }
    }
}
