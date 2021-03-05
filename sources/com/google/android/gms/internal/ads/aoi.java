package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class aoi implements aoc {

    /* renamed from: a */
    static final int[] f2133a = m2919a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));

    /* renamed from: b */
    final aob f2134b;

    /* renamed from: c */
    private final int f2135c;

    aoi(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f2134b = aob.m2904a(bArr);
            this.f2135c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    static int m2918a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo10734a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract ByteBuffer mo10735a(byte[] bArr, int i);

    /* renamed from: a */
    public final byte[] mo10733a(byte[] bArr) {
        int length = bArr.length;
        mo10734a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(mo10734a() + bArr.length);
            mo10746a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10746a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo10734a() >= bArr.length) {
            byte[] a = aof.m2913a(mo10734a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo10735a(a, this.f2135c + i2);
                if (i2 == i - 1) {
                    and.m2867a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    and.m2867a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    static int[] m2919a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
