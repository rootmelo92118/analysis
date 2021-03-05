package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.ua */
public final class C1693ua extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C1402jg f6568a;

    public C1693ua(C1402jg jgVar, int i) {
        this.f6568a = jgVar;
        this.buf = this.f6568a.mo12635a(Math.max(i, 256));
    }

    public final void close() {
        this.f6568a.mo12634a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6568a.mo12634a(this.buf);
    }

    /* renamed from: a */
    private final void m8023a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f6568a.mo12635a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f6568a.mo12634a(this.buf);
            this.buf = a;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m8023a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m8023a(1);
        super.write(i);
    }
}
