package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;

public final class bgw extends bgj {

    /* renamed from: j */
    private final int f4243j;

    /* renamed from: k */
    private final zzfs f4244k;

    /* renamed from: l */
    private volatile int f4245l;

    /* renamed from: m */
    private volatile boolean f4246m;

    /* renamed from: n */
    private volatile boolean f4247n;

    public bgw(bje bje, bji bji, zzfs zzfs, int i, Object obj, long j, long j2, int i2, int i3, zzfs zzfs2) {
        super(bje, bji, zzfs, i, obj, j, j2, i2);
        this.f4243j = i3;
        this.f4244k = zzfs2;
    }

    /* renamed from: g */
    public final boolean mo11921g() {
        return this.f4247n;
    }

    /* renamed from: e */
    public final long mo11903e() {
        return (long) this.f4245l;
    }

    /* renamed from: a */
    public final void mo11839a() {
        this.f4246m = true;
    }

    /* renamed from: b */
    public final boolean mo11841b() {
        return this.f4246m;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo11842c() {
        try {
            long a = this.f4196h.mo10212a(bkp.m5814a(this.f4189a, this.f4245l));
            if (a != -1) {
                a += (long) this.f4245l;
            }
            bce bce = new bce(this.f4196h, (long) this.f4245l, a);
            bgk d = mo11899d();
            d.mo11901a(0);
            bcq a2 = d.mo11900a(0, this.f4243j);
            a2.mo11682a(this.f4244k);
            for (int i = 0; i != -1; i = a2.mo11679a(bce, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true)) {
                this.f4245l += i;
            }
            a2.mo11680a(this.f4194f, 1, this.f4245l, 0, (bcr) null);
            bkp.m5817a(this.f4196h);
            this.f4247n = true;
        } catch (Throwable th) {
            bkp.m5817a(this.f4196h);
            throw th;
        }
    }
}
