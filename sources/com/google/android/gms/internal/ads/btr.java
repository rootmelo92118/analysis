package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
public final class btr extends C0723c<bsr> {
    public btr() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: b */
    public final bso mo12455b(Context context) {
        try {
            IBinder a = ((bsr) mo8406a(context)).mo12334a(C0722b.m769a(context), 14300000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof bso) {
                return (bso) queryLocalInterface;
            }
            return new bsq(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1627c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof bsr) {
            return (bsr) queryLocalInterface;
        }
        return new bss(iBinder);
    }
}
