package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class bcx implements bcg {

    /* renamed from: a */
    private static final bck f3541a = new bcy();

    /* renamed from: b */
    private static final byte[] f3542b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f3543c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final UUID f3544d = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f3545A;

    /* renamed from: B */
    private boolean f3546B;

    /* renamed from: C */
    private long f3547C;

    /* renamed from: D */
    private long f3548D;

    /* renamed from: E */
    private long f3549E;

    /* renamed from: F */
    private bkb f3550F;

    /* renamed from: G */
    private bkb f3551G;

    /* renamed from: H */
    private boolean f3552H;

    /* renamed from: I */
    private int f3553I;

    /* renamed from: J */
    private long f3554J;

    /* renamed from: K */
    private long f3555K;

    /* renamed from: L */
    private int f3556L;

    /* renamed from: M */
    private int f3557M;

    /* renamed from: N */
    private int[] f3558N;

    /* renamed from: O */
    private int f3559O;

    /* renamed from: P */
    private int f3560P;

    /* renamed from: Q */
    private int f3561Q;

    /* renamed from: R */
    private int f3562R;

    /* renamed from: S */
    private boolean f3563S;

    /* renamed from: T */
    private boolean f3564T;

    /* renamed from: U */
    private boolean f3565U;

    /* renamed from: V */
    private boolean f3566V;

    /* renamed from: W */
    private byte f3567W;

    /* renamed from: X */
    private int f3568X;

    /* renamed from: Y */
    private int f3569Y;

    /* renamed from: Z */
    private int f3570Z;

    /* renamed from: aa */
    private boolean f3571aa;

    /* renamed from: ab */
    private boolean f3572ab;

    /* renamed from: ac */
    private bcj f3573ac;

    /* renamed from: e */
    private final bcv f3574e;

    /* renamed from: f */
    private final bdc f3575f;

    /* renamed from: g */
    private final SparseArray<bda> f3576g;

    /* renamed from: h */
    private final boolean f3577h;

    /* renamed from: i */
    private final bkh f3578i;

    /* renamed from: j */
    private final bkh f3579j;

    /* renamed from: k */
    private final bkh f3580k;

    /* renamed from: l */
    private final bkh f3581l;

    /* renamed from: m */
    private final bkh f3582m;

    /* renamed from: n */
    private final bkh f3583n;

    /* renamed from: o */
    private final bkh f3584o;

    /* renamed from: p */
    private final bkh f3585p;

    /* renamed from: q */
    private final bkh f3586q;

    /* renamed from: r */
    private ByteBuffer f3587r;

    /* renamed from: s */
    private long f3588s;

    /* renamed from: t */
    private long f3589t;

    /* renamed from: u */
    private long f3590u;

    /* renamed from: v */
    private long f3591v;

    /* renamed from: w */
    private long f3592w;

    /* renamed from: x */
    private bda f3593x;

    /* renamed from: y */
    private boolean f3594y;

    /* renamed from: z */
    private int f3595z;

    public bcx() {
        this(0);
    }

    /* renamed from: a */
    static int m4983a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    static boolean m4992b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: c */
    public final void mo11687c() {
    }

    public bcx(int i) {
        this(new bcs(), i);
    }

    private bcx(bcv bcv, int i) {
        this.f3589t = -1;
        this.f3590u = -9223372036854775807L;
        this.f3591v = -9223372036854775807L;
        this.f3592w = -9223372036854775807L;
        this.f3547C = -1;
        this.f3548D = -1;
        this.f3549E = -9223372036854775807L;
        this.f3574e = bcv;
        this.f3574e.mo11696a((bcw) new bcz(this, (bcy) null));
        this.f3577h = (i & 1) != 0 ? false : true;
        this.f3575f = new bdc();
        this.f3576g = new SparseArray<>();
        this.f3580k = new bkh(4);
        this.f3581l = new bkh(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3582m = new bkh(4);
        this.f3578i = new bkh(bke.f4541a);
        this.f3579j = new bkh(4);
        this.f3583n = new bkh();
        this.f3584o = new bkh();
        this.f3585p = new bkh(8);
        this.f3586q = new bkh();
    }

    /* renamed from: a */
    public final boolean mo11686a(bci bci) {
        return new bdb().mo11714a(bci);
    }

    /* renamed from: a */
    public final void mo11685a(bcj bcj) {
        this.f3573ac = bcj;
    }

    /* renamed from: a */
    public final void mo11684a(long j, long j2) {
        this.f3549E = -9223372036854775807L;
        this.f3553I = 0;
        this.f3574e.mo11695a();
        this.f3575f.mo11716a();
        m4991b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11683a(com.google.android.gms.internal.ads.bci r9, com.google.android.gms.internal.ads.bcn r10) {
        /*
            r8 = this;
            r0 = 0
            r8.f3571aa = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.f3571aa
            if (r3 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.bcv r2 = r8.f3574e
            boolean r2 = r2.mo11697a((com.google.android.gms.internal.ads.bci) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo11673b()
            boolean r5 = r8.f3546B
            if (r5 == 0) goto L_0x0025
            r8.f3548D = r3
            long r3 = r8.f3547C
            r10.f3528a = r3
            r8.f3546B = r0
        L_0x0023:
            r3 = 1
            goto L_0x0039
        L_0x0025:
            boolean r3 = r8.f3594y
            if (r3 == 0) goto L_0x0038
            long r3 = r8.f3548D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            long r3 = r8.f3548D
            r10.f3528a = r3
            r8.f3548D = r5
            goto L_0x0023
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            return r0
        L_0x003f:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bcx.mo11683a(com.google.android.gms.internal.ads.bci, com.google.android.gms.internal.ads.bcn):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11709a(int i, long j, long j2) {
        if (i == 160) {
            this.f3572ab = false;
        } else if (i == 174) {
            this.f3593x = new bda((bcy) null);
        } else if (i == 187) {
            this.f3552H = false;
        } else if (i == 19899) {
            this.f3595z = -1;
            this.f3545A = -1;
        } else if (i == 20533) {
            this.f3593x.f3618e = true;
        } else if (i == 21968) {
            this.f3593x.f3630q = true;
        } else if (i == 25152) {
        } else {
            if (i != 408125543) {
                if (i == 475249515) {
                    this.f3550F = new bkb();
                    this.f3551G = new bkb();
                } else if (i != 524531317 || this.f3594y) {
                } else {
                    if (!this.f3577h || this.f3547C == -1) {
                        this.f3573ac.mo11690a(new bcp(this.f3592w));
                        this.f3594y = true;
                        return;
                    }
                    this.f3546B = true;
                }
            } else if (this.f3589t == -1 || this.f3589t == j) {
                this.f3589t = j;
                this.f3588s = j2;
            } else {
                throw new bad("Multiple Segment elements not supported");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11711c(int i) {
        bco bco;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f3593x.f3614a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    this.f3593x.mo11713a(this.f3573ac, this.f3593x.f3615b);
                    this.f3576g.put(this.f3593x.f3615b, this.f3593x);
                }
                this.f3593x = null;
            } else if (i != 19899) {
                if (i != 25152) {
                    if (i != 28032) {
                        if (i == 357149030) {
                            if (this.f3590u == -9223372036854775807L) {
                                this.f3590u = 1000000;
                            }
                            if (this.f3591v != -9223372036854775807L) {
                                this.f3592w = m4985a(this.f3591v);
                            }
                        } else if (i != 374648427) {
                            if (i == 475249515 && !this.f3594y) {
                                bcj bcj = this.f3573ac;
                                if (this.f3589t == -1 || this.f3592w == -9223372036854775807L || this.f3550F == null || this.f3550F.mo12043a() == 0 || this.f3551G == null || this.f3551G.mo12043a() != this.f3550F.mo12043a()) {
                                    this.f3550F = null;
                                    this.f3551G = null;
                                    bco = new bcp(this.f3592w);
                                } else {
                                    int a = this.f3550F.mo12043a();
                                    int[] iArr = new int[a];
                                    long[] jArr = new long[a];
                                    long[] jArr2 = new long[a];
                                    long[] jArr3 = new long[a];
                                    for (int i4 = 0; i4 < a; i4++) {
                                        jArr3[i4] = this.f3550F.mo12044a(i4);
                                        jArr[i4] = this.f3589t + this.f3551G.mo12044a(i4);
                                    }
                                    while (true) {
                                        i2 = a - 1;
                                        if (i3 >= i2) {
                                            break;
                                        }
                                        int i5 = i3 + 1;
                                        iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                                        jArr2[i3] = jArr3[i5] - jArr3[i3];
                                        i3 = i5;
                                    }
                                    iArr[i2] = (int) ((this.f3589t + this.f3588s) - jArr[i2]);
                                    jArr2[i2] = this.f3592w - jArr3[i2];
                                    this.f3550F = null;
                                    this.f3551G = null;
                                    bco = new bcd(iArr, jArr, jArr2, jArr3);
                                }
                                bcj.mo11690a(bco);
                                this.f3594y = true;
                            }
                        } else if (this.f3576g.size() != 0) {
                            this.f3573ac.mo11689a();
                        } else {
                            throw new bad("No valid tracks were found");
                        }
                    } else if (this.f3593x.f3618e && this.f3593x.f3619f != null) {
                        throw new bad("Combining encryption and compression is not supported");
                    }
                } else if (!this.f3593x.f3618e) {
                } else {
                    if (this.f3593x.f3620g != null) {
                        this.f3593x.f3622i = new zzhp(new zzhp.zza(azl.f3170b, "video/webm", this.f3593x.f3620g.f3531b));
                        return;
                    }
                    throw new bad("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (this.f3595z == -1 || this.f3545A == -1) {
                throw new bad("Mandatory element SeekID or SeekPosition not found");
            } else if (this.f3595z == 475249515) {
                this.f3547C = this.f3545A;
            }
        } else if (this.f3553I == 2) {
            if (!this.f3572ab) {
                this.f3561Q |= 1;
            }
            m4989a(this.f3576g.get(this.f3559O), this.f3554J);
            this.f3553I = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11708a(int i, long j) {
        boolean z = false;
        switch (i) {
            case 131:
                this.f3593x.f3616c = (int) j;
                return;
            case 136:
                bda bda = this.f3593x;
                if (j == 1) {
                    z = true;
                }
                bda.f3609L = z;
                return;
            case 155:
                this.f3555K = m4985a(j);
                return;
            case 159:
                this.f3593x.f3604G = (int) j;
                return;
            case 176:
                this.f3593x.f3623j = (int) j;
                return;
            case 179:
                this.f3550F.mo12045a(m4985a(j));
                return;
            case 186:
                this.f3593x.f3624k = (int) j;
                return;
            case 215:
                this.f3593x.f3615b = (int) j;
                return;
            case 231:
                this.f3549E = m4985a(j);
                return;
            case 241:
                if (!this.f3552H) {
                    this.f3551G.mo12045a(j);
                    this.f3552H = true;
                    return;
                }
                return;
            case 251:
                this.f3572ab = true;
                return;
            case 16980:
                if (j != 3) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("ContentCompAlgo ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new bad(sb.toString());
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("DocTypeReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new bad(sb2.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("EBMLReadVersion ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new bad(sb3.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb4 = new StringBuilder(49);
                    sb4.append("ContentEncAlgo ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new bad(sb4.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb5 = new StringBuilder(56);
                    sb5.append("AESSettingsCipherMode ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new bad(sb5.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingOrder ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new bad(sb6.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(55);
                    sb7.append("ContentEncodingScope ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new bad(sb7.toString());
                }
                return;
            case 21420:
                this.f3545A = j + this.f3589t;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 3) {
                    this.f3593x.f3629p = 1;
                    return;
                } else if (i2 != 15) {
                    switch (i2) {
                        case 0:
                            this.f3593x.f3629p = 0;
                            return;
                        case 1:
                            this.f3593x.f3629p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f3593x.f3629p = 3;
                    return;
                }
            case 21680:
                this.f3593x.f3625l = (int) j;
                return;
            case 21682:
                this.f3593x.f3627n = (int) j;
                return;
            case 21690:
                this.f3593x.f3626m = (int) j;
                return;
            case 21930:
                bda bda2 = this.f3593x;
                if (j == 1) {
                    z = true;
                }
                bda2.f3610M = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.f3593x.f3633t = 2;
                        return;
                    case 2:
                        this.f3593x.f3633t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i3 = (int) j;
                if (i3 != 1) {
                    if (i3 == 16) {
                        this.f3593x.f3632s = 6;
                        return;
                    } else if (i3 != 18) {
                        switch (i3) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.f3593x.f3632s = 7;
                        return;
                    }
                }
                this.f3593x.f3632s = 3;
                return;
            case 21947:
                this.f3593x.f3630q = true;
                int i4 = (int) j;
                if (i4 == 1) {
                    this.f3593x.f3631r = 1;
                    return;
                } else if (i4 != 9) {
                    switch (i4) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f3593x.f3631r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f3593x.f3631r = 6;
                    return;
                }
            case 21948:
                this.f3593x.f3634u = (int) j;
                return;
            case 21949:
                this.f3593x.f3635v = (int) j;
                return;
            case 22186:
                this.f3593x.f3607J = j;
                return;
            case 22203:
                this.f3593x.f3608K = j;
                return;
            case 25188:
                this.f3593x.f3605H = (int) j;
                return;
            case 2352003:
                this.f3593x.f3617d = (int) j;
                return;
            case 2807729:
                this.f3590u = j;
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11706a(int i, double d) {
        if (i == 181) {
            this.f3593x.f3606I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f3593x.f3636w = (float) d;
                    return;
                case 21970:
                    this.f3593x.f3637x = (float) d;
                    return;
                case 21971:
                    this.f3593x.f3638y = (float) d;
                    return;
                case 21972:
                    this.f3593x.f3639z = (float) d;
                    return;
                case 21973:
                    this.f3593x.f3598A = (float) d;
                    return;
                case 21974:
                    this.f3593x.f3599B = (float) d;
                    return;
                case 21975:
                    this.f3593x.f3600C = (float) d;
                    return;
                case 21976:
                    this.f3593x.f3601D = (float) d;
                    return;
                case 21977:
                    this.f3593x.f3602E = (float) d;
                    return;
                case 21978:
                    this.f3593x.f3603F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f3591v = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11710a(int i, String str) {
        if (i == 134) {
            this.f3593x.f3614a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.f3593x.f3613P = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new bad(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11707a(int i, int i2, bci bci) {
        byte b;
        int i3 = i;
        int i4 = i2;
        bci bci2 = bci;
        int i5 = 0;
        int i6 = 1;
        if (i3 == 161 || i3 == 163) {
            if (this.f3553I == 0) {
                this.f3559O = (int) this.f3575f.mo11715a(bci2, false, true, 8);
                this.f3560P = this.f3575f.mo11717b();
                this.f3555K = -9223372036854775807L;
                this.f3553I = 1;
                this.f3580k.mo12047a();
            }
            bda bda = this.f3576g.get(this.f3559O);
            if (bda == null) {
                bci2.mo11674b(i4 - this.f3560P);
                this.f3553I = 0;
                return;
            }
            if (this.f3553I == 1) {
                m4987a(bci2, 3);
                int i7 = (this.f3580k.f4559a[2] & 6) >> 1;
                byte b2 = 255;
                if (i7 == 0) {
                    this.f3557M = 1;
                    this.f3558N = m4990a(this.f3558N, 1);
                    this.f3558N[0] = (i4 - this.f3560P) - 3;
                } else if (i3 == 163) {
                    m4987a(bci2, 4);
                    this.f3557M = (this.f3580k.f4559a[3] & 255) + 1;
                    this.f3558N = m4990a(this.f3558N, this.f3557M);
                    if (i7 == 2) {
                        Arrays.fill(this.f3558N, 0, this.f3557M, ((i4 - this.f3560P) - 4) / this.f3557M);
                    } else if (i7 == 1) {
                        int i8 = 4;
                        int i9 = 0;
                        for (int i10 = 0; i10 < this.f3557M - 1; i10++) {
                            this.f3558N[i10] = 0;
                            do {
                                i8++;
                                m4987a(bci2, i8);
                                b = this.f3580k.f4559a[i8 - 1] & 255;
                                int[] iArr = this.f3558N;
                                iArr[i10] = iArr[i10] + b;
                            } while (b == 255);
                            i9 += this.f3558N[i10];
                        }
                        this.f3558N[this.f3557M - 1] = ((i4 - this.f3560P) - i8) - i9;
                    } else if (i7 == 3) {
                        int i11 = 0;
                        int i12 = 4;
                        int i13 = 0;
                        while (i11 < this.f3557M - i6) {
                            this.f3558N[i11] = i5;
                            i12++;
                            m4987a(bci2, i12);
                            int i14 = i12 - 1;
                            if (this.f3580k.f4559a[i14] != 0) {
                                long j = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 8) {
                                        break;
                                    }
                                    int i16 = i6 << (7 - i15);
                                    if ((this.f3580k.f4559a[i14] & i16) != 0) {
                                        i12 += i15;
                                        m4987a(bci2, i12);
                                        long j2 = (long) (this.f3580k.f4559a[i14] & b2 & (i16 ^ -1));
                                        int i17 = i14 + 1;
                                        while (true) {
                                            j = j2;
                                            if (i17 >= i12) {
                                                break;
                                            }
                                            j2 = (j << 8) | ((long) (this.f3580k.f4559a[i17] & b2));
                                            i17++;
                                            b2 = 255;
                                        }
                                        if (i11 > 0) {
                                            j -= (1 << ((i15 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i15++;
                                        i6 = 1;
                                        b2 = 255;
                                    }
                                }
                                long j3 = j;
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    throw new bad("EBML lacing sample size out of range.");
                                }
                                int i18 = (int) j3;
                                int[] iArr2 = this.f3558N;
                                if (i11 != 0) {
                                    i18 += this.f3558N[i11 - 1];
                                }
                                iArr2[i11] = i18;
                                i13 += this.f3558N[i11];
                                i11++;
                                i5 = 0;
                                i6 = 1;
                                b2 = 255;
                            } else {
                                throw new bad("No valid varint length mask found");
                            }
                        }
                        this.f3558N[this.f3557M - 1] = ((i4 - this.f3560P) - i12) - i13;
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i7);
                        throw new bad(sb.toString());
                    }
                } else {
                    throw new bad("Lacing only supported in SimpleBlocks.");
                }
                this.f3554J = this.f3549E + m4985a((long) ((this.f3580k.f4559a[0] << 8) | (this.f3580k.f4559a[1] & 255)));
                this.f3561Q = ((bda.f3616c == 2 || (i3 == 163 && (this.f3580k.f4559a[2] & 128) == 128)) ? 1 : 0) | ((this.f3580k.f4559a[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                this.f3553I = 2;
                this.f3556L = 0;
            }
            if (i3 == 163) {
                while (this.f3556L < this.f3557M) {
                    m4988a(bci2, bda, this.f3558N[this.f3556L]);
                    m4989a(bda, this.f3554J + ((long) ((this.f3556L * bda.f3617d) / 1000)));
                    this.f3556L++;
                }
                this.f3553I = 0;
                return;
            }
            m4988a(bci2, bda, this.f3558N[0]);
        } else if (i3 == 16981) {
            this.f3593x.f3619f = new byte[i4];
            bci2.mo11675b(this.f3593x.f3619f, 0, i4);
        } else if (i3 == 18402) {
            byte[] bArr = new byte[i4];
            bci2.mo11675b(bArr, 0, i4);
            this.f3593x.f3620g = new bcr(1, bArr);
        } else if (i3 == 21419) {
            Arrays.fill(this.f3582m.f4559a, (byte) 0);
            bci2.mo11675b(this.f3582m.f4559a, 4 - i4, i4);
            this.f3582m.mo12054c(0);
            this.f3595z = (int) this.f3582m.mo12063j();
        } else if (i3 == 25506) {
            this.f3593x.f3621h = new byte[i4];
            bci2.mo11675b(this.f3593x.f3621h, 0, i4);
        } else if (i3 == 30322) {
            this.f3593x.f3628o = new byte[i4];
            bci2.mo11675b(this.f3593x.f3628o, 0, i4);
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unexpected id: ");
            sb2.append(i3);
            throw new bad(sb2.toString());
        }
    }

    /* renamed from: a */
    private final void m4989a(bda bda, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(bda.f3614a)) {
            byte[] bArr2 = this.f3584o.f4559a;
            long j2 = this.f3555K;
            if (j2 == -9223372036854775807L) {
                bArr = f3543c;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = bkp.m5825c(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            bda.f3611N.mo11681a(this.f3584o, this.f3584o.mo12053c());
            this.f3570Z += this.f3584o.mo12053c();
        }
        bda.f3611N.mo11680a(j, this.f3561Q, this.f3570Z, 0, bda.f3620g);
        this.f3571aa = true;
        m4991b();
    }

    /* renamed from: b */
    private final void m4991b() {
        this.f3562R = 0;
        this.f3570Z = 0;
        this.f3569Y = 0;
        this.f3563S = false;
        this.f3564T = false;
        this.f3566V = false;
        this.f3568X = 0;
        this.f3567W = 0;
        this.f3565U = false;
        this.f3583n.mo12047a();
    }

    /* renamed from: a */
    private final void m4987a(bci bci, int i) {
        if (this.f3580k.mo12053c() < i) {
            if (this.f3580k.mo12057e() < i) {
                this.f3580k.mo12049a(Arrays.copyOf(this.f3580k.f4559a, Math.max(this.f3580k.f4559a.length << 1, i)), this.f3580k.mo12053c());
            }
            bci.mo11675b(this.f3580k.f4559a, this.f3580k.mo12053c(), i - this.f3580k.mo12053c());
            this.f3580k.mo12052b(i);
        }
    }

    /* renamed from: a */
    private final void m4988a(bci bci, bda bda, int i) {
        if ("S_TEXT/UTF8".equals(bda.f3614a)) {
            int length = f3542b.length + i;
            if (this.f3584o.mo12057e() < length) {
                this.f3584o.f4559a = Arrays.copyOf(f3542b, length + i);
            }
            bci.mo11675b(this.f3584o.f4559a, f3542b.length, i);
            this.f3584o.mo12054c(0);
            this.f3584o.mo12052b(length);
            return;
        }
        bcq bcq = bda.f3611N;
        if (!this.f3563S) {
            if (bda.f3618e) {
                this.f3561Q &= -1073741825;
                int i2 = 128;
                if (!this.f3564T) {
                    bci.mo11675b(this.f3580k.f4559a, 0, 1);
                    this.f3562R++;
                    if ((this.f3580k.f4559a[0] & 128) != 128) {
                        this.f3567W = this.f3580k.f4559a[0];
                        this.f3564T = true;
                    } else {
                        throw new bad("Extension bit is set in signal byte");
                    }
                }
                if ((this.f3567W & 1) == 1) {
                    boolean z = (this.f3567W & 2) == 2;
                    this.f3561Q |= 1073741824;
                    if (!this.f3565U) {
                        bci.mo11675b(this.f3585p.f4559a, 0, 8);
                        this.f3562R += 8;
                        this.f3565U = true;
                        byte[] bArr = this.f3580k.f4559a;
                        if (!z) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.f3580k.mo12054c(0);
                        bcq.mo11681a(this.f3580k, 1);
                        this.f3570Z++;
                        this.f3585p.mo12054c(0);
                        bcq.mo11681a(this.f3585p, 8);
                        this.f3570Z += 8;
                    }
                    if (z) {
                        if (!this.f3566V) {
                            bci.mo11675b(this.f3580k.f4559a, 0, 1);
                            this.f3562R++;
                            this.f3580k.mo12054c(0);
                            this.f3568X = this.f3580k.mo12059f();
                            this.f3566V = true;
                        }
                        int i3 = this.f3568X << 2;
                        this.f3580k.mo12048a(i3);
                        bci.mo11675b(this.f3580k.f4559a, 0, i3);
                        this.f3562R += i3;
                        short s = (short) ((this.f3568X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.f3587r == null || this.f3587r.capacity() < i4) {
                            this.f3587r = ByteBuffer.allocate(i4);
                        }
                        this.f3587r.position(0);
                        this.f3587r.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f3568X) {
                            int o = this.f3580k.mo12068o();
                            if (i5 % 2 == 0) {
                                this.f3587r.putShort((short) (o - i6));
                            } else {
                                this.f3587r.putInt(o - i6);
                            }
                            i5++;
                            i6 = o;
                        }
                        int i7 = (i - this.f3562R) - i6;
                        if (this.f3568X % 2 == 1) {
                            this.f3587r.putInt(i7);
                        } else {
                            this.f3587r.putShort((short) i7);
                            this.f3587r.putInt(0);
                        }
                        this.f3586q.mo12049a(this.f3587r.array(), i4);
                        bcq.mo11681a(this.f3586q, i4);
                        this.f3570Z += i4;
                    }
                }
            } else if (bda.f3619f != null) {
                this.f3583n.mo12049a(bda.f3619f, bda.f3619f.length);
            }
            this.f3563S = true;
        }
        int c = i + this.f3583n.mo12053c();
        if ("V_MPEG4/ISO/AVC".equals(bda.f3614a) || "V_MPEGH/ISO/HEVC".equals(bda.f3614a)) {
            byte[] bArr2 = this.f3579j.f4559a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i8 = bda.f3612O;
            int i9 = 4 - bda.f3612O;
            while (this.f3562R < c) {
                if (this.f3569Y == 0) {
                    int min = Math.min(i8, this.f3583n.mo12051b());
                    bci.mo11675b(bArr2, i9 + min, i8 - min);
                    if (min > 0) {
                        this.f3583n.mo12050a(bArr2, i9, min);
                    }
                    this.f3562R += i8;
                    this.f3579j.mo12054c(0);
                    this.f3569Y = this.f3579j.mo12068o();
                    this.f3578i.mo12054c(0);
                    bcq.mo11681a(this.f3578i, 4);
                    this.f3570Z += 4;
                } else {
                    this.f3569Y -= m4984a(bci, bcq, this.f3569Y);
                }
            }
        } else {
            while (this.f3562R < c) {
                m4984a(bci, bcq, c - this.f3562R);
            }
        }
        if ("A_VORBIS".equals(bda.f3614a)) {
            this.f3581l.mo12054c(0);
            bcq.mo11681a(this.f3581l, 4);
            this.f3570Z += 4;
        }
    }

    /* renamed from: a */
    private final int m4984a(bci bci, bcq bcq, int i) {
        int i2;
        int b = this.f3583n.mo12051b();
        if (b > 0) {
            i2 = Math.min(i, b);
            bcq.mo11681a(this.f3583n, i2);
        } else {
            i2 = bcq.mo11679a(bci, i, false);
        }
        this.f3562R += i2;
        this.f3570Z += i2;
        return i2;
    }

    /* renamed from: a */
    private final long m4985a(long j) {
        if (this.f3590u != -9223372036854775807L) {
            return bkp.m5813a(j, this.f3590u, 1000);
        }
        throw new bad("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static int[] m4990a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
