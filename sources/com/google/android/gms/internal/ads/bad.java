package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bad extends IOException {
    public bad() {
    }

    public bad(String str) {
        super(str);
    }

    public bad(Throwable th) {
        super(th);
    }

    public bad(String str, Throwable th) {
        super(str, th);
    }
}
