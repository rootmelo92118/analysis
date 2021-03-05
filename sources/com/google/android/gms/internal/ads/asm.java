package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

final class asm implements aru {

    /* renamed from: a */
    private final arw f2434a;

    /* renamed from: b */
    private final String f2435b;

    /* renamed from: c */
    private final Object[] f2436c;

    /* renamed from: d */
    private final int f2437d;

    asm(arw arw, String str, Object[] objArr) {
        this.f2434a = arw;
        this.f2435b = str;
        this.f2436c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2437d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f2437d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo11119d() {
        return this.f2435b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo11120e() {
        return this.f2436c;
    }

    /* renamed from: c */
    public final arw mo11089c() {
        return this.f2434a;
    }

    /* renamed from: a */
    public final int mo11087a() {
        return (this.f2437d & 1) == 1 ? aqn.C1082e.f2337h : aqn.C1082e.f2338i;
    }

    /* renamed from: b */
    public final boolean mo11088b() {
        return (this.f2437d & 2) == 2;
    }
}
