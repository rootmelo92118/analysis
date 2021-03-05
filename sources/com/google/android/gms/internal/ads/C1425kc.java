package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kc */
final class C1425kc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1423ka f5613a;

    /* renamed from: b */
    private final /* synthetic */ C1424kb f5614b;

    C1425kc(C1424kb kbVar, C1423ka kaVar) {
        this.f5614b = kbVar;
        this.f5613a = kaVar;
    }

    public final void run() {
        synchronized (this.f5614b.f5601i) {
            if (this.f5614b.f5611s == -2) {
                C1440kr unused = this.f5614b.f5610r = this.f5614b.m7170d();
                if (this.f5614b.f5610r == null) {
                    this.f5614b.mo12669a(4);
                } else if (!this.f5614b.m7172e() || this.f5614b.m7167b(1)) {
                    this.f5613a.mo12654a((C1428kf) this.f5614b);
                    this.f5614b.m7161a(this.f5613a);
                } else {
                    String f = this.f5614b.f5593a;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(f);
                    sb.append(" as delayed impression is not supported");
                    C1772wz.m1630e(sb.toString());
                    this.f5614b.mo12669a(2);
                }
            }
        }
    }
}
