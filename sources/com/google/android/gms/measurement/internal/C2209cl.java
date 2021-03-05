package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.text.TextUtils;

@TargetApi(14)
@MainThread
/* renamed from: com.google.android.gms.measurement.internal.cl */
final class C2209cl implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C2200cc f8284a;

    private C2209cl(C2200cc ccVar) {
        this.f8284a = ccVar;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            this.f8284a.mo14235r().mo14838x().mo14841a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (!(intent == null || (data = intent.getData()) == null || !data.isHierarchical())) {
                if (bundle == null) {
                    Bundle a = this.f8284a.mo14233p().mo14562a(data);
                    this.f8284a.mo14233p();
                    String str = C2264el.m11023a(intent) ? "gs" : "auto";
                    if (a != null) {
                        this.f8284a.mo14395a(str, "_cmp", a);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                        this.f8284a.mo14235r().mo14837w().mo14841a("Activity created with data 'referrer' param without gclid and at least one utm field");
                        return;
                    }
                    this.f8284a.mo14235r().mo14837w().mo14842a("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.f8284a.mo14398a("auto", "_ldl", (Object) queryParameter, true);
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            this.f8284a.mo14235r().mo14830d_().mo14842a("Throwable caught in onActivityCreated", e);
        }
        this.f8284a.mo14226i().mo14427a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f8284a.mo14226i().mo14432c(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f8284a.mo14226i().mo14430b(activity);
        C2242dr k = this.f8284a.mo14228k();
        k.mo14234q().mo14296a((Runnable) new C2247dw(k, k.mo14230m().mo9997b()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        this.f8284a.mo14226i().mo14426a(activity);
        C2242dr k = this.f8284a.mo14228k();
        k.mo14234q().mo14296a((Runnable) new C2246dv(k, k.mo14230m().mo9997b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f8284a.mo14226i().mo14431b(activity, bundle);
    }

    /* synthetic */ C2209cl(C2200cc ccVar, C2201cd cdVar) {
        this(ccVar);
    }
}
