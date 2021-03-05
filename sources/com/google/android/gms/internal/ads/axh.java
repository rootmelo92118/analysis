package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class axh implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3034a;

    axh(axd axd, Activity activity) {
        this.f3034a = activity;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f3034a);
    }
}
