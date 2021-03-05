package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Arrays;

public abstract class bim implements biv {

    /* renamed from: a */
    private final bgf f4399a;

    /* renamed from: b */
    private final int f4400b;

    /* renamed from: c */
    private final int[] f4401c;

    /* renamed from: d */
    private final zzfs[] f4402d;

    /* renamed from: e */
    private final long[] f4403e;

    /* renamed from: f */
    private int f4404f;

    public bim(bgf bgf, int... iArr) {
        bjy.m5691b(iArr.length > 0);
        this.f4399a = (bgf) bjy.m5688a(bgf);
        this.f4400b = iArr.length;
        this.f4402d = new zzfs[this.f4400b];
        for (int i = 0; i < iArr.length; i++) {
            this.f4402d[i] = bgf.mo11889a(iArr[i]);
        }
        Arrays.sort(this.f4402d, new bio());
        this.f4401c = new int[this.f4400b];
        for (int i2 = 0; i2 < this.f4400b; i2++) {
            this.f4401c[i2] = bgf.mo11888a(this.f4402d[i2]);
        }
        this.f4403e = new long[this.f4400b];
    }

    /* renamed from: a */
    public final bgf mo11976a() {
        return this.f4399a;
    }

    /* renamed from: b */
    public final int mo11979b() {
        return this.f4401c.length;
    }

    /* renamed from: a */
    public final zzfs mo11977a(int i) {
        return this.f4402d[i];
    }

    /* renamed from: b */
    public final int mo11980b(int i) {
        return this.f4401c[i];
    }

    /* renamed from: a */
    public final int mo11975a(zzfs zzfs) {
        for (int i = 0; i < this.f4400b; i++) {
            if (this.f4402d[i] == zzfs) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final zzfs mo11981c() {
        return this.f4402d[mo11989d()];
    }

    /* renamed from: a */
    public final boolean mo11978a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = m5580b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f4400b && !b) {
            b = i2 != i && !m5580b(i2, elapsedRealtime);
            i2++;
        }
        if (!b) {
            return false;
        }
        this.f4403e[i] = Math.max(this.f4403e[i], elapsedRealtime + 60000);
        return true;
    }

    /* renamed from: b */
    private final boolean m5580b(int i, long j) {
        return this.f4403e[i] > j;
    }

    public int hashCode() {
        if (this.f4404f == 0) {
            this.f4404f = (System.identityHashCode(this.f4399a) * 31) + Arrays.hashCode(this.f4401c);
        }
        return this.f4404f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bim bim = (bim) obj;
        return this.f4399a == bim.f4399a && Arrays.equals(this.f4401c, bim.f4401c);
    }
}
