package org.p063a.p064a.p066b;

import org.p063a.p064a.C2553a;
import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2572h;
import org.p063a.p064a.p067c.C2567b;
import org.p063a.p068b.C2574a;

/* renamed from: org.a.a.b.a */
public class C2563a extends C2572h {

    /* renamed from: a */
    private byte[] f9097a;

    /* renamed from: b */
    private byte[] f9098b;

    /* renamed from: c */
    private byte[] f9099c;

    /* renamed from: d */
    private byte[] f9100d;

    /* renamed from: e */
    private int f9101e;

    /* renamed from: f */
    private C2553a f9102f = null;

    /* renamed from: g */
    private boolean f9103g;

    /* renamed from: h */
    private int f9104h;

    public C2563a(C2553a aVar, int i) {
        super(aVar);
        this.f9102f = aVar;
        this.f9101e = i / 8;
        this.f9097a = new byte[aVar.mo15777a()];
        this.f9098b = new byte[aVar.mo15777a()];
        this.f9099c = new byte[aVar.mo15777a()];
        this.f9100d = new byte[this.f9101e];
    }

    /* renamed from: b */
    private byte m11956b(byte b) {
        if (this.f9104h == 0) {
            this.f9102f.mo15778a(this.f9098b, 0, this.f9099c, 0);
        }
        byte b2 = (byte) (b ^ this.f9099c[this.f9104h]);
        byte[] bArr = this.f9100d;
        int i = this.f9104h;
        this.f9104h = i + 1;
        bArr[i] = b2;
        if (this.f9104h == this.f9101e) {
            this.f9104h = 0;
            System.arraycopy(this.f9098b, this.f9101e, this.f9098b, 0, this.f9098b.length - this.f9101e);
            System.arraycopy(this.f9100d, 0, this.f9098b, this.f9098b.length - this.f9101e, this.f9101e);
        }
        return b2;
    }

    /* renamed from: c */
    private byte m11957c(byte b) {
        if (this.f9104h == 0) {
            this.f9102f.mo15778a(this.f9098b, 0, this.f9099c, 0);
        }
        this.f9100d[this.f9104h] = b;
        byte[] bArr = this.f9099c;
        int i = this.f9104h;
        this.f9104h = i + 1;
        byte b2 = (byte) (b ^ bArr[i]);
        if (this.f9104h == this.f9101e) {
            this.f9104h = 0;
            System.arraycopy(this.f9098b, this.f9101e, this.f9098b, 0, this.f9098b.length - this.f9101e);
            System.arraycopy(this.f9100d, 0, this.f9098b, this.f9098b.length - this.f9101e, this.f9101e);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte mo15791a(byte b) {
        return this.f9103g ? m11956b(b) : m11957c(b);
    }

    /* renamed from: a */
    public int mo15777a() {
        return this.f9101e;
    }

    /* renamed from: a */
    public int mo15778a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo15787a(bArr, i, this.f9101e, bArr2, i2);
        return this.f9101e;
    }

    /* renamed from: a */
    public void mo15779a(boolean z, C2562b bVar) {
        C2553a aVar;
        this.f9103g = z;
        if (bVar instanceof C2567b) {
            C2567b bVar2 = (C2567b) bVar;
            byte[] a = bVar2.mo15793a();
            if (a.length < this.f9097a.length) {
                System.arraycopy(a, 0, this.f9097a, this.f9097a.length - a.length, a.length);
                for (int i = 0; i < this.f9097a.length - a.length; i++) {
                    this.f9097a[i] = 0;
                }
            } else {
                System.arraycopy(a, 0, this.f9097a, 0, this.f9097a.length);
            }
            mo15780b();
            if (bVar2.mo15794b() != null) {
                aVar = this.f9102f;
                bVar = bVar2.mo15794b();
            } else {
                return;
            }
        } else {
            mo15780b();
            if (bVar != null) {
                aVar = this.f9102f;
            } else {
                return;
            }
        }
        aVar.mo15779a(true, bVar);
    }

    /* renamed from: b */
    public void mo15780b() {
        System.arraycopy(this.f9097a, 0, this.f9098b, 0, this.f9097a.length);
        C2574a.m11975a(this.f9100d, (byte) 0);
        this.f9104h = 0;
        this.f9102f.mo15780b();
    }
}
