package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ha */
public final class C2081ha {

    /* renamed from: a */
    private static final C2081ha f7854a = new C2081ha(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f7855b;

    /* renamed from: c */
    private int[] f7856c;

    /* renamed from: d */
    private Object[] f7857d;

    /* renamed from: e */
    private int f7858e;

    /* renamed from: f */
    private boolean f7859f;

    /* renamed from: a */
    public static C2081ha m9978a() {
        return f7854a;
    }

    /* renamed from: b */
    static C2081ha m9981b() {
        return new C2081ha();
    }

    /* renamed from: a */
    static C2081ha m9979a(C2081ha haVar, C2081ha haVar2) {
        int i = haVar.f7855b + haVar2.f7855b;
        int[] copyOf = Arrays.copyOf(haVar.f7856c, i);
        System.arraycopy(haVar2.f7856c, 0, copyOf, haVar.f7855b, haVar2.f7855b);
        Object[] copyOf2 = Arrays.copyOf(haVar.f7857d, i);
        System.arraycopy(haVar2.f7857d, 0, copyOf2, haVar.f7855b, haVar2.f7855b);
        return new C2081ha(i, copyOf, copyOf2, true);
    }

    private C2081ha() {
        this(0, new int[8], new Object[8], true);
    }

    private C2081ha(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f7858e = -1;
        this.f7855b = i;
        this.f7856c = iArr;
        this.f7857d = objArr;
        this.f7859f = z;
    }

    /* renamed from: c */
    public final void mo14006c() {
        this.f7859f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14003a(C2105hu huVar) {
        if (huVar.mo13727a() == C2003ei.C2008e.f7740k) {
            for (int i = this.f7855b - 1; i >= 0; i--) {
                huVar.mo13735a(this.f7856c[i] >>> 3, this.f7857d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f7855b; i2++) {
            huVar.mo13735a(this.f7856c[i2] >>> 3, this.f7857d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo14005b(C2105hu huVar) {
        if (this.f7855b != 0) {
            if (huVar.mo13727a() == C2003ei.C2008e.f7739j) {
                for (int i = 0; i < this.f7855b; i++) {
                    m9980a(this.f7856c[i], this.f7857d[i], huVar);
                }
                return;
            }
            for (int i2 = this.f7855b - 1; i2 >= 0; i2--) {
                m9980a(this.f7856c[i2], this.f7857d[i2], huVar);
            }
        }
    }

    /* renamed from: a */
    private static void m9980a(int i, Object obj, C2105hu huVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    huVar.mo13732a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    huVar.mo13753d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    huVar.mo13733a(i2, (C1958cx) obj);
                    return;
                case 3:
                    if (huVar.mo13727a() == C2003ei.C2008e.f7739j) {
                        huVar.mo13728a(i2);
                        ((C2081ha) obj).mo14005b(huVar);
                        huVar.mo13742b(i2);
                        return;
                    }
                    huVar.mo13742b(i2);
                    ((C2081ha) obj).mo14005b(huVar);
                    huVar.mo13728a(i2);
                    return;
                default:
                    throw new RuntimeException(C2015ep.m9576e());
            }
        } else {
            huVar.mo13752d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo14007d() {
        int i = this.f7858e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7855b; i3++) {
            i2 += C1976do.m9250d(this.f7856c[i3] >>> 3, (C1958cx) this.f7857d[i3]);
        }
        this.f7858e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo14008e() {
        int i;
        int i2 = this.f7858e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f7855b; i4++) {
            int i5 = this.f7856c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = C1976do.m9254e(i6, ((Long) this.f7857d[i4]).longValue());
                        break;
                    case 1:
                        i = C1976do.m9262g(i6, ((Long) this.f7857d[i4]).longValue());
                        break;
                    case 2:
                        i = C1976do.m9244c(i6, (C1958cx) this.f7857d[i4]);
                        break;
                    case 3:
                        i = (C1976do.m9253e(i6) << 1) + ((C2081ha) this.f7857d[i4]).mo14008e();
                        break;
                    default:
                        throw new IllegalStateException(C2015ep.m9576e());
                }
            } else {
                i = C1976do.m9269i(i6, ((Integer) this.f7857d[i4]).intValue());
            }
            i3 += i;
        }
        this.f7858e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2081ha)) {
            return false;
        }
        C2081ha haVar = (C2081ha) obj;
        if (this.f7855b == haVar.f7855b) {
            int[] iArr = this.f7856c;
            int[] iArr2 = haVar.f7856c;
            int i = this.f7855b;
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
                Object[] objArr = this.f7857d;
                Object[] objArr2 = haVar.f7857d;
                int i3 = this.f7855b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (this.f7855b + 527) * 31;
        int[] iArr = this.f7856c;
        int i2 = this.f7855b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i + i4) * 31;
        Object[] objArr = this.f7857d;
        int i7 = this.f7855b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14004a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f7855b; i2++) {
            C2046ft.m9711a(sb, i, String.valueOf(this.f7856c[i2] >>> 3), this.f7857d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14002a(int i, Object obj) {
        if (this.f7859f) {
            if (this.f7855b == this.f7856c.length) {
                int i2 = this.f7855b + (this.f7855b < 4 ? 8 : this.f7855b >> 1);
                this.f7856c = Arrays.copyOf(this.f7856c, i2);
                this.f7857d = Arrays.copyOf(this.f7857d, i2);
            }
            this.f7856c[this.f7855b] = i;
            this.f7857d[this.f7855b] = obj;
            this.f7855b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
