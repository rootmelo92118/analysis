package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@C1598qn
final class aef implements avp {

    /* renamed from: a */
    private final ByteBuffer f1515a;

    aef(ByteBuffer byteBuffer) {
        this.f1515a = byteBuffer.duplicate();
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo10274a(ByteBuffer byteBuffer) {
        if (this.f1515a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f1515a.remaining());
        byte[] bArr = new byte[min];
        this.f1515a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: a */
    public final long mo10275a() {
        return (long) this.f1515a.limit();
    }

    /* renamed from: b */
    public final long mo10278b() {
        return (long) this.f1515a.position();
    }

    /* renamed from: a */
    public final void mo10277a(long j) {
        this.f1515a.position((int) j);
    }

    /* renamed from: a */
    public final ByteBuffer mo10276a(long j, long j2) {
        int position = this.f1515a.position();
        this.f1515a.position((int) j);
        ByteBuffer slice = this.f1515a.slice();
        slice.limit((int) j2);
        this.f1515a.position(position);
        return slice;
    }
}
