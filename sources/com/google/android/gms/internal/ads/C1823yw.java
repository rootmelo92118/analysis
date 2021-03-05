package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.yw */
final class C1823yw implements aap<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ C1828za f6916a;

    C1823yw(C1821yu yuVar, C1828za zaVar) {
        this.f6916a = zaVar;
    }

    public final /* synthetic */ abg zzf(Object obj) {
        Throwable th = (Throwable) obj;
        C1772wz.m1625b("Error occurred while dispatching http response in getter.", th);
        zzbv.zzlj().mo13119a(th, "HttpGetter.deliverResponse.1");
        return aau.m1646a(this.f6916a.mo12872a());
    }
}
