package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.dr */
final class C1984dr extends C1954ct<Double> implements C2014eo<Double>, C2056gc, RandomAccess {

    /* renamed from: a */
    private static final C1984dr f7634a;

    /* renamed from: b */
    private double[] f7635b;

    /* renamed from: c */
    private int f7636c;

    C1984dr() {
        this(new double[10], 0);
    }

    private C1984dr(double[] dArr, int i) {
        this.f7635b = dArr;
        this.f7636c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13579c();
        if (i2 >= i) {
            System.arraycopy(this.f7635b, i2, this.f7635b, i, this.f7636c - i2);
            this.f7636c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1984dr)) {
            return super.equals(obj);
        }
        C1984dr drVar = (C1984dr) obj;
        if (this.f7636c != drVar.f7636c) {
            return false;
        }
        double[] dArr = drVar.f7635b;
        for (int i = 0; i < this.f7636c; i++) {
            if (Double.doubleToLongBits(this.f7635b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7636c; i2++) {
            i = (i * 31) + C2010ek.m9558a(Double.doubleToLongBits(this.f7635b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f7636c;
    }

    /* renamed from: a */
    public final void mo13768a(double d) {
        m9444a(this.f7636c, d);
    }

    /* renamed from: a */
    private final void m9444a(int i, double d) {
        mo13579c();
        if (i < 0 || i > this.f7636c) {
            throw new IndexOutOfBoundsException(m9446c(i));
        }
        if (this.f7636c < this.f7635b.length) {
            System.arraycopy(this.f7635b, i, this.f7635b, i + 1, this.f7636c - i);
        } else {
            double[] dArr = new double[(((this.f7636c * 3) / 2) + 1)];
            System.arraycopy(this.f7635b, 0, dArr, 0, i);
            System.arraycopy(this.f7635b, i, dArr, i + 1, this.f7636c - i);
            this.f7635b = dArr;
        }
        this.f7635b[i] = d;
        this.f7636c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo13579c();
        C2010ek.m9560a(collection);
        if (!(collection instanceof C1984dr)) {
            return super.addAll(collection);
        }
        C1984dr drVar = (C1984dr) collection;
        if (drVar.f7636c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f7636c >= drVar.f7636c) {
            int i = this.f7636c + drVar.f7636c;
            if (i > this.f7635b.length) {
                this.f7635b = Arrays.copyOf(this.f7635b, i);
            }
            System.arraycopy(drVar.f7635b, 0, this.f7635b, this.f7636c, drVar.f7636c);
            this.f7636c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo13579c();
        for (int i = 0; i < this.f7636c; i++) {
            if (obj.equals(Double.valueOf(this.f7635b[i]))) {
                System.arraycopy(this.f7635b, i + 1, this.f7635b, i, (this.f7636c - i) - 1);
                this.f7636c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m9445b(int i) {
        if (i < 0 || i >= this.f7636c) {
            throw new IndexOutOfBoundsException(m9446c(i));
        }
    }

    /* renamed from: c */
    private final String m9446c(int i) {
        int i2 = this.f7636c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo13579c();
        m9445b(i);
        double d = this.f7635b[i];
        this.f7635b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo13579c();
        m9445b(i);
        double d = this.f7635b[i];
        if (i < this.f7636c - 1) {
            System.arraycopy(this.f7635b, i + 1, this.f7635b, i, (this.f7636c - i) - 1);
        }
        this.f7636c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m9444a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= this.f7636c) {
            return new C1984dr(Arrays.copyOf(this.f7635b, i), this.f7636c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m9445b(i);
        return Double.valueOf(this.f7635b[i]);
    }

    static {
        C1984dr drVar = new C1984dr();
        f7634a = drVar;
        drVar.mo13578b();
    }
}
