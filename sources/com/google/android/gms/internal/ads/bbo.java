package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class bbo implements bap {

    /* renamed from: b */
    private int f3445b = -1;

    /* renamed from: c */
    private int f3446c = -1;

    /* renamed from: d */
    private int f3447d = 0;

    /* renamed from: e */
    private ByteBuffer f3448e = f3304a;

    /* renamed from: f */
    private ByteBuffer f3449f = f3304a;

    /* renamed from: g */
    private boolean f3450g;

    /* renamed from: c */
    public final int mo11542c() {
        return 2;
    }

    /* renamed from: a */
    public final boolean mo11540a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new baq(i, i2, i3);
        } else if (this.f3445b == i && this.f3446c == i2 && this.f3447d == i3) {
            return false;
        } else {
            this.f3445b = i;
            this.f3446c = i2;
            this.f3447d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f3448e = f3304a;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo11539a() {
        return (this.f3447d == 0 || this.f3447d == 2) ? false : true;
    }

    /* renamed from: b */
    public final int mo11541b() {
        return this.f3446c;
    }

    /* renamed from: a */
    public final void mo11538a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f3447d;
        if (i3 == Integer.MIN_VALUE) {
            i = (i2 / 3) << 1;
        } else if (i3 == 3) {
            i = i2 << 1;
        } else if (i3 == 1073741824) {
            i = i2 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.f3448e.capacity() < i) {
            this.f3448e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f3448e.clear();
        }
        int i4 = this.f3447d;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                this.f3448e.put(byteBuffer.get(position + 1));
                this.f3448e.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 == 3) {
            while (position < limit) {
                this.f3448e.put((byte) 0);
                this.f3448e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i4 == 1073741824) {
            while (position < limit) {
                this.f3448e.put(byteBuffer.get(position + 2));
                this.f3448e.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.f3448e.flip();
        this.f3449f = this.f3448e;
    }

    /* renamed from: d */
    public final void mo11543d() {
        this.f3450g = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo11544e() {
        ByteBuffer byteBuffer = this.f3449f;
        this.f3449f = f3304a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo11545f() {
        return this.f3450g && this.f3449f == f3304a;
    }

    /* renamed from: g */
    public final void mo11546g() {
        this.f3449f = f3304a;
        this.f3450g = false;
    }

    /* renamed from: h */
    public final void mo11547h() {
        mo11546g();
        this.f3448e = f3304a;
        this.f3445b = -1;
        this.f3446c = -1;
        this.f3447d = 0;
    }
}
