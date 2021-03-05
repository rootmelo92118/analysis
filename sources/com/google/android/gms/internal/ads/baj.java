package com.google.android.gms.internal.ads;

public abstract class baj {

    /* renamed from: a */
    public static final baj f3278a = new bak();

    /* renamed from: a */
    public abstract int mo11525a(Object obj);

    /* renamed from: a */
    public abstract bal mo11526a(int i, bal bal, boolean z);

    /* renamed from: a */
    public abstract bam mo11527a(int i, bam bam, boolean z, long j);

    /* renamed from: b */
    public abstract int mo11529b();

    /* renamed from: c */
    public abstract int mo11530c();

    /* renamed from: a */
    public final boolean mo11528a() {
        return mo11529b() == 0;
    }

    /* renamed from: a */
    private final bam m4678a(int i, bam bam) {
        return mo11527a(i, bam, false, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if ((mo11529b() - 1) == 0) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11524a(int r3, com.google.android.gms.internal.ads.bal r4, com.google.android.gms.internal.ads.bam r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo11526a(r3, r4, r0)
            com.google.android.gms.internal.ads.bam r4 = r2.m4678a(r0, r5)
            int r4 = r4.f3287c
            r1 = 1
            if (r4 != r3) goto L_0x002f
            r3 = -1
            switch(r6) {
                case 0: goto L_0x0020;
                case 1: goto L_0x001e;
                case 2: goto L_0x0017;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0017:
            int r4 = r2.mo11529b()
            int r4 = r4 - r1
            if (r4 != 0) goto L_0x0028
        L_0x001e:
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r4 = r2.mo11529b()
            int r4 = r4 - r1
            if (r4 != 0) goto L_0x0028
            r1 = -1
        L_0x0028:
            if (r1 != r3) goto L_0x002b
            return r3
        L_0x002b:
            r2.m4678a(r1, r5)
            return r0
        L_0x002f:
            int r3 = r3 + r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baj.mo11524a(int, com.google.android.gms.internal.ads.bal, com.google.android.gms.internal.ads.bam, int):int");
    }
}
