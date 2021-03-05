package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class axk implements axm {

    /* renamed from: a */
    private final /* synthetic */ Activity f3037a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f3038b;

    axk(axd axd, Activity activity, Bundle bundle) {
        this.f3037a = activity;
        this.f3038b = bundle;
    }

    /* renamed from: a */
    public final void mo11369a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f3037a, this.f3038b);
    }
}
