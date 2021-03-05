package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1856c;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C1007l extends C1854a implements C1006k {
    C1007l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C0719a mo10014a(C0719a aVar, String str, int i, C0719a aVar2) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        C1856c.m8840a(c, (IInterface) aVar2);
        Parcel a = mo13470a(2, c);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C0719a mo10015b(C0719a aVar, String str, int i, C0719a aVar2) {
        Parcel c = mo13473c();
        C1856c.m8840a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        C1856c.m8840a(c, (IInterface) aVar2);
        Parcel a = mo13470a(3, c);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
