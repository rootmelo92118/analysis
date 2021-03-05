package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.cx */
public abstract class C1958cx implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final C1958cx f7583a = new C1969dh(C2010ek.f7748b);

    /* renamed from: b */
    private static final C1965dd f7584b = (C1955cu.m9065a() ? new C1970di((C1959cy) null) : new C1963db((C1959cy) null));

    /* renamed from: d */
    private static final Comparator<C1958cx> f7585d = new C1960cz();

    /* renamed from: c */
    private int f7586c = 0;

    C1958cx() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m9077b(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public abstract byte mo13594a(int i);

    /* renamed from: a */
    public abstract int mo13595a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo13596a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C1958cx mo13597a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13598a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13599a(C1957cw cwVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte mo13600b(int i);

    /* renamed from: c */
    public abstract boolean mo13602c();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    public static C1958cx m9076a(byte[] bArr, int i, int i2) {
        m9078b(i, i + i2, bArr.length);
        return new C1969dh(f7584b.mo13614a(bArr, i, i2));
    }

    /* renamed from: a */
    static C1958cx m9075a(byte[] bArr) {
        return new C1969dh(bArr);
    }

    /* renamed from: a */
    public static C1958cx m9074a(String str) {
        return new C1969dh(str.getBytes(C2010ek.f7747a));
    }

    /* renamed from: b */
    public final String mo13601b() {
        return mo13595a() == 0 ? "" : mo13598a(C2010ek.f7747a);
    }

    public final int hashCode() {
        int i = this.f7586c;
        if (i == 0) {
            int a = mo13595a();
            i = mo13596a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f7586c = i;
        }
        return i;
    }

    /* renamed from: c */
    static C1967df m9079c(int i) {
        return new C1967df(i, (C1959cy) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo13603d() {
        return this.f7586c;
    }

    /* renamed from: b */
    static int m9078b(int i, int i2, int i3) {
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
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo13595a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new C1959cy(this);
    }
}
