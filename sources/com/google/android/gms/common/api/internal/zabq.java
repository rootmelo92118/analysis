package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f932a;

    /* renamed from: b */
    private final C0836s f933b;

    public zabq(C0836s sVar) {
        this.f933b = sVar;
    }

    /* renamed from: a */
    public final void mo9701a(Context context) {
        this.f932a = context;
    }

    /* renamed from: a */
    public final synchronized void mo9700a() {
        if (this.f932a != null) {
            this.f932a.unregisterReceiver(this);
        }
        this.f932a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f933b.mo9644a();
            mo9700a();
        }
    }
}
