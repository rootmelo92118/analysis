package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amk;
import java.security.GeneralSecurityException;

public final class aja {
    @Deprecated
    /* renamed from: a */
    public static final aiw m2391a(byte[] bArr) {
        try {
            amk a = amk.m2769a(bArr);
            for (amk.C1055b next : a.mo10700b()) {
                if (next.mo10703b().mo10683c() == ama.C1051b.UNKNOWN_KEYMATERIAL || next.mo10703b().mo10683c() == ama.C1051b.SYMMETRIC || next.mo10703b().mo10683c() == ama.C1051b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return aiw.m2384a(a);
        } catch (aqv unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
