package com.google.android.gms.internal.p043a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.a.a */
public class C1008a implements IInterface {

    /* renamed from: a */
    private final IBinder f1259a;

    /* renamed from: b */
    private final String f1260b;

    protected C1008a(IBinder iBinder, String str) {
        this.f1259a = iBinder;
        this.f1260b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10016a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f1259a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1259a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b_ */
    public final Parcel mo10018b_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1260b);
        return obtain;
    }
}
