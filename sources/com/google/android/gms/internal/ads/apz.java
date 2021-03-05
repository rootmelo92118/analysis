package com.google.android.gms.internal.ads;

import android.support.p034v4.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.aqn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class apz {

    /* renamed from: a */
    static final apz f2231a = new apz(true);

    /* renamed from: b */
    private static volatile boolean f2232b = false;

    /* renamed from: c */
    private static final Class<?> f2233c = m3377d();

    /* renamed from: d */
    private static volatile apz f2234d;

    /* renamed from: e */
    private final Map<C1076a, aqn.C1081d<?, ?>> f2235e;

    /* renamed from: d */
    private static Class<?> m3377d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.apz$a */
    static final class C1076a {

        /* renamed from: a */
        private final Object f2236a;

        /* renamed from: b */
        private final int f2237b;

        C1076a(Object obj, int i) {
            this.f2236a = obj;
            this.f2237b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2236a) * SupportMenu.USER_MASK) + this.f2237b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1076a)) {
                return false;
            }
            C1076a aVar = (C1076a) obj;
            if (this.f2236a == aVar.f2236a && this.f2237b == aVar.f2237b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static apz m3374a() {
        return apy.m3370a();
    }

    /* renamed from: b */
    public static apz m3375b() {
        apz apz = f2234d;
        if (apz == null) {
            synchronized (apz.class) {
                apz = f2234d;
                if (apz == null) {
                    apz = apy.m3372b();
                    f2234d = apz;
                }
            }
        }
        return apz;
    }

    /* renamed from: c */
    static apz m3376c() {
        return aql.m3446a(apz.class);
    }

    /* renamed from: a */
    public final <ContainingType extends arw> aqn.C1081d<ContainingType, ?> mo10971a(ContainingType containingtype, int i) {
        return this.f2235e.get(new C1076a(containingtype, i));
    }

    apz() {
        this.f2235e = new HashMap();
    }

    private apz(boolean z) {
        this.f2235e = Collections.emptyMap();
    }
}
