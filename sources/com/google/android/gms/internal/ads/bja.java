package com.google.android.gms.internal.ads;

public final class bja {

    /* renamed from: a */
    public final bgh f4436a;

    /* renamed from: b */
    public final bix f4437b;

    /* renamed from: c */
    public final Object f4438c;

    /* renamed from: d */
    public final bai[] f4439d;

    public bja(bgh bgh, bix bix, Object obj, bai[] baiArr) {
        this.f4436a = bgh;
        this.f4437b = bix;
        this.f4438c = obj;
        this.f4439d = baiArr;
    }

    /* renamed from: a */
    public final boolean mo12001a(bja bja, int i) {
        if (bja != null && bkp.m5820a((Object) this.f4437b.mo11995a(i), (Object) bja.f4437b.mo11995a(i)) && bkp.m5820a((Object) this.f4439d[i], (Object) bja.f4439d[i])) {
            return true;
        }
        return false;
    }
}
