package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fh */
final class C2034fh implements C2042fp {

    /* renamed from: a */
    private C2042fp[] f7784a;

    C2034fh(C2042fp... fpVarArr) {
        this.f7784a = fpVarArr;
    }

    /* renamed from: a */
    public final boolean mo13811a(Class<?> cls) {
        for (C2042fp a : this.f7784a) {
            if (a.mo13811a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2041fo mo13812b(Class<?> cls) {
        for (C2042fp fpVar : this.f7784a) {
            if (fpVar.mo13811a(cls)) {
                return fpVar.mo13812b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
