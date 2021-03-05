package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class ajx {
    /* renamed from: a */
    public static void m2500a(ali ali) {
        ann.m2886a(m2497a(ali.mo10651a().mo10668a()));
        m2499a(ali.mo10651a().mo10669b());
        if (ali.mo10653c() != alb.UNKNOWN_FORMAT) {
            aje.m2403a(ali.mo10652b().mo10649a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static String m2499a(als als) {
        switch (ajy.f1872a[als.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(als);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static anp m2497a(alq alq) {
        switch (ajy.f1873b[alq.ordinal()]) {
            case 1:
                return anp.NIST_P256;
            case 2:
                return anp.NIST_P384;
            case 3:
                return anp.NIST_P521;
            default:
                String valueOf = String.valueOf(alq);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static anq m2498a(alb alb) {
        switch (ajy.f1874c[alb.ordinal()]) {
            case 1:
                return anq.UNCOMPRESSED;
            case 2:
                return anq.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            case 3:
                return anq.COMPRESSED;
            default:
                String valueOf = String.valueOf(alb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }
}
