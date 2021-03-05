package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajm implements aiv<aio> {
    ajm() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aio mo10591a(apc apc) {
        try {
            akz a = akz.m2608a(apc);
            if (a instanceof akz) {
                akz akz = a;
                aol.m2928a(akz.mo10644a(), 0);
                if (akz.mo10645b().mo10792a() == 32) {
                    return new anf(akz.mo10645b().mo10798b());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        return m2450c();
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        return m2450c();
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").mo10685a(m2450c().mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: c */
    private static akz m2450c() {
        return (akz) ((aqn) akz.m2613c().mo10646a(0).mo10647a(apc.m2986a(aof.m2913a(32))).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof akz) {
            akz akz = (akz) arw;
            aol.m2928a(akz.mo10644a(), 0);
            if (akz.mo10645b().mo10792a() == 32) {
                return new anf(akz.mo10645b().mo10798b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }
}
