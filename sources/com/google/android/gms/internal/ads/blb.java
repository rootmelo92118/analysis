package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
public final class blb {

    /* renamed from: a */
    private final blc f4632a;

    /* renamed from: b */
    private final boolean f4633b;

    /* renamed from: c */
    private final long f4634c;

    /* renamed from: d */
    private final long f4635d;

    /* renamed from: e */
    private long f4636e;

    /* renamed from: f */
    private long f4637f;

    /* renamed from: g */
    private long f4638g;

    /* renamed from: h */
    private boolean f4639h;

    /* renamed from: i */
    private long f4640i;

    /* renamed from: j */
    private long f4641j;

    /* renamed from: k */
    private long f4642k;

    public blb() {
        this(-1.0d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public blb(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.blb.<init>(android.content.Context):void");
    }

    private blb(double d) {
        this.f4633b = d != -1.0d;
        if (this.f4633b) {
            this.f4632a = blc.m5876a();
            this.f4634c = (long) (1.0E9d / d);
            this.f4635d = (this.f4634c * 80) / 100;
            return;
        }
        this.f4632a = null;
        this.f4634c = -1;
        this.f4635d = -1;
    }

    /* renamed from: a */
    public final void mo12090a() {
        this.f4639h = false;
        if (this.f4633b) {
            this.f4632a.mo12092b();
        }
    }

    /* renamed from: b */
    public final void mo12091b() {
        if (this.f4633b) {
            this.f4632a.mo12093c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo12089a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f4639h
            if (r2 == 0) goto L_0x0044
            long r2 = r11.f4636e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.f4642k
            r4 = 1
            long r2 = r2 + r4
            r11.f4642k = r2
            long r2 = r11.f4638g
            r11.f4637f = r2
        L_0x0019:
            long r2 = r11.f4642k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            long r2 = r11.f4641j
            long r2 = r0 - r2
            long r4 = r11.f4642k
            long r2 = r2 / r4
            long r4 = r11.f4637f
            long r2 = r2 + r4
            boolean r4 = r11.m5872b(r2, r14)
            if (r4 == 0) goto L_0x0035
            r11.f4639h = r6
            goto L_0x0044
        L_0x0035:
            long r4 = r11.f4640i
            long r4 = r4 + r2
            long r6 = r11.f4641j
            long r4 = r4 - r6
            goto L_0x0046
        L_0x003c:
            boolean r2 = r11.m5872b(r0, r14)
            if (r2 == 0) goto L_0x0044
            r11.f4639h = r6
        L_0x0044:
            r4 = r14
            r2 = r0
        L_0x0046:
            boolean r6 = r11.f4639h
            r7 = 0
            if (r6 != 0) goto L_0x0055
            r11.f4641j = r0
            r11.f4640i = r14
            r11.f4642k = r7
            r14 = 1
            r11.f4639h = r14
        L_0x0055:
            r11.f4636e = r12
            r11.f4638g = r2
            com.google.android.gms.internal.ads.blc r12 = r11.f4632a
            if (r12 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.blc r12 = r11.f4632a
            long r12 = r12.f4644a
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            com.google.android.gms.internal.ads.blc r12 = r11.f4632a
            long r12 = r12.f4644a
            long r14 = r11.f4634c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            long r14 = r12 - r14
            goto L_0x007e
        L_0x0079:
            r0 = 0
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x007e:
            r0 = 0
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r12 = r14
        L_0x0088:
            long r14 = r11.f4635d
            long r12 = r12 - r14
            return r12
        L_0x008c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.blb.mo12089a(long, long):long");
    }

    /* renamed from: b */
    private final boolean m5872b(long j, long j2) {
        return Math.abs((j2 - this.f4640i) - (j - this.f4641j)) > 20000000;
    }
}
