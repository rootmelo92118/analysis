package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pd */
final class C1561pd implements aaq<List<C1085at>, C1068ap> {

    /* renamed from: a */
    private final /* synthetic */ String f6159a;

    /* renamed from: b */
    private final /* synthetic */ Integer f6160b;

    /* renamed from: c */
    private final /* synthetic */ Integer f6161c;

    /* renamed from: d */
    private final /* synthetic */ int f6162d;

    /* renamed from: e */
    private final /* synthetic */ int f6163e;

    /* renamed from: f */
    private final /* synthetic */ int f6164f;

    /* renamed from: g */
    private final /* synthetic */ int f6165g;

    /* renamed from: h */
    private final /* synthetic */ boolean f6166h;

    C1561pd(C1554ox oxVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f6159a = str;
        this.f6160b = num;
        this.f6161c = num2;
        this.f6162d = i;
        this.f6163e = i2;
        this.f6164f = i3;
        this.f6165g = i4;
        this.f6166h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10045a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f6159a;
        Integer num2 = this.f6160b;
        Integer num3 = this.f6161c;
        if (this.f6162d > 0) {
            num = Integer.valueOf(this.f6162d);
        }
        return new C1068ap(str, list, num2, num3, num, this.f6163e + this.f6164f, this.f6165g, this.f6166h);
    }
}
