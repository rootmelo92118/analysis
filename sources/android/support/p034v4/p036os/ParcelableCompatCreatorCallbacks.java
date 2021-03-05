package android.support.p034v4.p036os;

import android.os.Parcel;

@Deprecated
/* renamed from: android.support.v4.os.ParcelableCompatCreatorCallbacks */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
