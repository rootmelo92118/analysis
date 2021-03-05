package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0926p;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.at */
final class C2163at implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f8115a;

    /* renamed from: b */
    private final /* synthetic */ C2161ar f8116b;

    public C2163at(C2161ar arVar, String str) {
        this.f8116b = arVar;
        C0926p.m1306a(str);
        this.f8115a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f8116b.mo14235r().mo14830d_().mo14842a(this.f8115a, th);
    }
}
