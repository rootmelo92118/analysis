package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajn implements aiv<aio> {
    ajn() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* renamed from: d */
    private static aio m2460d(apc apc) {
        try {
            return m2459c((arw) amo.m2806a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    /* renamed from: c */
    private static aio m2459c(arw arw) {
        if (arw instanceof amo) {
            amo amo = (amo) arw;
            aol.m2928a(amo.mo10713a(), 0);
            String a = amo.mo10714b().mo10717a();
            return aiy.m2388a(a).mo10601b(a);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) amq.m2818a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof amq) {
            return (aqn) amo.m2811c().mo10716a((amq) arw).mo10715a(0).mo11030f();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.KmsAeadKey").mo10685a(((amo) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.REMOTE).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        return m2459c(arw);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10591a(apc apc) {
        return m2460d(apc);
    }
}
