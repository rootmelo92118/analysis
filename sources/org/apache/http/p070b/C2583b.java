package org.apache.http.p070b;

import java.io.Serializable;
import org.apache.http.C2581b;
import org.apache.http.C2588c;
import org.apache.http.p072d.C2591a;
import org.apache.http.p072d.C2593c;

/* renamed from: org.apache.http.b.b */
/* compiled from: BasicHeader */
public class C2583b implements Serializable, Cloneable, C2581b {

    /* renamed from: a */
    private static final C2588c[] f9123a = new C2588c[0];
    private static final long serialVersionUID = -5427236326487562174L;

    /* renamed from: b */
    private final String f9124b;

    /* renamed from: c */
    private final String f9125c;

    public C2583b(String str, String str2) {
        this.f9124b = (String) C2591a.m12012a(str, "Name");
        this.f9125c = str2;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: b */
    public String mo15805b() {
        return this.f9124b;
    }

    /* renamed from: c */
    public String mo15806c() {
        return this.f9125c;
    }

    public String toString() {
        return C2585d.f9134b.mo15816a((C2593c) null, (C2581b) this).toString();
    }
}
