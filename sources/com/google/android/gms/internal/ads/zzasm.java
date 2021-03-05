package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzasm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasm> CREATOR = new C1627rp();
    @Nullable

    /* renamed from: A */
    public final zzawd f7056A;
    @Nullable

    /* renamed from: B */
    public final List<String> f7057B;
    @Nullable

    /* renamed from: C */
    public final List<String> f7058C;

    /* renamed from: D */
    public final boolean f7059D;
    @Nullable

    /* renamed from: E */
    public final zzaso f7060E;

    /* renamed from: F */
    public final boolean f7061F;
    @Nullable

    /* renamed from: G */
    public String f7062G;

    /* renamed from: H */
    public final List<String> f7063H;

    /* renamed from: I */
    public final boolean f7064I;
    @Nullable

    /* renamed from: J */
    public final String f7065J;
    @Nullable

    /* renamed from: K */
    public final zzawo f7066K;
    @Nullable

    /* renamed from: L */
    public final String f7067L;

    /* renamed from: M */
    public final boolean f7068M;

    /* renamed from: N */
    public final boolean f7069N;

    /* renamed from: O */
    public final boolean f7070O;

    /* renamed from: P */
    public final int f7071P;

    /* renamed from: Q */
    public final boolean f7072Q;

    /* renamed from: R */
    public final List<String> f7073R;

    /* renamed from: S */
    public final boolean f7074S;
    @Nullable

    /* renamed from: T */
    public final String f7075T;
    @Nullable

    /* renamed from: U */
    public String f7076U;

    /* renamed from: V */
    public boolean f7077V;

    /* renamed from: W */
    private zzasi f7078W;

    /* renamed from: X */
    private final int f7079X;

    /* renamed from: Y */
    private zzasy f7080Y;

    /* renamed from: Z */
    private Bundle f7081Z;

    /* renamed from: a */
    public final String f7082a;

    /* renamed from: b */
    public String f7083b;

    /* renamed from: c */
    public final List<String> f7084c;

    /* renamed from: d */
    public final int f7085d;

    /* renamed from: e */
    public final List<String> f7086e;

    /* renamed from: f */
    public final long f7087f;

    /* renamed from: g */
    public final boolean f7088g;

    /* renamed from: h */
    public final long f7089h;

    /* renamed from: i */
    public final List<String> f7090i;

    /* renamed from: j */
    public final long f7091j;

    /* renamed from: k */
    public final int f7092k;

    /* renamed from: l */
    public final String f7093l;

    /* renamed from: m */
    public final long f7094m;

    /* renamed from: n */
    public final String f7095n;

    /* renamed from: o */
    public final boolean f7096o;

    /* renamed from: p */
    public final String f7097p;

    /* renamed from: q */
    public final String f7098q;

    /* renamed from: r */
    public final boolean f7099r;

    /* renamed from: s */
    public final boolean f7100s;

    /* renamed from: t */
    public final boolean f7101t;

    /* renamed from: u */
    public final boolean f7102u;

    /* renamed from: v */
    public final boolean f7103v;

    /* renamed from: w */
    public String f7104w;

    /* renamed from: x */
    public final String f7105x;

    /* renamed from: y */
    public final boolean f7106y;

    /* renamed from: z */
    public final boolean f7107z;

    public zzasm(zzasi zzasi, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzawd zzawd, List<String> list4, List<String> list5, boolean z10, zzaso zzaso, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzawo zzawo, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, @Nullable String str12, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, (zzasy) null, (String) null, str7, z8, z9, zzawd, list4, list5, z10, zzaso, z11, str8, list6, z12, str9, zzawo, str10, z13, z14, (Bundle) null, z15, 0, z16, list7, z17, str11, str12, z18);
        this.f7078W = zzasi;
    }

    public zzasm(zzasi zzasi, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzawd zzawd, List<String> list4, List<String> list5, boolean z9, zzaso zzaso, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzawo zzawo, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, @Nullable String str11, boolean z17) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, (String) null, str5, z2, z3, z4, z5, false, (zzasy) null, (String) null, str6, z7, z8, zzawd, list4, list5, z9, zzaso, z10, str7, list6, z11, str8, zzawo, str9, z12, z13, (Bundle) null, z14, i2, z15, list7, z16, str10, str11, z17);
        this.f7078W = zzasi;
    }

    public zzasm(int i) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, -1, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzasy) null, (String) null, (String) null, false, false, (zzawd) null, (List<String>) null, (List<String>) null, false, (zzaso) null, false, (String) null, (List<String>) null, false, (String) null, (zzawo) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null, (String) null, false);
    }

    public zzasm(int i, long j) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, j, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzasy) null, (String) null, (String) null, false, false, (zzawd) null, (List<String>) null, (List<String>) null, false, (zzaso) null, false, (String) null, (List<String>) null, false, (String) null, (zzawo) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null, (String) null, false);
    }

    zzasm(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzasy zzasy, String str7, String str8, boolean z8, boolean z9, zzawd zzawd, List<String> list4, List<String> list5, boolean z10, zzaso zzaso, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzawo zzawo, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, @Nullable String str13, boolean z18) {
        zzatm zzatm;
        this.f7079X = i;
        this.f7082a = str;
        this.f7083b = str2;
        List<String> list8 = null;
        this.f7084c = list != null ? Collections.unmodifiableList(list) : null;
        this.f7085d = i2;
        this.f7086e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f7087f = j;
        this.f7088g = z;
        this.f7089h = j2;
        this.f7090i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f7091j = j3;
        this.f7092k = i3;
        this.f7093l = str3;
        this.f7094m = j4;
        this.f7095n = str4;
        this.f7096o = z2;
        this.f7097p = str5;
        this.f7098q = str6;
        this.f7099r = z3;
        this.f7100s = z4;
        this.f7101t = z5;
        this.f7102u = z6;
        this.f7068M = z13;
        this.f7103v = z7;
        this.f7080Y = zzasy;
        this.f7104w = str7;
        this.f7105x = str8;
        if (this.f7083b == null && this.f7080Y != null && (zzatm = (zzatm) this.f7080Y.mo13315a(zzatm.CREATOR)) != null && !TextUtils.isEmpty(zzatm.f7122a)) {
            this.f7083b = zzatm.f7122a;
        }
        this.f7106y = z8;
        this.f7107z = z9;
        this.f7056A = zzawd;
        this.f7057B = list4;
        this.f7058C = list5;
        this.f7059D = z10;
        this.f7060E = zzaso;
        this.f7061F = z11;
        this.f7062G = str9;
        this.f7063H = list6;
        this.f7064I = z12;
        this.f7065J = str10;
        this.f7066K = zzawo;
        this.f7067L = str11;
        this.f7069N = z14;
        this.f7081Z = bundle;
        this.f7070O = z15;
        this.f7071P = i4;
        this.f7072Q = z16;
        this.f7073R = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.f7074S = z17;
        this.f7075T = str12;
        this.f7076U = str13;
        this.f7077V = z18;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f7078W != null && this.f7078W.f7023a >= 9 && !TextUtils.isEmpty(this.f7083b)) {
            this.f7080Y = new zzasy((SafeParcelable) new zzatm(this.f7083b));
            this.f7083b = null;
        }
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f7079X);
        C0932b.m1377a(parcel, 2, this.f7082a, false);
        C0932b.m1377a(parcel, 3, this.f7083b, false);
        C0932b.m1386b(parcel, 4, this.f7084c, false);
        C0932b.m1367a(parcel, 5, this.f7085d);
        C0932b.m1386b(parcel, 6, this.f7086e, false);
        C0932b.m1368a(parcel, 7, this.f7087f);
        C0932b.m1379a(parcel, 8, this.f7088g);
        C0932b.m1368a(parcel, 9, this.f7089h);
        C0932b.m1386b(parcel, 10, this.f7090i, false);
        C0932b.m1368a(parcel, 11, this.f7091j);
        C0932b.m1367a(parcel, 12, this.f7092k);
        C0932b.m1377a(parcel, 13, this.f7093l, false);
        C0932b.m1368a(parcel, 14, this.f7094m);
        C0932b.m1377a(parcel, 15, this.f7095n, false);
        C0932b.m1379a(parcel, 18, this.f7096o);
        C0932b.m1377a(parcel, 19, this.f7097p, false);
        C0932b.m1377a(parcel, 21, this.f7098q, false);
        C0932b.m1379a(parcel, 22, this.f7099r);
        C0932b.m1379a(parcel, 23, this.f7100s);
        C0932b.m1379a(parcel, 24, this.f7101t);
        C0932b.m1379a(parcel, 25, this.f7102u);
        C0932b.m1379a(parcel, 26, this.f7103v);
        C0932b.m1372a(parcel, 28, (Parcelable) this.f7080Y, i, false);
        C0932b.m1377a(parcel, 29, this.f7104w, false);
        C0932b.m1377a(parcel, 30, this.f7105x, false);
        C0932b.m1379a(parcel, 31, this.f7106y);
        C0932b.m1379a(parcel, 32, this.f7107z);
        C0932b.m1372a(parcel, 33, (Parcelable) this.f7056A, i, false);
        C0932b.m1386b(parcel, 34, this.f7057B, false);
        C0932b.m1386b(parcel, 35, this.f7058C, false);
        C0932b.m1379a(parcel, 36, this.f7059D);
        C0932b.m1372a(parcel, 37, (Parcelable) this.f7060E, i, false);
        C0932b.m1379a(parcel, 38, this.f7061F);
        C0932b.m1377a(parcel, 39, this.f7062G, false);
        C0932b.m1386b(parcel, 40, this.f7063H, false);
        C0932b.m1379a(parcel, 42, this.f7064I);
        C0932b.m1377a(parcel, 43, this.f7065J, false);
        C0932b.m1372a(parcel, 44, (Parcelable) this.f7066K, i, false);
        C0932b.m1377a(parcel, 45, this.f7067L, false);
        C0932b.m1379a(parcel, 46, this.f7068M);
        C0932b.m1379a(parcel, 47, this.f7069N);
        C0932b.m1369a(parcel, 48, this.f7081Z, false);
        C0932b.m1379a(parcel, 49, this.f7070O);
        C0932b.m1367a(parcel, 50, this.f7071P);
        C0932b.m1379a(parcel, 51, this.f7072Q);
        C0932b.m1386b(parcel, 52, this.f7073R, false);
        C0932b.m1379a(parcel, 53, this.f7074S);
        C0932b.m1377a(parcel, 54, this.f7075T, false);
        C0932b.m1377a(parcel, 55, this.f7076U, false);
        C0932b.m1379a(parcel, 56, this.f7077V);
        C0932b.m1365a(parcel, a);
    }
}
