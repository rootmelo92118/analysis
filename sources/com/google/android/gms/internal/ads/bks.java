package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class bks {

    /* renamed from: a */
    public final List<byte[]> f4580a;

    /* renamed from: b */
    public final int f4581b;

    /* renamed from: c */
    public final float f4582c;

    /* renamed from: d */
    private final int f4583d;

    /* renamed from: e */
    private final int f4584e;

    /* renamed from: a */
    public static bks m5833a(bkh bkh) {
        float f;
        int i;
        int i2;
        try {
            bkh.mo12056d(4);
            int f2 = (bkh.mo12059f() & 3) + 1;
            if (f2 != 3) {
                ArrayList arrayList = new ArrayList();
                int f3 = bkh.mo12059f() & 31;
                for (int i3 = 0; i3 < f3; i3++) {
                    arrayList.add(m5834b(bkh));
                }
                int f4 = bkh.mo12059f();
                for (int i4 = 0; i4 < f4; i4++) {
                    arrayList.add(m5834b(bkh));
                }
                if (f3 > 0) {
                    bkf a = bke.m5759a((byte[]) arrayList.get(0), f2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f4545a;
                    int i6 = a.f4546b;
                    f = a.f4547c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new bks(arrayList, f2, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bad("Error parsing AVC config", e);
        }
    }

    private bks(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f4580a = list;
        this.f4581b = i;
        this.f4583d = i2;
        this.f4584e = i3;
        this.f4582c = f;
    }

    /* renamed from: b */
    private static byte[] m5834b(bkh bkh) {
        int g = bkh.mo12060g();
        int d = bkh.mo12055d();
        bkh.mo12056d(g);
        return bjz.m5695a(bkh.f4559a, d, g);
    }
}
