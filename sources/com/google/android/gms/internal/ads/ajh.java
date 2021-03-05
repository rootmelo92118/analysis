package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amy;
import java.security.GeneralSecurityException;

public final class ajh {
    @Deprecated

    /* renamed from: a */
    public static final amy f1860a = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(ake.f1952a)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo10726a("TINK_AEAD_1_0_0").mo11030f()));

    /* renamed from: b */
    public static final amy f1861b = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(ake.f1953b)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo10725a(aiq.m2374a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo10726a("TINK_AEAD").mo11030f()));
    @Deprecated

    /* renamed from: c */
    private static final amy f1862c = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(f1860a)).mo10726a("TINK_AEAD_1_1_0").mo11030f()));

    /* renamed from: a */
    public static void m2416a() {
        ake.m2518a();
        aje.m2409a("TinkAead", new ajg());
        aiq.m2375a(f1861b);
    }

    static {
        try {
            m2416a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
