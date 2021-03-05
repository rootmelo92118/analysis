package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amy;
import java.security.GeneralSecurityException;

public final class ajs {
    @Deprecated

    /* renamed from: a */
    public static final amy f1867a = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(ajh.f1860a)).mo10725a(aiq.m2374a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo10725a(aiq.m2374a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo10726a("TINK_HYBRID_1_0_0").mo11030f()));
    @Deprecated

    /* renamed from: b */
    private static final amy f1868b = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(f1867a)).mo10726a("TINK_HYBRID_1_1_0").mo11030f()));

    /* renamed from: c */
    private static final amy f1869c = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(ajh.f1861b)).mo10725a(aiq.m2374a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo10725a(aiq.m2374a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo10726a("TINK_HYBRID").mo11030f()));

    static {
        try {
            ajh.m2416a();
            aje.m2409a("TinkHybridEncrypt", new aju());
            aje.m2409a("TinkHybridDecrypt", new ajt());
            aiq.m2375a(f1869c);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
