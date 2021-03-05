package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C1861b;
import com.google.android.gms.internal.base.C1862c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C2314e extends C1861b implements C2313d {
    public C2314e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13480a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                mo14876a((ConnectionResult) C1862c.m8849a(parcel, ConnectionResult.CREATOR), (zaa) C1862c.m8849a(parcel, zaa.CREATOR));
                break;
            case 4:
                mo14877a((Status) C1862c.m8849a(parcel, Status.CREATOR));
                break;
            case 6:
                mo14879b((Status) C1862c.m8849a(parcel, Status.CREATOR));
                break;
            case 7:
                mo14878a((Status) C1862c.m8849a(parcel, Status.CREATOR), (GoogleSignInAccount) C1862c.m8849a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                mo9697a((zaj) C1862c.m8849a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
