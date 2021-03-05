package com.google.android.gms.internal.ads;

final /* synthetic */ class aaw implements Runnable {

    /* renamed from: a */
    private final abq f1284a;

    /* renamed from: b */
    private final aaq f1285b;

    /* renamed from: c */
    private final abg f1286c;

    aaw(abq abq, aaq aaq, abg abg) {
        this.f1284a = abq;
        this.f1285b = aaq;
        this.f1286c = abg;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.abq r0 = r3.f1284a
            com.google.android.gms.internal.ads.aaq r1 = r3.f1285b
            com.google.android.gms.internal.ads.abg r2 = r3.f1286c
            java.lang.Object r2 = r2.get()     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            java.lang.Object r1 = r1.mo10045a(r2)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            r0.mo10087b(r1)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            r0.mo10086a(r1)
            return
        L_0x0017:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            r0.mo10086a(r1)
            return
        L_0x0023:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.mo10086a(r1)
            return
        L_0x0030:
            r1 = 1
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aaw.run():void");
    }
}
