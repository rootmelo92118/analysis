package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.List;

public final class ban {

    /* renamed from: a */
    private static final int[] f3295a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f3296b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f3297c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f3298d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f3299e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, ModuleDescriptor.MODULE_VERSION, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f3300f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m4694a() {
        return 1536;
    }

    /* renamed from: a */
    public static zzfs m4696a(bkh bkh, String str, String str2, zzhp zzhp) {
        int i = f3296b[(bkh.mo12059f() & 192) >> 6];
        int f = bkh.mo12059f();
        int i2 = f3298d[(f & 56) >> 3];
        if ((f & 4) != 0) {
            i2++;
        }
        return zzfs.m8798a(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzhp, 0, str2);
    }

    /* renamed from: b */
    public static zzfs m4697b(bkh bkh, String str, String str2, zzhp zzhp) {
        bkh bkh2 = bkh;
        bkh.mo12056d(2);
        int i = f3296b[(bkh.mo12059f() & 192) >> 6];
        int f = bkh.mo12059f();
        int i2 = f3298d[(f & 14) >> 1];
        if ((f & 1) != 0) {
            i2++;
        }
        return zzfs.m8798a(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzhp, 0, str2);
    }

    /* renamed from: a */
    public static int m4695a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f3295a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
