package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.util.p042a.C0964a;
import com.google.android.gms.p040b.C0741g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.e */
public final class C2395e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: a */
    private static C2395e f8882a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f8883b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f8884c;
    @GuardedBy("this")

    /* renamed from: d */
    private C2397g f8885d = new C2397g(this);
    @GuardedBy("this")

    /* renamed from: e */
    private int f8886e = 1;

    /* renamed from: a */
    public static synchronized C2395e m11719a(Context context) {
        C2395e eVar;
        synchronized (C2395e.class) {
            if (f8882a == null) {
                f8882a = new C2395e(context, Executors.newSingleThreadScheduledExecutor(new C0964a("MessengerIpcClient")));
            }
            eVar = f8882a;
        }
        return eVar;
    }

    @VisibleForTesting
    private C2395e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8884c = scheduledExecutorService;
        this.f8883b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C0741g<Bundle> mo15012a(int i, Bundle bundle) {
        return m11718a(new C2405o(m11716a(), 1, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C0741g<T> m11718a(C2403m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f8885d.mo15017a((C2403m) mVar)) {
            this.f8885d = new C2397g(this);
            this.f8885d.mo15017a((C2403m) mVar);
        }
        return mVar.f8901b.mo9485a();
    }

    /* renamed from: a */
    private final synchronized int m11716a() {
        int i;
        i = this.f8886e;
        this.f8886e = i + 1;
        return i;
    }
}
