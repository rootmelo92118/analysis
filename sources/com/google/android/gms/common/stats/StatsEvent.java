package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo9981a();

    /* renamed from: b */
    public abstract int mo9982b();

    /* renamed from: c */
    public abstract long mo9983c();

    /* renamed from: d */
    public abstract String mo9984d();

    public String toString() {
        long a = mo9981a();
        int b = mo9982b();
        long c = mo9983c();
        String d = mo9984d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
