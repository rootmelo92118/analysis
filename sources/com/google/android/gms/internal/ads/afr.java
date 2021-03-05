package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class afr {
    /* renamed from: a */
    public static abg<afl> m2017a(Context context, zzbbi zzbbi, String str, awy awy, zzv zzv) {
        return aau.m1648a(aau.m1646a(null), new afs(context, awy, zzbbi, zzv, str), abl.f1313a);
    }

    /* renamed from: a */
    public static afl m2018a(Context context, agy agy, String str, boolean z, boolean z2, @Nullable awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv, box box) {
        C1557p.m7741a(context);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5931am)).booleanValue()) {
            return ahe.m2221a(context, agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv, box);
        }
        try {
            return (afl) C1842zo.m8564a(new aft(context, agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv, box));
        } catch (Throwable th) {
            throw new afv("Webview initialization failed.", th);
        }
    }
}
