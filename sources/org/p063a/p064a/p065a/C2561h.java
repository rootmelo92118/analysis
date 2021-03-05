package org.p063a.p064a.p065a;

import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2565c;
import org.p063a.p064a.C2568d;
import org.p063a.p064a.C2569e;
import org.p063a.p064a.C2571g;
import org.p063a.p064a.p067c.C2566a;
import org.p063a.p064a.p067c.C2567b;
import org.p063a.p068b.C2575b;
import org.p063a.p068b.C2576c;

/* renamed from: org.a.a.a.h */
public class C2561h implements C2571g {

    /* renamed from: a */
    protected static final byte[] f9085a = C2576c.m11981a("expand 32-byte k");

    /* renamed from: b */
    protected static final byte[] f9086b = C2576c.m11981a("expand 16-byte k");

    /* renamed from: f */
    private static final int[] f9087f = C2575b.m11980a(C2576c.m11981a("expand 16-byte kexpand 32-byte k"), 0, 8);

    /* renamed from: c */
    protected int f9088c;

    /* renamed from: d */
    protected int[] f9089d;

    /* renamed from: e */
    protected int[] f9090e;

    /* renamed from: g */
    private int f9091g;

    /* renamed from: h */
    private byte[] f9092h;

    /* renamed from: i */
    private boolean f9093i;

    /* renamed from: j */
    private int f9094j;

    /* renamed from: k */
    private int f9095k;

    /* renamed from: l */
    private int f9096l;

    public C2561h() {
        this(20);
    }

    public C2561h(int i) {
        this.f9091g = 0;
        this.f9089d = new int[16];
        this.f9090e = new int[16];
        this.f9092h = new byte[64];
        this.f9093i = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.f9088c = i;
    }

