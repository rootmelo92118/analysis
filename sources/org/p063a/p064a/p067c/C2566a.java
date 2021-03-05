package org.p063a.p064a.p067c;

import org.p063a.p064a.C2562b;

/* renamed from: org.a.a.c.a */
public class C2566a implements C2562b {

    /* renamed from: a */
    private byte[] f9111a;

    public C2566a(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C2566a(byte[] bArr, int i, int i2) {
        this.f9111a = new byte[i2];
        System.arraycopy(bArr, i, this.f9111a, 0, i2);
    }

    /* renamed from: a */
    public byte[] mo15792a() {
        return this.f9111a;
    }
}
