package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

public final class any implements ant<Mac> {
    /* renamed from: a */
    public final /* synthetic */ Object mo10741a(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
