package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.mm */
public class C1489mm {
    /* renamed from: a */
    public static C1484mh m7624a(String str) {
        try {
            return new C1490mn((ahy) Class.forName(str, false, C1489mm.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
