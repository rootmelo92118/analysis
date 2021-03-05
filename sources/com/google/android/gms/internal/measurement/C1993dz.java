package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1996eb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dz */
final class C1993dz<FieldDescriptorType extends C1996eb<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C1993dz f7647d = new C1993dz(true);

    /* renamed from: a */
    private final C2064gk<FieldDescriptorType, Object> f7648a = C2064gk.m9891a(16);

    /* renamed from: b */
    private boolean f7649b;

    /* renamed from: c */
    private boolean f7650c = false;

    private C1993dz() {
    }

    private C1993dz(boolean z) {
        mo13788c();
    }

    /* renamed from: a */
    public static <T extends C1996eb<T>> C1993dz<T> m9483a() {
        return f7647d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo13787b() {
        return this.f7648a.isEmpty();
    }

    /* renamed from: c */
    public final void mo13788c() {
        if (!this.f7649b) {
            this.f7648a.mo13943a();
            this.f7649b = true;
        }
    }

    /* renamed from: d */
    public final boolean mo13790d() {
        return this.f7649b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1993dz)) {
            return false;
        }
        return this.f7648a.equals(((C1993dz) obj).f7648a);
    }

    public final int hashCode() {
        return this.f7648a.hashCode();
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo13791e() {
        if (this.f7650c) {
            return new C2022ew(this.f7648a.entrySet().iterator());
        }
        return this.f7648a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo13793f() {
        if (this.f7650c) {
            return new C2022ew(this.f7648a.mo13950e().iterator());
        }
        return this.f7648a.mo13950e().iterator();
    }

    /* renamed from: a */
    private final Object m9484a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f7648a.get(fielddescriptortype);
        return obj instanceof C2018es ? C2018es.m9582a() : obj;
    }

    /* renamed from: a */
    private final void m9487a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo13803d()) {
            m9488a(fielddescriptortype.mo13801b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m9488a(fielddescriptortype.mo13801b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C2018es) {
            this.f7650c = true;
        }
        this.f7648a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C2018es) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C2011el) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9488a(com.google.android.gms.internal.measurement.C2099ho r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C2010ek.m9560a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C1995ea.f7651a
            com.google.android.gms.internal.measurement.ht r2 = r2.mo14047a()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C2043fq
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C2018es
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C2011el
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C1958cx
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1993dz.m9488a(com.google.android.gms.internal.measurement.ho, java.lang.Object):void");
    }

    /* renamed from: g */
    public final boolean mo13794g() {
        for (int i = 0; i < this.f7648a.mo13946c(); i++) {
            if (!m9489a(this.f7648a.mo13944b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f7648a.mo13949d()) {
            if (!m9489a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m9489a(Map.Entry<FieldDescriptorType, Object> entry) {
        C1996eb ebVar = (C1996eb) entry.getKey();
        if (ebVar.mo13802c() == C2104ht.MESSAGE) {
            if (ebVar.mo13803d()) {
                for (C2043fq f : (List) entry.getValue()) {
                    if (!f.mo13815f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C2043fq) {
                    if (!((C2043fq) value).mo13815f()) {
                        return false;
                    }
                } else if (value instanceof C2018es) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo13786a(C1993dz<FieldDescriptorType> dzVar) {
        for (int i = 0; i < dzVar.f7648a.mo13946c(); i++) {
            m9492b(dzVar.f7648a.mo13944b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : dzVar.f7648a.mo13949d()) {
            m9492b(b);
        }
    }

    /* renamed from: a */
    private static Object m9485a(Object obj) {
        if (obj instanceof C2050fx) {
            return ((C2050fx) obj).mo13934a();
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
    private final void m9492b(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C1996eb ebVar = (C1996eb) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2018es) {
            value = C2018es.m9582a();
        }
        if (ebVar.mo13803d()) {
            Object a = m9484a(ebVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m9485a(a2));
            }
            this.f7648a.put(ebVar, a);
        } else if (ebVar.mo13802c() == C2104ht.MESSAGE) {
            Object a3 = m9484a(ebVar);
            if (a3 == null) {
                this.f7648a.put(ebVar, m9485a(value));
                return;
            }
            if (a3 instanceof C2050fx) {
                obj = ebVar.mo13800a((C2050fx) a3, (C2050fx) value);
            } else {
                obj = ebVar.mo13799a(((C2043fq) a3).mo13819j(), (C2043fq) value).mo13828g();
            }
            this.f7648a.put(ebVar, obj);
        } else {
            this.f7648a.put(ebVar, m9485a(value));
        }
    }

    /* renamed from: a */
    static void m9486a(C1976do doVar, C2099ho hoVar, int i, Object obj) {
        if (hoVar == C2099ho.GROUP) {
            C2043fq fqVar = (C2043fq) obj;
            C2010ek.m9563a(fqVar);
            doVar.mo13696a(i, 3);
            fqVar.mo13813a(doVar);
            doVar.mo13696a(i, 4);
            return;
        }
        doVar.mo13696a(i, hoVar.mo14048b());
        switch (C1995ea.f7652b[hoVar.ordinal()]) {
            case 1:
                doVar.mo13691a(((Double) obj).doubleValue());
                return;
            case 2:
                doVar.mo13692a(((Float) obj).floatValue());
                return;
            case 3:
                doVar.mo13703a(((Long) obj).longValue());
                return;
            case 4:
                doVar.mo13703a(((Long) obj).longValue());
                return;
            case 5:
                doVar.mo13693a(((Integer) obj).intValue());
                return;
            case 6:
                doVar.mo13721c(((Long) obj).longValue());
                return;
            case 7:
                doVar.mo13723d(((Integer) obj).intValue());
                return;
            case 8:
                doVar.mo13709a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C2043fq) obj).mo13813a(doVar);
                return;
            case 10:
                doVar.mo13705a((C2043fq) obj);
                return;
            case 11:
                if (obj instanceof C1958cx) {
                    doVar.mo13704a((C1958cx) obj);
                    return;
                } else {
                    doVar.mo13707a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C1958cx) {
                    doVar.mo13704a((C1958cx) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                doVar.mo13722c(bArr, 0, bArr.length);
                return;
            case 13:
                doVar.mo13711b(((Integer) obj).intValue());
                return;
            case 14:
                doVar.mo13723d(((Integer) obj).intValue());
                return;
            case 15:
                doVar.mo13721c(((Long) obj).longValue());
                return;
            case 16:
                doVar.mo13718c(((Integer) obj).intValue());
                return;
            case 17:
                doVar.mo13716b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C2011el) {
                    doVar.mo13693a(((C2011el) obj).mo13496a());
                    return;
                } else {
                    doVar.mo13693a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: h */
    public final int mo13795h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7648a.mo13946c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f7648a.mo13944b(i2);
            i += m9490b((C1996eb<?>) (C1996eb) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f7648a.mo13949d()) {
            i += m9490b((C1996eb<?>) (C1996eb) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: i */
    public final int mo13797i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7648a.mo13946c(); i2++) {
            i += m9493c(this.f7648a.mo13944b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> c : this.f7648a.mo13949d()) {
            i += m9493c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m9493c(Map.Entry<FieldDescriptorType, Object> entry) {
        C1996eb ebVar = (C1996eb) entry.getKey();
        Object value = entry.getValue();
        if (ebVar.mo13802c() != C2104ht.MESSAGE || ebVar.mo13803d() || ebVar.mo13804e()) {
            return m9490b((C1996eb<?>) ebVar, value);
        }
        if (value instanceof C2018es) {
            return C1976do.m9234b(((C1996eb) entry.getKey()).mo13798a(), (C2023ex) (C2018es) value);
        }
        return C1976do.m9251d(((C1996eb) entry.getKey()).mo13798a(), (C2043fq) value);
    }

    /* renamed from: a */
    static int m9482a(C2099ho hoVar, int i, Object obj) {
        int e = C1976do.m9253e(i);
        if (hoVar == C2099ho.GROUP) {
            C2010ek.m9563a((C2043fq) obj);
            e <<= 1;
        }
        return e + m9491b(hoVar, obj);
    }

    /* renamed from: b */
    private static int m9491b(C2099ho hoVar, Object obj) {
        switch (C1995ea.f7652b[hoVar.ordinal()]) {
            case 1:
                return C1976do.m9230b(((Double) obj).doubleValue());
            case 2:
                return C1976do.m9231b(((Float) obj).floatValue());
            case 3:
                return C1976do.m9252d(((Long) obj).longValue());
            case 4:
                return C1976do.m9255e(((Long) obj).longValue());
            case 5:
                return C1976do.m9256f(((Integer) obj).intValue());
            case 6:
                return C1976do.m9263g(((Long) obj).longValue());
            case 7:
                return C1976do.m9268i(((Integer) obj).intValue());
            case 8:
                return C1976do.m9242b(((Boolean) obj).booleanValue());
            case 9:
                return C1976do.m9247c((C2043fq) obj);
            case 10:
                if (obj instanceof C2018es) {
                    return C1976do.m9227a((C2023ex) (C2018es) obj);
                }
                return C1976do.m9239b((C2043fq) obj);
            case 11:
                if (obj instanceof C1958cx) {
                    return C1976do.m9238b((C1958cx) obj);
                }
                return C1976do.m9241b((String) obj);
            case 12:
                if (obj instanceof C1958cx) {
                    return C1976do.m9238b((C1958cx) obj);
                }
                return C1976do.m9243b((byte[]) obj);
            case 13:
                return C1976do.m9260g(((Integer) obj).intValue());
            case 14:
                return C1976do.m9271j(((Integer) obj).intValue());
            case 15:
                return C1976do.m9267h(((Long) obj).longValue());
            case 16:
                return C1976do.m9264h(((Integer) obj).intValue());
            case 17:
                return C1976do.m9259f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C2011el) {
                    return C1976do.m9273k(((C2011el) obj).mo13496a());
                }
                return C1976do.m9273k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m9490b(C1996eb<?> ebVar, Object obj) {
        C2099ho b = ebVar.mo13801b();
        int a = ebVar.mo13798a();
        if (!ebVar.mo13803d()) {
            return m9482a(b, a, obj);
        }
        int i = 0;
        if (ebVar.mo13804e()) {
            for (Object b2 : (List) obj) {
                i += m9491b(b, b2);
            }
            return C1976do.m9253e(a) + i + C1976do.m9275l(i);
        }
        for (Object a2 : (List) obj) {
            i += m9482a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        C1993dz dzVar = new C1993dz();
        for (int i = 0; i < this.f7648a.mo13946c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f7648a.mo13944b(i);
            dzVar.m9487a((C1996eb) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f7648a.mo13949d()) {
            dzVar.m9487a((C1996eb) next.getKey(), next.getValue());
        }
        dzVar.f7650c = this.f7650c;
        return dzVar;
    }
}
