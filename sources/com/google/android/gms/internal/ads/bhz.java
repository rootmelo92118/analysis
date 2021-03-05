package com.google.android.gms.internal.ads;

import java.util.List;

public final class bhz extends bhx implements bhl {

    /* renamed from: e */
    private final bic f4373e;

    public bhz(String str, long j, zzfs zzfs, String str2, bic bic, List<bhu> list) {
        super(str, -1, zzfs, str2, bic, list);
        this.f4373e = bic;
    }

    /* renamed from: d */
    public final bhw mo11965d() {
        return null;
    }

    /* renamed from: e */
    public final bhl mo11966e() {
        return this;
    }

    /* renamed from: f */
    public final String mo11967f() {
        return null;
    }

    /* renamed from: b */
    public final bhw mo11946b(int i) {
        return this.f4373e.mo11971a(this, i);
    }

    /* renamed from: a */
    public final int mo11943a(long j, long j2) {
        bic bic = this.f4373e;
        int i = bic.f4382d;
        int a = bic.mo11969a(j2);
        if (a == 0) {
            return i;
        }
        if (bic.f4384f == null) {
            int i2 = bic.f4382d + ((int) (j / ((bic.f4383e * 1000000) / bic.f4380b)));
            if (i2 < i) {
                return i;
            }
            if (a == -1) {
                return i2;
            }
            return Math.min(i2, (i + a) - 1);
        }
        int i3 = (a + i) - 1;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            long a2 = bic.mo11970a(i5);
            if (a2 < j) {
                i4 = i5 + 1;
            } else if (a2 <= j) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 == i ? i4 : i3;
    }

    /* renamed from: a */
    public final long mo11944a(int i) {
        return this.f4373e.mo11970a(i);
    }

    /* renamed from: a */
    public final long mo11945a(int i, long j) {
        bic bic = this.f4373e;
        if (bic.f4384f != null) {
            return (bic.f4384f.get(i - bic.f4382d).f4389b * 1000000) / bic.f4380b;
        }
        int a = bic.mo11969a(j);
        if (a == -1 || i != (bic.f4382d + a) - 1) {
            return (bic.f4383e * 1000000) / bic.f4380b;
        }
        return j - bic.mo11970a(i);
    }

    /* renamed from: a */
    public final int mo11941a() {
        return this.f4373e.f4382d;
    }

    /* renamed from: a */
    public final int mo11942a(long j) {
        return this.f4373e.mo11969a(j);
    }

    /* renamed from: b */
    public final boolean mo11947b() {
        return this.f4373e.mo11972a();
    }
}
