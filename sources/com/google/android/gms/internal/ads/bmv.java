package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class bmv implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4797a;

    bmv(bms bms, Activity activity) {
        this.f4797a = activity;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f4797a);
    }
}
