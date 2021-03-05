package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.gr */
final class C1332gr {

    /* renamed from: a */
    private final Object[] f5393a;

    C1332gr(zzwb zzwb, String str, int i) {
        this.f5393a = zzo.zza((String) bre.m6321e().mo12778a(C1557p.f5897aE), zzwb, str, i, (zzwf) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1332gr)) {
            return false;
        }
        return Arrays.equals(this.f5393a, ((C1332gr) obj).f5393a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5393a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f5393a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
