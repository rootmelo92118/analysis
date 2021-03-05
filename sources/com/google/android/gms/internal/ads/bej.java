package com.google.android.gms.internal.ads;

final class bej implements Runnable {

    /* renamed from: a */
    private final blj f3979a;

    /* renamed from: b */
    private final brk f3980b;

    /* renamed from: c */
    private final Runnable f3981c;

    public bej(blj blj, brk brk, Runnable runnable) {
        this.f3979a = blj;
        this.f3980b = brk;
        this.f3981c = runnable;
    }

    public final void run() {
        this.f3979a.mo12125h();
        if (this.f3980b.f5187c == null) {
            this.f3979a.mo12114a(this.f3980b.f5185a);
        } else {
            this.f3979a.mo12113a(this.f3980b.f5187c);
        }
        if (this.f3980b.f5188d) {
            this.f3979a.mo12117b("intermediate-response");
        } else {
            this.f3979a.mo12119c("done");
        }
        if (this.f3981c != null) {
            this.f3981c.run();
        }
    }
}
