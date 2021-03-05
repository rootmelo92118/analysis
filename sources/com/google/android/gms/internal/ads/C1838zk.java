package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zk */
public final class C1838zk {

    /* renamed from: a */
    private Map<Integer, Bitmap> f6933a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f6934b = new AtomicInteger(0);

    /* renamed from: a */
    public final int mo13284a(Bitmap bitmap) {
        if (bitmap == null) {
            C1772wz.m1624b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f6934b.getAndIncrement();
        this.f6933a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap mo13285a(Integer num) {
        return this.f6933a.get(num);
    }

    /* renamed from: b */
    public final void mo13286b(Integer num) {
        this.f6933a.remove(num);
    }
}
