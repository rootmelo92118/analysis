package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.internal.measurement.C1986dt;
import com.google.android.gms.internal.measurement.C2020eu;

/* renamed from: com.google.android.gms.measurement.internal.ak */
public final class C2154ak implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C2153aj f8083a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f8084b;

    C2154ak(C2153aj ajVar, String str) {
        this.f8083a = ajVar;
        this.f8084b = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f8083a.f8082a.mo14235r().mo14833i().mo14841a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C1986dt a = C2020eu.m9583a(iBinder);
            if (a == null) {
                this.f8083a.f8082a.mo14235r().mo14833i().mo14841a("Install Referrer Service implementation was not found");
                return;
            }
            this.f8083a.f8082a.mo14235r().mo14836v().mo14841a("Install Referrer Service connected");
            this.f8083a.f8082a.mo14234q().mo14296a((Runnable) new C2155al(this, a, this));
        } catch (Exception e) {
            this.f8083a.f8082a.mo14235r().mo14833i().mo14842a("Exception occurred while calling Install Referrer API", e);
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8083a.f8082a.mo14235r().mo14836v().mo14841a("Install Referrer Service disconnected");
    }
}
