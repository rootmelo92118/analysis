package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

public final class bey {

    /* renamed from: a */
    private final Handler f3994a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bex f3995b;

    /* renamed from: c */
    private final long f3996c;

    public bey(Handler handler, bex bex) {
        this(handler, bex, 0);
    }

    private bey(Handler handler, bex bex, long j) {
        this.f3994a = bex != null ? (Handler) bjy.m5688a(handler) : null;
        this.f3995b = bex;
        this.f3996c = j;
    }

    /* renamed from: a */
    public final bey mo11769a(long j) {
        return new bey(this.f3994a, this.f3995b, j);
    }

    /* renamed from: a */
    public final void mo11774a(bji bji, int i, long j) {
        mo11771a(bji, i, -1, (zzfs) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
    }

    /* renamed from: a */
    public final void mo11771a(bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3) {
        if (this.f3995b != null) {
            Handler handler = this.f3994a;
            bez bez = r0;
            bez bez2 = new bez(this, bji, i, i2, zzfs, i3, obj, j, j2, j3);
            handler.post(bez);
        }
    }

    /* renamed from: a */
    public final void mo11775a(bji bji, int i, long j, long j2, long j3) {
        mo11772a(bji, i, -1, (zzfs) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    /* renamed from: a */
    public final void mo11772a(bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        if (this.f3995b != null) {
            bfa bfa = r0;
            bfa bfa2 = new bfa(this, bji, i, i2, zzfs, i3, obj, j, j2, j3, j4, j5);
            this.f3994a.post(bfa);
        }
    }

    /* renamed from: b */
    public final void mo11778b(bji bji, int i, long j, long j2, long j3) {
        mo11777b(bji, i, -1, (zzfs) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    /* renamed from: b */
    public final void mo11777b(bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        if (this.f3995b != null) {
            bfb bfb = r0;
            bfb bfb2 = new bfb(this, bji, i, i2, zzfs, i3, obj, j, j2, j3, j4, j5);
            this.f3994a.post(bfb);
        }
    }

    /* renamed from: a */
    public final void mo11776a(bji bji, int i, long j, long j2, long j3, IOException iOException, boolean z) {
        mo11773a(bji, i, -1, (zzfs) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
    }

    /* renamed from: a */
    public final void mo11773a(bji bji, int i, int i2, zzfs zzfs, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        if (this.f3995b != null) {
            bfc bfc = r0;
            bfc bfc2 = new bfc(this, bji, i, i2, zzfs, i3, obj, j, j2, j3, j4, j5, iOException, z);
            this.f3994a.post(bfc);
        }
    }

    /* renamed from: a */
    public final void mo11770a(int i, zzfs zzfs, int i2, Object obj, long j) {
        if (this.f3995b != null) {
            this.f3994a.post(new bfd(this, i, zzfs, i2, obj, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final long m5165b(long j) {
        long a = azl.m4556a(j);
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3996c + a;
    }
}
