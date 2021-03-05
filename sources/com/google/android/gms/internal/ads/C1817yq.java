package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.yq */
public final class C1817yq {

    /* renamed from: a */
    private final String[] f6900a;

    /* renamed from: b */
    private final double[] f6901b;

    /* renamed from: c */
    private final double[] f6902c;

    /* renamed from: d */
    private final int[] f6903d;

    /* renamed from: e */
    private int f6904e;

    private C1817yq(C1820yt ytVar) {
        int size = ytVar.f6911b.size();
        this.f6900a = (String[]) ytVar.f6910a.toArray(new String[size]);
        this.f6901b = m8522a((List<Double>) ytVar.f6911b);
        this.f6902c = m8522a((List<Double>) ytVar.f6912c);
        this.f6903d = new int[size];
        this.f6904e = 0;
    }

    /* renamed from: a */
    private static double[] m8522a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void mo13273a(double d) {
        this.f6904e++;
        int i = 0;
        while (i < this.f6902c.length) {
            if (this.f6902c[i] <= d && d < this.f6901b[i]) {
                int[] iArr = this.f6903d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f6902c[i]) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<C1819ys> mo13272a() {
        ArrayList arrayList = new ArrayList(this.f6900a.length);
        for (int i = 0; i < this.f6900a.length; i++) {
            String str = this.f6900a[i];
            double d = this.f6902c[i];
            double d2 = this.f6901b[i];
            double d3 = (double) this.f6903d[i];
            double d4 = (double) this.f6904e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new C1819ys(str, d, d2, d3 / d4, this.f6903d[i]));
        }
        return arrayList;
    }
}
