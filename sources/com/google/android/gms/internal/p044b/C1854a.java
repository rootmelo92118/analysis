package com.google.android.gms.internal.p044b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.b.a */
public class C1854a implements IInterface {

    /* renamed from: a */
    private final IBinder f7307a;

    /* renamed from: b */
    private final String f7308b;

    protected C1854a(IBinder iBinder, String str) {
        this.f7307a = iBinder;
        this.f7308b = str;
    }

    public IBinder asBinder() {
        return this.f7307a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo13473c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7308b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13470a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7307a.transact(i, parcel, parcel, 0);
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
    public final void mo13472b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7307a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
