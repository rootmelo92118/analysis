package com.google.android.gms.internal.ads;

final class awt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aws f2978a;

    awt(aws aws) {
        this.f2978a = aws;
    }

    public final void run() {
        if (this.f2978a.f2976b == null) {
            synchronized (aws.f2974d) {
                if (this.f2978a.f2976b == null) {
                    boolean booleanValue = ((Boolean) bre.m6321e().mo12778a(C1557p.f5975bd)).booleanValue();
                    if (booleanValue) {
                        try {
                            aws.f2973a = new bpc(this.f2978a.f2977c.f3046a, "ADSHIELD", (String) null);
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.f2978a.f2976b = Boolean.valueOf(booleanValue);
                    aws.f2974d.open();
                }
            }
        }
    }
}
