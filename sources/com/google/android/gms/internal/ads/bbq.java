package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class bbq implements bap {

    /* renamed from: b */
    private int f3475b = -1;

    /* renamed from: c */
    private int f3476c = -1;

    /* renamed from: d */
    private bbp f3477d;

    /* renamed from: e */
    private float f3478e = 1.0f;

    /* renamed from: f */
    private float f3479f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f3480g = f3304a;

    /* renamed from: h */
    private ShortBuffer f3481h = this.f3480g.asShortBuffer();

    /* renamed from: i */
    private ByteBuffer f3482i = f3304a;

    /* renamed from: j */
    private long f3483j;

    /* renamed from: k */
    private long f3484k;

    /* renamed from: l */
    private boolean f3485l;

    /* renamed from: c */
    public final int mo11542c() {
        return 2;
    }

    /* renamed from: a */
    public final float mo11640a(float f) {
        this.f3478e = bkp.m5807a(f, 0.1f, 8.0f);
        return this.f3478e;
    }

    /* renamed from: b */
    public final float mo11641b(float f) {
        this.f3479f = bkp.m5807a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: i */
    public final long mo11642i() {
        return this.f3483j;
    }

    /* renamed from: j */
    public final long mo11643j() {
        return this.f3484k;
    }

    /* renamed from: a */
    public final boolean mo11540a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new baq(i, i2, i3);
        } else if (this.f3476c == i && this.f3475b == i2) {
            return false;
        } else {
            this.f3476c = i;
            this.f3475b = i2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo11539a() {
        return Math.abs(this.f3478e - 1.0f) >= 0.01f || Math.abs(this.f3479f - 1.0f) >= 0.01f;
    }

    /* renamed from: b */
    public final int mo11541b() {
        return this.f3475b;
    }

    /* renamed from: a */
    public final void mo11538a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f3483j += (long) remaining;
            this.f3477d.mo11636a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b = (this.f3477d.mo11637b() * this.f3475b) << 1;
        if (b > 0) {
            if (this.f3480g.capacity() < b) {
                this.f3480g = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f3481h = this.f3480g.asShortBuffer();
            } else {
                this.f3480g.clear();
                this.f3481h.clear();
            }
            this.f3477d.mo11639b(this.f3481h);
            this.f3484k += (long) b;
            this.f3480g.limit(b);
            this.f3482i = this.f3480g;
        }
    }

    /* renamed from: d */
    public final void mo11543d() {
        this.f3477d.mo11634a();
        this.f3485l = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo11544e() {
        ByteBuffer byteBuffer = this.f3482i;
        this.f3482i = f3304a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo11545f() {
        if (this.f3485l) {
            return this.f3477d == null || this.f3477d.mo11637b() == 0;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo11546g() {
        this.f3477d = new bbp(this.f3476c, this.f3475b);
        this.f3477d.mo11635a(this.f3478e);
        this.f3477d.mo11638b(this.f3479f);
        this.f3482i = f3304a;
        this.f3483j = 0;
        this.f3484k = 0;
        this.f3485l = false;
    }

    /* renamed from: h */
    public final void mo11547h() {
        this.f3477d = null;
        this.f3480g = f3304a;
        this.f3481h = this.f3480g.asShortBuffer();
        this.f3482i = f3304a;
        this.f3475b = -1;
        this.f3476c = -1;
        this.f3483j = 0;
        this.f3484k = 0;
        this.f3485l = false;
    }
}
