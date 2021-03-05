package org.apache.http;

import java.io.Serializable;
import org.apache.http.p072d.C2591a;

/* renamed from: org.apache.http.i */
/* compiled from: ProtocolVersion */
public class C2598i implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;

    /* renamed from: d */
    protected final String f9145d;

    /* renamed from: e */
    protected final int f9146e;

    /* renamed from: f */
    protected final int f9147f;

    public C2598i(String str, int i, int i2) {
        this.f9145d = (String) C2591a.m12012a(str, "Protocol name");
        this.f9146e = C2591a.m12011a(i, "Protocol minor version");
        this.f9147f = C2591a.m12011a(i2, "Protocol minor version");
    }

    /* renamed from: a */
    public final String mo15839a() {
        return this.f9145d;
    }

    /* renamed from: b */
    public final int mo15840b() {
        return this.f9146e;
    }

    /* renamed from: c */
    public final int mo15841c() {
        return this.f9147f;
    }

    public final int hashCode() {
        return (this.f9145d.hashCode() ^ (this.f9146e * 100000)) ^ this.f9147f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598i)) {
            return false;
        }
        C2598i iVar = (C2598i) obj;
        if (this.f9145d.equals(iVar.f9145d) && this.f9146e == iVar.f9146e && this.f9147f == iVar.f9147f) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f9145d + '/' + Integer.toString(this.f9146e) + '.' + Integer.toString(this.f9147f);
    }

    public Object clone() {
        return super.clone();
    }
}
