package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class axf implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3031a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f3032b;

    axf(axd axd, Activity activity, Bundle bundle) {
        this.f3031a = activity;
        this.f3032b = bundle;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f3031a, this.f3032b);
    }
}
