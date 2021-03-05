package com.google.android.gms.p039a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.a.c */
public abstract class C0723c<T> {

    /* renamed from: a */
    private final String f656a;

    /* renamed from: b */
    private T f657b;

    protected C0723c(String str) {
        this.f656a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo8407b(IBinder iBinder);

    /* renamed from: com.google.android.gms.a.c$a */
    public static class C0724a extends Exception {
        public C0724a(String str) {
            super(str);
        }

        public C0724a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo8406a(Context context) {
        if (this.f657b == null) {
            C0926p.m1306a(context);
            Context remoteContext = C0858g.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f657b = mo8407b((IBinder) remoteContext.getClassLoader().loadClass(this.f656a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C0724a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C0724a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C0724a("Could not access creator.", e3);
                }
            } else {
                throw new C0724a("Could not get remote context.");
            }
        }
        return this.f657b;
    }
}
