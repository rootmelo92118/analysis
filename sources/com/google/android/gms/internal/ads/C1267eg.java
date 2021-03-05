package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;
import java.util.HashMap;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.eg */
public final class C1267eg extends C0723c<C1222cq> {
    public C1267eg() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final C1219cn mo12518a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder a = ((C1222cq) mo8406a(view.getContext())).mo12497a(C0722b.m769a(view), C0722b.m769a(hashMap), C0722b.m769a(hashMap2));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof C1219cn) {
                return (C1219cn) queryLocalInterface;
            }
            return new C1221cp(a);
        } catch (RemoteException | C0723c.C0724a e) {
            aai.m1627c("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof C1222cq) {
            return (C1222cq) queryLocalInterface;
        }
        return new C1223cr(iBinder);
    }
}
