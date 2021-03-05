package com.google.android.gms.internal.ads;

public final class bfg implements bgc {

    /* renamed from: a */
    private final bgc[] f4061a;

    public bfg(bgc[] bgcArr) {
        this.f4061a = bgcArr;
    }

    /* renamed from: a_ */
    public final long mo11813a_() {
        long j = Long.MAX_VALUE;
        for (bgc a_ : this.f4061a) {
            long a_2 = a_.mo11813a_();
            if (a_2 != Long.MIN_VALUE) {
                j = Math.min(j, a_2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo11812a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a_ = mo11813a_();
            if (a_ == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (bgc bgc : this.f4061a) {
                if (bgc.mo11813a_() == a_) {
                    z |= bgc.mo11812a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
