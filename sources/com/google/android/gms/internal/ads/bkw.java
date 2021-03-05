package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class bkw {

    /* renamed from: a */
    public final List<byte[]> f4591a;

    /* renamed from: b */
    public final int f4592b;

    /* renamed from: a */
    public static bkw m5837a(bkh bkh) {
        List list;
        try {
            bkh.mo12056d(21);
            int f = bkh.mo12059f() & 3;
            int f2 = bkh.mo12059f();
            int d = bkh.mo12055d();
            int i = 0;
            int i2 = 0;
            while (i < f2) {
                bkh.mo12056d(1);
                int g = bkh.mo12060g();
                int i3 = i2;
                for (int i4 = 0; i4 < g; i4++) {
                    int g2 = bkh.mo12060g();
                    i3 += g2 + 4;
                    bkh.mo12056d(g2);
                }
                i++;
                i2 = i3;
            }
            bkh.mo12054c(d);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < f2) {
                bkh.mo12056d(1);
                int g3 = bkh.mo12060g();
                int i7 = i6;
                for (int i8 = 0; i8 < g3; i8++) {
                    int g4 = bkh.mo12060g();
                    System.arraycopy(bke.f4541a, 0, bArr, i7, bke.f4541a.length);
                    int length = i7 + bke.f4541a.length;
                    System.arraycopy(bkh.f4559a, bkh.mo12055d(), bArr, length, g4);
                    i7 = length + g4;
                    bkh.mo12056d(g4);
                }
                i5++;
                i6 = i7;
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new bkw(list, f + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bad("Error parsing HEVC config", e);
        }
    }

    private bkw(List<byte[]> list, int i) {
        this.f4591a = list;
        this.f4592b = i;
    }
}
