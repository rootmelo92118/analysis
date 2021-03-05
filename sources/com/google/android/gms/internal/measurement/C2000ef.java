package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ef */
final class C2000ef extends C1954ct<Float> implements C2014eo<Float>, C2056gc, RandomAccess {

    /* renamed from: a */
    private static final C2000ef f7720a;

    /* renamed from: b */
    private float[] f7721b;

    /* renamed from: c */
    private int f7722c;

    C2000ef() {
        this(new float[10], 0);
    }

    private C2000ef(float[] fArr, int i) {
        this.f7721b = fArr;
        this.f7722c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13579c();
        if (i2 >= i) {
            System.arraycopy(this.f7721b, i2, this.f7721b, i, this.f7722c - i2);
            this.f7722c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2000ef)) {
            return super.equals(obj);
        }
        C2000ef efVar = (C2000ef) obj;
        if (this.f7722c != efVar.f7722c) {
            return false;
        }
        float[] fArr = efVar.f7721b;
        for (int i = 0; i < this.f7722c; i++) {
            if (Float.floatToIntBits(this.f7721b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7722c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f7721b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f7722c;
    }

    /* renamed from: a */
    public final void mo13806a(float f) {
        m9511a(this.f7722c, f);
    }

    /* renamed from: a */
    private final void m9511a(int i, float f) {
        mo13579c();
        if (i < 0 || i > this.f7722c) {
            throw new IndexOutOfBoundsException(m9513c(i));
        }
        if (this.f7722c < this.f7721b.length) {
            System.arraycopy(this.f7721b, i, this.f7721b, i + 1, this.f7722c - i);
        } else {
            float[] fArr = new float[(((this.f7722c * 3) / 2) + 1)];
            System.arraycopy(this.f7721b, 0, fArr, 0, i);
            System.arraycopy(this.f7721b, i, fArr, i + 1, this.f7722c - i);
            this.f7721b = fArr;
        }
        this.f7721b[i] = f;
        this.f7722c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo13579c();
        C2010ek.m9560a(collection);
        if (!(collection instanceof C2000ef)) {
            return super.addAll(collection);
        }
        C2000ef efVar = (C2000ef) collection;
        if (efVar.f7722c == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f7722c >= efVar.f7722c) {
            int i = this.f7722c + efVar.f7722c;
            if (i > this.f7721b.length) {
                this.f7721b = Arrays.copyOf(this.f7721b, i);
            }
            System.arraycopy(efVar.f7721b, 0, this.f7721b, this.f7722c, efVar.f7722c);
            this.f7722c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo13579c();
        for (int i = 0; i < this.f7722c; i++) {
            if (obj.equals(Float.valueOf(this.f7721b[i]))) {
                System.arraycopy(this.f7721b, i + 1, this.f7721b, i, (this.f7722c - i) - 1);
                this.f7722c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m9512b(int i) {
        if (i < 0 || i >= this.f7722c) {
            throw new IndexOutOfBoundsException(m9513c(i));
        }
    }

    /* renamed from: c */
    private final String m9513c(int i) {
        int i2 = this.f7722c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo13579c();
        m9512b(i);
        float f = this.f7721b[i];
        this.f7721b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo13579c();
        m9512b(i);
        float f = this.f7721b[i];
        if (i < this.f7722c - 1) {
            System.arraycopy(this.f7721b, i + 1, this.f7721b, i, (this.f7722c - i) - 1);
        }
        this.f7722c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m9511a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= this.f7722c) {
            return new C2000ef(Arrays.copyOf(this.f7721b, i), this.f7722c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m9512b(i);
        return Float.valueOf(this.f7721b[i]);
    }

    static {
        C2000ef efVar = new C2000ef();
        f7720a = efVar;
        efVar.mo13578b();
    }
}
