package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.cy */
final class C1959cy extends C1962da {

    /* renamed from: a */
    private int f7587a = 0;

    /* renamed from: b */
    private final int f7588b = this.f7589c.mo13595a();

    /* renamed from: c */
    private final /* synthetic */ C1958cx f7589c;

    C1959cy(C1958cx cxVar) {
        this.f7589c = cxVar;
    }

    public final boolean hasNext() {
        return this.f7587a < this.f7588b;
    }

    /* renamed from: a */
    public final byte mo13608a() {
        int i = this.f7587a;
        if (i < this.f7588b) {
            this.f7587a = i + 1;
            return this.f7589c.mo13600b(i);
        }
        throw new NoSuchElementException();
    }
}
