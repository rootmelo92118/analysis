package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

public final class bhb implements bfu {

    /* renamed from: a */
    private final boolean f4269a;

    /* renamed from: b */
    private final bjf f4270b;

    /* renamed from: c */
    private final bgy f4271c;

    /* renamed from: d */
    private final int f4272d;

    /* renamed from: e */
    private final long f4273e;

    /* renamed from: f */
    private final bey f4274f;

    /* renamed from: g */
    private final bjw<? extends bhr> f4275g;

    /* renamed from: h */
    private final bhg f4276h;

    /* renamed from: i */
    private final Object f4277i;

    /* renamed from: j */
    private final SparseArray<bgz> f4278j;

    /* renamed from: k */
    private final Runnable f4279k;

    /* renamed from: l */
    private final Runnable f4280l;

    /* renamed from: m */
    private bfv f4281m;

    /* renamed from: n */
    private bje f4282n;

    /* renamed from: o */
    private bjp f4283o;

    /* renamed from: p */
    private bju f4284p;

    /* renamed from: q */
    private Uri f4285q;

    /* renamed from: r */
    private long f4286r;

    /* renamed from: s */
    private long f4287s;

    /* renamed from: t */
    private bhr f4288t;

    /* renamed from: u */
    private Handler f4289u;

    /* renamed from: v */
    private long f4290v;

    /* renamed from: w */
    private int f4291w;

    public bhb(Uri uri, bjf bjf, bgy bgy, Handler handler, bex bex) {
        this(uri, bjf, bgy, 3, -1, handler, (bex) null);
    }

    private bhb(Uri uri, bjf bjf, bgy bgy, int i, long j, Handler handler, bex bex) {
        this(uri, bjf, new bhs(), bgy, 3, -1, handler, (bex) null);
    }

    private bhb(Uri uri, bjf bjf, bjw<? extends bhr> bjw, bgy bgy, int i, long j, Handler handler, bex bex) {
        this((bhr) null, uri, bjf, bjw, bgy, 3, -1, handler, bex);
    }

    private bhb(bhr bhr, Uri uri, bjf bjf, bjw<? extends bhr> bjw, bgy bgy, int i, long j, Handler handler, bex bex) {
        this.f4288t = null;
        this.f4285q = uri;
        this.f4270b = bjf;
        this.f4275g = bjw;
        this.f4271c = bgy;
        this.f4272d = i;
        this.f4273e = j;
        this.f4269a = false;
        this.f4274f = new bey(handler, bex);
        this.f4277i = new Object();
        this.f4278j = new SparseArray<>();
        this.f4276h = new bhg(this, (bhc) null);
        this.f4279k = new bhc(this);
        this.f4280l = new bhd(this);
    }

    /* renamed from: a */
    public final void mo11847a(azn azn, boolean z, bfv bfv) {
        this.f4281m = bfv;
        this.f4282n = this.f4270b.mo10259a();
        this.f4283o = new bjp("Loader:DashMediaSource");
        this.f4284p = this.f4283o;
        this.f4289u = new Handler();
        m5452c();
    }

    /* renamed from: a */
    public final void mo11846a() {
        this.f4284p.mo12026c();
    }

    /* renamed from: a */
    public final bfs mo11845a(int i, bjc bjc) {
        int i2 = i;
        bgz bgz = new bgz(this.f4291w + i, this.f4288t, i2, this.f4271c, this.f4272d, this.f4274f.mo11769a(this.f4288t.mo11956a(i).f4360b), this.f4290v, this.f4284p, bjc);
        this.f4278j.put(bgz.f4248a, bgz);
        return bgz;
    }

    /* renamed from: a */
    public final void mo11848a(bfs bfs) {
        bgz bgz = (bgz) bfs;
        bgz.mo11925b();
        this.f4278j.remove(bgz.f4248a);
    }

