package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class axd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f3021a;

    /* renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f3022b;

    /* renamed from: c */
    private boolean f3023c = false;

    public axd(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f3022b = new WeakReference<>(activityLifecycleCallbacks);
        this.f3021a = application;
    }

    /* renamed from: a */
    private final void m4380a(axm axm) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f3022b.get();
            if (activityLifecycleCallbacks != null) {
                axm.mo11369a(activityLifecycleCallbacks);
            } else if (!this.f3023c) {
                this.f3021a.unregisterActivityLifecycleCallbacks(this);
                this.f3023c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4380a(new axf(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m4380a(new axg(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m4380a(new axh(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m4380a(new axi(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m4380a(new axj(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4380a(new axk(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m4380a(new axl(this, activity));
    }
}
