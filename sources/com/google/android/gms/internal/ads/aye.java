package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class aye extends aza {

    /* renamed from: d */
    private static azb<String> f3112d = new azb<>();

    /* renamed from: e */
    private final Context f3113e;

    public aye(axq axq, String str, String str2, akd akd, int i, int i2, Context context) {
        super(axq, str, str2, akd, i, 29);
        this.f3113e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1940o = "E";
        AtomicReference<String> a = f3112d.mo11427a(this.f3113e.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f3149c.invoke((Object) null, new Object[]{this.f3113e}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f3148b) {
            this.f3148b.f1940o = atm.m3909a(str.getBytes(), true);
        }
    }
}
