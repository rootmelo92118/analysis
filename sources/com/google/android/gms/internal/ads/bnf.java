package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class bnf implements Application.ActivityLifecycleCallbacks {
    @Nullable

    /* renamed from: a */
    private Activity f4827a;

    /* renamed from: b */
    private Context f4828b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f4829c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4830d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4831e = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: f */
    public final List<bnh> f4832f = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: g */
    private final List<bnv> f4833g = new ArrayList();

    /* renamed from: h */
    private Runnable f4834h;

    /* renamed from: i */
    private boolean f4835i = false;

    /* renamed from: j */
    private long f4836j;

    bnf() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void mo12229a(Application application, Context context) {
        if (!this.f4835i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m6042a((Activity) context);
            }
            this.f4828b = application;
            this.f4836j = ((Long) bre.m6321e().mo12778a(C1557p.f5939au)).longValue();
            this.f4835i = true;
        }
    }

    /* renamed from: a */
    public final void mo12230a(bnh bnh) {
        synchronized (this.f4829c) {
            this.f4832f.add(bnh);
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo12228a() {
        return this.f4827a;
    }

    @Nullable
    /* renamed from: b */
    public final Context mo12231b() {
        return this.f4828b;
    }

    public final void onActivityStarted(Activity activity) {
        m6042a(activity);
    }

    public final void onActivityResumed(Activity activity) {
        m6042a(activity);
        this.f4831e = false;
        boolean z = !this.f4830d;
        this.f4830d = true;
        if (this.f4834h != null) {
            C1782xi.f6838a.removeCallbacks(this.f4834h);
        }
        synchronized (this.f4829c) {
            for (bnv a : this.f4833g) {
                try {
                    a.mo12262a(activity);
                } catch (Exception e) {
                    zzbv.zzlj().mo13119a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    aai.m1625b("", e);
                }
            }
            if (z) {
                for (bnh a2 : this.f4832f) {
                    try {
                        a2.mo12240a(true);
                    } catch (Exception e2) {
                        aai.m1625b("", e2);
                    }
                }
            } else {
                C1772wz.m1624b("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m6042a(activity);
        synchronized (this.f4829c) {
            for (bnv b : this.f4833g) {
                try {
                    b.mo12263b(activity);
                } catch (Exception e) {
                    zzbv.zzlj().mo13119a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    aai.m1625b("", e);
                }
            }
        }
        this.f4831e = true;
        if (this.f4834h != null) {
            C1782xi.f6838a.removeCallbacks(this.f4834h);
        }
        Handler handler = C1782xi.f6838a;
        bng bng = new bng(this);
        this.f4834h = bng;
        handler.postDelayed(bng, this.f4836j);
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f4829c) {
            if (this.f4827a != null) {
                if (this.f4827a.equals(activity)) {
                    this.f4827a = null;
                }
                Iterator<bnv> it = this.f4833g.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().mo12264c(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzbv.zzlj().mo13119a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        aai.m1625b("", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m6042a(Activity activity) {
        synchronized (this.f4829c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f4827a = activity;
            }
        }
    }
}
