package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aqo extends aow<Integer> implements aqu<Integer>, asi, RandomAccess {

    /* renamed from: a */
    private static final aqo f2344a;

    /* renamed from: b */
    private int[] f2345b;

    /* renamed from: c */
    private int f2346c;

    /* renamed from: d */
    public static aqo m3486d() {
        return f2344a;
    }

    aqo() {
        this(new int[10], 0);
    }

    private aqo(int[] iArr, int i) {
        this.f2345b = iArr;
        this.f2346c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo10767c();
        if (i2 >= i) {
            System.arraycopy(this.f2345b, i2, this.f2345b, i, this.f2346c - i2);
            this.f2346c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqo)) {
            return super.equals(obj);
        }
        aqo aqo = (aqo) obj;
        if (this.f2346c != aqo.f2346c) {
            return false;
        }
        int[] iArr = aqo.f2345b;
        for (int i = 0; i < this.f2346c; i++) {
            if (this.f2345b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2346c; i2++) {
            i = (i * 31) + this.f2345b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int mo11032b(int i) {
        m3487d(i);
        return this.f2345b[i];
    }

    public final int size() {
        return this.f2346c;
    }

    /* renamed from: c */
    public final void mo11033c(int i) {
        m3485a(this.f2346c, i);
    }

    /* renamed from: a */
    private final void m3485a(int i, int i2) {
        mo10767c();
        if (i < 0 || i > this.f2346c) {
            throw new IndexOutOfBoundsException(m3488e(i));
        }
        if (this.f2346c < this.f2345b.length) {
            System.arraycopy(this.f2345b, i, this.f2345b, i + 1, this.f2346c - i);
        } else {
            int[] iArr = new int[(((this.f2346c * 3) / 2) + 1)];
            System.arraycopy(this.f2345b, 0, iArr, 0, i);
            System.arraycopy(this.f2345b, i, iArr, i + 1, this.f2346c - i);
            this.f2345b = iArr;
        }
        this.f2345b[i] = i2;
        this.f2346c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo10767c();
        aqp.m3495a(collection);
        if (!(collection instanceof aqo)) {
            return super.addAll(collection);
        }
        aqo aqo = (aqo) collection;
        if (aqo.f2346c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2346c >= aqo.f2346c) {
            int i = this.f2346c + aqo.f2346c;
            if (i > this.f2345b.length) {
                this.f2345b = Arrays.copyOf(this.f2345b, i);
            }
            System.arraycopy(aqo.f2345b, 0, this.f2345b, this.f2346c, aqo.f2346c);
            this.f2346c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo10767c();
        for (int i = 0; i < this.f2346c; i++) {
            if (obj.equals(Integer.valueOf(this.f2345b[i]))) {
                System.arraycopy(this.f2345b, i + 1, this.f2345b, i, this.f2346c - i);
                this.f2346c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m3487d(int i) {
        if (i < 0 || i >= this.f2346c) {
            throw new IndexOutOfBoundsException(m3488e(i));
        }
    }

    /* renamed from: e */
    private final String m3488e(int i) {
        int i2 = this.f2346c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo10767c();
        m3487d(i);
        int i2 = this.f2345b[i];
        this.f2345b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        m3487d(i);
        int i2 = this.f2345b[i];
        if (i < this.f2346c - 1) {
            System.arraycopy(this.f2345b, i + 1, this.f2345b, i, this.f2346c - i);
        }
        this.f2346c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m3485a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= this.f2346c) {
            return new aqo(Arrays.copyOf(this.f2345b, i), this.f2346c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo11032b(i));
    }

    static {
        aqo aqo = new aqo();
        f2344a = aqo;
        aqo.mo10766b();
    }
}
