package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import java.util.Map;

final class aqb extends aqa<Object> {
    aqb() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10986a(arw arw) {
        return arw instanceof aqn.C1080c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aqd<Object> mo10979a(Object obj) {
        return ((aqn.C1080c) obj).zzfqa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10985a(Object obj, aqd<Object> aqd) {
        ((aqn.C1080c) obj).zzfqa = aqd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final aqd<Object> mo10987b(Object obj) {
        aqd<Object> a = mo10979a(obj);
        if (!a.mo10993d()) {
            return a;
        }
        aqd<Object> aqd = (aqd) a.clone();
        mo10985a(obj, aqd);
        return aqd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10988c(Object obj) {
        mo10979a(obj).mo10991c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <UT, UB> UB mo10981a(asn asn, Object obj, apz apz, aqd<Object> aqd, UB ub, atg<UT, UB> atg) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo10978a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10984a(auc auc, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo10980a(apz apz, arw arw, int i) {
        return apz.mo10971a(arw, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10983a(asn asn, Object obj, apz apz, aqd<Object> aqd) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10982a(apc apc, Object obj, apz apz, aqd<Object> aqd) {
        throw new NoSuchMethodError();
    }
}
