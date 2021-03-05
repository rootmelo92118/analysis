package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

final class axv {

    /* renamed from: a */
    static aiu f3071a;

    /* renamed from: a */
    static boolean m4427a(axq axq) {
        Method a;
        if (f3071a != null) {
            return true;
        }
        String str = (String) bre.m6321e().mo12778a(C1557p.f5984bm);
        if (str == null || str.length() == 0) {
            str = null;
            if (!(axq == null || (a = axq.mo11371a("phpjyfBMe8u7C5auGMsy22WXoT6iMDb5qqttOP4sXOBlc73QdE1wdYLJ++PsHndY", "86B2wkBiSbEIJu45HO/BQ/RpWXZRq9YpFeIER87ao7I=")) == null)) {
                str = (String) a.invoke((Object) null, new Object[0]);
            }
            if (str == null) {
                return false;
            }
        }
        try {
            try {
                aiw a2 = aja.m2391a(atm.m3910a(str, true));
                aiq.m2375a(ajs.f1867a);
                f3071a = ajv.m2495a(a2);
                if (f3071a != null) {
                    return true;
                }
                return false;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (IllegalArgumentException unused2) {
            return false;
        }
    }
}
