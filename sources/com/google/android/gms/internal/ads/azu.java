package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

final class azu implements Handler.Callback, bft, bfv, biz {

    /* renamed from: A */
    private int f3204A;

    /* renamed from: B */
    private azx f3205B;

    /* renamed from: C */
    private long f3206C;

    /* renamed from: D */
    private azv f3207D;

    /* renamed from: E */
    private azv f3208E;

    /* renamed from: F */
    private azv f3209F;

    /* renamed from: G */
    private baj f3210G;

    /* renamed from: a */
    private final baf[] f3211a;

    /* renamed from: b */
    private final bah[] f3212b;

    /* renamed from: c */
    private final biy f3213c;

    /* renamed from: d */
    private final bac f3214d;

    /* renamed from: e */
    private final bkl f3215e;

    /* renamed from: f */
    private final Handler f3216f;

    /* renamed from: g */
    private final HandlerThread f3217g;

    /* renamed from: h */
    private final Handler f3218h;

    /* renamed from: i */
    private final azn f3219i;

    /* renamed from: j */
    private final bam f3220j;

    /* renamed from: k */
    private final bal f3221k;

    /* renamed from: l */
    private azw f3222l;

    /* renamed from: m */
    private bae f3223m;

    /* renamed from: n */
    private baf f3224n;

    /* renamed from: o */
    private bkc f3225o;

    /* renamed from: p */
    private bfu f3226p;

    /* renamed from: q */
    private baf[] f3227q;

    /* renamed from: r */
    private boolean f3228r;

    /* renamed from: s */
    private boolean f3229s;

    /* renamed from: t */
    private boolean f3230t;

    /* renamed from: u */
    private boolean f3231u;

    /* renamed from: v */
    private int f3232v;

    /* renamed from: w */
    private int f3233w = 0;

    /* renamed from: x */
    private int f3234x;

    /* renamed from: y */
    private int f3235y;

    /* renamed from: z */
    private long f3236z;

