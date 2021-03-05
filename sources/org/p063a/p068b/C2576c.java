package org.p063a.p068b;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: org.a.b.c */
public final class C2576c {

    /* renamed from: a */
    private static String f9115a;

    static {
        try {
            f9115a = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                /* renamed from: a */
                public String run() {
                    return System.getProperty("line.separator");
                }
            });
        } catch (Exception unused) {
            try {
                f9115a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f9115a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static byte[] m11981a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
