package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.fc */
final class C2029fc extends C2027fa {

    /* renamed from: a */
    private static final Class<?> f7778a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C2029fc() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo13894a(Object obj, long j) {
        return m9643a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13896b(Object obj, long j) {
        Object obj2;
        List list = (List) C2086hf.m10047f(obj, j);
        if (list instanceof C2025ez) {
            obj2 = ((C2025ez) list).mo13853e();
        } else if (!f7778a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2056gc) || !(list instanceof C2014eo)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C2014eo eoVar = (C2014eo) list;
                if (eoVar.mo13573a()) {
                    eoVar.mo13578b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C2086hf.m10024a(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.ey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.ey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.ey} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m9643a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m9644c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2025ez
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.ey r0 = new com.google.android.gms.internal.measurement.ey
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2056gc
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2014eo
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.eo r0 = (com.google.android.gms.internal.measurement.C2014eo) r0
            com.google.android.gms.internal.measurement.eo r6 = r0.mo13588a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f7778a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2083hc
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.ey r1 = new com.google.android.gms.internal.measurement.ey
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.hc r0 = (com.google.android.gms.internal.measurement.C2083hc) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2056gc
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2014eo
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.eo r1 = (com.google.android.gms.internal.measurement.C2014eo) r1
            boolean r2 = r1.mo13573a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.eo r0 = r1.mo13588a(r0)
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2029fc.m9643a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo13895a(Object obj, Object obj2, long j) {
        List c = m9644c(obj2, j);
        List a = m9643a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C2086hf.m10024a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m9644c(Object obj, long j) {
        return (List) C2086hf.m10047f(obj, j);
    }
}