    /* renamed from: a */
    protected static int m11942a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    private boolean m11943a(int i) {
        this.f9094j += i;
        if (this.f9094j < i && this.f9094j >= 0) {
            int i2 = this.f9095k + 1;
            this.f9095k = i2;
            if (i2 == 0) {
                int i3 = this.f9096l + 1;
                this.f9096l = i3;
                return (i3 & 32) != 0;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m11944b(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            int i2 = iArr3[0];
            int i3 = iArr3[1];
            int i4 = iArr3[2];
            int i5 = iArr3[3];
            int i6 = iArr3[4];
            int i7 = iArr3[5];
            int i8 = iArr3[6];
            int i9 = 7;
            int i10 = iArr3[7];
            int i11 = iArr3[8];
            int i12 = 9;
            int i13 = iArr3[9];
            int i14 = iArr3[10];
            int i15 = iArr3[11];
            int i16 = iArr3[12];
            int i17 = 13;
            int i18 = iArr3[13];
            int i19 = iArr3[14];
            int i20 = iArr3[15];
            int i21 = i;
            while (i21 > 0) {
                int a = m11942a(i2 + i16, i9) ^ i6;
                int a2 = i11 ^ m11942a(a + i2, i12);
                int a3 = i16 ^ m11942a(a2 + a, i17);
                int a4 = i2 ^ m11942a(a3 + a2, 18);
                int a5 = i13 ^ m11942a(i7 + i3, i9);
                int a6 = i18 ^ m11942a(a5 + i7, i12);
                int a7 = i3 ^ m11942a(a6 + a5, i17);
                int a8 = m11942a(a7 + a6, 18) ^ i7;
                int a9 = i19 ^ m11942a(i14 + i8, 7);
                int a10 = i4 ^ m11942a(a9 + i14, 9);
                int a11 = i8 ^ m11942a(a10 + a9, 13);
                int a12 = i14 ^ m11942a(a11 + a10, 18);
                int a13 = i5 ^ m11942a(i20 + i15, 7);
                int a14 = i10 ^ m11942a(a13 + i20, 9);
                int i22 = i21;
                int a15 = i15 ^ m11942a(a14 + a13, 13);
                int a16 = i20 ^ m11942a(a15 + a14, 18);
                int i23 = a3;
                i3 = a7 ^ m11942a(a4 + a13, 7);
                i4 = a10 ^ m11942a(i3 + a4, 9);
                int a17 = a13 ^ m11942a(i4 + i3, 13);
                i2 = a4 ^ m11942a(a17 + i4, 18);
                i8 = a11 ^ m11942a(a8 + a, 7);
                i10 = a14 ^ m11942a(i8 + a8, 9);
                int a18 = m11942a(i10 + i8, 13) ^ a;
                i15 = a15 ^ m11942a(a12 + a5, 7);
                i11 = a2 ^ m11942a(i15 + a12, 9);
                i13 = a5 ^ m11942a(i11 + i15, 13);
                i14 = a12 ^ m11942a(i13 + i11, 18);
                i16 = i23 ^ m11942a(a16 + a9, 7);
                i18 = a6 ^ m11942a(i16 + a16, 9);
                i19 = a9 ^ m11942a(i18 + i16, 13);
                i20 = a16 ^ m11942a(i19 + i18, 18);
                i21 = i22 - 2;
                i5 = a17;
                i6 = a18;
                i7 = m11942a(a18 + i10, 18) ^ a8;
                iArr3 = iArr;
                int[] iArr5 = iArr2;
                i17 = 13;
                i12 = 9;
                i9 = 7;
            }
            int[] iArr6 = iArr2;
            iArr6[0] = i2 + iArr3[0];
            iArr6[1] = i3 + iArr3[1];
            iArr6[2] = i4 + iArr3[2];
            iArr6[3] = i5 + iArr3[3];
            iArr6[4] = i6 + iArr3[4];
            iArr6[5] = i7 + iArr3[5];
            iArr6[6] = i8 + iArr3[6];
            iArr6[7] = i10 + iArr3[7];
            iArr6[8] = i11 + iArr3[8];
            iArr6[9] = i13 + iArr3[9];
            iArr6[10] = i14 + iArr3[10];
            iArr6[11] = i15 + iArr3[11];
            iArr6[12] = i16 + iArr3[12];
            iArr6[13] = i18 + iArr3[13];
            iArr6[14] = i19 + iArr3[14];
            iArr6[15] = i20 + iArr3[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    /* renamed from: f */
    private void m11945f() {
        this.f9094j = 0;
        this.f9095k = 0;
        this.f9096l = 0;
    }

    /* renamed from: a */
    public int mo15787a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f9093i) {
            throw new IllegalStateException(mo15781a() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new C2565c("input buffer too short");
        } else if (i3 + i2 > bArr2.length) {
            throw new C2569e("output buffer too short");
        } else if (!m11943a(i2)) {
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4 + i3] = (byte) (this.f9092h[this.f9091g] ^ bArr[i4 + i]);
                this.f9091g = (this.f9091g + 1) & 63;
                if (this.f9091g == 0) {
                    mo15785c();
                    mo15782a(this.f9092h);
                }
            }
            return i2;
        } else {
            throw new C2568d("2^70 byte limit per IV would be exceeded; Change IV");
        }
    }

    /* renamed from: a */
    public String mo15781a() {
        if (this.f9088c == 20) {
            return "Salsa20";
        }
        return "Salsa20" + "/" + this.f9088c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15789a(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        iArr[i2] = f9087f[i3];
        iArr[i2 + 1] = f9087f[i3 + 1];
        iArr[i2 + 2] = f9087f[i3 + 2];
        iArr[i2 + 3] = f9087f[i3 + 3];
    }

    /* renamed from: a */
    public void mo15788a(boolean z, C2562b bVar) {
        byte[] a;
        if (bVar instanceof C2567b) {
            C2567b bVar2 = (C2567b) bVar;
            byte[] a2 = bVar2.mo15793a();
            if (a2 == null || a2.length != mo15784b()) {
                throw new IllegalArgumentException(mo15781a() + " requires exactly " + mo15784b() + " bytes of IV");
            }
            C2562b b = bVar2.mo15794b();
            if (b == null) {
                if (this.f9093i) {
                    a = null;
                } else {
                    throw new IllegalStateException(mo15781a() + " KeyParameter can not be null for first initialisation");
                }
            } else if (b instanceof C2566a) {
                a = ((C2566a) b).mo15792a();
            } else {
                throw new IllegalArgumentException(mo15781a() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            mo15783a(a, a2);
            mo15790e();
            this.f9093i = true;
            return;
        }
        throw new IllegalArgumentException(mo15781a() + " Init parameters must include an IV");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15782a(byte[] bArr) {
        m11944b(this.f9088c, this.f9089d, this.f9090e);
        C2575b.m11979a(this.f9090e, bArr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15783a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                int length = (bArr.length - 16) / 4;
                this.f9089d[0] = f9087f[length];
                this.f9089d[5] = f9087f[length + 1];
                this.f9089d[10] = f9087f[length + 2];
                this.f9089d[15] = f9087f[length + 3];
                C2575b.m11978a(bArr, 0, this.f9089d, 1, 4);
                C2575b.m11978a(bArr, bArr.length - 16, this.f9089d, 11, 4);
            } else {
                throw new IllegalArgumentException(mo15781a() + " requires 128 bit or 256 bit key");
            }
        }
        C2575b.m11978a(bArr2, 0, this.f9089d, 6, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo15784b() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15785c() {
        int[] iArr = this.f9089d;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            int[] iArr2 = this.f9089d;
            iArr2[9] = iArr2[9] + 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15786d() {
        int[] iArr = this.f9089d;
        this.f9089d[9] = 0;
        iArr[8] = 0;
    }

    /* renamed from: e */
    public void mo15790e() {
        this.f9091g = 0;
        m11945f();
        mo15786d();
        mo15782a(this.f9092h);
    }
}
