package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bcr {

    /* renamed from: a */
    public final int f3530a = 1;

    /* renamed from: b */
    public final byte[] f3531b;

    public bcr(int i, byte[] bArr) {
        this.f3531b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bcr bcr = (bcr) obj;
        return this.f3530a == bcr.f3530a && Arrays.equals(this.f3531b, bcr.f3531b);
    }

    public final int hashCode() {
        return (this.f3530a * 31) + Arrays.hashCode(this.f3531b);
    }
}
