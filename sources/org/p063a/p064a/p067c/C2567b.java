package org.p063a.p064a.p067c;

import org.p063a.p064a.C2562b;

/* renamed from: org.a.a.c.b */
public class C2567b implements C2562b {

    /* renamed from: a */
    private byte[] f9112a;

    /* renamed from: b */
    private C2562b f9113b;

    public C2567b(C2562b bVar, byte[] bArr) {
        this(bVar, bArr, 0, bArr.length);
    }

    public C2567b(C2562b bVar, byte[] bArr, int i, int i2) {
        this.f9112a = new byte[i2];
        this.f9113b = bVar;
        System.arraycopy(bArr, i, this.f9112a, 0, i2);
    }

    /* renamed from: a */
    public byte[] mo15793a() {
        return this.f9112a;
    }

    /* renamed from: b */
    public C2562b mo15794b() {
        return this.f9113b;
    }
}
