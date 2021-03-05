package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ami;
import java.security.GeneralSecurityException;

public final class aiq {
    /* renamed from: a */
    public static ami m2374a(String str, String str2, String str3, int i, boolean z) {
        ami.C1053a a = ami.m2756f().mo10695a(str2);
        String valueOf = String.valueOf(str3);
        return (ami) ((aqn) a.mo10697b(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink.")).mo10694a(0).mo10696a(true).mo10698c(str).mo11030f());
    }

    /* renamed from: a */
    public static void m2375a(amy amy) {
        for (ami next : amy.mo10724a()) {
            if (next.mo10690b().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (next.mo10689a().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!next.mo10693e().isEmpty()) {
                aje.m2408a(aje.m2401a(next.mo10693e()).mo10589a(next.mo10690b(), next.mo10689a(), next.mo10691c()), next.mo10692d());
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }
}
