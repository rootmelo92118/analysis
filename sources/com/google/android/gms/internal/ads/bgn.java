package com.google.android.gms.internal.ads;

final class bgn implements bcq {

    /* renamed from: a */
    public zzfs f4204a;

    /* renamed from: b */
    private final int f4205b;

    /* renamed from: c */
    private final int f4206c;

    /* renamed from: d */
    private final zzfs f4207d;

    /* renamed from: e */
    private bcq f4208e;

    public bgn(int i, int i2, zzfs zzfs) {
        this.f4205b = i;
        this.f4206c = i2;
        this.f4207d = zzfs;
    }

    /* renamed from: a */
    public final void mo11907a(bgo bgo) {
        if (bgo == null) {
            this.f4208e = new bcf();
            return;
        }
        this.f4208e = bgo.mo11900a(this.f4205b, this.f4206c);
        if (this.f4208e != null) {
            this.f4208e.mo11682a(this.f4204a);
        }
    }

    /* renamed from: a */
    public final void mo11682a(zzfs zzfs) {
        this.f4204a = zzfs.mo13408a(this.f4207d);
        this.f4208e.mo11682a(this.f4204a);
    }

    /* renamed from: a */
    public final int mo11679a(bci bci, int i, boolean z) {
        return this.f4208e.mo11679a(bci, i, z);
    }

    /* renamed from: a */
    public final void mo11681a(bkh bkh, int i) {
        this.f4208e.mo11681a(bkh, i);
    }

    /* renamed from: a */
    public final void mo11680a(long j, int i, int i2, int i3, bcr bcr) {
        this.f4208e.mo11680a(j, i, i2, i3, bcr);
    }
}
