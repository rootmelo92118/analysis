package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class anx implements ant<KeyPairGenerator> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10741a(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
