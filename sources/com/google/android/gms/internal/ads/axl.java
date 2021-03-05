package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class axl implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3039a;

    axl(axd axd, Activity activity) {
        this.f3039a = activity;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f3039a);
    }
}
