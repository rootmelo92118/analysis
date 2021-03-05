package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ap */
public final class C1068ap extends C1206ca {

    /* renamed from: a */
    private static final int f2158a = Color.rgb(12, 174, 206);

    /* renamed from: b */
    private static final int f2159b;

    /* renamed from: c */
    private static final int f2160c;

    /* renamed from: d */
    private static final int f2161d = f2158a;

    /* renamed from: e */
    private final String f2162e;

    /* renamed from: f */
    private final List<C1085at> f2163f = new ArrayList();

    /* renamed from: g */
    private final List<C1210ce> f2164g = new ArrayList();

    /* renamed from: h */
    private final int f2165h;

    /* renamed from: i */
    private final int f2166i;

    /* renamed from: j */
    private final int f2167j;

    /* renamed from: k */
    private final int f2168k;

    /* renamed from: l */
    private final int f2169l;

    /* renamed from: m */
    private final boolean f2170m;

    public C1068ap(String str, List<C1085at> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f2162e = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                C1085at atVar = list.get(i3);
                this.f2163f.add(atVar);
                this.f2164g.add(atVar);
            }
        }
        this.f2165h = num != null ? num.intValue() : f2160c;
        this.f2166i = num2 != null ? num2.intValue() : f2161d;
        this.f2167j = num3 != null ? num3.intValue() : 12;
        this.f2168k = i;
        this.f2169l = i2;
        this.f2170m = z;
    }

    /* renamed from: a */
    public final String mo10776a() {
        return this.f2162e;
    }

    /* renamed from: b */
    public final List<C1210ce> mo10777b() {
        return this.f2164g;
    }

    /* renamed from: c */
    public final List<C1085at> mo10778c() {
        return this.f2163f;
    }

    /* renamed from: d */
    public final int mo10779d() {
        return this.f2165h;
    }

    /* renamed from: e */
    public final int mo10780e() {
        return this.f2166i;
    }

    /* renamed from: f */
    public final int mo10781f() {
        return this.f2167j;
    }

    /* renamed from: g */
    public final int mo10782g() {
        return this.f2168k;
    }

    /* renamed from: h */
    public final int mo10783h() {
        return this.f2169l;
    }

    /* renamed from: i */
    public final boolean mo10784i() {
        return this.f2170m;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        f2159b = rgb;
        f2160c = rgb;
    }
}
