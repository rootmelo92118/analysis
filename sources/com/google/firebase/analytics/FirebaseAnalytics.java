package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.measurement.internal.C2166aw;
import com.google.android.gms.measurement.internal.C2270er;
import com.google.android.gms.measurement.internal.C2290m;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f8748a;

    /* renamed from: b */
    private final C2166aw f8749b;

    /* renamed from: c */
    private final Object f8750c = new Object();

    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f8748a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f8748a == null) {
                    f8748a = new FirebaseAnalytics(C2166aw.m10527a(context, (C2290m) null));
                }
            }
        }
        return f8748a;
    }

    @Keep
    @MainThread
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        if (!C2270er.m11151a()) {
            this.f8749b.mo14235r().mo14833i().mo14841a("setCurrentScreen must be called from the main thread");
        } else {
            this.f8749b.mo14333w().mo14428a(activity, str, str2);
        }
    }

    private FirebaseAnalytics(C2166aw awVar) {
        C0926p.m1306a(awVar);
        this.f8749b = awVar;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m11607a().mo14962c();
    }
}
