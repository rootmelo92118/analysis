package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class ajo implements aio {

    /* renamed from: a */
    private static final byte[] f1864a = new byte[0];

    /* renamed from: b */
    private final amg f1865b;

    /* renamed from: c */
    private final aio f1866c;

    public ajo(amg amg, aio aio) {
        this.f1865b = amg;
        this.f1866c = aio;
    }

    /* renamed from: a */
    public final byte[] mo10588a(byte[] bArr, byte[] bArr2) {
        byte[] i = aje.m2411b(this.f1865b).mo10755i();
        byte[] a = this.f1866c.mo10588a(i, f1864a);
        byte[] a2 = ((aio) aje.m2406a(this.f1865b.mo10687a(), i)).mo10588a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
