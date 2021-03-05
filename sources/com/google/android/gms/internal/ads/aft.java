package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final /* synthetic */ class aft implements Callable {

    /* renamed from: a */
    private final Context f1632a;

    /* renamed from: b */
    private final agy f1633b;

    /* renamed from: c */
    private final String f1634c;

    /* renamed from: d */
    private final boolean f1635d;

    /* renamed from: e */
    private final boolean f1636e;

    /* renamed from: f */
    private final awy f1637f;

    /* renamed from: g */
    private final zzbbi f1638g;

    /* renamed from: h */
    private final C1019ad f1639h;

    /* renamed from: i */
    private final zzbo f1640i;

    /* renamed from: j */
    private final zzv f1641j;

    /* renamed from: k */
    private final box f1642k;

    aft(Context context, agy agy, String str, boolean z, boolean z2, awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv, box box) {
        this.f1632a = context;
        this.f1633b = agy;
        this.f1634c = str;
        this.f1635d = z;
        this.f1636e = z2;
        this.f1637f = awy;
        this.f1638g = zzbbi;
        this.f1639h = adVar;
        this.f1640i = zzbo;
        this.f1641j = zzv;
        this.f1642k = box;
    }

    public final Object call() {
        Context context = this.f1632a;
        agy agy = this.f1633b;
        String str = this.f1634c;
        boolean z = this.f1635d;
        boolean z2 = this.f1636e;
        awy awy = this.f1637f;
        zzbbi zzbbi = this.f1638g;
        C1019ad adVar = this.f1639h;
        zzbo zzbo = this.f1640i;
        zzv zzv = this.f1641j;
        box box = this.f1642k;
        zzbgr zzbgr = new zzbgr(afx.m2031a(context, agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv, box));
        zzbgr.setWebViewClient(zzbv.zzlh().mo13225a(zzbgr, box, z2));
        zzbgr.setWebChromeClient(new afc(zzbgr));
        return zzbgr;
    }
}
