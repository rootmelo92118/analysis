package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.ab */
class C2145ab extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f8036a = "com.google.android.gms.measurement.internal.ab";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2254ec f8037b;

    /* renamed from: c */
    private boolean f8038c;

    /* renamed from: d */
    private boolean f8039d;

    C2145ab(C2254ec ecVar) {
        C0926p.m1306a(ecVar);
        this.f8037b = ecVar;
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.f8037b.mo14536j();
        String action = intent.getAction();
        this.f8037b.mo14235r().mo14838x().mo14842a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = this.f8037b.mo14527c().mo14846f();
            if (this.f8039d != f) {
                this.f8039d = f;
                this.f8037b.mo14234q().mo14296a((Runnable) new C2146ac(this, f));
                return;
            }
            return;
        }
        this.f8037b.mo14235r().mo14833i().mo14842a("NetworkBroadcastReceiver received unknown action", action);
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14240a() {
        this.f8037b.mo14536j();
        this.f8037b.mo14234q().mo14221d();
        if (!this.f8038c) {
            this.f8037b.mo14231n().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f8039d = this.f8037b.mo14527c().mo14846f();
            this.f8037b.mo14235r().mo14838x().mo14842a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f8039d));
            this.f8038c = true;
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14241b() {
        this.f8037b.mo14536j();
        this.f8037b.mo14234q().mo14221d();
        this.f8037b.mo14234q().mo14221d();
        if (this.f8038c) {
            this.f8037b.mo14235r().mo14838x().mo14841a("Unregistering connectivity change receiver");
            this.f8038c = false;
            this.f8039d = false;
            try {
                this.f8037b.mo14231n().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f8037b.mo14235r().mo14830d_().mo14842a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
