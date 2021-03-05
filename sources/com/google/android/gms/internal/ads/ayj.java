package com.google.android.gms.internal.ads;

public final class ayj extends aza {

    /* renamed from: d */
    private long f3121d;

    public ayj(axq axq, String str, String str2, akd akd, long j, int i, int i2) {
        super(axq, str, str2, akd, i, 25);
        this.f3121d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        long longValue = ((Long) this.f3149c.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f3148b) {
            this.f3148b.f1904X = Long.valueOf(longValue);
            if (this.f3121d != 0) {
                this.f3148b.f1935j = Long.valueOf(longValue - this.f3121d);
                this.f3148b.f1938m = Long.valueOf(this.f3121d);
            }
        }
    }
}
