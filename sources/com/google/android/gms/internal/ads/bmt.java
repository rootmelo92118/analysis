package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class bmt implements bna {

    /* renamed from: a */
    private final /* synthetic */ Activity f4794a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f4795b;

    bmt(bms bms, Activity activity, Bundle bundle) {
        this.f4794a = activity;
        this.f4795b = bundle;
    }

    /* renamed from: a */
    public final void mo12203a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f4794a, this.f4795b);
    }
}
