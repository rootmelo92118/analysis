package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.p034v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class aii implements C0892c.C0893a, C0892c.C0894b {

    /* renamed from: a */
    private aij f1839a;

    /* renamed from: b */
    private final String f1840b;

    /* renamed from: c */
    private final String f1841c;

    /* renamed from: d */
    private final LinkedBlockingQueue<akd> f1842d;

    /* renamed from: e */
    private final HandlerThread f1843e = new HandlerThread("GassClient");

    public aii(Context context, String str, String str2) {
        this.f1840b = str;
        this.f1841c = str2;
        this.f1843e.start();
        this.f1839a = new aij(context, this.f1843e.getLooper(), this, this);
        this.f1842d = new LinkedBlockingQueue<>();
        this.f1839a.checkAvailabilityAndConnect();
    }

    /* renamed from: b */
    public final akd mo10581b(int i) {
        akd akd;
        try {
            akd = this.f1842d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            akd = null;
        }
        return akd == null ? m2364c() : akd;
    }

    /* renamed from: a */
    private final aim m2362a() {
        try {
            return this.f1839a.mo10582a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9868a(int i) {
        try {
            this.f1842d.put(m2364c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        m2363b();
        r3.f1843e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f1842d.put(m2364c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        m2363b();
        r3.f1843e.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[ExcHandler: all (r4v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9869a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.aim r4 = r3.m2362a()
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzbjg r0 = new com.google.android.gms.internal.ads.zzbjg     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f1840b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f1841c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbji r4 = r4.mo10587a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.akd r4 = r4.mo13402a()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.akd> r0 = r3.f1842d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r3.m2363b()
            android.os.HandlerThread r4 = r3.f1843e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.akd> r4 = r3.f1842d     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            com.google.android.gms.internal.ads.akd r0 = m2364c()     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            goto L_0x003a
        L_0x0031:
            r3.m2363b()
            android.os.HandlerThread r0 = r3.f1843e
            r0.quit()
            throw r4
        L_0x003a:
            r3.m2363b()
            android.os.HandlerThread r4 = r3.f1843e
            r4.quit()
            return
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aii.mo9869a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo9870a(ConnectionResult connectionResult) {
        try {
            this.f1842d.put(m2364c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    private final void m2363b() {
        if (this.f1839a == null) {
            return;
        }
        if (this.f1839a.isConnected() || this.f1839a.isConnecting()) {
            this.f1839a.disconnect();
        }
    }

    /* renamed from: c */
    private static akd m2364c() {
        akd akd = new akd();
        akd.f1936k = Long.valueOf(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return akd;
    }
}
