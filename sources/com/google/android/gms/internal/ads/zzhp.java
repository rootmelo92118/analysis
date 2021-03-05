package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzhp implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzhp> CREATOR = new bbx();

    /* renamed from: a */
    public final int f7231a;

    /* renamed from: b */
    private final zza[] f7232b;

    /* renamed from: c */
    private int f7233c;

    public zzhp(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    public final int describeContents() {
        return 0;
    }

    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new bby();

        /* renamed from: a */
        public final boolean f7234a;

        /* renamed from: b */
        private int f7235b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final UUID f7236c;

        /* renamed from: d */
        private final String f7237d;

        /* renamed from: e */
        private final byte[] f7238e;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        public zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f7236c = (UUID) bjy.m5688a(uuid);
            this.f7237d = (String) bjy.m5688a(str);
            this.f7238e = (byte[]) bjy.m5688a(bArr);
            this.f7234a = z;
        }

        zza(Parcel parcel) {
            this.f7236c = new UUID(parcel.readLong(), parcel.readLong());
            this.f7237d = parcel.readString();
            this.f7238e = parcel.createByteArray();
            this.f7234a = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.f7237d.equals(zza.f7237d) && bkp.m5820a((Object) this.f7236c, (Object) zza.f7236c) && Arrays.equals(this.f7238e, zza.f7238e);
        }

        public final int hashCode() {
            if (this.f7235b == 0) {
                this.f7235b = (((this.f7236c.hashCode() * 31) + this.f7237d.hashCode()) * 31) + Arrays.hashCode(this.f7238e);
            }
            return this.f7235b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7236c.getMostSignificantBits());
            parcel.writeLong(this.f7236c.getLeastSignificantBits());
            parcel.writeString(this.f7237d);
            parcel.writeByteArray(this.f7238e);
            parcel.writeByte(this.f7234a ? (byte) 1 : 0);
        }
    }

    public zzhp(zza... zzaArr) {
        this(true, zzaArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.gms.internal.ads.zzhp$zza[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzhp(boolean r3, com.google.android.gms.internal.ads.zzhp.zza... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzhp$zza[] r4 = (com.google.android.gms.internal.ads.zzhp.zza[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0055
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f7236c
            r1 = r4[r3]
            java.util.UUID r1 = r1.f7236c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f7236c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r4 = "Duplicate data for uuid: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0055:
            r2.f7232b = r4
            int r3 = r4.length
            r2.f7231a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhp.<init>(boolean, com.google.android.gms.internal.ads.zzhp$zza[]):void");
    }

    zzhp(Parcel parcel) {
        this.f7232b = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f7231a = this.f7232b.length;
    }

    /* renamed from: a */
    public final zza mo13417a(int i) {
        return this.f7232b[i];
    }

    public final int hashCode() {
        if (this.f7233c == 0) {
            this.f7233c = Arrays.hashCode(this.f7232b);
        }
        return this.f7233c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7232b, ((zzhp) obj).f7232b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f7232b, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (azl.f3170b.equals(zza2.f7236c)) {
            return azl.f3170b.equals(zza3.f7236c) ? 0 : 1;
        }
        return zza2.f7236c.compareTo(zza3.f7236c);
    }
}
