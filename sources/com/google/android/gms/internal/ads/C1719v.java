package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.v */
public final class C1719v {
    /* renamed from: a */
    public static boolean m8118a(@Nullable C1019ad adVar, @Nullable C1016aa aaVar, String... strArr) {
        if (adVar == null || aaVar == null) {
            return false;
        }
        return adVar.mo10155a(aaVar, strArr);
    }

    @Nullable
    /* renamed from: a */
    public static C1016aa m8117a(@Nullable C1019ad adVar) {
        if (adVar == null) {
            return null;
        }
        return adVar.mo10149a();
    }
}
