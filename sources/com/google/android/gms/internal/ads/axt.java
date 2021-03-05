package com.google.android.gms.internal.ads;

final class axt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f3067a;

    /* renamed from: b */
    private final /* synthetic */ boolean f3068b;

    /* renamed from: c */
    private final /* synthetic */ axq f3069c;

    axt(axq axq, int i, boolean z) {
        this.f3069c = axq;
        this.f3067a = i;
        this.f3068b = z;
    }

    public final void run() {
        akd b = this.f3069c.mo11374b(this.f3067a, this.f3068b);
        akd unused = this.f3069c.f3055k = b;
        if (axq.m4405b(this.f3067a, b)) {
            this.f3069c.mo11372a(this.f3067a + 1, this.f3068b);
        }
    }
}
