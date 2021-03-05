package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.pf */
final class C1563pf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f6172a;

    /* renamed from: b */
    private final /* synthetic */ int f6173b;

    /* renamed from: c */
    private final /* synthetic */ abq f6174c;

    /* renamed from: d */
    private final /* synthetic */ List f6175d;

    C1563pf(AtomicInteger atomicInteger, int i, abq abq, List list) {
        this.f6172a = atomicInteger;
        this.f6173b = i;
        this.f6174c = abq;
        this.f6175d = list;
    }

    public final void run() {
        if (this.f6172a.incrementAndGet() >= this.f6173b) {
            try {
                this.f6174c.mo10087b(C1554ox.m7730b(this.f6175d));
            } catch (InterruptedException | ExecutionException e) {
                C1772wz.m1627c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
