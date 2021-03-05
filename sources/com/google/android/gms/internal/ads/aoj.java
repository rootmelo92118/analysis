package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class aoj implements aio {

    /* renamed from: a */
    private final byte[] f2136a;

    /* renamed from: b */
    private final aoi f2137b;

    /* renamed from: c */
    private final aoi f2138c;

    aoj(byte[] bArr) {
        this.f2136a = (byte[]) bArr.clone();
        this.f2137b = mo10736a(bArr, 1);
        this.f2138c = mo10736a(bArr, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract aoi mo10736a(byte[] bArr, int i);

    /* renamed from: a */
    public byte[] mo10588a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f2137b.mo10734a();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f2137b.mo10734a() + 16);
            if (allocate.remaining() >= bArr.length + this.f2137b.mo10734a() + 16) {
                int position = allocate.position();
                this.f2137b.mo10746a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f2137b.mo10734a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f2138c.mo10735a(bArr3, 0).get(bArr4);
                int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length2;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length2);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a = aoe.m2911a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
