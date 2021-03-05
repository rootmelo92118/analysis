package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class bjd implements bje {

    /* renamed from: a */
    private final byte[] f4442a;

    /* renamed from: b */
    private Uri f4443b;

    /* renamed from: c */
    private int f4444c;

    /* renamed from: d */
    private int f4445d;

    public bjd(byte[] bArr) {
        bjy.m5688a(bArr);
        bjy.m5689a(bArr.length > 0);
        this.f4442a = bArr;
    }

    /* renamed from: a */
    public final long mo10212a(bji bji) {
        this.f4443b = bji.f4453a;
        this.f4444c = (int) bji.f4456d;
        this.f4445d = (int) (bji.f4457e == -1 ? ((long) this.f4442a.length) - bji.f4456d : bji.f4457e);
        if (this.f4445d > 0 && this.f4444c + this.f4445d <= this.f4442a.length) {
            return (long) this.f4445d;
        }
        int i = this.f4444c;
        long j = bji.f4457e;
        int length = this.f4442a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final int mo10211a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f4445d == 0) {
            return -1;
        }
        int min = Math.min(i2, this.f4445d);
        System.arraycopy(this.f4442a, this.f4444c, bArr, i, min);
        this.f4444c += min;
        this.f4445d -= min;
        return min;
    }

    /* renamed from: b */
    public final Uri mo10214b() {
        return this.f4443b;
    }

    /* renamed from: a */
    public final void mo10213a() {
        this.f4443b = null;
    }
}
