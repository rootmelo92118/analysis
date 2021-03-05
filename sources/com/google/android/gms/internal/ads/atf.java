package com.google.android.gms.internal.ads;

import java.util.List;

public final class atf extends RuntimeException {

    /* renamed from: a */
    private final List<String> f2467a = null;

    public atf(arw arw) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final aqv mo11165a() {
        return new aqv(getMessage());
    }
}
