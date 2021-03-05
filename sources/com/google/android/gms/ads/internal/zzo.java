package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzo {
    public static Object[] zza(String str, zzwb zzwb, String str2, int i, @Nullable zzwf zzwf) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add((Object) null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzwb.f7272b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzwb.f7273c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzwb.f7274d));
        }
        if (hashSet.contains("keywords")) {
            if (zzwb.f7275e != null) {
                arrayList.add(zzwb.f7275e.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzwb.f7276f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzwb.f7277g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzwb.f7278h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzwb.f7279i);
        }
        if (hashSet.contains("location")) {
            if (zzwb.f7281k != null) {
                arrayList.add(zzwb.f7281k.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzwb.f7282l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzwb.f7283m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzwb.f7284n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzwb.f7285o != null) {
                arrayList.add(zzwb.f7285o.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzwb.f7286p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzwb.f7287q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzwb.f7288r));
        }
        return arrayList.toArray();
    }

    private static String zza(@Nullable Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = zza((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
