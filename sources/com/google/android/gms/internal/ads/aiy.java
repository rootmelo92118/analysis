package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class aiy {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<aix> f1847a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static aix m2388a(String str) {
        Iterator<aix> it = f1847a.iterator();
        while (it.hasNext()) {
            aix next = it.next();
            if (next.mo10600a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
