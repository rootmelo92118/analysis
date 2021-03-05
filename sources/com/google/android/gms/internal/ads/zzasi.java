package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzasi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasi> CREATOR = new C1625rn();

    /* renamed from: A */
    public final long f6997A;

    /* renamed from: B */
    public final String f6998B;

    /* renamed from: C */
    public final float f6999C;

    /* renamed from: D */
    public final int f7000D;

    /* renamed from: E */
    public final int f7001E;

    /* renamed from: F */
    public final boolean f7002F;

    /* renamed from: G */
    public final boolean f7003G;

    /* renamed from: H */
    public final String f7004H;

    /* renamed from: I */
    public final boolean f7005I;

    /* renamed from: J */
    public final String f7006J;

    /* renamed from: K */
    public final boolean f7007K;

    /* renamed from: L */
    public final int f7008L;

    /* renamed from: M */
    public final Bundle f7009M;

    /* renamed from: N */
    public final String f7010N;
    @Nullable

    /* renamed from: O */
    public final zzyv f7011O;

    /* renamed from: P */
    public final boolean f7012P;

    /* renamed from: Q */
    public final Bundle f7013Q;
    @Nullable

    /* renamed from: R */
    public final String f7014R;
    @Nullable

    /* renamed from: S */
    public final String f7015S;
    @Nullable

    /* renamed from: T */
    public final String f7016T;

    /* renamed from: U */
    public final boolean f7017U;

    /* renamed from: V */
    public final List<Integer> f7018V;

    /* renamed from: W */
    public final String f7019W;

    /* renamed from: X */
    public final List<String> f7020X;

    /* renamed from: Y */
    public final int f7021Y;

    /* renamed from: Z */
    public final boolean f7022Z;

    /* renamed from: a */
    public final int f7023a;

    /* renamed from: aa */
    public final boolean f7024aa;

    /* renamed from: ab */
    public final boolean f7025ab;

    /* renamed from: ac */
    public final ArrayList<String> f7026ac;

    /* renamed from: ad */
    public final String f7027ad;

    /* renamed from: ae */
    public final zzafz f7028ae;
    @Nullable

    /* renamed from: af */
    public final String f7029af;

    /* renamed from: ag */
    public final Bundle f7030ag;
    @Nullable

    /* renamed from: b */
    public final Bundle f7031b;

    /* renamed from: c */
    public final zzwb f7032c;

    /* renamed from: d */
    public final zzwf f7033d;

    /* renamed from: e */
    public final String f7034e;

    /* renamed from: f */
    public final ApplicationInfo f7035f;
    @Nullable

    /* renamed from: g */
    public final PackageInfo f7036g;

    /* renamed from: h */
    public final String f7037h;

    /* renamed from: i */
    public final String f7038i;

    /* renamed from: j */
    public final String f7039j;

    /* renamed from: k */
    public final zzbbi f7040k;

    /* renamed from: l */
    public final Bundle f7041l;

    /* renamed from: m */
    public final int f7042m;

    /* renamed from: n */
    public final List<String> f7043n;

    /* renamed from: o */
    public final Bundle f7044o;

    /* renamed from: p */
    public final boolean f7045p;

    /* renamed from: q */
    public final int f7046q;

    /* renamed from: r */
    public final int f7047r;

    /* renamed from: s */
    public final float f7048s;

    /* renamed from: t */
    public final String f7049t;

    /* renamed from: u */
    public final long f7050u;

    /* renamed from: v */
    public final String f7051v;
    @Nullable

    /* renamed from: w */
    public final List<String> f7052w;

    /* renamed from: x */
    public final String f7053x;

    /* renamed from: y */
    public final zzacp f7054y;

    /* renamed from: z */
    public final List<String> f7055z;

    @VisibleForTesting
    private zzasi(@Nullable Bundle bundle, zzwb zzwb, zzwf zzwf, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, String str4, zzbbi zzbbi, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, @Nullable List<String> list3, String str7, zzacp zzacp, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, @Nullable zzyv zzyv, boolean z6, Bundle bundle5, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzafz zzafz, @Nullable String str17, Bundle bundle6) {
        this(24, bundle, zzwb, zzwf, str, applicationInfo, packageInfo, str2, str3, str4, zzbbi, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzacp, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzyv, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzafz, str17, bundle6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzasi(com.google.android.gms.internal.ads.C1624rm r68, long r69, @android.support.annotation.Nullable java.lang.String r71, @android.support.annotation.Nullable java.lang.String r72, @android.support.annotation.Nullable java.lang.String r73, @android.support.annotation.Nullable java.lang.String r74) {
        /*
            r67 = this;
            r0 = r68
            r1 = r67
            r28 = r69
            r46 = r71
            r47 = r72
            r48 = r73
            r60 = r74
            android.os.Bundle r2 = r0.f6329a
            com.google.android.gms.internal.ads.zzwb r3 = r0.f6331b
            com.google.android.gms.internal.ads.zzwf r4 = r0.f6332c
            java.lang.String r5 = r0.f6333d
            android.content.pm.ApplicationInfo r6 = r0.f6334e
            android.content.pm.PackageInfo r7 = r0.f6335f
            java.util.concurrent.Future<java.lang.String> r8 = r0.f6319Q
            java.lang.String r9 = ""
            java.lang.Object r8 = com.google.android.gms.internal.ads.aau.m1651a(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r0.f6336g
            java.lang.String r10 = r0.f6337h
            com.google.android.gms.internal.ads.zzbbi r11 = r0.f6339j
            android.os.Bundle r12 = r0.f6338i
            int r13 = r0.f6340k
            java.util.List<java.lang.String> r14 = r0.f6341l
            java.util.List<java.lang.String> r15 = r0.f6342m
            r62 = r1
            android.os.Bundle r1 = r0.f6344o
            r16 = r1
            boolean r1 = r0.f6345p
            r17 = r1
            int r1 = r0.f6346q
            r18 = r1
            int r1 = r0.f6347r
            r19 = r1
            float r1 = r0.f6348s
            r20 = r1
            java.lang.String r1 = r0.f6349t
            r21 = r1
            r63 = r2
            long r1 = r0.f6350u
            r22 = r1
            java.lang.String r1 = r0.f6351v
            r24 = r1
            java.util.List<java.lang.String> r1 = r0.f6352w
            r25 = r1
            java.lang.String r1 = r0.f6353x
            r26 = r1
            com.google.android.gms.internal.ads.zzacp r1 = r0.f6354y
            r27 = r1
            java.lang.String r1 = r0.f6355z
            r30 = r1
            float r1 = r0.f6303A
            r31 = r1
            boolean r1 = r0.f6304B
            r32 = r1
            int r1 = r0.f6305C
            r33 = r1
            int r1 = r0.f6306D
            r34 = r1
            boolean r1 = r0.f6307E
            r35 = r1
            boolean r1 = r0.f6308F
            r36 = r1
            java.util.concurrent.Future<java.lang.String> r1 = r0.f6309G
            java.lang.String r2 = ""
            r64 = r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r65 = r4
            r66 = r5
            r4 = 1
            java.lang.Object r1 = com.google.android.gms.internal.ads.aau.m1652a(r1, r2, (long) r4, (java.util.concurrent.TimeUnit) r3)
            r37 = r1
            java.lang.String r37 = (java.lang.String) r37
            java.lang.String r1 = r0.f6310H
            r38 = r1
            boolean r1 = r0.f6311I
            r39 = r1
            int r1 = r0.f6312J
            r40 = r1
            android.os.Bundle r1 = r0.f6313K
            r41 = r1
            java.lang.String r1 = r0.f6314L
            r42 = r1
            com.google.android.gms.internal.ads.zzyv r1 = r0.f6315M
            r43 = r1
            boolean r1 = r0.f6316N
            r44 = r1
            android.os.Bundle r1 = r0.f6317O
            r45 = r1
            boolean r1 = r0.f6318P
            r49 = r1
            java.util.List<java.lang.Integer> r1 = r0.f6320R
            r50 = r1
            java.lang.String r1 = r0.f6321S
            r51 = r1
            java.util.List<java.lang.String> r1 = r0.f6343n
            r52 = r1
            int r1 = r0.f6322T
            r53 = r1
            boolean r1 = r0.f6323U
            r54 = r1
            boolean r1 = r0.f6324V
            r55 = r1
            boolean r1 = r0.f6325W
            r56 = r1
            java.util.ArrayList<java.lang.String> r1 = r0.f6326X
            r57 = r1
            java.lang.String r1 = r0.f6327Y
            r58 = r1
            com.google.android.gms.internal.ads.zzafz r1 = r0.f6328Z
            r59 = r1
            android.os.Bundle r0 = r0.f6330aa
            r61 = r0
            r1 = r62
            r2 = r63
            r3 = r64
            r4 = r65
            r5 = r66
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasi.<init>(com.google.android.gms.internal.ads.rm, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    zzasi(int i, Bundle bundle, zzwb zzwb, zzwf zzwf, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbbi zzbbi, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzacp zzacp, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzyv zzyv, boolean z6, Bundle bundle5, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzafz zzafz, @Nullable String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f7023a = i;
        this.f7031b = bundle;
        this.f7032c = zzwb;
        this.f7033d = zzwf;
        this.f7034e = str;
        this.f7035f = applicationInfo;
        this.f7036g = packageInfo;
        this.f7037h = str2;
        this.f7038i = str3;
        this.f7039j = str4;
        this.f7040k = zzbbi;
        this.f7041l = bundle2;
        this.f7042m = i2;
        this.f7043n = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f7055z = list6;
        this.f7044o = bundle3;
        this.f7045p = z;
        this.f7046q = i3;
        this.f7047r = i4;
        this.f7048s = f;
        this.f7049t = str5;
        this.f7050u = j;
        this.f7051v = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f7052w = list7;
        this.f7053x = str7;
        this.f7054y = zzacp;
        this.f6997A = j2;
        this.f6998B = str8;
        this.f6999C = f2;
        this.f7005I = z2;
        this.f7000D = i5;
        this.f7001E = i6;
        this.f7002F = z3;
        this.f7003G = z4;
        this.f7004H = str9;
        this.f7006J = str10;
        this.f7007K = z5;
        this.f7008L = i7;
        this.f7009M = bundle4;
        this.f7010N = str11;
        this.f7011O = zzyv;
        this.f7012P = z6;
        this.f7013Q = bundle5;
        this.f7014R = str12;
        this.f7015S = str13;
        this.f7016T = str14;
        this.f7017U = z7;
        this.f7018V = list4;
        this.f7019W = str15;
        this.f7020X = list5;
        this.f7021Y = i8;
        this.f7022Z = z8;
        this.f7024aa = z9;
        this.f7025ab = z10;
        this.f7026ac = arrayList;
        this.f7027ad = str16;
        this.f7028ae = zzafz;
        this.f7029af = str17;
        this.f7030ag = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f7023a);
        C0932b.m1369a(parcel, 2, this.f7031b, false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f7032c, i, false);
        C0932b.m1372a(parcel, 4, (Parcelable) this.f7033d, i, false);
        C0932b.m1377a(parcel, 5, this.f7034e, false);
        C0932b.m1372a(parcel, 6, (Parcelable) this.f7035f, i, false);
        C0932b.m1372a(parcel, 7, (Parcelable) this.f7036g, i, false);
        C0932b.m1377a(parcel, 8, this.f7037h, false);
        C0932b.m1377a(parcel, 9, this.f7038i, false);
        C0932b.m1377a(parcel, 10, this.f7039j, false);
        C0932b.m1372a(parcel, 11, (Parcelable) this.f7040k, i, false);
        C0932b.m1369a(parcel, 12, this.f7041l, false);
        C0932b.m1367a(parcel, 13, this.f7042m);
        C0932b.m1386b(parcel, 14, this.f7043n, false);
        C0932b.m1369a(parcel, 15, this.f7044o, false);
        C0932b.m1379a(parcel, 16, this.f7045p);
        C0932b.m1367a(parcel, 18, this.f7046q);
        C0932b.m1367a(parcel, 19, this.f7047r);
        C0932b.m1366a(parcel, 20, this.f7048s);
        C0932b.m1377a(parcel, 21, this.f7049t, false);
        C0932b.m1368a(parcel, 25, this.f7050u);
        C0932b.m1377a(parcel, 26, this.f7051v, false);
        C0932b.m1386b(parcel, 27, this.f7052w, false);
        C0932b.m1377a(parcel, 28, this.f7053x, false);
        C0932b.m1372a(parcel, 29, (Parcelable) this.f7054y, i, false);
        C0932b.m1386b(parcel, 30, this.f7055z, false);
        C0932b.m1368a(parcel, 31, this.f6997A);
        C0932b.m1377a(parcel, 33, this.f6998B, false);
        C0932b.m1366a(parcel, 34, this.f6999C);
        C0932b.m1367a(parcel, 35, this.f7000D);
        C0932b.m1367a(parcel, 36, this.f7001E);
        C0932b.m1379a(parcel, 37, this.f7002F);
        C0932b.m1379a(parcel, 38, this.f7003G);
        C0932b.m1377a(parcel, 39, this.f7004H, false);
        C0932b.m1379a(parcel, 40, this.f7005I);
        C0932b.m1377a(parcel, 41, this.f7006J, false);
        C0932b.m1379a(parcel, 42, this.f7007K);
        C0932b.m1367a(parcel, 43, this.f7008L);
        C0932b.m1369a(parcel, 44, this.f7009M, false);
        C0932b.m1377a(parcel, 45, this.f7010N, false);
        C0932b.m1372a(parcel, 46, (Parcelable) this.f7011O, i, false);
        C0932b.m1379a(parcel, 47, this.f7012P);
        C0932b.m1369a(parcel, 48, this.f7013Q, false);
        C0932b.m1377a(parcel, 49, this.f7014R, false);
        C0932b.m1377a(parcel, 50, this.f7015S, false);
        C0932b.m1377a(parcel, 51, this.f7016T, false);
        C0932b.m1379a(parcel, 52, this.f7017U);
        C0932b.m1378a(parcel, 53, this.f7018V, false);
        C0932b.m1377a(parcel, 54, this.f7019W, false);
        C0932b.m1386b(parcel, 55, this.f7020X, false);
        C0932b.m1367a(parcel, 56, this.f7021Y);
        C0932b.m1379a(parcel, 57, this.f7022Z);
        C0932b.m1379a(parcel, 58, this.f7024aa);
        C0932b.m1379a(parcel, 59, this.f7025ab);
        C0932b.m1386b(parcel, 60, this.f7026ac, false);
        C0932b.m1377a(parcel, 61, this.f7027ad, false);
        C0932b.m1372a(parcel, 63, (Parcelable) this.f7028ae, i, false);
        C0932b.m1377a(parcel, 64, this.f7029af, false);
        C0932b.m1369a(parcel, 65, this.f7030ag, false);
        C0932b.m1365a(parcel, a);
    }
}
