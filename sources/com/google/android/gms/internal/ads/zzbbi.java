package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzbbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbi> CREATOR = new aan();

    /* renamed from: a */
    public String f7135a;

    /* renamed from: b */
    public int f7136b;

    /* renamed from: c */
    public int f7137c;

    /* renamed from: d */
    public boolean f7138d;

    /* renamed from: e */
    public boolean f7139e;

    public zzbbi(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzbbi(int i, int i2, boolean z, boolean z2) {
        this(14300000, i2, true, false, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzbbi(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbi.<init>(int, int, boolean, boolean, boolean):void");
    }

    zzbbi(String str, int i, int i2, boolean z, boolean z2) {
        this.f7135a = str;
        this.f7136b = i;
        this.f7137c = i2;
        this.f7138d = z;
        this.f7139e = z2;
    }

    /* renamed from: a */
    public static zzbbi m8618a() {
        return new zzbbi(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7135a, false);
        C0932b.m1367a(parcel, 3, this.f7136b);
        C0932b.m1367a(parcel, 4, this.f7137c);
        C0932b.m1379a(parcel, 5, this.f7138d);
        C0932b.m1379a(parcel, 6, this.f7139e);
        C0932b.m1365a(parcel, a);
    }
}
