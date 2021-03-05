package com.google.android.gms.internal.ads;

final class acg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1339a;

    /* renamed from: b */
    private final /* synthetic */ String f1340b;

    /* renamed from: c */
    private final /* synthetic */ zzbcx f1341c;

    acg(zzbcx zzbcx, String str, String str2) {
        this.f1341c = zzbcx;
        this.f1339a = str;
        this.f1340b = str2;
    }

    public final void run() {
        if (this.f1341c.f7155r != null) {
            this.f1341c.f7155r.mo10119a(this.f1339a, this.f1340b);
        }
    }
}
