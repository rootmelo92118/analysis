package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.so */
public final class C1653so {

    /* renamed from: a */
    public final C1661sw f6402a = null;

    /* renamed from: b */
    public final bol f6403b;

    /* renamed from: c */
    public final C1747wa f6404c;

    /* renamed from: d */
    public final C1232d f6405d;

    /* renamed from: e */
    public final C1672tg f6406e;

    /* renamed from: f */
    public final C1413jr f6407f;

    /* renamed from: g */
    public final C1673th f6408g;

    /* renamed from: h */
    public final C1525nv f6409h;

    /* renamed from: i */
    public final C1751we f6410i;

    /* renamed from: j */
    public final boolean f6411j;

    /* renamed from: k */
    public final C1658st f6412k;

    private C1653so(C1661sw swVar, bol bol, C1747wa waVar, C1232d dVar, C1672tg tgVar, C1413jr jrVar, C1673th thVar, C1525nv nvVar, C1751we weVar, boolean z, C1658st stVar) {
        this.f6403b = bol;
        this.f6404c = waVar;
        this.f6405d = dVar;
        this.f6406e = tgVar;
        this.f6407f = jrVar;
        this.f6408g = thVar;
        this.f6409h = nvVar;
        this.f6410i = weVar;
        this.f6411j = true;
        this.f6412k = stVar;
    }

    /* renamed from: a */
    public static C1653so m7876a(Context context) {
        zzbv.zzlr().mo12596a(context);
        C1675tj tjVar = new C1675tj(context);
        return new C1653so((C1661sw) null, new boo(), new C1748wb(), new C1205c(), new C1670te(context, tjVar.mo12950b()), new C1414js(), new C1674ti(), new C1524nu(), new C1749wc(), true, tjVar);
    }
}
