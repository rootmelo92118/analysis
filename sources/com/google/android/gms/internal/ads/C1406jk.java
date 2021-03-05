package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jk */
public final class C1406jk {

    /* renamed from: a */
    private static final C1816yp<C1355hn> f5523a = new C1407jl();

    /* renamed from: b */
    private static final C1816yp<C1355hn> f5524b = new C1408jm();

    /* renamed from: c */
    private final C1366hy f5525c;

    public C1406jk(Context context, zzbbi zzbbi, String str) {
        this.f5525c = new C1366hy(context, zzbbi, str, f5523a, f5524b);
    }

    /* renamed from: a */
    public final <I, O> C1397jb<I, O> mo12636a(String str, C1400je<I> jeVar, C1399jd<O> jdVar) {
        return new C1409jn(this.f5525c, str, jeVar, jdVar);
    }
}
