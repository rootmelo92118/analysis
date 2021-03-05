package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final /* synthetic */ class ahg implements Callable {

    /* renamed from: a */
    private final Context f1768a;

    /* renamed from: b */
    private final agy f1769b;

    /* renamed from: c */
    private final String f1770c;

    /* renamed from: d */
    private final boolean f1771d;

    /* renamed from: e */
    private final boolean f1772e;

    /* renamed from: f */
    private final awy f1773f;

    /* renamed from: g */
    private final zzbbi f1774g;

    /* renamed from: h */
    private final C1019ad f1775h;

    /* renamed from: i */
    private final zzbo f1776i;

    /* renamed from: j */
    private final zzv f1777j;

    ahg(Context context, agy agy, String str, boolean z, boolean z2, awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv) {
        this.f1768a = context;
        this.f1769b = agy;
        this.f1770c = str;
        this.f1771d = z;
        this.f1772e = z2;
        this.f1773f = awy;
        this.f1774g = zzbbi;
        this.f1775h = adVar;
        this.f1776i = zzbo;
        this.f1777j = zzv;
    }

    public final Object call() {
        Context context = this.f1768a;
        agy agy = this.f1769b;
        String str = this.f1770c;
        boolean z = this.f1771d;
        boolean z2 = this.f1772e;
        awy awy = this.f1773f;
        zzbbi zzbbi = this.f1774g;
        C1019ad adVar = this.f1775h;
        zzbo zzbo = this.f1776i;
        zzv zzv = this.f1777j;
        agz agz = new agz();
        ahh ahh = new ahh(new agx(context), agz, agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv);
        zzbgr zzbgr = new zzbgr(ahh);
        ahh.setWebChromeClient(new afc(zzbgr));
        agz.mo10499a((afl) zzbgr, z2);
        return zzbgr;
    }
}
