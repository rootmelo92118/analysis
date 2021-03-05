package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dc */
final class C1964dc extends C1969dh {

    /* renamed from: c */
    private final int f7591c;

    /* renamed from: d */
    private final int f7592d;

    C1964dc(byte[] bArr, int i, int i2) {
        super(bArr);
        m9078b(i, i + i2, bArr.length);
        this.f7591c = i;
        this.f7592d = i2;
    }

    /* renamed from: a */
    public final byte mo13594a(int i) {
        int a = mo13595a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f7595b[this.f7591c + i];
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

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte mo13600b(int i) {
        return this.f7595b[this.f7591c + i];
    }

    /* renamed from: a */
    public final int mo13595a() {
        return this.f7592d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo13615e() {
        return this.f7591c;
    }
}
