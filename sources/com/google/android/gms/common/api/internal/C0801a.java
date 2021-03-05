package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C0979o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.a */
public final class C0801a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final C0801a f824a = new C0801a();

    /* renamed from: b */
    private final AtomicBoolean f825b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f826c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private final ArrayList<C0802a> f827d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e */
    private boolean f828e = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    public interface C0802a {
        /* renamed from: a */
        void mo9622a(boolean z);
    }

    private C0801a() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: a */
    public static C0801a m953a() {
        return f824a;
    }

    /* renamed from: a */
    public static void m954a(Application application) {
        synchronized (f824a) {
            if (!f824a.f828e) {
                application.registerActivityLifecycleCallbacks(f824a);
                application.registerComponentCallbacks(f824a);
                f824a.f828e = true;
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo9610a(boolean z) {
        if (!this.f826c.get()) {
            if (!C0979o.m1502c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f826c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f825b.set(true);
            }
        }
        return mo9611b();
    }

    /* renamed from: b */
    public final boolean mo9611b() {
        return this.f825b.get();
    }

    /* renamed from: a */
    public final void mo9609a(C0802a aVar) {
        synchronized (f824a) {
            this.f827d.add(aVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f825b.compareAndSet(true, false);
        this.f826c.set(true);
        if (compareAndSet) {
            m955b(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f825b.compareAndSet(true, false);
        this.f826c.set(true);
        if (compareAndSet) {
            m955b(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f825b.compareAndSet(false, true)) {
            this.f826c.set(true);
            m955b(true);
        }
    }

    /* renamed from: b */
    private final void m955b(boolean z) {
        synchronized (f824a) {
            ArrayList arrayList = this.f827d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C0802a) obj).mo9622a(z);
            }
        }
    }
}
