package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.p034v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class baz {

    /* renamed from: a */
    private static boolean f3323a = false;

    /* renamed from: b */
    private static boolean f3324b = false;

    /* renamed from: A */
    private int f3325A;

    /* renamed from: B */
    private int f3326B;

    /* renamed from: C */
    private long f3327C;

    /* renamed from: D */
    private long f3328D;

    /* renamed from: E */
    private boolean f3329E;

    /* renamed from: F */
    private long f3330F;

    /* renamed from: G */
    private Method f3331G;

    /* renamed from: H */
    private int f3332H;

    /* renamed from: I */
    private long f3333I;

    /* renamed from: J */
    private long f3334J;

    /* renamed from: K */
    private int f3335K;

    /* renamed from: L */
    private long f3336L;

    /* renamed from: M */
    private long f3337M;

    /* renamed from: N */
    private int f3338N;

    /* renamed from: O */
    private int f3339O;

    /* renamed from: P */
    private long f3340P;

    /* renamed from: Q */
    private long f3341Q;

    /* renamed from: R */
    private long f3342R;

    /* renamed from: S */
    private float f3343S;

    /* renamed from: T */
    private bap[] f3344T;

    /* renamed from: U */
    private ByteBuffer[] f3345U;

    /* renamed from: V */
    private ByteBuffer f3346V;

    /* renamed from: W */
    private ByteBuffer f3347W;

    /* renamed from: X */
    private byte[] f3348X;

    /* renamed from: Y */
    private int f3349Y;

    /* renamed from: Z */
    private int f3350Z;

    /* renamed from: aa */
    private boolean f3351aa;

    /* renamed from: ab */
    private boolean f3352ab;

    /* renamed from: ac */
    private int f3353ac;

    /* renamed from: ad */
    private boolean f3354ad;

    /* renamed from: ae */
    private boolean f3355ae;

    /* renamed from: af */
    private long f3356af;

    /* renamed from: c */
    private final bao f3357c = null;

    /* renamed from: d */
    private final bbj f3358d;

    /* renamed from: e */
    private final bbq f3359e;

    /* renamed from: f */
    private final bap[] f3360f;

    /* renamed from: g */
    private final bbf f3361g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConditionVariable f3362h;

    /* renamed from: i */
    private final long[] f3363i;

    /* renamed from: j */
    private final bbb f3364j;

    /* renamed from: k */
    private final LinkedList<bbg> f3365k;

    /* renamed from: l */
    private AudioTrack f3366l;

    /* renamed from: m */
    private int f3367m;

    /* renamed from: n */
    private int f3368n;

    /* renamed from: o */
    private int f3369o;

    /* renamed from: p */
    private int f3370p;

    /* renamed from: q */
    private int f3371q;

    /* renamed from: r */
    private boolean f3372r;

    /* renamed from: s */
    private int f3373s;

    /* renamed from: t */
    private long f3374t;

    /* renamed from: u */
    private bae f3375u;

    /* renamed from: v */
    private bae f3376v;

    /* renamed from: w */
    private long f3377w;

    /* renamed from: x */
    private long f3378x;

    /* renamed from: y */
    private ByteBuffer f3379y;

    /* renamed from: z */
    private int f3380z;

    public baz(bao bao, bap[] bapArr, bbf bbf) {
        this.f3361g = bbf;
        this.f3362h = new ConditionVariable(true);
        if (bkp.f4570a >= 18) {
            try {
                this.f3331G = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (bkp.f4570a >= 19) {
            this.f3364j = new bbc();
        } else {
            this.f3364j = new bbb((bba) null);
        }
        this.f3358d = new bbj();
        this.f3359e = new bbq();
        this.f3360f = new bap[(bapArr.length + 3)];
        this.f3360f[0] = new bbo();
        this.f3360f[1] = this.f3358d;
        System.arraycopy(bapArr, 0, this.f3360f, 2, bapArr.length);
        this.f3360f[bapArr.length + 2] = this.f3359e;
        this.f3363i = new long[10];
        this.f3343S = 1.0f;
        this.f3339O = 0;
        this.f3371q = 3;
        this.f3353ac = 0;
        this.f3376v = bae.f3272a;
        this.f3350Z = -1;
        this.f3344T = new bap[0];
        this.f3345U = new ByteBuffer[0];
        this.f3365k = new LinkedList<>();
    }

    /* renamed from: a */
    public final boolean mo11572a(String str) {
        return this.f3357c != null && this.f3357c.mo11534a(m4724b(str));
    }

    /* renamed from: a */
    public final long mo11566a(boolean z) {
        long j;
        long j2;
        long j3;
        if (!(m4731n() && this.f3339O != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f3366l.getPlayState() == 3) {
            long c = this.f3364j.mo11615c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f3328D >= 30000) {
                    this.f3363i[this.f3325A] = c - nanoTime;
                    this.f3325A = (this.f3325A + 1) % 10;
                    if (this.f3326B < 10) {
                        this.f3326B++;
                    }
                    this.f3328D = nanoTime;
                    this.f3327C = 0;
                    for (int i = 0; i < this.f3326B; i++) {
                        this.f3327C += this.f3363i[i] / ((long) this.f3326B);
                    }
                }
                if (!m4734q() && nanoTime - this.f3330F >= 500000) {
                    this.f3329E = this.f3364j.mo11616d();
                    if (this.f3329E) {
                        long e = this.f3364j.mo11617e() / 1000;
                        long f = this.f3364j.mo11618f();
                        if (e < this.f3341Q) {
                            this.f3329E = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c);
                            Log.w("AudioTrack", sb.toString());
                            this.f3329E = false;
                        } else if (Math.abs(m4725b(f) - c) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            Log.w("AudioTrack", sb2.toString());
                            this.f3329E = false;
                        }
                    }
                    if (this.f3331G != null && !this.f3372r) {
                        try {
                            this.f3342R = (((long) ((Integer) this.f3331G.invoke(this.f3366l, (Object[]) null)).intValue()) * 1000) - this.f3374t;
                            this.f3342R = Math.max(this.f3342R, 0);
                            if (this.f3342R > 5000000) {
                                long j4 = this.f3342R;
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(j4);
                                Log.w("AudioTrack", sb3.toString());
                                this.f3342R = 0;
                            }
                        } catch (Exception unused) {
                            this.f3331G = null;
                        }
                    }
                    this.f3330F = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f3329E) {
            j = m4725b(this.f3364j.mo11618f() + m4727c(nanoTime2 - (this.f3364j.mo11617e() / 1000)));
        } else {
            if (this.f3326B == 0) {
                j3 = this.f3364j.mo11615c();
            } else {
                j3 = nanoTime2 + this.f3327C;
            }
            j = j3;
            if (!z) {
                j -= this.f3342R;
            }
        }
        long j5 = this.f3340P;
        while (!this.f3365k.isEmpty() && j >= this.f3365k.getFirst().f3418c) {
            bbg remove = this.f3365k.remove();
            this.f3376v = remove.f3416a;
            this.f3378x = remove.f3418c;
            this.f3377w = remove.f3417b - this.f3340P;
        }
        if (this.f3376v.f3273b == 1.0f) {
            j2 = (j + this.f3377w) - this.f3378x;
        } else if (!this.f3365k.isEmpty() || this.f3359e.mo11643j() < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j6 = this.f3377w;
            double d = (double) this.f3376v.f3273b;
            double d2 = (double) (j - this.f3378x);
            Double.isNaN(d);
            Double.isNaN(d2);
            j2 = ((long) (d * d2)) + j6;
        } else {
            j2 = bkp.m5813a(j - this.f3378x, this.f3359e.mo11642i(), this.f3359e.mo11643j()) + this.f3377w;
        }
        return j5 + j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11571a(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = m4724b((java.lang.String) r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004f
            int r11 = com.google.android.gms.internal.ads.bkp.m5822b(r11, r9)
            r7.f3332H = r11
            com.google.android.gms.internal.ads.bbj r11 = r7.f3358d
            r11.mo11622a((int[]) r13)
            com.google.android.gms.internal.ads.bap[] r11 = r7.f3360f
            int r13 = r11.length
            r3 = r8
            r2 = r9
            r8 = 0
            r9 = 0
        L_0x0025:
            if (r8 >= r13) goto L_0x0046
            r4 = r11[r8]
            boolean r5 = r4.mo11540a(r10, r2, r3)     // Catch:{ baq -> 0x003f }
            r9 = r9 | r5
            boolean r5 = r4.mo11539a()
            if (r5 == 0) goto L_0x003c
            int r2 = r4.mo11541b()
            int r3 = r4.mo11542c()
        L_0x003c:
            int r8 = r8 + 1
            goto L_0x0025
        L_0x003f:
            r8 = move-exception
            com.google.android.gms.internal.ads.bbd r9 = new com.google.android.gms.internal.ads.bbd
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0046:
            if (r9 == 0) goto L_0x004b
            r7.m4728k()
        L_0x004b:
            r11 = r9
            r9 = r2
            r8 = r3
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            r13 = 252(0xfc, float:3.53E-43)
            r2 = 12
            switch(r9) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0082;
                case 3: goto L_0x007f;
                case 4: goto L_0x007c;
                case 5: goto L_0x0079;
                case 6: goto L_0x0076;
                case 7: goto L_0x0073;
                case 8: goto L_0x0070;
                default: goto L_0x0057;
            }
        L_0x0057:
            com.google.android.gms.internal.ads.bbd r8 = new com.google.android.gms.internal.ads.bbd
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x0070:
            int r3 = com.google.android.gms.internal.ads.azl.f3169a
            goto L_0x0086
        L_0x0073:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0086
        L_0x0076:
            r3 = 252(0xfc, float:3.53E-43)
            goto L_0x0086
        L_0x0079:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x0086
        L_0x007c:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x0086
        L_0x007f:
            r3 = 28
            goto L_0x0086
        L_0x0082:
            r3 = 12
            goto L_0x0086
        L_0x0085:
            r3 = 4
        L_0x0086:
            int r4 = com.google.android.gms.internal.ads.bkp.f4570a
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00ad
            java.lang.String r4 = "foster"
            java.lang.String r5 = com.google.android.gms.internal.ads.bkp.f4571b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = "NVIDIA"
            java.lang.String r5 = com.google.android.gms.internal.ads.bkp.f4572c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            r4 = 3
            if (r9 == r4) goto L_0x00ae
            if (r9 == r6) goto L_0x00ae
            r13 = 7
            if (r9 == r13) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            int r13 = com.google.android.gms.internal.ads.azl.f3169a
            goto L_0x00ae
        L_0x00ad:
            r13 = r3
        L_0x00ae:
            int r3 = com.google.android.gms.internal.ads.bkp.f4570a
            r4 = 25
            if (r3 > r4) goto L_0x00c4
            java.lang.String r3 = "fugu"
            java.lang.String r4 = com.google.android.gms.internal.ads.bkp.f4571b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c4
            if (r12 == 0) goto L_0x00c4
            if (r9 != r0) goto L_0x00c4
            r13 = 12
        L_0x00c4:
            if (r11 != 0) goto L_0x00d9
            boolean r11 = r7.m4731n()
            if (r11 == 0) goto L_0x00d9
            int r11 = r7.f3369o
            if (r11 != r8) goto L_0x00d9
            int r11 = r7.f3367m
            if (r11 != r10) goto L_0x00d9
            int r11 = r7.f3368n
            if (r11 != r13) goto L_0x00d9
            return
        L_0x00d9:
            r7.mo11582i()
            r7.f3369o = r8
            r7.f3372r = r12
            r7.f3367m = r10
            r7.f3368n = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r8 = 2
        L_0x00e9:
            r7.f3370p = r8
            int r8 = com.google.android.gms.internal.ads.bkp.m5822b(r11, r9)
            r7.f3335K = r8
            if (r12 == 0) goto L_0x0104
            int r8 = r7.f3370p
            if (r8 == r6) goto L_0x0101
            int r8 = r7.f3370p
            r9 = 6
            if (r8 != r9) goto L_0x00fd
            goto L_0x0101
        L_0x00fd:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x013a
        L_0x0101:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x013a
        L_0x0104:
            int r8 = r7.f3370p
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            com.google.android.gms.internal.ads.bjy.m5691b(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.m4727c(r10)
            int r10 = (int) r10
            int r11 = r7.f3335K
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.m4727c(r2)
            int r8 = r7.f3335K
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x0136
            r8 = r10
            goto L_0x013a
        L_0x0136:
            if (r9 <= r8) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r8 = r9
        L_0x013a:
            r7.f3373s = r8
            if (r12 == 0) goto L_0x0144
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014e
        L_0x0144:
            int r8 = r7.f3373s
            int r9 = r7.f3335K
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.m4725b((long) r8)
        L_0x014e:
            r7.f3374t = r8
            com.google.android.gms.internal.ads.bae r8 = r7.f3376v
            r7.mo11567a((com.google.android.gms.internal.ads.bae) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baz.mo11571a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: k */
    private final void m4728k() {
        ArrayList arrayList = new ArrayList();
        for (bap bap : this.f3360f) {
            if (bap.mo11539a()) {
                arrayList.add(bap);
            } else {
                bap.mo11546g();
            }
        }
        int size = arrayList.size();
        this.f3344T = (bap[]) arrayList.toArray(new bap[size]);
        this.f3345U = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            bap bap2 = this.f3344T[i];
            bap2.mo11546g();
            this.f3345U[i] = bap2.mo11544e();
        }
    }

    /* renamed from: a */
    public final void mo11568a() {
        this.f3352ab = true;
        if (m4731n()) {
            this.f3341Q = System.nanoTime() / 1000;
            this.f3366l.play();
        }
    }

    /* renamed from: b */
    public final void mo11574b() {
        if (this.f3339O == 1) {
            this.f3339O = 2;
        }
    }

    /* renamed from: a */
    public final boolean mo11573a(ByteBuffer byteBuffer, long j) {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        bjy.m5689a(this.f3346V == null || byteBuffer2 == this.f3346V);
        if (!m4731n()) {
            this.f3362h.block();
            if (this.f3354ad) {
                this.f3366l = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f3368n).setEncoding(this.f3370p).setSampleRate(this.f3367m).build(), this.f3373s, 1, this.f3353ac);
            } else if (this.f3353ac == 0) {
                this.f3366l = new AudioTrack(this.f3371q, this.f3367m, this.f3368n, this.f3370p, this.f3373s, 1);
            } else {
                this.f3366l = new AudioTrack(this.f3371q, this.f3367m, this.f3368n, this.f3370p, this.f3373s, 1, this.f3353ac);
            }
            int state = this.f3366l.getState();
            if (state == 1) {
                int audioSessionId = this.f3366l.getAudioSessionId();
                if (this.f3353ac != audioSessionId) {
                    this.f3353ac = audioSessionId;
                    this.f3361g.mo11620a(audioSessionId);
                }
                this.f3364j.mo11613a(this.f3366l, m4734q());
                m4730m();
                this.f3355ae = false;
                if (this.f3352ab) {
                    mo11568a();
                }
            } else {
                try {
                    this.f3366l.release();
                } catch (Exception unused) {
                } finally {
                    this.f3366l = null;
                }
                throw new bbe(state, this.f3367m, this.f3368n, this.f3373s);
            }
        }
        if (m4734q()) {
            if (this.f3366l.getPlayState() == 2) {
                this.f3355ae = false;
                return false;
            } else if (this.f3366l.getPlayState() == 1 && this.f3364j.mo11614b() != 0) {
                return false;
            }
        }
        boolean z = this.f3355ae;
        this.f3355ae = mo11578e();
        if (z && !this.f3355ae && this.f3366l.getPlayState() != 1) {
            this.f3361g.mo11621a(this.f3373s, azl.m4556a(this.f3374t), SystemClock.elapsedRealtime() - this.f3356af);
        }
        if (this.f3346V == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f3372r && this.f3338N == 0) {
                int i3 = this.f3370p;
                if (i3 == 7 || i3 == 8) {
                    i2 = bbk.m4819a(byteBuffer);
                } else if (i3 == 5) {
                    i2 = ban.m4694a();
                } else if (i3 == 6) {
                    i2 = ban.m4695a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f3338N = i2;
            }
            if (this.f3375u != null) {
                if (!m4729l()) {
                    return false;
                }
                LinkedList<bbg> linkedList = this.f3365k;
                bbg bbg = r11;
                bbg bbg2 = new bbg(this.f3375u, Math.max(0, j2), m4725b(m4732o()), (bba) null);
                linkedList.add(bbg);
                this.f3375u = null;
                m4728k();
            }
            if (this.f3339O == 0) {
                this.f3340P = Math.max(0, j2);
                this.f3339O = 1;
            } else {
                long b = this.f3340P + m4725b(this.f3372r ? this.f3334J : this.f3333I / ((long) this.f3332H));
                if (this.f3339O != 1 || Math.abs(b - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(b);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.f3339O = 2;
                }
                if (this.f3339O == i) {
                    this.f3340P += j2 - b;
                    this.f3339O = 1;
                    this.f3361g.mo11619a();
                }
            }
            if (this.f3372r) {
                this.f3334J += (long) this.f3338N;
            } else {
                this.f3333I += (long) byteBuffer.remaining();
            }
            this.f3346V = byteBuffer2;
        }
        if (this.f3372r) {
            m4726b(this.f3346V, j2);
        } else {
            m4723a(j2);
        }
        if (this.f3346V.hasRemaining()) {
            return false;
        }
        this.f3346V = null;
        return true;
    }

    /* renamed from: a */
    private final void m4723a(long j) {
        ByteBuffer byteBuffer;
        int length = this.f3344T.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f3345U[i - 1];
            } else {
                byteBuffer = this.f3346V != null ? this.f3346V : bap.f3304a;
            }
            if (i == length) {
                m4726b(byteBuffer, j);
            } else {
                bap bap = this.f3344T[i];
                bap.mo11538a(byteBuffer);
                ByteBuffer e = bap.mo11544e();
                this.f3345U[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (r11 < r10) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4726b(java.nio.ByteBuffer r9, long r10) {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f3347W
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.nio.ByteBuffer r0 = r8.f3347W
            if (r0 != r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.bjy.m5689a((boolean) r0)
            goto L_0x003f
        L_0x001a:
            r8.f3347W = r9
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a
            if (r0 >= r2) goto L_0x003f
            int r0 = r9.remaining()
            byte[] r4 = r8.f3348X
            if (r4 == 0) goto L_0x002d
            byte[] r4 = r8.f3348X
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0031
        L_0x002d:
            byte[] r4 = new byte[r0]
            r8.f3348X = r4
        L_0x0031:
            int r4 = r9.position()
            byte[] r5 = r8.f3348X
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f3349Y = r3
        L_0x003f:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.bkp.f4570a
            if (r4 >= r2) goto L_0x007d
            long r10 = r8.f3336L
            com.google.android.gms.internal.ads.bbb r2 = r8.f3364j
            long r4 = r2.mo11614b()
            int r2 = r8.f3335K
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.f3373s
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x007a
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.f3366l
            byte[] r2 = r8.f3348X
            int r4 = r8.f3349Y
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f6
            int r11 = r8.f3349Y
            int r11 = r11 + r10
            r8.f3349Y = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f6
        L_0x007a:
            r10 = 0
            goto L_0x00f6
        L_0x007d:
            boolean r2 = r8.f3354ad
            if (r2 == 0) goto L_0x00f0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x008c
            r2 = 1
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            android.media.AudioTrack r2 = r8.f3366l
            java.nio.ByteBuffer r4 = r8.f3379y
            if (r4 != 0) goto L_0x00ad
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f3379y = r4
            java.nio.ByteBuffer r4 = r8.f3379y
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f3379y
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00ad:
            int r4 = r8.f3380z
            if (r4 != 0) goto L_0x00c9
            java.nio.ByteBuffer r4 = r8.f3379y
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f3379y
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f3379y
            r10.position(r3)
            r8.f3380z = r0
        L_0x00c9:
            java.nio.ByteBuffer r10 = r8.f3379y
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00e0
            java.nio.ByteBuffer r11 = r8.f3379y
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00dd
            r8.f3380z = r3
            r10 = r11
            goto L_0x00f6
        L_0x00dd:
            if (r11 >= r10) goto L_0x00e0
            goto L_0x007a
        L_0x00e0:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e9
            r8.f3380z = r3
            goto L_0x00ee
        L_0x00e9:
            int r10 = r8.f3380z
            int r10 = r10 - r9
            r8.f3380z = r10
        L_0x00ee:
            r10 = r9
            goto L_0x00f6
        L_0x00f0:
            android.media.AudioTrack r10 = r8.f3366l
            int r10 = r10.write(r9, r0, r1)
        L_0x00f6:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f3356af = r4
            if (r10 < 0) goto L_0x011b
            boolean r9 = r8.f3372r
            if (r9 != 0) goto L_0x0108
            long r4 = r8.f3336L
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f3336L = r4
        L_0x0108:
            if (r10 != r0) goto L_0x011a
            boolean r9 = r8.f3372r
            if (r9 == 0) goto L_0x0116
            long r9 = r8.f3337M
            int r11 = r8.f3338N
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f3337M = r9
        L_0x0116:
            r9 = 0
            r8.f3347W = r9
            return r1
        L_0x011a:
            return r3
        L_0x011b:
            com.google.android.gms.internal.ads.bbi r9 = new com.google.android.gms.internal.ads.bbi
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baz.m4726b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo11576c() {
        if (!this.f3351aa && m4731n() && m4729l()) {
            this.f3364j.mo11612a(m4732o());
            this.f3380z = 0;
            this.f3351aa = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4729l() {
        /*
            r8 = this;
            int r0 = r8.f3350Z
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r8.f3372r
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bap[] r0 = r8.f3344T
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.f3350Z = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r8.f3350Z
            com.google.android.gms.internal.ads.bap[] r5 = r8.f3344T
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L_0x003c
            com.google.android.gms.internal.ads.bap[] r4 = r8.f3344T
            int r5 = r8.f3350Z
            r4 = r4[r5]
            if (r0 == 0) goto L_0x002c
            r4.mo11543d()
        L_0x002c:
            r8.m4723a((long) r6)
            boolean r0 = r4.mo11545f()
            if (r0 != 0) goto L_0x0036
            return r3
        L_0x0036:
            int r0 = r8.f3350Z
            int r0 = r0 + r2
            r8.f3350Z = r0
            goto L_0x0012
        L_0x003c:
            java.nio.ByteBuffer r0 = r8.f3347W
            if (r0 == 0) goto L_0x004a
            java.nio.ByteBuffer r0 = r8.f3347W
            r8.m4726b(r0, r6)
            java.nio.ByteBuffer r0 = r8.f3347W
            if (r0 == 0) goto L_0x004a
            return r3
        L_0x004a:
            r8.f3350Z = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baz.m4729l():boolean");
    }

    /* renamed from: d */
    public final boolean mo11577d() {
        if (m4731n()) {
            return this.f3351aa && !mo11578e();
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo11578e() {
        if (m4731n()) {
            if (m4732o() <= this.f3364j.mo11614b()) {
                if (m4734q() && this.f3366l.getPlayState() == 2 && this.f3366l.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final bae mo11567a(bae bae) {
        bae bae2;
        if (this.f3372r) {
            this.f3376v = bae.f3272a;
            return this.f3376v;
        }
        bae bae3 = new bae(this.f3359e.mo11640a(bae.f3273b), this.f3359e.mo11641b(bae.f3274c));
        if (this.f3375u != null) {
            bae2 = this.f3375u;
        } else if (!this.f3365k.isEmpty()) {
            bae2 = this.f3365k.getLast().f3416a;
        } else {
            bae2 = this.f3376v;
        }
        if (!bae3.equals(bae2)) {
            if (m4731n()) {
                this.f3375u = bae3;
            } else {
                this.f3376v = bae3;
            }
        }
        return this.f3376v;
    }

    /* renamed from: f */
    public final bae mo11579f() {
        return this.f3376v;
    }

    /* renamed from: a */
    public final void mo11570a(int i) {
        if (this.f3371q != i) {
            this.f3371q = i;
            if (!this.f3354ad) {
                mo11582i();
                this.f3353ac = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo11575b(int i) {
        bjy.m5691b(bkp.f4570a >= 21);
        if (!this.f3354ad || this.f3353ac != i) {
            this.f3354ad = true;
            this.f3353ac = i;
            mo11582i();
        }
    }

    /* renamed from: g */
    public final void mo11580g() {
        if (this.f3354ad) {
            this.f3354ad = false;
            this.f3353ac = 0;
            mo11582i();
        }
    }

    /* renamed from: a */
    public final void mo11569a(float f) {
        if (this.f3343S != f) {
            this.f3343S = f;
            m4730m();
        }
    }

    /* renamed from: m */
    private final void m4730m() {
        if (!m4731n()) {
            return;
        }
        if (bkp.f4570a >= 21) {
            this.f3366l.setVolume(this.f3343S);
            return;
        }
        AudioTrack audioTrack = this.f3366l;
        float f = this.f3343S;
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: h */
    public final void mo11581h() {
        this.f3352ab = false;
        if (m4731n()) {
            m4733p();
            this.f3364j.mo11611a();
        }
    }

    /* renamed from: i */
    public final void mo11582i() {
        if (m4731n()) {
            this.f3333I = 0;
            this.f3334J = 0;
            this.f3336L = 0;
            this.f3337M = 0;
            this.f3338N = 0;
            if (this.f3375u != null) {
                this.f3376v = this.f3375u;
                this.f3375u = null;
            } else if (!this.f3365k.isEmpty()) {
                this.f3376v = this.f3365k.getLast().f3416a;
            }
            this.f3365k.clear();
            this.f3377w = 0;
            this.f3378x = 0;
            this.f3346V = null;
            this.f3347W = null;
            for (int i = 0; i < this.f3344T.length; i++) {
                bap bap = this.f3344T[i];
                bap.mo11546g();
                this.f3345U[i] = bap.mo11544e();
            }
            this.f3351aa = false;
            this.f3350Z = -1;
            this.f3379y = null;
            this.f3380z = 0;
            this.f3339O = 0;
            this.f3342R = 0;
            m4733p();
            if (this.f3366l.getPlayState() == 3) {
                this.f3366l.pause();
            }
            AudioTrack audioTrack = this.f3366l;
            this.f3366l = null;
            this.f3364j.mo11613a((AudioTrack) null, false);
            this.f3362h.close();
            new bba(this, audioTrack).start();
        }
    }

    /* renamed from: j */
    public final void mo11583j() {
        mo11582i();
        for (bap h : this.f3360f) {
            h.mo11547h();
        }
        this.f3353ac = 0;
        this.f3352ab = false;
    }

    /* renamed from: n */
    private final boolean m4731n() {
        return this.f3366l != null;
    }

    /* renamed from: b */
    private final long m4725b(long j) {
        return (j * 1000000) / ((long) this.f3367m);
    }

    /* renamed from: c */
    private final long m4727c(long j) {
        return (j * ((long) this.f3367m)) / 1000000;
    }

    /* renamed from: o */
    private final long m4732o() {
        return this.f3372r ? this.f3337M : this.f3336L / ((long) this.f3335K);
    }

    /* renamed from: p */
    private final void m4733p() {
        this.f3327C = 0;
        this.f3326B = 0;
        this.f3325A = 0;
        this.f3328D = 0;
        this.f3329E = false;
        this.f3330F = 0;
    }

    /* renamed from: q */
    private final boolean m4734q() {
        if (bkp.f4570a < 23) {
            return this.f3370p == 5 || this.f3370p == 6;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m4724b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1095064472(0xffffffffbebaa468, float:-0.36453557)
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 187078296(0xb269698, float:3.208373E-32)
            if (r0 == r1) goto L_0x002e
            r1 = 1504578661(0x59ae0c65, float:6.1237842E15)
            if (r0 == r1) goto L_0x0024
            r1 = 1505942594(0x59c2dc42, float:6.8560402E15)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = -1
        L_0x0043:
            switch(r3) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x004a;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r2
        L_0x0047:
            r3 = 8
            return r3
        L_0x004a:
            r3 = 7
            return r3
        L_0x004c:
            r3 = 6
            return r3
        L_0x004e:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baz.m4724b(java.lang.String):int");
    }
}
