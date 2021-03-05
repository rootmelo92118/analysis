package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class blp implements blx {

    /* renamed from: a */
    private final Object f4692a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C1752wf, blq> f4693b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<blq> f4694c = new ArrayList<>();

    /* renamed from: d */
    private final Context f4695d;

    /* renamed from: e */
    private final zzbbi f4696e;

    /* renamed from: f */
    private final C1366hy f4697f;

    public blp(Context context, zzbbi zzbbi) {
        this.f4695d = context.getApplicationContext();
        this.f4696e = zzbbi;
        this.f4697f = new C1366hy(context.getApplicationContext(), zzbbi, (String) bre.m6321e().mo12778a(C1557p.f5892a));
    }

    /* renamed from: a */
    public final void mo12145a(zzwf zzwf, C1752wf wfVar) {
        mo12146a(zzwf, wfVar, wfVar.f6699b.getView());
    }

    /* renamed from: a */
    public final void mo12146a(zzwf zzwf, C1752wf wfVar, View view) {
        mo12148a(zzwf, wfVar, (bnb) new blw(view, wfVar), (afl) null);
    }

    /* renamed from: a */
    public final void mo12147a(zzwf zzwf, C1752wf wfVar, View view, afl afl) {
        mo12148a(zzwf, wfVar, (bnb) new blw(view, wfVar), afl);
    }

    /* renamed from: a */
    public final void mo12148a(zzwf zzwf, C1752wf wfVar, bnb bnb, @Nullable afl afl) {
        blq blq;
        synchronized (this.f4692a) {
            if (m5926e(wfVar)) {
                blq = this.f4693b.get(wfVar);
            } else {
                blq blq2 = new blq(this.f4695d, zzwf, wfVar, this.f4696e, bnb);
                blq2.mo12154a((blx) this);
                this.f4693b.put(wfVar, blq2);
                this.f4694c.add(blq2);
                blq = blq2;
            }
            if (afl != null) {
                blq.mo12155a((bmm) new bly(blq, afl));
            } else {
                blq.mo12155a((bmm) new bmc(blq, this.f4697f, this.f4695d));
            }
        }
    }

    /* renamed from: e */
    private final boolean m5926e(C1752wf wfVar) {
        boolean z;
        synchronized (this.f4692a) {
            blq blq = this.f4693b.get(wfVar);
            z = blq != null && blq.mo12162c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo12144a(C1752wf wfVar) {
        synchronized (this.f4692a) {
            blq blq = this.f4693b.get(wfVar);
            if (blq != null) {
                blq.mo12158b();
            }
        }
    }

    /* renamed from: a */
    public final void mo12143a(blq blq) {
        synchronized (this.f4692a) {
            if (!blq.mo12162c()) {
                this.f4694c.remove(blq);
                Iterator<Map.Entry<C1752wf, blq>> it = this.f4693b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == blq) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12149b(C1752wf wfVar) {
        synchronized (this.f4692a) {
            blq blq = this.f4693b.get(wfVar);
            if (blq != null) {
                blq.mo12163d();
            }
        }
    }

    /* renamed from: c */
    public final void mo12150c(C1752wf wfVar) {
        synchronized (this.f4692a) {
            blq blq = this.f4693b.get(wfVar);
            if (blq != null) {
                blq.mo12164e();
            }
        }
    }

    /* renamed from: d */
    public final void mo12151d(C1752wf wfVar) {
        synchronized (this.f4692a) {
            blq blq = this.f4693b.get(wfVar);
            if (blq != null) {
                blq.mo12165f();
            }
        }
    }
}
