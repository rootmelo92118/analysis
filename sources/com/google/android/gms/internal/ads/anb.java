package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class anb implements aio {

    /* renamed from: a */
    private final byte[] f2070a;

    /* renamed from: b */
    private final byte[] f2071b;

    /* renamed from: c */
    private final SecretKeySpec f2072c;

    /* renamed from: d */
    private final int f2073d;

    public anb(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f2073d = i;
            aol.m2927a(bArr.length);
            this.f2072c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f2072c);
            this.f2070a = m2862a(instance.doFinal(new byte[16]));
            this.f2071b = m2862a(this.f2070a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: b */
    private static byte[] m2863b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    private static byte[] m2862a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: a */
    private final byte[] m2861a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m2863b(bArr3, this.f2070a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        byte[] bArr4 = doFinal;
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr4[i5] = (byte) (bArr4[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArr4 = cipher.doFinal(bArr4);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m2863b(copyOfRange, this.f2070a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f2071b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m2863b(bArr4, bArr2));
    }

    /* renamed from: a */
    public final byte[] mo10588a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length <= (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f2073d) - 16) {
            byte[] bArr4 = new byte[(this.f2073d + bArr3.length + 16)];
            byte[] a = aof.m2913a(this.f2073d);
            System.arraycopy(a, 0, bArr4, 0, this.f2073d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f2072c);
            byte[] a2 = m2861a(instance, 0, a, 0, a.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = m2861a(instance, 1, bArr5, 0, bArr5.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.f2072c, new IvParameterSpec(a2));
            instance2.doFinal(bArr, 0, bArr3.length, bArr4, this.f2073d);
            byte[] a4 = m2861a(instance, 2, bArr4, this.f2073d, bArr3.length);
            int length = bArr3.length + this.f2073d;
            for (int i = 0; i < 16; i++) {
                bArr4[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
