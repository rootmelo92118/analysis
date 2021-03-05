package com.google.android.gms.internal.measurement;

import android.support.p034v4.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.C2003ei;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dv */
public class C1988dv {

    /* renamed from: a */
    static final C1988dv f7638a = new C1988dv(true);

    /* renamed from: b */
    private static volatile boolean f7639b = false;

    /* renamed from: c */
    private static final Class<?> f7640c = m9457d();

    /* renamed from: d */
    private static volatile C1988dv f7641d;

    /* renamed from: e */
    private final Map<C1989a, C2003ei.C2007d<?, ?>> f7642e;

    /* renamed from: d */
    private static Class<?> m9457d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.dv$a */
    static final class C1989a {

        /* renamed from: a */
        private final Object f7643a;

        /* renamed from: b */
        private final int f7644b;

        C1989a(Object obj, int i) {
            this.f7643a = obj;
            this.f7644b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f7643a) * SupportMenu.USER_MASK) + this.f7644b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1989a)) {
                return false;
            }
            C1989a aVar = (C1989a) obj;
            if (this.f7643a == aVar.f7643a && this.f7644b == aVar.f7644b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static C1988dv m9454a() {
        return C1987du.m9450a();
    }

    /* renamed from: b */
    public static C1988dv m9455b() {
        C1988dv dvVar = f7641d;
        if (dvVar == null) {
            synchronized (C1988dv.class) {
                dvVar = f7641d;
                if (dvVar == null) {
                    dvVar = C1987du.m9452b();
                    f7641d = dvVar;
                }
            }
        }
        return dvVar;
    }

    /* renamed from: c */
    static C1988dv m9456c() {
        return C2001eg.m9516a(C1988dv.class);
    }

    /* renamed from: a */
    public final <ContainingType extends C2043fq> C2003ei.C2007d<ContainingType, ?> mo13773a(ContainingType containingtype, int i) {
        return this.f7642e.get(new C1989a(containingtype, i));
    }

    C1988dv() {
        this.f7642e = new HashMap();
    }

    private C1988dv(boolean z) {
        this.f7642e = Collections.emptyMap();
    }
}
