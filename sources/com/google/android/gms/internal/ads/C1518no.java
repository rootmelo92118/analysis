package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.no */
public final class C1518no extends C0723c<C1522ns> {
    public C1518no() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C1519np mo12839a(Activity activity) {
        try {
            IBinder a = ((C1522ns) mo8406a(activity)).mo12840a(C0722b.m769a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof C1519np) {
                return (C1519np) queryLocalInterface;
            }
            return new C1521nr(a);
        } catch (RemoteException e) {
            aai.m1627c("Could not create remote AdOverlay.", e);
            return null;
        } catch (C0723c.C0724a e2) {
            aai.m1627c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof C1522ns) {
            return (C1522ns) queryLocalInterface;
        }
        return new C1523nt(iBinder);
    }
}
