package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class beh extends azk {

    /* renamed from: b */
    private static final byte[] f3936b = bkp.m5829g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private long f3937A;

    /* renamed from: B */
    private int f3938B;

    /* renamed from: C */
    private int f3939C;

    /* renamed from: D */
    private boolean f3940D;

    /* renamed from: E */
    private boolean f3941E;

    /* renamed from: F */
    private int f3942F;

    /* renamed from: G */
    private int f3943G;

    /* renamed from: H */
    private boolean f3944H;

    /* renamed from: I */
    private boolean f3945I;

    /* renamed from: J */
    private boolean f3946J;

    /* renamed from: K */
    private boolean f3947K;

    /* renamed from: L */
    private boolean f3948L;

    /* renamed from: M */
    private boolean f3949M;

    /* renamed from: a */
    protected bbv f3950a;

    /* renamed from: c */
    private final bek f3951c;

    /* renamed from: d */
    private final bcb<Object> f3952d;

    /* renamed from: e */
    private final boolean f3953e;

    /* renamed from: f */
    private final bbw f3954f;

    /* renamed from: g */
    private final bbw f3955g;

    /* renamed from: h */
    private final baa f3956h;

    /* renamed from: i */
    private final List<Long> f3957i;

    /* renamed from: j */
    private final MediaCodec.BufferInfo f3958j;

    /* renamed from: k */
    private zzfs f3959k;

    /* renamed from: l */
    private bbz<Object> f3960l;

    /* renamed from: m */
    private bbz<Object> f3961m;

    /* renamed from: n */
    private MediaCodec f3962n;

    /* renamed from: o */
    private beg f3963o;

    /* renamed from: p */
    private boolean f3964p;

    /* renamed from: q */
    private boolean f3965q;

    /* renamed from: r */
    private boolean f3966r;

    /* renamed from: s */
    private boolean f3967s;

    /* renamed from: t */
    private boolean f3968t;

    /* renamed from: u */
    private boolean f3969u;

    /* renamed from: v */
    private boolean f3970v;

    /* renamed from: w */
    private boolean f3971w;

    /* renamed from: x */
    private boolean f3972x;

    /* renamed from: y */
    private ByteBuffer[] f3973y;

    /* renamed from: z */
    private ByteBuffer[] f3974z;

    public beh(int i, bek bek, bcb<Object> bcb, boolean z) {
        super(i);
        bjy.m5691b(bkp.f4570a >= 16);
        this.f3951c = (bek) bjy.m5688a(bek);
        this.f3952d = bcb;
        this.f3953e = z;
        this.f3954f = new bbw(0);
        this.f3955g = new bbw(0);
        this.f3956h = new baa();
        this.f3957i = new ArrayList();
        this.f3958j = new MediaCodec.BufferInfo();
        this.f3942F = 0;
        this.f3943G = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo11623a(bek bek, zzfs zzfs);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11626a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11743a(bbw bbw) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11627a(beg beg, MediaCodec mediaCodec, zzfs zzfs, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11628a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo11629a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11744a(MediaCodec mediaCodec, boolean z, zzfs zzfs, zzfs zzfs2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11745a(beg beg) {
        return true;
    }

    /* renamed from: m */
    public final int mo11466m() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo11467n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo11468o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo11633y() {
    }

    /* renamed from: a */
    public final int mo11521a(zzfs zzfs) {
        try {
            return mo11623a(this.f3951c, zzfs);
        } catch (beo e) {
            throw azm.m4559a(e, mo11471r());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public beg mo11625a(bek bek, zzfs zzfs, boolean z) {
        return bek.mo11749a(zzfs.f7209e, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo11746z() {
        if (this.f3962n == null && this.f3959k != null) {
            this.f3960l = this.f3961m;
            String str = this.f3959k.f7209e;
            if (this.f3960l != null) {
                int a = this.f3960l.mo11660a();
                if (a == 0) {
                    throw azm.m4559a(this.f3960l.mo11662c(), mo11471r());
                } else if (a == 3 || a == 4) {
                    this.f3960l.mo11661b();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.f3963o == null) {
                    try {
                        this.f3963o = mo11625a(this.f3951c, this.f3959k, false);
                    } catch (beo e) {
                        m5105a(new bei(this.f3959k, (Throwable) e, false, -49998));
                    }
                    if (this.f3963o == null) {
                        m5105a(new bei(this.f3959k, (Throwable) null, false, -49999));
                    }
                }
                if (mo11745a(this.f3963o)) {
                    String str2 = this.f3963o.f3930a;
                    this.f3964p = bkp.f4570a < 21 && this.f3959k.f7211g.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.f3965q = bkp.f4570a < 18 || (bkp.f4570a == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (bkp.f4570a == 19 && bkp.f4573d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.f3966r = bkp.f4570a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(bkp.f4571b) || "flounder_lte".equals(bkp.f4571b) || "grouper".equals(bkp.f4571b) || "tilapia".equals(bkp.f4571b));
                    this.f3967s = bkp.f4570a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.f3968t = (bkp.f4570a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (bkp.f4570a <= 19 && "hb2000".equals(bkp.f4571b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.f3969u = bkp.f4570a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.f3970v = bkp.f4570a <= 18 && this.f3959k.f7218n == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        bkn.m5803a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.f3962n = MediaCodec.createByCodecName(str2);
                        bkn.m5802a();
                        bkn.m5803a("configureCodec");
                        mo11627a(this.f3963o, this.f3962n, this.f3959k, (MediaCrypto) null);
                        bkn.m5802a();
                        bkn.m5803a("startCodec");
                        this.f3962n.start();
                        bkn.m5802a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo11628a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f3973y = this.f3962n.getInputBuffers();
                        this.f3974z = this.f3962n.getOutputBuffers();
                    } catch (Exception e2) {
                        m5105a(new bei(this.f3959k, (Throwable) e2, false, str2));
                    }
                    this.f3937A = mo11457d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.f3938B = -1;
                    this.f3939C = -1;
                    this.f3949M = true;
                    this.f3950a.f3499a++;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m5105a(bei bei) {
        throw azm.m4559a(bei, mo11471r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final MediaCodec mo11740A() {
        return this.f3962n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final beg mo11741B() {
        return this.f3963o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11451a(boolean z) {
        this.f3950a = new bbv();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11449a(long j, boolean z) {
        this.f3946J = false;
        this.f3947K = false;
        if (this.f3962n != null) {
            this.f3937A = -9223372036854775807L;
            this.f3938B = -1;
            this.f3939C = -1;
            this.f3949M = true;
            this.f3948L = false;
            this.f3940D = false;
            this.f3957i.clear();
            this.f3971w = false;
            this.f3972x = false;
            if (this.f3965q || (this.f3968t && this.f3945I)) {
                mo11742C();
                mo11746z();
            } else if (this.f3943G != 0) {
                mo11742C();
                mo11746z();
            } else {
                this.f3962n.flush();
                this.f3944H = false;
            }
            if (this.f3941E && this.f3959k != null) {
                this.f3942F = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo11469p() {
        this.f3959k = null;
        try {
            mo11742C();
            try {
                if (this.f3960l != null) {
                    this.f3952d.mo11664a(this.f3960l);
                }
                try {
                    if (!(this.f3961m == null || this.f3961m == this.f3960l)) {
                        this.f3952d.mo11664a(this.f3961m);
                    }
                } finally {
                    this.f3960l = null;
                    this.f3961m = null;
                }
            } catch (Throwable th) {
                if (!(this.f3961m == null || this.f3961m == this.f3960l)) {
                    this.f3952d.mo11664a(this.f3961m);
                }
                throw th;
            } finally {
                this.f3960l = null;
                this.f3961m = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.f3961m == null || this.f3961m == this.f3960l)) {
                    this.f3952d.mo11664a(this.f3961m);
                }
                throw th2;
            } finally {
                this.f3960l = null;
                this.f3961m = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo11742C() {
        this.f3937A = -9223372036854775807L;
        this.f3938B = -1;
        this.f3939C = -1;
        this.f3948L = false;
        this.f3940D = false;
        this.f3957i.clear();
        this.f3973y = null;
        this.f3974z = null;
        this.f3963o = null;
        this.f3941E = false;
        this.f3944H = false;
        this.f3964p = false;
        this.f3965q = false;
        this.f3966r = false;
        this.f3967s = false;
        this.f3968t = false;
        this.f3970v = false;
        this.f3971w = false;
        this.f3972x = false;
        this.f3945I = false;
        this.f3942F = 0;
        this.f3943G = 0;
        this.f3954f.f3507b = null;
        if (this.f3962n != null) {
            this.f3950a.f3500b++;
            try {
                this.f3962n.stop();
                try {
                    this.f3962n.release();
                    this.f3962n = null;
                    if (this.f3960l != null && this.f3961m != this.f3960l) {
                        try {
                            this.f3952d.mo11664a(this.f3960l);
                        } finally {
                            this.f3960l = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f3962n = null;
                    if (!(this.f3960l == null || this.f3961m == this.f3960l)) {
                        this.f3952d.mo11664a(this.f3960l);
                    }
                    throw th;
                } finally {
                    this.f3960l = null;
                }
            } catch (Throwable th2) {
                this.f3962n = null;
                if (!(this.f3960l == null || this.f3961m == this.f3960l)) {
                    try {
                        this.f3952d.mo11664a(this.f3960l);
                    } finally {
                        this.f3960l = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: a */
    public final void mo11518a(long j, long j2) {
        if (this.f3947K) {
            mo11633y();
            return;
        }
        if (this.f3959k == null) {
            this.f3955g.mo11644a();
            int a = mo11445a(this.f3956h, this.f3955g, true);
            if (a == -5) {
                mo11630b(this.f3956h.f3268a);
            } else if (a == -4) {
                bjy.m5691b(this.f3955g.mo11648c());
                this.f3946J = true;
                mo11631w();
                return;
            } else {
                return;
            }
        }
        mo11746z();
        if (this.f3962n != null) {
            bkn.m5803a("drainAndFeed");
            do {
            } while (m5106b(j, j2));
            do {
            } while (mo12087v());
            bkn.m5802a();
        } else {
            mo11455b(j);
            this.f3955g.mo11644a();
            int a2 = mo11445a(this.f3956h, this.f3955g, false);
            if (a2 == -5) {
                mo11630b(this.f3956h.f3268a);
            } else if (a2 == -4) {
                bjy.m5691b(this.f3955g.mo11648c());
                this.f3946J = true;
                mo11631w();
            }
        }
        this.f3950a.mo11653a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean mo12087v() {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f3962n
            r1 = 0
            if (r0 == 0) goto L_0x01de
            int r0 = r14.f3943G
            r2 = 2
            if (r0 == r2) goto L_0x01de
            boolean r0 = r14.f3946J
            if (r0 == 0) goto L_0x0010
            goto L_0x01de
        L_0x0010:
            int r0 = r14.f3938B
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r14.f3962n
            r3 = 0
            int r0 = r0.dequeueInputBuffer(r3)
            r14.f3938B = r0
            int r0 = r14.f3938B
            if (r0 >= 0) goto L_0x0023
            return r1
        L_0x0023:
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            java.nio.ByteBuffer[] r3 = r14.f3973y
            int r4 = r14.f3938B
            r3 = r3[r4]
            r0.f3507b = r3
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            r0.mo11644a()
        L_0x0032:
            int r0 = r14.f3943G
            r3 = -1
            r4 = 1
            if (r0 != r4) goto L_0x004f
            boolean r0 = r14.f3967s
            if (r0 != 0) goto L_0x004c
            r14.f3945I = r4
            android.media.MediaCodec r5 = r14.f3962n
            int r6 = r14.f3938B
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f3938B = r3
        L_0x004c:
            r14.f3943G = r2
            return r1
        L_0x004f:
            boolean r0 = r14.f3971w
            if (r0 == 0) goto L_0x0071
            r14.f3971w = r1
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            java.nio.ByteBuffer r0 = r0.f3507b
            byte[] r1 = f3936b
            r0.put(r1)
            android.media.MediaCodec r5 = r14.f3962n
            int r6 = r14.f3938B
            r7 = 0
            byte[] r0 = f3936b
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f3938B = r3
            r14.f3944H = r4
            return r4
        L_0x0071:
            boolean r0 = r14.f3948L
            if (r0 == 0) goto L_0x0078
            r0 = -4
            r5 = 0
            goto L_0x00b0
        L_0x0078:
            int r0 = r14.f3942F
            if (r0 != r4) goto L_0x009d
            r0 = 0
        L_0x007d:
            com.google.android.gms.internal.ads.zzfs r5 = r14.f3959k
            java.util.List<byte[]> r5 = r5.f7211g
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x009b
            com.google.android.gms.internal.ads.zzfs r5 = r14.f3959k
            java.util.List<byte[]> r5 = r5.f7211g
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.bbw r6 = r14.f3954f
            java.nio.ByteBuffer r6 = r6.f3507b
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x007d
        L_0x009b:
            r14.f3942F = r2
        L_0x009d:
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            java.nio.ByteBuffer r0 = r0.f3507b
            int r0 = r0.position()
            com.google.android.gms.internal.ads.baa r5 = r14.f3956h
            com.google.android.gms.internal.ads.bbw r6 = r14.f3954f
            int r5 = r14.mo11445a((com.google.android.gms.internal.ads.baa) r5, (com.google.android.gms.internal.ads.bbw) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00b0:
            r6 = -3
            if (r0 != r6) goto L_0x00b4
            return r1
        L_0x00b4:
            r6 = -5
            if (r0 != r6) goto L_0x00ca
            int r0 = r14.f3942F
            if (r0 != r2) goto L_0x00c2
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            r0.mo11644a()
            r14.f3942F = r4
        L_0x00c2:
            com.google.android.gms.internal.ads.baa r0 = r14.f3956h
            com.google.android.gms.internal.ads.zzfs r0 = r0.f3268a
            r14.mo11630b(r0)
            return r4
        L_0x00ca:
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            boolean r0 = r0.mo11648c()
            if (r0 == 0) goto L_0x0106
            int r0 = r14.f3942F
            if (r0 != r2) goto L_0x00dd
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            r0.mo11644a()
            r14.f3942F = r4
        L_0x00dd:
            r14.f3946J = r4
            boolean r0 = r14.f3944H
            if (r0 != 0) goto L_0x00e7
            r14.mo11631w()
            return r1
        L_0x00e7:
            boolean r0 = r14.f3967s     // Catch:{ CryptoException -> 0x00fc }
            if (r0 != 0) goto L_0x00fb
            r14.f3945I = r4     // Catch:{ CryptoException -> 0x00fc }
            android.media.MediaCodec r5 = r14.f3962n     // Catch:{ CryptoException -> 0x00fc }
            int r6 = r14.f3938B     // Catch:{ CryptoException -> 0x00fc }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00fc }
            r14.f3938B = r3     // Catch:{ CryptoException -> 0x00fc }
        L_0x00fb:
            return r1
        L_0x00fc:
            r0 = move-exception
            int r1 = r14.mo11471r()
            com.google.android.gms.internal.ads.azm r0 = com.google.android.gms.internal.ads.azm.m4559a(r0, r1)
            throw r0
        L_0x0106:
            boolean r0 = r14.f3949M
            if (r0 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            boolean r0 = r0.mo11650d()
            if (r0 != 0) goto L_0x011e
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            r0.mo11644a()
            int r0 = r14.f3942F
            if (r0 != r2) goto L_0x011d
            r14.f3942F = r4
        L_0x011d:
            return r4
        L_0x011e:
            r14.f3949M = r1
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f
            boolean r0 = r0.mo11655e()
            com.google.android.gms.internal.ads.bbz<java.lang.Object> r2 = r14.f3960l
            if (r2 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.bbz<java.lang.Object> r2 = r14.f3960l
            int r2 = r2.mo11660a()
            if (r2 == 0) goto L_0x013d
            r6 = 4
            if (r2 == r6) goto L_0x014c
            if (r0 != 0) goto L_0x013b
            boolean r2 = r14.f3953e
            if (r2 != 0) goto L_0x014c
        L_0x013b:
            r2 = 1
            goto L_0x014d
        L_0x013d:
            com.google.android.gms.internal.ads.bbz<java.lang.Object> r0 = r14.f3960l
            com.google.android.gms.internal.ads.bca r0 = r0.mo11662c()
            int r1 = r14.mo11471r()
            com.google.android.gms.internal.ads.azm r0 = com.google.android.gms.internal.ads.azm.m4559a(r0, r1)
            throw r0
        L_0x014c:
            r2 = 0
        L_0x014d:
            r14.f3948L = r2
            boolean r2 = r14.f3948L
            if (r2 == 0) goto L_0x0154
            return r1
        L_0x0154:
            boolean r2 = r14.f3964p
            if (r2 == 0) goto L_0x016e
            if (r0 != 0) goto L_0x016e
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f
            java.nio.ByteBuffer r2 = r2.f3507b
            com.google.android.gms.internal.ads.bke.m5760a(r2)
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f
            java.nio.ByteBuffer r2 = r2.f3507b
            int r2 = r2.position()
            if (r2 != 0) goto L_0x016c
            return r4
        L_0x016c:
            r14.f3964p = r1
        L_0x016e:
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            long r10 = r2.f3508c     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            boolean r2 = r2.mo11647b()     // Catch:{ CryptoException -> 0x01d4 }
            if (r2 == 0) goto L_0x0183
            java.util.List<java.lang.Long> r2 = r14.f3957i     // Catch:{ CryptoException -> 0x01d4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01d4 }
            r2.add(r6)     // Catch:{ CryptoException -> 0x01d4 }
        L_0x0183:
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            java.nio.ByteBuffer r2 = r2.f3507b     // Catch:{ CryptoException -> 0x01d4 }
            r2.flip()     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.bbw r2 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            r14.mo11743a((com.google.android.gms.internal.ads.bbw) r2)     // Catch:{ CryptoException -> 0x01d4 }
            if (r0 == 0) goto L_0x01b5
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.bbs r0 = r0.f3506a     // Catch:{ CryptoException -> 0x01d4 }
            android.media.MediaCodec$CryptoInfo r9 = r0.mo11651a()     // Catch:{ CryptoException -> 0x01d4 }
            if (r5 != 0) goto L_0x019c
            goto L_0x01ab
        L_0x019c:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d4 }
            if (r0 != 0) goto L_0x01a4
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01d4 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01a4:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d4 }
            r2 = r0[r1]     // Catch:{ CryptoException -> 0x01d4 }
            int r2 = r2 + r5
            r0[r1] = r2     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01ab:
            android.media.MediaCodec r6 = r14.f3962n     // Catch:{ CryptoException -> 0x01d4 }
            int r7 = r14.f3938B     // Catch:{ CryptoException -> 0x01d4 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d4 }
            goto L_0x01c6
        L_0x01b5:
            android.media.MediaCodec r6 = r14.f3962n     // Catch:{ CryptoException -> 0x01d4 }
            int r7 = r14.f3938B     // Catch:{ CryptoException -> 0x01d4 }
            r8 = 0
            com.google.android.gms.internal.ads.bbw r0 = r14.f3954f     // Catch:{ CryptoException -> 0x01d4 }
            java.nio.ByteBuffer r0 = r0.f3507b     // Catch:{ CryptoException -> 0x01d4 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01d4 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01c6:
            r14.f3938B = r3     // Catch:{ CryptoException -> 0x01d4 }
            r14.f3944H = r4     // Catch:{ CryptoException -> 0x01d4 }
            r14.f3942F = r1     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.bbv r0 = r14.f3950a     // Catch:{ CryptoException -> 0x01d4 }
            int r1 = r0.f3501c     // Catch:{ CryptoException -> 0x01d4 }
            int r1 = r1 + r4
            r0.f3501c = r1     // Catch:{ CryptoException -> 0x01d4 }
            return r4
        L_0x01d4:
            r0 = move-exception
            int r1 = r14.mo11471r()
            com.google.android.gms.internal.ads.azm r0 = com.google.android.gms.internal.ads.azm.m4559a(r0, r1)
            throw r0
        L_0x01de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.beh.mo12087v():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11630b(zzfs zzfs) {
        zzhp zzhp;
        zzfs zzfs2 = this.f3959k;
        this.f3959k = zzfs;
        zzhp zzhp2 = this.f3959k.f7212h;
        if (zzfs2 == null) {
            zzhp = null;
        } else {
            zzhp = zzfs2.f7212h;
        }
        boolean a = bkp.m5820a((Object) zzhp2, (Object) zzhp);
        boolean z = true;
        if (!a) {
            if (this.f3959k.f7212h == null) {
                this.f3961m = null;
            } else if (this.f3952d != null) {
                this.f3961m = this.f3952d.mo11663a(Looper.myLooper(), this.f3959k.f7212h);
                if (this.f3961m == this.f3960l) {
                    this.f3952d.mo11664a(this.f3961m);
                }
            } else {
                throw azm.m4559a(new IllegalStateException("Media requires a DrmSessionManager"), mo11471r());
            }
        }
        if (this.f3961m == this.f3960l && this.f3962n != null && mo11744a(this.f3962n, this.f3963o.f3931b, zzfs2, this.f3959k)) {
            this.f3941E = true;
            this.f3942F = 1;
            if (!(this.f3966r && this.f3959k.f7213i == zzfs2.f7213i && this.f3959k.f7214j == zzfs2.f7214j)) {
                z = false;
            }
            this.f3971w = z;
        } else if (this.f3944H) {
            this.f3943G = 1;
        } else {
            mo11742C();
            mo11746z();
        }
    }

    /* renamed from: u */
    public boolean mo11520u() {
        return this.f3947K;
    }

    /* renamed from: t */
    public boolean mo11519t() {
        if (this.f3959k == null || this.f3948L) {
            return false;
        }
        if (mo11472s() || this.f3939C >= 0) {
            return true;
        }
        return this.f3937A != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f3937A;
    }

    /* renamed from: b */
    private final boolean m5106b(long j, long j2) {
        boolean z;
        boolean z2;
        if (this.f3939C < 0) {
            if (!this.f3969u || !this.f3945I) {
                this.f3939C = this.f3962n.dequeueOutputBuffer(this.f3958j, 0);
            } else {
                try {
                    this.f3939C = this.f3962n.dequeueOutputBuffer(this.f3958j, 0);
                } catch (IllegalStateException unused) {
                    mo11631w();
                    if (this.f3947K) {
                        mo11742C();
                    }
                    return false;
                }
            }
            if (this.f3939C >= 0) {
                if (this.f3972x) {
                    this.f3972x = false;
                    this.f3962n.releaseOutputBuffer(this.f3939C, false);
                    this.f3939C = -1;
                    return true;
                } else if ((this.f3958j.flags & 4) != 0) {
                    mo11631w();
                    this.f3939C = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.f3974z[this.f3939C];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.f3958j.offset);
                        byteBuffer.limit(this.f3958j.offset + this.f3958j.size);
                    }
                    long j3 = this.f3958j.presentationTimeUs;
                    int size = this.f3957i.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z2 = false;
                            break;
                        } else if (this.f3957i.get(i).longValue() == j3) {
                            this.f3957i.remove(i);
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.f3940D = z2;
                }
            } else if (this.f3939C == -2) {
                MediaFormat outputFormat = this.f3962n.getOutputFormat();
                if (this.f3966r && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f3972x = true;
                } else {
                    if (this.f3970v) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo11626a(this.f3962n, outputFormat);
                }
                return true;
            } else if (this.f3939C == -3) {
                this.f3974z = this.f3962n.getOutputBuffers();
                return true;
            } else {
                if (this.f3967s && (this.f3946J || this.f3943G == 2)) {
                    mo11631w();
                }
                return false;
            }
        }
        if (!this.f3969u || !this.f3945I) {
            z = mo11629a(j, j2, this.f3962n, this.f3974z[this.f3939C], this.f3939C, this.f3958j.flags, this.f3958j.presentationTimeUs, this.f3940D);
        } else {
            try {
                z = mo11629a(j, j2, this.f3962n, this.f3974z[this.f3939C], this.f3939C, this.f3958j.flags, this.f3958j.presentationTimeUs, this.f3940D);
            } catch (IllegalStateException unused2) {
                mo11631w();
                if (this.f3947K) {
                    mo11742C();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.f3958j.presentationTimeUs;
        this.f3939C = -1;
        return true;
    }

    /* renamed from: w */
    private final void mo11631w() {
        if (this.f3943G == 2) {
            mo11742C();
            mo11746z();
            return;
        }
        this.f3947K = true;
        mo11633y();
    }
}
