package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ef */
public final class C1266ef extends C0723c<C1217cl> {
    public C1266ef() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final C1214ci mo12517a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((C1217cl) mo8406a(context)).mo12496a(C0722b.m769a(context), C0722b.m769a(frameLayout), C0722b.m769a(frameLayout2), 14300000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof C1214ci) {
                return (C1214ci) queryLocalInterface;
            }
            return new C1216ck(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1627c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof C1217cl) {
            return (C1217cl) queryLocalInterface;
        }
        return new C1218cm(iBinder);
    }
}
