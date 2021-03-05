package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bm */
final class C1139bm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<afl> f4736a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f4737b;

    public C1139bm(afl afl) {
        this.f4736a = new WeakReference<>(afl);
    }

    /* renamed from: a */
    public final void mo12176a(C1575pr prVar) {
        prVar.mo12885a("/loadHtml", new C1140bn(this, prVar));
        prVar.mo12885a("/showOverlay", new C1145bp(this, prVar));
        prVar.mo12885a("/hideOverlay", new C1195bq(this, prVar));
        afl afl = (afl) this.f4736a.get();
        if (afl != null) {
            afl.mo10347a("/sendMessageToSdk", (zzu<? super afl>) new C1196br(this, prVar));
        }
    }
}
