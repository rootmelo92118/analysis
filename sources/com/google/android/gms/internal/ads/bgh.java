package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bgh {

    /* renamed from: a */
    public static final bgh f4180a = new bgh(new bgf[0]);

    /* renamed from: b */
    public final int f4181b;

    /* renamed from: c */
    private final bgf[] f4182c;

    /* renamed from: d */
    private int f4183d;

    public bgh(bgf... bgfArr) {
        this.f4182c = bgfArr;
        this.f4181b = bgfArr.length;
    }

    /* renamed from: a */
    public final bgf mo11894a(int i) {
        return this.f4182c[i];
    }

    /* renamed from: a */
    public final int mo11893a(bgf bgf) {
        for (int i = 0; i < this.f4181b; i++) {
            if (this.f4182c[i] == bgf) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f4183d == 0) {
            this.f4183d = Arrays.hashCode(this.f4182c);
        }
        return this.f4183d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgh bgh = (bgh) obj;
        return this.f4181b == bgh.f4181b && Arrays.equals(this.f4182c, bgh.f4182c);
    }
}
