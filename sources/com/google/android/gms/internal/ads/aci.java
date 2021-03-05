package com.google.android.gms.internal.ads;

final class aci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f1343a;

    /* renamed from: b */
    private final /* synthetic */ int f1344b;

    /* renamed from: c */
    private final /* synthetic */ zzbcx f1345c;

    aci(zzbcx zzbcx, int i, int i2) {
        this.f1345c = zzbcx;
        this.f1343a = i;
        this.f1344b = i2;
    }

    public final void run() {
        if (this.f1345c.f7155r != null) {
            this.f1345c.f7155r.mo10118a(this.f1343a, this.f1344b);
        }
    }
}
