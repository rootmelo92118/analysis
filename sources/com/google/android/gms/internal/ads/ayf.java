package com.google.android.gms.internal.ads;

final class ayf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ blj f3114a;

    /* renamed from: b */
    private final /* synthetic */ axe f3115b;

    ayf(axe axe, blj blj) {
        this.f3115b = axe;
        this.f3114a = blj;
    }

    public final void run() {
        try {
            this.f3115b.f3026c.put(this.f3114a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
