package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bkb {

    /* renamed from: a */
    private int f4539a;

    /* renamed from: b */
    private long[] f4540b;

    public bkb() {
        this(32);
    }

    private bkb(int i) {
        this.f4540b = new long[32];
    }

    /* renamed from: a */
    public final void mo12045a(long j) {
        if (this.f4539a == this.f4540b.length) {
            this.f4540b = Arrays.copyOf(this.f4540b, this.f4539a << 1);
        }
        long[] jArr = this.f4540b;
        int i = this.f4539a;
        this.f4539a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public final long mo12044a(int i) {
        if (i >= 0 && i < this.f4539a) {
            return this.f4540b[i];
        }
        int i2 = this.f4539a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final int mo12043a() {
        return this.f4539a;
    }
}
