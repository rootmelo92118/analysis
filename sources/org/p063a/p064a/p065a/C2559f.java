package org.p063a.p064a.p065a;

import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2565c;
import org.p063a.p064a.C2569e;
import org.p063a.p064a.C2573i;
import org.p063a.p064a.p067c.C2566a;

/* renamed from: org.a.a.a.f */
public class C2559f implements C2573i {

    /* renamed from: a */
    private byte[] f9073a = null;

    /* renamed from: b */
    private int f9074b = 0;

    /* renamed from: c */
    private int f9075c = 0;

    /* renamed from: d */
    private byte[] f9076d = null;

    /* renamed from: a */
    private void m11924a(byte[] bArr) {
        this.f9076d = bArr;
        this.f9074b = 0;
        this.f9075c = 0;
        if (this.f9073a == null) {
            this.f9073a = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.f9073a[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            i3 = ((bArr[i2] & 255) + this.f9073a[i4] + i3) & 255;
            byte b = this.f9073a[i4];
            this.f9073a[i4] = this.f9073a[i3];
            this.f9073a[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    /* renamed from: a */
    public int mo15787a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new C2565c("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.f9074b = (this.f9074b + 1) & 255;
                this.f9075c = (this.f9073a[this.f9074b] + this.f9075c) & 255;
                byte b = this.f9073a[this.f9074b];
                this.f9073a[this.f9074b] = this.f9073a[this.f9075c];
                this.f9073a[this.f9075c] = b;
                bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ this.f9073a[(this.f9073a[this.f9074b] + this.f9073a[this.f9075c]) & 255]);
            }
            return i2;
        } else {
            throw new C2569e("output buffer too short");
        }
    }

    /* renamed from: a */
    public void mo15788a(boolean z, C2562b bVar) {
        if (bVar instanceof C2566a) {
            this.f9076d = ((C2566a) bVar).mo15792a();
            m11924a(this.f9076d);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + bVar.getClass().getName());
    }
}
