package com.google.android.gms.internal.ads;

import android.support.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.InputStream;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.ads.mz */
final class C1502mz extends FilterInputStream {

    /* renamed from: a */
    private final long f5740a;

    /* renamed from: b */
    private long f5741b;

    C1502mz(InputStream inputStream, long j) {
        super(inputStream);
        this.f5740a = j;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f5741b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f5741b += (long) read;
        }
        return read;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo12805a() {
        return this.f5740a - this.f5741b;
    }
}
