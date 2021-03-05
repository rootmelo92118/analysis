package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ayy {

    /* renamed from: a */
    private static final String f3137a = "ayy";

    /* renamed from: b */
    private final axq f3138b;

    /* renamed from: c */
    private final String f3139c;

    /* renamed from: d */
    private final String f3140d;

    /* renamed from: e */
    private final int f3141e = 2;

    /* renamed from: f */
    private volatile Method f3142f = null;

    /* renamed from: g */
    private final Class<?>[] f3143g;

    /* renamed from: h */
    private CountDownLatch f3144h = new CountDownLatch(1);

    public ayy(axq axq, String str, String str2, Class<?>... clsArr) {
        this.f3138b = axq;
        this.f3139c = str;
        this.f3140d = str2;
        this.f3143g = clsArr;
        this.f3138b.mo11376c().submit(new ayz(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m4490b() {
        try {
            Class loadClass = this.f3138b.mo11377d().loadClass(m4488a(this.f3138b.mo11379f(), this.f3139c));
            if (loadClass != null) {
                this.f3142f = loadClass.getMethod(m4488a(this.f3138b.mo11379f(), this.f3140d), this.f3143g);
                if (this.f3142f == null) {
                    this.f3144h.countDown();
                } else {
                    this.f3144h.countDown();
                }
            }
        } catch (axb unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f3144h.countDown();
        }
    }

    /* renamed from: a */
    private final String m4488a(byte[] bArr, String str) {
        return new String(this.f3138b.mo11378e().mo11359a(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo11423a() {
        if (this.f3142f != null) {
            return this.f3142f;
        }
        try {
            if (!this.f3144h.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f3142f;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
