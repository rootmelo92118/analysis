package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.cd */
public final class C1209cd extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final C1204bz f5304a;

    /* renamed from: b */
    private final List<NativeAd.Image> f5305b = new ArrayList();

    /* renamed from: c */
    private String f5306c;

    public C1209cd(C1204bz bzVar) {
        C1210ce ceVar;
        IBinder iBinder;
        this.f5304a = bzVar;
        try {
            this.f5306c = this.f5304a.mo10776a();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            this.f5306c = "";
        }
        try {
            for (C1210ce next : bzVar.mo10777b()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    ceVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    ceVar = queryLocalInterface instanceof C1210ce ? (C1210ce) queryLocalInterface : new C1212cg(iBinder);
                }
                if (ceVar != null) {
                    this.f5305b.add(new C1213ch(ceVar));
                }
            }
        } catch (RemoteException e2) {
            aai.m1625b("", e2);
        }
    }

    public final CharSequence getText() {
        return this.f5306c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5305b;
    }
}
