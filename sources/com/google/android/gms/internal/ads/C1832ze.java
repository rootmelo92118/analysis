package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ze */
public final class C1832ze extends blj<bjj> {

    /* renamed from: a */
    private final abq<bjj> f6924a;

    /* renamed from: b */
    private final Map<String, String> f6925b;

    /* renamed from: c */
    private final aab f6926c;

    public C1832ze(String str, abq<bjj> abq) {
        this(str, (Map<String, String>) null, abq);
    }

    private C1832ze(String str, Map<String, String> map, abq<bjj> abq) {
        super(0, str, new C1833zf(abq));
        this.f6925b = null;
        this.f6924a = abq;
        this.f6926c = new aab();
        this.f6926c.mo10029a(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final brk<bjj> mo12110a(bjj bjj) {
        return brk.m6331a(bjj, C1531oa.m7694a(bjj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo12114a(Object obj) {
        bjj bjj = (bjj) obj;
        this.f6926c.mo10032a((Map<String, ?>) bjj.f4462c, bjj.f4460a);
        aab aab = this.f6926c;
        byte[] bArr = bjj.f4461b;
        if (aab.m1602c() && bArr != null) {
            aab.mo10033a(bArr);
        }
        this.f6924a.mo10087b(bjj);
    }
}
