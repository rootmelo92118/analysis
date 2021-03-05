package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ana implements aoc {

    /* renamed from: a */
    private final SecretKeySpec f2067a;

    /* renamed from: b */
    private final int f2068b;

    /* renamed from: c */
    private final int f2069c = ans.f2111a.mo10740a("AES/CTR/NoPadding").getBlockSize();

    public ana(byte[] bArr, int i) {
        aol.m2927a(bArr.length);
        this.f2067a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f2069c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f2068b = i;
    }

    /* renamed from: a */
    public final byte[] mo10733a(byte[] bArr) {
        if (bArr.length <= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2068b) {
            byte[] bArr2 = new byte[(this.f2068b + bArr.length)];
            byte[] a = aof.m2913a(this.f2068b);
            System.arraycopy(a, 0, bArr2, 0, this.f2068b);
            int length = bArr.length;
            int i = this.f2068b;
            Cipher a2 = ans.f2111a.mo10740a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f2069c];
            System.arraycopy(a, 0, bArr3, 0, this.f2068b);
            a2.init(1, this.f2067a, new IvParameterSpec(bArr3));
            if (a2.doFinal(bArr, 0, length, bArr2, i) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2068b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
