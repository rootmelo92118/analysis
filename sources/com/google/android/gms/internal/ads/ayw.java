package com.google.android.gms.internal.ads;

public final class ayw extends aza {
    public ayw(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1885E = 2;
        boolean booleanValue = ((Boolean) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a()})).booleanValue();
        synchronized (this.f3148b) {
            if (booleanValue) {
                try {
                    this.f3148b.f1885E = 1;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f3148b.f1885E = 0;
            }
        }
    }
}
