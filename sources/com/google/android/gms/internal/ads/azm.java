package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class azm extends Exception {

    /* renamed from: a */
    private final int f3174a;

    /* renamed from: b */
    private final int f3175b;

    /* renamed from: a */
    public static azm m4559a(Exception exc, int i) {
        return new azm(1, (String) null, exc, i);
    }

    /* renamed from: a */
    public static azm m4558a(IOException iOException) {
        return new azm(0, (String) null, iOException, -1);
    }

    /* renamed from: a */
    static azm m4560a(RuntimeException runtimeException) {
        return new azm(2, (String) null, runtimeException, -1);
    }

    private azm(int i, String str, Throwable th, int i2) {
        super((String) null, th);
        this.f3174a = i;
        this.f3175b = i2;
    }
}
