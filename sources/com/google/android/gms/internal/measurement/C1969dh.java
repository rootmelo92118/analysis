package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.dh */
class C1969dh extends C1968dg {

    /* renamed from: b */
    protected final byte[] f7595b;

    C1969dh(byte[] bArr) {
        if (bArr != null) {
            this.f7595b = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo13615e() {
        return 0;
    }

    /* renamed from: a */
    public byte mo13594a(int i) {
        return this.f7595b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte mo13600b(int i) {
        return this.f7595b[i];
    }

    /* renamed from: a */
    public int mo13595a() {
        return this.f7595b.length;
    }

    /* renamed from: a */
    public final C1958cx mo13597a(int i, int i2) {
        int b = m9078b(0, i2, mo13595a());
        if (b == 0) {
            return C1958cx.f7583a;
        }
        return new C1964dc(this.f7595b, mo13615e(), b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13599a(C1957cw cwVar) {
        cwVar.mo13593a(this.f7595b, mo13615e(), mo13595a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo13598a(Charset charset) {
        return new String(this.f7595b, mo13615e(), mo13595a(), charset);
    }

    /* renamed from: c */
    public final boolean mo13602c() {
        int e = mo13615e();
        return C2092hh.m10110a(this.f7595b, e, mo13595a() + e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1958cx) || mo13595a() != ((C1958cx) obj).mo13595a()) {
            return false;
        }
        if (mo13595a() == 0) {
            return true;
        }
        if (!(obj instanceof C1969dh)) {
            return obj.equals(this);
        }
        C1969dh dhVar = (C1969dh) obj;
        int d = mo13603d();
        int d2 = dhVar.mo13603d();
        if (d == 0 || d2 == 0 || d == d2) {
            return mo13618a(dhVar, 0, mo13595a());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo13618a(C1958cx cxVar, int i, int i2) {
        if (i2 > cxVar.mo13595a()) {
            int a = mo13595a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > cxVar.mo13595a()) {
            int a2 = cxVar.mo13595a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(cxVar instanceof C1969dh)) {
            return cxVar.mo13597a(0, i2).equals(mo13597a(0, i2));
        } else {
            C1969dh dhVar = (C1969dh) cxVar;
            byte[] bArr = this.f7595b;
            byte[] bArr2 = dhVar.f7595b;
            int e = mo13615e() + i2;
            int e2 = mo13615e();
            int e3 = dhVar.mo13615e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13596a(int i, int i2, int i3) {
        return C2010ek.m9557a(i, this.f7595b, mo13615e(), i3);
    }
}
