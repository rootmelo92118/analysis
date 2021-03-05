package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2156am;
import com.google.android.gms.measurement.internal.C2159ap;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C2159ap {

    /* renamed from: a */
    private C2156am f8022a;

    /* renamed from: a */
    public final void mo14177a(Context context, Intent intent) {
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        if (this.f8022a == null) {
            this.f8022a = new C2156am(this);
        }
        this.f8022a.mo14276a(context, intent);
    }

    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo14176a() {
        return goAsync();
    }
}
