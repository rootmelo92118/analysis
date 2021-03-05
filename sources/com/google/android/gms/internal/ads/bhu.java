package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class bhu {
    @NonNull

    /* renamed from: a */
    public final String f4356a;
    @Nullable

    /* renamed from: b */
    public final String f4357b;
    @Nullable

    /* renamed from: c */
    private final String f4358c;

    public bhu(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f4356a = str;
        this.f4357b = str2;
        this.f4358c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bhu bhu = (bhu) obj;
        return bkp.m5820a((Object) this.f4356a, (Object) bhu.f4356a) && bkp.m5820a((Object) this.f4357b, (Object) bhu.f4357b) && bkp.m5820a((Object) this.f4358c, (Object) bhu.f4358c);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f4356a != null ? this.f4356a.hashCode() : 0) * 31) + (this.f4357b != null ? this.f4357b.hashCode() : 0)) * 31;
        if (this.f4358c != null) {
            i = this.f4358c.hashCode();
        }
        return hashCode + i;
    }
}
