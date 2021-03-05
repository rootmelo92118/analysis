package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bgf {

    /* renamed from: a */
    public final int f4177a;

    /* renamed from: b */
    private final zzfs[] f4178b;

    /* renamed from: c */
    private int f4179c;

    public bgf(zzfs... zzfsArr) {
        bjy.m5691b(zzfsArr.length > 0);
        this.f4178b = zzfsArr;
        this.f4177a = zzfsArr.length;
    }

    /* renamed from: a */
    public final zzfs mo11889a(int i) {
        return this.f4178b[i];
    }

    /* renamed from: a */
    public final int mo11888a(zzfs zzfs) {
        for (int i = 0; i < this.f4178b.length; i++) {
            if (zzfs == this.f4178b[i]) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f4179c == 0) {
            this.f4179c = Arrays.hashCode(this.f4178b) + 527;
        }
        return this.f4179c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgf bgf = (bgf) obj;
        return this.f4177a == bgf.f4177a && Arrays.equals(this.f4178b, bgf.f4178b);
    }
}
