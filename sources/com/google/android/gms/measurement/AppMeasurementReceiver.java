package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.p034v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C2156am;
import com.google.android.gms.measurement.internal.C2159ap;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C2159ap {

    /* renamed from: a */
    private C2156am f8024a;

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        if (this.f8024a == null) {
            this.f8024a = new C2156am(this);
        }
        this.f8024a.mo14276a(context, intent);
    }

    @MainThread
    /* renamed from: a */
    public final void mo14177a(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo14176a() {
        return goAsync();
    }
}
