package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fe */
final class C2031fe extends C1954ct<Long> implements C2014eo<Long>, C2056gc, RandomAccess {

    /* renamed from: a */
    private static final C2031fe f7779a;

    /* renamed from: b */
    private long[] f7780b;

    /* renamed from: c */
    private int f7781c;

    C2031fe() {
        this(new long[10], 0);
    }

    private C2031fe(long[] jArr, int i) {
        this.f7780b = jArr;
        this.f7781c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13579c();
        if (i2 >= i) {
            System.arraycopy(this.f7780b, i2, this.f7780b, i, this.f7781c - i2);
            this.f7781c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2031fe)) {
            return super.equals(obj);
        }
        C2031fe feVar = (C2031fe) obj;
        if (this.f7781c != feVar.f7781c) {
            return false;
        }
        long[] jArr = feVar.f7780b;
        for (int i = 0; i < this.f7781c; i++) {
            if (this.f7780b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7781c; i2++) {
            i = (i * 31) + C2010ek.m9558a(this.f7780b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo13898b(int i) {
        m9653c(i);
        return this.f7780b[i];
    }

    public final int size() {
        return this.f7781c;
    }

    /* renamed from: a */
    public final void mo13897a(long j) {
        m9652a(this.f7781c, j);
    }

    /* renamed from: a */
    private final void m9652a(int i, long j) {
        mo13579c();
        if (i < 0 || i > this.f7781c) {
            throw new IndexOutOfBoundsException(m9654d(i));
        }
        if (this.f7781c < this.f7780b.length) {
            System.arraycopy(this.f7780b, i, this.f7780b, i + 1, this.f7781c - i);
        } else {
            long[] jArr = new long[(((this.f7781c * 3) / 2) + 1)];
            System.arraycopy(this.f7780b, 0, jArr, 0, i);
            System.arraycopy(this.f7780b, i, jArr, i + 1, this.f7781c - i);
            this.f7780b = jArr;
        }
        this.f7780b[i] = j;
        this.f7781c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo13579c();
        C2010ek.m9560a(collection);
        if (!(collection instanceof C2031fe)) {
            return super.addAll(collection);
        }
        C2031fe feVar = (C2031fe) collection;
        if (feVar.f7781c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f7781c >= feVar.f7781c) {
            int i = this.f7781c + feVar.f7781c;
            if (i > this.f7780b.length) {
                this.f7780b = Arrays.copyOf(this.f7780b, i);
            }
            System.arraycopy(feVar.f7780b, 0, this.f7780b, this.f7781c, feVar.f7781c);
            this.f7781c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo13579c();
        for (int i = 0; i < this.f7781c; i++) {
            if (obj.equals(Long.valueOf(this.f7780b[i]))) {
                System.arraycopy(this.f7780b, i + 1, this.f7780b, i, (this.f7781c - i) - 1);
                this.f7781c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m9653c(int i) {
        if (i < 0 || i >= this.f7781c) {
            throw new IndexOutOfBoundsException(m9654d(i));
        }
    }

    /* renamed from: d */
    private final String m9654d(int i) {
        int i2 = this.f7781c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13579c();
        m9653c(i);
        long j = this.f7780b[i];
        this.f7780b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo13579c();
        m9653c(i);
        long j = this.f7780b[i];
        if (i < this.f7781c - 1) {
            System.arraycopy(this.f7780b, i + 1, this.f7780b, i, (this.f7781c - i) - 1);
        }
        this.f7781c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m9652a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= this.f7781c) {
            return new C2031fe(Arrays.copyOf(this.f7780b, i), this.f7781c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo13898b(i));
    }

    static {
        C2031fe feVar = new C2031fe();
        f7779a = feVar;
        feVar.mo13578b();
    }
}
