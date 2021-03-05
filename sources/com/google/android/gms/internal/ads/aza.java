package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class aza implements Callable {

    /* renamed from: a */
    protected final axq f3147a;

    /* renamed from: b */
    protected final akd f3148b;

    /* renamed from: c */
    protected Method f3149c;

    /* renamed from: d */
    private final String f3150d = getClass().getSimpleName();

    /* renamed from: e */
    private final String f3151e;

    /* renamed from: f */
    private final String f3152f;

    /* renamed from: g */
    private final int f3153g;

    /* renamed from: h */
    private final int f3154h;

    public aza(axq axq, String str, String str2, akd akd, int i, int i2) {
        this.f3147a = axq;
        this.f3151e = str;
        this.f3152f = str2;
        this.f3148b = akd;
        this.f3153g = i;
        this.f3154h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11418a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f3149c = this.f3147a.mo11371a(this.f3151e, this.f3152f);
            if (this.f3149c == null) {
                return null;
            }
            mo11418a();
            aws h = this.f3147a.mo11381h();
            if (!(h == null || this.f3153g == Integer.MIN_VALUE)) {
                h.mo11343a(this.f3154h, this.f3153g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
