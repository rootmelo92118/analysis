package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C0924o;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.tl */
public final class C1677tl extends C1684ts {

    /* renamed from: a */
    private final String f6554a;

    /* renamed from: b */
    private final int f6555b;

    public C1677tl(String str, int i) {
        this.f6554a = str;
        this.f6555b = i;
    }

    /* renamed from: a */
    public final String mo12984a() {
        return this.f6554a;
    }

    /* renamed from: b */
    public final int mo12985b() {
        return this.f6555b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1677tl)) {
            return false;
        }
        C1677tl tlVar = (C1677tl) obj;
        if (!C0924o.m1303a(this.f6554a, tlVar.f6554a) || !C0924o.m1303a(Integer.valueOf(this.f6555b), Integer.valueOf(tlVar.f6555b))) {
            return false;
        }
        return true;
    }
}
