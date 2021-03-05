package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzki;
import java.util.ArrayList;
import java.util.List;

final class bdg {

    /* renamed from: a */
    private static final int f3744a = bkp.m5828f("vide");

    /* renamed from: b */
    private static final int f3745b = bkp.m5828f("soun");

    /* renamed from: c */
    private static final int f3746c = bkp.m5828f("text");

    /* renamed from: d */
    private static final int f3747d = bkp.m5828f("sbtl");

    /* renamed from: e */
    private static final int f3748e = bkp.m5828f("subt");

    /* renamed from: f */
    private static final int f3749f = bkp.m5828f("clcp");

    /* renamed from: g */
    private static final int f3750g = bkp.m5828f("cenc");

    /* renamed from: h */
    private static final int f3751h = bkp.m5828f("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v21, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0541: MOVE  (r2v69 java.lang.String) = (r41v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07eb  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b6  */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.beb m5035a(com.google.android.gms.internal.ads.bde r49, com.google.android.gms.internal.ads.bdf r50, long r51, com.google.android.gms.internal.ads.zzhp r53, boolean r54) {
        /*
            r0 = r49
            r15 = r53
            int r1 = com.google.android.gms.internal.ads.bdd.f3650E
            com.google.android.gms.internal.ads.bde r1 = r0.mo11722e(r1)
            int r2 = com.google.android.gms.internal.ads.bdd.f3664S
            com.google.android.gms.internal.ads.bdf r2 = r1.mo11721d(r2)
            com.google.android.gms.internal.ads.bkh r2 = r2.f3743aP
            r14 = 16
            r2.mo12054c(r14)
            int r2 = r2.mo12065l()
            int r3 = f3745b
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = f3744a
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = f3746c
            if (r2 == r3) goto L_0x0042
            int r3 = f3747d
            if (r2 == r3) goto L_0x0042
            int r3 = f3748e
            if (r2 == r3) goto L_0x0042
            int r3 = f3749f
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = f3751h
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.bdd.f3660O
            com.google.android.gms.internal.ads.bdf r2 = r0.mo11721d(r2)
            com.google.android.gms.internal.ads.bkh r2 = r2.f3743aP
            r7 = 8
            r2.mo12054c(r7)
            int r3 = r2.mo12065l()
            int r3 = com.google.android.gms.internal.ads.bdd.m5025a(r3)
            if (r3 != 0) goto L_0x0061
            r5 = 8
            goto L_0x0063
        L_0x0061:
            r5 = 16
        L_0x0063:
            r2.mo12056d(r5)
            int r5 = r2.mo12065l()
            r2.mo12056d(r4)
            int r6 = r2.mo12055d()
            if (r3 != 0) goto L_0x0075
            r12 = 4
            goto L_0x0077
        L_0x0075:
            r12 = 8
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 >= r12) goto L_0x0088
            byte[] r8 = r2.f4559a
            int r17 = r6 + r9
            byte r8 = r8[r17]
            if (r8 == r11) goto L_0x0084
            r6 = 0
            goto L_0x0089
        L_0x0084:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0078
        L_0x0088:
            r6 = 1
        L_0x0089:
            r17 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0097
            r2.mo12056d(r12)
        L_0x0095:
            r11 = r8
            goto L_0x00a9
        L_0x0097:
            if (r3 != 0) goto L_0x009e
            long r19 = r2.mo12063j()
            goto L_0x00a2
        L_0x009e:
            long r19 = r2.mo12069p()
        L_0x00a2:
            int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            goto L_0x0095
        L_0x00a7:
            r11 = r19
        L_0x00a9:
            r2.mo12056d(r14)
            int r3 = r2.mo12065l()
            int r6 = r2.mo12065l()
            r2.mo12056d(r4)
            int r4 = r2.mo12065l()
            int r2 = r2.mo12065l()
            r14 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ce
            if (r6 != r14) goto L_0x00ce
            if (r4 != r13) goto L_0x00ce
            if (r2 != 0) goto L_0x00ce
            r2 = 90
            goto L_0x00e5
        L_0x00ce:
            if (r3 != 0) goto L_0x00d9
            if (r6 != r13) goto L_0x00d9
            if (r4 != r14) goto L_0x00d9
            if (r2 != 0) goto L_0x00d9
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e5
        L_0x00d9:
            if (r3 != r13) goto L_0x00e4
            if (r6 != 0) goto L_0x00e4
            if (r4 != 0) goto L_0x00e4
            if (r2 != r13) goto L_0x00e4
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            com.google.android.gms.internal.ads.bdn r14 = new com.google.android.gms.internal.ads.bdn
            r14.<init>(r5, r11, r2)
            int r4 = (r51 > r8 ? 1 : (r51 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00f7
            long r2 = r14.f3775b
            r19 = r2
            r2 = r50
            goto L_0x00fb
        L_0x00f7:
            r2 = r50
            r19 = r51
        L_0x00fb:
            com.google.android.gms.internal.ads.bkh r2 = r2.f3743aP
            r2.mo12054c(r7)
            int r3 = r2.mo12065l()
            int r3 = com.google.android.gms.internal.ads.bdd.m5025a(r3)
            if (r3 != 0) goto L_0x010d
            r3 = 8
            goto L_0x010f
        L_0x010d:
            r3 = 16
        L_0x010f:
            r2.mo12056d(r3)
            long r25 = r2.mo12063j()
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011d
            r22 = r8
            goto L_0x0128
        L_0x011d:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r25
            long r2 = com.google.android.gms.internal.ads.bkp.m5813a((long) r19, (long) r21, (long) r23)
            r22 = r2
        L_0x0128:
            int r2 = com.google.android.gms.internal.ads.bdd.f3651F
            com.google.android.gms.internal.ads.bde r2 = r1.mo11722e(r2)
            int r3 = com.google.android.gms.internal.ads.bdd.f3652G
            com.google.android.gms.internal.ads.bde r2 = r2.mo11722e(r3)
            int r3 = com.google.android.gms.internal.ads.bdd.f3663R
            com.google.android.gms.internal.ads.bdf r1 = r1.mo11721d(r3)
            com.google.android.gms.internal.ads.bkh r1 = r1.f3743aP
            r1.mo12054c(r7)
            int r3 = r1.mo12065l()
            int r3 = com.google.android.gms.internal.ads.bdd.m5025a(r3)
            if (r3 != 0) goto L_0x014c
            r4 = 8
            goto L_0x014e
        L_0x014c:
            r4 = 16
        L_0x014e:
            r1.mo12056d(r4)
            long r4 = r1.mo12063j()
            if (r3 != 0) goto L_0x0159
            r3 = 4
            goto L_0x015b
        L_0x0159:
            r3 = 8
        L_0x015b:
            r1.mo12056d(r3)
            int r1 = r1.mo12060g()
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 3
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            android.util.Pair r13 = android.util.Pair.create(r3, r1)
            int r1 = com.google.android.gms.internal.ads.bdd.f3665T
            com.google.android.gms.internal.ads.bdf r1 = r2.mo11721d(r1)
            com.google.android.gms.internal.ads.bkh r12 = r1.f3743aP
            int r19 = r14.f3774a
            int r20 = r14.f3776c
            java.lang.Object r1 = r13.second
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 12
            r12.mo12054c(r1)
            int r9 = r12.mo12065l()
            com.google.android.gms.internal.ads.bdk r8 = new com.google.android.gms.internal.ads.bdk
            r8.<init>(r9)
            r6 = 0
        L_0x01b4:
            if (r6 >= r9) goto L_0x077d
            int r5 = r12.mo12055d()
            int r4 = r12.mo12065l()
            if (r4 <= 0) goto L_0x01c2
            r1 = 1
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bjy.m5690a(r1, r2)
            int r1 = r12.mo12065l()
            int r2 = com.google.android.gms.internal.ads.bdd.f3714b
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3715c
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3671Z
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3698ak
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3716d
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3717e
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3718f
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3682aJ
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.bdd.f3683aK
            if (r1 != r2) goto L_0x01f2
            goto L_0x058b
        L_0x01f2:
            int r2 = com.google.android.gms.internal.ads.bdd.f3721i
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3688aa
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3726n
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3728p
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3730r
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3733u
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3731s
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3732t
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3711ax
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3712ay
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3724l
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3725m
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3722j
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.bdd.f3686aN
            if (r1 != r2) goto L_0x022c
            goto L_0x0313
        L_0x022c:
            int r2 = com.google.android.gms.internal.ads.bdd.f3697aj
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.bdd.f3707at
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.bdd.f3708au
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.bdd.f3709av
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.bdd.f3710aw
            if (r1 != r2) goto L_0x0241
            goto L_0x0268
        L_0x0241:
            int r2 = com.google.android.gms.internal.ads.bdd.f3685aM
            if (r1 != r2) goto L_0x0253
            java.lang.String r1 = java.lang.Integer.toString(r19)
            java.lang.String r2 = "application/x-camera-motion"
            r3 = 0
            r7 = -1
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8801a(r1, r2, r3, r7, r15)
            r8.f3763b = r1
        L_0x0253:
            r32 = r4
            r29 = r5
            r33 = r6
            r0 = r8
            r31 = r9
            r21 = r10
            r45 = r11
            r48 = r12
            r47 = r13
            r28 = r14
            goto L_0x0371
        L_0x0268:
            r3 = 0
            r7 = -1
            int r2 = r5 + 8
            r21 = 8
            int r2 = r2 + 8
            r12.mo12054c(r2)
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.bdd.f3697aj
            if (r1 != r2) goto L_0x0286
            java.lang.String r1 = "application/ttml+xml"
            r2 = r1
            r24 = r3
            r3 = 1
            r7 = 0
            r21 = 8
            goto L_0x02c4
        L_0x0286:
            int r2 = com.google.android.gms.internal.ads.bdd.f3707at
            if (r1 != r2) goto L_0x02a1
            java.lang.String r1 = "application/x-quicktime-tx3g"
            int r2 = r4 + -8
            r21 = 8
            int r2 = r2 + -8
            byte[] r3 = new byte[r2]
            r7 = 0
            r12.mo12050a(r3, r7, r2)
            java.util.List r2 = java.util.Collections.singletonList(r3)
            r24 = r2
            r3 = 1
            r2 = r1
            goto L_0x02c4
        L_0x02a1:
            r7 = 0
            r21 = 8
            int r2 = com.google.android.gms.internal.ads.bdd.f3708au
            if (r1 != r2) goto L_0x02af
            java.lang.String r1 = "application/x-mp4-vtt"
            r2 = r1
        L_0x02ab:
            r3 = 1
        L_0x02ac:
            r24 = 0
            goto L_0x02c4
        L_0x02af:
            int r2 = com.google.android.gms.internal.ads.bdd.f3709av
            if (r1 != r2) goto L_0x02b9
            java.lang.String r1 = "application/ttml+xml"
            r2 = r1
            r27 = r17
            goto L_0x02ab
        L_0x02b9:
            int r2 = com.google.android.gms.internal.ads.bdd.f3710aw
            if (r1 != r2) goto L_0x030d
            java.lang.String r1 = "application/x-mp4-cea-608"
            r3 = 1
            r8.f3765d = r3
            r2 = r1
            goto L_0x02ac
        L_0x02c4:
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r29 = 0
            r31 = -1
            r32 = 0
            r33 = -1
            r34 = 1
            r35 = 0
            r3 = r29
            r36 = r14
            r14 = r4
            r4 = r31
            r37 = r5
            r5 = r32
            r38 = r6
            r6 = r11
            r21 = 0
            r29 = -1
            r7 = r33
            r39 = r8
            r8 = r53
            r31 = r9
            r21 = r10
            r9 = r27
            r0 = r11
            r40 = r13
            r13 = -1
            r11 = r24
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8799a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (java.lang.String) r6, (int) r7, (com.google.android.gms.internal.ads.zzhp) r8, (long) r9, (java.util.List<byte[]>) r11)
            r11 = r39
            r11.f3763b = r1
            r45 = r0
            r0 = r11
            r48 = r12
            r32 = r14
            r28 = r36
            r29 = r37
            goto L_0x036d
        L_0x030d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0313:
            r37 = r5
            r38 = r6
            r31 = r9
            r21 = r10
            r0 = r11
            r40 = r13
            r36 = r14
            r13 = -1
            r14 = r4
            r11 = r8
            r10 = r37
            int r5 = r10 + 8
            r9 = 8
            int r5 = r5 + r9
            r12.mo12054c(r5)
            if (r54 == 0) goto L_0x0338
            int r2 = r12.mo12060g()
            r3 = 6
            r12.mo12056d(r3)
            goto L_0x033c
        L_0x0338:
            r12.mo12056d(r9)
            r2 = 0
        L_0x033c:
            if (r2 == 0) goto L_0x037b
            r8 = 1
            if (r2 != r8) goto L_0x0343
            r7 = 2
            goto L_0x037d
        L_0x0343:
            r7 = 2
            if (r2 != r7) goto L_0x0362
            r2 = 16
            r12.mo12056d(r2)
            long r2 = r12.mo12066m()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r3 = r12.mo12068o()
            r4 = 20
            r12.mo12056d(r4)
            goto L_0x0391
        L_0x0362:
            r45 = r0
            r29 = r10
            r0 = r11
            r48 = r12
            r32 = r14
            r28 = r36
        L_0x036d:
            r33 = r38
            r47 = r40
        L_0x0371:
            r24 = -1
            r27 = 0
        L_0x0375:
            r30 = 3
            r34 = 16
            goto L_0x0760
        L_0x037b:
            r7 = 2
            r8 = 1
        L_0x037d:
            int r3 = r12.mo12060g()
            r4 = 6
            r12.mo12056d(r4)
            int r4 = r12.mo12067n()
            if (r2 != r8) goto L_0x0390
            r2 = 16
            r12.mo12056d(r2)
        L_0x0390:
            r2 = r4
        L_0x0391:
            int r4 = r12.mo12055d()
            int r5 = com.google.android.gms.internal.ads.bdd.f3688aa
            if (r1 != r5) goto L_0x03a3
            r6 = r38
            int r1 = m5033a((com.google.android.gms.internal.ads.bkh) r12, (int) r10, (int) r14, (com.google.android.gms.internal.ads.bdk) r11, (int) r6)
            r12.mo12054c(r4)
            goto L_0x03a5
        L_0x03a3:
            r6 = r38
        L_0x03a5:
            int r5 = com.google.android.gms.internal.ads.bdd.f3726n
            if (r1 != r5) goto L_0x03ac
            java.lang.String r1 = "audio/ac3"
            goto L_0x03f6
        L_0x03ac:
            int r5 = com.google.android.gms.internal.ads.bdd.f3728p
            if (r1 != r5) goto L_0x03b3
            java.lang.String r1 = "audio/eac3"
            goto L_0x03f6
        L_0x03b3:
            int r5 = com.google.android.gms.internal.ads.bdd.f3730r
            if (r1 != r5) goto L_0x03ba
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03f6
        L_0x03ba:
            int r5 = com.google.android.gms.internal.ads.bdd.f3731s
            if (r1 == r5) goto L_0x03f4
            int r5 = com.google.android.gms.internal.ads.bdd.f3732t
            if (r1 != r5) goto L_0x03c3
            goto L_0x03f4
        L_0x03c3:
            int r5 = com.google.android.gms.internal.ads.bdd.f3733u
            if (r1 != r5) goto L_0x03ca
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03f6
        L_0x03ca:
            int r5 = com.google.android.gms.internal.ads.bdd.f3711ax
            if (r1 != r5) goto L_0x03d1
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03f6
        L_0x03d1:
            int r5 = com.google.android.gms.internal.ads.bdd.f3712ay
            if (r1 != r5) goto L_0x03d8
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03f6
        L_0x03d8:
            int r5 = com.google.android.gms.internal.ads.bdd.f3724l
            if (r1 == r5) goto L_0x03f1
            int r5 = com.google.android.gms.internal.ads.bdd.f3725m
            if (r1 != r5) goto L_0x03e1
            goto L_0x03f1
        L_0x03e1:
            int r5 = com.google.android.gms.internal.ads.bdd.f3722j
            if (r1 != r5) goto L_0x03e8
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03f6
        L_0x03e8:
            int r5 = com.google.android.gms.internal.ads.bdd.f3686aN
            if (r1 != r5) goto L_0x03ef
            java.lang.String r1 = "audio/alac"
            goto L_0x03f6
        L_0x03ef:
            r1 = 0
            goto L_0x03f6
        L_0x03f1:
            java.lang.String r1 = "audio/raw"
            goto L_0x03f6
        L_0x03f4:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03f6:
            r27 = r2
            r24 = r3
            r5 = r4
            r28 = 0
            r4 = r1
        L_0x03fe:
            int r1 = r5 - r10
            if (r1 >= r14) goto L_0x0532
            r12.mo12054c(r5)
            int r3 = r12.mo12065l()
            if (r3 <= 0) goto L_0x040d
            r1 = 1
            goto L_0x040e
        L_0x040d:
            r1 = 0
        L_0x040e:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bjy.m5690a(r1, r2)
            int r1 = r12.mo12065l()
            int r2 = com.google.android.gms.internal.ads.bdd.f3655J
            if (r1 == r2) goto L_0x04b2
            if (r54 == 0) goto L_0x0423
            int r2 = com.google.android.gms.internal.ads.bdd.f3723k
            if (r1 != r2) goto L_0x0423
            goto L_0x04b2
        L_0x0423:
            int r2 = com.google.android.gms.internal.ads.bdd.f3727o
            if (r1 != r2) goto L_0x0444
            int r1 = r5 + 8
            r12.mo12054c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r19)
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.ban.m4696a(r12, r1, r0, r15)
            r11.f3763b = r1
        L_0x0436:
            r13 = r3
            r41 = r4
            r4 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r11 = 0
            r29 = 2
            goto L_0x04af
        L_0x0444:
            int r2 = com.google.android.gms.internal.ads.bdd.f3729q
            if (r1 != r2) goto L_0x0458
            int r1 = r5 + 8
            r12.mo12054c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r19)
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.ban.m4697b(r12, r1, r0, r15)
            r11.f3763b = r1
            goto L_0x0436
        L_0x0458:
            int r2 = com.google.android.gms.internal.ads.bdd.f3734v
            if (r1 != r2) goto L_0x0492
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r29 = 0
            r30 = -1
            r32 = -1
            r33 = 0
            r34 = 0
            r2 = r4
            r13 = r3
            r3 = r29
            r41 = r4
            r4 = r30
            r42 = r5
            r5 = r32
            r43 = r6
            r6 = r24
            r29 = 2
            r7 = r27
            r8 = r33
            r9 = r53
            r44 = r10
            r10 = r34
            r15 = r11
            r11 = r0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8798a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f3763b = r1
        L_0x048e:
            r4 = r42
            r11 = 0
            goto L_0x04af
        L_0x0492:
            r13 = r3
            r41 = r4
            r42 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r29 = 2
            int r2 = com.google.android.gms.internal.ads.bdd.f3686aN
            if (r1 != r2) goto L_0x048e
            byte[] r1 = new byte[r13]
            r4 = r42
            r12.mo12054c(r4)
            r11 = 0
            r12.mo12050a(r1, r11, r13)
            r28 = r1
        L_0x04af:
            r10 = -1
            goto L_0x0520
        L_0x04b2:
            r13 = r3
            r41 = r4
            r4 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r11 = 0
            r29 = 2
            int r2 = com.google.android.gms.internal.ads.bdd.f3655J
            if (r1 != r2) goto L_0x04c5
            r1 = r4
        L_0x04c3:
            r10 = -1
            goto L_0x04eb
        L_0x04c5:
            int r1 = r12.mo12055d()
        L_0x04c9:
            int r2 = r1 - r4
            if (r2 >= r13) goto L_0x04e9
            r12.mo12054c(r1)
            int r2 = r12.mo12065l()
            if (r2 <= 0) goto L_0x04d8
            r3 = 1
            goto L_0x04d9
        L_0x04d8:
            r3 = 0
        L_0x04d9:
            java.lang.String r5 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bjy.m5690a(r3, r5)
            int r3 = r12.mo12065l()
            int r5 = com.google.android.gms.internal.ads.bdd.f3655J
            if (r3 != r5) goto L_0x04e7
            goto L_0x04c3
        L_0x04e7:
            int r1 = r1 + r2
            goto L_0x04c9
        L_0x04e9:
            r1 = -1
            goto L_0x04c3
        L_0x04eb:
            if (r1 == r10) goto L_0x051c
            android.util.Pair r1 = m5034a((com.google.android.gms.internal.ads.bkh) r12, (int) r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r28 = r1
            byte[] r28 = (byte[]) r28
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x051e
            android.util.Pair r1 = com.google.android.gms.internal.ads.bjz.m5694a((byte[]) r28)
            java.lang.Object r3 = r1.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r24 = r1
            r27 = r3
            goto L_0x051e
        L_0x051c:
            r2 = r41
        L_0x051e:
            r41 = r2
        L_0x0520:
            int r5 = r4 + r13
            r11 = r15
            r4 = r41
            r6 = r43
            r10 = r44
            r7 = 2
            r8 = 1
            r9 = 8
            r13 = -1
            r15 = r53
            goto L_0x03fe
        L_0x0532:
            r41 = r4
            r43 = r6
            r44 = r10
            r15 = r11
            r10 = -1
            r11 = 0
            r29 = 2
            com.google.android.gms.internal.ads.zzfs r1 = r15.f3763b
            if (r1 != 0) goto L_0x0575
            r2 = r41
            if (r2 == 0) goto L_0x0575
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x054f
            r8 = 2
            goto L_0x0550
        L_0x054f:
            r8 = -1
        L_0x0550:
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r3 = 0
            r4 = -1
            r5 = -1
            if (r28 != 0) goto L_0x055b
            r9 = 0
            goto L_0x0560
        L_0x055b:
            java.util.List r6 = java.util.Collections.singletonList(r28)
            r9 = r6
        L_0x0560:
            r13 = 0
            r6 = r24
            r7 = r27
            r24 = -1
            r10 = r53
            r27 = 0
            r11 = r13
            r13 = r12
            r12 = r0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8797a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.f3763b = r1
            goto L_0x057a
        L_0x0575:
            r13 = r12
            r24 = -1
            r27 = 0
        L_0x057a:
            r45 = r0
            r48 = r13
            r32 = r14
            r0 = r15
            r28 = r36
            r47 = r40
            r33 = r43
            r29 = r44
            goto L_0x0375
        L_0x058b:
            r44 = r5
            r43 = r6
            r15 = r8
            r31 = r9
            r21 = r10
            r0 = r11
            r40 = r13
            r36 = r14
            r24 = -1
            r27 = 0
            r14 = r4
            r13 = r12
            r12 = r44
            int r5 = r12 + 8
            r11 = 8
            int r5 = r5 + r11
            r13.mo12054c(r5)
            r10 = 16
            r13.mo12056d(r10)
            int r6 = r13.mo12060g()
            int r7 = r13.mo12060g()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r13.mo12056d(r3)
            int r3 = r13.mo12055d()
            int r4 = com.google.android.gms.internal.ads.bdd.f3671Z
            if (r1 != r4) goto L_0x05cf
            r9 = r43
            int r1 = m5033a((com.google.android.gms.internal.ads.bkh) r13, (int) r12, (int) r14, (com.google.android.gms.internal.ads.bdk) r15, (int) r9)
            r13.mo12054c(r3)
            goto L_0x05d1
        L_0x05cf:
            r9 = r43
        L_0x05d1:
            r2 = 0
            r4 = 0
            r28 = 0
            r29 = 1065353216(0x3f800000, float:1.0)
            r30 = 0
            r32 = -1
        L_0x05db:
            int r5 = r3 - r12
            if (r5 >= r14) goto L_0x0719
            r13.mo12054c(r3)
            int r5 = r13.mo12055d()
            int r8 = r13.mo12065l()
            if (r8 != 0) goto L_0x05f4
            int r33 = r13.mo12055d()
            int r10 = r33 - r12
            if (r10 == r14) goto L_0x0719
        L_0x05f4:
            if (r8 <= 0) goto L_0x05f8
            r10 = 1
            goto L_0x05f9
        L_0x05f8:
            r10 = 0
        L_0x05f9:
            java.lang.String r11 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bjy.m5690a(r10, r11)
            int r10 = r13.mo12065l()
            int r11 = com.google.android.gms.internal.ads.bdd.f3653H
            if (r10 != r11) goto L_0x062e
            if (r2 != 0) goto L_0x060a
            r2 = 1
            goto L_0x060b
        L_0x060a:
            r2 = 0
        L_0x060b:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            java.lang.String r2 = "video/avc"
            int r5 = r5 + 8
            r13.mo12054c(r5)
            com.google.android.gms.internal.ads.bks r5 = com.google.android.gms.internal.ads.bks.m5833a(r13)
            java.util.List<byte[]> r10 = r5.f4580a
            int r11 = r5.f4581b
            r15.f3764c = r11
            if (r4 != 0) goto L_0x0625
            float r5 = r5.f4582c
            r29 = r5
        L_0x0625:
            r45 = r0
            r46 = r1
            r28 = r10
        L_0x062b:
            r11 = 3
            goto L_0x070e
        L_0x062e:
            int r11 = com.google.android.gms.internal.ads.bdd.f3654I
            if (r10 != r11) goto L_0x064c
            if (r2 != 0) goto L_0x0636
            r2 = 1
            goto L_0x0637
        L_0x0636:
            r2 = 0
        L_0x0637:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            java.lang.String r2 = "video/hevc"
            int r5 = r5 + 8
            r13.mo12054c(r5)
            com.google.android.gms.internal.ads.bkw r5 = com.google.android.gms.internal.ads.bkw.m5837a(r13)
            java.util.List<byte[]> r10 = r5.f4591a
            int r5 = r5.f4592b
            r15.f3764c = r5
            goto L_0x0625
        L_0x064c:
            int r11 = com.google.android.gms.internal.ads.bdd.f3684aL
            if (r10 != r11) goto L_0x0662
            if (r2 != 0) goto L_0x0654
            r2 = 1
            goto L_0x0655
        L_0x0654:
            r2 = 0
        L_0x0655:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            int r2 = com.google.android.gms.internal.ads.bdd.f3682aJ
            if (r1 != r2) goto L_0x065f
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            goto L_0x0670
        L_0x065f:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x0670
        L_0x0662:
            int r11 = com.google.android.gms.internal.ads.bdd.f3719g
            if (r10 != r11) goto L_0x0675
            if (r2 != 0) goto L_0x066a
            r2 = 1
            goto L_0x066b
        L_0x066a:
            r2 = 0
        L_0x066b:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            java.lang.String r2 = "video/3gpp"
        L_0x0670:
            r45 = r0
            r46 = r1
            goto L_0x062b
        L_0x0675:
            int r11 = com.google.android.gms.internal.ads.bdd.f3655J
            if (r10 != r11) goto L_0x0697
            if (r2 != 0) goto L_0x067d
            r2 = 1
            goto L_0x067e
        L_0x067d:
            r2 = 0
        L_0x067e:
            com.google.android.gms.internal.ads.bjy.m5691b(r2)
            android.util.Pair r2 = m5034a((com.google.android.gms.internal.ads.bkh) r13, (int) r5)
            java.lang.Object r5 = r2.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            java.util.List r28 = java.util.Collections.singletonList(r2)
            r45 = r0
            r46 = r1
            r2 = r5
            goto L_0x062b
        L_0x0697:
            int r11 = com.google.android.gms.internal.ads.bdd.f3696ai
            if (r10 != r11) goto L_0x06b3
            int r5 = r5 + 8
            r13.mo12054c(r5)
            int r4 = r13.mo12068o()
            int r5 = r13.mo12068o()
            float r4 = (float) r4
            float r5 = (float) r5
            float r29 = r4 / r5
            r45 = r0
            r46 = r1
            r4 = 1
            goto L_0x062b
        L_0x06b3:
            int r11 = com.google.android.gms.internal.ads.bdd.f3680aH
            if (r10 != r11) goto L_0x06e9
            int r10 = r5 + 8
        L_0x06b9:
            int r11 = r10 - r5
            if (r11 >= r8) goto L_0x06e1
            r13.mo12054c(r10)
            int r11 = r13.mo12065l()
            r45 = r0
            int r0 = r13.mo12065l()
            r46 = r1
            int r1 = com.google.android.gms.internal.ads.bdd.f3681aI
            if (r0 != r1) goto L_0x06db
            byte[] r0 = r13.f4559a
            int r11 = r11 + r10
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r10, r11)
            r30 = r0
            goto L_0x062b
        L_0x06db:
            int r10 = r10 + r11
            r0 = r45
            r1 = r46
            goto L_0x06b9
        L_0x06e1:
            r45 = r0
            r46 = r1
            r30 = 0
            goto L_0x062b
        L_0x06e9:
            r45 = r0
            r46 = r1
            int r0 = com.google.android.gms.internal.ads.bdd.f3679aG
            if (r10 != r0) goto L_0x062b
            int r0 = r13.mo12059f()
            r11 = 3
            r13.mo12056d(r11)
            if (r0 != 0) goto L_0x070e
            int r0 = r13.mo12059f()
            switch(r0) {
                case 0: goto L_0x070c;
                case 1: goto L_0x0709;
                case 2: goto L_0x0706;
                case 3: goto L_0x0703;
                default: goto L_0x0702;
            }
        L_0x0702:
            goto L_0x070e
        L_0x0703:
            r32 = 3
            goto L_0x070e
        L_0x0706:
            r32 = 2
            goto L_0x070e
        L_0x0709:
            r32 = 1
            goto L_0x070e
        L_0x070c:
            r32 = 0
        L_0x070e:
            int r3 = r3 + r8
            r0 = r45
            r1 = r46
            r10 = 16
            r11 = 8
            goto L_0x05db
        L_0x0719:
            r45 = r0
            r11 = 3
            if (r2 == 0) goto L_0x0751
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r3 = 0
            r4 = -1
            r5 = -1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 0
            r33 = r9
            r9 = r28
            r28 = 16
            r10 = r20
            r34 = 3
            r11 = r29
            r29 = r12
            r12 = r30
            r48 = r13
            r47 = r40
            r30 = 3
            r13 = r32
            r32 = r14
            r28 = r36
            r34 = 16
            r14 = r0
            r0 = r15
            r15 = r53
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8796a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f3763b = r1
            goto L_0x0760
        L_0x0751:
            r33 = r9
            r29 = r12
            r48 = r13
            r32 = r14
            r0 = r15
            r28 = r36
            r47 = r40
            goto L_0x0375
        L_0x0760:
            int r5 = r29 + r32
            r1 = r48
            r1.mo12054c(r5)
            int r6 = r33 + 1
            r15 = r53
            r8 = r0
            r12 = r1
            r10 = r21
            r14 = r28
            r9 = r31
            r11 = r45
            r13 = r47
            r0 = r49
            r7 = 8
            goto L_0x01b4
        L_0x077d:
            r0 = r8
            r21 = r10
            r47 = r13
            r28 = r14
            r27 = 0
            int r1 = com.google.android.gms.internal.ads.bdd.f3661P
            r2 = r49
            com.google.android.gms.internal.ads.bde r1 = r2.mo11722e(r1)
            if (r1 == 0) goto L_0x07eb
            int r2 = com.google.android.gms.internal.ads.bdd.f3662Q
            com.google.android.gms.internal.ads.bdf r1 = r1.mo11721d(r2)
            if (r1 != 0) goto L_0x0799
            goto L_0x07eb
        L_0x0799:
            com.google.android.gms.internal.ads.bkh r1 = r1.f3743aP
            r2 = 8
            r1.mo12054c(r2)
            int r2 = r1.mo12065l()
            int r2 = com.google.android.gms.internal.ads.bdd.m5025a(r2)
            int r3 = r1.mo12068o()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r6 = 0
        L_0x07b1:
            if (r6 >= r3) goto L_0x07e4
            r7 = 1
            if (r2 != r7) goto L_0x07bb
            long r8 = r1.mo12069p()
            goto L_0x07bf
        L_0x07bb:
            long r8 = r1.mo12063j()
        L_0x07bf:
            r4[r6] = r8
            if (r2 != r7) goto L_0x07c8
            long r8 = r1.mo12066m()
            goto L_0x07cd
        L_0x07c8:
            int r8 = r1.mo12065l()
            long r8 = (long) r8
        L_0x07cd:
            r5[r6] = r8
            short r8 = r1.mo12062i()
            if (r8 != r7) goto L_0x07dc
            r8 = 2
            r1.mo12056d(r8)
            int r6 = r6 + 1
            goto L_0x07b1
        L_0x07dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x07e4:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x07f0
        L_0x07eb:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x07f0:
            com.google.android.gms.internal.ads.zzfs r3 = r0.f3763b
            if (r3 != 0) goto L_0x07f5
            return r1
        L_0x07f5:
            com.google.android.gms.internal.ads.beb r1 = new com.google.android.gms.internal.ads.beb
            int r16 = r28.f3774a
            r3 = r47
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r18 = r3.longValue()
            com.google.android.gms.internal.ads.zzfs r3 = r0.f3763b
            int r4 = r0.f3765d
            com.google.android.gms.internal.ads.bec[] r5 = r0.f3762a
            int r0 = r0.f3764c
            java.lang.Object r6 = r2.first
            r28 = r6
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r21
            r20 = r25
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdg.m5035a(com.google.android.gms.internal.ads.bde, com.google.android.gms.internal.ads.bdf, long, com.google.android.gms.internal.ads.zzhp, boolean):com.google.android.gms.internal.ads.beb");
    }

    /* renamed from: a */
    public static bee m5036a(beb beb, bde bde, bcl bcl) {
        bdj bdj;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        int[] iArr3;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i6;
        bdj bdj2;
        beb beb2 = beb;
        bde bde2 = bde;
        bcl bcl2 = bcl;
        bdf d = bde2.mo11721d(bdd.f3703ap);
        if (d != null) {
            bdj = new bdl(d);
        } else {
            bdf d2 = bde2.mo11721d(bdd.f3704aq);
            if (d2 != null) {
                bdj = new bdm(d2);
            } else {
                throw new bad("Track has no sample table size information");
            }
        }
        int a = bdj.mo11725a();
        if (a == 0) {
            return new bee(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        bdf d3 = bde2.mo11721d(bdd.f3705ar);
        if (d3 == null) {
            d3 = bde2.mo11721d(bdd.f3706as);
            z = true;
        } else {
            z = false;
        }
        bkh bkh = d3.f3743aP;
        bkh bkh2 = bde2.mo11721d(bdd.f3702ao).f3743aP;
        bkh bkh3 = bde2.mo11721d(bdd.f3699al).f3743aP;
        bdf d4 = bde2.mo11721d(bdd.f3700am);
        bkh bkh4 = d4 != null ? d4.f3743aP : null;
        bdf d5 = bde2.mo11721d(bdd.f3701an);
        bkh bkh5 = d5 != null ? d5.f3743aP : null;
        bdh bdh = new bdh(bkh2, bkh, z);
        bkh3.mo12054c(12);
        int o = bkh3.mo12068o() - 1;
        int o2 = bkh3.mo12068o();
        int o3 = bkh3.mo12068o();
        if (bkh5 != null) {
            bkh5.mo12054c(12);
            i = bkh5.mo12068o();
        } else {
            i = 0;
        }
        int i7 = -1;
        if (bkh4 != null) {
            bkh4.mo12054c(12);
            i2 = bkh4.mo12068o();
            if (i2 > 0) {
                i7 = bkh4.mo12068o() - 1;
            } else {
                bkh4 = null;
            }
        } else {
            i2 = 0;
        }
        long j2 = 0;
        if (!(bdj.mo11727c() && "audio/raw".equals(beb2.f3887f.f7209e) && o == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[a];
            iArr = new int[a];
            jArr = new long[a];
            int i8 = i2;
            iArr2 = new int[a];
            bkh bkh6 = bkh3;
            int i9 = i;
            int i10 = i7;
            long j3 = 0;
            int i11 = i8;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = o;
            long j4 = 0;
            int i17 = 0;
            int i18 = o3;
            int i19 = o2;
            int i20 = i18;
            while (i17 < a) {
                while (i14 == 0) {
                    bjy.m5691b(bdh.mo11723a());
                    long j5 = bdh.f3755d;
                    i14 = bdh.f3754c;
                    i20 = i20;
                    i16 = i16;
                    j4 = j5;
                }
                int i21 = i20;
                int i22 = i16;
                if (bkh5 != null) {
                    while (i15 == 0 && i9 > 0) {
                        i15 = bkh5.mo12068o();
                        i13 = bkh5.mo12065l();
                        i9--;
                    }
                    i15--;
                }
                int i23 = i13;
                jArr2[i17] = j4;
                iArr[i17] = bdj.mo11726b();
                if (iArr[i17] > i12) {
                    i6 = a;
                    bdj2 = bdj;
                    i12 = iArr[i17];
                } else {
                    i6 = a;
                    bdj2 = bdj;
                }
                jArr[i17] = j3 + ((long) i23);
                iArr2[i17] = bkh4 == null ? 1 : 0;
                if (i17 == i10) {
                    iArr2[i17] = 1;
                    i11--;
                    if (i11 > 0) {
                        i10 = bkh4.mo12068o() - 1;
                    }
                }
                int i24 = i11;
                int i25 = i10;
                int i26 = i21;
                j3 += (long) i26;
                i19--;
                if (i19 != 0 || i22 <= 0) {
                    i16 = i22;
                } else {
                    i16 = i22 - 1;
                    i19 = bkh6.mo12068o();
                    i26 = bkh6.mo12068o();
                }
                j4 += (long) iArr[i17];
                i14--;
                i17++;
                i13 = i23;
                bdj = bdj2;
                a = i6;
                i10 = i25;
                i20 = i26;
                i11 = i24;
            }
            i3 = a;
            int i27 = i16;
            bjy.m5689a(i15 == 0);
            while (i9 > 0) {
                bjy.m5689a(bkh5.mo12068o() == 0);
                bkh5.mo12065l();
                i9--;
            }
            if (i11 == 0 && i19 == 0 && i14 == 0 && i27 == 0) {
                beb2 = beb;
            } else {
                int i28 = i11;
                beb2 = beb;
                int i29 = beb2.f3882a;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i29);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i28);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i19);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i14);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i27);
                Log.w("AtomParsers", sb.toString());
            }
            j = j3;
            i4 = i12;
        } else {
            i3 = a;
            bdj bdj3 = bdj;
            long[] jArr6 = new long[bdh.f3752a];
            int[] iArr7 = new int[bdh.f3752a];
            while (bdh.mo11723a()) {
                jArr6[bdh.f3753b] = bdh.f3755d;
                iArr7[bdh.f3753b] = bdh.f3754c;
            }
            int b = bdj3.mo11726b();
            long j6 = (long) o3;
            int i30 = 8192 / b;
            int i31 = 0;
            for (int a2 : iArr7) {
                i31 += bkp.m5809a(a2, i30);
            }
            long[] jArr7 = new long[i31];
            int[] iArr8 = new int[i31];
            long[] jArr8 = new long[i31];
            int[] iArr9 = new int[i31];
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            for (int i35 = 0; i35 < iArr7.length; i35++) {
                int i36 = iArr7[i35];
                long j7 = jArr6[i35];
                while (i36 > 0) {
                    int min = Math.min(i30, i36);
                    jArr7[i33] = j7;
                    iArr8[i33] = b * min;
                    i34 = Math.max(i34, iArr8[i33]);
                    jArr8[i33] = ((long) i32) * j6;
                    iArr9[i33] = 1;
                    j7 += (long) iArr8[i33];
                    i32 += min;
                    i36 -= min;
                    i33++;
                    jArr6 = jArr6;
                    iArr7 = iArr7;
                }
                long[] jArr9 = jArr6;
                int[] iArr10 = iArr7;
            }
            bdq bdq = new bdq(jArr7, iArr8, i34, jArr8, iArr9);
            jArr2 = bdq.f3781a;
            iArr = bdq.f3782b;
            int i37 = bdq.f3783c;
            jArr = bdq.f3784d;
            iArr2 = bdq.f3785e;
            i4 = i37;
            j = 0;
        }
        if (beb2.f3890i == null || bcl.mo11691a()) {
            bkp.m5819a(jArr, 1000000, beb2.f3884c);
            return new bee(jArr2, iArr, i4, jArr, iArr2);
        }
        if (beb2.f3890i.length == 1 && beb2.f3883b == 1 && jArr.length >= 2) {
            long j8 = beb2.f3891j[0];
            long a3 = bkp.m5813a(beb2.f3890i[0], beb2.f3884c, beb2.f3885d) + j8;
            if (jArr[0] <= j8 && j8 < jArr[1] && jArr[jArr.length - 1] < a3 && a3 <= j) {
                long j9 = j - a3;
                long a4 = bkp.m5813a(j8 - jArr[0], (long) beb2.f3887f.f7219o, beb2.f3884c);
                long a5 = bkp.m5813a(j9, (long) beb2.f3887f.f7219o, beb2.f3884c);
                if (!(a4 == 0 && a5 == 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                    bcl bcl3 = bcl;
                    bcl3.f3526a = (int) a4;
                    bcl3.f3527b = (int) a5;
                    bkp.m5819a(jArr, 1000000, beb2.f3884c);
                    return new bee(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        if (beb2.f3890i.length == 1) {
            char c = 0;
            if (beb2.f3890i[0] == 0) {
                int i38 = 0;
                while (i38 < jArr.length) {
                    jArr[i38] = bkp.m5813a(jArr[i38] - beb2.f3891j[c], 1000000, beb2.f3884c);
                    i38++;
                    c = 0;
                }
                return new bee(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = beb2.f3883b == 1;
        int i39 = 0;
        boolean z4 = false;
        int i40 = 0;
        int i41 = 0;
        while (i39 < beb2.f3890i.length) {
            long j10 = beb2.f3891j[i39];
            if (j10 != -1) {
                iArr6 = iArr;
                long a6 = bkp.m5813a(beb2.f3890i[i39], beb2.f3884c, beb2.f3885d);
                int b2 = bkp.m5823b(jArr, j10, true, true);
                int b3 = bkp.m5823b(jArr, j10 + a6, z3, false);
                i40 += b3 - b2;
                z4 |= i41 != b2;
                i41 = b3;
            } else {
                iArr6 = iArr;
            }
            i39++;
            iArr = iArr6;
        }
        int[] iArr11 = iArr;
        boolean z5 = (i40 != i3) | z4;
        long[] jArr10 = z5 ? new long[i40] : jArr2;
        int[] iArr12 = z5 ? new int[i40] : iArr11;
        if (z5) {
            i4 = 0;
        }
        int[] iArr13 = z5 ? new int[i40] : iArr2;
        long[] jArr11 = new long[i40];
        int i42 = i4;
        int i43 = 0;
        int i44 = 0;
        while (i43 < beb2.f3890i.length) {
            long j11 = beb2.f3891j[i43];
            long j12 = beb2.f3890i[i43];
            if (j11 != -1) {
                int[] iArr14 = iArr13;
                i5 = i43;
                long j13 = beb2.f3884c;
                long[] jArr12 = jArr10;
                jArr4 = jArr11;
                int b4 = bkp.m5823b(jArr, j11, true, true);
                int b5 = bkp.m5823b(jArr, bkp.m5813a(j12, j13, beb2.f3885d) + j11, z3, false);
                if (z5) {
                    int i45 = b5 - b4;
                    jArr5 = jArr12;
                    System.arraycopy(jArr2, b4, jArr5, i44, i45);
                    iArr4 = iArr11;
                    System.arraycopy(iArr4, b4, iArr12, i44, i45);
                    z2 = z3;
                    iArr5 = iArr14;
                    System.arraycopy(iArr2, b4, iArr5, i44, i45);
                } else {
                    z2 = z3;
                    iArr4 = iArr11;
                    iArr5 = iArr14;
                    jArr5 = jArr12;
                }
                int i46 = i42;
                while (b4 < b5) {
                    long[] jArr13 = jArr2;
                    int[] iArr15 = iArr2;
                    long j14 = j11;
                    jArr4[i44] = bkp.m5813a(j2, 1000000, beb2.f3885d) + bkp.m5813a(jArr[b4] - j11, 1000000, beb2.f3884c);
                    if (z5 && iArr12[i44] > i46) {
                        i46 = iArr4[b4];
                    }
                    i44++;
                    b4++;
                    jArr2 = jArr13;
                    iArr2 = iArr15;
                    j11 = j14;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i42 = i46;
            } else {
                z2 = z3;
                jArr5 = jArr10;
                jArr4 = jArr11;
                jArr3 = jArr2;
                iArr3 = iArr2;
                iArr5 = iArr13;
                i5 = i43;
                iArr4 = iArr11;
            }
            j2 += j12;
            i43 = i5 + 1;
            iArr11 = iArr4;
            jArr10 = jArr5;
            jArr11 = jArr4;
            jArr2 = jArr3;
            iArr2 = iArr3;
            iArr13 = iArr5;
            z3 = z2;
        }
        long[] jArr14 = jArr10;
        long[] jArr15 = jArr11;
        int[] iArr16 = iArr13;
        boolean z6 = false;
        for (int i47 = 0; i47 < iArr16.length && !z6; i47++) {
            z6 |= (iArr16[i47] & 1) != 0;
        }
        if (z6) {
            return new bee(jArr14, iArr12, i42, jArr15, iArr16);
        }
        throw new bad("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: a */
    public static zzki m5037a(bdf bdf, boolean z) {
        if (z) {
            return null;
        }
        bkh bkh = bdf.f3743aP;
        bkh.mo12054c(8);
        while (bkh.mo12051b() >= 8) {
            int d = bkh.mo12055d();
            int l = bkh.mo12065l();
            if (bkh.mo12065l() == bdd.f3673aA) {
                bkh.mo12054c(d);
                int i = d + l;
                bkh.mo12056d(12);
                while (true) {
                    if (bkh.mo12055d() >= i) {
                        break;
                    }
                    int d2 = bkh.mo12055d();
                    int l2 = bkh.mo12065l();
                    if (bkh.mo12065l() == bdd.f3674aB) {
                        bkh.mo12054c(d2);
                        int i2 = d2 + l2;
                        bkh.mo12056d(8);
                        ArrayList arrayList = new ArrayList();
                        while (bkh.mo12055d() < i2) {
                            zzki.zza a = bdv.m5063a(bkh);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzki((List<? extends zzki.zza>) arrayList);
                        }
                    } else {
                        bkh.mo12056d(l2 - 8);
                    }
                }
                return null;
            }
            bkh.mo12056d(l - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m5034a(bkh bkh, int i) {
        bkh.mo12054c(i + 8 + 4);
        bkh.mo12056d(1);
        m5032a(bkh);
        bkh.mo12056d(2);
        int f = bkh.mo12059f();
        if ((f & 128) != 0) {
            bkh.mo12056d(2);
        }
        if ((f & 64) != 0) {
            bkh.mo12056d(bkh.mo12060g());
        }
        if ((f & 32) != 0) {
            bkh.mo12056d(2);
        }
        bkh.mo12056d(1);
        m5032a(bkh);
        String str = null;
        switch (bkh.mo12059f()) {
            case 32:
                str = "video/mp4v-es";
                break;
            case 33:
                str = "video/avc";
                break;
            case 35:
                str = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                str = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", (Object) null);
            case 165:
                str = "audio/ac3";
                break;
            case 166:
                str = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", (Object) null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", (Object) null);
        }
        bkh.mo12056d(12);
        bkh.mo12056d(1);
        int a = m5032a(bkh);
        byte[] bArr = new byte[a];
        bkh.mo12050a(bArr, 0, a);
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    private static int m5033a(bkh bkh, int i, int i2, bdk bdk, int i3) {
        bec bec;
        bkh bkh2 = bkh;
        int d = bkh.mo12055d();
        while (true) {
            boolean z = false;
            if (d - i >= i2) {
                return 0;
            }
            bkh2.mo12054c(d);
            int l = bkh.mo12065l();
            bjy.m5690a(l > 0, "childAtomSize should be positive");
            if (bkh.mo12065l() == bdd.f3667V) {
                int i4 = d + 8;
                Pair pair = null;
                Integer num = null;
                bec bec2 = null;
                boolean z2 = false;
                while (i4 - d < l) {
                    bkh2.mo12054c(i4);
                    int l2 = bkh.mo12065l();
                    int l3 = bkh.mo12065l();
                    if (l3 == bdd.f3689ab) {
                        num = Integer.valueOf(bkh.mo12065l());
                    } else if (l3 == bdd.f3668W) {
                        bkh2.mo12056d(4);
                        z2 = bkh.mo12065l() == f3750g;
                    } else if (l3 == bdd.f3669X) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= l2) {
                                bec = null;
                                break;
                            }
                            bkh2.mo12054c(i5);
                            int l4 = bkh.mo12065l();
                            if (bkh.mo12065l() == bdd.f3670Y) {
                                bkh2.mo12056d(6);
                                boolean z3 = bkh.mo12059f() == 1;
                                int f = bkh.mo12059f();
                                byte[] bArr = new byte[16];
                                bkh2.mo12050a(bArr, 0, 16);
                                bec = new bec(z3, f, bArr);
                            } else {
                                i5 += l4;
                            }
                        }
                        bec2 = bec;
                    }
                    i4 += l2;
                }
                if (z2) {
                    bjy.m5690a(num != null, "frma atom is mandatory");
                    if (bec2 != null) {
                        z = true;
                    }
                    bjy.m5690a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, bec2);
                }
                if (pair != null) {
                    bdk.f3762a[i3] = (bec) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            bdk bdk2 = bdk;
            d += l;
        }
    }

    /* renamed from: a */
    private static int m5032a(bkh bkh) {
        int f = bkh.mo12059f();
        int i = f & 127;
        while ((f & 128) == 128) {
            f = bkh.mo12059f();
            i = (i << 7) | (f & 127);
        }
        return i;
    }
}
