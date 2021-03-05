package com.google.android.gms.internal.ads;

public final class ayh extends aza {
    public ayh(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1929d = -1L;
        this.f3148b.f1930e = -1L;
        int[] iArr = (int[]) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a()});
        synchronized (this.f3148b) {
            this.f3148b.f1929d = Long.valueOf((long) iArr[0]);
            this.f3148b.f1930e = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f3148b.f1894N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
