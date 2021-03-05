package com.google.android.gms.internal.ads;

public final class avd extends aug<avd> {

    /* renamed from: c */
    private static volatile avd[] f2660c;

    /* renamed from: a */
    public byte[] f2661a = null;

    /* renamed from: b */
    public byte[] f2662b = null;

    /* renamed from: b */
    public static avd[] m4247b() {
        if (f2660c == null) {
            synchronized (auk.f2580b) {
                if (f2660c == null) {
                    f2660c = new avd[0];
                }
            }
        }
        return f2660c;
    }

    public avd() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        aue.mo11276a(1, this.f2661a);
        if (this.f2662b != null) {
            aue.mo11276a(2, this.f2662b);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a() + aue.m4146b(1, this.f2661a);
        return this.f2662b != null ? a + aue.m4146b(2, this.f2662b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2661a = aud.mo11264f();
            } else if (a == 18) {
                this.f2662b = aud.mo11264f();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
