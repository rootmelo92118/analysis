package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class aup {

    /* renamed from: a */
    final int f2588a;

    /* renamed from: b */
    final byte[] f2589b;

    aup(int i, byte[] bArr) {
        this.f2588a = i;
        this.f2589b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aup)) {
            return false;
        }
        aup aup = (aup) obj;
        return this.f2588a == aup.f2588a && Arrays.equals(this.f2589b, aup.f2589b);
    }

    public final int hashCode() {
        return ((this.f2588a + 527) * 31) + Arrays.hashCode(this.f2589b);
    }
}
