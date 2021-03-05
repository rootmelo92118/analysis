package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.id */
public final class C2115id extends IOException {
    public C2115id(String str) {
        super(str);
    }

    public C2115id(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    static C2115id m10273a() {
        return new C2115id("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C2115id m10274b() {
        return new C2115id("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C2115id m10275c() {
        return new C2115id("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C2115id m10276d() {
        return new C2115id("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
