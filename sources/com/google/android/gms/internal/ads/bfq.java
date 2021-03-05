package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

public final class bfq implements bfu, bfv {

    /* renamed from: a */
    private final Uri f4117a;

    /* renamed from: b */
    private final bjf f4118b;

    /* renamed from: c */
    private final bck f4119c;

    /* renamed from: d */
    private final int f4120d = -1;

    /* renamed from: e */
    private final Handler f4121e;

    /* renamed from: f */
    private final bfr f4122f;

    /* renamed from: g */
    private final bal f4123g;

    /* renamed from: h */
    private final String f4124h;

    /* renamed from: i */
    private final int f4125i;

    /* renamed from: j */
    private bfv f4126j;

    /* renamed from: k */
    private baj f4127k;

    /* renamed from: l */
    private boolean f4128l;

    public bfq(Uri uri, bjf bjf, bck bck, int i, Handler handler, bfr bfr, String str, int i2) {
        this.f4117a = uri;
        this.f4118b = bjf;
        this.f4119c = bck;
        this.f4121e = handler;
        this.f4122f = bfr;
        this.f4124h = null;
        this.f4125i = i2;
        this.f4123g = new bal();
    }

    /* renamed from: a */
    public final void mo11846a() {
    }

    /* renamed from: a */
    public final void mo11847a(azn azn, boolean z, bfv bfv) {
        this.f4126j = bfv;
        this.f4127k = new bge(-9223372036854775807L, false);
        bfv.mo11492a(this.f4127k, (Object) null);
    }

    /* renamed from: a */
    public final bfs mo11845a(int i, bjc bjc) {
        bjy.m5689a(i == 0);
        return new bfi(this.f4117a, this.f4118b.mo10259a(), this.f4119c.mo10265a(), this.f4120d, this.f4121e, this.f4122f, this, bjc, (String) null, this.f4125i);
    }

    /* renamed from: a */
    public final void mo11848a(bfs bfs) {
        ((bfi) bfs).mo11827b();
    }

    /* renamed from: b */
    public final void mo11849b() {
        this.f4126j = null;
    }

    /* renamed from: a */
    public final void mo11492a(baj baj, Object obj) {
        boolean z = false;
        if (baj.mo11526a(0, this.f4123g, false).f3281c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f4128l || z) {
            this.f4127k = baj;
            this.f4128l = z;
            this.f4126j.mo11492a(this.f4127k, (Object) null);
        }
    }
}
