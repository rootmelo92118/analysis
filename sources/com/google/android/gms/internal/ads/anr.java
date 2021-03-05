package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class anr implements aio {

    /* renamed from: a */
    private final aoc f2108a;

    /* renamed from: b */
    private final aiz f2109b;

    /* renamed from: c */
    private final int f2110c;

    public anr(aoc aoc, aiz aiz, int i) {
        this.f2108a = aoc;
        this.f2109b = aiz;
        this.f2110c = i;
    }

    /* renamed from: a */
    public final byte[] mo10588a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f2108a.mo10733a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return and.m2868a(a, this.f2109b.mo10602a(and.m2868a(bArr2, a, copyOf)));
    }
}
