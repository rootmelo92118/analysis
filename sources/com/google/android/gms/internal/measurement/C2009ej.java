package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ej */
final class C2009ej extends C1954ct<Integer> implements C2014eo<Integer>, C2056gc, RandomAccess {

    /* renamed from: a */
    private static final C2009ej f7744a;

    /* renamed from: b */
    private int[] f7745b;

    /* renamed from: c */
    private int f7746c;

    C2009ej() {
        this(new int[10], 0);
    }

    private C2009ej(int[] iArr, int i) {
        this.f7745b = iArr;
        this.f7746c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13579c();
        if (i2 >= i) {
            System.arraycopy(this.f7745b, i2, this.f7745b, i, this.f7746c - i2);
            this.f7746c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2009ej)) {
            return super.equals(obj);
        }
        C2009ej ejVar = (C2009ej) obj;
        if (this.f7746c != ejVar.f7746c) {
            return false;
        }
        int[] iArr = ejVar.f7745b;
        for (int i = 0; i < this.f7746c; i++) {
            if (this.f7745b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7746c; i2++) {
            i = (i * 31) + this.f7745b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int mo13830b(int i) {
        m9552d(i);
        return this.f7745b[i];
    }

    public final int size() {
        return this.f7746c;
    }

    /* renamed from: c */
    public final void mo13831c(int i) {
        m9551a(this.f7746c, i);
    }

    /* renamed from: a */
    private final void m9551a(int i, int i2) {
        mo13579c();
        if (i < 0 || i > this.f7746c) {
            throw new IndexOutOfBoundsException(m9553e(i));
        }
        if (this.f7746c < this.f7745b.length) {
            System.arraycopy(this.f7745b, i, this.f7745b, i + 1, this.f7746c - i);
        } else {
            int[] iArr = new int[(((this.f7746c * 3) / 2) + 1)];
            System.arraycopy(this.f7745b, 0, iArr, 0, i);
            System.arraycopy(this.f7745b, i, iArr, i + 1, this.f7746c - i);
            this.f7745b = iArr;
        }
        this.f7745b[i] = i2;
        this.f7746c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo13579c();
        C2010ek.m9560a(collection);
        if (!(collection instanceof C2009ej)) {
            return super.addAll(collection);
        }
        C2009ej ejVar = (C2009ej) collection;
        if (ejVar.f7746c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f7746c >= ejVar.f7746c) {
            int i = this.f7746c + ejVar.f7746c;
            if (i > this.f7745b.length) {
                this.f7745b = Arrays.copyOf(this.f7745b, i);
            }
            System.arraycopy(ejVar.f7745b, 0, this.f7745b, this.f7746c, ejVar.f7746c);
            this.f7746c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo13579c();
        for (int i = 0; i < this.f7746c; i++) {
            if (obj.equals(Integer.valueOf(this.f7745b[i]))) {
                System.arraycopy(this.f7745b, i + 1, this.f7745b, i, (this.f7746c - i) - 1);
                this.f7746c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m9552d(int i) {
        if (i < 0 || i >= this.f7746c) {
            throw new IndexOutOfBoundsException(m9553e(i));
        }
    }

    /* renamed from: e */
    private final String m9553e(int i) {
        int i2 = this.f7746c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13579c();
        m9552d(i);
        int i2 = this.f7745b[i];
        this.f7745b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo13579c();
        m9552d(i);
        int i2 = this.f7745b[i];
        if (i < this.f7746c - 1) {
            System.arraycopy(this.f7745b, i + 1, this.f7745b, i, (this.f7746c - i) - 1);
        }
        this.f7746c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m9551a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= this.f7746c) {
            return new C2009ej(Arrays.copyOf(this.f7745b, i), this.f7746c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo13830b(i));
    }

    static {
        C2009ej ejVar = new C2009ej();
        f7744a = ejVar;
        ejVar.mo13578b();
    }
}
