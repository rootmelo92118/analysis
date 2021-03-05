package com.google.android.gms.internal.ads;

public final class ayo extends aza {

    /* renamed from: d */
    private static volatile String f3127d;

    /* renamed from: e */
    private static final Object f3128e = new Object();

    public ayo(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1906a = "E";
        if (f3127d == null) {
            synchronized (f3128e) {
                if (f3127d == null) {
                    f3127d = (String) this.f3149c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f3148b) {
            this.f3148b.f1906a = f3127d;
        }
    }
}
