package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.stats.C0959a;

/* renamed from: com.google.android.gms.measurement.internal.df */
public final class C2230df implements ServiceConnection, C0892c.C0893a, C0892c.C0894b {

    /* renamed from: a */
    final /* synthetic */ C2217ct f8358a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f8359b;

    /* renamed from: c */
    private volatile C2294q f8360c;

    protected C2230df(C2217ct ctVar) {
        this.f8358a = ctVar;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14466a(Intent intent) {
        this.f8358a.mo14221d();
        Context n = this.f8358a.mo14231n();
        C0959a a = C0959a.m1447a();
        synchronized (this) {
            if (this.f8359b) {
                this.f8358a.mo14235r().mo14838x().mo14841a("Connection attempt already in progress");
                return;
            }
            this.f8358a.mo14235r().mo14838x().mo14841a("Using local app measurement service");
            this.f8359b = true;
            a.mo9988a(n, intent, this.f8358a.f8301a, 129);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14465a() {
        if (this.f8360c != null && (this.f8360c.isConnected() || this.f8360c.isConnecting())) {
            this.f8360c.disconnect();
        }
        this.f8360c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f8358a.mo14235r().mo14830d_().mo14841a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0063 */
    @android.support.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C0926p.m1315b((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f8359b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ct r4 = r3.f8358a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo14841a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x009a
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x0053
            if (r5 != 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0063 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C2286i     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.internal.i r1 = (com.google.android.gms.measurement.internal.C2286i) r1     // Catch:{ RemoteException -> 0x0063 }
        L_0x003b:
            r0 = r1
            goto L_0x0043
        L_0x003d:
            com.google.android.gms.measurement.internal.k r1 = new com.google.android.gms.measurement.internal.k     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x003b
        L_0x0043:
            com.google.android.gms.measurement.internal.ct r5 = r3.f8358a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo14235r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14838x()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo14841a(r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0053:
            com.google.android.gms.measurement.internal.ct r5 = r3.f8358a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo14235r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14830d_()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo14842a(r2, r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0063:
            com.google.android.gms.measurement.internal.ct r5 = r3.f8358a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r5 = r5.mo14235r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14830d_()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo14841a(r1)     // Catch:{ all -> 0x001c }
        L_0x0072:
            if (r0 != 0) goto L_0x008a
            r3.f8359b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C0959a.m1447a()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.ct r5 = r3.f8358a     // Catch:{ IllegalArgumentException -> 0x0098 }
            android.content.Context r5 = r5.mo14231n()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.ct r0 = r3.f8358a     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.df r0 = r0.f8301a     // Catch:{ IllegalArgumentException -> 0x0098 }
            r4.mo9987a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0098 }
            goto L_0x0098
        L_0x008a:
            com.google.android.gms.measurement.internal.ct r4 = r3.f8358a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ar r4 = r4.mo14234q()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.dg r5 = new com.google.android.gms.measurement.internal.dg     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo14296a((java.lang.Runnable) r5)     // Catch:{ all -> 0x001c }
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x009a:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2230df.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C0926p.m1315b("MeasurementServiceConnection.onServiceDisconnected");
        this.f8358a.mo14235r().mo14837w().mo14841a("Service disconnected");
        this.f8358a.mo14234q().mo14296a((Runnable) new C2232dh(this, componentName));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14467b() {
        this.f8358a.mo14221d();
        Context n = this.f8358a.mo14231n();
        synchronized (this) {
            if (this.f8359b) {
                this.f8358a.mo14235r().mo14838x().mo14841a("Connection attempt already in progress");
            } else if (this.f8360c == null || (!this.f8360c.isConnecting() && !this.f8360c.isConnected())) {
                this.f8360c = new C2294q(n, Looper.getMainLooper(), this, this);
                this.f8358a.mo14235r().mo14838x().mo14841a("Connecting to remote service");
                this.f8359b = true;
                this.f8360c.checkAvailabilityAndConnect();
            } else {
                this.f8358a.mo14235r().mo14838x().mo14841a("Already awaiting connection attempt");
            }
        }
    }

    @MainThread
    /* renamed from: a */
    public final void mo9869a(@Nullable Bundle bundle) {
        C0926p.m1315b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f8358a.mo14234q().mo14296a((Runnable) new C2233di(this, (C2286i) this.f8360c.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f8360c = null;
                this.f8359b = false;
            }
        }
    }

    @MainThread
    /* renamed from: a */
    public final void mo9868a(int i) {
        C0926p.m1315b("MeasurementServiceConnection.onConnectionSuspended");
        this.f8358a.mo14235r().mo14837w().mo14841a("Service connection suspended");
        this.f8358a.mo14234q().mo14296a((Runnable) new C2234dj(this));
    }

    @MainThread
    /* renamed from: a */
    public final void mo9870a(@NonNull ConnectionResult connectionResult) {
        C0926p.m1315b("MeasurementServiceConnection.onConnectionFailed");
        C2295r d = this.f8358a.f8222q.mo14319d();
        if (d != null) {
            d.mo14833i().mo14842a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f8359b = false;
            this.f8360c = null;
        }
        this.f8358a.mo14234q().mo14296a((Runnable) new C2235dk(this));
    }
}
