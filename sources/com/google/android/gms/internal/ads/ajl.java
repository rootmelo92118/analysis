package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajl implements aiv<aio> {
    ajl() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aio mo10591a(apc apc) {
        try {
            akv a = akv.m2592a(apc);
            if (a instanceof akv) {
                akv akv = a;
                aol.m2928a(akv.mo10639a(), 0);
                aol.m2927a(akv.mo10640b().mo10792a());
                return new anc(akv.mo10640b().mo10798b());
            }
            throw new GeneralSecurityException("expected AesGcmKey proto");
        } catch (aqv unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) akx.m2604a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof akx) {
            akx akx = (akx) arw;
            aol.m2927a(akx.mo10643a());
            return (aqn) akv.m2597c().mo10642a(apc.m2986a(aof.m2913a(akx.mo10643a()))).mo10641a(0).mo11030f();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.AesGcmKey").mo10685a(((akv) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof akv) {
            akv akv = (akv) arw;
            aol.m2928a(akv.mo10639a(), 0);
            aol.m2927a(akv.mo10640b().mo10792a());
            return new anc(akv.mo10640b().mo10798b());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }
}
