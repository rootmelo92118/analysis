package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.rg */
public abstract class C1618rg implements C1616re, C1804yd<Void> {

    /* renamed from: a */
    private final abs<zzasi> f6289a;

    /* renamed from: b */
    private final C1616re f6290b;

    /* renamed from: c */
    private final Object f6291c = new Object();

    public C1618rg(abs<zzasi> abs, C1616re reVar) {
        this.f6289a = abs;
        this.f6290b = reVar;
    }

    /* renamed from: a */
    public abstract void mo12916a();

    /* renamed from: b */
    public abstract C1629rr mo12918b();

    /* renamed from: a */
    public final void mo12906a(zzasm zzasm) {
        synchronized (this.f6291c) {
            this.f6290b.mo12906a(zzasm);
            mo12916a();
        }
    }

    public final void cancel() {
        mo12916a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12917a(C1629rr rrVar, zzasi zzasi) {
        try {
            rrVar.mo12928a(zzasi, (C1632ru) new C1626ro(this));
            return true;
        } catch (Throwable th) {
            C1772wz.m1627c("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbv.zzlj().mo13119a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f6290b.mo12906a(new zzasm(0));
            return false;
        }
    }

    public final /* synthetic */ Object zzwa() {
        C1629rr b = mo12918b();
        if (b == null) {
            this.f6290b.mo12906a(new zzasm(0));
            mo12916a();
            return null;
        }
        this.f6289a.mo10093a(new C1619rh(this, b), new C1620ri(this));
        return null;
    }
}
