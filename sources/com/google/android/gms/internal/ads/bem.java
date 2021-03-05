package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class bem {

    /* renamed from: a */
    private static final beg f3983a = beg.m5095a("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f3984b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C1131a, List<beg>> f3985c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f3986d;

    /* renamed from: e */
    private static final SparseIntArray f3987e;

    /* renamed from: f */
    private static final Map<String, Integer> f3988f;

    /* renamed from: g */
    private static int f3989g = -1;

    /* renamed from: a */
    public static beg m5140a() {
        return f3983a;
    }

    /* renamed from: a */
    public static beg m5141a(String str, boolean z) {
        List<beg> b = m5144b(str, z);
        if (b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    /* renamed from: com.google.android.gms.internal.ads.bem$a */
    static final class C1131a {

        /* renamed from: a */
        public final String f3990a;

        /* renamed from: b */
        public final boolean f3991b;

        public C1131a(String str, boolean z) {
            this.f3990a = str;
            this.f3991b = z;
        }

        public final int hashCode() {
            return (((this.f3990a == null ? 0 : this.f3990a.hashCode()) + 31) * 31) + (this.f3991b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C1131a.class) {
                return false;
            }
            C1131a aVar = (C1131a) obj;
            return TextUtils.equals(this.f3990a, aVar.f3990a) && this.f3991b == aVar.f3991b;
        }
    }

    /* renamed from: b */
    private static synchronized List<beg> m5144b(String str, boolean z) {
        synchronized (bem.class) {
            C1131a aVar = new C1131a(str, z);
            List<beg> list = f3985c.get(aVar);
            if (list != null) {
                return list;
            }
            List<beg> a = m5142a(aVar, bkp.f4570a >= 21 ? new ber(z) : new beq());
            if (z && a.isEmpty() && 21 <= bkp.f4570a && bkp.f4570a <= 23) {
                a = m5142a(aVar, (bep) new beq());
                if (!a.isEmpty()) {
                    String str2 = a.get(0).f3930a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<beg> unmodifiableList = Collections.unmodifiableList(a);
            f3985c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    public static int m5143b() {
        int i;
        if (f3989g == -1) {
            int i2 = 0;
            beg a = m5141a("video/avc", false);
            if (a != null) {
                MediaCodecInfo.CodecProfileLevel[] a2 = a.mo11737a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    switch (a2[i2].level) {
                        case 1:
                        case 2:
                            i = 25344;
                            break;
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case 128:
                        case 256:
                            i = 414720;
                            break;
                        case 512:
                            i = 921600;
                            break;
                        case 1024:
                            i = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i = 2097152;
                            break;
                        case 8192:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i = 9437184;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, bkp.f4570a >= 21 ? 345600 : 172800);
            }
            f3989g = i2;
        }
        return f3989g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m5138a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            switch(r2) {
                case 0: goto L_0x004a;
                case 1: goto L_0x004a;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            return r0
        L_0x0045:
            android.util.Pair r9 = m5139a((java.lang.String) r9, (java.lang.String[]) r1)
            return r9
        L_0x004a:
            int r2 = r1.length
            r3 = 4
            if (r2 >= r3) goto L_0x006a
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x0061
            java.lang.String r9 = r2.concat(r9)
            goto L_0x0066
        L_0x0061:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x0066:
            android.util.Log.w(r1, r9)
            return r0
        L_0x006a:
            java.util.regex.Pattern r2 = f3984b
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0094
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x008b
            java.lang.String r9 = r2.concat(r9)
            goto L_0x0090
        L_0x008b:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x0090:
            android.util.Log.w(r1, r9)
            return r0
        L_0x0094:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00a2
            r7 = 1
            goto L_0x00aa
        L_0x00a2:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00e1
        L_0x00aa:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f3988f
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00d7
            java.lang.String r9 = "MediaCodecUtil"
            java.lang.String r1 = "Unknown HEVC level string: "
            java.lang.String r2 = r2.group(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00cd
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d3:
            android.util.Log.w(r9, r1)
            return r0
        L_0x00d7:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00e1:
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r9 = r2.concat(r9)
            goto L_0x00f9
        L_0x00f4:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x00f9:
            android.util.Log.w(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bem.m5138a(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b4 A[Catch:{ Exception -> 0x02a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x029e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.beg> m5142a(com.google.android.gms.internal.ads.bem.C1131a r16, com.google.android.gms.internal.ads.bep r17) {
        /*
            r1 = r16
            r2 = r17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02a5 }
            r3.<init>()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r4 = r1.f3990a     // Catch:{ Exception -> 0x02a5 }
            int r5 = r17.mo11752a()     // Catch:{ Exception -> 0x02a5 }
            boolean r6 = r17.mo11755b()     // Catch:{ Exception -> 0x02a5 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x02a4
            android.media.MediaCodecInfo r9 = r2.mo11753a(r8)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = ".secure"
            boolean r0 = r10.endsWith(r0)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0030
            goto L_0x01b1
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            r12 = 21
            if (r0 >= r12) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01b1
        L_0x0068:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            r12 = 18
            if (r0 >= r12) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0078
            goto L_0x01b1
        L_0x0078:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            if (r0 >= r12) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r12 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0090
            goto L_0x01b1
        L_0x0090:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            r12 = 16
            if (r0 != r12) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "protou"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "ville"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villeplus"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villec2"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "gee"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6602"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6603"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6606"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6616"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "L36h"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "SO-02E"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0118
            goto L_0x01b1
        L_0x0118:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            if (r0 != r12) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r12 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1505"
            java.lang.String r12 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1604"
            java.lang.String r12 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1605"
            java.lang.String r12 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x014d
            goto L_0x01b1
        L_0x014d:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            r12 = 19
            if (r0 > r12) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r13 = com.google.android.gms.internal.ads.bkp.f4572c     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "d2"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "serrano"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "jflte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "santos"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "t0"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            goto L_0x01b1
        L_0x0198:
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            if (r0 > r12) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.bkp.f4571b     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r12 = "jflte"
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x029e
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x02a5 }
            int r13 = r12.length     // Catch:{ Exception -> 0x02a5 }
            r14 = 0
        L_0x01ba:
            if (r14 >= r13) goto L_0x029e
            r15 = r12[r14]     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0297
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x022c }
            boolean r11 = r2.mo11754a(r4, r0)     // Catch:{ Exception -> 0x022c }
            int r7 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x022c }
            r2 = 22
            if (r7 > r2) goto L_0x01f8
            java.lang.String r2 = com.google.android.gms.internal.ads.bkp.f4573d     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = "ODROID-XU3"
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x022c }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = com.google.android.gms.internal.ads.bkp.f4573d     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = "Nexus 10"
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x022c }
            if (r2 == 0) goto L_0x01f8
        L_0x01e6:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x022c }
            if (r2 != 0) goto L_0x01f6
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x022c }
            if (r2 == 0) goto L_0x01f8
        L_0x01f6:
            r2 = 1
            goto L_0x01f9
        L_0x01f8:
            r2 = 0
        L_0x01f9:
            if (r6 == 0) goto L_0x0202
            boolean r7 = r1.f3991b     // Catch:{ Exception -> 0x022c }
            if (r7 == r11) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r7 = 0
            goto L_0x0209
        L_0x0202:
            if (r6 != 0) goto L_0x0212
            boolean r7 = r1.f3991b     // Catch:{ Exception -> 0x022c }
            if (r7 != 0) goto L_0x0212
            goto L_0x0200
        L_0x0209:
            com.google.android.gms.internal.ads.beg r0 = com.google.android.gms.internal.ads.beg.m5096a(r10, r4, r0, r2, r7)     // Catch:{ Exception -> 0x022c }
            r3.add(r0)     // Catch:{ Exception -> 0x022c }
            goto L_0x0297
        L_0x0212:
            r7 = 0
            if (r6 != 0) goto L_0x0297
            if (r11 == 0) goto L_0x0297
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = ".secure"
            java.lang.String r7 = r11.concat(r7)     // Catch:{ Exception -> 0x022c }
            r11 = 1
            com.google.android.gms.internal.ads.beg r0 = com.google.android.gms.internal.ads.beg.m5096a(r7, r4, r0, r2, r11)     // Catch:{ Exception -> 0x022a }
            r3.add(r0)     // Catch:{ Exception -> 0x022a }
            return r3
        L_0x022a:
            r0 = move-exception
            goto L_0x022e
        L_0x022c:
            r0 = move-exception
            r11 = 1
        L_0x022e:
            int r2 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ Exception -> 0x02a5 }
            r7 = 23
            if (r2 > r7) goto L_0x0260
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x02a5 }
            if (r2 != 0) goto L_0x0260
            java.lang.String r0 = "MediaCodecUtil"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + 46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a5 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "Skipping codec "
            r7.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r7.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = " (failed to query capabilities)"
            r7.append(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x02a5 }
            android.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x0298
        L_0x0260:
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + 25
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x02a5 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a5 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "Failed to query codec "
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r3.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = " ("
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r3.append(r15)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = ")"
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x02a5 }
            android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x02a5 }
            throw r0     // Catch:{ Exception -> 0x02a5 }
        L_0x0297:
            r11 = 1
        L_0x0298:
            int r14 = r14 + 1
            r2 = r17
            goto L_0x01ba
        L_0x029e:
            int r8 = r8 + 1
            r2 = r17
            goto L_0x0014
        L_0x02a4:
            return r3
        L_0x02a5:
            r0 = move-exception
            com.google.android.gms.internal.ads.beo r1 = new com.google.android.gms.internal.ads.beo
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bem.m5142a(com.google.android.gms.internal.ads.bem$a, com.google.android.gms.internal.ads.bep):java.util.List");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m5139a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf2;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String valueOf3 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf4 = Integer.valueOf(f3986d.get(num2.intValue()));
            if (valueOf4 == null) {
                String valueOf5 = String.valueOf(num2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf5);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf6 = Integer.valueOf(f3987e.get(num.intValue()));
            if (valueOf6 != null) {
                return new Pair<>(valueOf4, valueOf6);
            }
            String valueOf7 = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf7).length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(valueOf7);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf8 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf8.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf8) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3986d = sparseIntArray;
        sparseIntArray.put(66, 1);
        f3986d.put(77, 2);
        f3986d.put(88, 4);
        f3986d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3987e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f3987e.put(11, 4);
        f3987e.put(12, 8);
        f3987e.put(13, 16);
        f3987e.put(20, 32);
        f3987e.put(21, 64);
        f3987e.put(22, 128);
        f3987e.put(30, 256);
        f3987e.put(31, 512);
        f3987e.put(32, 1024);
        f3987e.put(40, 2048);
        f3987e.put(41, 4096);
        f3987e.put(42, 8192);
        f3987e.put(50, 16384);
        f3987e.put(51, 32768);
        f3987e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f3988f = hashMap;
        hashMap.put("L30", 1);
        f3988f.put("L60", 4);
        f3988f.put("L63", 16);
        f3988f.put("L90", 64);
        f3988f.put("L93", 256);
        f3988f.put("L120", 1024);
        f3988f.put("L123", 4096);
        f3988f.put("L150", 16384);
        f3988f.put("L153", 65536);
        f3988f.put("L156", 262144);
        f3988f.put("L180", 1048576);
        f3988f.put("L183", 4194304);
        f3988f.put("L186", 16777216);
        f3988f.put("H30", 2);
        f3988f.put("H60", 8);
        f3988f.put("H63", 32);
        f3988f.put("H90", 128);
        f3988f.put("H93", 512);
        f3988f.put("H120", 2048);
        f3988f.put("H123", 8192);
        f3988f.put("H150", 32768);
        f3988f.put("H153", 131072);
        f3988f.put("H156", 524288);
        f3988f.put("H180", 2097152);
        f3988f.put("H183", 8388608);
        f3988f.put("H186", 33554432);
    }
}
