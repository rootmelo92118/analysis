package org.apache.http.p070b;

import java.util.Locale;
import org.apache.http.C2590d;
import org.apache.http.C2595f;
import org.apache.http.C2596g;
import org.apache.http.C2598i;
import org.apache.http.C2599j;
import org.apache.http.C2600k;
import org.apache.http.p072d.C2591a;

/* renamed from: org.apache.http.b.c */
/* compiled from: BasicHttpResponse */
public class C2584c extends C2582a implements C2595f {

    /* renamed from: c */
    private C2600k f9126c;

    /* renamed from: d */
    private C2598i f9127d;

    /* renamed from: e */
    private int f9128e;

    /* renamed from: f */
    private String f9129f;

    /* renamed from: g */
    private C2590d f9130g;

    /* renamed from: h */
    private final C2599j f9131h = null;

    /* renamed from: i */
    private Locale f9132i = null;

    public C2584c(C2600k kVar) {
        this.f9126c = (C2600k) C2591a.m12012a(kVar, "Status line");
        this.f9127d = kVar.mo15821a();
        this.f9128e = kVar.mo15822b();
        this.f9129f = kVar.mo15823c();
    }

    /* renamed from: b */
    public C2600k mo15811b() {
        if (this.f9126c == null) {
            this.f9126c = new C2586e(this.f9127d != null ? this.f9127d : C2596g.f9144c, this.f9128e, this.f9129f != null ? this.f9129f : mo15809a(this.f9128e));
        }
        return this.f9126c;
    }

    /* renamed from: c */
    public C2590d mo15812c() {
        return this.f9130g;
    }

    /* renamed from: a */
    public void mo15810a(C2590d dVar) {
        this.f9130g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15809a(int i) {
        if (this.f9131h == null) {
            return null;
        }
        return this.f9131h.mo15846a(i, this.f9132i != null ? this.f9132i : Locale.getDefault());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15811b());
        sb.append(' ');
        sb.append(this.f9121a);
        if (this.f9130g != null) {
            sb.append(' ');
            sb.append(this.f9130g);
        }
        return sb.toString();
    }
}
