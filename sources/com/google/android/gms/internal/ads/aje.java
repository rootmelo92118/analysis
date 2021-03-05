package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amk;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class aje {

    /* renamed from: a */
    private static final Logger f1855a = Logger.getLogger(aje.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, aiv> f1856b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f1857c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, aip> f1858d = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized <P> void m2409a(String str, aip<P> aip) {
        synchronized (aje.class) {
            if (!f1858d.containsKey(str.toLowerCase()) || aip.getClass().equals(((aip) f1858d.get(str.toLowerCase())).getClass())) {
                f1858d.put(str.toLowerCase(), aip);
            } else {
                Logger logger = f1855a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static <P> aip<P> m2401a(String str) {
        if (str != null) {
            aip<P> aip = (aip) f1858d.get(str.toLowerCase());
            if (aip != null) {
                return aip;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    public static synchronized <P> void m2407a(aiv<P> aiv) {
        synchronized (aje.class) {
            m2408a(aiv, true);
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m2408a(aiv<P> aiv, boolean z) {
        synchronized (aje.class) {
            if (aiv != null) {
                String a = aiv.mo10593a();
                if (f1856b.containsKey(a)) {
                    aiv b = m2410b(a);
                    boolean booleanValue = ((Boolean) f1857c.get(a)).booleanValue();
                    if (!aiv.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                        Logger logger = f1855a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a, b.getClass().getName(), aiv.getClass().getName()}));
                    }
                }
                f1856b.put(a, aiv);
                f1857c.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: b */
    private static <P> aiv<P> m2410b(String str) {
        aiv<P> aiv = (aiv) f1856b.get(str);
        if (aiv != null) {
            return aiv;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static synchronized <P> ama m2403a(amg amg) {
        ama c;
        synchronized (aje.class) {
            aiv b = m2410b(amg.mo10687a());
            if (((Boolean) f1857c.get(amg.mo10687a())).booleanValue()) {
                c = b.mo10597c(amg.mo10688b());
            } else {
                String valueOf = String.valueOf(amg.mo10687a());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c;
    }

    /* renamed from: b */
    public static synchronized <P> arw m2411b(amg amg) {
        arw b;
        synchronized (aje.class) {
            aiv b2 = m2410b(amg.mo10687a());
            if (((Boolean) f1857c.get(amg.mo10687a())).booleanValue()) {
                b = b2.mo10595b(amg.mo10688b());
            } else {
                String valueOf = String.valueOf(amg.mo10687a());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static synchronized <P> arw m2404a(String str, arw arw) {
        arw b;
        synchronized (aje.class) {
            aiv b2 = m2410b(str);
            if (((Boolean) f1857c.get(str)).booleanValue()) {
                b = b2.mo10596b(arw);
            } else {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b;
    }

    /* renamed from: b */
    public static <P> P m2412b(String str, arw arw) {
        return m2410b(str).mo10592a(arw);
    }

    /* renamed from: a */
    private static <P> P m2405a(String str, apc apc) {
        return m2410b(str).mo10591a(apc);
    }

    /* renamed from: a */
    public static <P> P m2406a(String str, byte[] bArr) {
        return m2405a(str, apc.m2986a(bArr));
    }

    /* renamed from: a */
    public static <P> ajb<P> m2402a(aiw aiw, aiv<P> aiv) {
        ajf.m2414b(aiw.mo10598a());
        ajb<P> ajb = new ajb<>();
        for (amk.C1055b next : aiw.mo10598a().mo10700b()) {
            if (next.mo10704c() == amd.ENABLED) {
                ajd<P> a = ajb.mo10605a(m2405a(next.mo10703b().mo10681a(), next.mo10703b().mo10682b()), next);
                if (next.mo10705d() == aiw.mo10598a().mo10699a()) {
                    ajb.mo10606a(a);
                }
            }
        }
        return ajb;
    }
}
