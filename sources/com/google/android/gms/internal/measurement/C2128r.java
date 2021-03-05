package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0819c;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0972h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.C2196bz;
import com.google.android.gms.measurement.p046a.C2141a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.r */
public class C2128r {

    /* renamed from: b */
    private static volatile C2128r f7970b;

    /* renamed from: a */
    protected final C0969e f7971a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f7972c;

    /* renamed from: d */
    private final ExecutorService f7973d;

    /* renamed from: e */
    private final C2141a f7974e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<C2196bz, C2131c> f7975f;

    /* renamed from: g */
    private int f7976g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f7977h;

    /* renamed from: i */
    private String f7978i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2026f f7979j;

    /* renamed from: com.google.android.gms.internal.measurement.r$d */
    class C2132d implements Application.ActivityLifecycleCallbacks {
        C2132d() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2128r.this.m10297a((C2130b) new C1888am(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            C2128r.this.m10297a((C2130b) new C1889an(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C2128r.this.m10297a((C2130b) new C1890ao(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C2128r.this.m10297a((C2130b) new C1891ap(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C2128r.this.m10297a((C2130b) new C1892aq(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C2129a aVar = new C2129a();
            C2128r.this.m10297a((C2130b) new C1893ar(this, activity, aVar));
            Bundle b = aVar.mo14138b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            C2128r.this.m10297a((C2130b) new C1894as(this, activity));
        }
    }

    /* renamed from: a */
    public static C2128r m10295a(Context context, String str, String str2, String str3, Bundle bundle) {
        C0926p.m1306a(context);
        if (f7970b == null) {
            synchronized (C2128r.class) {
                if (f7970b == null) {
                    f7970b = new C2128r(context, str, str2, str3, bundle);
                }
            }
        }
        return f7970b;
    }

    /* renamed from: com.google.android.gms.internal.measurement.r$a */
    class C2129a extends C2120j {

        /* renamed from: a */
        private final AtomicReference<Bundle> f7980a = new AtomicReference<>();

        /* renamed from: b */
        private boolean f7981b;

        C2129a() {
        }

        /* renamed from: a */
        public final void mo14090a(Bundle bundle) {
            synchronized (this.f7980a) {
                try {
                    this.f7980a.set(bundle);
                    this.f7981b = true;
                    this.f7980a.notify();
                } catch (Throwable th) {
                    this.f7980a.notify();
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo14137a(long j) {
            return (String) mo14136a(mo14138b(j), String.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final Bundle mo14138b(long j) {
            Bundle bundle;
            synchronized (this.f7980a) {
                if (!this.f7981b) {
                    try {
                        this.f7980a.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.f7980a.get();
            }
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final <T> T mo14136a(Bundle bundle, Class<T> cls) {
            Object obj;
            if (bundle == null || (obj = bundle.get("r")) == null) {
                return null;
            }
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                String canonicalName = cls.getCanonicalName();
                String canonicalName2 = obj.getClass().getCanonicalName();
                C2128r.this.mo14119a(5, "Unexpected object type. Expected, Received", (Object) canonicalName, (Object) canonicalName2, (Object) e);
                Log.w(C2128r.this.f7972c, String.format(String.valueOf("Unexpected object type. Expected, Received").concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
                throw e;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r$b */
    abstract class C2130b implements Runnable {

        /* renamed from: a */
        final long f7983a;

        /* renamed from: b */
        final long f7984b;

        /* renamed from: c */
        private final boolean f7985c;

        C2130b(C2128r rVar) {
            this(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13490a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo13491b();

        C2130b(boolean z) {
            this.f7983a = C2128r.this.f7971a.mo9996a();
            this.f7984b = C2128r.this.f7971a.mo9997b();
            this.f7985c = z;
        }

        public void run() {
            if (C2128r.this.f7977h) {
                mo13490a();
                return;
            }
            try {
                mo13491b();
            } catch (Exception e) {
                C2128r.this.m10300a(e, false, this.f7985c);
                mo13490a();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r$c */
    static class C2131c extends C2123m {

        /* renamed from: a */
        private final C2196bz f7987a;

        C2131c(C2196bz bzVar) {
            this.f7987a = bzVar;
        }

        /* renamed from: a */
        public final void mo14111a(String str, String str2, Bundle bundle, long j) {
            this.f7987a.onEvent(str, str2, bundle, j);
        }

        /* renamed from: a */
        public final int mo14110a() {
            return this.f7987a.hashCode();
        }
    }

    /* renamed from: a */
    public final C2141a mo14116a() {
        return this.f7974e;
    }

    private C2128r(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m10306b(str2, str3)) {
            this.f7972c = "FA";
        } else {
            this.f7972c = str;
        }
        this.f7971a = C0972h.m1482d();
        this.f7973d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f7972c, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2132d());
        }
        this.f7974e = new C2141a(this);
        boolean z = false;
        if (!(!m10310d(context) || m10313h())) {
            this.f7978i = null;
            this.f7977h = true;
            Log.w(this.f7972c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m10306b(str2, str3)) {
            this.f7978i = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f7972c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f7972c, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.f7977h = true;
                return;
            }
        } else {
            this.f7978i = str2;
        }
        m10297a((C2130b) new C2133s(this, context, str2, str3, bundle));
    }

    /* renamed from: d */
    private static boolean m10310d(Context context) {
        try {
            C0819c.m1055a(context);
            if (C0819c.m1057a() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m10306b(String str, String str2) {
        return (str2 == null || str == null || m10313h()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10297a(C2130b bVar) {
        this.f7973d.execute(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C2026f mo14115a(Context context) {
        try {
            return C2053g.m9766a(DynamiteModule.m1533a(context, DynamiteModule.f1242d, "com.google.android.gms.measurement.dynamite").mo10004a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C0990a e) {
            m10300a((Exception) e, true, false);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m10311e(Context context) {
        return DynamiteModule.m1537b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m10312f(Context context) {
        return DynamiteModule.m1530a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10300a(Exception exc, boolean z, boolean z2) {
        this.f7977h |= z;
        if (z) {
            Log.w(this.f7972c, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo14119a(5, "Error with data collection. Data lost.", (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.f7972c, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: h */
    private static boolean m10313h() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo14122a(C2196bz bzVar) {
        m10297a((C2130b) new C1883ah(this, bzVar));
    }

    /* renamed from: b */
    public final void mo14127b(C2196bz bzVar) {
        m10297a((C2130b) new C1884ai(this, bzVar));
    }

    /* renamed from: a */
    public final void mo14124a(String str, String str2, Bundle bundle) {
        m10301a(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    private final void m10301a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m10297a((C2130b) new C1885aj(this, l, str, str2, bundle, true, z2));
    }

    /* renamed from: a */
    public final void mo14125a(String str, String str2, Object obj, boolean z) {
        m10297a((C2130b) new C1886ak(this, str, str2, obj, true));
    }

    /* renamed from: a */
    public final void mo14121a(Bundle bundle) {
        m10297a((C2130b) new C1887al(this, bundle));
    }

    /* renamed from: b */
    public final void mo14129b(String str, String str2, Bundle bundle) {
        m10297a((C2130b) new C2134t(this, str, str2, bundle));
    }

    /* renamed from: a */
    public final List<Bundle> mo14117a(String str, String str2) {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C2135u(this, str, str2, aVar));
        List<Bundle> list = (List) aVar.mo14136a(aVar.mo14138b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo14120a(Activity activity, String str, String str2) {
        m10297a((C2130b) new C2136v(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo14123a(String str) {
        m10297a((C2130b) new C2137w(this, str));
    }

    /* renamed from: b */
    public final void mo14128b(String str) {
        m10297a((C2130b) new C2138x(this, str));
    }

    /* renamed from: b */
    public final String mo14126b() {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C2139y(this, aVar));
        return aVar.mo14137a(500);
    }

    /* renamed from: c */
    public final String mo14131c() {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C2140z(this, aVar));
        return aVar.mo14137a(50);
    }

    /* renamed from: d */
    public final long mo14132d() {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1876aa(this, aVar));
        Long l = (Long) aVar.mo14136a(aVar.mo14138b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f7971a.mo9996a()).nextLong();
        int i = this.f7976g + 1;
        this.f7976g = i;
        return nextLong + ((long) i);
    }

    /* renamed from: e */
    public final String mo14133e() {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1877ab(this, aVar));
        return aVar.mo14137a(500);
    }

    /* renamed from: f */
    public final String mo14134f() {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1878ac(this, aVar));
        return aVar.mo14137a(500);
    }

    /* renamed from: a */
    public final Map<String, Object> mo14118a(String str, String str2, boolean z) {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1879ad(this, str, str2, z, aVar));
        Bundle b = aVar.mo14138b(5000);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo14119a(int i, String str, Object obj, Object obj2, Object obj3) {
        m10297a((C2130b) new C1880ae(this, false, 5, str, obj, obj2, obj3));
    }

    /* renamed from: a */
    public final Bundle mo14114a(Bundle bundle, boolean z) {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1881af(this, bundle, aVar));
        if (z) {
            return aVar.mo14138b(5000);
        }
        return null;
    }

    /* renamed from: c */
    public final int mo14130c(String str) {
        C2129a aVar = new C2129a();
        m10297a((C2130b) new C1882ag(this, str, aVar));
        Integer num = (Integer) aVar.mo14136a(aVar.mo14138b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: g */
    public final String mo14135g() {
        return this.f7978i;
    }
}
