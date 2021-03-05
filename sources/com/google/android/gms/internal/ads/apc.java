package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class apc implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final apc f2174a = new apm(aqp.f2348b);

    /* renamed from: b */
    private static final aph f2175b = (aox.m2953a() ? new apn((apd) null) : new apf((apd) null));

    /* renamed from: d */
    private static final Comparator<apc> f2176d = new ape();

    /* renamed from: c */
    private int f2177c = 0;

    apc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m2988b(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public abstract byte mo10791a(int i);

    /* renamed from: a */
    public abstract int mo10792a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10793a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract apc mo10794a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo10795a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10796a(apb apb);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10797a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: d */
    public abstract boolean mo10800d();

    /* renamed from: e */
    public abstract apo mo10801e();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    public static apc m2987a(byte[] bArr, int i, int i2) {
        m2989b(i, i + i2, bArr.length);
        return new apm(f2175b.mo10812a(bArr, i, i2));
    }

    /* renamed from: a */
    public static apc m2986a(byte[] bArr) {
        return m2987a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    static apc m2990b(byte[] bArr) {
        return new apm(bArr);
    }

    /* renamed from: a */
    public static apc m2985a(String str) {
        return new apm(str.getBytes(aqp.f2347a));
    }

    /* renamed from: b */
    public final byte[] mo10798b() {
        int a = mo10792a();
        if (a == 0) {
            return aqp.f2348b;
        }
        byte[] bArr = new byte[a];
        mo10797a(bArr, 0, 0, a);
        return bArr;
    }

    /* renamed from: c */
    public final String mo10799c() {
        return mo10792a() == 0 ? "" : mo10795a(aqp.f2347a);
    }

    public final int hashCode() {
        int i = this.f2177c;
        if (i == 0) {
            int a = mo10792a();
            i = mo10793a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f2177c = i;
        }
        return i;
    }

    /* renamed from: b */
    static apk m2991b(int i) {
        return new apk(i, (apd) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo10803f() {
        return this.f2177c;
    }

    /* renamed from: b */
    static int m2989b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo10792a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new apd(this);
    }
}
