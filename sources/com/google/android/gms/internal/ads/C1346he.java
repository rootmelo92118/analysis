package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.C2581b;
import org.apache.http.C2590d;
import org.apache.http.C2595f;
import org.apache.http.C2598i;
import org.apache.http.p069a.C2580b;
import org.apache.http.p070b.C2583b;
import org.apache.http.p070b.C2584c;
import org.apache.http.p070b.C2586e;

/* renamed from: com.google.android.gms.internal.ads.he */
public abstract class C1346he implements C1587qc {
    /* renamed from: a */
    public abstract C1559pb mo12548a(blj<?> blj, Map<String, String> map);

    @Deprecated
    /* renamed from: b */
    public final C2595f mo12595b(blj<?> blj, Map<String, String> map) {
        C1559pb a = mo12548a(blj, map);
        C2584c cVar = new C2584c(new C2586e(new C2598i("HTTP", 1, 1), a.mo12868a(), ""));
        ArrayList arrayList = new ArrayList();
        for (bff next : a.mo12869b()) {
            arrayList.add(new C2583b(next.mo11807a(), next.mo11808b()));
        }
        cVar.mo15803a((C2581b[]) arrayList.toArray(new C2581b[arrayList.size()]));
        InputStream d = a.mo12871d();
        if (d != null) {
            C2580b bVar = new C2580b();
            bVar.mo15801a(d);
            bVar.mo15800a((long) a.mo12870c());
            cVar.mo15810a((C2590d) bVar);
        }
        return cVar;
    }
}
