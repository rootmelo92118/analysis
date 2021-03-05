package com.p051vm.p060h;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.vm.h.a */
/* compiled from: AesUtil */
public class C2532a {

    /* renamed from: a */
    private static KeyGenerator f9018a;

    /* renamed from: b */
    private static Cipher f9019b;

    static {
        try {
            f9018a = KeyGenerator.getInstance("AES");
            f9019b = Cipher.getInstance("AES");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    /* renamed from: a */
    public static String m11858a(String str) {
        byte[] a = C2533b.m11861a(str);
        if (a == null) {
            return null;
        }
        for (int length = a.length - 1; length >= 0; length--) {
            a[length] = (byte) (a[length] ^ 108);
        }
        try {
            return new String(a, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
