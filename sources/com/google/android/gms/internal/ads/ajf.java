package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.amm;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class ajf {

    /* renamed from: a */
    private static final Charset f1859a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static amm m2413a(amk amk) {
        amm.C1057a a = amm.m2782a().mo10707a(amk.mo10699a());
        for (amk.C1055b next : amk.mo10700b()) {
            a.mo10708a((amm.C1058b) ((aqn) amm.C1058b.m2791a().mo10712a(next.mo10703b().mo10681a()).mo10710a(next.mo10704c()).mo10711a(next.mo10706e()).mo10709a(next.mo10705d()).mo11030f()));
        }
        return (amm) ((aqn) a.mo11030f());
    }

    /* renamed from: b */
    public static void m2414b(amk amk) {
        if (amk.mo10701c() != 0) {
            int a = amk.mo10699a();
            boolean z = false;
            boolean z2 = true;
            for (amk.C1055b next : amk.mo10700b()) {
                if (!next.mo10702a()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo10705d())}));
                } else if (next.mo10706e() == amw.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo10705d())}));
                } else if (next.mo10704c() != amd.UNKNOWN_STATUS) {
                    if (next.mo10704c() == amd.ENABLED && next.mo10705d() == a) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.mo10703b().mo10683c() != ama.C1051b.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo10705d())}));
                }
            }
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
