package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1856c;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C1005j extends C1854a implements C1004i {
    C1005j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final C0719a mo10011a(C0719a aVar, String str, int i) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo13470a(2, c);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final int mo10010a(C0719a aVar, String str, boolean z) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        C1856c.m8842a(c, z);
        Parcel a = mo13470a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C0719a mo10013b(C0719a aVar, String str, int i) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo13470a(4, c);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo10012b(C0719a aVar, String str, boolean z) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        C1856c.m8842a(c, z);
        Parcel a = mo13470a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo10009a() {
        Parcel a = mo13470a(6, mo13473c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
