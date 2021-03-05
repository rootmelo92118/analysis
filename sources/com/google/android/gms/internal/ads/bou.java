package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class bou extends PushbackInputStream {

    /* renamed from: a */
    private final /* synthetic */ bor f4923a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bou(bor bor, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f4923a = bor;
    }

    public final void close() {
        this.f4923a.f4914a.m6106a();
        super.close();
    }
}
