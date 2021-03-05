package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yt */
public final class C1820yt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f6910a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f6911b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f6912c = new ArrayList();

    /* renamed from: a */
    public final C1820yt mo13278a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f6910a.size()) {
            double doubleValue = this.f6912c.get(i).doubleValue();
            double doubleValue2 = this.f6911b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f6910a.add(i, str);
        this.f6912c.add(i, Double.valueOf(d));
        this.f6911b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: a */
    public final C1817yq mo13277a() {
        return new C1817yq(this);
    }
}
