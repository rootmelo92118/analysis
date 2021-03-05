package org.apache.http.p069a;

import org.apache.http.C2581b;
import org.apache.http.C2590d;

/* renamed from: org.apache.http.a.a */
/* compiled from: AbstractHttpEntity */
public abstract class C2579a implements C2590d {

    /* renamed from: a */
    protected C2581b f9116a;

    /* renamed from: b */
    protected C2581b f9117b;

    /* renamed from: c */
    protected boolean f9118c;

    protected C2579a() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f9116a != null) {
            sb.append("Content-Type: ");
            sb.append(this.f9116a.mo15806c());
            sb.append(',');
        }
        if (this.f9117b != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.f9117b.mo15806c());
            sb.append(',');
        }
        long a = mo15799a();
        if (a >= 0) {
            sb.append("Content-Length: ");
            sb.append(a);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.f9118c);
        sb.append(']');
        return sb.toString();
    }
}
