package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;

public final class bnx {

    /* renamed from: a */
    final long f4877a;

    /* renamed from: b */
    final String f4878b;

    /* renamed from: c */
    final int f4879c;

    bnx(long j, String str, int i) {
        this.f4877a = j;
        this.f4878b = str;
        this.f4879c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof bnx)) {
            return false;
        }
        bnx bnx = (bnx) obj;
        if (bnx.f4877a == this.f4877a && bnx.f4879c == this.f4879c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f4877a;
    }
}
