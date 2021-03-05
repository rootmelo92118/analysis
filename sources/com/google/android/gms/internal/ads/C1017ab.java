package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ab */
public final class C1017ab {

    /* renamed from: a */
    private final Map<String, C1016aa> f1292a = new HashMap();
    @Nullable

    /* renamed from: b */
    private final C1019ad f1293b;

    public C1017ab(@Nullable C1019ad adVar) {
        this.f1293b = adVar;
    }

    /* renamed from: a */
    public final void mo10054a(String str, C1016aa aaVar) {
        this.f1292a.put(str, aaVar);
    }

    /* renamed from: a */
    public final void mo10055a(String str, String str2, long j) {
        C1016aa aaVar;
        C1019ad adVar = this.f1293b;
        C1016aa aaVar2 = this.f1292a.get(str2);
        String[] strArr = {str};
        if (!(adVar == null || aaVar2 == null)) {
            adVar.mo10154a(aaVar2, j, strArr);
        }
        Map<String, C1016aa> map = this.f1292a;
        C1019ad adVar2 = this.f1293b;
        if (adVar2 == null) {
            aaVar = null;
        } else {
            aaVar = adVar2.mo10150a(j);
        }
        map.put(str, aaVar);
    }

    @Nullable
    /* renamed from: a */
    public final C1019ad mo10053a() {
        return this.f1293b;
    }
}
