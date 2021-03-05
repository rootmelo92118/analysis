package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ane extends aoi {

    /* renamed from: c */
    private static final byte[] f2075c = new byte[16];

    ane(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo10734a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ByteBuffer mo10735a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        System.arraycopy(aoi.f2133a, 0, iArr, 0, f2133a.length);
        int[] a = m2919a(ByteBuffer.wrap(this.f2134b.mo10744a()));
        int i2 = 4;
        System.arraycopy(a, 0, iArr, 4, a.length);
        iArr[12] = i;
        System.arraycopy(m2919a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr2 = (int[]) iArr.clone();
        int i3 = 0;
        while (i3 < 10) {
            m2869a(iArr2, 0, i2, 8, 12);
            m2869a(iArr2, 1, 5, 9, 13);
            m2869a(iArr2, 2, 6, 10, 14);
            m2869a(iArr2, 3, 7, 11, 15);
            m2869a(iArr2, 0, 5, 10, 15);
            m2869a(iArr2, 1, 6, 11, 12);
            m2869a(iArr2, 2, 7, 8, 13);
            m2869a(iArr2, 3, 4, 9, 14);
            i3++;
            i2 = 4;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            iArr[i4] = iArr[i4] + iArr2[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }

    /* renamed from: a */
    private static void m2869a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m2918a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m2918a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m2918a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m2918a(iArr[i2] ^ iArr[i3], 7);
    }
}
