package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class azc implements IInterface {

    /* renamed from: a */
    private final IBinder f3156a;

    /* renamed from: b */
    private final String f3157b;

    protected azc(IBinder iBinder, String str) {
        this.f3156a = iBinder;
        this.f3157b = str;
    }

    public IBinder asBinder() {
        return this.f3156a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo11432z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3157b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo11428a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3156a.transact(i, parcel, parcel, 0);
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
    public final void mo11430b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3156a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11431c(int i, Parcel parcel) {
        try {
            this.f3156a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
