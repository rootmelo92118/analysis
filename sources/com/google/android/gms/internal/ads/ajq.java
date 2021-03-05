package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class ajq implements aiv<ait> {
    ajq() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final ait mo10591a(apc apc) {
        try {
            alk a = alk.m2642a(apc);
            if (a instanceof alk) {
                alk alk = a;
                aol.m2928a(alk.mo10654a(), 0);
                ajx.m2500a(alk.mo10655b().mo10661b());
                ali b = alk.mo10655b().mo10661b();
                alo a2 = b.mo10651a();
                anp a3 = ajx.m2497a(a2.mo10668a());
                byte[] b2 = alk.mo10656c().mo10798b();
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, b2), ann.m2886a(a3));
                return new ani((ECPrivateKey) ans.f2115e.mo10740a("EC").generatePrivate(eCPrivateKeySpec), a2.mo10670c().mo10798b(), ajx.m2499a(a2.mo10669b()), ajx.m2498a(b.mo10653c()), new ajz(b.mo10652b().mo10649a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) alg.m2632a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof alg) {
            alg alg = (alg) arw;
            ajx.m2500a(alg.mo10650a());
            KeyPair a = ann.m2884a(ann.m2886a(ajx.m2497a(alg.mo10650a().mo10651a().mo10668a())));
            ECPoint w = ((ECPublicKey) a.getPublic()).getW();
            return (aqn) alk.m2649d().mo10657a(0).mo10658a((alm) ((aqn) alm.m2667e().mo10664a(0).mo10665a(alg.mo10650a()).mo10666a(apc.m2986a(w.getAffineX().toByteArray())).mo10667b(apc.m2986a(w.getAffineY().toByteArray())).mo11030f())).mo10659a(apc.m2986a(((ECPrivateKey) a.getPrivate()).getS().toByteArray())).mo11030f();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo10685a(((alk) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.ASYMMETRIC_PRIVATE).mo11030f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof alk) {
            alk alk = (alk) arw;
            aol.m2928a(alk.mo10654a(), 0);
            ajx.m2500a(alk.mo10655b().mo10661b());
            ali b = alk.mo10655b().mo10661b();
            alo a = b.mo10651a();
            anp a2 = ajx.m2497a(a.mo10668a());
            byte[] b2 = alk.mo10656c().mo10798b();
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, b2), ann.m2886a(a2));
            return new ani((ECPrivateKey) ans.f2115e.mo10740a("EC").generatePrivate(eCPrivateKeySpec), a.mo10670c().mo10798b(), ajx.m2499a(a.mo10669b()), ajx.m2498a(b.mo10653c()), new ajz(b.mo10652b().mo10649a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }
}
