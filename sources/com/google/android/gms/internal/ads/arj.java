package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class arj extends aow<Long> implements aqu<Long>, asi, RandomAccess {

    /* renamed from: a */
    private static final arj f2380a;

    /* renamed from: b */
    private long[] f2381b;

    /* renamed from: c */
    private int f2382c;

    arj() {
        this(new long[10], 0);
    }

    private arj(long[] jArr, int i) {
        this.f2381b = jArr;
        this.f2382c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo10767c();
        if (i2 >= i) {
            System.arraycopy(this.f2381b, i2, this.f2381b, i, this.f2382c - i2);
            this.f2382c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arj)) {
            return super.equals(obj);
        }
        arj arj = (arj) obj;
        if (this.f2382c != arj.f2382c) {
            return false;
        }
        long[] jArr = arj.f2381b;
        for (int i = 0; i < this.f2382c; i++) {
            if (this.f2381b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2382c; i2++) {
            i = (i * 31) + aqp.m3493a(this.f2381b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo11063b(int i) {
        m3550c(i);
        return this.f2381b[i];
    }

    public final int size() {
        return this.f2382c;
    }

    /* renamed from: a */
    public final void mo11062a(long j) {
        m3549a(this.f2382c, j);
    }

    /* renamed from: a */
    private final void m3549a(int i, long j) {
        mo10767c();
        if (i < 0 || i > this.f2382c) {
            throw new IndexOutOfBoundsException(m3551d(i));
        }
        if (this.f2382c < this.f2381b.length) {
            System.arraycopy(this.f2381b, i, this.f2381b, i + 1, this.f2382c - i);
        } else {
            long[] jArr = new long[(((this.f2382c * 3) / 2) + 1)];
            System.arraycopy(this.f2381b, 0, jArr, 0, i);
            System.arraycopy(this.f2381b, i, jArr, i + 1, this.f2382c - i);
            this.f2381b = jArr;
        }
        this.f2381b[i] = j;
        this.f2382c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo10767c();
        aqp.m3495a(collection);
        if (!(collection instanceof arj)) {
            return super.addAll(collection);
        }
        arj arj = (arj) collection;
        if (arj.f2382c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2382c >= arj.f2382c) {
            int i = this.f2382c + arj.f2382c;
            if (i > this.f2381b.length) {
                this.f2381b = Arrays.copyOf(this.f2381b, i);
            }
            System.arraycopy(arj.f2381b, 0, this.f2381b, this.f2382c, arj.f2382c);
            this.f2382c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo10767c();
        for (int i = 0; i < this.f2382c; i++) {
            if (obj.equals(Long.valueOf(this.f2381b[i]))) {
                System.arraycopy(this.f2381b, i + 1, this.f2381b, i, this.f2382c - i);
                this.f2382c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m3550c(int i) {
        if (i < 0 || i >= this.f2382c) {
            throw new IndexOutOfBoundsException(m3551d(i));
        }
    }

    /* renamed from: d */
    private final String m3551d(int i) {
        int i2 = this.f2382c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo10767c();
        m3550c(i);
        long j = this.f2381b[i];
        this.f2381b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        m3550c(i);
        long j = this.f2381b[i];
        if (i < this.f2382c - 1) {
            System.arraycopy(this.f2381b, i + 1, this.f2381b, i, this.f2382c - i);
        }
        this.f2382c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m3549a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= this.f2382c) {
            return new arj(Arrays.copyOf(this.f2381b, i), this.f2382c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo11063b(i));
    }

    static {
        arj arj = new arj();
        f2380a = arj;
        arj.mo10766b();
    }
}
