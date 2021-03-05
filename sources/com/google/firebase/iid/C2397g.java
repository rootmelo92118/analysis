package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C0959a;
import com.google.android.gms.internal.p045c.C1866a;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.g */
final class C2397g implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a */
    int f8887a;

    /* renamed from: b */
    final Messenger f8888b;

    /* renamed from: c */
    C2402l f8889c;
    @GuardedBy("this")

    /* renamed from: d */
    final Queue<C2403m<?>> f8890d;
    @GuardedBy("this")

    /* renamed from: e */
    final SparseArray<C2403m<?>> f8891e;

    /* renamed from: f */
    final /* synthetic */ C2395e f8892f;

    private C2397g(C2395e eVar) {
        this.f8892f = eVar;
        this.f8887a = 0;
        this.f8888b = new Messenger(new C1866a(Looper.getMainLooper(), new C2398h(this)));
        this.f8890d = new ArrayDeque();
        this.f8891e = new SparseArray<>();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo15017a(com.google.firebase.iid.C2403m r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f8887a     // Catch:{ all -> 0x008e }
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0017;
                case 2: goto L_0x000d;
                case 3: goto L_0x000b;
                case 4: goto L_0x000b;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x008e }
        L_0x0008:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x000b:
            monitor-exit(r5)
            return r1
        L_0x000d:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f8890d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.m11722c()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r2
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f8890d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r2
        L_0x001e:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f8890d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.f8887a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            com.google.android.gms.common.internal.C0926p.m1312a((boolean) r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            r0 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x008e }
        L_0x003d:
            r5.f8887a = r2     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C0959a.m1447a()     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.e r3 = r5.f8892f     // Catch:{ all -> 0x008e }
            android.content.Context r3 = r3.f8883b     // Catch:{ all -> 0x008e }
            boolean r6 = r0.mo9988a(r3, r6, r5, r2)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0061
            java.lang.String r6 = "Unable to bind to service"
            r5.mo15015a(r1, r6)     // Catch:{ all -> 0x008e }
            goto L_0x0073
        L_0x0061:
            com.google.firebase.iid.e r6 = r5.f8892f     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f8884c     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.i r0 = new com.google.firebase.iid.i     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x008e }
        L_0x0073:
            monitor-exit(r5)
            return r2
        L_0x0075:
            int r0 = r5.f8887a     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2397g.mo15017a(com.google.firebase.iid.m):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo15027a(new com.google.firebase.iid.C2404n(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo15026a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15016a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Received response to request: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r1, r2)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.m<?>> r1 = r4.f8891e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.firebase.iid.m r1 = (com.google.firebase.iid.C2403m) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.firebase.iid.m<?>> r3 = r4.f8891e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo15013a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.n r5 = new com.google.firebase.iid.n
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo15027a((com.google.firebase.iid.C2404n) r5)
            goto L_0x006e
        L_0x006b:
            r1.mo15026a((android.os.Bundle) r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2397g.mo15016a(android.os.Message):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo15015a(0, "Null service connection");
            return;
        }
        try {
            this.f8889c = new C2402l(iBinder);
            this.f8887a = 2;
            m11722c();
        } catch (RemoteException e) {
            mo15015a(0, e.getMessage());
        }
    }

    /* renamed from: c */
    private final void m11722c() {
        this.f8892f.f8884c.execute(new C2400j(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo15015a(2, "Service disconnected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo15015a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        switch (this.f8887a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f8887a = 4;
                C0959a.m1447a().mo9987a(this.f8892f.f8883b, this);
                C2404n nVar = new C2404n(i, str);
                for (C2403m a : this.f8890d) {
                    a.mo15027a(nVar);
                }
                this.f8890d.clear();
                for (int i2 = 0; i2 < this.f8891e.size(); i2++) {
                    this.f8891e.valueAt(i2).mo15027a(nVar);
                }
                this.f8891e.clear();
                return;
            case 3:
                this.f8887a = 4;
                return;
            case 4:
                return;
            default:
                int i3 = this.f8887a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo15013a() {
        if (this.f8887a == 2 && this.f8890d.isEmpty() && this.f8891e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f8887a = 3;
            C0959a.m1447a().mo9987a(this.f8892f.f8883b, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo15018b() {
        if (this.f8887a == 1) {
            mo15015a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo15014a(int i) {
        C2403m mVar = this.f8891e.get(i);
        if (mVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f8891e.remove(i);
            mVar.mo15027a(new C2404n(3, "Timed out waiting for response"));
            mo15013a();
        }
    }
}
