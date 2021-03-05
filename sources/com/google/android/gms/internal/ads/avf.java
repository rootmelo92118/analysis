package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aur;

public final class avf extends aug<avf> {

    /* renamed from: a */
    private aur.C1096b.C1106e.C1108b f2668a = null;

    /* renamed from: b */
    private avd[] f2669b = avd.m4247b();

    /* renamed from: c */
    private byte[] f2670c = null;

    /* renamed from: d */
    private byte[] f2671d = null;

    /* renamed from: e */
    private Integer f2672e = null;

    /* renamed from: f */
    private byte[] f2673f = null;

    public avf() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2668a != null) {
            aue.mo11272a(1, (arw) this.f2668a);
        }
        if (this.f2669b != null && this.f2669b.length > 0) {
            for (avd avd : this.f2669b) {
                if (avd != null) {
                    aue.mo11273a(2, (aum) avd);
                }
            }
        }
        if (this.f2670c != null) {
            aue.mo11276a(3, this.f2670c);
        }
        if (this.f2671d != null) {
            aue.mo11276a(4, this.f2671d);
        }
        if (this.f2672e != null) {
            aue.mo11270a(5, this.f2672e.intValue());
        }
        if (this.f2673f != null) {
            aue.mo11276a(6, this.f2673f);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2668a != null) {
            a += apt.m3165c(1, (arw) this.f2668a);
        }
        if (this.f2669b != null && this.f2669b.length > 0) {
            for (avd avd : this.f2669b) {
                if (avd != null) {
                    a += aue.m4144b(2, (aum) avd);
                }
            }
        }
        if (this.f2670c != null) {
            a += aue.m4146b(3, this.f2670c);
        }
        if (this.f2671d != null) {
            a += aue.m4146b(4, this.f2671d);
        }
        if (this.f2672e != null) {
            a += aue.m4143b(5, this.f2672e.intValue());
        }
        return this.f2673f != null ? a + aue.m4146b(6, this.f2673f) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2668a = (aur.C1096b.C1106e.C1108b) aud.mo11251a(aur.C1096b.C1106e.C1108b.m4218a());
            } else if (a == 18) {
                int a2 = auq.m4197a(aud, 18);
                int length = this.f2669b == null ? 0 : this.f2669b.length;
                avd[] avdArr = new avd[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f2669b, 0, avdArr, 0, length);
                }
                while (length < avdArr.length - 1) {
                    avdArr[length] = new avd();
                    aud.mo11253a((aum) avdArr[length]);
                    aud.mo11250a();
                    length++;
                }
                avdArr[length] = new avd();
                aud.mo11253a((aum) avdArr[length]);
                this.f2669b = avdArr;
            } else if (a == 26) {
                this.f2670c = aud.mo11264f();
            } else if (a == 34) {
                this.f2671d = aud.mo11264f();
            } else if (a == 40) {
                this.f2672e = Integer.valueOf(aud.mo11258c());
            } else if (a == 50) {
                this.f2673f = aud.mo11264f();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
