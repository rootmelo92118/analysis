package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ep */
public class C2015ep extends IOException {

    /* renamed from: a */
    private C2043fq f7752a = null;

    public C2015ep(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C2015ep mo13835a(C2043fq fqVar) {
        this.f7752a = fqVar;
        return this;
    }

    /* renamed from: a */
    static C2015ep m9572a() {
        return new C2015ep("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C2015ep m9573b() {
        return new C2015ep("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C2015ep m9574c() {
        return new C2015ep("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C2015ep m9575d() {
        return new C2015ep("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: e */
    static C2016eq m9576e() {
        return new C2016eq("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static C2015ep m9577f() {
        return new C2015ep("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: g */
    static C2015ep m9578g() {
        return new C2015ep("Failed to parse the message.");
    }

    /* renamed from: h */
    static C2015ep m9579h() {
        return new C2015ep("Protocol message had invalid UTF-8.");
    }
}
