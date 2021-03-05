package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public final class bhr {

    /* renamed from: a */
    public final long f4336a;

    /* renamed from: b */
    public final boolean f4337b;

    /* renamed from: c */
    public final long f4338c;

    /* renamed from: d */
    public final long f4339d;

    /* renamed from: e */
    public final long f4340e;

    /* renamed from: f */
    public final bik f4341f;

    /* renamed from: g */
    public final Uri f4342g;

    /* renamed from: h */
    private final long f4343h;

    /* renamed from: i */
    private final long f4344i;

    /* renamed from: j */
    private final List<bhv> f4345j;

    public bhr(long j, long j2, long j3, boolean z, long j4, long j5, long j6, bik bik, Uri uri, List<bhv> list) {
        this.f4336a = j;
        this.f4343h = j2;
        this.f4344i = j3;
        this.f4337b = z;
        this.f4338c = j4;
        this.f4339d = j5;
        this.f4340e = j6;
        this.f4341f = bik;
        this.f4342g = uri;
        this.f4345j = list;
    }

    /* renamed from: a */
    public final int mo11955a() {
        return this.f4345j.size();
    }

    /* renamed from: a */
    public final bhv mo11956a(int i) {
        return this.f4345j.get(i);
    }

    /* renamed from: b */
    public final long mo11957b(int i) {
        long j;
        if (i == this.f4345j.size() - 1) {
            j = this.f4343h == -9223372036854775807L ? -9223372036854775807L : this.f4343h - this.f4345j.get(i).f4360b;
        } else {
            j = this.f4345j.get(i + 1).f4360b - this.f4345j.get(i).f4360b;
        }
        return azl.m4557b(j);
    }
}
