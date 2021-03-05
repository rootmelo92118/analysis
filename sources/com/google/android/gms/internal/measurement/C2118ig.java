package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ig */
final class C2118ig {

    /* renamed from: a */
    final int f7956a;

    /* renamed from: b */
    final byte[] f7957b;

    C2118ig(int i, byte[] bArr) {
        this.f7956a = i;
        this.f7957b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2118ig)) {
            return false;
        }
        C2118ig igVar = (C2118ig) obj;
        return this.f7956a == igVar.f7956a && Arrays.equals(this.f7957b, igVar.f7957b);
    }

    public final int hashCode() {
        return ((this.f7956a + 527) * 31) + Arrays.hashCode(this.f7957b);
    }
}
