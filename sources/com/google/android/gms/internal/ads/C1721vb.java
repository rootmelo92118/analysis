package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.vb */
public abstract class C1721vb extends azd implements C1718uz {
    public C1721vb() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C1718uz m8122a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof C1718uz) {
            return (C1718uz) queryLocalInterface;
        }
        return new C1722vc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo13029a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 2:
                mo13030a(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo13035b(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 4:
                mo13037c(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 5:
                mo13038d(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 6:
                mo13039e(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 7:
                mo13031a(C0719a.C0720a.m768a(parcel.readStrongBinder()), (zzawd) aze.m4501a(parcel, zzawd.CREATOR));
                break;
            case 8:
                mo13040f(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 9:
                mo13036b(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo13041g(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 11:
                mo13042h(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                break;
            case 12:
                mo13028a((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
