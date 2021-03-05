package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.atomic.AtomicBoolean;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.og */
public abstract class C1537og implements agt, C1804yd<Void> {

    /* renamed from: a */
    protected final Context f5804a;

    /* renamed from: b */
    protected final afl f5805b;

    /* renamed from: c */
    protected zzasm f5806c;

    /* renamed from: d */
    private final C1544on f5807d;

    /* renamed from: e */
    private final C1753wg f5808e;

    /* renamed from: f */
    private Runnable f5809f;

    /* renamed from: g */
    private final Object f5810g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f5811h = new AtomicBoolean(true);

    protected C1537og(Context context, C1753wg wgVar, afl afl, C1544on onVar) {
        this.f5804a = context;
        this.f5808e = wgVar;
        this.f5806c = this.f5808e.f6725b;
        this.f5805b = afl;
        this.f5807d = onVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12843a();

    public final void zzp(boolean z) {
        C1772wz.m1624b("WebView finished loading.");
        int i = 0;
        if (this.f5811h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo12844a(i);
            C1782xi.f6838a.removeCallbacks(this.f5809f);
        }
    }

    public void cancel() {
        if (this.f5811h.getAndSet(false)) {
            this.f5805b.stopLoading();
            zzbv.zzlh();
            C1790xq.m8434a(this.f5805b);
            mo12844a(-1);
            C1782xi.f6838a.removeCallbacks(this.f5809f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12844a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.f5806c = new zzasm(i2, this.f5806c.f7091j);
        }
        this.f5805b.mo10374o();
        C1544on onVar = this.f5807d;
        zzasi zzasi = this.f5808e.f6724a;
        C1752wf wfVar = r1;
        C1752wf wfVar2 = new C1752wf(zzasi.f7032c, this.f5805b, this.f5806c.f7084c, i, this.f5806c.f7086e, this.f5806c.f7090i, this.f5806c.f7092k, this.f5806c.f7091j, zzasi.f7038i, this.f5806c.f7088g, (C1419jx) null, (C1440kr) null, (String) null, (C1420jy) null, (C1423ka) null, this.f5806c.f7089h, this.f5808e.f6727d, this.f5806c.f7087f, this.f5808e.f6729f, this.f5806c.f7094m, this.f5806c.f7095n, this.f5808e.f6731h, (C1135bi) null, this.f5806c.f7056A, this.f5806c.f7057B, this.f5806c.f7058C, this.f5806c.f7059D, this.f5806c.f7060E, (String) null, this.f5806c.f7063H, this.f5806c.f7067L, this.f5808e.f6732i, this.f5808e.f6725b.f7070O, this.f5808e.f6733j, this.f5808e.f6725b.f7072Q, this.f5806c.f7073R, this.f5808e.f6725b.f7074S, this.f5808e.f6725b.f7075T, this.f5808e.f6725b.f7077V);
        onVar.zzb(wfVar);
    }

    public final /* synthetic */ Object zzwa() {
        C0926p.m1315b("Webview render task needs to be called on UI thread.");
        this.f5809f = new C1538oh(this);
        C1782xi.f6838a.postDelayed(this.f5809f, ((Long) bre.m6321e().mo12778a(C1557p.f5974bc)).longValue());
        mo12843a();
        return null;
    }
}
