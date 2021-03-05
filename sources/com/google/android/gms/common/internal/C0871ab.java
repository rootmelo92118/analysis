package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.internal.ab */
public final class C0871ab implements Parcelable.Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    account = (Account) C0930a.m1333a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i2 = C0930a.m1341d(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C0930a.m1333a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }
}
