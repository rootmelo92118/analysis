package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbb;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ou */
public final class C1551ou extends C1768wv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1544on f5840a;

    /* renamed from: b */
    private final zzasm f5841b;

    /* renamed from: c */
    private final C1753wg f5842c;

    /* renamed from: d */
    private final C1554ox f5843d;

    /* renamed from: e */
    private final Object f5844e;

    /* renamed from: f */
    private Future<C1752wf> f5845f;

    public C1551ou(Context context, zzbb zzbb, C1753wg wgVar, awy awy, C1544on onVar, C1019ad adVar) {
        this(wgVar, onVar, new C1554ox(context, zzbb, new C1821yu(context), awy, wgVar, adVar));
    }

    private C1551ou(C1753wg wgVar, C1544on onVar, C1554ox oxVar) {
        this.f5844e = new Object();
        this.f5842c = wgVar;
        this.f5841b = wgVar.f6725b;
        this.f5840a = onVar;
        this.f5843d = oxVar;
    }

    public final void zzki() {
        int i;
        C1752wf wfVar = null;
        try {
            synchronized (this.f5844e) {
                this.f5845f = C1780xg.m8354a(this.f5843d);
            }
            wfVar = this.f5845f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            C1772wz.m1630e("Timed out waiting for native ad.");
            this.f5845f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        C1782xi.f6838a.post(new C1552ov(this, wfVar != null ? wfVar : new C1752wf(this.f5842c.f6724a.f7032c, (afl) null, (List<String>) null, i, (List<String>) null, (List<String>) null, this.f5841b.f7092k, this.f5841b.f7091j, this.f5842c.f6724a.f7038i, false, (C1419jx) null, (C1440kr) null, (String) null, (C1420jy) null, (C1423ka) null, this.f5841b.f7089h, this.f5842c.f6727d, this.f5841b.f7087f, this.f5842c.f6729f, this.f5841b.f7094m, this.f5841b.f7095n, this.f5842c.f6731h, (C1135bi) null, (zzawd) null, (List<String>) null, (List<String>) null, this.f5842c.f6725b.f7059D, this.f5842c.f6725b.f7060E, (String) null, (List<String>) null, this.f5841b.f7067L, this.f5842c.f6732i, this.f5842c.f6725b.f7070O, false, this.f5842c.f6725b.f7072Q, (List<String>) null, this.f5842c.f6725b.f7074S, this.f5842c.f6725b.f7075T, this.f5842c.f6725b.f7077V)));
    }

    public final void onStop() {
        synchronized (this.f5844e) {
            if (this.f5845f != null) {
                this.f5845f.cancel(true);
            }
        }
    }
}
