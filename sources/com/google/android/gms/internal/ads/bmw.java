package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class bmw implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4798a;

    bmw(bms bms, Activity activity) {
        this.f4798a = activity;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f4798a);
    }
}
