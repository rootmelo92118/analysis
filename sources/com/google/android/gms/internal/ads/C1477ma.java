package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ma */
final class C1477ma {

    /* renamed from: a */
    long f5708a;

    /* renamed from: b */
    final String f5709b;

    /* renamed from: c */
    final String f5710c;

    /* renamed from: d */
    final long f5711d;

    /* renamed from: e */
    final long f5712e;

    /* renamed from: f */
    final long f5713f;

    /* renamed from: g */
    final long f5714g;

    /* renamed from: h */
    final List<bff> f5715h;

    private C1477ma(String str, String str2, long j, long j2, long j3, long j4, List<bff> list) {
        this.f5709b = str;
        this.f5710c = "".equals(str2) ? null : str2;
        this.f5711d = j;
        this.f5712e = j2;
        this.f5713f = j3;
        this.f5714g = j4;
        this.f5715h = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1477ma(java.lang.String r16, com.google.android.gms.internal.ads.awd r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r3 = r0.f2954b
            long r4 = r0.f2955c
            long r6 = r0.f2956d
            long r8 = r0.f2957e
            long r10 = r0.f2958f
            java.util.List<com.google.android.gms.internal.ads.bff> r1 = r0.f2960h
            if (r1 == 0) goto L_0x0014
            java.util.List<com.google.android.gms.internal.ads.bff> r1 = r0.f2960h
            r12 = r1
            goto L_0x0049
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f2959g
            java.util.ArrayList r2 = new java.util.ArrayList
            int r12 = r1.size()
            r2.<init>(r12)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0048
            java.lang.Object r12 = r1.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            com.google.android.gms.internal.ads.bff r13 = new com.google.android.gms.internal.ads.bff
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r13.<init>(r14, r12)
            r2.add(r13)
            goto L_0x0027
        L_0x0048:
            r12 = r2
        L_0x0049:
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r8, r10, r12)
            byte[] r0 = r0.f2953a
            int r0 = r0.length
            long r0 = (long) r0
            r2 = r15
            r2.f5708a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1477ma.<init>(java.lang.String, com.google.android.gms.internal.ads.awd):void");
    }

    /* renamed from: a */
    static C1477ma m7591a(C1502mz mzVar) {
        if (C1458li.m7405a((InputStream) mzVar) == 538247942) {
            return new C1477ma(C1458li.m7407a(mzVar), C1458li.m7407a(mzVar), C1458li.m7413b((InputStream) mzVar), C1458li.m7413b((InputStream) mzVar), C1458li.m7413b((InputStream) mzVar), C1458li.m7413b((InputStream) mzVar), C1458li.m7414b(mzVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12782a(OutputStream outputStream) {
        try {
            C1458li.m7408a(outputStream, 538247942);
            C1458li.m7410a(outputStream, this.f5709b);
            C1458li.m7410a(outputStream, this.f5710c == null ? "" : this.f5710c);
            C1458li.m7409a(outputStream, this.f5711d);
            C1458li.m7409a(outputStream, this.f5712e);
            C1458li.m7409a(outputStream, this.f5713f);
            C1458li.m7409a(outputStream, this.f5714g);
            List<bff> list = this.f5715h;
            if (list != null) {
                C1458li.m7408a(outputStream, list.size());
                for (bff next : list) {
                    C1458li.m7410a(outputStream, next.mo11807a());
                    C1458li.m7410a(outputStream, next.mo11808b());
                }
            } else {
                C1458li.m7408a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C1264ee.m6817b("%s", e.toString());
            return false;
        }
    }
}
