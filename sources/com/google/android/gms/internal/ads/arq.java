package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class arq<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final arq f2394b;

    /* renamed from: a */
    private boolean f2395a = true;

    private arq() {
    }

    private arq(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> arq<K, V> m3569a() {
        return f2394b;
    }

    /* renamed from: a */
    public final void mo11068a(arq<K, V> arq) {
        m3570e();
        if (!arq.isEmpty()) {
            putAll(arq);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m3570e();
        super.clear();
    }

    public final V put(K k, V v) {
        m3570e();
        aqp.m3495a(k);
        aqp.m3495a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m3570e();
        for (Object next : map.keySet()) {
            aqp.m3495a(next);
            aqp.m3495a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m3570e();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.arq.equals(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static int m3568a(Object obj) {
        if (obj instanceof byte[]) {
            return aqp.m3501c((byte[]) obj);
        }
        if (!(obj instanceof aqq)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m3568a(entry.getValue()) ^ m3568a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final arq<K, V> mo11069b() {
        return isEmpty() ? new arq<>() : new arq<>(this);
    }

    /* renamed from: c */
    public final void mo11070c() {
        this.f2395a = false;
    }

    /* renamed from: d */
    public final boolean mo11072d() {
        return this.f2395a;
    }

    /* renamed from: e */
    private final void m3570e() {
        if (!this.f2395a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        arq arq = new arq();
        f2394b = arq;
        arq.f2395a = false;
    }
}
