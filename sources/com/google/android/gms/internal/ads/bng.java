package com.google.android.gms.internal.ads;

final class bng implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bnf f4837a;

    bng(bnf bnf) {
        this.f4837a = bnf;
    }

    public final void run() {
        synchronized (this.f4837a.f4829c) {
            if (!this.f4837a.f4830d || !this.f4837a.f4831e) {
                C1772wz.m1624b("App is still foreground");
            } else {
                boolean unused = this.f4837a.f4830d = false;
                C1772wz.m1624b("App went background");
                for (bnh a : this.f4837a.f4832f) {
                    try {
                        a.mo12240a(false);
                    } catch (Exception e) {
                        aai.m1625b("", e);
                    }
                }
            }
        }
    }
}
