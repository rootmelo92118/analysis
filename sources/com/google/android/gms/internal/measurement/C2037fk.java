package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.fk */
public final class C2037fk<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C2037fk f7789b;

    /* renamed from: a */
    private boolean f7790a = true;

    private C2037fk() {
    }

    private C2037fk(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> C2037fk<K, V> m9668a() {
        return f7789b;
    }

    /* renamed from: a */
    public final void mo13903a(C2037fk<K, V> fkVar) {
        m9669e();
        if (!fkVar.isEmpty()) {
            putAll(fkVar);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m9669e();
        super.clear();
    }

    public final V put(K k, V v) {
        m9669e();
        C2010ek.m9560a(k);
        C2010ek.m9560a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m9669e();
        for (Object next : map.keySet()) {
            C2010ek.m9560a(next);
            C2010ek.m9560a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m9669e();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2037fk.equals(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static int m9667a(Object obj) {
        if (obj instanceof byte[]) {
            return C2010ek.m9566c((byte[]) obj);
        }
        if (!(obj instanceof C2011el)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m9667a(entry.getValue()) ^ m9667a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final C2037fk<K, V> mo13904b() {
        return isEmpty() ? new C2037fk<>() : new C2037fk<>(this);
    }

    /* renamed from: c */
    public final void mo13905c() {
        this.f7790a = false;
    }

    /* renamed from: d */
    public final boolean mo13907d() {
        return this.f7790a;
    }

    /* renamed from: e */
    private final void m9669e() {
        if (!this.f7790a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C2037fk fkVar = new C2037fk();
        f7789b = fkVar;
        fkVar.f7790a = false;
    }
}
