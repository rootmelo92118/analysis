package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

class apm extends apl {

    /* renamed from: b */
    protected final byte[] f2188b;

    apm(byte[] bArr) {
        if (bArr != null) {
            this.f2188b = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo10813g() {
        return 0;
    }

    /* renamed from: a */
    public byte mo10791a(int i) {
        return this.f2188b[i];
    }

    /* renamed from: a */
    public int mo10792a() {
        return this.f2188b.length;
    }

    /* renamed from: a */
    public final apc mo10794a(int i, int i2) {
        int b = m2989b(0, i2, mo10792a());
        if (b == 0) {
            return apc.f2174a;
        }
        return new apg(this.f2188b, mo10813g(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10797a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f2188b, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10796a(apb apb) {
        apb.mo10790a(this.f2188b, mo10813g(), mo10792a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10795a(Charset charset) {
        return new String(this.f2188b, mo10813g(), mo10792a(), charset);
    }

    /* renamed from: d */
    public final boolean mo10800d() {
        int g = mo10813g();
        return atp.m4007a(this.f2188b, g, mo10792a() + g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apc) || mo10792a() != ((apc) obj).mo10792a()) {
            return false;
        }
        if (mo10792a() == 0) {
            return true;
        }
        if (!(obj instanceof apm)) {
            return obj.equals(this);
        }
        apm apm = (apm) obj;
        int f = mo10803f();
        int f2 = apm.mo10803f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo10816a(apm, 0, mo10792a());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10816a(apc apc, int i, int i2) {
        if (i2 > apc.mo10792a()) {
            int a = mo10792a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > apc.mo10792a()) {
            int a2 = apc.mo10792a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(apc instanceof apm)) {
            return apc.mo10794a(0, i2).equals(mo10794a(0, i2));
        } else {
            apm apm = (apm) apc;
            byte[] bArr = this.f2188b;
            byte[] bArr2 = apm.f2188b;
            int g = mo10813g() + i2;
            int g2 = mo10813g();
            int g3 = apm.mo10813g();
            while (g2 < g) {
                if (bArr[g2] != bArr2[g3]) {
                    return false;
                }
                g2++;
                g3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10793a(int i, int i2, int i3) {
        return aqp.m3492a(i, this.f2188b, mo10813g(), i3);
    }

    /* renamed from: e */
    public final apo mo10801e() {
        return apo.m3032a(this.f2188b, mo10813g(), mo10792a(), true);
    }
}
