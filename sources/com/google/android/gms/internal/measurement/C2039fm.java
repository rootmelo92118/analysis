package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fm */
final class C2039fm implements C2038fl {
    C2039fm() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo13916a(Object obj) {
        return (C2037fk) obj;
    }

    /* renamed from: f */
    public final C2036fj<?, ?> mo13921f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo13917b(Object obj) {
        return (C2037fk) obj;
    }

    /* renamed from: c */
    public final boolean mo13918c(Object obj) {
        return !((C2037fk) obj).mo13907d();
    }

    /* renamed from: d */
    public final Object mo13919d(Object obj) {
        ((C2037fk) obj).mo13905c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo13920e(Object obj) {
        return C2037fk.m9668a().mo13904b();
    }

    /* renamed from: a */
    public final Object mo13915a(Object obj, Object obj2) {
        C2037fk fkVar = (C2037fk) obj;
        C2037fk fkVar2 = (C2037fk) obj2;
        if (!fkVar2.isEmpty()) {
            if (!fkVar.mo13907d()) {
                fkVar = fkVar.mo13904b();
            }
            fkVar.mo13903a(fkVar2);
        }
        return fkVar;
    }

    /* renamed from: a */
    public final int mo13914a(int i, Object obj, Object obj2) {
        C2037fk fkVar = (C2037fk) obj;
        if (fkVar.isEmpty()) {
            return 0;
        }
        Iterator it = fkVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
