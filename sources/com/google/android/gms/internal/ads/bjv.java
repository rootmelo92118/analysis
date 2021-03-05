package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.Closeable;

public final class bjv<T> implements bjs {

    /* renamed from: a */
    public final bji f4510a;

    /* renamed from: b */
    public final int f4511b;

    /* renamed from: c */
    private final bje f4512c;

    /* renamed from: d */
    private final bjw<? extends T> f4513d;

    /* renamed from: e */
    private volatile T f4514e;

    /* renamed from: f */
    private volatile boolean f4515f;

    /* renamed from: g */
    private volatile long f4516g;

    public bjv(bje bje, Uri uri, int i, bjw<? extends T> bjw) {
        this.f4512c = bje;
        this.f4510a = new bji(uri, 1);
        this.f4511b = i;
        this.f4513d = bjw;
    }

    /* renamed from: d */
    public final T mo12032d() {
        return this.f4514e;
    }

    /* renamed from: e */
    public final long mo12033e() {
        return this.f4516g;
    }

    /* renamed from: a */
    public final void mo11839a() {
        this.f4515f = true;
    }

    /* renamed from: b */
    public final boolean mo11841b() {
        return this.f4515f;
    }

    /* renamed from: c */
    public final void mo11842c() {
        bjh bjh = new bjh(this.f4512c, this.f4510a);
        try {
            bjh.mo12009b();
            this.f4514e = this.f4513d.mo11938a(this.f4512c.mo10214b(), bjh);
        } finally {
            this.f4516g = bjh.mo12008a();
            bkp.m5818a((Closeable) bjh);
        }
    }
}
