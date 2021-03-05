package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.cz */
final class C1960cz implements Comparator<C1958cx> {
    C1960cz() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C1958cx cxVar = (C1958cx) obj;
        C1958cx cxVar2 = (C1958cx) obj2;
        C1966de deVar = (C1966de) cxVar.iterator();
        C1966de deVar2 = (C1966de) cxVar2.iterator();
        while (deVar.hasNext() && deVar2.hasNext()) {
            int compare = Integer.compare(C1958cx.m9077b(deVar.mo13608a()), C1958cx.m9077b(deVar2.mo13608a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(cxVar.mo13595a(), cxVar2.mo13595a());
    }
}
