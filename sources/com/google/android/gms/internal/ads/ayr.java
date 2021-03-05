package com.google.android.gms.internal.ads;

public final class ayr extends aza {

    /* renamed from: d */
    private final boolean f3130d;

    public ayr(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 61);
        this.f3130d = axq.mo11383j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        long longValue = ((Long) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a(), Boolean.valueOf(this.f3130d)})).longValue();
        synchronized (this.f3148b) {
            this.f3148b.f1896P = Long.valueOf(longValue);
        }
    }
}
