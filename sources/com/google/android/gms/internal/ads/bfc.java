package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bfc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bji f4039a;

    /* renamed from: b */
    private final /* synthetic */ int f4040b;

    /* renamed from: c */
    private final /* synthetic */ int f4041c;

    /* renamed from: d */
    private final /* synthetic */ zzfs f4042d;

    /* renamed from: e */
    private final /* synthetic */ int f4043e;

    /* renamed from: f */
    private final /* synthetic */ Object f4044f;

    /* renamed from: g */
    private final /* synthetic */ long f4045g;

    /* renamed from: h */
    private final /* synthetic */ long f4046h;

    /* renamed from: i */
    private final /* synthetic */ long f4047i;

    /* renamed from: j */
    private final /* synthetic */ long f4048j;

    /* renamed from: k */
    private final /* synthetic */ long f4049k;

    /* renamed from: l */
    private final /* synthetic */ IOException f4050l;

    /* renamed from: m */
    private final /* synthetic */ boolean f4051m;

    /* renamed from: n */
    private final /* synthetic */ bey f4052n;

    bfc(bey bey, bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f4052n = bey;
        this.f4039a = bji;
        this.f4040b = i;
        this.f4041c = i2;
        this.f4042d = zzfs;
        this.f4043e = i3;
        this.f4044f = obj;
        this.f4045g = j;
        this.f4046h = j2;
        this.f4047i = j3;
        this.f4048j = j4;
        this.f4049k = j5;
        this.f4050l = iOException;
        this.f4051m = z;
    }

    public final void run() {
        this.f4052n.f3995b.mo11767a(this.f4039a, this.f4040b, this.f4041c, this.f4042d, this.f4043e, this.f4044f, this.f4052n.m5165b(this.f4045g), this.f4052n.m5165b(this.f4046h), this.f4047i, this.f4048j, this.f4049k, this.f4050l, this.f4051m);
    }
}
