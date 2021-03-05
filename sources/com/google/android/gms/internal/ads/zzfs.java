package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzfs implements Parcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new azz();

    /* renamed from: A */
    private int f7204A;

    /* renamed from: a */
    public final String f7205a;

    /* renamed from: b */
    public final int f7206b;

    /* renamed from: c */
    public final String f7207c;

    /* renamed from: d */
    public final String f7208d;

    /* renamed from: e */
    public final String f7209e;

    /* renamed from: f */
    public final int f7210f;

    /* renamed from: g */
    public final List<byte[]> f7211g;

    /* renamed from: h */
    public final zzhp f7212h;

    /* renamed from: i */
    public final int f7213i;

    /* renamed from: j */
    public final int f7214j;

    /* renamed from: k */
    public final float f7215k;

    /* renamed from: l */
    public final int f7216l;

    /* renamed from: m */
    public final float f7217m;

    /* renamed from: n */
    public final int f7218n;

    /* renamed from: o */
    public final int f7219o;

    /* renamed from: p */
    public final int f7220p;

    /* renamed from: q */
    public final long f7221q;

    /* renamed from: r */
    public final int f7222r;

    /* renamed from: s */
    public final String f7223s;

    /* renamed from: t */
    private final zzki f7224t;

    /* renamed from: u */
    private final int f7225u;

    /* renamed from: v */
    private final byte[] f7226v;

    /* renamed from: w */
    private final zzqi f7227w;

    /* renamed from: x */
    private final int f7228x;

    /* renamed from: y */
    private final int f7229y;

    /* renamed from: z */
    private final int f7230z;

    /* renamed from: a */
    public static zzfs m8803a(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new zzfs(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i4, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static zzfs m8796a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzqi zzqi, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzqi, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8804a(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8798a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzhp zzhp, int i5, String str4) {
        return m8797a(str, str2, (String) null, -1, -1, i3, i4, -1, (List<byte[]>) null, zzhp, 0, str4);
    }

    /* renamed from: a */
    public static zzfs m8797a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzhp zzhp, int i6, String str4) {
        return new zzfs(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8806a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8800a(String str, String str2, String str3, int i, int i2, String str4, zzhp zzhp) {
        return m8799a(str, str2, (String) null, -1, i2, str4, -1, zzhp, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    /* renamed from: a */
    public static zzfs m8799a(String str, String str2, String str3, int i, int i2, String str4, int i3, zzhp zzhp, long j, List<byte[]> list) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzhp, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8802a(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8805a(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8795a(String str, String str2, long j) {
        return new zzfs((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    /* renamed from: a */
    public static zzfs m8801a(String str, String str2, String str3, int i, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, zzhp, (zzki) null);
    }

    private zzfs(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzqi zzqi, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzhp zzhp, zzki zzki) {
        this.f7205a = str;
        this.f7208d = str2;
        this.f7209e = str3;
        this.f7207c = str4;
        this.f7206b = i;
        this.f7210f = i2;
        this.f7213i = i3;
        this.f7214j = i4;
        this.f7215k = f;
        this.f7216l = i5;
        this.f7217m = f2;
        this.f7226v = bArr;
        this.f7225u = i6;
        this.f7227w = zzqi;
        this.f7218n = i7;
        this.f7219o = i8;
        this.f7220p = i9;
        this.f7228x = i10;
        this.f7229y = i11;
        this.f7222r = i12;
        this.f7223s = str5;
        this.f7230z = i13;
        this.f7221q = j;
        this.f7211g = list == null ? Collections.emptyList() : list;
        this.f7212h = zzhp;
        this.f7224t = zzki;
    }

    zzfs(Parcel parcel) {
        this.f7205a = parcel.readString();
        this.f7208d = parcel.readString();
        this.f7209e = parcel.readString();
        this.f7207c = parcel.readString();
        this.f7206b = parcel.readInt();
        this.f7210f = parcel.readInt();
        this.f7213i = parcel.readInt();
        this.f7214j = parcel.readInt();
        this.f7215k = parcel.readFloat();
        this.f7216l = parcel.readInt();
        this.f7217m = parcel.readFloat();
        this.f7226v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f7225u = parcel.readInt();
        this.f7227w = (zzqi) parcel.readParcelable(zzqi.class.getClassLoader());
        this.f7218n = parcel.readInt();
        this.f7219o = parcel.readInt();
        this.f7220p = parcel.readInt();
        this.f7228x = parcel.readInt();
        this.f7229y = parcel.readInt();
        this.f7222r = parcel.readInt();
        this.f7223s = parcel.readString();
        this.f7230z = parcel.readInt();
        this.f7221q = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7211g = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f7211g.add(parcel.createByteArray());
        }
        this.f7212h = (zzhp) parcel.readParcelable(zzhp.class.getClassLoader());
        this.f7224t = (zzki) parcel.readParcelable(zzki.class.getClassLoader());
    }

    /* renamed from: a */
    public final zzfs mo13405a(int i) {
        String str = this.f7205a;
        return new zzfs(str, this.f7208d, this.f7209e, this.f7207c, this.f7206b, i, this.f7213i, this.f7214j, this.f7215k, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, this.f7228x, this.f7229y, this.f7222r, this.f7223s, this.f7230z, this.f7221q, this.f7211g, this.f7212h, this.f7224t);
    }

    /* renamed from: a */
    public final zzfs mo13407a(long j) {
        return new zzfs(this.f7205a, this.f7208d, this.f7209e, this.f7207c, this.f7206b, this.f7210f, this.f7213i, this.f7214j, this.f7215k, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, this.f7228x, this.f7229y, this.f7222r, this.f7223s, this.f7230z, j, this.f7211g, this.f7212h, this.f7224t);
    }

    /* renamed from: a */
    public final zzfs mo13408a(zzfs zzfs) {
        zzhp zzhp;
        zzfs zzfs2 = zzfs;
        if (this == zzfs2) {
            return this;
        }
        String str = zzfs2.f7205a;
        String str2 = this.f7207c == null ? zzfs2.f7207c : this.f7207c;
        int i = this.f7206b == -1 ? zzfs2.f7206b : this.f7206b;
        float f = this.f7215k == -1.0f ? zzfs2.f7215k : this.f7215k;
        int i2 = this.f7222r | zzfs2.f7222r;
        String str3 = this.f7223s == null ? zzfs2.f7223s : this.f7223s;
        if (zzfs2.f7212h != null) {
            zzhp = zzfs2.f7212h;
        } else {
            zzhp = this.f7212h;
        }
        return new zzfs(str, this.f7208d, this.f7209e, str2, i, this.f7210f, this.f7213i, this.f7214j, f, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, this.f7228x, this.f7229y, i2, str3, this.f7230z, this.f7221q, this.f7211g, zzhp, this.f7224t);
    }

    /* renamed from: a */
    public final zzfs mo13406a(int i, int i2) {
        String str = this.f7205a;
        return new zzfs(str, this.f7208d, this.f7209e, this.f7207c, this.f7206b, this.f7210f, this.f7213i, this.f7214j, this.f7215k, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, i, i2, this.f7222r, this.f7223s, this.f7230z, this.f7221q, this.f7211g, this.f7212h, this.f7224t);
    }

    /* renamed from: a */
    public final zzfs mo13409a(zzhp zzhp) {
        String str = this.f7205a;
        return new zzfs(str, this.f7208d, this.f7209e, this.f7207c, this.f7206b, this.f7210f, this.f7213i, this.f7214j, this.f7215k, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, this.f7228x, this.f7229y, this.f7222r, this.f7223s, this.f7230z, this.f7221q, this.f7211g, zzhp, this.f7224t);
    }

    /* renamed from: a */
    public final zzfs mo13410a(zzki zzki) {
        String str = this.f7205a;
        return new zzfs(str, this.f7208d, this.f7209e, this.f7207c, this.f7206b, this.f7210f, this.f7213i, this.f7214j, this.f7215k, this.f7216l, this.f7217m, this.f7226v, this.f7225u, this.f7227w, this.f7218n, this.f7219o, this.f7220p, this.f7228x, this.f7229y, this.f7222r, this.f7223s, this.f7230z, this.f7221q, this.f7211g, this.f7212h, zzki);
    }

    /* renamed from: a */
    public final int mo13404a() {
        if (this.f7213i == -1 || this.f7214j == -1) {
            return -1;
        }
        return this.f7213i * this.f7214j;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat mo13411b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f7209e);
        String str = this.f7223s;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m8807a(mediaFormat, "max-input-size", this.f7210f);
        m8807a(mediaFormat, "width", this.f7213i);
        m8807a(mediaFormat, "height", this.f7214j);
        float f = this.f7215k;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m8807a(mediaFormat, "rotation-degrees", this.f7216l);
        m8807a(mediaFormat, "channel-count", this.f7218n);
        m8807a(mediaFormat, "sample-rate", this.f7219o);
        m8807a(mediaFormat, "encoder-delay", this.f7228x);
        m8807a(mediaFormat, "encoder-padding", this.f7229y);
        for (int i = 0; i < this.f7211g.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f7211g.get(i)));
        }
        zzqi zzqi = this.f7227w;
        if (zzqi != null) {
            m8807a(mediaFormat, "color-transfer", zzqi.f7252c);
            m8807a(mediaFormat, "color-standard", zzqi.f7250a);
            m8807a(mediaFormat, "color-range", zzqi.f7251b);
            byte[] bArr = zzqi.f7253d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.f7205a;
        String str2 = this.f7208d;
        String str3 = this.f7209e;
        int i = this.f7206b;
        String str4 = this.f7223s;
        int i2 = this.f7213i;
        int i3 = this.f7214j;
        float f = this.f7215k;
        int i4 = this.f7218n;
        int i5 = this.f7219o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f7204A == 0) {
            int i = 0;
            int hashCode = ((((((((((((((((((((((((this.f7205a == null ? 0 : this.f7205a.hashCode()) + 527) * 31) + (this.f7208d == null ? 0 : this.f7208d.hashCode())) * 31) + (this.f7209e == null ? 0 : this.f7209e.hashCode())) * 31) + (this.f7207c == null ? 0 : this.f7207c.hashCode())) * 31) + this.f7206b) * 31) + this.f7213i) * 31) + this.f7214j) * 31) + this.f7218n) * 31) + this.f7219o) * 31) + (this.f7223s == null ? 0 : this.f7223s.hashCode())) * 31) + this.f7230z) * 31) + (this.f7212h == null ? 0 : this.f7212h.hashCode())) * 31;
            if (this.f7224t != null) {
                i = this.f7224t.hashCode();
            }
            this.f7204A = hashCode + i;
        }
        return this.f7204A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzfs zzfs = (zzfs) obj;
        if (this.f7206b != zzfs.f7206b || this.f7210f != zzfs.f7210f || this.f7213i != zzfs.f7213i || this.f7214j != zzfs.f7214j || this.f7215k != zzfs.f7215k || this.f7216l != zzfs.f7216l || this.f7217m != zzfs.f7217m || this.f7225u != zzfs.f7225u || this.f7218n != zzfs.f7218n || this.f7219o != zzfs.f7219o || this.f7220p != zzfs.f7220p || this.f7228x != zzfs.f7228x || this.f7229y != zzfs.f7229y || this.f7221q != zzfs.f7221q || this.f7222r != zzfs.f7222r || !bkp.m5820a((Object) this.f7205a, (Object) zzfs.f7205a) || !bkp.m5820a((Object) this.f7223s, (Object) zzfs.f7223s) || this.f7230z != zzfs.f7230z || !bkp.m5820a((Object) this.f7208d, (Object) zzfs.f7208d) || !bkp.m5820a((Object) this.f7209e, (Object) zzfs.f7209e) || !bkp.m5820a((Object) this.f7207c, (Object) zzfs.f7207c) || !bkp.m5820a((Object) this.f7212h, (Object) zzfs.f7212h) || !bkp.m5820a((Object) this.f7224t, (Object) zzfs.f7224t) || !bkp.m5820a((Object) this.f7227w, (Object) zzfs.f7227w) || !Arrays.equals(this.f7226v, zzfs.f7226v) || this.f7211g.size() != zzfs.f7211g.size()) {
            return false;
        }
        for (int i = 0; i < this.f7211g.size(); i++) {
            if (!Arrays.equals(this.f7211g.get(i), zzfs.f7211g.get(i))) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m8807a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7205a);
        parcel.writeString(this.f7208d);
        parcel.writeString(this.f7209e);
        parcel.writeString(this.f7207c);
        parcel.writeInt(this.f7206b);
        parcel.writeInt(this.f7210f);
        parcel.writeInt(this.f7213i);
        parcel.writeInt(this.f7214j);
        parcel.writeFloat(this.f7215k);
        parcel.writeInt(this.f7216l);
        parcel.writeFloat(this.f7217m);
        parcel.writeInt(this.f7226v != null ? 1 : 0);
        if (this.f7226v != null) {
            parcel.writeByteArray(this.f7226v);
        }
        parcel.writeInt(this.f7225u);
        parcel.writeParcelable(this.f7227w, i);
        parcel.writeInt(this.f7218n);
        parcel.writeInt(this.f7219o);
        parcel.writeInt(this.f7220p);
        parcel.writeInt(this.f7228x);
        parcel.writeInt(this.f7229y);
        parcel.writeInt(this.f7222r);
        parcel.writeString(this.f7223s);
        parcel.writeInt(this.f7230z);
        parcel.writeLong(this.f7221q);
        int size = this.f7211g.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f7211g.get(i2));
        }
        parcel.writeParcelable(this.f7212h, 0);
        parcel.writeParcelable(this.f7224t, 0);
    }
}
