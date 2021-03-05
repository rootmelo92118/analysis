package org.p063a.p064a.p065a;

import org.p063a.p068b.C2575b;

/* renamed from: org.a.a.a.d */
public class C2557d extends C2561h {
    /* renamed from: a */
    public String mo15781a() {
        return "ChaCha7539-" + this.f9088c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15782a(byte[] bArr) {
        C2558e.m11918a(this.f9088c, this.f9089d, this.f9090e);
        C2575b.m11979a(this.f9090e, bArr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15783a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                mo15789a(bArr.length, this.f9089d, 0);
                C2575b.m11978a(bArr, 0, this.f9089d, 4, 8);
            } else {
                throw new IllegalArgumentException(mo15781a() + " requires 256 bit key");
            }
        }
        C2575b.m11978a(bArr2, 0, this.f9089d, 13, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo15784b() {
        return 12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15785c() {
        int[] iArr = this.f9089d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15786d() {
        this.f9089d[12] = 0;
    }
}
