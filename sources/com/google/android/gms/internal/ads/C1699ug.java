package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ug */
public final class C1699ug extends C0723c<C1691tz> {
    public C1699ug() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final C1688tw mo13007a(Context context, C1437ko koVar) {
        try {
            IBinder a = ((C1691tz) mo8406a(context)).mo13002a(C0722b.m769a(context), koVar, 14300000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof C1688tw) {
                return (C1688tw) queryLocalInterface;
            }
            return new C1690ty(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1627c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof C1691tz) {
            return (C1691tz) queryLocalInterface;
        }
        return new C1694ub(iBinder);
    }
}
