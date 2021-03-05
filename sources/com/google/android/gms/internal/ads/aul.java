package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class aul extends IOException {
    public aul(String str) {
        super(str);
    }

    public aul(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    static aul m4181a() {
        return new aul("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static aul m4182b() {
        return new aul("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static aul m4183c() {
        return new aul("CodedInputStream encountered a malformed varint.");
    }
}
