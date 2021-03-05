package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;

public abstract class apo {

    /* renamed from: a */
    int f2189a;

    /* renamed from: b */
    int f2190b;

    /* renamed from: c */
    apr f2191c;

    /* renamed from: d */
    private int f2192d;

    /* renamed from: e */
    private boolean f2193e;

    /* renamed from: a */
    public static long m3030a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static apo m3031a(byte[] bArr, int i, int i2) {
        return m3032a(bArr, i, i2, false);
    }

    /* renamed from: g */
    public static int m3033g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo10817a();

    /* renamed from: a */
    public abstract <T extends arw> T mo10818a(ash<T> ash, apz apz);

    /* renamed from: a */
    public abstract void mo10819a(int i);

    /* renamed from: b */
    public abstract double mo10820b();

    /* renamed from: b */
    public abstract boolean mo10821b(int i);

    /* renamed from: c */
    public abstract float mo10822c();

    /* renamed from: d */
    public abstract int mo10824d(int i);

    /* renamed from: d */
    public abstract long mo10825d();

    /* renamed from: e */
    public abstract long mo10826e();

    /* renamed from: e */
    public abstract void mo10827e(int i);

    /* renamed from: f */
    public abstract int mo10828f();

    /* renamed from: f */
    public abstract void mo10829f(int i);

    /* renamed from: g */
    public abstract long mo10830g();

    /* renamed from: h */
    public abstract int mo10831h();

    /* renamed from: i */
    public abstract boolean mo10832i();

    /* renamed from: j */
    public abstract String mo10833j();

    /* renamed from: k */
    public abstract String mo10834k();

    /* renamed from: l */
    public abstract apc mo10835l();

    /* renamed from: m */
    public abstract int mo10836m();

    /* renamed from: n */
    public abstract int mo10837n();

    /* renamed from: o */
    public abstract int mo10838o();

    /* renamed from: p */
    public abstract long mo10839p();

    /* renamed from: q */
    public abstract int mo10840q();

    /* renamed from: r */
    public abstract long mo10841r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract long mo10842s();

    /* renamed from: t */
    public abstract boolean mo10843t();

    /* renamed from: u */
    public abstract int mo10844u();

    /* renamed from: a */
    static apo m3032a(byte[] bArr, int i, int i2, boolean z) {
        apq apq = new apq(bArr, i, i2, z);
        try {
            apq.mo10824d(i2);
            return apq;
        } catch (aqv e) {
            throw new IllegalArgumentException(e);
        }
    }

    private apo() {
        this.f2190b = 100;
        this.f2192d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2193e = false;
    }

    /* renamed from: c */
    public final int mo10823c(int i) {
        if (i >= 0) {
            int i2 = this.f2190b;
            this.f2190b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
