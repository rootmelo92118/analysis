package com.google.android.gms.internal.ads;

public final class ayi extends aza {

    /* renamed from: d */
    private static volatile Long f3119d;

    /* renamed from: e */
    private static final Object f3120e = new Object();

    public ayi(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (f3119d == null) {
            synchronized (f3120e) {
                if (f3119d == null) {
                    f3119d = (Long) this.f3149c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f3148b) {
            this.f3148b.f1881A = f3119d;
        }
    }
}
