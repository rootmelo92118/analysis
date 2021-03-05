package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class bmx implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4799a;

    bmx(bms bms, Activity activity) {
        this.f4799a = activity;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f4799a);
    }
}
