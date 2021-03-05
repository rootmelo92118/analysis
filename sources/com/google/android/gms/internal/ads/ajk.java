package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajk implements aiv<aio> {
    ajk() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aio mo10591a(apc apc) {
        try {
            akp a = akp.m2567a(apc);
            if (a instanceof akp) {
                akp akp = a;
                aol.m2928a(akp.mo10630a(), 0);
                aol.m2927a(akp.mo10632c().mo10792a());
                if (akp.mo10631b().mo10638a() != 12) {
                    if (akp.mo10631b().mo10638a() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new anb(akp.mo10632c().mo10798b(), akp.mo10631b().mo10638a());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) akr.m2583a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof akr) {
            akr akr = (akr) arw;
            aol.m2927a(akr.mo10637b());
            if (akr.mo10636a().mo10638a() == 12 || akr.mo10636a().mo10638a() == 16) {
                return (aqn) akp.m2574d().mo10635a(apc.m2986a(aof.m2913a(akr.mo10637b()))).mo10634a(akr.mo10636a()).mo10633a(0).mo11030f();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.AesEaxKey").mo10685a(((akp) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof akp) {
            akp akp = (akp) arw;
            aol.m2928a(akp.mo10630a(), 0);
            aol.m2927a(akp.mo10632c().mo10792a());
            if (akp.mo10631b().mo10638a() == 12 || akp.mo10631b().mo10638a() == 16) {
                return new anb(akp.mo10632c().mo10798b(), akp.mo10631b().mo10638a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }
}
