package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ws */
public final class C1765ws {

    /* renamed from: a */
    private final Object f6793a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private int f6794b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private int f6795c;

    /* renamed from: d */
    private final C1766wt f6796d;

    /* renamed from: e */
    private final String f6797e;

    public C1765ws(String str) {
        this(zzbv.zzlj().mo13134n(), str);
    }

    private C1765ws(C1766wt wtVar, String str) {
        this.f6793a = new Object();
        this.f6796d = wtVar;
        this.f6797e = str;
    }

    /* renamed from: a */
    public final void mo13148a(int i, int i2) {
        synchronized (this.f6793a) {
            this.f6794b = i;
            this.f6795c = i2;
            this.f6796d.mo13156a(this);
        }
    }

    /* renamed from: a */
    public final String mo13147a() {
        return this.f6797e;
    }

    /* renamed from: b */
    public final Bundle mo13149b() {
        Bundle bundle;
        synchronized (this.f6793a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f6794b);
            bundle.putInt("pmnll", this.f6795c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1765ws wsVar = (C1765ws) obj;
        if (this.f6797e != null) {
            return this.f6797e.equals(wsVar.f6797e);
        }
        return wsVar.f6797e == null;
    }

    public final int hashCode() {
        if (this.f6797e != null) {
            return this.f6797e.hashCode();
        }
        return 0;
    }
}
