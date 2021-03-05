package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;

/* renamed from: com.google.android.gms.internal.measurement.dj */
public abstract class C1971dj {

    /* renamed from: a */
    int f7596a;

    /* renamed from: b */
    int f7597b;

    /* renamed from: c */
    C1974dm f7598c;

    /* renamed from: d */
    private int f7599d;

    /* renamed from: e */
    private boolean f7600e;

    /* renamed from: a */
    public static C1971dj m9112a(byte[] bArr, int i, int i2) {
        return m9113a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public abstract int mo13619a();

    /* renamed from: a */
    public abstract <T extends C2043fq> T mo13620a(C2055gb<T> gbVar, C1988dv dvVar);

    /* renamed from: a */
    public abstract void mo13621a(int i);

    /* renamed from: b */
    public abstract double mo13622b();

    /* renamed from: b */
    public abstract boolean mo13623b(int i);

    /* renamed from: c */
    public abstract float mo13624c();

    /* renamed from: d */
    public abstract int mo13626d(int i);

    /* renamed from: d */
    public abstract long mo13627d();

    /* renamed from: e */
    public abstract long mo13628e();

    /* renamed from: e */
    public abstract void mo13629e(int i);

    /* renamed from: f */
    public abstract int mo13630f();

    /* renamed from: f */
    public abstract void mo13631f(int i);

    /* renamed from: g */
    public abstract long mo13632g();

    /* renamed from: h */
    public abstract int mo13633h();

    /* renamed from: i */
    public abstract boolean mo13634i();

    /* renamed from: j */
    public abstract String mo13635j();

    /* renamed from: k */
    public abstract String mo13636k();

    /* renamed from: l */
    public abstract C1958cx mo13637l();

    /* renamed from: m */
    public abstract int mo13638m();

    /* renamed from: n */
    public abstract int mo13639n();

    /* renamed from: o */
    public abstract int mo13640o();

    /* renamed from: p */
    public abstract long mo13641p();

    /* renamed from: q */
    public abstract int mo13642q();

    /* renamed from: r */
    public abstract long mo13643r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract long mo13644s();

    /* renamed from: t */
    public abstract boolean mo13645t();

    /* renamed from: u */
    public abstract int mo13646u();

    /* renamed from: a */
    static C1971dj m9113a(byte[] bArr, int i, int i2, boolean z) {
        C1973dl dlVar = new C1973dl(bArr, i, i2, false);
        try {
            dlVar.mo13626d(i2);
            return dlVar;
        } catch (C2015ep e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C1971dj() {
        this.f7597b = 100;
        this.f7599d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7600e = false;
    }

    /* renamed from: c */
    public final int mo13625c(int i) {
        if (i >= 0) {
            int i2 = this.f7597b;
            this.f7597b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