    public azu(baf[] bafArr, biy biy, bac bac, boolean z, int i, Handler handler, azw azw, azn azn) {
        this.f3211a = bafArr;
        this.f3213c = biy;
        this.f3214d = bac;
        this.f3229s = z;
        this.f3218h = handler;
        this.f3232v = 1;
        this.f3222l = azw;
        this.f3219i = azn;
        this.f3212b = new bah[bafArr.length];
        for (int i2 = 0; i2 < bafArr.length; i2++) {
            bafArr[i2].mo11446a(i2);
            this.f3212b[i2] = bafArr[i2].mo11454b();
        }
        this.f3215e = new bkl();
        this.f3227q = new baf[0];
        this.f3220j = new bam();
        this.f3221k = new bal();
        biy.mo12000a((biz) this);
        this.f3223m = bae.f3272a;
        this.f3217g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f3217g.start();
        this.f3216f = new Handler(this.f3217g.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo11494a(bfu bfu, boolean z) {
        this.f3216f.obtainMessage(0, 1, 0, bfu).sendToTarget();
    }

    /* renamed from: a */
    public final void mo11496a(boolean z) {
        this.f3216f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo11491a(baj baj, int i, long j) {
        this.f3216f.obtainMessage(3, new azx(baj, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo11490a() {
        this.f3216f.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo11497a(azq... azqArr) {
        if (this.f3228r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f3234x++;
        this.f3216f.obtainMessage(11, azqArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11499b(com.google.android.gms.internal.ads.azq... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f3228r     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f3234x     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f3234x = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f3216f     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f3235y     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azu.mo11499b(com.google.android.gms.internal.ads.azq[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11498b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f3228r     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f3216f     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f3228r     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f3217g     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azu.mo11498b():void");
    }

    /* renamed from: a */
    public final void mo11492a(baj baj, Object obj) {
        this.f3216f.obtainMessage(7, Pair.create(baj, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo11493a(bfs bfs) {
        this.f3216f.obtainMessage(8, bfs).sendToTarget();
    }

    /* renamed from: c */
    public final void mo11500c() {
        this.f3216f.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:499:0x08c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x08c2, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f3218h.obtainMessage(8, com.google.android.gms.internal.ads.azm.m4560a(r1)).sendToTarget();
        m4624g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08dc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08de, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x08fa, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0290 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0293 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0297 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0359 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x036d A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x053b A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0542 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x055d A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0560 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x059b A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05af A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x05cb A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }, LOOP:8: B:323:0x05cb->B:327:0x05dd, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x072d A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x07e7 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x08c1 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r37) {
        /*
            r36 = this;
            r8 = r36
            r1 = r37
            r10 = 1
            int r2 = r1.what     // Catch:{ azm -> 0x08f9, IOException -> 0x08dd, RuntimeException -> 0x08c1 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0880;
                case 1: goto L_0x0853;
                case 2: goto L_0x0465;
                case 3: goto L_0x03b6;
                case 4: goto L_0x0395;
                case 5: goto L_0x0391;
                case 6: goto L_0x037a;
                case 7: goto L_0x021c;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01d3;
                case 10: goto L_0x00dd;
                case 11: goto L_0x009f;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3233w = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0026:
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.azv r4 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != r4) goto L_0x0037
            r4 = r3
            r3 = r2
            r2 = 1
            goto L_0x003a
        L_0x0037:
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x003a:
            com.google.android.gms.internal.ads.baj r11 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r12 = r3.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r13 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bam r14 = r8.f3220j     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r11 = r11.mo11524a((int) r12, (com.google.android.gms.internal.ads.bal) r13, (com.google.android.gms.internal.ads.bam) r14, (int) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r12 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == 0) goto L_0x0065
            if (r11 == r5) goto L_0x0065
            com.google.android.gms.internal.ads.azv r12 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r12 = r12.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 != r11) goto L_0x0065
            com.google.android.gms.internal.ads.azv r3 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r11 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != r11) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r4 = r4 | r11
            com.google.android.gms.internal.ads.azv r11 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != r11) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0065:
            com.google.android.gms.internal.ads.azv r5 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r5 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.azv r5 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            m4609a((com.google.android.gms.internal.ads.azv) r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.f3247k = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0070:
            int r5 = r3.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r5 = r8.m4618b((int) r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.f3244h = r5     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x007c
            r8.f3207D = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x007c:
            if (r4 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r8.m4603a((int) r2, (long) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r5 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5.<init>(r2, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r5     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0095:
            int r2 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != r15) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r8.m4606a((int) r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x009e:
            return r10
        L_0x009f:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azq[] r1 = (com.google.android.gms.internal.ads.azq[]) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r1.length     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            if (r9 >= r2) goto L_0x00b4
            r3 = r1[r9]     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.azp r4 = r3.f3176a     // Catch:{ all -> 0x00cc }
            int r5 = r3.f3177b     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.f3178c     // Catch:{ all -> 0x00cc }
            r4.mo11447a(r5, r3)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b4:
            com.google.android.gms.internal.ads.bfu r1 = r8.f3226p     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00bd
            android.os.Handler r1 = r8.f3216f     // Catch:{ all -> 0x00cc }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00cc }
        L_0x00bd:
            monitor-enter(r36)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r8.f3235y     // Catch:{ all -> 0x00c8 }
            int r1 = r1 + r10
            r8.f3235y = r1     // Catch:{ all -> 0x00c8 }
            r36.notifyAll()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r36)     // Catch:{ all -> 0x00c8 }
            return r10
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x00cc:
            r0 = move-exception
            r1 = r0
            monitor-enter(r36)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r8.f3235y     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r10
            r8.f3235y = r2     // Catch:{ all -> 0x00d9 }
            r36.notifyAll()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r36)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x00dd:
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x01d2
            boolean r3 = r1.f3245i     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != 0) goto L_0x00ec
            goto L_0x01d2
        L_0x00ec:
            boolean r3 = r1.mo11507c()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != 0) goto L_0x00fa
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != r3) goto L_0x00f7
            r2 = 0
        L_0x00f7:
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x00e4
        L_0x00fa:
            if (r2 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.azv r2 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == r3) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            m4609a((com.google.android.gms.internal.ads.azv) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.f3247k = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3207D = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3208E = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baf[] r3 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r3 = r3.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean[] r3 = new boolean[r3]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r4 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r5 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r5.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r4 = r4.mo11504a(r11, r2, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r2.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.f3258c = r4     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4607a((long) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0136:
            com.google.android.gms.internal.ads.baf[] r2 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean[] r2 = new boolean[r2]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r4 = 0
            r5 = 0
        L_0x013d:
            com.google.android.gms.internal.ads.baf[] r11 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r11 = r11.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r4 >= r11) goto L_0x0189
            com.google.android.gms.internal.ads.baf[] r11 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11 = r11[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r12 = r11.mo11457d()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            r2[r4] = r12     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r12 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bgb[] r12 = r12.f3240d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r12 = r12[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == 0) goto L_0x015b
            int r5 = r5 + 1
        L_0x015b:
            boolean r13 = r2[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.bgb r13 = r11.mo11459f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == r13) goto L_0x017d
            com.google.android.gms.internal.ads.baf r13 = r8.f3224n     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r11 != r13) goto L_0x0176
            if (r12 != 0) goto L_0x0172
            com.google.android.gms.internal.ads.bkl r12 = r8.f3215e     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bkc r13 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r12.mo12078a((com.google.android.gms.internal.ads.bkc) r13)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0172:
            r8.f3225o = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3224n = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0176:
            m4610a((com.google.android.gms.internal.ads.baf) r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11.mo11465l()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0186
        L_0x017d:
            boolean r12 = r3[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == 0) goto L_0x0186
            long r12 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11.mo11448a((long) r12)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0189:
            android.os.Handler r3 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bja r1 = r1.f3248l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4612a((boolean[]) r2, (int) r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x01c7
        L_0x0198:
            r8.f3207D = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x019e:
            if (r1 == 0) goto L_0x01a6
            r1.mo11508d()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x019e
        L_0x01a6:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.f3247k = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r1 = r1.f3245i     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r1 = r1.f3243g     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r4 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r3.mo11502a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3 = 0
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.mo11503a((long) r1, (boolean) r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x01c7:
            r36.m4626i()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4623f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r1 = r8.f3216f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendEmptyMessage(r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x01d2:
            return r10
        L_0x01d3:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r1 = (com.google.android.gms.internal.ads.bfs) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x01e5
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r2 = r2.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == r1) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r36.m4626i()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x01e5:
            return r10
        L_0x01e6:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r1 = (com.google.android.gms.internal.ads.bfs) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x021b
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r2 = r2.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == r1) goto L_0x01f5
            goto L_0x021b
        L_0x01f5:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.f3245i = r10     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11507c()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r1.f3243g     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r1.mo11503a((long) r2, (boolean) r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.f3243g = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3208E = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r1 = r1.f3243g     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4607a((long) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4615b((com.google.android.gms.internal.ads.azv) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0218:
            r36.m4626i()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x021b:
            return r10
        L_0x021c:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r3 = r1.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r3 = (com.google.android.gms.internal.ads.baj) r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3210G = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r1 = r1.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x028b
            int r3 = r8.f3204A     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 <= 0) goto L_0x025b
            com.google.android.gms.internal.ads.azx r3 = r8.f3205B     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.util.Pair r3 = r8.m4604a((com.google.android.gms.internal.ads.azx) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r4 = r8.f3204A     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3204A = r9     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3205B = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != 0) goto L_0x0243
            r8.m4611a((java.lang.Object) r1, (int) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0379
        L_0x0243:
            com.google.android.gms.internal.ads.azw r7 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r11 = r3.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r11 = r11.intValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r3 = r3.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r14 = r3.longValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r7.<init>(r11, r14)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r7     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x028c
        L_0x025b:
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.f3257b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x028b
            com.google.android.gms.internal.ads.baj r3 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r3 = r3.mo11528a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 == 0) goto L_0x0270
            r8.m4611a((java.lang.Object) r1, (int) r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0379
        L_0x0270:
            android.util.Pair r3 = r8.m4613b((int) r9, (long) r12)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r4 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r7 = r3.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = r7.intValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r3 = r3.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r14 = r3.longValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r4.<init>(r7, r14)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r4     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x028b:
            r4 = 0
        L_0x028c:
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 == 0) goto L_0x0293
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0295
        L_0x0293:
            com.google.android.gms.internal.ads.azv r3 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0295:
            if (r3 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.baj r7 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r11 = r3.f3238b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = r7.mo11525a(r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 != r5) goto L_0x02f9
            int r6 = r3.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r7 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r8.m4602a((int) r6, (com.google.android.gms.internal.ads.baj) r2, (com.google.android.gms.internal.ads.baj) r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != r5) goto L_0x02b0
            r8.m4611a((java.lang.Object) r1, (int) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0379
        L_0x02b0:
            com.google.android.gms.internal.ads.baj r6 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r6.mo11526a(r2, r7, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.util.Pair r2 = r8.m4613b((int) r9, (long) r12)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r6 = r2.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r6 = r6.intValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r2 = r2.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r2.longValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.mo11526a(r6, r7, r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r2 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r2 = r2.f3279a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.f3242f = r5     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x02d8:
            com.google.android.gms.internal.ads.azv r7 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == 0) goto L_0x02ec
            com.google.android.gms.internal.ads.azv r3 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r7 = r3.f3238b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r7 = r7.equals(r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == 0) goto L_0x02e8
            r7 = r6
            goto L_0x02e9
        L_0x02e8:
            r7 = -1
        L_0x02e9:
            r3.f3242f = r7     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x02d8
        L_0x02ec:
            long r2 = r8.m4603a((int) r6, (long) r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r5 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5.<init>(r6, r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r5     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0376
        L_0x02f9:
            boolean r2 = r8.m4618b((int) r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.mo11505a((int) r7, (boolean) r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 != r2) goto L_0x0306
            r2 = 1
            goto L_0x0307
        L_0x0306:
            r2 = 0
        L_0x0307:
            com.google.android.gms.internal.ads.azw r11 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r11 = r11.f3256a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == r11) goto L_0x0320
            com.google.android.gms.internal.ads.azw r11 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r12 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r13 = r11.f3257b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r12.<init>(r7, r13)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r13 = r11.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r12.f3258c = r13     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r13 = r11.f3259d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r12.f3259d = r13     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r12     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0320:
            com.google.android.gms.internal.ads.azv r11 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r11 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.azv r11 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r12 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r13 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bam r14 = r8.f3220j     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r15 = r8.f3233w     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = r12.mo11524a((int) r7, (com.google.android.gms.internal.ads.bal) r13, (com.google.android.gms.internal.ads.bam) r14, (int) r15)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == r5) goto L_0x0357
            java.lang.Object r12 = r11.f3238b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r13 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r14 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r13 = r13.mo11526a(r7, r14, r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r13 = r13.f3279a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r12 = r12.equals(r13)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r12 == 0) goto L_0x0357
            boolean r3 = r8.m4618b((int) r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11.mo11505a((int) r7, (boolean) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r11 != r3) goto L_0x0353
            r3 = 1
            goto L_0x0354
        L_0x0353:
            r3 = 0
        L_0x0354:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0320
        L_0x0357:
            if (r2 != 0) goto L_0x036d
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r5 = r3.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r5 = r8.m4603a((int) r2, (long) r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r3 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.<init>(r2, r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0376
        L_0x036d:
            r8.f3207D = r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.f3247k = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            m4609a((com.google.android.gms.internal.ads.azv) r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0376:
            r8.m4616b((java.lang.Object) r1, (int) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0379:
            return r10
        L_0x037a:
            r8.m4620c(r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bac r1 = r8.f3214d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo10223c()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4606a((int) r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            monitor-enter(r36)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3228r = r10     // Catch:{ all -> 0x038d }
            r36.notifyAll()     // Catch:{ all -> 0x038d }
            monitor-exit(r36)     // Catch:{ all -> 0x038d }
            return r10
        L_0x038d:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x038d }
            throw r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0391:
            r36.m4624g()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            return r10
        L_0x0395:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bae r1 = (com.google.android.gms.internal.ads.bae) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bkc r2 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.bkc r2 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bae r1 = r2.mo11624a(r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x03aa
        L_0x03a4:
            com.google.android.gms.internal.ads.bkl r2 = r8.f3215e     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bae r1 = r2.mo11624a((com.google.android.gms.internal.ads.bae) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x03aa:
            r8.f3223m = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r2 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            return r10
        L_0x03b6:
            java.lang.Object r1 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azx r1 = (com.google.android.gms.internal.ads.azx) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x03c7
            int r2 = r8.f3204A     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2 + r10
            r8.f3204A = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3205B = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x044f
        L_0x03c7:
            android.util.Pair r2 = r8.m4604a((com.google.android.gms.internal.ads.azx) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x03ed
            com.google.android.gms.internal.ads.azw r1 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.<init>(r9, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r1 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r1.obtainMessage(r15, r10, r9, r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r1 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.<init>(r9, r12)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4606a((int) r15)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4620c(r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x044f
        L_0x03ed:
            long r3 = r1.f3262c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03f5
            r1 = 1
            goto L_0x03f6
        L_0x03f5:
            r1 = 0
        L_0x03f6:
            java.lang.Object r3 = r2.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r3 = r3.intValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r2 = r2.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r4 = r2.longValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ all -> 0x0450 }
            int r2 = r2.f3256a     // Catch:{ all -> 0x0450 }
            if (r3 != r2) goto L_0x042c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ all -> 0x0450 }
            long r13 = r2.f3258c     // Catch:{ all -> 0x0450 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x042c
            com.google.android.gms.internal.ads.azw r2 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.<init>(r3, r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r2 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x044f
        L_0x042c:
            long r6 = r8.m4603a((int) r3, (long) r4)     // Catch:{ all -> 0x0450 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0436
            r2 = 1
            goto L_0x0437
        L_0x0436:
            r2 = 0
        L_0x0437:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.azw r2 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.<init>(r3, r6)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r2 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x0445
            r1 = 1
            goto L_0x0446
        L_0x0445:
            r1 = 0
        L_0x0446:
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x044f:
            return r10
        L_0x0450:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.azw r6 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r6.<init>(r3, r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r6     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r3 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r4 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            throw r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0465:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r1 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != 0) goto L_0x0475
            com.google.android.gms.internal.ads.bfu r1 = r8.f3226p     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11846a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r14 = r5
            goto L_0x06de
        L_0x0475:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != 0) goto L_0x047e
            com.google.android.gms.internal.ads.azw r1 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r1.f3256a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x04bc
        L_0x047e:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r1.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r2 = r2.f3244h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x04c9
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r2 = r2.mo11506b()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x04c9
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r2 = r2.mo11526a(r1, r7, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r14 = r2.f3281c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x049f
            goto L_0x04c9
        L_0x049f:
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x04b0
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3239c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r7 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = r7.f3239c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04c9
        L_0x04b0:
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bam r14 = r8.f3220j     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r15 = r8.f3233w     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r2.mo11524a((int) r1, (com.google.android.gms.internal.ads.bal) r7, (com.google.android.gms.internal.ads.bam) r14, (int) r15)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x04bc:
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.mo11530c()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 < r2) goto L_0x04cc
            com.google.android.gms.internal.ads.bfu r1 = r8.f3226p     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11846a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x04c9:
            r14 = r5
            goto L_0x05ab
        L_0x04cc:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x04d6
            com.google.android.gms.internal.ads.azw r2 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r2.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x04d4:
            r14 = r5
            goto L_0x0537
        L_0x04d6:
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.mo11526a(r1, r7, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bam r7 = r8.f3220j     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r2
            r18 = r7
            r16.mo11527a((int) r17, (com.google.android.gms.internal.ads.bam) r18, (boolean) r19, (long) r20)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x04f1
            goto L_0x04d4
        L_0x04f1:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r1 = r1.mo11502a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r7 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r14 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r14 = r14.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r15 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r7 = r7.mo11526a(r14, r15, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r14 = r7.f3281c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r7 = 0
            long r1 = r1 + r14
            long r14 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r7 = 0
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.baj r7 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1 = r36
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.m4605a(r2, r3, r4, r6)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x05ab
            java.lang.Object r2 = r1.first     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.intValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r1 = r1.second     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r1.longValue()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1 = r2
        L_0x0537:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x0542
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x053f:
            r25 = r5
            goto L_0x0559
        L_0x0542:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r5 = r2.mo11502a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r7 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r7 = r7.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r11 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r2 = r2.mo11526a(r7, r11, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r12 = r2.f3281c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 0
            long r5 = r5 + r12
            goto L_0x053f
        L_0x0559:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x0560
            r31 = 0
            goto L_0x0567
        L_0x0560:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3239c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2 + r10
            r31 = r2
        L_0x0567:
            boolean r33 = r8.m4618b((int) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r5 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.mo11526a(r1, r5, r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = new com.google.android.gms.internal.ads.azv     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baf[] r5 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bah[] r6 = r8.f3212b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.biy r7 = r8.f3213c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bac r11 = r8.f3214d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfu r12 = r8.f3226p     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r13 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            java.lang.Object r13 = r13.f3279a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r22 = r2
            r23 = r5
            r24 = r6
            r27 = r7
            r28 = r11
            r29 = r12
            r30 = r13
            r32 = r1
            r34 = r3
            r22.<init>(r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x059f
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.f3247k = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x059f:
            r8.f3207D = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r1 = r1.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11822a(r8, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4617b((boolean) r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x05ab:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x05c4
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r1 = r1.mo11506b()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x05b8
            goto L_0x05c4
        L_0x05b8:
            com.google.android.gms.internal.ads.azv r1 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x05c7
            boolean r1 = r8.f3231u     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != 0) goto L_0x05c7
            r36.m4626i()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x05c7
        L_0x05c4:
            r8.m4617b((boolean) r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x05c7:
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x06de
        L_0x05cb:
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == r2) goto L_0x0608
            long r1 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r3.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.f3241e     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0608
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11508d()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4615b((com.google.android.gms.internal.ads.azv) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r1 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.f3243g     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.<init>(r2, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4623f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r1 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 5
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x05cb
        L_0x0608:
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r1 = r1.f3244h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x0632
            r1 = 0
        L_0x060f:
            com.google.android.gms.internal.ads.baf[] r2 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 >= r2) goto L_0x06de
            com.google.android.gms.internal.ads.baf[] r2 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = r2[r1]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bgb[] r3 = r3.f3240d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3 = r3[r1]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 == 0) goto L_0x062f
            com.google.android.gms.internal.ads.bgb r4 = r2.mo11459f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r4 != r3) goto L_0x062f
            boolean r3 = r2.mo11460g()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 == 0) goto L_0x062f
            r2.mo11461h()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x062f:
            int r1 = r1 + 1
            goto L_0x060f
        L_0x0632:
            r1 = 0
        L_0x0633:
            com.google.android.gms.internal.ads.baf[] r2 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 >= r2) goto L_0x0655
            com.google.android.gms.internal.ads.baf[] r2 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = r2[r1]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bgb[] r3 = r3.f3240d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3 = r3[r1]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bgb r4 = r2.mo11459f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r4 != r3) goto L_0x06de
            if (r3 == 0) goto L_0x0652
            boolean r2 = r2.mo11460g()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x0652
            goto L_0x06de
        L_0x0652:
            int r1 = r1 + 1
            goto L_0x0633
        L_0x0655:
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x06de
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r1.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r1 = r1.f3245i     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x06de
            com.google.android.gms.internal.ads.azv r1 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bja r1 = r1.f3248l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r2.f3247k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3208E = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bja r2 = r2.f3248l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r3 = r3.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.mo11832e()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0684
            r3 = 1
            goto L_0x0685
        L_0x0684:
            r3 = 0
        L_0x0685:
            r4 = 0
        L_0x0686:
            com.google.android.gms.internal.ads.baf[] r5 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r5 = r5.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r4 >= r5) goto L_0x06de
            com.google.android.gms.internal.ads.baf[] r5 = r8.f3211a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5 = r5[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bix r6 = r1.f4437b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.biv r6 = r6.mo11995a(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r6 == 0) goto L_0x06db
            if (r3 != 0) goto L_0x06d8
            boolean r6 = r5.mo11462i()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r6 != 0) goto L_0x06db
            com.google.android.gms.internal.ads.bix r6 = r2.f4437b     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.biv r6 = r6.mo11995a(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bai[] r7 = r1.f4439d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r7 = r7[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bai[] r11 = r2.f4439d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11 = r11[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r6 == 0) goto L_0x06d8
            boolean r7 = r11.equals(r7)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == 0) goto L_0x06d8
            int r7 = r6.mo11979b()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.zzfs[] r7 = new com.google.android.gms.internal.ads.zzfs[r7]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11 = 0
        L_0x06bc:
            int r12 = r7.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r11 >= r12) goto L_0x06c8
            com.google.android.gms.internal.ads.zzfs r12 = r6.mo11977a((int) r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r7[r11] = r12     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r11 = r11 + 1
            goto L_0x06bc
        L_0x06c8:
            com.google.android.gms.internal.ads.azv r6 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bgb[] r6 = r6.f3240d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r6 = r6[r4]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r11 = r8.f3208E     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r11.mo11502a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5.mo11453a(r7, r6, r11)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x06db
        L_0x06d8:
            r5.mo11461h()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x06db:
            int r4 = r4 + 1
            goto L_0x0686
        L_0x06de:
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 10
            if (r1 != 0) goto L_0x06ec
            r36.m4625h()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4608a((long) r14, (long) r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0852
        L_0x06ec:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.bkn.m5803a(r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4623f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r1 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r1 = r1.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azw r4 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r4 = r4.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.mo11828b(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.baf[] r1 = r8.f3227q     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r4 = r1.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x0705:
            if (r5 >= r4) goto L_0x073c
            r11 = r1[r5]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r12 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r8.f3236z     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r11.mo11518a(r12, r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == 0) goto L_0x071a
            boolean r2 = r11.mo11520u()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x071a
            r7 = 1
            goto L_0x071b
        L_0x071a:
            r7 = 0
        L_0x071b:
            boolean r2 = r11.mo11519t()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x072a
            boolean r2 = r11.mo11520u()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x0728
            goto L_0x072a
        L_0x0728:
            r2 = 0
            goto L_0x072b
        L_0x072a:
            r2 = 1
        L_0x072b:
            if (r2 != 0) goto L_0x0730
            r11.mo11463j()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0730:
            if (r6 == 0) goto L_0x0736
            if (r2 == 0) goto L_0x0736
            r6 = 1
            goto L_0x0737
        L_0x0736:
            r6 = 0
        L_0x0737:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x0705
        L_0x073c:
            if (r6 != 0) goto L_0x0741
            r36.m4625h()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0741:
            com.google.android.gms.internal.ads.bkc r1 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x0766
            com.google.android.gms.internal.ads.bkc r1 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bae r1 = r1.mo11632x()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bae r2 = r8.f3223m     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r2 = r1.equals(r2)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x0766
            r8.f3223m = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bkl r2 = r8.f3215e     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bkc r3 = r8.f3225o     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.mo12078a((com.google.android.gms.internal.ads.bkc) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r2 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendToTarget()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0766:
            com.google.android.gms.internal.ads.baj r1 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r2.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r3 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r1 = r1.mo11526a(r2, r3, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r1 = r1.f3281c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r7 == 0) goto L_0x0797
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0787
            com.google.android.gms.internal.ads.azw r3 = r8.f3222l     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r3 = r3.f3258c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0797
        L_0x0787:
            com.google.android.gms.internal.ads.azv r3 = r8.f3209F     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r3 = r3.f3244h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 == 0) goto L_0x0797
            r3 = 4
            r8.m4606a((int) r3)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4622e()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r4 = 2
            goto L_0x0818
        L_0x0797:
            int r3 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r4 = 2
            if (r3 != r4) goto L_0x07fd
            com.google.android.gms.internal.ads.baf[] r3 = r8.f3227q     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r3 = r3.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 <= 0) goto L_0x07eb
            if (r6 == 0) goto L_0x07e9
            boolean r1 = r8.f3230t     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r2 = r2.f3245i     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 != 0) goto L_0x07b0
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r2.f3243g     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x07b8
        L_0x07b0:
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfs r2 = r2.f3237a     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r2.mo11833f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x07b8:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07d4
            com.google.android.gms.internal.ads.azv r2 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r2 = r2.f3244h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r2 == 0) goto L_0x07c6
            r1 = 1
            goto L_0x07e5
        L_0x07c6:
            com.google.android.gms.internal.ads.baj r2 = r8.f3210G     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r3 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r3 = r3.f3242f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r5 = r8.f3221k     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bal r2 = r2.mo11526a(r3, r5, r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r2 = r2.f3281c     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x07d4:
            com.google.android.gms.internal.ads.bac r5 = r8.f3214d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azv r6 = r8.f3207D     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r11 = r8.f3206C     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            long r6 = r6.mo11502a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r13 = 0
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.mo10220a(r2, r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x07e5:
            if (r1 == 0) goto L_0x07e9
            r1 = 1
            goto L_0x07ef
        L_0x07e9:
            r1 = 0
            goto L_0x07ef
        L_0x07eb:
            boolean r1 = r8.m4619b((long) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x07ef:
            if (r1 == 0) goto L_0x0818
            r1 = 3
            r8.m4606a((int) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            boolean r1 = r8.f3229s     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x0818
            r36.m4621d()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x0818
        L_0x07fd:
            int r3 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5 = 3
            if (r3 != r5) goto L_0x0818
            com.google.android.gms.internal.ads.baf[] r3 = r8.f3227q     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r3 = r3.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r3 <= 0) goto L_0x0808
            goto L_0x080c
        L_0x0808:
            boolean r6 = r8.m4619b((long) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x080c:
            if (r6 != 0) goto L_0x0818
            boolean r1 = r8.f3229s     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3230t = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4606a((int) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4622e()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0818:
            int r1 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != r4) goto L_0x0829
            com.google.android.gms.internal.ads.baf[] r1 = r8.f3227q     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r2 = r1.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x081f:
            if (r9 >= r2) goto L_0x0829
            r3 = r1[r9]     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.mo11463j()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r9 = r9 + 1
            goto L_0x081f
        L_0x0829:
            boolean r1 = r8.f3229s     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x0836
            int r1 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 3
            if (r1 == r2) goto L_0x0833
            goto L_0x0836
        L_0x0833:
            r1 = 10
            goto L_0x083b
        L_0x0836:
            int r1 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != r4) goto L_0x083f
            goto L_0x0833
        L_0x083b:
            r8.m4608a((long) r14, (long) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x084f
        L_0x083f:
            com.google.android.gms.internal.ads.baf[] r1 = r8.f3227q     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r1.length     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x084a
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.m4608a((long) r14, (long) r1)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x084f
        L_0x084a:
            android.os.Handler r1 = r8.f3216f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.removeMessages(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x084f:
            com.google.android.gms.internal.ads.bkn.m5802a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x0852:
            return r10
        L_0x0853:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x085a
            r1 = 1
            goto L_0x085b
        L_0x085a:
            r1 = 0
        L_0x085b:
            r8.f3230t = r9     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3229s = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != 0) goto L_0x0868
            r36.m4622e()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r36.m4623f()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x087f
        L_0x0868:
            int r1 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2 = 3
            if (r1 != r2) goto L_0x0876
            r36.m4621d()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r1 = r8.f3216f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendEmptyMessage(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            goto L_0x087f
        L_0x0876:
            int r1 = r8.f3232v     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 != r4) goto L_0x087f
            android.os.Handler r1 = r8.f3216f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendEmptyMessage(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x087f:
            return r10
        L_0x0880:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bfu r2 = (com.google.android.gms.internal.ads.bfu) r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            int r1 = r1.arg1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x088b
            r1 = 1
            goto L_0x088c
        L_0x088b:
            r1 = 0
        L_0x088c:
            android.os.Handler r3 = r8.f3218h     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.sendEmptyMessage(r9)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4620c(r10)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.bac r3 = r8.f3214d     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r3.mo10216a()     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            if (r1 == 0) goto L_0x08a7
            com.google.android.gms.internal.ads.azw r1 = new com.google.android.gms.internal.ads.azw     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.f3222l = r1     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
        L_0x08a7:
            r8.f3226p = r2     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            com.google.android.gms.internal.ads.azn r1 = r8.f3219i     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r2.mo11847a(r1, r10, r8)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r8.m4606a((int) r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            android.os.Handler r1 = r8.f3216f     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            r1.sendEmptyMessage(r4)     // Catch:{ azm -> 0x08bc, IOException -> 0x08b7, RuntimeException -> 0x08c1 }
            return r10
        L_0x08b7:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08e1
        L_0x08bc:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08fd
        L_0x08c1:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f3218h
            com.google.android.gms.internal.ads.azm r1 = com.google.android.gms.internal.ads.azm.m4560a((java.lang.RuntimeException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r36.m4624g()
            return r10
        L_0x08dd:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08e1:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Source error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f3218h
            com.google.android.gms.internal.ads.azm r1 = com.google.android.gms.internal.ads.azm.m4558a((java.io.IOException) r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r36.m4624g()
            return r10
        L_0x08f9:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08fd:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Renderer error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f3218h
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r36.m4624g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azu.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    private final void m4606a(int i) {
        if (this.f3232v != i) {
            this.f3232v = i;
            this.f3218h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private final void m4617b(boolean z) {
        if (this.f3231u != z) {
            this.f3231u = z;
            this.f3218h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: d */
    private final void m4621d() {
        this.f3230t = false;
        this.f3215e.mo12076a();
        for (baf e : this.f3227q) {
            e.mo11458e();
        }
    }

    /* renamed from: e */
    private final void m4622e() {
        this.f3215e.mo12079b();
        for (baf a : this.f3227q) {
            m4610a(a);
        }
    }

    /* renamed from: f */
    private final void m4623f() {
        long j;
        if (this.f3209F != null) {
            long e = this.f3209F.f3237a.mo11832e();
            if (e != -9223372036854775807L) {
                m4607a(e);
            } else {
                if (this.f3224n == null || this.f3224n.mo11520u()) {
                    this.f3206C = this.f3215e.mo11631w();
                } else {
                    this.f3206C = this.f3225o.mo11631w();
                    this.f3215e.mo12077a(this.f3206C);
                }
                e = this.f3206C - this.f3209F.mo11502a();
            }
            this.f3222l.f3258c = e;
            this.f3236z = SystemClock.elapsedRealtime() * 1000;
            if (this.f3227q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f3209F.f3237a.mo11833f();
            }
            azw azw = this.f3222l;
            if (j == Long.MIN_VALUE) {
                j = this.f3210G.mo11526a(this.f3209F.f3242f, this.f3221k, false).f3281c;
            }
            azw.f3259d = j;
        }
    }

    /* renamed from: a */
    private final void m4608a(long j, long j2) {
        this.f3216f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f3216f.sendEmptyMessage(2);
        } else {
            this.f3216f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    private final long m4603a(int i, long j) {
        azv azv;
        m4622e();
        this.f3230t = false;
        m4606a(2);
        if (this.f3209F == null) {
            if (this.f3207D != null) {
                this.f3207D.mo11508d();
            }
            azv = null;
        } else {
            azv = null;
            for (azv azv2 = this.f3209F; azv2 != null; azv2 = azv2.f3247k) {
                if (azv2.f3242f != i || !azv2.f3245i) {
                    azv2.mo11508d();
                } else {
                    azv = azv2;
                }
            }
        }
        if (!(this.f3209F == azv && this.f3209F == this.f3208E)) {
            for (baf l : this.f3227q) {
                l.mo11465l();
            }
            this.f3227q = new baf[0];
            this.f3225o = null;
            this.f3224n = null;
            this.f3209F = null;
        }
        if (azv != null) {
            azv.f3247k = null;
            this.f3207D = azv;
            this.f3208E = azv;
            m4615b(azv);
            if (this.f3209F.f3246j) {
                j = this.f3209F.f3237a.mo11829c(j);
            }
            m4607a(j);
            m4626i();
        } else {
            this.f3207D = null;
            this.f3208E = null;
            this.f3209F = null;
            m4607a(j);
        }
        this.f3216f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private final void m4607a(long j) {
        long j2;
        if (this.f3209F == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + this.f3209F.mo11502a();
        }
        this.f3206C = j2;
        this.f3215e.mo12077a(this.f3206C);
        for (baf a : this.f3227q) {
            a.mo11448a(this.f3206C);
        }
    }

    /* renamed from: g */
    private final void m4624g() {
        m4620c(true);
        this.f3214d.mo10221b();
        m4606a(1);
    }

    /* renamed from: c */
    private final void m4620c(boolean z) {
        azv azv;
        this.f3216f.removeMessages(2);
        this.f3230t = false;
        this.f3215e.mo12079b();
        this.f3225o = null;
        this.f3224n = null;
        this.f3206C = 60000000;
        for (baf baf : this.f3227q) {
            try {
                m4610a(baf);
                baf.mo11465l();
            } catch (azm | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f3227q = new baf[0];
        if (this.f3209F != null) {
            azv = this.f3209F;
        } else {
            azv = this.f3207D;
        }
        m4609a(azv);
        this.f3207D = null;
        this.f3208E = null;
        this.f3209F = null;
        m4617b(false);
        if (z) {
            if (this.f3226p != null) {
                this.f3226p.mo11849b();
                this.f3226p = null;
            }
            this.f3210G = null;
        }
    }

    /* renamed from: a */
    private static void m4610a(baf baf) {
        if (baf.mo11457d() == 2) {
            baf.mo11464k();
        }
    }

    /* renamed from: b */
    private final boolean m4619b(long j) {
        if (j == -9223372036854775807L || this.f3222l.f3258c < j) {
            return true;
        }
        return this.f3209F.f3247k != null && this.f3209F.f3247k.f3245i;
    }

    /* renamed from: h */
    private final void m4625h() {
        if (this.f3207D != null && !this.f3207D.f3245i) {
            if (this.f3208E == null || this.f3208E.f3247k == this.f3207D) {
                baf[] bafArr = this.f3227q;
                int length = bafArr.length;
                int i = 0;
                while (i < length) {
                    if (bafArr[i].mo11460g()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f3207D.f3237a.mo11830c();
            }
        }
    }

    /* renamed from: a */
    private final void m4611a(Object obj, int i) {
        this.f3222l = new azw(0, 0);
        m4616b(obj, i);
        this.f3222l = new azw(0, -9223372036854775807L);
        m4606a(4);
        m4620c(false);
    }

    /* renamed from: b */
    private final void m4616b(Object obj, int i) {
        this.f3218h.obtainMessage(6, new azy(this.f3210G, obj, this.f3222l, i)).sendToTarget();
    }

    /* renamed from: a */
    private final int m4602a(int i, baj baj, baj baj2) {
        int c = baj.mo11530c();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < c && i3 == -1; i4++) {
            i2 = baj.mo11524a(i2, this.f3221k, this.f3220j, this.f3233w);
            i3 = baj2.mo11525a(baj.mo11526a(i2, this.f3221k, true).f3279a);
        }
        return i3;
    }

    /* renamed from: b */
    private final boolean m4618b(int i) {
        this.f3210G.mo11526a(i, this.f3221k, false);
        if (this.f3210G.mo11527a(0, this.f3220j, false, 0).f3285a || this.f3210G.mo11524a(i, this.f3221k, this.f3220j, this.f3233w) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m4604a(azx azx) {
        baj baj = azx.f3260a;
        if (baj.mo11528a()) {
            baj = this.f3210G;
        }
        try {
            Pair<Integer, Long> b = m4614b(baj, azx.f3261b, azx.f3262c);
            if (this.f3210G == baj) {
                return b;
            }
            int a = this.f3210G.mo11525a(baj.mo11526a(((Integer) b.first).intValue(), this.f3221k, true).f3279a);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), (Long) b.second);
            }
            int a2 = m4602a(((Integer) b.first).intValue(), baj, this.f3210G);
            if (a2 == -1) {
                return null;
            }
            this.f3210G.mo11526a(a2, this.f3221k, false);
            return m4613b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new bab(this.f3210G, azx.f3261b, azx.f3262c);
        }
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m4613b(int i, long j) {
        return m4614b(this.f3210G, i, -9223372036854775807L);
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m4614b(baj baj, int i, long j) {
        return m4605a(baj, i, j, 0);
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m4605a(baj baj, int i, long j, long j2) {
        bjy.m5687a(i, 0, baj.mo11529b());
        baj.mo11527a(i, this.f3220j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f3220j.f3288d;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.f3220j.f3290f + j;
        long j4 = baj.mo11526a(0, this.f3221k, false).f3281c;
        int i2 = 0;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f3220j.f3287c) {
            j3 -= j4;
            i2++;
            j4 = baj.mo11526a(i2, this.f3221k, false).f3281c;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: i */
    private final void m4626i() {
        long j;
        if (!this.f3207D.f3245i) {
            j = 0;
        } else {
            j = this.f3207D.f3237a.mo11813a_();
        }
        if (j == Long.MIN_VALUE) {
            m4617b(false);
            return;
        }
        long a = this.f3206C - this.f3207D.mo11502a();
        boolean a2 = this.f3214d.mo10219a(j - a);
        m4617b(a2);
        if (a2) {
            this.f3207D.f3237a.mo11812a(a);
        }
    }

    /* renamed from: a */
    private static void m4609a(azv azv) {
        while (azv != null) {
            azv.mo11508d();
            azv = azv.f3247k;
        }
    }

    /* renamed from: b */
    private final void m4615b(azv azv) {
        if (this.f3209F != azv) {
            boolean[] zArr = new boolean[this.f3211a.length];
            int i = 0;
            for (int i2 = 0; i2 < this.f3211a.length; i2++) {
                baf baf = this.f3211a[i2];
                zArr[i2] = baf.mo11457d() != 0;
                biv a = azv.f3248l.f4437b.mo11995a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (baf.mo11462i() && baf.mo11459f() == this.f3209F.f3240d[i2]))) {
                    if (baf == this.f3224n) {
                        this.f3215e.mo12078a(this.f3225o);
                        this.f3225o = null;
                        this.f3224n = null;
                    }
                    m4610a(baf);
                    baf.mo11465l();
                }
            }
            this.f3209F = azv;
            this.f3218h.obtainMessage(3, azv.f3248l).sendToTarget();
            m4612a(zArr, i);
        }
    }

    /* renamed from: a */
    private final void m4612a(boolean[] zArr, int i) {
        this.f3227q = new baf[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3211a.length; i3++) {
            baf baf = this.f3211a[i3];
            biv a = this.f3209F.f3248l.f4437b.mo11995a(i3);
            if (a != null) {
                int i4 = i2 + 1;
                this.f3227q[i2] = baf;
                if (baf.mo11457d() == 0) {
                    bai bai = this.f3209F.f3248l.f4439d[i3];
                    boolean z = this.f3229s && this.f3232v == 3;
                    boolean z2 = !zArr[i3] && z;
                    zzfs[] zzfsArr = new zzfs[a.mo11979b()];
                    for (int i5 = 0; i5 < zzfsArr.length; i5++) {
                        zzfsArr[i5] = a.mo11977a(i5);
                    }
                    baf.mo11450a(bai, zzfsArr, this.f3209F.f3240d[i3], this.f3206C, z2, this.f3209F.mo11502a());
                    bkc c = baf.mo11456c();
                    if (c != null) {
                        if (this.f3225o == null) {
                            this.f3225o = c;
                            this.f3224n = baf;
                            this.f3225o.mo11624a(this.f3223m);
                        } else {
                            throw azm.m4560a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        baf.mo11458e();
                    }
                }
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11495a(bgc bgc) {
        this.f3216f.obtainMessage(9, (bfs) bgc).sendToTarget();
    }
}
