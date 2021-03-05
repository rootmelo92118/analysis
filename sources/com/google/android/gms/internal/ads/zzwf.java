package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public class zzwf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwf> CREATOR = new bqq();

    /* renamed from: a */
    public final String f7292a;

    /* renamed from: b */
    public final int f7293b;

    /* renamed from: c */
    public final int f7294c;

    /* renamed from: d */
    public final boolean f7295d;

    /* renamed from: e */
    public final int f7296e;

    /* renamed from: f */
    public final int f7297f;

    /* renamed from: g */
    public final zzwf[] f7298g;

    /* renamed from: h */
    public final boolean f7299h;

    /* renamed from: i */
    public final boolean f7300i;

    /* renamed from: j */
    public boolean f7301j;

    /* renamed from: a */
    public static int m8828a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m8831b(DisplayMetrics displayMetrics) {
        return (int) (((float) m8832c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m8832c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: a */
    public static zzwf m8830a(Context context) {
        return new zzwf("320x50_mb", 0, 0, false, 0, 0, (zzwf[]) null, true, false, false);
    }

    /* renamed from: a */
    public static zzwf m8829a() {
        return new zzwf("reward_mb", 0, 0, true, 0, 0, (zzwf[]) null, false, false, false);
    }

    public zzwf() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzwf[]) null, false, false, false);
    }

    public zzwf(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzwf(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f7295d = r0
            boolean r2 = r1.isFluid()
            r12.f7300i = r2
            boolean r2 = r12.f7300i
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.f7296e = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.f7293b = r2
            goto L_0x002f
        L_0x0023:
            int r2 = r1.getWidth()
            r12.f7296e = r2
            int r2 = r1.getHeight()
            r12.f7293b = r2
        L_0x002f:
            int r2 = r12.f7296e
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r3 = r12.f7293b
            r5 = -2
            if (r3 != r5) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.bre.m6317a()
            boolean r6 = com.google.android.gms.internal.ads.C1851zx.m8600d(r13)
            if (r6 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.bre.m6317a()
            boolean r6 = com.google.android.gms.internal.ads.C1851zx.m8601e(r13)
            if (r6 == 0) goto L_0x0069
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.bre.m6317a()
            int r7 = com.google.android.gms.internal.ads.C1851zx.m8602f(r13)
            int r6 = r6 - r7
            r12.f7297f = r6
            goto L_0x006d
        L_0x0069:
            int r6 = r5.widthPixels
            r12.f7297f = r6
        L_0x006d:
            int r6 = r12.f7297f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0096
            int r8 = r8 + 1
            goto L_0x0096
        L_0x0089:
            int r8 = r12.f7296e
            com.google.android.gms.internal.ads.bre.m6317a()
            int r6 = r12.f7296e
            int r6 = com.google.android.gms.internal.ads.C1851zx.m8583a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f7297f = r6
        L_0x0096:
            if (r3 == 0) goto L_0x009d
            int r6 = m8832c(r5)
            goto L_0x009f
        L_0x009d:
            int r6 = r12.f7293b
        L_0x009f:
            com.google.android.gms.internal.ads.bre.m6317a()
            int r5 = com.google.android.gms.internal.ads.C1851zx.m8583a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f7294c = r5
            if (r2 != 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00ad
            goto L_0x00bd
        L_0x00ad:
            boolean r2 = r12.f7300i
            if (r2 == 0) goto L_0x00b6
            java.lang.String r1 = "320x50_mb"
            r12.f7292a = r1
            goto L_0x00da
        L_0x00b6:
            java.lang.String r1 = r1.toString()
            r12.f7292a = r1
            goto L_0x00da
        L_0x00bd:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.f7292a = r1
        L_0x00da:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x00f4
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzwf[] r1 = new com.google.android.gms.internal.ads.zzwf[r1]
            r12.f7298g = r1
            r1 = 0
        L_0x00e3:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00f7
            com.google.android.gms.internal.ads.zzwf[] r2 = r12.f7298g
            com.google.android.gms.internal.ads.zzwf r3 = new com.google.android.gms.internal.ads.zzwf
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f4:
            r13 = 0
            r12.f7298g = r13
        L_0x00f7:
            r12.f7299h = r0
            r12.f7301j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public zzwf(zzwf zzwf, zzwf[] zzwfArr) {
        this(zzwf.f7292a, zzwf.f7293b, zzwf.f7294c, zzwf.f7295d, zzwf.f7296e, zzwf.f7297f, zzwfArr, zzwf.f7299h, zzwf.f7300i, zzwf.f7301j);
    }

    zzwf(String str, int i, int i2, boolean z, int i3, int i4, zzwf[] zzwfArr, boolean z2, boolean z3, boolean z4) {
        this.f7292a = str;
        this.f7293b = i;
        this.f7294c = i2;
        this.f7295d = z;
        this.f7296e = i3;
        this.f7297f = i4;
        this.f7298g = zzwfArr;
        this.f7299h = z2;
        this.f7300i = z3;
        this.f7301j = z4;
    }

    /* renamed from: b */
    public final AdSize mo13458b() {
        return zzc.zza(this.f7296e, this.f7293b, this.f7292a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7292a, false);
        C0932b.m1367a(parcel, 3, this.f7293b);
        C0932b.m1367a(parcel, 4, this.f7294c);
        C0932b.m1379a(parcel, 5, this.f7295d);
        C0932b.m1367a(parcel, 6, this.f7296e);
        C0932b.m1367a(parcel, 7, this.f7297f);
        C0932b.m1381a(parcel, 8, (T[]) this.f7298g, i, false);
        C0932b.m1379a(parcel, 9, this.f7299h);
        C0932b.m1379a(parcel, 10, this.f7300i);
        C0932b.m1379a(parcel, 11, this.f7301j);
        C0932b.m1365a(parcel, a);
    }
}
