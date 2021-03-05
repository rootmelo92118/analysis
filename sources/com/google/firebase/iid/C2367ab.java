package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.ab */
final class C2367ab extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C2366aa f8828a;

    public C2367ab(C2366aa aaVar) {
        this.f8828a = aaVar;
    }

    /* renamed from: a */
    public final void mo14979a() {
        if (FirebaseInstanceId.m11614f()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f8828a.mo14976a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f8828a != null && this.f8828a.mo14977b()) {
            if (FirebaseInstanceId.m11614f()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m11609a((Runnable) this.f8828a, 0);
            this.f8828a.mo14976a().unregisterReceiver(this);
            this.f8828a = null;
        }
    }
}
