package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class avl extends avj implements abe {

    /* renamed from: b */
    private int f2705b;

    /* renamed from: c */
    private int f2706c;

    protected avl(String str) {
        super(str);
    }

    /* renamed from: e */
    public final int mo11307e() {
        if (!this.f2691a) {
            mo11304d();
        }
        return this.f2705b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo11306b(ByteBuffer byteBuffer) {
        this.f2705b = aae.m1611a(byteBuffer.get());
        this.f2706c = (aae.m1613b(byteBuffer) << 8) + 0 + aae.m1611a(byteBuffer.get());
        return 4;
    }
}
