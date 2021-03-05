package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzbji extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbji> CREATOR = new ail();

    /* renamed from: a */
    private final int f7201a;

    /* renamed from: b */
    private akd f7202b = null;

    /* renamed from: c */
    private byte[] f7203c;

    zzbji(int i, byte[] bArr) {
        this.f7201a = i;
        this.f7203c = bArr;
        m8793b();
    }

    /* renamed from: a */
    public final akd mo13402a() {
        if (!(this.f7202b != null)) {
            try {
                this.f7202b = (akd) aum.m4184a(new akd(), this.f7203c);
                this.f7203c = null;
            } catch (aul e) {
                throw new IllegalStateException(e);
            }
        }
        m8793b();
        return this.f7202b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f7201a);
        if (this.f7203c != null) {
            bArr = this.f7203c;
        } else {
            bArr = aum.m4186a((aum) this.f7202b);
        }
        C0932b.m1380a(parcel, 2, bArr, false);
        C0932b.m1365a(parcel, a);
    }

    /* renamed from: b */
    private final void m8793b() {
        if (this.f7202b == null && this.f7203c != null) {
            return;
        }
        if (this.f7202b != null && this.f7203c == null) {
            return;
        }
        if (this.f7202b != null && this.f7203c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f7202b == null && this.f7203c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
