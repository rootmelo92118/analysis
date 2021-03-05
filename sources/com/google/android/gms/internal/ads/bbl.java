package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class bbl extends beh implements bkc {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bas f3435b;

    /* renamed from: c */
    private final baz f3436c;

    /* renamed from: d */
    private boolean f3437d;

    /* renamed from: e */
    private boolean f3438e;

    /* renamed from: f */
    private MediaFormat f3439f;

    /* renamed from: g */
    private int f3440g;

    /* renamed from: h */
    private int f3441h;

    /* renamed from: i */
    private long f3442i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f3443j;

    public bbl(bek bek) {
        this(bek, (bcb<Object>) null, true);
    }

    /* renamed from: a */
    protected static void m4821a(int i, long j, long j2) {
    }

    /* renamed from: b */
    protected static void m4824b(int i) {
    }

    /* renamed from: v */
    protected static void m4825v() {
    }

    /* renamed from: c */
    public final bkc mo11456c() {
        return this;
    }

    private bbl(bek bek, bcb<Object> bcb, boolean z) {
        this(bek, (bcb<Object>) null, true, (Handler) null, (bar) null);
    }

    private bbl(bek bek, bcb<Object> bcb, boolean z, Handler handler, bar bar) {
        this(bek, (bcb<Object>) null, true, (Handler) null, (bar) null, (bao) null, new bap[0]);
    }

    private bbl(bek bek, bcb<Object> bcb, boolean z, Handler handler, bar bar, bao bao, bap... bapArr) {
        super(1, bek, bcb, z);
        this.f3436c = new baz((bao) null, bapArr, new bbn(this));
        this.f3435b = new bas((Handler) null, (bar) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11623a(bek bek, zzfs zzfs) {
        String str = zzfs.f7209e;
        if (!bkd.m5753a(str)) {
            return 0;
        }
        int i = bkp.f4570a >= 21 ? 16 : 0;
        int i2 = 3;
        if (m4823a(str) && bek.mo11748a() != null) {
            return i | 4 | 3;
        }
        beg a = bek.mo11749a(str, false);
        boolean z = true;
        if (a == null) {
            return 1;
        }
        if (bkp.f4570a >= 21 && ((zzfs.f7219o != -1 && !a.mo11735a(zzfs.f7219o)) || (zzfs.f7218n != -1 && !a.mo11738b(zzfs.f7218n)))) {
            z = false;
        }
        if (!z) {
            i2 = 2;
        }
        return i | 4 | i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final beg mo11625a(bek bek, zzfs zzfs, boolean z) {
        beg a;
        if (!m4823a(zzfs.f7209e) || (a = bek.mo11748a()) == null) {
            this.f3437d = false;
            return super.mo11625a(bek, zzfs, z);
        }
        this.f3437d = true;
        return a;
    }

    /* renamed from: a */
    private final boolean m4823a(String str) {
        return this.f3436c.mo11572a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11627a(beg beg, MediaCodec mediaCodec, zzfs zzfs, MediaCrypto mediaCrypto) {
        this.f3438e = bkp.f4570a < 24 && "OMX.SEC.aac.dec".equals(beg.f3930a) && "samsung".equals(bkp.f4572c) && (bkp.f4571b.startsWith("zeroflte") || bkp.f4571b.startsWith("herolte") || bkp.f4571b.startsWith("heroqlte"));
        if (this.f3437d) {
            this.f3439f = zzfs.mo13411b();
            this.f3439f.setString("mime", "audio/raw");
            mediaCodec.configure(this.f3439f, (Surface) null, (MediaCrypto) null, 0);
            this.f3439f.setString("mime", zzfs.f7209e);
            return;
        }
        mediaCodec.configure(zzfs.mo13411b(), (Surface) null, (MediaCrypto) null, 0);
        this.f3439f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11628a(String str, long j, long j2) {
        this.f3435b.mo11558a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11630b(zzfs zzfs) {
        super.mo11630b(zzfs);
        this.f3435b.mo11557a(zzfs);
        this.f3440g = "audio/raw".equals(zzfs.f7209e) ? zzfs.f7220p : 2;
        this.f3441h = zzfs.f7218n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11626a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        boolean z = this.f3439f != null;
        String string = z ? this.f3439f.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.f3439f;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f3438e || integer != 6 || this.f3441h >= 6) {
            iArr = null;
        } else {
            iArr = new int[this.f3441h];
            for (int i = 0; i < this.f3441h; i++) {
                iArr[i] = i;
            }
        }
        try {
            this.f3436c.mo11571a(string, integer, integer2, this.f3440g, 0, iArr);
        } catch (bbd e) {
            throw azm.m4559a(e, mo11471r());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11451a(boolean z) {
        super.mo11451a(z);
        this.f3435b.mo11556a(this.f3950a);
        int i = mo11470q().f3277b;
        if (i != 0) {
            this.f3436c.mo11575b(i);
        } else {
            this.f3436c.mo11580g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11449a(long j, boolean z) {
        super.mo11449a(j, z);
        this.f3436c.mo11582i();
        this.f3442i = j;
        this.f3443j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11467n() {
        super.mo11467n();
        this.f3436c.mo11568a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo11468o() {
        this.f3436c.mo11581h();
        super.mo11468o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo11469p() {
        try {
            this.f3436c.mo11583j();
            try {
                super.mo11469p();
            } finally {
                this.f3950a.mo11653a();
                this.f3435b.mo11559b(this.f3950a);
            }
        } catch (Throwable th) {
            super.mo11469p();
            throw th;
        } finally {
            this.f3950a.mo11653a();
            this.f3435b.mo11559b(this.f3950a);
        }
    }

    /* renamed from: u */
    public final boolean mo11520u() {
        return super.mo11520u() && this.f3436c.mo11577d();
    }

    /* renamed from: t */
    public final boolean mo11519t() {
        return this.f3436c.mo11578e() || super.mo11519t();
    }

    /* renamed from: w */
    public final long mo11631w() {
        long a = this.f3436c.mo11566a(mo11520u());
        if (a != Long.MIN_VALUE) {
            if (!this.f3443j) {
                a = Math.max(this.f3442i, a);
            }
            this.f3442i = a;
            this.f3443j = false;
        }
        return this.f3442i;
    }

    /* renamed from: a */
    public final bae mo11624a(bae bae) {
        return this.f3436c.mo11567a(bae);
    }

    /* renamed from: x */
    public final bae mo11632x() {
        return this.f3436c.mo11579f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11629a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f3437d && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f3950a.f3503e++;
            this.f3436c.mo11574b();
            return true;
        } else {
            try {
                if (!this.f3436c.mo11573a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f3950a.f3502d++;
                return true;
            } catch (bbe | bbi e) {
                throw azm.m4559a(e, mo11471r());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo11633y() {
        try {
            this.f3436c.mo11576c();
        } catch (bbi e) {
            throw azm.m4559a(e, mo11471r());
        }
    }

    /* renamed from: a */
    public final void mo11447a(int i, Object obj) {
        switch (i) {
            case 2:
                this.f3436c.mo11569a(((Float) obj).floatValue());
                return;
            case 3:
                this.f3436c.mo11570a(((Integer) obj).intValue());
                return;
            default:
                super.mo11447a(i, obj);
                return;
        }
    }
}
