package com.google.android.gms.internal.ads;

final class bfa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bji f4015a;

    /* renamed from: b */
    private final /* synthetic */ int f4016b;

    /* renamed from: c */
    private final /* synthetic */ int f4017c;

    /* renamed from: d */
    private final /* synthetic */ zzfs f4018d;

    /* renamed from: e */
    private final /* synthetic */ int f4019e;

    /* renamed from: f */
    private final /* synthetic */ Object f4020f;

    /* renamed from: g */
    private final /* synthetic */ long f4021g;

    /* renamed from: h */
    private final /* synthetic */ long f4022h;

    /* renamed from: i */
    private final /* synthetic */ long f4023i;

    /* renamed from: j */
    private final /* synthetic */ long f4024j;

    /* renamed from: k */
    private final /* synthetic */ long f4025k;

    /* renamed from: l */
    private final /* synthetic */ bey f4026l;

    bfa(bey bey, bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f4026l = bey;
        this.f4015a = bji;
        this.f4016b = i;
        this.f4017c = i2;
        this.f4018d = zzfs;
        this.f4019e = i3;
        this.f4020f = obj;
        this.f4021g = j;
        this.f4022h = j2;
        this.f4023i = j3;
        this.f4024j = j4;
        this.f4025k = j5;
    }

    public final void run() {
        this.f4026l.f3995b.mo11766a(this.f4015a, this.f4016b, this.f4017c, this.f4018d, this.f4019e, this.f4020f, this.f4026l.m5165b(this.f4021g), this.f4026l.m5165b(this.f4022h), this.f4023i, this.f4024j, this.f4025k);
    }
}
