package com.google.android.gms.internal.ads;

import android.support.p034v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class avo {

    /* renamed from: a */
    static CountDownLatch f2716a = new CountDownLatch(1);

    /* renamed from: b */
    private static boolean f2717b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MessageDigest f2718c;

    /* renamed from: d */
    private static final Object f2719d = new Object();

    /* renamed from: e */
    private static final Object f2720e = new Object();

    /* renamed from: a */
    static void m4289a() {
        synchronized (f2720e) {
            if (!f2717b) {
                f2717b = true;
                new Thread(new awb()).start();
            }
        }
    }

    /* renamed from: b */
    private static MessageDigest m4292b() {
        boolean z;
        m4289a();
        try {
            z = f2716a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && f2718c != null) {
            return f2718c;
        }
        return null;
    }

    /* renamed from: a */
    static String m4286a(akd akd, String str) {
        byte[] bArr;
        byte[] a = aum.m4186a((aum) akd);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5985bn)).booleanValue()) {
            Vector<byte[]> a2 = m4288a(a, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = m4291a(aum.m4186a((aum) m4285a((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)), str, true);
            } else {
                ark ark = new ark();
                ark.f2383a = new byte[a2.size()][];
                Iterator<byte[]> it = a2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    ark.f2383a[i] = m4291a(it.next(), str, false);
                    i++;
                }
                ark.f2384b = m4290a(a);
                bArr = aum.m4186a((aum) ark);
            }
        } else if (axv.f3071a != null) {
            byte[] a3 = axv.f3071a.mo10590a(a, str != null ? str.getBytes() : new byte[0]);
            ark ark2 = new ark();
            ark2.f2383a = new byte[][]{a3};
            ark2.f2385c = 2;
            bArr = aum.m4186a((aum) ark2);
        } else {
            throw new GeneralSecurityException();
        }
        return atm.m3909a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m4288a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static akd m4285a(long j) {
        akd akd = new akd();
        akd.f1936k = Long.valueOf(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return akd;
    }

    /* renamed from: a */
    private static byte[] m4291a(byte[] bArr, String str, boolean z) {
        byte[] bArr2;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = aum.m4186a((aum) m4285a((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m4290a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (awf a : new awc().f2903cN) {
            a.mo11342a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new aos(str.getBytes("UTF-8")).mo10752a(bArr4);
        }
        return bArr4;
    }

    /* renamed from: a */
    public static byte[] m4290a(byte[] bArr) {
        byte[] digest;
        synchronized (f2719d) {
            MessageDigest b = m4292b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f2718c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }
}
