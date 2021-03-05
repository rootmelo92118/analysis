package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wr */
public final class C1764wr {
    @GuardedBy("this")

    /* renamed from: a */
    private BigInteger f6791a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b */
    private String f6792b = "0";

    /* renamed from: a */
    public final synchronized String mo13145a() {
        String bigInteger;
        bigInteger = this.f6791a.toString();
        this.f6791a = this.f6791a.add(BigInteger.ONE);
        this.f6792b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo13146b() {
        return this.f6792b;
    }
}
