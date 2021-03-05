package com.google.android.gms.internal.ads;

public final class aob {

    /* renamed from: a */
    private final byte[] f2123a;

    /* renamed from: a */
    public static aob m2904a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new aob(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo10744a() {
        byte[] bArr = new byte[this.f2123a.length];
        System.arraycopy(this.f2123a, 0, bArr, 0, this.f2123a.length);
        return bArr;
    }

    private aob(byte[] bArr, int i, int i2) {
        this.f2123a = new byte[i2];
        System.arraycopy(bArr, 0, this.f2123a, 0, i2);
    }
}
