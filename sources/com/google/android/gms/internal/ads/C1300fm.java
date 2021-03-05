package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.fm */
final class C1300fm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C1327gm> f5367a = new ArrayList();

    C1300fm() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12538a(C1328gn gnVar) {
        Handler handler = C1782xi.f6838a;
        for (C1327gm glVar : this.f5367a) {
            handler.post(new C1326gl(this, glVar, gnVar));
        }
        this.f5367a.clear();
    }
}
