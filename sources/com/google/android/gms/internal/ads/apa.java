package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class apa extends aow<Boolean> implements aqu<Boolean>, asi, RandomAccess {

    /* renamed from: a */
    private static final apa f2171a;

    /* renamed from: b */
    private boolean[] f2172b;

    /* renamed from: c */
    private int f2173c;

    apa() {
        this(new boolean[10], 0);
    }

    private apa(boolean[] zArr, int i) {
        this.f2172b = zArr;
        this.f2173c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo10767c();
        if (i2 >= i) {
            System.arraycopy(this.f2172b, i2, this.f2172b, i, this.f2173c - i2);
            this.f2173c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apa)) {
            return super.equals(obj);
        }
        apa apa = (apa) obj;
        if (this.f2173c != apa.f2173c) {
            return false;
        }
        boolean[] zArr = apa.f2172b;
        for (int i = 0; i < this.f2173c; i++) {
            if (this.f2172b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2173c; i2++) {
            i = (i * 31) + aqp.m3494a(this.f2172b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f2173c;
    }

    /* renamed from: a */
    public final void mo10786a(boolean z) {
        m2978a(this.f2173c, z);
    }

    /* renamed from: a */
    private final void m2978a(int i, boolean z) {
        mo10767c();
        if (i < 0 || i > this.f2173c) {
            throw new IndexOutOfBoundsException(m2980c(i));
        }
        if (this.f2173c < this.f2172b.length) {
            System.arraycopy(this.f2172b, i, this.f2172b, i + 1, this.f2173c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f2173c * 3) / 2) + 1)];
            System.arraycopy(this.f2172b, 0, zArr, 0, i);
            System.arraycopy(this.f2172b, i, zArr, i + 1, this.f2173c - i);
            this.f2172b = zArr;
        }
        this.f2172b[i] = z;
        this.f2173c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo10767c();
        aqp.m3495a(collection);
        if (!(collection instanceof apa)) {
            return super.addAll(collection);
        }
        apa apa = (apa) collection;
        if (apa.f2173c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2173c >= apa.f2173c) {
            int i = this.f2173c + apa.f2173c;
            if (i > this.f2172b.length) {
                this.f2172b = Arrays.copyOf(this.f2172b, i);
            }
            System.arraycopy(apa.f2172b, 0, this.f2172b, this.f2173c, apa.f2173c);
            this.f2173c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo10767c();
        for (int i = 0; i < this.f2173c; i++) {
            if (obj.equals(Boolean.valueOf(this.f2172b[i]))) {
                System.arraycopy(this.f2172b, i + 1, this.f2172b, i, this.f2173c - i);
                this.f2173c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m2979b(int i) {
        if (i < 0 || i >= this.f2173c) {
            throw new IndexOutOfBoundsException(m2980c(i));
        }
    }

    /* renamed from: c */
    private final String m2980c(int i) {
        int i2 = this.f2173c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo10767c();
        m2979b(i);
        boolean z = this.f2172b[i];
        this.f2172b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        m2979b(i);
        boolean z = this.f2172b[i];
        if (i < this.f2173c - 1) {
            System.arraycopy(this.f2172b, i + 1, this.f2172b, i, this.f2173c - i);
        }
        this.f2173c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m2978a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= this.f2173c) {
            return new apa(Arrays.copyOf(this.f2172b, i), this.f2173c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m2979b(i);
        return Boolean.valueOf(this.f2172b[i]);
    }

    static {
        apa apa = new apa();
        f2171a = apa;
        apa.mo10766b();
    }
}
