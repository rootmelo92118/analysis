package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bix {

    /* renamed from: a */
    public final int f4432a;

    /* renamed from: b */
    private final biv[] f4433b;

    /* renamed from: c */
    private int f4434c;

    public bix(biv... bivArr) {
        this.f4433b = bivArr;
        this.f4432a = bivArr.length;
    }

    /* renamed from: a */
    public final biv mo11995a(int i) {
        return this.f4433b[i];
    }

    /* renamed from: a */
    public final biv[] mo11996a() {
        return (biv[]) this.f4433b.clone();
    }

    public final int hashCode() {
        if (this.f4434c == 0) {
            this.f4434c = Arrays.hashCode(this.f4433b) + 527;
        }
        return this.f4434c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4433b, ((bix) obj).f4433b);
    }
}
