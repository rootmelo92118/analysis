package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: com.google.firebase.iid.aw */
public final class C2388aw implements C2387av {

    /* renamed from: a */
    private final IBinder f8877a;

    C2388aw(IBinder iBinder) {
        this.f8877a = iBinder;
    }

    /* renamed from: a */
    public final void mo15005a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f8877a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f8877a;
    }
}
