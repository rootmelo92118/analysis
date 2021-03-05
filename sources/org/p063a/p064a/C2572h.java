package org.p063a.p064a;

/* renamed from: org.a.a.h */
public abstract class C2572h implements C2553a, C2573i {

    /* renamed from: a */
    private final C2553a f9114a;

    protected C2572h(C2553a aVar) {
        this.f9114a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte mo15791a(byte b);

    /* renamed from: a */
    public int mo15787a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 + i2 <= bArr2.length) {
            int i4 = i + i2;
            if (i4 <= bArr.length) {
                while (i < i4) {
                    bArr2[i3] = mo15791a(bArr[i]);
                    i3++;
                    i++;
                }
                return i2;
            }
            throw new C2565c("input buffer too small");
        }
        throw new C2565c("output buffer too short");
    }
}
