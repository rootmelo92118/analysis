package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class aji implements aiv<aio> {

    /* renamed from: a */
    private static final Logger f1863a = Logger.getLogger(aji.class.getName());

    aji() {
        aje.m2407a(new ajj());
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aio mo10591a(apc apc) {
        try {
            akf a = akf.m2519a(apc);
            if (a instanceof akf) {
                akf akf = a;
                aol.m2928a(akf.mo10612a(), 0);
                return new anr((aoc) aje.m2412b("type.googleapis.com/google.crypto.tink.AesCtrKey", akf.mo10614b()), (aiz) aje.m2412b("type.googleapis.com/google.crypto.tink.HmacKey", akf.mo10615c()), akf.mo10615c().mo10672b().mo10680b());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) akh.m2535a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof akh) {
            akh akh = (akh) arw;
            return (aqn) akf.m2526d().mo10617a((akj) aje.m2404a("type.googleapis.com/google.crypto.tink.AesCtrKey", (arw) akh.mo10619a())).mo10618a((alu) aje.m2404a("type.googleapis.com/google.crypto.tink.HmacKey", (arw) akh.mo10620b())).mo10616a(0).mo11030f();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").mo10685a(((akf) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof akf) {
            akf akf = (akf) arw;
            aol.m2928a(akf.mo10612a(), 0);
            return new anr((aoc) aje.m2412b("type.googleapis.com/google.crypto.tink.AesCtrKey", akf.mo10614b()), (aiz) aje.m2412b("type.googleapis.com/google.crypto.tink.HmacKey", akf.mo10615c()), akf.mo10615c().mo10672b().mo10680b());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }
}
