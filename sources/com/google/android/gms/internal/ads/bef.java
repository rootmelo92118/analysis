package com.google.android.gms.internal.ads;

public final class bef implements bcg {

    /* renamed from: a */
    private static final int f3921a = bkp.m5828f("RCC\u0001");

    /* renamed from: b */
    private final zzfs f3922b;

    /* renamed from: c */
    private final bkh f3923c = new bkh(9);

    /* renamed from: d */
    private bcq f3924d;

    /* renamed from: e */
    private int f3925e = 0;

    /* renamed from: f */
    private int f3926f;

    /* renamed from: g */
    private long f3927g;

    /* renamed from: h */
    private int f3928h;

    /* renamed from: i */
    private int f3929i;

    public bef(zzfs zzfs) {
        this.f3922b = zzfs;
    }

    /* renamed from: c */
    public final void mo11687c() {
    }

    /* renamed from: a */
    public final void mo11685a(bcj bcj) {
        bcj.mo11690a(new bcp(-9223372036854775807L));
        this.f3924d = bcj.mo11688a(0, 3);
        bcj.mo11689a();
        this.f3924d.mo11682a(this.f3922b);
    }

    /* renamed from: a */
    public final boolean mo11686a(bci bci) {
        this.f3923c.mo12047a();
        bci.mo11678c(this.f3923c.f4559a, 0, 8);
        if (this.f3923c.mo12065l() == f3921a) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11683a(com.google.android.gms.internal.ads.bci r11, com.google.android.gms.internal.ads.bcn r12) {
        /*
            r10 = this;
        L_0x0000:
            int r12 = r10.f3925e
            r0 = -1
            r1 = 1
            r2 = 0
            switch(r12) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x0044;
                case 2: goto L_0x000e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x000e:
            int r12 = r10.f3928h
            if (r12 <= 0) goto L_0x0031
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            r12.mo12047a()
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            byte[] r12 = r12.f4559a
            r0 = 3
            r11.mo11675b(r12, r2, r0)
            com.google.android.gms.internal.ads.bcq r12 = r10.f3924d
            com.google.android.gms.internal.ads.bkh r3 = r10.f3923c
            r12.mo11681a(r3, r0)
            int r12 = r10.f3929i
            int r12 = r12 + r0
            r10.f3929i = r12
            int r12 = r10.f3928h
            int r12 = r12 - r1
            r10.f3928h = r12
            goto L_0x000e
        L_0x0031:
            int r11 = r10.f3929i
            if (r11 <= 0) goto L_0x0041
            com.google.android.gms.internal.ads.bcq r3 = r10.f3924d
            long r4 = r10.f3927g
            r6 = 1
            int r7 = r10.f3929i
            r8 = 0
            r9 = 0
            r3.mo11680a(r4, r6, r7, r8, r9)
        L_0x0041:
            r10.f3925e = r1
            return r2
        L_0x0044:
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            r12.mo12047a()
            int r12 = r10.f3926f
            if (r12 != 0) goto L_0x006a
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            byte[] r12 = r12.f4559a
            r3 = 5
            boolean r12 = r11.mo11672a(r12, r2, r3, r1)
            if (r12 != 0) goto L_0x005a
        L_0x0058:
            r1 = 0
            goto L_0x008d
        L_0x005a:
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            long r3 = r12.mo12063j()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r5 = 45
            long r3 = r3 / r5
            r10.f3927g = r3
            goto L_0x0083
        L_0x006a:
            int r12 = r10.f3926f
            if (r12 != r1) goto L_0x0097
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            byte[] r12 = r12.f4559a
            r3 = 9
            boolean r12 = r11.mo11672a(r12, r2, r3, r1)
            if (r12 != 0) goto L_0x007b
            goto L_0x0058
        L_0x007b:
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            long r3 = r12.mo12066m()
            r10.f3927g = r3
        L_0x0083:
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            int r12 = r12.mo12059f()
            r10.f3928h = r12
            r10.f3929i = r2
        L_0x008d:
            if (r1 == 0) goto L_0x0094
            r12 = 2
            r10.f3925e = r12
            goto L_0x0000
        L_0x0094:
            r10.f3925e = r2
            return r0
        L_0x0097:
            com.google.android.gms.internal.ads.bad r11 = new com.google.android.gms.internal.ads.bad
            int r12 = r10.f3926f
            r0 = 39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unsupported version number: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.<init>((java.lang.String) r12)
            throw r11
        L_0x00b2:
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            r12.mo12047a()
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            byte[] r12 = r12.f4559a
            r3 = 8
            boolean r12 = r11.mo11672a(r12, r2, r3, r1)
            if (r12 == 0) goto L_0x00df
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            int r12 = r12.mo12065l()
            int r2 = f3921a
            if (r12 != r2) goto L_0x00d7
            com.google.android.gms.internal.ads.bkh r12 = r10.f3923c
            int r12 = r12.mo12059f()
            r10.f3926f = r12
            r2 = 1
            goto L_0x00df
        L_0x00d7:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Input not RawCC"
            r11.<init>(r12)
            throw r11
        L_0x00df:
            if (r2 == 0) goto L_0x00e5
            r10.f3925e = r1
            goto L_0x0000
        L_0x00e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bef.mo11683a(com.google.android.gms.internal.ads.bci, com.google.android.gms.internal.ads.bcn):int");
    }

    /* renamed from: a */
    public final void mo11684a(long j, long j2) {
        this.f3925e = 0;
    }
}
