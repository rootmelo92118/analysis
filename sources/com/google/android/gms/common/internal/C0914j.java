package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1855b;
import com.google.android.gms.internal.p044b.C1856c;

/* renamed from: com.google.android.gms.common.internal.j */
public interface C0914j extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.j$a */
    public static abstract class C0915a extends C1855b implements C0914j {

        /* renamed from: com.google.android.gms.common.internal.j$a$a */
        public static class C0916a extends C1854a implements C0914j {
            C0916a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo9787a() {
                Parcel a = mo13470a(2, mo13473c());
                Account account = (Account) C1856c.m8839a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C0914j m1291a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C0914j) {
                return (C0914j) queryLocalInterface;
            }
            return new C0916a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo9822a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Account a = mo9787a();
            parcel2.writeNoException();
            C1856c.m8844b(parcel2, a);
            return true;
        }
    }

    /* renamed from: a */
    Account mo9787a();
}
