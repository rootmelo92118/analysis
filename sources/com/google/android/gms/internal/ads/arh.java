package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class arh extends arf {

    /* renamed from: a */
    private static final Class<?> f2379a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private arh() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo11059a(Object obj, long j) {
        return m3540a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11061b(Object obj, long j) {
        Object obj2;
        List list = (List) atn.m3944f(obj, j);
        if (list instanceof are) {
            obj2 = ((are) list).mo11056e();
        } else if (!f2379a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof asi) || !(list instanceof aqu)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                aqu aqu = (aqu) list;
                if (aqu.mo10761a()) {
                    aqu.mo10766b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        atn.m3922a(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.ard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.ard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.ard} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m3540a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m3541c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.are
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.ard r0 = new com.google.android.gms.internal.ads.ard
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.asi
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.aqu
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.aqu r0 = (com.google.android.gms.internal.ads.aqu) r0
            com.google.android.gms.internal.ads.aqu r6 = r0.mo10785a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f2379a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.atj
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.ard r1 = new com.google.android.gms.internal.ads.ard
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.atj r0 = (com.google.android.gms.internal.ads.atj) r0
            r1.addAll(r0)
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.asi
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.aqu
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.ads.aqu r1 = (com.google.android.gms.internal.ads.aqu) r1
            boolean r2 = r1.mo10761a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.aqu r0 = r1.mo10785a(r0)
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.arh.m3540a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo11060a(Object obj, Object obj2, long j) {
        List c = m3541c(obj2, j);
        List a = m3540a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        atn.m3922a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m3541c(Object obj, long j) {
        return (List) atn.m3944f(obj, j);
    }
}
