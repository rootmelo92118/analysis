package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import java.io.InputStream;

public final class bjh extends InputStream {

    /* renamed from: a */
    private final bje f4447a;

    /* renamed from: b */
    private final bji f4448b;

    /* renamed from: c */
    private final byte[] f4449c;

    /* renamed from: d */
    private boolean f4450d = false;

    /* renamed from: e */
    private boolean f4451e = false;

    /* renamed from: f */
    private long f4452f;

    public bjh(bje bje, bji bji) {
        this.f4447a = bje;
        this.f4448b = bji;
        this.f4449c = new byte[1];
    }

    /* renamed from: a */
    public final long mo12008a() {
        return this.f4452f;
    }

    /* renamed from: b */
    public final void mo12009b() {
        m5635c();
    }

    public final int read() {
        if (read(this.f4449c) == -1) {
            return -1;
        }
        return this.f4449c[0] & 255;
    }

    public final int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(@NonNull byte[] bArr, int i, int i2) {
        bjy.m5691b(!this.f4451e);
        m5635c();
        int a = this.f4447a.mo10211a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f4452f += (long) a;
        return a;
    }

    public final void close() {
        if (!this.f4451e) {
            this.f4447a.mo10213a();
            this.f4451e = true;
        }
    }

    /* renamed from: c */
    private final void m5635c() {
        if (!this.f4450d) {
            this.f4447a.mo10212a(this.f4448b);
            this.f4450d = true;
        }
    }
}
