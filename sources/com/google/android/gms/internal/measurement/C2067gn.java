package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gn */
final class C2067gn extends C2073gt {

    /* renamed from: a */
    private final /* synthetic */ C2064gk f7841a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C2067gn(C2064gk gkVar) {
        super(gkVar, (C2065gl) null);
        this.f7841a = gkVar;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C2066gm(this.f7841a, (C2065gl) null);
    }

    /* synthetic */ C2067gn(C2064gk gkVar, C2065gl glVar) {
        this(gkVar);
    }
}
