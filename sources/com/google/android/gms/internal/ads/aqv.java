package com.google.android.gms.internal.ads;

import java.io.IOException;

public class aqv extends IOException {

    /* renamed from: a */
    private arw f2352a = null;

    public aqv(String str) {
        super(str);
    }

    /* renamed from: a */
    public final aqv mo11038a(arw arw) {
        this.f2352a = arw;
        return this;
    }

    /* renamed from: a */
    static aqv m3507a() {
        return new aqv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static aqv m3508b() {
        return new aqv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static aqv m3509c() {
        return new aqv("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static aqv m3510d() {
        return new aqv("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static aqv m3511e() {
        return new aqv("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static aqw m3512f() {
        return new aqw("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static aqv m3513g() {
        return new aqv("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static aqv m3514h() {
        return new aqv("Failed to parse the message.");
    }

    /* renamed from: i */
    static aqv m3515i() {
        return new aqv("Protocol message had invalid UTF-8.");
    }
}
