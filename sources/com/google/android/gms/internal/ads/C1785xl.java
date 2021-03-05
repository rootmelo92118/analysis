package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xl */
final class C1785xl implements C1066ao {

    /* renamed from: a */
    private final /* synthetic */ List f6850a;

    /* renamed from: b */
    private final /* synthetic */ C1065an f6851b;

    /* renamed from: c */
    private final /* synthetic */ Context f6852c;

    C1785xl(C1782xi xiVar, List list, C1065an anVar, Context context) {
        this.f6850a = list;
        this.f6851b = anVar;
        this.f6852c = context;
    }

    /* renamed from: b */
    public final void mo10743b() {
    }

    /* renamed from: a */
    public final void mo10742a() {
        for (String str : this.f6850a) {
            String valueOf = String.valueOf(str);
            C1772wz.m1628d(valueOf.length() != 0 ? "Pinging url: ".concat(valueOf) : new String("Pinging url: "));
            this.f6851b.mo10731a(Uri.parse(str), (Bundle) null, (List<Bundle>) null);
        }
        this.f6851b.mo10728a((Activity) this.f6852c);
    }
}
