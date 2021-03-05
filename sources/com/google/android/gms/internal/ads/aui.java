package com.google.android.gms.internal.ads;

public final class aui implements Cloneable {

    /* renamed from: a */
    private static final auj f2571a = new auj();

    /* renamed from: b */
    private boolean f2572b;

    /* renamed from: c */
    private int[] f2573c;

    /* renamed from: d */
    private auj[] f2574d;

    /* renamed from: e */
    private int f2575e;

    aui() {
        this(10);
    }

    private aui(int i) {
        this.f2572b = false;
        int c = m4169c(i);
        this.f2573c = new int[c];
        this.f2574d = new auj[c];
        this.f2575e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final auj mo11287a(int i) {
        int d = m4170d(i);
        if (d < 0 || this.f2574d[d] == f2571a) {
            return null;
        }
        return this.f2574d[d];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11288a(int i, auj auj) {
        int d = m4170d(i);
        if (d >= 0) {
            this.f2574d[d] = auj;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f2575e || this.f2574d[i2] != f2571a) {
            if (this.f2575e >= this.f2573c.length) {
                int c = m4169c(this.f2575e + 1);
                int[] iArr = new int[c];
                auj[] aujArr = new auj[c];
                System.arraycopy(this.f2573c, 0, iArr, 0, this.f2573c.length);
                System.arraycopy(this.f2574d, 0, aujArr, 0, this.f2574d.length);
                this.f2573c = iArr;
                this.f2574d = aujArr;
            }
            if (this.f2575e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f2573c, i2, this.f2573c, i3, this.f2575e - i2);
                System.arraycopy(this.f2574d, i2, this.f2574d, i3, this.f2575e - i2);
            }
            this.f2573c[i2] = i;
            this.f2574d[i2] = auj;
            this.f2575e++;
            return;
        }
        this.f2573c[i2] = i;
        this.f2574d[i2] = auj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11286a() {
        return this.f2575e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final auj mo11289b(int i) {
        return this.f2574d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aui)) {
            return false;
        }
        aui aui = (aui) obj;
        if (this.f2575e != aui.f2575e) {
            return false;
        }
        int[] iArr = this.f2573c;
        int[] iArr2 = aui.f2573c;
        int i = this.f2575e;
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
            auj[] aujArr = this.f2574d;
            auj[] aujArr2 = aui.f2574d;
            int i3 = this.f2575e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!aujArr[i4].equals(aujArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f2575e; i2++) {
            i = (((i * 31) + this.f2573c[i2]) * 31) + this.f2574d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m4169c(int i) {
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
    private final int m4170d(int i) {
        int i2 = this.f2575e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f2573c[i4];
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
        int i = this.f2575e;
        aui aui = new aui(i);
        System.arraycopy(this.f2573c, 0, aui.f2573c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2574d[i2] != null) {
                aui.f2574d[i2] = (auj) this.f2574d[i2].clone();
            }
        }
        aui.f2575e = i;
        return aui;
    }
}
