package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;

final /* synthetic */ class afs implements aap {

    /* renamed from: a */
    private final Context f1627a;

    /* renamed from: b */
    private final awy f1628b;

    /* renamed from: c */
    private final zzbbi f1629c;

    /* renamed from: d */
    private final zzv f1630d;

    /* renamed from: e */
    private final String f1631e;

    afs(Context context, awy awy, zzbbi zzbbi, zzv zzv, String str) {
        this.f1627a = context;
        this.f1628b = awy;
        this.f1629c = zzbbi;
        this.f1630d = zzv;
        this.f1631e = str;
    }

    public final abg zzf(Object obj) {
        Context context = this.f1627a;
        awy awy = this.f1628b;
        zzbbi zzbbi = this.f1629c;
        zzv zzv = this.f1630d;
        String str = this.f1631e;
        zzbv.zzlg();
        afl a = afr.m2018a(context, agy.m2168a(), "", false, false, awy, zzbbi, (C1019ad) null, (zzbo) null, zzv, box.m6117a());
        abp a2 = abp.m1673a(a);
        a.mo10388u().mo10400a((agt) new afu(a2));
        a.loadUrl(str);
        return a2;
    }
}
