package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class avj implements abe {

    /* renamed from: b */
    private static avv f2690b = avv.m4301a(avj.class);

    /* renamed from: a */
    boolean f2691a;

    /* renamed from: c */
    private String f2692c;

    /* renamed from: d */
    private ace f2693d;

    /* renamed from: e */
    private boolean f2694e;

    /* renamed from: f */
    private ByteBuffer f2695f;

    /* renamed from: g */
    private long f2696g;

    /* renamed from: h */
    private long f2697h;

    /* renamed from: i */
    private long f2698i = -1;

    /* renamed from: j */
    private avp f2699j;

    /* renamed from: k */
    private ByteBuffer f2700k = null;

    /* renamed from: b */
    private final synchronized void mo10271b() {
        if (!this.f2694e) {
            try {
                avv avv = f2690b;
                String valueOf = String.valueOf(this.f2692c);
                avv.mo11314a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f2695f = this.f2699j.mo10276a(this.f2696g, this.f2698i);
                this.f2694e = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10270a(ByteBuffer byteBuffer);

    protected avj(String str) {
        this.f2692c = str;
        this.f2694e = true;
        this.f2691a = true;
    }

    /* renamed from: a */
    public final void mo10067a(avp avp, ByteBuffer byteBuffer, long j, C1802yb ybVar) {
        this.f2696g = avp.mo10278b();
        this.f2697h = this.f2696g - ((long) byteBuffer.remaining());
        this.f2698i = j;
        this.f2699j = avp;
        avp.mo10277a(avp.mo10278b() + j);
        this.f2694e = false;
        this.f2691a = false;
        mo11304d();
    }

    /* renamed from: d */
    public final synchronized void mo11304d() {
        mo10271b();
        avv avv = f2690b;
        String valueOf = String.valueOf(this.f2692c);
        avv.mo11314a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.f2695f != null) {
            ByteBuffer byteBuffer = this.f2695f;
            this.f2691a = true;
            byteBuffer.rewind();
            mo10270a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f2700k = byteBuffer.slice();
            }
            this.f2695f = null;
        }
    }

    /* renamed from: a */
    public final String mo10065a() {
        return this.f2692c;
    }

    /* renamed from: a */
    public final void mo10066a(ace ace) {
        this.f2693d = ace;
    }
}
