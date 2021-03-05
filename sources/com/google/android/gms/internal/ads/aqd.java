package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class aqd<FieldDescriptorType extends aqf<FieldDescriptorType>> {

    /* renamed from: d */
    private static final aqd f2246d = new aqd(true);

    /* renamed from: a */
    private final asr<FieldDescriptorType, Object> f2247a = asr.m3821a(16);

    /* renamed from: b */
    private boolean f2248b;

    /* renamed from: c */
    private boolean f2249c = false;

    private aqd() {
    }

    private aqd(boolean z) {
        mo10991c();
    }

    /* renamed from: a */
    public static <T extends aqf<T>> aqd<T> m3410a() {
        return f2246d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10990b() {
        return this.f2247a.isEmpty();
    }

    /* renamed from: c */
    public final void mo10991c() {
        if (!this.f2248b) {
            this.f2247a.mo11122a();
            this.f2248b = true;
        }
    }

    /* renamed from: d */
    public final boolean mo10993d() {
        return this.f2248b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd)) {
            return false;
        }
        return this.f2247a.equals(((aqd) obj).f2247a);
    }

    public final int hashCode() {
        return this.f2247a.hashCode();
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo10994e() {
        if (this.f2249c) {
            return new arb(this.f2247a.entrySet().iterator());
        }
        return this.f2247a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo10996f() {
        if (this.f2249c) {
            return new arb(this.f2247a.mo11129e().iterator());
        }
        return this.f2247a.mo11129e().iterator();
    }

    /* renamed from: a */
    private final Object m3411a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f2247a.get(fielddescriptortype);
        return obj instanceof aqy ? aqy.m3518a() : obj;
    }

    /* renamed from: a */
    private final void m3414a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo11006d()) {
            m3415a(fielddescriptortype.mo11004b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m3415a(fielddescriptortype.mo11004b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof aqy) {
            this.f2249c = true;
        }
        this.f2247a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aqy) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aqq) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3415a(com.google.android.gms.internal.ads.atw r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.aqp.m3495a(r3)
            int[] r0 = com.google.android.gms.internal.ads.aqe.f2250a
            com.google.android.gms.internal.ads.aub r2 = r2.mo11230a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.arw
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aqy
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aqq
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.apc
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aqd.m3415a(com.google.android.gms.internal.ads.atw, java.lang.Object):void");
    }

    /* renamed from: g */
    public final boolean mo10997g() {
        for (int i = 0; i < this.f2247a.mo11125c(); i++) {
            if (!m3416a(this.f2247a.mo11123b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f2247a.mo11128d()) {
            if (!m3416a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m3416a(Map.Entry<FieldDescriptorType, Object> entry) {
        aqf aqf = (aqf) entry.getKey();
        if (aqf.mo11005c() == aub.MESSAGE) {
            if (aqf.mo11006d()) {
                for (arw k : (List) entry.getValue()) {
                    if (!k.mo11019k()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof arw) {
                    if (!((arw) value).mo11019k()) {
                        return false;
                    }
                } else if (value instanceof aqy) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo10989a(aqd<FieldDescriptorType> aqd) {
        for (int i = 0; i < aqd.f2247a.mo11125c(); i++) {
            m3419b(aqd.f2247a.mo11123b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : aqd.f2247a.mo11128d()) {
            m3419b(b);
        }
    }

    /* renamed from: a */
    private static Object m3412a(Object obj) {
        if (obj instanceof asd) {
            return ((asd) obj).mo11110a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private final void m3419b(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        aqf aqf = (aqf) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aqy) {
            value = aqy.m3518a();
        }
        if (aqf.mo11006d()) {
            Object a = m3411a(aqf);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m3412a(a2));
            }
            this.f2247a.put(aqf, a);
        } else if (aqf.mo11005c() == aub.MESSAGE) {
            Object a3 = m3411a(aqf);
            if (a3 == null) {
                this.f2247a.put(aqf, m3412a(value));
                return;
            }
            if (a3 instanceof asd) {
                obj = aqf.mo11003a((asd) a3, (asd) value);
            } else {
                obj = aqf.mo11002a(((arw) a3).mo11021o(), (arw) value).mo11030f();
            }
            this.f2247a.put(aqf, obj);
        } else {
            this.f2247a.put(aqf, m3412a(value));
        }
    }

    /* renamed from: a */
    static void m3413a(apt apt, atw atw, int i, Object obj) {
        if (atw == atw.GROUP) {
            arw arw = (arw) obj;
            aqp.m3498a(arw);
            apt.mo10894a(i, 3);
            arw.mo11016a(apt);
            apt.mo10894a(i, 4);
            return;
        }
        apt.mo10894a(i, atw.mo11231b());
        switch (aqe.f2251b[atw.ordinal()]) {
            case 1:
                apt.mo10889a(((Double) obj).doubleValue());
                return;
            case 2:
                apt.mo10890a(((Float) obj).floatValue());
                return;
            case 3:
                apt.mo10901a(((Long) obj).longValue());
                return;
            case 4:
                apt.mo10901a(((Long) obj).longValue());
                return;
            case 5:
                apt.mo10891a(((Integer) obj).intValue());
                return;
            case 6:
                apt.mo10920c(((Long) obj).longValue());
                return;
            case 7:
                apt.mo10922d(((Integer) obj).intValue());
                return;
            case 8:
                apt.mo10907a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((arw) obj).mo11016a(apt);
                return;
            case 10:
                apt.mo10903a((arw) obj);
                return;
            case 11:
                if (obj instanceof apc) {
                    apt.mo10902a((apc) obj);
                    return;
                } else {
                    apt.mo10905a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof apc) {
                    apt.mo10902a((apc) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                apt.mo10921c(bArr, 0, bArr.length);
                return;
            case 13:
                apt.mo10909b(((Integer) obj).intValue());
                return;
            case 14:
                apt.mo10922d(((Integer) obj).intValue());
                return;
            case 15:
                apt.mo10920c(((Long) obj).longValue());
                return;
            case 16:
                apt.mo10917c(((Integer) obj).intValue());
                return;
            case 17:
                apt.mo10914b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof aqq) {
                    apt.mo10891a(((aqq) obj).mo10648a());
                    return;
                } else {
                    apt.mo10891a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: h */
    public final int mo10998h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2247a.mo11125c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f2247a.mo11123b(i2);
            i += m3417b((aqf<?>) (aqf) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f2247a.mo11128d()) {
            i += m3417b((aqf<?>) (aqf) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: i */
    public final int mo11000i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2247a.mo11125c(); i2++) {
            i += m3420c(this.f2247a.mo11123b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> c : this.f2247a.mo11128d()) {
            i += m3420c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m3420c(Map.Entry<FieldDescriptorType, Object> entry) {
        aqf aqf = (aqf) entry.getKey();
        Object value = entry.getValue();
        if (aqf.mo11005c() != aub.MESSAGE || aqf.mo11006d() || aqf.mo11007e()) {
            return m3417b((aqf<?>) aqf, value);
        }
        if (value instanceof aqy) {
            return apt.m3154b(((aqf) entry.getKey()).mo11001a(), (arc) (aqy) value);
        }
        return apt.m3170d(((aqf) entry.getKey()).mo11001a(), (arw) value);
    }

    /* renamed from: a */
    static int m3409a(atw atw, int i, Object obj) {
        int e = apt.m3173e(i);
        if (atw == atw.GROUP) {
            aqp.m3498a((arw) obj);
            e <<= 1;
        }
        return e + m3418b(atw, obj);
    }

    /* renamed from: b */
    private static int m3418b(atw atw, Object obj) {
        switch (aqe.f2251b[atw.ordinal()]) {
            case 1:
                return apt.m3150b(((Double) obj).doubleValue());
            case 2:
                return apt.m3151b(((Float) obj).floatValue());
            case 3:
                return apt.m3171d(((Long) obj).longValue());
            case 4:
                return apt.m3175e(((Long) obj).longValue());
            case 5:
                return apt.m3176f(((Integer) obj).intValue());
            case 6:
                return apt.m3183g(((Long) obj).longValue());
            case 7:
                return apt.m3188i(((Integer) obj).intValue());
            case 8:
                return apt.m3162b(((Boolean) obj).booleanValue());
            case 9:
                return apt.m3167c((arw) obj);
            case 10:
                if (obj instanceof aqy) {
                    return apt.m3147a((arc) (aqy) obj);
                }
                return apt.m3159b((arw) obj);
            case 11:
                if (obj instanceof apc) {
                    return apt.m3158b((apc) obj);
                }
                return apt.m3161b((String) obj);
            case 12:
                if (obj instanceof apc) {
                    return apt.m3158b((apc) obj);
                }
                return apt.m3163b((byte[]) obj);
            case 13:
                return apt.m3180g(((Integer) obj).intValue());
            case 14:
                return apt.m3191j(((Integer) obj).intValue());
            case 15:
                return apt.m3187h(((Long) obj).longValue());
            case 16:
                return apt.m3184h(((Integer) obj).intValue());
            case 17:
                return apt.m3179f(((Long) obj).longValue());
            case 18:
                if (obj instanceof aqq) {
                    return apt.m3193k(((aqq) obj).mo10648a());
                }
                return apt.m3193k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m3417b(aqf<?> aqf, Object obj) {
        atw b = aqf.mo11004b();
        int a = aqf.mo11001a();
        if (!aqf.mo11006d()) {
            return m3409a(b, a, obj);
        }
        int i = 0;
        if (aqf.mo11007e()) {
            for (Object b2 : (List) obj) {
                i += m3418b(b, b2);
            }
            return apt.m3173e(a) + i + apt.m3195l(i);
        }
        for (Object a2 : (List) obj) {
            i += m3409a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        aqd aqd = new aqd();
        for (int i = 0; i < this.f2247a.mo11125c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f2247a.mo11123b(i);
            aqd.m3414a((aqf) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f2247a.mo11128d()) {
            aqd.m3414a((aqf) next.getKey(), next.getValue());
        }
        aqd.f2249c = this.f2249c;
        return aqd;
    }
}
