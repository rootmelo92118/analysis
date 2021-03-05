package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class afe extends avj {

    /* renamed from: b */
    private ByteBuffer f1580b;

    public afe(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo10270a(ByteBuffer byteBuffer) {
        this.f1580b = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
