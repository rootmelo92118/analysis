package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jg */
public final class C1402jg {

    /* renamed from: e */
    private static final Comparator<byte[]> f5514e = new C1430kh();

    /* renamed from: a */
    private final List<byte[]> f5515a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f5516b = new ArrayList(64);

    /* renamed from: c */
    private int f5517c = 0;

    /* renamed from: d */
    private final int f5518d = 4096;

    public C1402jg(int i) {
    }

    /* renamed from: a */
    public final synchronized byte[] mo12635a(int i) {
        for (int i2 = 0; i2 < this.f5516b.size(); i2++) {
            byte[] bArr = this.f5516b.get(i2);
            if (bArr.length >= i) {
                this.f5517c -= bArr.length;
                this.f5516b.remove(i2);
                this.f5515a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12634a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f5518d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f5515a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f5516b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f5514e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f5516b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f5517c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f5517c = r0     // Catch:{ all -> 0x002b }
            r2.m7090a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1402jg.mo12634a(byte[]):void");
    }

    /* renamed from: a */
    private final synchronized void m7090a() {
        while (this.f5517c > this.f5518d) {
            byte[] remove = this.f5515a.remove(0);
            this.f5516b.remove(remove);
            this.f5517c -= remove.length;
        }
    }
}
