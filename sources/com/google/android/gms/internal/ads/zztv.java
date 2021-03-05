package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class zztv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztv> CREATOR = new boh();
    @Nullable
    @GuardedBy("this")

    /* renamed from: a */
    private ParcelFileDescriptor f7260a;

    public zztv() {
        this((ParcelFileDescriptor) null);
    }

    public zztv(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.f7260a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final synchronized boolean mo13449a() {
        return this.f7260a != null;
    }

    @Nullable
    /* renamed from: b */
    public final synchronized InputStream mo13450b() {
        if (this.f7260a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f7260a);
        this.f7260a = null;
        return autoCloseInputStream;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m8822c() {
        return this.f7260a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1372a(parcel, 2, (Parcelable) m8822c(), i, false);
        C0932b.m1365a(parcel, a);
    }
}
