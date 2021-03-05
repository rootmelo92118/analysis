package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C0911h {

    /* renamed from: a */
    private static final Object f1104a = new Object();

    /* renamed from: b */
    private static C0911h f1105b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo9802a(C0912a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9803b(C0912a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public static C0911h m1280a(Context context) {
        synchronized (f1104a) {
            if (f1105b == null) {
                f1105b = new C0877ah(context.getApplicationContext());
            }
        }
        return f1105b;
    }

    /* renamed from: com.google.android.gms.common.internal.h$a */
    protected static final class C0912a {

        /* renamed from: a */
        private final String f1106a;

        /* renamed from: b */
        private final String f1107b;

        /* renamed from: c */
        private final ComponentName f1108c = null;

        /* renamed from: d */
        private final int f1109d;

        public C0912a(String str, String str2, int i) {
            this.f1106a = C0926p.m1308a(str);
            this.f1107b = C0926p.m1308a(str2);
            this.f1109d = i;
        }

        public final String toString() {
            return this.f1106a == null ? this.f1108c.flattenToString() : this.f1106a;
        }

        /* renamed from: a */
        public final String mo9900a() {
            return this.f1107b;
        }

        /* renamed from: b */
        public final ComponentName mo9901b() {
            return this.f1108c;
        }

        /* renamed from: c */
        public final int mo9902c() {
            return this.f1109d;
        }

        /* renamed from: a */
        public final Intent mo9899a(Context context) {
            if (this.f1106a != null) {
                return new Intent(this.f1106a).setPackage(this.f1107b);
            }
            return new Intent().setComponent(this.f1108c);
        }

        public final int hashCode() {
            return C0924o.m1301a(this.f1106a, this.f1107b, this.f1108c, Integer.valueOf(this.f1109d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0912a)) {
                return false;
            }
            C0912a aVar = (C0912a) obj;
            return C0924o.m1303a(this.f1106a, aVar.f1106a) && C0924o.m1303a(this.f1107b, aVar.f1107b) && C0924o.m1303a(this.f1108c, aVar.f1108c) && this.f1109d == aVar.f1109d;
        }
    }

    /* renamed from: a */
    public final void mo9898a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo9803b(new C0912a(str, str2, i), serviceConnection, str3);
    }
}
