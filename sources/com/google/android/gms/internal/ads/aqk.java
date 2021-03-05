package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aqk extends aow<Float> implements aqu<Float>, asi, RandomAccess {

    /* renamed from: a */
    private static final aqk f2320a;

    /* renamed from: b */
    private float[] f2321b;

    /* renamed from: c */
    private int f2322c;

    aqk() {
        this(new float[10], 0);
    }

    private aqk(float[] fArr, int i) {
        this.f2321b = fArr;
        this.f2322c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo10767c();
        if (i2 >= i) {
            System.arraycopy(this.f2321b, i2, this.f2321b, i, this.f2322c - i2);
            this.f2322c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqk)) {
            return super.equals(obj);
        }
        aqk aqk = (aqk) obj;
        if (this.f2322c != aqk.f2322c) {
            return false;
        }
        float[] fArr = aqk.f2321b;
        for (int i = 0; i < this.f2322c; i++) {
            if (this.f2321b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2322c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f2321b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f2322c;
    }

    /* renamed from: a */
    public final void mo11009a(float f) {
        m3441a(this.f2322c, f);
    }

    /* renamed from: a */
    private final void m3441a(int i, float f) {
        mo10767c();
        if (i < 0 || i > this.f2322c) {
            throw new IndexOutOfBoundsException(m3443c(i));
        }
        if (this.f2322c < this.f2321b.length) {
            System.arraycopy(this.f2321b, i, this.f2321b, i + 1, this.f2322c - i);
        } else {
            float[] fArr = new float[(((this.f2322c * 3) / 2) + 1)];
            System.arraycopy(this.f2321b, 0, fArr, 0, i);
            System.arraycopy(this.f2321b, i, fArr, i + 1, this.f2322c - i);
            this.f2321b = fArr;
        }
        this.f2321b[i] = f;
        this.f2322c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo10767c();
        aqp.m3495a(collection);
        if (!(collection instanceof aqk)) {
            return super.addAll(collection);
        }
        aqk aqk = (aqk) collection;
        if (aqk.f2322c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2322c >= aqk.f2322c) {
            int i = this.f2322c + aqk.f2322c;
            if (i > this.f2321b.length) {
                this.f2321b = Arrays.copyOf(this.f2321b, i);
            }
            System.arraycopy(aqk.f2321b, 0, this.f2321b, this.f2322c, aqk.f2322c);
            this.f2322c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo10767c();
        for (int i = 0; i < this.f2322c; i++) {
            if (obj.equals(Float.valueOf(this.f2321b[i]))) {
                System.arraycopy(this.f2321b, i + 1, this.f2321b, i, this.f2322c - i);
                this.f2322c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m3442b(int i) {
        if (i < 0 || i >= this.f2322c) {
            throw new IndexOutOfBoundsException(m3443c(i));
        }
    }

    /* renamed from: c */
    private final String m3443c(int i) {
        int i2 = this.f2322c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo10767c();
        m3442b(i);
        float f = this.f2321b[i];
        this.f2321b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        m3442b(i);
        float f = this.f2321b[i];
        if (i < this.f2322c - 1) {
            System.arraycopy(this.f2321b, i + 1, this.f2321b, i, this.f2322c - i);
        }
        this.f2322c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m3441a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= this.f2322c) {
            return new aqk(Arrays.copyOf(this.f2321b, i), this.f2322c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m3442b(i);
        return Float.valueOf(this.f2321b[i]);
    }

    static {
        aqk aqk = new aqk();
        f2320a = aqk;
        aqk.mo10766b();
    }
}
