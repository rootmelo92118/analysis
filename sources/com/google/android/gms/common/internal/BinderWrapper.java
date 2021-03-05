package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C0874ae();

    /* renamed from: a */
    private IBinder f1012a;

    public BinderWrapper() {
        this.f1012a = null;
    }

    public final int describeContents() {
        return 0;
    }

    private BinderWrapper(Parcel parcel) {
        this.f1012a = null;
        this.f1012a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f1012a);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C0874ae aeVar) {
        this(parcel);
    }
}
