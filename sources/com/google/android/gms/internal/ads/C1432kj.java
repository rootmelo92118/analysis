package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.kj */
final class C1432kj implements Callable<C1427ke> {

    /* renamed from: a */
    private final /* synthetic */ C1424kb f5638a;

    /* renamed from: b */
    private final /* synthetic */ C1431ki f5639b;

    C1432kj(C1431ki kiVar, C1424kb kbVar) {
        this.f5639b = kiVar;
        this.f5638a = kbVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1427ke call() {
        synchronized (this.f5639b.f5631i) {
            if (this.f5639b.f5632j) {
                return null;
            }
            return this.f5638a.mo12667a(this.f5639b.f5628f, this.f5639b.f5629g);
        }
    }
}
