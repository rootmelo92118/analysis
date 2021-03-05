package org.apache.http.p069a;

import java.io.InputStream;
import org.apache.http.p072d.C2592b;

/* renamed from: org.apache.http.a.b */
/* compiled from: BasicHttpEntity */
public class C2580b extends C2579a {

    /* renamed from: d */
    private InputStream f9119d;

    /* renamed from: e */
    private long f9120e = -1;

    /* renamed from: a */
    public long mo15799a() {
        return this.f9120e;
    }

    /* renamed from: b */
    public InputStream mo15802b() {
        C2592b.m12013a(this.f9119d != null, "Content has not been provided");
        return this.f9119d;
    }

    /* renamed from: a */
    public void mo15800a(long j) {
        this.f9120e = j;
    }

    /* renamed from: a */
    public void mo15801a(InputStream inputStream) {
        this.f9119d = inputStream;
    }
}
