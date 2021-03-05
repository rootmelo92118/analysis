package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import java.util.Arrays;

public final class ath {

    /* renamed from: a */
    private static final ath f2468a = new ath(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f2469b;

    /* renamed from: c */
    private int[] f2470c;

    /* renamed from: d */
    private Object[] f2471d;

    /* renamed from: e */
    private int f2472e;

    /* renamed from: f */
    private boolean f2473f;

    /* renamed from: a */
    public static ath m3874a() {
        return f2468a;
    }

    /* renamed from: b */
    static ath m3877b() {
        return new ath();
    }

    /* renamed from: a */
    static ath m3875a(ath ath, ath ath2) {
        int i = ath.f2469b + ath2.f2469b;
        int[] copyOf = Arrays.copyOf(ath.f2470c, i);
        System.arraycopy(ath2.f2470c, 0, copyOf, ath.f2469b, ath2.f2469b);
        Object[] copyOf2 = Arrays.copyOf(ath.f2471d, i);
        System.arraycopy(ath2.f2471d, 0, copyOf2, ath.f2469b, ath2.f2469b);
        return new ath(i, copyOf, copyOf2, true);
    }

    private ath() {
        this(0, new int[8], new Object[8], true);
    }

    private ath(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2472e = -1;
        this.f2469b = i;
        this.f2470c = iArr;
        this.f2471d = objArr;
        this.f2473f = z;
    }

    /* renamed from: c */
    public final void mo11189c() {
        this.f2473f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11186a(auc auc) {
        if (auc.mo10926a() == aqn.C1082e.f2340k) {
            for (int i = this.f2469b - 1; i >= 0; i--) {
                auc.mo10934a(this.f2470c[i] >>> 3, this.f2471d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f2469b; i2++) {
            auc.mo10934a(this.f2470c[i2] >>> 3, this.f2471d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo11188b(auc auc) {
        if (this.f2469b != 0) {
            if (auc.mo10926a() == aqn.C1082e.f2339j) {
                for (int i = 0; i < this.f2469b; i++) {
                    m3876a(this.f2470c[i], this.f2471d[i], auc);
                }
                return;
            }
            for (int i2 = this.f2469b - 1; i2 >= 0; i2--) {
                m3876a(this.f2470c[i2], this.f2471d[i2], auc);
            }
        }
    }

    /* renamed from: a */
    private static void m3876a(int i, Object obj, auc auc) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    auc.mo10931a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    auc.mo10952d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    auc.mo10932a(i2, (apc) obj);
                    return;
                case 3:
                    if (auc.mo10926a() == aqn.C1082e.f2339j) {
                        auc.mo10927a(i2);
                        ((ath) obj).mo11188b(auc);
                        auc.mo10941b(i2);
                        return;
                    }
                    auc.mo10941b(i2);
                    ((ath) obj).mo11188b(auc);
                    auc.mo10927a(i2);
                    return;
                default:
                    throw new RuntimeException(aqv.m3512f());
            }
        } else {
            auc.mo10951d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo11190d() {
        int i = this.f2472e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2469b; i3++) {
            i2 += apt.m3169d(this.f2470c[i3] >>> 3, (apc) this.f2471d[i3]);
        }
        this.f2472e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo11191e() {
        int i;
        int i2 = this.f2472e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2469b; i4++) {
            int i5 = this.f2470c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = apt.m3174e(i6, ((Long) this.f2471d[i4]).longValue());
                        break;
                    case 1:
                        i = apt.m3182g(i6, ((Long) this.f2471d[i4]).longValue());
                        break;
                    case 2:
                        i = apt.m3164c(i6, (apc) this.f2471d[i4]);
                        break;
                    case 3:
                        i = (apt.m3173e(i6) << 1) + ((ath) this.f2471d[i4]).mo11191e();
                        break;
                    default:
                        throw new IllegalStateException(aqv.m3512f());
                }
            } else {
                i = apt.m3189i(i6, ((Integer) this.f2471d[i4]).intValue());
            }
            i3 += i;
        }
        this.f2472e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ath)) {
            return false;
        }
        ath ath = (ath) obj;
        if (this.f2469b == ath.f2469b) {
            int[] iArr = this.f2470c;
            int[] iArr2 = ath.f2470c;
            int i = this.f2469b;
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
                Object[] objArr = this.f2471d;
                Object[] objArr2 = ath.f2471d;
                int i3 = this.f2469b;
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
        int i = (this.f2469b + 527) * 31;
        int[] iArr = this.f2470c;
        int i2 = this.f2469b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i + i4) * 31;
        Object[] objArr = this.f2471d;
        int i7 = this.f2469b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11187a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f2469b; i2++) {
            arz.m3613a(sb, i, String.valueOf(this.f2470c[i2] >>> 3), this.f2471d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11185a(int i, Object obj) {
        if (this.f2473f) {
            if (this.f2469b == this.f2470c.length) {
                int i2 = this.f2469b + (this.f2469b < 4 ? 8 : this.f2469b >> 1);
                this.f2470c = Arrays.copyOf(this.f2470c, i2);
                this.f2471d = Arrays.copyOf(this.f2471d, i2);
            }
            this.f2470c[this.f2469b] = i;
            this.f2471d[this.f2469b] = obj;
            this.f2469b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
