package com.google.android.gms.internal.ads;

public final class bge extends baj {

    /* renamed from: b */
    private static final Object f4170b = new Object();

    /* renamed from: c */
    private final long f4171c;

    /* renamed from: d */
    private final long f4172d;

    /* renamed from: e */
    private final long f4173e;

    /* renamed from: f */
    private final long f4174f;

    /* renamed from: g */
    private final boolean f4175g;

    /* renamed from: h */
    private final boolean f4176h;

    public bge(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: b */
    public final int mo11529b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo11530c() {
        return 1;
    }

    private bge(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f4171c = j;
        this.f4172d = j2;
        this.f4173e = 0;
        this.f4174f = 0;
        this.f4175g = z;
        this.f4176h = false;
    }

    /* renamed from: a */
    public final bam mo11527a(int i, bam bam, boolean z, long j) {
        bjy.m5687a(i, 0, 1);
        return bam.mo11533a((Object) null, -9223372036854775807L, -9223372036854775807L, this.f4175g, false, 0, this.f4172d, 0, 0, 0);
    }

    /* renamed from: a */
    public final bal mo11526a(int i, bal bal, boolean z) {
        bjy.m5687a(i, 0, 1);
        Object obj = z ? f4170b : null;
        return bal.mo11532a(obj, obj, 0, this.f4171c, 0, false);
    }

    /* renamed from: a */
    public final int mo11525a(Object obj) {
        return f4170b.equals(obj) ? 0 : -1;
    }
}
