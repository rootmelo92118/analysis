package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aur;

public final class ave extends aug<ave> {

    /* renamed from: a */
    public avd[] f2663a = avd.m4247b();

    /* renamed from: b */
    private aur.C1096b.C1102d.C1104b f2664b = null;

    /* renamed from: c */
    private byte[] f2665c = null;

    /* renamed from: d */
    private byte[] f2666d = null;

    /* renamed from: e */
    private Integer f2667e = null;

    public ave() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2664b != null) {
            aue.mo11272a(1, (arw) this.f2664b);
        }
        if (this.f2663a != null && this.f2663a.length > 0) {
            for (avd avd : this.f2663a) {
                if (avd != null) {
                    aue.mo11273a(2, (aum) avd);
                }
            }
        }
        if (this.f2665c != null) {
            aue.mo11276a(3, this.f2665c);
        }
        if (this.f2666d != null) {
            aue.mo11276a(4, this.f2666d);
        }
        if (this.f2667e != null) {
            aue.mo11270a(5, this.f2667e.intValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2664b != null) {
            a += apt.m3165c(1, (arw) this.f2664b);
        }
        if (this.f2663a != null && this.f2663a.length > 0) {
            for (avd avd : this.f2663a) {
                if (avd != null) {
                    a += aue.m4144b(2, (aum) avd);
                }
            }
        }
        if (this.f2665c != null) {
            a += aue.m4146b(3, this.f2665c);
        }
        if (this.f2666d != null) {
            a += aue.m4146b(4, this.f2666d);
        }
        return this.f2667e != null ? a + aue.m4143b(5, this.f2667e.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2664b = (aur.C1096b.C1102d.C1104b) aud.mo11251a(aur.C1096b.C1102d.C1104b.m4213a());
            } else if (a == 18) {
                int a2 = auq.m4197a(aud, 18);
                int length = this.f2663a == null ? 0 : this.f2663a.length;
                avd[] avdArr = new avd[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f2663a, 0, avdArr, 0, length);
                }
                while (length < avdArr.length - 1) {
                    avdArr[length] = new avd();
                    aud.mo11253a((aum) avdArr[length]);
                    aud.mo11250a();
                    length++;
                }
                avdArr[length] = new avd();
                aud.mo11253a((aum) avdArr[length]);
                this.f2663a = avdArr;
            } else if (a == 26) {
                this.f2665c = aud.mo11264f();
            } else if (a == 34) {
                this.f2666d = aud.mo11264f();
            } else if (a == 40) {
                this.f2667e = Integer.valueOf(aud.mo11258c());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
