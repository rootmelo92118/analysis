package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.C2581b;
import org.apache.http.C2595f;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.gd */
final class C1318gd extends C1346he {

    /* renamed from: a */
    private final C1587qc f5377a;

    C1318gd(C1587qc qcVar) {
        this.f5377a = qcVar;
    }

    /* renamed from: a */
    public final C1559pb mo12548a(blj<?> blj, Map<String, String> map) {
        try {
            C2595f b = this.f5377a.mo12595b(blj, map);
            int b2 = b.mo15811b().mo15822b();
            C2581b[] a = b.mo15804a();
            ArrayList arrayList = new ArrayList(a.length);
            for (C2581b bVar : a) {
                arrayList.add(new bff(bVar.mo15805b(), bVar.mo15806c()));
            }
            if (b.mo15812c() == null) {
                return new C1559pb(b2, arrayList);
            }
            long a2 = b.mo15812c().mo15799a();
            if (((long) ((int) a2)) == a2) {
                return new C1559pb(b2, arrayList, (int) b.mo15812c().mo15799a(), b.mo15812c().mo15802b());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(a2);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
