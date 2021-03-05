package com.google.android.gms.internal.ads;

final class bfd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f4053a;

    /* renamed from: b */
    private final /* synthetic */ zzfs f4054b;

    /* renamed from: c */
    private final /* synthetic */ int f4055c;

    /* renamed from: d */
    private final /* synthetic */ Object f4056d;

    /* renamed from: e */
    private final /* synthetic */ long f4057e;

    /* renamed from: f */
    private final /* synthetic */ bey f4058f;

    bfd(bey bey, int i, zzfs zzfs, int i2, Object obj, long j) {
        this.f4058f = bey;
        this.f4053a = i;
        this.f4054b = zzfs;
        this.f4055c = i2;
        this.f4056d = obj;
        this.f4057e = j;
    }

    public final void run() {
        this.f4058f.f3995b.mo11764a(this.f4053a, this.f4054b, this.f4055c, this.f4056d, this.f4058f.m5165b(this.f4057e));
    }
}
