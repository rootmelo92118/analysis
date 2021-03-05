package com.google.android.gms.internal.ads;

import com.google.ads.C0693a;
import com.google.ads.mediation.C0703a;
import java.util.Date;
import java.util.HashSet;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lv */
public final class C1471lv {
    /* renamed from: a */
    public static int m7561a(C0693a.C0694a aVar) {
        switch (C1472lw.f5698a[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C0703a m7562a(zzwb zzwb, boolean z) {
        C0693a.C0695b bVar;
        HashSet hashSet = zzwb.f7275e != null ? new HashSet(zzwb.f7275e) : null;
        Date date = new Date(zzwb.f7272b);
        switch (zzwb.f7274d) {
            case 1:
                bVar = C0693a.C0695b.MALE;
                break;
            case 2:
                bVar = C0693a.C0695b.FEMALE;
                break;
            default:
                bVar = C0693a.C0695b.UNKNOWN;
                break;
        }
        return new C0703a(date, bVar, hashSet, z, zzwb.f7281k);
    }
}
