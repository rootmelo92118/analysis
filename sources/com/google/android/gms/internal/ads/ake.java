package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amy;
import java.security.GeneralSecurityException;

public final class ake {
    @Deprecated

    /* renamed from: a */
    public static final amy f1952a = ((amy) ((aqn) amy.m2847b().mo10726a("TINK_MAC_1_0_0").mo10725a(aiq.m2374a("TinkMac", "Mac", "HmacKey", 0, true)).mo11030f()));

    /* renamed from: b */
    public static final amy f1953b = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(f1952a)).mo10726a("TINK_MAC").mo11030f()));
    @Deprecated

    /* renamed from: c */
    private static final amy f1954c = ((amy) ((aqn) ((amy.C1064a) amy.m2847b().mo10758a(f1952a)).mo10726a("TINK_MAC_1_1_0").mo11030f()));

    /* renamed from: a */
    public static void m2518a() {
        aje.m2409a("TinkMac", new akc());
        aiq.m2375a(f1953b);
    }

    static {
        try {
            m2518a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
