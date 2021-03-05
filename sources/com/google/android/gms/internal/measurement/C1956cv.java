package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.cv */
final class C1956cv extends C1954ct<Boolean> implements C2014eo<Boolean>, C2056gc, RandomAccess {

    /* renamed from: a */
    private static final C1956cv f7580a;

    /* renamed from: b */
    private boolean[] f7581b;

    /* renamed from: c */
    private int f7582c;

    C1956cv() {
        this(new boolean[10], 0);
    }

    private C1956cv(boolean[] zArr, int i) {
        this.f7581b = zArr;
        this.f7582c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13579c();
        if (i2 >= i) {
            System.arraycopy(this.f7581b, i2, this.f7581b, i, this.f7582c - i2);
            this.f7582c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1956cv)) {
            return super.equals(obj);
        }
        C1956cv cvVar = (C1956cv) obj;
        if (this.f7582c != cvVar.f7582c) {
            return false;
        }
        boolean[] zArr = cvVar.f7581b;
        for (int i = 0; i < this.f7582c; i++) {
            if (this.f7581b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7582c; i2++) {
            i = (i * 31) + C2010ek.m9559a(this.f7581b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f7582c;
    }

    /* renamed from: a */
    public final void mo13589a(boolean z) {
        m9067a(this.f7582c, z);
    }

    /* renamed from: a */
    private final void m9067a(int i, boolean z) {
        mo13579c();
        if (i < 0 || i > this.f7582c) {
            throw new IndexOutOfBoundsException(m9069c(i));
        }
        if (this.f7582c < this.f7581b.length) {
            System.arraycopy(this.f7581b, i, this.f7581b, i + 1, this.f7582c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f7582c * 3) / 2) + 1)];
            System.arraycopy(this.f7581b, 0, zArr, 0, i);
            System.arraycopy(this.f7581b, i, zArr, i + 1, this.f7582c - i);
            this.f7581b = zArr;
        }
        this.f7581b[i] = z;
        this.f7582c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo13579c();
        C2010ek.m9560a(collection);
        if (!(collection instanceof C1956cv)) {
            return super.addAll(collection);
        }
        C1956cv cvVar = (C1956cv) collection;
        if (cvVar.f7582c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f7582c >= cvVar.f7582c) {
            int i = this.f7582c + cvVar.f7582c;
            if (i > this.f7581b.length) {
                this.f7581b = Arrays.copyOf(this.f7581b, i);
            }
            System.arraycopy(cvVar.f7581b, 0, this.f7581b, this.f7582c, cvVar.f7582c);
            this.f7582c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo13579c();
        for (int i = 0; i < this.f7582c; i++) {
            if (obj.equals(Boolean.valueOf(this.f7581b[i]))) {
                System.arraycopy(this.f7581b, i + 1, this.f7581b, i, (this.f7582c - i) - 1);
                this.f7582c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m9068b(int i) {
        if (i < 0 || i >= this.f7582c) {
            throw new IndexOutOfBoundsException(m9069c(i));
        }
    }

    /* renamed from: c */
    private final String m9069c(int i) {
        int i2 = this.f7582c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13579c();
        m9068b(i);
        boolean z = this.f7581b[i];
        this.f7581b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo13579c();
        m9068b(i);
        boolean z = this.f7581b[i];
        if (i < this.f7582c - 1) {
            System.arraycopy(this.f7581b, i + 1, this.f7581b, i, (this.f7582c - i) - 1);
        }
        this.f7582c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m9067a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= this.f7582c) {
            return new C1956cv(Arrays.copyOf(this.f7581b, i), this.f7582c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m9068b(i);
        return Boolean.valueOf(this.f7581b[i]);
    }

    static {
        C1956cv cvVar = new C1956cv();
        f7580a = cvVar;
        cvVar.mo13578b();
    }
}
