package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.xh */
final class C1781xh implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f6836a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f6837b;

    C1781xh(String str) {
        this.f6837b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f6837b;
        int andIncrement = this.f6836a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