    /* renamed from: b */
    public final void mo11849b() {
        this.f4282n = null;
        this.f4284p = null;
        if (this.f4283o != null) {
            this.f4283o.mo12023a((Runnable) null);
            this.f4283o = null;
        }
        this.f4286r = 0;
        this.f4287s = 0;
        this.f4288t = null;
        if (this.f4289u != null) {
            this.f4289u.removeCallbacksAndMessages((Object) null);
            this.f4289u = null;
        }
        this.f4290v = 0;
        this.f4278j.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11932a(bjv<bhr> bjv, long j, long j2) {
        this.f4274f.mo11775a(bjv.f4510a, bjv.f4511b, j, j2, bjv.mo12033e());
        bhr d = bjv.mo12032d();
        int i = 0;
        int a = this.f4288t == null ? 0 : this.f4288t.mo11955a();
        long j3 = d.mo11956a(0).f4360b;
        while (i < a && this.f4288t.mo11956a(i).f4360b < j3) {
            i++;
        }
        if (a - i > d.mo11955a()) {
            Log.w("DashMediaSource", "Out of sync manifest");
            m5453d();
            return;
        }
        this.f4288t = d;
        this.f4286r = j - j2;
        this.f4287s = j;
        if (this.f4288t.f4342g != null) {
            synchronized (this.f4277i) {
                if (bjv.f4510a.f4453a == this.f4285q) {
                    this.f4285q = this.f4288t.f4342g;
                }
            }
        }
        if (a != 0) {
            this.f4291w += i;
            m5451a(true);
        } else if (this.f4288t.f4341f != null) {
            bik bik = this.f4288t.f4341f;
            String str = bik.f4397a;
            if (bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    m5445a(bkp.m5827e(bik.f4398b) - this.f4287s);
                } catch (bad e) {
                    m5450a((IOException) e);
                }
            } else if (bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
                m5448a(bik, (bjw<Long>) new bhf((bhc) null));
            } else if (bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || bkp.m5820a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
                m5448a(bik, (bjw<Long>) new bhk((bhc) null));
            } else {
                m5450a(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            m5451a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11931a(bjv<bhr> bjv, long j, long j2, IOException iOException) {
        bjv<bhr> bjv2 = bjv;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof bad;
        this.f4274f.mo11776a(bjv2.f4510a, bjv2.f4511b, j, j2, bjv.mo12033e(), iOException2, z);
        return z ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11934b(bjv<Long> bjv, long j, long j2) {
        this.f4274f.mo11775a(bjv.f4510a, bjv.f4511b, j, j2, bjv.mo12033e());
        m5445a(bjv.mo12032d().longValue() - j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo11933b(bjv<Long> bjv, long j, long j2, IOException iOException) {
        bjv<Long> bjv2 = bjv;
        bey bey = this.f4274f;
        bji bji = bjv2.f4510a;
        int i = bjv2.f4511b;
        bey.mo11776a(bji, i, j, j2, bjv.mo12033e(), iOException, true);
        m5450a(iOException);
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11935c(bjv<?> bjv, long j, long j2) {
        this.f4274f.mo11778b(bjv.f4510a, bjv.f4511b, j, j2, bjv.mo12033e());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m5452c() {
        Uri uri;
        synchronized (this.f4277i) {
            uri = this.f4285q;
        }
        m5449a(new bjv(this.f4282n, uri, 4, this.f4275g), this.f4276h, this.f4272d);
    }

    /* renamed from: a */
    private final void m5448a(bik bik, bjw<Long> bjw) {
        m5449a(new bjv(this.f4282n, Uri.parse(bik.f4398b), 5, bjw), new bhj(this, (bhc) null), 1);
    }

    /* renamed from: a */
    private final void m5445a(long j) {
        this.f4290v = j;
        m5451a(true);
    }

    /* renamed from: a */
    private final void m5450a(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        m5451a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m5451a(boolean z) {
        long j;
        boolean z2;
        long j2;
        long b;
        for (int i = 0; i < this.f4278j.size(); i++) {
            int keyAt = this.f4278j.keyAt(i);
            if (keyAt >= this.f4291w) {
                this.f4278j.valueAt(i).mo11924a(this.f4288t, keyAt - this.f4291w);
            }
        }
        int a = this.f4288t.mo11955a() - 1;
        bhi a2 = bhi.m5476a(this.f4288t.mo11956a(0), this.f4288t.mo11957b(0));
        bhi a3 = bhi.m5476a(this.f4288t.mo11956a(a), this.f4288t.mo11957b(a));
        long j3 = a2.f4308b;
        long j4 = a3.f4309c;
        long j5 = 0;
        if (!this.f4288t.f4337b || a3.f4307a) {
            j = j3;
            z2 = false;
        } else {
            if (this.f4290v != 0) {
                j2 = azl.m4557b(SystemClock.elapsedRealtime() + this.f4290v);
            } else {
                j2 = azl.m4557b(System.currentTimeMillis());
            }
            j4 = Math.min((j2 - azl.m4557b(this.f4288t.f4336a)) - azl.m4557b(this.f4288t.mo11956a(a).f4360b), j4);
            if (this.f4288t.f4339d != -9223372036854775807L) {
                long b2 = j4 - azl.m4557b(this.f4288t.f4339d);
                while (b2 < 0 && a > 0) {
                    a--;
                    b2 += this.f4288t.mo11957b(a);
                }
                if (a == 0) {
                    b = Math.max(j3, b2);
                } else {
                    b = this.f4288t.mo11957b(0);
                }
                j3 = b;
            }
            j = j3;
            z2 = true;
        }
        long j6 = j4 - j;
        for (int i2 = 0; i2 < this.f4288t.mo11955a() - 1; i2++) {
            j6 += this.f4288t.mo11957b(i2);
        }
        if (this.f4288t.f4337b) {
            long j7 = this.f4273e;
            if (j7 == -1) {
                j7 = this.f4288t.f4340e != -9223372036854775807L ? this.f4288t.f4340e : 30000;
            }
            j5 = j6 - azl.m4557b(j7);
            if (j5 < 5000000) {
                j5 = Math.min(5000000, j6 / 2);
            }
        }
        this.f4281m.mo11492a(new bhe(this.f4288t.f4336a, this.f4288t.f4336a + this.f4288t.mo11956a(0).f4360b + azl.m4556a(j), this.f4291w, j, j6, j5, this.f4288t), this.f4288t);
        this.f4289u.removeCallbacks(this.f4280l);
        if (z2) {
            this.f4289u.postDelayed(this.f4280l, 5000);
        }
        if (z) {
            m5453d();
        }
    }

    /* renamed from: d */
    private final void m5453d() {
        if (this.f4288t.f4337b) {
            long j = this.f4288t.f4338c;
            if (j == 0) {
                j = 5000;
            }
            this.f4289u.postDelayed(this.f4279k, Math.max(0, (this.f4286r + j) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    private final <T> void m5449a(bjv<T> bjv, bjq<bjv<T>> bjq, int i) {
        this.f4274f.mo11774a(bjv.f4510a, bjv.f4511b, this.f4283o.mo12021a(bjv, bjq, i));
    }
}
