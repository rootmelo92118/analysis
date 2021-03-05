package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class bbj implements bap {

    /* renamed from: b */
    private int f3424b = -1;

    /* renamed from: c */
    private int f3425c = -1;

    /* renamed from: d */
    private int[] f3426d;

    /* renamed from: e */
    private boolean f3427e;

    /* renamed from: f */
    private int[] f3428f;

    /* renamed from: g */
    private ByteBuffer f3429g = f3304a;

    /* renamed from: h */
    private ByteBuffer f3430h = f3304a;

    /* renamed from: i */
    private boolean f3431i;

    /* renamed from: c */
    public final int mo11542c() {
        return 2;
    }

    /* renamed from: a */
    public final void mo11622a(int[] iArr) {
        this.f3426d = iArr;
    }

    /* renamed from: a */
    public final boolean mo11540a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f3426d, this.f3428f);
        this.f3428f = this.f3426d;
        if (this.f3428f == null) {
            this.f3427e = false;
            return z;
        } else if (i3 != 2) {
            throw new baq(i, i2, i3);
        } else if (!z && this.f3425c == i && this.f3424b == i2) {
            return false;
        } else {
            this.f3425c = i;
            this.f3424b = i2;
            this.f3427e = i2 != this.f3428f.length;
            int i4 = 0;
            while (i4 < this.f3428f.length) {
                int i5 = this.f3428f[i4];
                if (i5 < i2) {
                    this.f3427e = (i5 != i4) | this.f3427e;
                    i4++;
                } else {
                    throw new baq(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo11539a() {
        return this.f3427e;
    }

    /* renamed from: b */
    public final int mo11541b() {
        return this.f3428f == null ? this.f3424b : this.f3428f.length;
    }

    /* renamed from: a */
    public final void mo11538a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f3424b * 2)) * this.f3428f.length) << 1;
        if (this.f3429g.capacity() < length) {
            this.f3429g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f3429g.clear();
        }
        while (position < limit) {
            for (int i : this.f3428f) {
                this.f3429g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f3424b << 1;
        }
        byteBuffer.position(limit);
        this.f3429g.flip();
        this.f3430h = this.f3429g;
    }

    /* renamed from: d */
    public final void mo11543d() {
        this.f3431i = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo11544e() {
        ByteBuffer byteBuffer = this.f3430h;
        this.f3430h = f3304a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo11545f() {
        return this.f3431i && this.f3430h == f3304a;
    }

    /* renamed from: g */
    public final void mo11546g() {
        this.f3430h = f3304a;
        this.f3431i = false;
    }

    /* renamed from: h */
    public final void mo11547h() {
        mo11546g();
        this.f3429g = f3304a;
        this.f3424b = -1;
        this.f3425c = -1;
        this.f3428f = null;
        this.f3427e = false;
    }
}
