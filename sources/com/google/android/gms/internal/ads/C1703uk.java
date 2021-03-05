package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Future;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.uk */
public final class C1703uk extends C1768wv implements C1709uq, C1712ut, C1716ux {

    /* renamed from: a */
    public final String f6577a;

    /* renamed from: b */
    private final C1753wg f6578b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f6579c;

    /* renamed from: d */
    private final C1717uy f6580d;

    /* renamed from: e */
    private final C1712ut f6581e;

    /* renamed from: f */
    private final Object f6582f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f6583g;

    /* renamed from: h */
    private final C1419jx f6584h;

    /* renamed from: i */
    private final long f6585i;

    /* renamed from: j */
    private int f6586j = 0;

    /* renamed from: k */
    private int f6587k = 3;

    /* renamed from: l */
    private C1706un f6588l;

    /* renamed from: m */
    private Future f6589m;

    /* renamed from: n */
    private volatile zzb f6590n;

    public C1703uk(Context context, String str, String str2, C1419jx jxVar, C1753wg wgVar, C1717uy uyVar, C1712ut utVar, long j) {
        this.f6579c = context;
        this.f6577a = str;
        this.f6583g = str2;
        this.f6584h = jxVar;
        this.f6578b = wgVar;
        this.f6580d = uyVar;
        this.f6582f = new Object();
        this.f6581e = utVar;
        this.f6585i = j;
    }

    public final void onStop() {
    }

    public final void zzki() {
        int i;
        if (this.f6580d != null && this.f6580d.mo13048b() != null && this.f6580d.mo13047a() != null) {
            C1711us b = this.f6580d.mo13048b();
            b.mo13033a((C1712ut) null);
            b.mo13032a((C1709uq) this);
            b.mo13034a((C1716ux) this);
            zzwb zzwb = this.f6578b.f6724a.f7032c;
            C1440kr a = this.f6580d.mo13047a();
            try {
                if (a.mo12698g()) {
                    C1851zx.f6962a.post(new C1704ul(this, zzwb, a));
                } else {
                    C1851zx.f6962a.post(new C1705um(this, a, zzwb, b));
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Fail to check if adapter is initialized.", e);
                mo13017a(this.f6577a, 0);
            }
            long b2 = zzbv.zzlm().mo9997b();
            while (true) {
                synchronized (this.f6582f) {
                    if (this.f6586j != 0) {
                        C1708up a2 = new C1708up().mo13025a(zzbv.zzlm().mo9997b() - b2);
                        if (1 == this.f6586j) {
                            i = 6;
                        } else {
                            i = this.f6587k;
                        }
                        this.f6588l = a2.mo13024a(i).mo13026a(this.f6577a).mo13027b(this.f6584h.f5548d).mo13023a();
                    } else if (!m8058a(b2)) {
                        this.f6588l = new C1708up().mo13024a(this.f6587k).mo13025a(zzbv.zzlm().mo9997b() - b2).mo13026a(this.f6577a).mo13027b(this.f6584h.f5548d).mo13023a();
                    }
                }
            }
            b.mo13033a((C1712ut) null);
            b.mo13032a((C1709uq) null);
            if (this.f6586j == 1) {
                this.f6581e.mo13016a(this.f6577a);
            } else {
                this.f6581e.mo13017a(this.f6577a, this.f6587k);
            }
        }
    }

    /* renamed from: a */
    public final Future mo13012a() {
        if (this.f6589m != null) {
            return this.f6589m;
        }
        abg abg = (abg) zzwa();
        this.f6589m = abg;
        return abg;
    }

    /* renamed from: b */
    public final C1706un mo13018b() {
        C1706un unVar;
        synchronized (this.f6582f) {
            unVar = this.f6588l;
        }
        return unVar;
    }

    /* renamed from: c */
    public final C1419jx mo13019c() {
        return this.f6584h;
    }

    /* renamed from: a */
    private final boolean m8058a(long j) {
        long b = this.f6585i - (zzbv.zzlm().mo9997b() - j);
        if (b <= 0) {
            this.f6587k = 4;
            return false;
        }
        try {
            this.f6582f.wait(b);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f6587k = 5;
            return false;
        }
    }

    /* renamed from: a */
    public final void mo13016a(String str) {
        synchronized (this.f6582f) {
            this.f6586j = 1;
            this.f6582f.notify();
        }
    }

    /* renamed from: a */
    public final void mo13017a(String str, int i) {
        synchronized (this.f6582f) {
            this.f6586j = 2;
            this.f6587k = i;
            this.f6582f.notify();
        }
    }

    /* renamed from: d */
    public final void mo13020d() {
        m8057a(this.f6578b.f6724a.f7032c, this.f6580d.mo13047a());
    }

    /* renamed from: a */
    public final void mo13013a(int i) {
        mo13017a(this.f6577a, 0);
    }

    /* renamed from: a */
    public final void mo13015a(zzb zzb) {
        this.f6590n = zzb;
    }

    /* renamed from: a */
    public final void mo13014a(Bundle bundle) {
        zzb zzb = this.f6590n;
        if (zzb != null) {
            zzb.zza("", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8057a(zzwb zzwb, C1440kr krVar) {
        this.f6580d.mo13048b().mo13033a((C1712ut) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f6577a)) {
                krVar.mo12691a(zzwb, this.f6583g, this.f6584h.f5545a);
            } else {
                krVar.mo12690a(zzwb, this.f6583g);
            }
        } catch (RemoteException e) {
            C1772wz.m1627c("Fail to load ad from adapter.", e);
            mo13017a(this.f6577a, 0);
        }
    }
}
