package org.p063a.p064a.p066b;

import org.p063a.p064a.C2553a;
import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2572h;
import org.p063a.p064a.p067c.C2567b;

/* renamed from: org.a.a.b.b */
public class C2564b extends C2572h {

    /* renamed from: a */
    private int f9105a;

    /* renamed from: b */
    private byte[] f9106b;

    /* renamed from: c */
    private byte[] f9107c;

    /* renamed from: d */
    private byte[] f9108d;

    /* renamed from: e */
    private final int f9109e;

    /* renamed from: f */
    private final C2553a f9110f;

    public C2564b(C2553a aVar, int i) {
        super(aVar);
        this.f9110f = aVar;
        this.f9109e = i / 8;
        this.f9106b = new byte[aVar.mo15777a()];
        this.f9107c = new byte[aVar.mo15777a()];
        this.f9108d = new byte[aVar.mo15777a()];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte mo15791a(byte b) {
        if (this.f9105a == 0) {
            this.f9110f.mo15778a(this.f9107c, 0, this.f9108d, 0);
        }
        byte[] bArr = this.f9108d;
        int i = this.f9105a;
        this.f9105a = i + 1;
        byte b2 = (byte) (b ^ bArr[i]);
        if (this.f9105a == this.f9109e) {
            this.f9105a = 0;
            System.arraycopy(this.f9107c, this.f9109e, this.f9107c, 0, this.f9107c.length - this.f9109e);
            System.arraycopy(this.f9108d, 0, this.f9107c, this.f9107c.length - this.f9109e, this.f9109e);
        }
        return b2;
    }

    /* renamed from: a */
    public int mo15777a() {
        return this.f9109e;
    }

    /* renamed from: a */
    public int mo15778a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo15787a(bArr, i, this.f9109e, bArr2, i2);
        return this.f9109e;
    }

    /* renamed from: a */
    public void mo15779a(boolean z, C2562b bVar) {
        C2553a aVar;
        if (bVar instanceof C2567b) {
            C2567b bVar2 = (C2567b) bVar;
            byte[] a = bVar2.mo15793a();
            if (a.length < this.f9106b.length) {
                System.arraycopy(a, 0, this.f9106b, this.f9106b.length - a.length, a.length);
                for (int i = 0; i < this.f9106b.length - a.length; i++) {
                    this.f9106b[i] = 0;
                }
            } else {
                System.arraycopy(a, 0, this.f9106b, 0, this.f9106b.length);
            }
            mo15780b();
            if (bVar2.mo15794b() != null) {
                aVar = this.f9110f;
                bVar = bVar2.mo15794b();
            } else {
                return;
            }
        } else {
            mo15780b();
            if (bVar != null) {
                aVar = this.f9110f;
            } else {
                return;
            }
        }
        aVar.mo15779a(true, bVar);
    }

    /* renamed from: b */
    public void mo15780b() {
        System.arraycopy(this.f9106b, 0, this.f9107c, 0, this.f9106b.length);
        this.f9105a = 0;
        this.f9110f.mo15780b();
    }
}
