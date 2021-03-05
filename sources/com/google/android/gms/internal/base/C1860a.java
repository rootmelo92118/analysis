package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.base.a */
public class C1860a implements IInterface {

    /* renamed from: a */
    private final IBinder f7312a;

    /* renamed from: b */
    private final String f7313b;

    protected C1860a(IBinder iBinder, String str) {
        this.f7312a = iBinder;
        this.f7313b = str;
    }

    public IBinder asBinder() {
        return this.f7312a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13476a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7313b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13477a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7312a.transact(i, parcel, parcel, 0);
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
    public final void mo13479b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7312a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
