package com.google.android.gms.internal.ads;

public final class ayv extends aza {

    /* renamed from: d */
    private static volatile Long f3134d;

    /* renamed from: e */
    private static final Object f3135e = new Object();

    public ayv(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (f3134d == null) {
            synchronized (f3135e) {
                if (f3134d == null) {
                    f3134d = (Long) this.f3149c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f3148b) {
            this.f3148b.f1943r = f3134d;
        }
    }
}
