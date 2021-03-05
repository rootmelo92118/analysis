package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class axi implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3035a;

    axi(axd axd, Activity activity) {
        this.f3035a = activity;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f3035a);
    }
}
