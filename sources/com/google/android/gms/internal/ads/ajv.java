package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

public final class ajv {

    /* renamed from: a */
    private static final Logger f1870a = Logger.getLogger(ajv.class.getName());

    /* renamed from: a */
    public static aiu m2495a(aiw aiw) {
        ajb a = aje.m2402a(aiw, (aiv) null);
        for (Collection it : a.mo10607b()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!(((ajd) it2.next()).mo10608a() instanceof aiu)) {
                        throw new GeneralSecurityException("invalid HybridEncrypt key material");
                    }
                }
            }
        }
        return new ajw(a);
    }
}
