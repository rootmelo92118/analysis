package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@C1598qn
final class aey {

    /* renamed from: a */
    private final ArrayList<bjl> f1558a = new ArrayList<>();

    /* renamed from: b */
    private long f1559b;

    aey() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo10304a() {
        Iterator<bjl> it = this.f1558a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> c = it.next().mo12019c();
            if (c != null) {
                for (Map.Entry next : c.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f1559b = Math.max(this.f1559b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f1559b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10305a(bjl bjl) {
        this.f1558a.add(bjl);
    }
}
