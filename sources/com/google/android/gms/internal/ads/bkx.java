package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class bkx extends beh {

    /* renamed from: c */
    private static final int[] f4593c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A */
    private int f4594A;

    /* renamed from: B */
    private int f4595B;

    /* renamed from: C */
    private int f4596C;

    /* renamed from: D */
    private float f4597D;

    /* renamed from: E */
    private boolean f4598E;

    /* renamed from: F */
    private int f4599F;

    /* renamed from: G */
    private long f4600G;

    /* renamed from: H */
    private int f4601H;

    /* renamed from: b */
    bla f4602b;

    /* renamed from: d */
    private final Context f4603d;

    /* renamed from: e */
    private final blb f4604e;

    /* renamed from: f */
    private final ble f4605f;

    /* renamed from: g */
    private final long f4606g;

    /* renamed from: h */
    private final int f4607h;

    /* renamed from: i */
    private final boolean f4608i;

    /* renamed from: j */
    private final long[] f4609j;

    /* renamed from: k */
    private zzfs[] f4610k;

    /* renamed from: l */
    private bkz f4611l;

    /* renamed from: m */
    private Surface f4612m;

    /* renamed from: n */
    private Surface f4613n;

    /* renamed from: o */
    private int f4614o;

    /* renamed from: p */
    private boolean f4615p;

    /* renamed from: q */
    private long f4616q;

    /* renamed from: r */
    private long f4617r;

    /* renamed from: s */
    private int f4618s;

    /* renamed from: t */
    private int f4619t;

    /* renamed from: u */
    private int f4620u;

    /* renamed from: v */
    private float f4621v;

    /* renamed from: w */
    private int f4622w;

    /* renamed from: x */
    private int f4623x;

    /* renamed from: y */
    private int f4624y;

    /* renamed from: z */
    private float f4625z;

    public bkx(Context context, bek bek, long j, Handler handler, bld bld, int i) {
        this(context, bek, 0, (bcb<Object>) null, false, handler, bld, -1);
    }

    /* renamed from: c */
    private static boolean m5849c(long j) {
        return j < -30000;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private bkx(Context context, bek bek, long j, bcb<Object> bcb, boolean z, Handler handler, bld bld, int i) {
        super(2, bek, (bcb<Object>) null, false);
        boolean z2 = false;
        this.f4606g = 0;
        this.f4607h = -1;
        this.f4603d = context.getApplicationContext();
        this.f4604e = new blb(context);
        this.f4605f = new ble(handler, bld);
        if (bkp.f4570a <= 22 && "foster".equals(bkp.f4571b) && "NVIDIA".equals(bkp.f4572c)) {
            z2 = true;
        }
        this.f4608i = z2;
        this.f4609j = new long[10];
        this.f4600G = -9223372036854775807L;
        this.f4616q = -9223372036854775807L;
        this.f4622w = -1;
        this.f4623x = -1;
        this.f4625z = -1.0f;
        this.f4621v = -1.0f;
        this.f4614o = 1;
        m5838D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11623a(bek bek, zzfs zzfs) {
        boolean z;
        String str = zzfs.f7209e;
        int i = 0;
        if (!bkd.m5754b(str)) {
            return 0;
        }
        zzhp zzhp = zzfs.f7212h;
        if (zzhp != null) {
            z = false;
            for (int i2 = 0; i2 < zzhp.f7231a; i2++) {
                z |= zzhp.mo13417a(i2).f7234a;
            }
        } else {
            z = false;
        }
        beg a = bek.mo11749a(str, z);
        if (a == null) {
            return 1;
        }
        boolean b = a.mo11739b(zzfs.f7207c);
        if (b && zzfs.f7213i > 0 && zzfs.f7214j > 0) {
            if (bkp.f4570a >= 21) {
                b = a.mo11736a(zzfs.f7213i, zzfs.f7214j, (double) zzfs.f7215k);
            } else {
                b = zzfs.f7213i * zzfs.f7214j <= bem.m5143b();
                if (!b) {
                    int i3 = zzfs.f7213i;
                    int i4 = zzfs.f7214j;
                    String str2 = bkp.f4574e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i3);
                    sb.append("x");
                    sb.append(i4);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i5 = a.f3931b ? 8 : 4;
        if (a.f3932c) {
            i = 16;
        }
        return (b ? 3 : 2) | i5 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11451a(boolean z) {
        super.mo11451a(z);
        this.f4599F = mo11470q().f3277b;
        this.f4598E = this.f4599F != 0;
        this.f4605f.mo12099a(this.f3950a);
        this.f4604e.mo12090a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11452a(zzfs[] zzfsArr, long j) {
        this.f4610k = zzfsArr;
        if (this.f4600G == -9223372036854775807L) {
            this.f4600G = j;
        } else {
            if (this.f4601H == this.f4609j.length) {
                long j2 = this.f4609j[this.f4601H - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.f4601H++;
            }
            this.f4609j[this.f4601H - 1] = j;
        }
        super.mo11452a(zzfsArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11449a(long j, boolean z) {
        super.mo11449a(j, z);
        m5852x();
        this.f4619t = 0;
        if (this.f4601H != 0) {
            this.f4600G = this.f4609j[this.f4601H - 1];
            this.f4601H = 0;
        }
        if (z) {
            m5851w();
        } else {
            this.f4616q = -9223372036854775807L;
        }
    }

    /* renamed from: t */
    public final boolean mo11519t() {
        if (super.mo11519t() && (this.f4615p || ((this.f4613n != null && this.f4612m == this.f4613n) || mo11740A() == null))) {
            this.f4616q = -9223372036854775807L;
            return true;
        } else if (this.f4616q == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f4616q) {
                return true;
            }
            this.f4616q = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11467n() {
        super.mo11467n();
        this.f4618s = 0;
        this.f4617r = SystemClock.elapsedRealtime();
        this.f4616q = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo11468o() {
        m5841G();
        super.mo11468o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo11469p() {
        this.f4622w = -1;
        this.f4623x = -1;
        this.f4625z = -1.0f;
        this.f4621v = -1.0f;
        this.f4600G = -9223372036854775807L;
        this.f4601H = 0;
        m5838D();
        m5852x();
        this.f4604e.mo12091b();
        this.f4602b = null;
        this.f4598E = false;
        try {
            super.mo11469p();
        } finally {
            this.f3950a.mo11653a();
            this.f4605f.mo12102b(this.f3950a);
        }
    }

    /* renamed from: a */
    public final void mo11447a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                if (this.f4613n != null) {
                    surface = this.f4613n;
                } else {
                    beg B = mo11741B();
                    if (B != null && m5847b(B.f3933d)) {
                        this.f4613n = zzqk.m8820a(this.f4603d, B.f3933d);
                        surface = this.f4613n;
                    }
                }
            }
            if (this.f4612m != surface) {
                this.f4612m = surface;
                int d = mo11457d();
                if (d == 1 || d == 2) {
                    MediaCodec A = mo11740A();
                    if (bkp.f4570a < 23 || A == null || surface == null) {
                        mo11742C();
                        mo11746z();
                    } else {
                        A.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f4613n) {
                    m5838D();
                    m5852x();
                    return;
                }
                m5840F();
                m5852x();
                if (d == 2) {
                    m5851w();
                }
            } else if (surface != null && surface != this.f4613n) {
                m5840F();
                if (this.f4615p) {
                    this.f4605f.mo12098a(this.f4612m);
                }
            }
        } else if (i == 4) {
            this.f4614o = ((Integer) obj).intValue();
            MediaCodec A2 = mo11740A();
            if (A2 != null) {
                A2.setVideoScalingMode(this.f4614o);
            }
        } else {
            super.mo11447a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11745a(beg beg) {
        return this.f4612m != null || m5847b(beg.f3933d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11627a(beg beg, MediaCodec mediaCodec, zzfs zzfs, MediaCrypto mediaCrypto) {
        bkz bkz;
        Point point;
        beg beg2 = beg;
        MediaCodec mediaCodec2 = mediaCodec;
        zzfs zzfs2 = zzfs;
        zzfs[] zzfsArr = this.f4610k;
        int i = zzfs2.f7213i;
        int i2 = zzfs2.f7214j;
        int c = m5848c(zzfs);
        if (zzfsArr.length == 1) {
            bkz = new bkz(i, i2, c);
        } else {
            int i3 = i2;
            int i4 = c;
            boolean z = false;
            int i5 = i;
            for (zzfs zzfs3 : zzfsArr) {
                if (m5845a(beg2.f3931b, zzfs2, zzfs3)) {
                    z |= zzfs3.f7213i == -1 || zzfs3.f7214j == -1;
                    i5 = Math.max(i5, zzfs3.f7213i);
                    int max = Math.max(i3, zzfs3.f7214j);
                    i4 = Math.max(i4, m5848c(zzfs3));
                    i3 = max;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i5);
                sb.append("x");
                sb.append(i3);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzfs2.f7214j > zzfs2.f7213i;
                int i6 = z2 ? zzfs2.f7214j : zzfs2.f7213i;
                int i7 = z2 ? zzfs2.f7213i : zzfs2.f7214j;
                float f = ((float) i7) / ((float) i6);
                int[] iArr = f4593c;
                int length = iArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    int i9 = iArr[i8];
                    int i10 = (int) (((float) i9) * f);
                    if (i9 <= i6 || i10 <= i7) {
                        break;
                    }
                    int i11 = i6;
                    int i12 = i7;
                    if (bkp.f4570a >= 21) {
                        int i13 = z2 ? i10 : i9;
                        if (!z2) {
                            i9 = i10;
                        }
                        Point a = beg2.mo11734a(i13, i9);
                        Point point2 = a;
                        if (beg2.mo11736a(a.x, a.y, (double) zzfs2.f7215k)) {
                            point = point2;
                            break;
                        }
                    } else {
                        int a2 = bkp.m5809a(i9, 16) << 4;
                        int a3 = bkp.m5809a(i10, 16) << 4;
                        if (a2 * a3 <= bem.m5143b()) {
                            int i14 = z2 ? a3 : a2;
                            if (z2) {
                                a3 = a2;
                            }
                            point = new Point(i14, a3);
                        }
                    }
                    i8++;
                    i6 = i11;
                    i7 = i12;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i3 = Math.max(i3, point.y);
                    i4 = Math.max(i4, m5842a(zzfs2.f7209e, i5, i3));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i5);
                    sb2.append("x");
                    sb2.append(i3);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            bkz = new bkz(i5, i3, i4);
        }
        this.f4611l = bkz;
        bkz bkz2 = this.f4611l;
        boolean z3 = this.f4608i;
        int i15 = this.f4599F;
        MediaFormat b = zzfs.mo13411b();
        b.setInteger("max-width", bkz2.f4626a);
        b.setInteger("max-height", bkz2.f4627b);
        if (bkz2.f4628c != -1) {
            b.setInteger("max-input-size", bkz2.f4628c);
        }
        if (z3) {
            b.setInteger("auto-frc", 0);
        }
        if (i15 != 0) {
            b.setFeatureEnabled("tunneled-playback", true);
            b.setInteger("audio-session-id", i15);
        }
        if (this.f4612m == null) {
            bjy.m5691b(m5847b(beg2.f3933d));
            if (this.f4613n == null) {
                this.f4613n = zzqk.m8820a(this.f4603d, beg2.f3933d);
            }
            this.f4612m = this.f4613n;
        }
        mediaCodec2.configure(b, this.f4612m, (MediaCrypto) null, 0);
        if (bkp.f4570a >= 23 && this.f4598E) {
            this.f4602b = new bla(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo11742C() {
        try {
            super.mo11742C();
        } finally {
            if (this.f4613n != null) {
                if (this.f4612m == this.f4613n) {
                    this.f4612m = null;
                }
                this.f4613n.release();
                this.f4613n = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11628a(String str, long j, long j2) {
        this.f4605f.mo12101a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11630b(zzfs zzfs) {
        super.mo11630b(zzfs);
        this.f4605f.mo12100a(zzfs);
        this.f4621v = zzfs.f7217m == -1.0f ? 1.0f : zzfs.f7217m;
        this.f4620u = m5850d(zzfs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11743a(bbw bbw) {
        if (bkp.f4570a < 23 && this.f4598E) {
            mo12087v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11626a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f4622w = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f4623x = i2;
        this.f4625z = this.f4621v;
        if (bkp.f4570a < 21) {
            this.f4624y = this.f4620u;
        } else if (this.f4620u == 90 || this.f4620u == 270) {
            int i3 = this.f4622w;
            this.f4622w = this.f4623x;
            this.f4623x = i3;
            this.f4625z = 1.0f / this.f4625z;
        }
        mediaCodec.setVideoScalingMode(this.f4614o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11744a(MediaCodec mediaCodec, boolean z, zzfs zzfs, zzfs zzfs2) {
        return m5845a(z, zzfs, zzfs2) && zzfs2.f7213i <= this.f4611l.f4626a && zzfs2.f7214j <= this.f4611l.f4627b && zzfs2.f7210f <= this.f4611l.f4628c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11629a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (this.f4601H != 0 && j4 >= this.f4609j[0]) {
            this.f4600G = this.f4609j[0];
            this.f4601H--;
            System.arraycopy(this.f4609j, 1, this.f4609j, 0, this.f4601H);
        }
        long j5 = j4 - this.f4600G;
        if (z) {
            m5843a(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.f4612m == this.f4613n) {
            if (!m5849c(j6)) {
                return false;
            }
            m5843a(mediaCodec2, i3, j5);
            return true;
        } else if (!this.f4615p) {
            if (bkp.f4570a >= 21) {
                m5844a(mediaCodec, i, j5, System.nanoTime());
            } else {
                m5846b(mediaCodec2, i3, j5);
            }
            return true;
        } else if (mo11457d() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a = this.f4604e.mo12089a(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (a - nanoTime) / 1000;
            if (m5849c(j7)) {
                bkn.m5803a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                bkn.m5802a();
                this.f3950a.f3504f++;
                this.f4618s++;
                this.f4619t++;
                this.f3950a.f3505g = Math.max(this.f4619t, this.f3950a.f3505g);
                if (this.f4618s == this.f4607h) {
                    m5841G();
                }
                return true;
            }
            if (bkp.f4570a >= 21) {
                if (j7 < 50000) {
                    m5844a(mediaCodec, i, j5, a);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m5846b(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m5843a(MediaCodec mediaCodec, int i, long j) {
        bkn.m5803a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        bkn.m5802a();
        this.f3950a.f3503e++;
    }

    /* renamed from: b */
    private final void m5846b(MediaCodec mediaCodec, int i, long j) {
        m5839E();
        bkn.m5803a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        bkn.m5802a();
        this.f3950a.f3502d++;
        this.f4619t = 0;
        mo12087v();
    }

    @TargetApi(21)
    /* renamed from: a */
    private final void m5844a(MediaCodec mediaCodec, int i, long j, long j2) {
        m5839E();
        bkn.m5803a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        bkn.m5802a();
        this.f3950a.f3502d++;
        this.f4619t = 0;
        mo12087v();
    }

    /* renamed from: b */
    private final boolean m5847b(boolean z) {
        if (bkp.f4570a < 23 || this.f4598E) {
            return false;
        }
        return !z || zzqk.m8821a(this.f4603d);
    }

    /* renamed from: w */
    private final void m5851w() {
        this.f4616q = this.f4606g > 0 ? SystemClock.elapsedRealtime() + this.f4606g : -9223372036854775807L;
    }

    /* renamed from: x */
    private final void m5852x() {
        MediaCodec A;
        this.f4615p = false;
        if (bkp.f4570a >= 23 && this.f4598E && (A = mo11740A()) != null) {
            this.f4602b = new bla(this, A);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo12087v() {
        if (!this.f4615p) {
            this.f4615p = true;
            this.f4605f.mo12098a(this.f4612m);
        }
    }

    /* renamed from: D */
    private final void m5838D() {
        this.f4594A = -1;
        this.f4595B = -1;
        this.f4597D = -1.0f;
        this.f4596C = -1;
    }

    /* renamed from: E */
    private final void m5839E() {
        if (this.f4594A != this.f4622w || this.f4595B != this.f4623x || this.f4596C != this.f4624y || this.f4597D != this.f4625z) {
            this.f4605f.mo12096a(this.f4622w, this.f4623x, this.f4624y, this.f4625z);
            this.f4594A = this.f4622w;
            this.f4595B = this.f4623x;
            this.f4596C = this.f4624y;
            this.f4597D = this.f4625z;
        }
    }

    /* renamed from: F */
    private final void m5840F() {
        if (this.f4594A != -1 || this.f4595B != -1) {
            this.f4605f.mo12096a(this.f4622w, this.f4623x, this.f4624y, this.f4625z);
        }
    }

    /* renamed from: G */
    private final void m5841G() {
        if (this.f4618s > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f4605f.mo12097a(this.f4618s, elapsedRealtime - this.f4617r);
            this.f4618s = 0;
            this.f4617r = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private static int m5848c(zzfs zzfs) {
        if (zzfs.f7210f != -1) {
            return zzfs.f7210f;
        }
        return m5842a(zzfs.f7209e, zzfs.f7213i, zzfs.f7214j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5842a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x007e
            if (r7 != r0) goto L_0x0007
            goto L_0x007e
        L_0x0007:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0044;
                case -1662541442: goto L_0x003a;
                case 1187890754: goto L_0x0030;
                case 1331836730: goto L_0x0026;
                case 1599127256: goto L_0x001c;
                case 1599127257: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 5
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 3
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 2
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 4
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = -1
        L_0x004f:
            switch(r5) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0075;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0053;
                case 5: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            return r0
        L_0x0053:
            int r6 = r6 * r7
            goto L_0x0078
        L_0x0056:
            int r6 = r6 * r7
            goto L_0x0077
        L_0x0059:
            java.lang.String r5 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.google.android.gms.internal.ads.bkp.f4573d
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0064
            return r0
        L_0x0064:
            r5 = 16
            int r6 = com.google.android.gms.internal.ads.bkp.m5809a((int) r6, (int) r5)
            int r5 = com.google.android.gms.internal.ads.bkp.m5809a((int) r7, (int) r5)
            int r6 = r6 * r5
            int r5 = r6 << 4
            int r6 = r5 << 4
            goto L_0x0077
        L_0x0075:
            int r6 = r6 * r7
        L_0x0077:
            r3 = 2
        L_0x0078:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkx.m5842a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static boolean m5845a(boolean z, zzfs zzfs, zzfs zzfs2) {
        if (!zzfs.f7209e.equals(zzfs2.f7209e) || m5850d(zzfs) != m5850d(zzfs2)) {
            return false;
        }
        if (!z) {
            return zzfs.f7213i == zzfs2.f7213i && zzfs.f7214j == zzfs2.f7214j;
        }
        return true;
    }

    /* renamed from: d */
    private static int m5850d(zzfs zzfs) {
        if (zzfs.f7216l == -1) {
            return 0;
        }
        return zzfs.f7216l;
    }
}
