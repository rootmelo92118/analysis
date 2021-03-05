package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bjk implements bjc {

    /* renamed from: a */
    private final boolean f4466a;

    /* renamed from: b */
    private final int f4467b;

    /* renamed from: c */
    private final byte[] f4468c;

    /* renamed from: d */
    private final bjb[] f4469d;

    /* renamed from: e */
    private int f4470e;

    /* renamed from: f */
    private int f4471f;

    /* renamed from: g */
    private int f4472g;

    /* renamed from: h */
    private bjb[] f4473h;

    public bjk(boolean z, int i) {
        this(true, 65536, 0);
    }

    private bjk(boolean z, int i, int i2) {
        bjy.m5689a(true);
        bjy.m5689a(true);
        this.f4466a = true;
        this.f4467b = 65536;
        this.f4472g = 0;
        this.f4473h = new bjb[100];
        this.f4468c = null;
        this.f4469d = new bjb[1];
    }

    /* renamed from: d */
    public final synchronized void mo12017d() {
        if (this.f4466a) {
            mo12016a(0);
        }
    }

    /* renamed from: a */
    public final synchronized void mo12016a(int i) {
        boolean z = i < this.f4470e;
        this.f4470e = i;
        if (z) {
            mo12006b();
        }
    }

    /* renamed from: a */
    public final synchronized bjb mo12003a() {
        bjb bjb;
        this.f4471f++;
        if (this.f4472g > 0) {
            bjb[] bjbArr = this.f4473h;
            int i = this.f4472g - 1;
            this.f4472g = i;
            bjb = bjbArr[i];
            this.f4473h[this.f4472g] = null;
        } else {
            bjb = new bjb(new byte[this.f4467b], 0);
        }
        return bjb;
    }

    /* renamed from: a */
    public final synchronized void mo12004a(bjb bjb) {
        this.f4469d[0] = bjb;
        mo12005a(this.f4469d);
    }

    /* renamed from: a */
    public final synchronized void mo12005a(bjb[] bjbArr) {
        boolean z;
        if (this.f4472g + bjbArr.length >= this.f4473h.length) {
            this.f4473h = (bjb[]) Arrays.copyOf(this.f4473h, Math.max(this.f4473h.length << 1, this.f4472g + bjbArr.length));
        }
        for (bjb bjb : bjbArr) {
            if (bjb.f4440a != null) {
                if (bjb.f4440a.length != this.f4467b) {
                    z = false;
                    bjy.m5689a(z);
                    bjb[] bjbArr2 = this.f4473h;
                    int i = this.f4472g;
                    this.f4472g = i + 1;
                    bjbArr2[i] = bjb;
                }
            }
            z = true;
            bjy.m5689a(z);
            bjb[] bjbArr22 = this.f4473h;
            int i2 = this.f4472g;
            this.f4472g = i2 + 1;
            bjbArr22[i2] = bjb;
        }
        this.f4471f -= bjbArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo12006b() {
        int max = Math.max(0, bkp.m5809a(this.f4470e, this.f4467b) - this.f4471f);
        if (max < this.f4472g) {
            Arrays.fill(this.f4473h, max, this.f4472g, (Object) null);
            this.f4472g = max;
        }
    }

    /* renamed from: e */
    public final synchronized int mo12018e() {
        return this.f4471f * this.f4467b;
    }

    /* renamed from: c */
    public final int mo12007c() {
        return this.f4467b;
    }
}
