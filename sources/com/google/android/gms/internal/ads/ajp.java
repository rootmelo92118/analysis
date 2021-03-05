package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;

final class ajp implements aiv<aio> {
    ajp() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aio mo10591a(apc apc) {
        try {
            ams a = ams.m2823a(apc);
            if (a instanceof ams) {
                ams ams = a;
                aol.m2928a(ams.mo10718a(), 0);
                String a2 = ams.mo10719b().mo10722a();
                return new ajo(ams.mo10719b().mo10723b(), aiy.m2388a(a2).mo10601b(a2));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) amu.m2835a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof amu) {
            return (aqn) ams.m2828c().mo10721a((amu) arw).mo10720a(0).mo11030f();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").mo10685a(((ams) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.REMOTE).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof ams) {
            ams ams = (ams) arw;
            aol.m2928a(ams.mo10718a(), 0);
            String a = ams.mo10719b().mo10722a();
            return new ajo(ams.mo10719b().mo10723b(), aiy.m2388a(a).mo10601b(a));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }
}
