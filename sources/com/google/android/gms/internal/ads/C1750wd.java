package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C0856e;
import com.google.android.gms.common.C0857f;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.wd */
final class C1750wd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f6676a;

    /* renamed from: b */
    private final /* synthetic */ abq f6677b;

    C1750wd(C1749wc wcVar, Context context, abq abq) {
        this.f6676a = context;
        this.f6677b = abq;
    }

    public final void run() {
        try {
            this.f6677b.mo10087b(AdvertisingIdClient.getAdvertisingIdInfo(this.f6676a));
        } catch (C0856e | C0857f | IOException | IllegalStateException e) {
            this.f6677b.mo10086a(e);
            aai.m1625b("Exception while getting advertising Id info", e);
        }
    }
}
