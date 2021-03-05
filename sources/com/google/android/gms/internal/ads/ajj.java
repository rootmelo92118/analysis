package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajj implements aiv<aoc> {
    ajj() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final ana mo10591a(apc apc) {
        try {
            akj a = akj.m2540a(apc);
            if (a instanceof akj) {
                akj akj = a;
                aol.m2928a(akj.mo10621a(), 0);
                aol.m2927a(akj.mo10623c().mo10792a());
                m2425a(akj.mo10622b());
                return new ana(akj.mo10623c().mo10798b(), akj.mo10622b().mo10629a());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) akl.m2557a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof akl) {
            akl akl = (akl) arw;
            aol.m2927a(akl.mo10628b());
            m2425a(akl.mo10627a());
            return (aqn) akj.m2547d().mo10625a(akl.mo10627a()).mo10626a(apc.m2986a(aof.m2913a(akl.mo10628b()))).mo10624a(0).mo11030f();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.AesCtrKey").mo10685a(((akj) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: a */
    private static void m2425a(akn akn) {
        if (akn.mo10629a() < 12 || akn.mo10629a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof akj) {
            akj akj = (akj) arw;
            aol.m2928a(akj.mo10621a(), 0);
            aol.m2927a(akj.mo10623c().mo10792a());
            m2425a(akj.mo10622b());
            return new ana(akj.mo10623c().mo10798b(), akj.mo10622b().mo10629a());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }
}
