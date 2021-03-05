package org.apache.http.p070b;

import java.io.Serializable;
import org.apache.http.C2598i;
import org.apache.http.C2600k;
import org.apache.http.p072d.C2591a;
import org.apache.http.p072d.C2593c;

/* renamed from: org.apache.http.b.e */
/* compiled from: BasicStatusLine */
public class C2586e implements Serializable, Cloneable, C2600k {
    private static final long serialVersionUID = -2443303766890459269L;

    /* renamed from: a */
    private final C2598i f9135a;

    /* renamed from: b */
    private final int f9136b;

    /* renamed from: c */
    private final String f9137c;

    public C2586e(C2598i iVar, int i, String str) {
        this.f9135a = (C2598i) C2591a.m12012a(iVar, "Version");
        this.f9136b = C2591a.m12011a(i, "Status code");
        this.f9137c = str;
    }

    /* renamed from: b */
    public int mo15822b() {
        return this.f9136b;
    }

    /* renamed from: a */
    public C2598i mo15821a() {
        return this.f9135a;
    }

    /* renamed from: c */
    public String mo15823c() {
        return this.f9137c;
    }

    public String toString() {
        return C2585d.f9134b.mo15818a((C2593c) null, (C2600k) this).toString();
    }

    public Object clone() {
        return super.clone();
    }
}
