package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class aiw {

    /* renamed from: a */
    private amk f1846a;

    private aiw(amk amk) {
        this.f1846a = amk;
    }

    /* renamed from: a */
    static final aiw m2384a(amk amk) {
        if (amk != null && amk.mo10701c() > 0) {
            return new aiw(amk);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final amk mo10598a() {
        return this.f1846a;
    }

    public final String toString() {
        return ajf.m2413a(this.f1846a).toString();
    }
}
