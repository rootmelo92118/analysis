package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
public final class bqk extends C0723c<brz> {
    public bqk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final brw mo12305a(Context context, zzwf zzwf, String str, C1437ko koVar, int i) {
        try {
            IBinder a = ((brz) mo8406a(context)).mo12330a(C0722b.m769a(context), zzwf, str, koVar, 14300000, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof brw) {
                return (brw) queryLocalInterface;
            }
            return new bry(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1622a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof brz) {
            return (brz) queryLocalInterface;
        }
        return new bsa(iBinder);
    }
}
