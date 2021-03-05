package p000a.p001a.p002a.p003a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a.a.a.a.a */
/* compiled from: ActivityLifecycleManager */
public class C0000a {

    /* renamed from: a */
    private final Application f0a;

    /* renamed from: b */
    private C0001a f1b;

    /* renamed from: a.a.a.a.a$b */
    /* compiled from: ActivityLifecycleManager */
    public static abstract class C0003b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public C0000a(Context context) {
        this.f0a = (Application) context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.f1b = new C0001a(this.f0a);
        }
    }

    /* renamed from: a */
    public boolean mo2a(C0003b bVar) {
        return this.f1b != null && this.f1b.m5a(bVar);
    }

    /* renamed from: a */
    public void mo1a() {
        if (this.f1b != null) {
            this.f1b.m2a();
        }
    }

    /* renamed from: a.a.a.a.a$a */
    /* compiled from: ActivityLifecycleManager */
    private static class C0001a {

        /* renamed from: a */
        private final Set<Application.ActivityLifecycleCallbacks> f2a = new HashSet();

        /* renamed from: b */
        private final Application f3b;

        C0001a(Application application) {
            this.f3b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public void m2a() {
            for (Application.ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f2a) {
                this.f3b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public boolean m5a(final C0003b bVar) {
            if (this.f3b == null) {
                return false;
            }
            C00021 r0 = new Application.ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.onActivityCreated(activity, bundle);
                }

                public void onActivityStarted(Activity activity) {
                    bVar.onActivityStarted(activity);
                }

                public void onActivityResumed(Activity activity) {
                    bVar.onActivityResumed(activity);
                }

                public void onActivityPaused(Activity activity) {
                    bVar.onActivityPaused(activity);
                }

                public void onActivityStopped(Activity activity) {
                    bVar.onActivityStopped(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    bVar.onActivitySaveInstanceState(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity) {
                    bVar.onActivityDestroyed(activity);
                }
            };
            this.f3b.registerActivityLifecycleCallbacks(r0);
            this.f2a.add(r0);
            return true;
        }
    }
}
