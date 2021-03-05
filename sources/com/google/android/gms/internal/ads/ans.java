package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ant;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class ans<T_WRAPPER extends ant<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final ans<anu, Cipher> f2111a = new ans<>(new anu());

    /* renamed from: b */
    public static final ans<any, Mac> f2112b = new ans<>(new any());

    /* renamed from: c */
    public static final ans<anv, KeyAgreement> f2113c = new ans<>(new anv());

    /* renamed from: d */
    public static final ans<anx, KeyPairGenerator> f2114d = new ans<>(new anx());

    /* renamed from: e */
    public static final ans<anw, KeyFactory> f2115e = new ans<>(new anw());

    /* renamed from: f */
    private static final Logger f2116f = Logger.getLogger(ans.class.getName());

    /* renamed from: g */
    private static final List<Provider> f2117g;

    /* renamed from: h */
    private static final ans<aoa, Signature> f2118h = new ans<>(new aoa());

    /* renamed from: i */
    private static final ans<anz, MessageDigest> f2119i = new ans<>(new anz());

    /* renamed from: j */
    private T_WRAPPER f2120j;

    /* renamed from: k */
    private List<Provider> f2121k = f2117g;

    /* renamed from: l */
    private boolean f2122l = true;

    private ans(T_WRAPPER t_wrapper) {
        this.f2120j = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo10740a(String str) {
        for (Provider next : this.f2121k) {
            if (m2892a(str, next)) {
                return this.f2120j.mo10741a(str, next);
            }
        }
        if (this.f2122l) {
            return this.f2120j.mo10741a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    /* renamed from: a */
    private final boolean m2892a(String str, Provider provider) {
        try {
            this.f2120j.mo10741a(str, provider);
            return true;
        } catch (Exception e) {
            aom.m2930a(e);
            return false;
        }
    }

    static {
        if (aok.m2926a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f2116f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f2117g = arrayList;
        } else {
            f2117g = new ArrayList();
        }
    }
}
