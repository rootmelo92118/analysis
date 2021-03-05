package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class bms implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f4791a;

    /* renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f4792b;

    /* renamed from: c */
    private boolean f4793c = false;

    public bms(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f4792b = new WeakReference<>(activityLifecycleCallbacks);
        this.f4791a = application;
    }

    /* renamed from: a */
    private final void m6006a(bna bna) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4792b.get();
            if (activityLifecycleCallbacks != null) {
                bna.mo12203a(activityLifecycleCallbacks);
            } else if (!this.f4793c) {
                this.f4791a.unregisterActivityLifecycleCallbacks(this);
                this.f4793c = true;
            }
        } catch (Exception e) {
            C1772wz.m1625b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6006a(new bmt(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m6006a(new bmu(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m6006a(new bmv(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m6006a(new bmw(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m6006a(new bmx(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6006a(new bmy(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m6006a(new bmz(this, activity));
    }
}
