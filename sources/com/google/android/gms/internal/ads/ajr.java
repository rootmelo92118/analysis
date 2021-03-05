package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ajr implements aiv<aiu> {
    ajr() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aiu mo10591a(apc apc) {
        try {
            alm a = alm.m2658a(apc);
            if (a instanceof alm) {
                alm alm = a;
                aol.m2928a(alm.mo10660a(), 0);
                ajx.m2500a(alm.mo10661b());
                ali b = alm.mo10661b();
                alo a2 = b.mo10651a();
                return new anj(ann.m2885a(ajx.m2497a(a2.mo10668a()), alm.mo10662c().mo10798b(), alm.mo10663d().mo10798b()), a2.mo10670c().mo10798b(), ajx.m2499a(a2.mo10669b()), ajx.m2498a(b.mo10653c()), new ajz(b.mo10652b().mo10649a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof alm) {
            alm alm = (alm) arw;
            aol.m2928a(alm.mo10660a(), 0);
            ajx.m2500a(alm.mo10661b());
            ali b = alm.mo10661b();
            alo a = b.mo10651a();
            return new anj(ann.m2885a(ajx.m2497a(a.mo10668a()), alm.mo10662c().mo10798b(), alm.mo10663d().mo10798b()), a.mo10670c().mo10798b(), ajx.m2499a(a.mo10669b()), ajx.m2498a(b.mo10653c()), new ajz(b.mo10652b().mo10649a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }
}
