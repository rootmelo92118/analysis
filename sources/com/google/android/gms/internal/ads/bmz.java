package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class bmz implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4802a;

    bmz(bms bms, Activity activity) {
        this.f4802a = activity;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4802a);
    }
}
