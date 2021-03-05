package com.google.android.gms.internal.ads;

public final class bil {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5579a(long r16, com.google.android.gms.internal.ads.bkh r18, com.google.android.gms.internal.ads.bcq[] r19) {
        /*
            r0 = r18
            r1 = r19
        L_0x0004:
            int r2 = r18.mo12051b()
            r3 = 1
            if (r2 <= r3) goto L_0x0098
            int r2 = m5578a(r18)
            int r4 = m5578a(r18)
            r5 = -1
            if (r4 == r5) goto L_0x0088
            int r5 = r18.mo12051b()
            if (r4 <= r5) goto L_0x001e
            goto L_0x0088
        L_0x001e:
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 0
            if (r2 != r5) goto L_0x0050
            if (r4 >= r7) goto L_0x0028
            goto L_0x0050
        L_0x0028:
            int r2 = r18.mo12055d()
            int r5 = r18.mo12059f()
            int r9 = r18.mo12060g()
            int r10 = r18.mo12065l()
            int r11 = r18.mo12059f()
            r0.mo12054c(r2)
            r2 = 181(0xb5, float:2.54E-43)
            if (r5 != r2) goto L_0x0050
            r2 = 49
            if (r9 != r2) goto L_0x0050
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r10 != r2) goto L_0x0050
            if (r11 != r6) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 == 0) goto L_0x0083
            r0.mo12056d(r7)
            int r2 = r18.mo12059f()
            r2 = r2 & 31
            r0.mo12056d(r3)
            int r2 = r2 * 3
            int r3 = r18.mo12055d()
            int r5 = r1.length
        L_0x0066:
            if (r8 >= r5) goto L_0x007c
            r9 = r1[r8]
            r0.mo12054c(r3)
            r9.mo11681a(r0, r2)
            r12 = 1
            r14 = 0
            r15 = 0
            r10 = r16
            r13 = r2
            r9.mo11680a(r10, r12, r13, r14, r15)
            int r8 = r8 + 1
            goto L_0x0066
        L_0x007c:
            int r2 = r2 + 10
            int r4 = r4 - r2
            r0.mo12056d(r4)
            goto L_0x0004
        L_0x0083:
            r0.mo12056d(r4)
            goto L_0x0004
        L_0x0088:
            java.lang.String r2 = "CeaUtil"
            java.lang.String r3 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r2, r3)
            int r2 = r18.mo12053c()
            r0.mo12054c(r2)
            goto L_0x0004
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bil.m5579a(long, com.google.android.gms.internal.ads.bkh, com.google.android.gms.internal.ads.bcq[]):void");
    }

    /* renamed from: a */
    private static int m5578a(bkh bkh) {
        int i = 0;
        while (bkh.mo12051b() != 0) {
            int f = bkh.mo12059f();
            i += f;
            if (f != 255) {
                return i;
            }
        }
        return -1;
    }
}
