package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ama;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class aka implements aiv<aiz> {
    aka() {
    }

    /* renamed from: a */
    public final String mo10593a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: b */
    public final int mo10594b() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final aiz mo10591a(apc apc) {
        aod aod;
        try {
            alu a = alu.m2689a(apc);
            if (a instanceof alu) {
                alu alu = a;
                aol.m2928a(alu.mo10671a(), 0);
                if (alu.mo10673c().mo10792a() >= 16) {
                    m2504a(alu.mo10672b());
                    als a2 = alu.mo10672b().mo10679a();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(alu.mo10673c().mo10798b(), "HMAC");
                    int b = alu.mo10672b().mo10680b();
                    switch (akb.f1880a[a2.ordinal()]) {
                        case 1:
                            aod = new aod("HMACSHA1", secretKeySpec, b);
                            break;
                        case 2:
                            aod = new aod("HMACSHA256", secretKeySpec, b);
                            break;
                        case 3:
                            aod = new aod("HMACSHA512", secretKeySpec, b);
                            break;
                        default:
                            throw new GeneralSecurityException("unknown hash");
                    }
                    return aod;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10595b(apc apc) {
        try {
            return mo10596b((arw) alw.m2706a(apc));
        } catch (aqv e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final arw mo10596b(arw arw) {
        if (arw instanceof alw) {
            alw alw = (alw) arw;
            if (alw.mo10678b() >= 16) {
                m2504a(alw.mo10677a());
                return (aqn) alu.m2696d().mo10674a(0).mo10675a(alw.mo10677a()).mo10676a(apc.m2986a(aof.m2913a(alw.mo10678b()))).mo11030f();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    /* renamed from: c */
    public final ama mo10597c(apc apc) {
        return (ama) ((aqn) ama.m2724d().mo10686a("type.googleapis.com/google.crypto.tink.HmacKey").mo10685a(((alu) mo10595b(apc)).mo10754h()).mo10684a(ama.C1051b.SYMMETRIC).mo11030f());
    }

    /* renamed from: a */
    private static void m2504a(aly aly) {
        if (aly.mo10680b() >= 10) {
            switch (akb.f1880a[aly.mo10679a().ordinal()]) {
                case 1:
                    if (aly.mo10680b() > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 2:
                    if (aly.mo10680b() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 3:
                    if (aly.mo10680b() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10592a(arw arw) {
        if (arw instanceof alu) {
            alu alu = (alu) arw;
            aol.m2928a(alu.mo10671a(), 0);
            if (alu.mo10673c().mo10792a() >= 16) {
                m2504a(alu.mo10672b());
                als a = alu.mo10672b().mo10679a();
                SecretKeySpec secretKeySpec = new SecretKeySpec(alu.mo10673c().mo10798b(), "HMAC");
                int b = alu.mo10672b().mo10680b();
                switch (akb.f1880a[a.ordinal()]) {
                    case 1:
                        return new aod("HMACSHA1", secretKeySpec, b);
                    case 2:
                        return new aod("HMACSHA256", secretKeySpec, b);
                    case 3:
                        return new aod("HMACSHA512", secretKeySpec, b);
                    default:
                        throw new GeneralSecurityException("unknown hash");
                }
            } else {
                throw new GeneralSecurityException("key too short");
            }
        } else {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
    }
}
