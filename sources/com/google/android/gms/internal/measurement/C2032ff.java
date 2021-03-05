package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;

/* renamed from: com.google.android.gms.internal.measurement.ff */
final class C2032ff implements C2062gi {

    /* renamed from: b */
    private static final C2042fp f7782b = new C2033fg();

    /* renamed from: a */
    private final C2042fp f7783a;

    public C2032ff() {
        this(new C2034fh(C2002eh.m9518a(), m9658a()));
    }

    private C2032ff(C2042fp fpVar) {
        this.f7783a = (C2042fp) C2010ek.m9562a(fpVar, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> C2061gh<T> mo13902a(Class<T> cls) {
        C2063gj.m9849a((Class<?>) cls);
        C2041fo b = this.f7783a.mo13812b(cls);
        if (b.mo13923b()) {
            if (C2003ei.class.isAssignableFrom(cls)) {
                return C2049fw.m9753a(C2063gj.m9861c(), C1992dy.m9479a(), b.mo13924c());
            }
            return C2049fw.m9753a(C2063gj.m9839a(), C1992dy.m9480b(), b.mo13924c());
        } else if (C2003ei.class.isAssignableFrom(cls)) {
            if (m9659a(b)) {
                return C2047fu.m9713a(cls, b, C2054ga.m9769b(), C2027fa.m9639b(), C2063gj.m9861c(), C1992dy.m9479a(), C2040fn.m9691b());
            }
            return C2047fu.m9713a(cls, b, C2054ga.m9769b(), C2027fa.m9639b(), C2063gj.m9861c(), (C1990dw<?>) null, C2040fn.m9691b());
        } else if (m9659a(b)) {
            return C2047fu.m9713a(cls, b, C2054ga.m9768a(), C2027fa.m9638a(), C2063gj.m9839a(), C1992dy.m9480b(), C2040fn.m9690a());
        } else {
            return C2047fu.m9713a(cls, b, C2054ga.m9768a(), C2027fa.m9638a(), C2063gj.m9855b(), (C1990dw<?>) null, C2040fn.m9690a());
        }
    }

    /* renamed from: a */
    private static boolean m9659a(C2041fo foVar) {
        return foVar.mo13922a() == C2003ei.C2008e.f7737h;
    }

    /* renamed from: a */
    private static C2042fp m9658a() {
        try {
            return (C2042fp) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f7782b;
        }
    }
}
