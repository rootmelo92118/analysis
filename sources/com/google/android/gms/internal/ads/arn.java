package com.google.android.gms.internal.ads;

final class arn implements arv {

    /* renamed from: a */
    private arv[] f2389a;

    arn(arv... arvArr) {
        this.f2389a = arvArr;
    }

    /* renamed from: a */
    public final boolean mo11014a(Class<?> cls) {
        for (arv a : this.f2389a) {
            if (a.mo11014a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final aru mo11015b(Class<?> cls) {
        for (arv arv : this.f2389a) {
            if (arv.mo11014a(cls)) {
                return arv.mo11015b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
