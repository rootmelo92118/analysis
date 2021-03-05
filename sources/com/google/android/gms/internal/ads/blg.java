package com.google.android.gms.internal.ads;

final class blg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4653a;

    /* renamed from: b */
    private final /* synthetic */ long f4654b;

    /* renamed from: c */
    private final /* synthetic */ long f4655c;

    /* renamed from: d */
    private final /* synthetic */ ble f4656d;

    blg(ble ble, String str, long j, long j2) {
        this.f4656d = ble;
        this.f4653a = str;
        this.f4654b = j;
        this.f4655c = j2;
    }

    public final void run() {
        this.f4656d.f4650b.mo10248a(this.f4653a, this.f4654b, this.f4655c);
    }
}
