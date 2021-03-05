package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class axg implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3033a;

    axg(axd axd, Activity activity) {
        this.f3033a = activity;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f3033a);
    }
}
