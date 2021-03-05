package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

public final class ayk extends aza {
    public ayk(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 24);
    }

    /* renamed from: b */
    public final Void mo11420b() {
        if (this.f3147a.mo11375b()) {
            return super.call();
        }
        if (!this.f3147a.mo11380g()) {
            return null;
        }
        m4472c();
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (this.f3147a.mo11380g()) {
            m4472c();
            return;
        }
        synchronized (this.f3148b) {
            this.f3148b.f1901U = (String) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a()});
        }
    }

    /* renamed from: c */
    private final void m4472c() {
        AdvertisingIdClient m = this.f3147a.mo11386m();
        if (m != null) {
            try {
                AdvertisingIdClient.Info info = m.getInfo();
                String a = axx.m4432a(info.getId());
                if (a != null) {
                    synchronized (this.f3148b) {
                        this.f3148b.f1901U = a;
                        this.f3148b.f1903W = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.f3148b.f1902V = 5;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() {
        return call();
    }
}
