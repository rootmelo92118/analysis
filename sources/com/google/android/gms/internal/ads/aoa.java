package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

public final class aoa implements ant<Signature> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10741a(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
