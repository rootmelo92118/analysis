package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class aof {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f2128a = new aog();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m2914b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: a */
    public static byte[] m2913a(int i) {
        byte[] bArr = new byte[i];
        f2128a.get().nextBytes(bArr);
        return bArr;
    }
}
