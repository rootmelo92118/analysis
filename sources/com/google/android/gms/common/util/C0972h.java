package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C0972h implements C0969e {

    /* renamed from: a */
    private static final C0972h f1218a = new C0972h();

    /* renamed from: d */
    public static C0969e m1482d() {
        return f1218a;
    }

    /* renamed from: a */
    public long mo9996a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo9997b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo9998c() {
        return System.nanoTime();
    }

    private C0972h() {
    }
}
