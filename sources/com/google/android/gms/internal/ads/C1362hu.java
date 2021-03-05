package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu */
final class C1362hu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f5449a;

    /* renamed from: b */
    private final /* synthetic */ C1357hp f5450b;

    C1362hu(C1357hp hpVar, String str) {
        this.f5450b = hpVar;
        this.f5449a = str;
    }

    public final void run() {
        this.f5450b.f5441a.loadData(this.f5449a, "text/html", "UTF-8");
    }
}
