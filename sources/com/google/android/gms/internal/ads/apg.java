package com.google.android.gms.internal.ads;

final class apg extends apm {

    /* renamed from: c */
    private final int f2181c;

    /* renamed from: d */
    private final int f2182d;

    apg(byte[] bArr, int i, int i2) {
        super(bArr);
        m2989b(i, i + i2, bArr.length);
        this.f2181c = i;
        this.f2182d = i2;
    }

    /* renamed from: a */
    public final byte mo10791a(int i) {
        int a = mo10792a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f2188b[this.f2181c + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public final int mo10792a() {
        return this.f2182d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo10813g() {
        return this.f2181c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10797a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f2188b, mo10813g(), bArr, 0, i3);
    }
}
