package com.google.android.gms.internal.p043a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.a.g */
public final class C1014g extends C1008a implements C1012e {
    C1014g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo10021a() {
        Parcel a = mo10016a(1, mo10018b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo10022a(boolean z) {
        Parcel b_ = mo10018b_();
        C1010c.m1575a(b_, true);
        Parcel a = mo10016a(2, b_);
        boolean a2 = C1010c.m1576a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo10023b() {
        Parcel a = mo10016a(6, mo10018b_());
        boolean a2 = C1010c.m1576a(a);
        a.recycle();
        return a2;
    }
}
