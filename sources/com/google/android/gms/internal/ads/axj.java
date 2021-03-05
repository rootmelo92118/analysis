package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class axj implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3036a;

    axj(axd axd, Activity activity) {
        this.f3036a = activity;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f3036a);
    }
}
