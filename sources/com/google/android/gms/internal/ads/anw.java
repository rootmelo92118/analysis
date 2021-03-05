package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

public final class anw implements ant<KeyFactory> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10741a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
