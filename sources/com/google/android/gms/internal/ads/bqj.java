package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
public final class bqj extends C0723c<bru> {
    public bqj() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final brr mo12304a(Context context, String str, C1437ko koVar) {
        try {
            IBinder a = ((bru) mo8406a(context)).mo12329a(C0722b.m769a(context), str, koVar, 14300000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof brr) {
                return (brr) queryLocalInterface;
            }
            return new brt(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1627c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof bru) {
            return (bru) queryLocalInterface;
        }
        return new brv(iBinder);
    }
}
