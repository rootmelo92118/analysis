package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.u */
public final class C1692u {
    /* renamed from: a */
    public static void m8022a(C1638s sVar, @Nullable C1611r rVar) {
        if (rVar.mo12911b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(rVar.mo12912c())) {
            sVar.mo12934a(rVar.mo12911b(), rVar.mo12912c(), rVar.mo12910a(), rVar.mo12913d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
