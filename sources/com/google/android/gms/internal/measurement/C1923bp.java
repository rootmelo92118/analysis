package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.bp */
public class C1923bp implements IInterface {

    /* renamed from: a */
    private final IBinder f7521a;

    /* renamed from: b */
    private final String f7522b;

    protected C1923bp(IBinder iBinder, String str) {
        this.f7521a = iBinder;
        this.f7522b = str;
    }

    public IBinder asBinder() {
        return this.f7521a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo13540b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7522b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13538a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7521a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13541b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7521a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
