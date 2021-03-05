package com.google.android.gms.common.util.p042a;

import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.a */
public class C0964a implements ThreadFactory {

    /* renamed from: a */
    private final String f1207a;

    /* renamed from: b */
    private final int f1208b;

    /* renamed from: c */
    private final ThreadFactory f1209c;

    public C0964a(String str) {
        this(str, 0);
    }

    private C0964a(String str, int i) {
        this.f1209c = Executors.defaultThreadFactory();
        this.f1207a = (String) C0926p.m1307a(str, (Object) "Name must not be null");
        this.f1208b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f1209c.newThread(new C0965b(runnable, 0));
        newThread.setName(this.f1207a);
        return newThread;
    }
}
