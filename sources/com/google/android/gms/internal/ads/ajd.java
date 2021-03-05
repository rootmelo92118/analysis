package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ajd<P> {

    /* renamed from: a */
    private final P f1851a;

    /* renamed from: b */
    private final byte[] f1852b;

    /* renamed from: c */
    private final amd f1853c;

    /* renamed from: d */
    private final amw f1854d;

    public ajd(P p, byte[] bArr, amd amd, amw amw) {
        this.f1851a = p;
        this.f1852b = Arrays.copyOf(bArr, bArr.length);
        this.f1853c = amd;
        this.f1854d = amw;
    }

    /* renamed from: a */
    public final P mo10608a() {
        return this.f1851a;
    }

    /* renamed from: b */
    public final byte[] mo10609b() {
        if (this.f1852b == null) {
            return null;
        }
        return Arrays.copyOf(this.f1852b, this.f1852b.length);
    }
}
