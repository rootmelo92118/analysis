package com.google.android.gms.internal.ads;

public final class aym extends aza {

    /* renamed from: d */
    private static volatile Long f3124d;

    /* renamed from: e */
    private static final Object f3125e = new Object();

    public aym(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (f3124d == null) {
            synchronized (f3125e) {
                if (f3124d == null) {
                    f3124d = (Long) this.f3149c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f3148b) {
            this.f3148b.f1937l = f3124d;
        }
    }
}
