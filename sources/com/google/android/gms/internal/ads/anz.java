package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

public final class anz implements ant<MessageDigest> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10741a(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
