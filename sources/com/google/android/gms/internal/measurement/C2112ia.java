package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ia */
public final class C2112ia implements Cloneable {

    /* renamed from: a */
    private static final C2113ib f7944a = new C2113ib();

    /* renamed from: b */
    private boolean f7945b;

    /* renamed from: c */
    private int[] f7946c;

    /* renamed from: d */
    private C2113ib[] f7947d;

    /* renamed from: e */
    private int f7948e;

    C2112ia() {
        this(10);
    }

    private C2112ia(int i) {
        this.f7945b = false;
        int c = m10254c(i);
        this.f7946c = new int[c];
        this.f7947d = new C2113ib[c];
        this.f7948e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2113ib mo14092a(int i) {
        int d = m10255d(i);
        if (d < 0 || this.f7947d[d] == f7944a) {
            return null;
        }
        return this.f7947d[d];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14093a(int i, C2113ib ibVar) {
        int d = m10255d(i);
        if (d >= 0) {
            this.f7947d[d] = ibVar;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f7948e || this.f7947d[i2] != f7944a) {
            if (this.f7948e >= this.f7946c.length) {
                int c = m10254c(this.f7948e + 1);
                int[] iArr = new int[c];
                C2113ib[] ibVarArr = new C2113ib[c];
                System.arraycopy(this.f7946c, 0, iArr, 0, this.f7946c.length);
                System.arraycopy(this.f7947d, 0, ibVarArr, 0, this.f7947d.length);
                this.f7946c = iArr;
                this.f7947d = ibVarArr;
            }
            if (this.f7948e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f7946c, i2, this.f7946c, i3, this.f7948e - i2);
                System.arraycopy(this.f7947d, i2, this.f7947d, i3, this.f7948e - i2);
            }
            this.f7946c[i2] = i;
            this.f7947d[i2] = ibVar;
            this.f7948e++;
            return;
        }
        this.f7946c[i2] = i;
        this.f7947d[i2] = ibVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14091a() {
        return this.f7948e;
    }

    /* renamed from: b */
    public final boolean mo14095b() {
        return this.f7948e == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2113ib mo14094b(int i) {
        return this.f7947d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2112ia)) {
            return false;
        }
        C2112ia iaVar = (C2112ia) obj;
        if (this.f7948e != iaVar.f7948e) {
            return false;
        }
        int[] iArr = this.f7946c;
        int[] iArr2 = iaVar.f7946c;
        int i = this.f7948e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C2113ib[] ibVarArr = this.f7947d;
            C2113ib[] ibVarArr2 = iaVar.f7947d;
            int i3 = this.f7948e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!ibVarArr[i4].equals(ibVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f7948e; i2++) {
            i = (((i * 31) + this.f7946c[i2]) * 31) + this.f7947d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m10254c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m10255d(int i) {
        int i2 = this.f7948e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f7946c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f7948e;
        C2112ia iaVar = new C2112ia(i);
        System.arraycopy(this.f7946c, 0, iaVar.f7946c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7947d[i2] != null) {
                iaVar.f7947d[i2] = (C2113ib) this.f7947d[i2].clone();
            }
        }
        iaVar.f7948e = i;
        return iaVar;
    }
}
