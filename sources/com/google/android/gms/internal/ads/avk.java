package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class avk extends avm implements abe {

    /* renamed from: f */
    private ace f2701f;

    /* renamed from: g */
    private String f2702g;

    /* renamed from: h */
    private boolean f2703h;

    /* renamed from: i */
    private long f2704i;

    public avk(String str) {
        this.f2702g = str;
    }

    /* renamed from: a */
    public final void mo10066a(ace ace) {
        this.f2701f = ace;
    }

    /* renamed from: a */
    public final String mo10065a() {
        return this.f2702g;
    }

    /* renamed from: a */
    public final void mo10067a(avp avp, ByteBuffer byteBuffer, long j, C1802yb ybVar) {
        this.f2704i = avp.mo10278b() - ((long) byteBuffer.remaining());
        this.f2703h = byteBuffer.remaining() == 16;
        mo11305a(avp, j, ybVar);
    }

    /* renamed from: a */
    public final void mo11305a(avp avp, long j, C1802yb ybVar) {
        this.f2710b = avp;
        this.f2711c = avp.mo10278b();
        this.f2712d = this.f2711c - ((long) ((this.f2703h || 8 + j >= 4294967296L) ? 16 : 8));
        avp.mo10277a(avp.mo10278b() + j);
        this.f2713e = avp.mo10278b();
        this.f2709a = ybVar;
    }
}
