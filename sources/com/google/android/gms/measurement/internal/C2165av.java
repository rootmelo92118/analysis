package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.av */
final class C2165av extends Thread {

    /* renamed from: a */
    private final Object f8121a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C2164au<?>> f8122b;

    /* renamed from: c */
    private final /* synthetic */ C2161ar f8123c;

    public C2165av(C2161ar arVar, String str, BlockingQueue<C2164au<?>> blockingQueue) {
        this.f8123c = arVar;
        C0926p.m1306a(str);
        C0926p.m1306a(blockingQueue);
        this.f8122b = blockingQueue;
        setName(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.f8123c.f8112g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f8123c.f8113h.release();
        r6.f8123c.f8112g.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.f8123c.f8106a) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        com.google.android.gms.measurement.internal.C2165av unused = r6.f8123c.f8106a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.f8123c.f8107b) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        com.google.android.gms.measurement.internal.C2165av unused = r6.f8123c.f8107b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.f8123c.mo14235r().mo14830d_().mo14841a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.ar r1 = r6.f8123c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f8113h     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m10524a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b7 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b7 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.au<?>> r2 = r6.f8122b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.measurement.internal.au r2 = (com.google.android.gms.measurement.internal.C2164au) r2     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f8117a     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b7 }
            r2.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f8121a     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.au<?>> r3 = r6.f8122b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00b4 }
            boolean r3 = r3.f8114i     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = r6.f8121a     // Catch:{ InterruptedException -> 0x0050 }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6.m10524a(r3)     // Catch:{ all -> 0x00b4 }
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.f8112g     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.au<?>> r3 = r6.f8122b     // Catch:{ all -> 0x00b1 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x00ae
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.ar r1 = r6.f8123c
            java.lang.Object r1 = r1.f8112g
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            java.util.concurrent.Semaphore r2 = r2.f8113h     // Catch:{ all -> 0x00ab }
            r2.release()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r2.f8112g     // Catch:{ all -> 0x00ab }
            r2.notifyAll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.av r2 = r2.f8106a     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x008c
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.C2165av unused = r2.f8106a = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x008c:
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.av r2 = r2.f8107b     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x009a
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.C2165av unused = r2.f8107b = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x009a:
            com.google.android.gms.measurement.internal.ar r0 = r6.f8123c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo14841a(r2)     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x001c
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            com.google.android.gms.measurement.internal.ar r2 = r6.f8123c
            java.lang.Object r2 = r2.f8112g
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            java.util.concurrent.Semaphore r3 = r3.f8113h     // Catch:{ all -> 0x00fe }
            r3.release()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.f8112g     // Catch:{ all -> 0x00fe }
            r3.notifyAll()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.av r3 = r3.f8106a     // Catch:{ all -> 0x00fe }
            if (r6 == r3) goto L_0x00f7
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.av r3 = r3.f8107b     // Catch:{ all -> 0x00fe }
            if (r6 != r3) goto L_0x00e7
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.C2165av unused = r3.f8107b = null     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00e7:
            com.google.android.gms.measurement.internal.ar r0 = r6.f8123c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo14841a(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00f7:
            com.google.android.gms.measurement.internal.ar r3 = r6.f8123c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.C2165av unused = r3.f8106a = null     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2165av.run():void");
    }

    /* renamed from: a */
    public final void mo14303a() {
        synchronized (this.f8121a) {
            this.f8121a.notifyAll();
        }
    }

    /* renamed from: a */
    private final void m10524a(InterruptedException interruptedException) {
        this.f8123c.mo14235r().mo14833i().mo14842a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
