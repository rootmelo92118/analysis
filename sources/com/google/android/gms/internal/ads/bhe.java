package com.google.android.gms.internal.ads;

final class bhe extends baj {

    /* renamed from: b */
    private final long f4294b;

    /* renamed from: c */
    private final long f4295c;

    /* renamed from: d */
    private final int f4296d;

    /* renamed from: e */
    private final long f4297e;

    /* renamed from: f */
    private final long f4298f;

    /* renamed from: g */
    private final long f4299g;

    /* renamed from: h */
    private final bhr f4300h;

    public bhe(long j, long j2, int i, long j3, long j4, long j5, bhr bhr) {
        this.f4294b = j;
        this.f4295c = j2;
        this.f4296d = i;
        this.f4297e = j3;
        this.f4298f = j4;
        this.f4299g = j5;
        this.f4300h = bhr;
    }

    /* renamed from: b */
    public final int mo11529b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo11530c() {
        return this.f4300h.mo11955a();
    }

    /* renamed from: a */
    public final bal mo11526a(int i, bal bal, boolean z) {
        bjy.m5687a(i, 0, this.f4300h.mo11955a());
        Integer num = null;
        String str = z ? this.f4300h.mo11956a(i).f4359a : null;
        if (z) {
            num = Integer.valueOf(this.f4296d + bjy.m5687a(i, 0, this.f4300h.mo11955a()));
        }
        return bal.mo11532a(str, num, 0, this.f4300h.mo11957b(i), azl.m4557b(this.f4300h.mo11956a(i).f4360b - this.f4300h.mo11956a(0).f4360b) - this.f4297e, false);
    }

    /* renamed from: a */
    public final bam mo11527a(int i, bam bam, boolean z, long j) {
        bhl e;
        bjy.m5687a(i, 0, 1);
        long j2 = this.f4299g;
        if (this.f4300h.f4337b) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f4298f) {
                    j2 = -9223372036854775807L;
                }
            }
            long b = this.f4300h.mo11957b(0);
            long j3 = this.f4297e + j2;
            int i2 = 0;
            while (i2 < this.f4300h.mo11955a() - 1 && j3 >= b) {
                j3 -= b;
                i2++;
                b = this.f4300h.mo11957b(i2);
            }
            bhv a = this.f4300h.mo11956a(i2);
            int size = a.f4361c.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (a.f4361c.get(i3).f4332b == 2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (!(i3 == -1 || (e = a.f4361c.get(i3).f4333c.get(0).mo11966e()) == null || e.mo11942a(b) == 0)) {
                j2 = (j2 + e.mo11944a(e.mo11943a(j3, b))) - j3;
            }
        }
        long j4 = j2;
        return bam.mo11533a((Object) null, this.f4294b, this.f4295c, true, this.f4300h.f4337b, j4, this.f4298f, 0, this.f4300h.mo11955a() - 1, this.f4297e);
    }

    /* renamed from: a */
    public final int mo11525a(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= this.f4296d && intValue < this.f4296d + mo11530c()) {
            return intValue - this.f4296d;
        }
        return -1;
    }
}
