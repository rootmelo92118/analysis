package com.google.android.gms.internal.ads;

import android.util.Pair;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;

public final class bjz {

    /* renamed from: a */
    private static final byte[] f4517a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f4518b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, C0080b.MAX_BYTE_SIZE_PER_FILE, 7350};

    /* renamed from: c */
    private static final int[] f4519c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m5694a(byte[] bArr) {
        bkg bkg = new bkg(bArr);
        int a = m5693a(bkg);
        int b = m5696b(bkg);
        int a2 = bkg.mo12046a(4);
        if (a == 5 || a == 29) {
            b = m5696b(bkg);
            if (m5693a(bkg) == 22) {
                a2 = bkg.mo12046a(4);
            }
        }
        int i = f4519c[a2];
        bjy.m5689a(i != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static byte[] m5695a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f4517a.length + i2)];
        System.arraycopy(f4517a, 0, bArr2, 0, f4517a.length);
        System.arraycopy(bArr, i, bArr2, f4517a.length, i2);
        return bArr2;
    }

    /* renamed from: a */
    private static int m5693a(bkg bkg) {
        int a = bkg.mo12046a(5);
        return a == 31 ? bkg.mo12046a(6) + 32 : a;
    }

    /* renamed from: b */
    private static int m5696b(bkg bkg) {
        int a = bkg.mo12046a(4);
        if (a == 15) {
            return bkg.mo12046a(24);
        }
        bjy.m5689a(a < 13);
        return f4518b[a];
    }
}
