package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class asc<T> implements aso<T> {

    /* renamed from: a */
    private final arw f2422a;

    /* renamed from: b */
    private final atg<?, ?> f2423b;

    /* renamed from: c */
    private final boolean f2424c;

    /* renamed from: d */
    private final aqa<?> f2425d;

    private asc(atg<?, ?> atg, aqa<?> aqa, arw arw) {
        this.f2423b = atg;
        this.f2424c = aqa.mo10986a(arw);
        this.f2425d = aqa;
        this.f2422a = arw;
    }

    /* renamed from: a */
    static <T> asc<T> m3679a(atg<?, ?> atg, aqa<?> aqa, arw arw) {
        return new asc<>(atg, aqa, arw);
    }

    /* renamed from: a */
    public final T mo11101a() {
        return this.f2422a.mo11022p().mo11029e();
    }

    /* renamed from: a */
    public final boolean mo11105a(T t, T t2) {
        if (!this.f2423b.mo11176b(t).equals(this.f2423b.mo11176b(t2))) {
            return false;
        }
        if (this.f2424c) {
            return this.f2425d.mo10979a((Object) t).equals(this.f2425d.mo10979a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo11100a(T t) {
        int hashCode = this.f2423b.mo11176b(t).hashCode();
        return this.f2424c ? (hashCode * 53) + this.f2425d.mo10979a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo11107b(T t, T t2) {
        asq.m3778a(this.f2423b, t, t2);
        if (this.f2424c) {
            asq.m3776a(this.f2425d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo11103a(T t, auc auc) {
        Iterator<Map.Entry<?, Object>> e = this.f2425d.mo10979a((Object) t).mo10994e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            aqf aqf = (aqf) next.getKey();
            if (aqf.mo11005c() != aub.MESSAGE || aqf.mo11006d() || aqf.mo11007e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof ara) {
                auc.mo10934a(aqf.mo11001a(), (Object) ((ara) next).mo11043a().mo11052c());
            } else {
                auc.mo10934a(aqf.mo11001a(), next.getValue());
            }
        }
        atg<?, ?> atg = this.f2423b;
        atg.mo11178b(atg.mo11176b(t), auc);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11104a(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.aoz r11) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.aqn r7 = (com.google.android.gms.internal.ads.aqn) r7
            com.google.android.gms.internal.ads.ath r0 = r7.zzfpu
            com.google.android.gms.internal.ads.ath r1 = com.google.android.gms.internal.ads.ath.m3874a()
            if (r0 != r1) goto L_0x0010
            com.google.android.gms.internal.ads.ath r0 = com.google.android.gms.internal.ads.ath.m3877b()
            r7.zzfpu = r0
        L_0x0010:
            r7 = r0
        L_0x0011:
            if (r9 >= r10) goto L_0x0069
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r8, r9, r11)
            int r0 = r11.f2155a
            r9 = 11
            r1 = 2
            if (r0 == r9) goto L_0x0030
            r9 = r0 & 7
            if (r9 != r1) goto L_0x002b
            r1 = r8
            r3 = r10
            r4 = r7
            r5 = r11
            int r9 = com.google.android.gms.internal.ads.aoy.m2957a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.ath) r4, (com.google.android.gms.internal.ads.aoz) r5)
            goto L_0x0011
        L_0x002b:
            int r9 = com.google.android.gms.internal.ads.aoy.m2955a(r0, r8, r2, r10, r11)
            goto L_0x0011
        L_0x0030:
            r9 = 0
            r0 = 0
        L_0x0032:
            if (r2 >= r10) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r8, r2, r11)
            int r3 = r11.f2155a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            switch(r4) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0056
        L_0x0042:
            if (r5 != r1) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.aoy.m2968e(r8, r2, r11)
            java.lang.Object r0 = r11.f2157c
            com.google.android.gms.internal.ads.apc r0 = (com.google.android.gms.internal.ads.apc) r0
            goto L_0x0032
        L_0x004d:
            if (r5 != 0) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r8, r2, r11)
            int r9 = r11.f2155a
            goto L_0x0032
        L_0x0056:
            r4 = 12
            if (r3 == r4) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.aoy.m2955a(r3, r8, r2, r10, r11)
            goto L_0x0032
        L_0x005f:
            if (r0 == 0) goto L_0x0067
            int r9 = r9 << 3
            r9 = r9 | r1
            r7.mo11185a((int) r9, (java.lang.Object) r0)
        L_0x0067:
            r9 = r2
            goto L_0x0011
        L_0x0069:
            if (r9 != r10) goto L_0x006c
            return
        L_0x006c:
            com.google.android.gms.internal.ads.aqv r7 = com.google.android.gms.internal.ads.aqv.m3514h()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asc.mo11104a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.aoz):void");
    }

    /* renamed from: a */
    public final void mo11102a(T t, asn asn, apz apz) {
        boolean z;
        atg<?, ?> atg = this.f2423b;
        aqa<?> aqa = this.f2425d;
        Object c = atg.mo11180c(t);
        aqd<?> b = aqa.mo10987b(t);
        do {
            try {
                if (asn.mo10845a() == Integer.MAX_VALUE) {
                    atg.mo11179b((Object) t, c);
                    return;
                }
                int b2 = asn.mo10850b();
                if (b2 == 11) {
                    Object obj = null;
                    apc apc = null;
                    int i = 0;
                    while (asn.mo10845a() != Integer.MAX_VALUE) {
                        int b3 = asn.mo10850b();
                        if (b3 == 16) {
                            i = asn.mo10878o();
                            obj = aqa.mo10980a(apz, this.f2422a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                aqa.mo10983a(asn, obj, apz, b);
                            } else {
                                apc = asn.mo10876n();
                            }
                        } else if (!asn.mo10855c()) {
                            break;
                        }
                    }
                    if (asn.mo10850b() != 12) {
                        throw aqv.m3511e();
                    } else if (apc != null) {
                        if (obj != null) {
                            aqa.mo10982a(apc, obj, apz, b);
                        } else {
                            atg.mo11170a(c, i, apc);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = aqa.mo10980a(apz, this.f2422a, b2 >>> 3);
                    if (a != null) {
                        aqa.mo10983a(asn, a, apz, b);
                    } else {
                        z = atg.mo11175a(c, asn);
                        continue;
                    }
                } else {
                    z = asn.mo10855c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                atg.mo11179b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo11108c(T t) {
        this.f2423b.mo11182d(t);
        this.f2425d.mo10988c(t);
    }

    /* renamed from: d */
    public final boolean mo11109d(T t) {
        return this.f2425d.mo10979a((Object) t).mo10997g();
    }

    /* renamed from: b */
    public final int mo11106b(T t) {
        atg<?, ?> atg = this.f2423b;
        int e = atg.mo11183e(atg.mo11176b(t)) + 0;
        return this.f2424c ? e + this.f2425d.mo10979a((Object) t).mo11000i() : e;
    }
}
