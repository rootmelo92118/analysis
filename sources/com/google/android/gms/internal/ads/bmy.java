package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class bmy implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4800a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f4801b;

    bmy(bms bms, Activity activity, Bundle bundle) {
        this.f4800a = activity;
        this.f4801b = bundle;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4800a, this.f4801b);
    }
}
