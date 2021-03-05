package com.google.android.gms.internal.ads;

final class bez implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bji f3997a;

    /* renamed from: b */
    private final /* synthetic */ int f3998b;

    /* renamed from: c */
    private final /* synthetic */ int f3999c;

    /* renamed from: d */
    private final /* synthetic */ zzfs f4000d;

    /* renamed from: e */
    private final /* synthetic */ int f4001e;

    /* renamed from: f */
    private final /* synthetic */ Object f4002f;

    /* renamed from: g */
    private final /* synthetic */ long f4003g;

    /* renamed from: h */
    private final /* synthetic */ long f4004h;

    /* renamed from: i */
    private final /* synthetic */ long f4005i;

    /* renamed from: j */
    private final /* synthetic */ bey f4006j;

    bez(bey bey, bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3) {
        this.f4006j = bey;
        this.f3997a = bji;
        this.f3998b = i;
        this.f3999c = i2;
        this.f4000d = zzfs;
        this.f4001e = i3;
        this.f4002f = obj;
        this.f4003g = j;
        this.f4004h = j2;
        this.f4005i = j3;
    }

    public final void run() {
        this.f4006j.f3995b.mo11765a(this.f3997a, this.f3998b, this.f3999c, this.f4000d, this.f4001e, this.f4002f, this.f4006j.m5165b(this.f4003g), this.f4006j.m5165b(this.f4004h), this.f4005i);
    }
}
