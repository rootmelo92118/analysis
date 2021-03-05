package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class axa {

    /* renamed from: b */
    private static Cipher f3015b;

    /* renamed from: c */
    private static final Object f3016c = new Object();

    /* renamed from: d */
    private static final Object f3017d = new Object();

    /* renamed from: a */
    private final SecureRandom f3018a = null;

    public axa(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    public final byte[] mo11358a(String str) {
        try {
            byte[] a = atm.m3910a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new axb(this);
        } catch (IllegalArgumentException e) {
            throw new axb(this, e);
        }
    }

    /* renamed from: a */
    public final String mo11357a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f3016c) {
                    m4374a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = m4374a().doFinal(bArr2);
                    iv = m4374a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return atm.m3909a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new axb(this, e);
            } catch (InvalidKeyException e2) {
                throw new axb(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new axb(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new axb(this, e4);
            } catch (BadPaddingException e5) {
                throw new axb(this, e5);
            }
        } else {
            throw new axb(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo11359a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = atm.m3910a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f3016c) {
                        m4374a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m4374a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new axb(this);
            } catch (NoSuchAlgorithmException e) {
                throw new axb(this, e);
            } catch (InvalidKeyException e2) {
                throw new axb(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new axb(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new axb(this, e4);
            } catch (BadPaddingException e5) {
                throw new axb(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new axb(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new axb(this, e7);
            }
        } else {
            throw new axb(this);
        }
    }

    /* renamed from: a */
    private static Cipher m4374a() {
        Cipher cipher;
        synchronized (f3017d) {
            if (f3015b == null) {
                f3015b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f3015b;
        }
        return cipher;
    }
}
