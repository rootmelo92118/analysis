package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class apw extends aow<Double> implements aqu<Double>, asi, RandomAccess {

    /* renamed from: a */
    private static final apw f2227a;

    /* renamed from: b */
    private double[] f2228b;

    /* renamed from: c */
    private int f2229c;

    apw() {
        this(new double[10], 0);
    }

    private apw(double[] dArr, int i) {
        this.f2228b = dArr;
        this.f2229c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo10767c();
        if (i2 >= i) {
            System.arraycopy(this.f2228b, i2, this.f2228b, i, this.f2229c - i2);
            this.f2229c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apw)) {
            return super.equals(obj);
        }
        apw apw = (apw) obj;
        if (this.f2229c != apw.f2229c) {
            return false;
        }
        double[] dArr = apw.f2228b;
        for (int i = 0; i < this.f2229c; i++) {
            if (this.f2228b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2229c; i2++) {
            i = (i * 31) + aqp.m3493a(Double.doubleToLongBits(this.f2228b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f2229c;
    }

    /* renamed from: a */
    public final void mo10967a(double d) {
        m3365a(this.f2229c, d);
    }

    /* renamed from: a */
    private final void m3365a(int i, double d) {
        mo10767c();
        if (i < 0 || i > this.f2229c) {
            throw new IndexOutOfBoundsException(m3367c(i));
        }
        if (this.f2229c < this.f2228b.length) {
            System.arraycopy(this.f2228b, i, this.f2228b, i + 1, this.f2229c - i);
        } else {
            double[] dArr = new double[(((this.f2229c * 3) / 2) + 1)];
            System.arraycopy(this.f2228b, 0, dArr, 0, i);
            System.arraycopy(this.f2228b, i, dArr, i + 1, this.f2229c - i);
            this.f2228b = dArr;
        }
        this.f2228b[i] = d;
        this.f2229c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo10767c();
        aqp.m3495a(collection);
        if (!(collection instanceof apw)) {
            return super.addAll(collection);
        }
        apw apw = (apw) collection;
        if (apw.f2229c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2229c >= apw.f2229c) {
            int i = this.f2229c + apw.f2229c;
            if (i > this.f2228b.length) {
                this.f2228b = Arrays.copyOf(this.f2228b, i);
            }
            System.arraycopy(apw.f2228b, 0, this.f2228b, this.f2229c, apw.f2229c);
            this.f2229c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo10767c();
        for (int i = 0; i < this.f2229c; i++) {
            if (obj.equals(Double.valueOf(this.f2228b[i]))) {
                System.arraycopy(this.f2228b, i + 1, this.f2228b, i, this.f2229c - i);
                this.f2229c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m3366b(int i) {
        if (i < 0 || i >= this.f2229c) {
            throw new IndexOutOfBoundsException(m3367c(i));
        }
    }

    /* renamed from: c */
    private final String m3367c(int i) {
        int i2 = this.f2229c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo10767c();
        m3366b(i);
        double d = this.f2228b[i];
        this.f2228b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        m3366b(i);
        double d = this.f2228b[i];
        if (i < this.f2229c - 1) {
            System.arraycopy(this.f2228b, i + 1, this.f2228b, i, this.f2229c - i);
        }
        this.f2229c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m3365a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= this.f2229c) {
            return new apw(Arrays.copyOf(this.f2228b, i), this.f2229c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m3366b(i);
        return Double.valueOf(this.f2228b[i]);
    }

    static {
        apw apw = new apw();
        f2227a = apw;
        apw.mo10766b();
    }
}
