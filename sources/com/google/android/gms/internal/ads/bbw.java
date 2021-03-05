package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class bbw extends bbr {

    /* renamed from: a */
    public final bbs f3506a = new bbs();

    /* renamed from: b */
    public ByteBuffer f3507b;

    /* renamed from: c */
    public long f3508c;

    /* renamed from: d */
    private final int f3509d = 0;

    public bbw(int i) {
    }

    /* renamed from: d */
    public final void mo11654d(int i) {
        if (this.f3507b == null) {
            this.f3507b = m4898e(i);
            return;
        }
        int capacity = this.f3507b.capacity();
        int position = this.f3507b.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer e = m4898e(i2);
            if (position > 0) {
                this.f3507b.position(0);
                this.f3507b.limit(position);
                e.put(this.f3507b);
            }
            this.f3507b = e;
        }
    }

    /* renamed from: e */
    public final boolean mo11655e() {
        return mo11649c(1073741824);
    }

    /* renamed from: a */
    public final void mo11644a() {
        super.mo11644a();
        if (this.f3507b != null) {
            this.f3507b.clear();
        }
    }

    /* renamed from: e */
    private final ByteBuffer m4898e(int i) {
        int capacity = this.f3507b == null ? 0 : this.f3507b.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
