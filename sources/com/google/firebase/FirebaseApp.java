package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.p034v4.content.ContextCompat;
import android.support.p034v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0801a;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.common.util.C0981q;
import com.google.firebase.components.C2340a;
import com.google.firebase.components.C2345d;
import com.google.firebase.components.C2354m;
import com.google.firebase.p047a.C2330c;
import com.google.firebase.p049c.C2339a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public class FirebaseApp {
    @GuardedBy("LOCK")

    /* renamed from: a */
    static final Map<String, FirebaseApp> f8720a = new ArrayMap();

    /* renamed from: b */
    private static final List<String> f8721b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: c */
    private static final List<String> f8722c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: d */
    private static final List<String> f8723d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: e */
    private static final List<String> f8724e = Arrays.asList(new String[0]);

    /* renamed from: f */
    private static final Set<String> f8725f = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f8726g = new Object();

    /* renamed from: h */
    private static final Executor f8727h = new C2322d((byte) 0);

    /* renamed from: i */
    private final Context f8728i;

    /* renamed from: j */
    private final String f8729j;

    /* renamed from: k */
    private final C2337b f8730k;

    /* renamed from: l */
    private final C2354m f8731l;

    /* renamed from: m */
    private final SharedPreferences f8732m;

    /* renamed from: n */
    private final C2330c f8733n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f8734o = new AtomicBoolean(false);

    /* renamed from: p */
    private final AtomicBoolean f8735p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f8736q;

    /* renamed from: r */
    private final List<Object> f8737r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final List<C2319a> f8738s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final List<Object> f8739t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private C2320b f8740u;

    /* renamed from: com.google.firebase.FirebaseApp$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public interface C2319a {
        /* renamed from: a */
        void mo14899a(boolean z);
    }

    @Deprecated
    /* renamed from: com.google.firebase.FirebaseApp$b */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public interface C2320b {
    }

    @NonNull
    /* renamed from: a */
    public Context mo14890a() {
        m11523g();
        return this.f8728i;
    }

    @NonNull
    /* renamed from: b */
    public String mo14892b() {
        m11523g();
        return this.f8729j;
    }

    @NonNull
    /* renamed from: c */
    public C2337b mo14893c() {
        m11523g();
        return this.f8730k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f8729j.equals(((FirebaseApp) obj).mo14892b());
    }

    public int hashCode() {
        return this.f8729j.hashCode();
    }

    public String toString() {
        return C0924o.m1302a((Object) this).mo9911a("name", this.f8729j).mo9911a("options", this.f8730k).toString();
    }

    @Nullable
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f8726g) {
            firebaseApp = f8720a.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C0981q.m1513a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    @Nullable
    /* renamed from: a */
    public static FirebaseApp m11513a(Context context) {
        synchronized (f8726g) {
            if (f8720a.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            C2337b a = C2337b.m11543a(context);
            if (a == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp a2 = m11514a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static FirebaseApp m11514a(Context context, C2337b bVar) {
        return m11515a(context, bVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static FirebaseApp m11515a(Context context, C2337b bVar, String str) {
        FirebaseApp firebaseApp;
        C2321c.m11531a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8726g) {
            C0926p.m1313a(!f8720a.containsKey(trim), (Object) "FirebaseApp name " + trim + " already exists!");
            C0926p.m1307a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, bVar);
            f8720a.put(trim, firebaseApp);
        }
        firebaseApp.m11524h();
        return firebaseApp;
    }

    /* renamed from: a */
    public <T> T mo14891a(Class<T> cls) {
        m11523g();
        return this.f8731l.mo14933a((Class) cls);
    }

    public boolean isDataCollectionDefaultEnabled() {
        m11523g();
        return this.f8736q.get();
    }

    private FirebaseApp(Context context, String str, C2337b bVar) {
        this.f8728i = (Context) C0926p.m1306a(context);
        this.f8729j = C0926p.m1308a(str);
        this.f8730k = (C2337b) C0926p.m1306a(bVar);
        this.f8740u = new C2339a();
        this.f8732m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.f8736q = new AtomicBoolean(m11522f());
        List<C2345d> a = C2340a.C23411.m11557a(context).mo14927a();
        this.f8731l = new C2354m(f8727h, a, C2340a.m11549a(context, Context.class, new Class[0]), C2340a.m11549a(this, FirebaseApp.class, new Class[0]), C2340a.m11549a(bVar, C2337b.class, new Class[0]));
        this.f8733n = (C2330c) this.f8731l.mo14933a(C2330c.class);
    }

    /* renamed from: f */
    private boolean m11522f() {
        ApplicationInfo applicationInfo;
        if (this.f8732m.contains("firebase_data_collection_default_enabled")) {
            return this.f8732m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f8728i.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f8728i.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: g */
    private void m11523g() {
        C0926p.m1313a(!this.f8735p.get(), (Object) "FirebaseApp was deleted");
    }

    @VisibleForTesting
    /* renamed from: d */
    public boolean mo14894d() {
        return "[DEFAULT]".equals(mo14892b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11519a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C2319a a : this.f8738s) {
            a.mo14899a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11524h() {
        boolean isDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.f8728i);
        if (isDeviceProtectedStorage) {
            C2323e.m11533a(this.f8728i);
        } else {
            this.f8731l.mo14942a(mo14894d());
        }
        m11518a(FirebaseApp.class, this, f8721b, isDeviceProtectedStorage);
        if (mo14894d()) {
            m11518a(FirebaseApp.class, this, f8722c, isDeviceProtectedStorage);
            m11518a(Context.class, this.f8728i, f8723d, isDeviceProtectedStorage);
        }
    }

    /* renamed from: a */
    private static <T> void m11518a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String next : iterable) {
            if (z) {
                try {
                    if (f8724e.contains(next)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f8725f.contains(next)) {
                        Log.d("FirebaseApp", next + " is not linked. Skipping initialization.");
                    } else {
                        throw new IllegalStateException(next + " is missing, but is required. Check if it has been removed by Proguard.");
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(next + "#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    Log.wtf("FirebaseApp", "Failed to initialize " + next, e2);
                }
            }
            Method method = Class.forName(next).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke((Object) null, new Object[]{t});
            }
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.FirebaseApp$e */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C2323e extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C2323e> f8743a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f8744b;

        private C2323e(Context context) {
            this.f8744b = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f8726g) {
                for (FirebaseApp a : FirebaseApp.f8720a.values()) {
                    a.m11524h();
                }
            }
            this.f8744b.unregisterReceiver(this);
        }

        /* renamed from: a */
        static /* synthetic */ void m11533a(Context context) {
            if (f8743a.get() == null) {
                C2323e eVar = new C2323e(context);
                if (f8743a.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.FirebaseApp$c */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C2321c implements C0801a.C0802a {

        /* renamed from: a */
        private static AtomicReference<C2321c> f8741a = new AtomicReference<>();

        private C2321c() {
        }

        /* renamed from: a */
        public final void mo9622a(boolean z) {
            synchronized (FirebaseApp.f8726g) {
                Iterator it = new ArrayList(FirebaseApp.f8720a.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f8734o.get()) {
                        firebaseApp.m11519a(z);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m11531a(Context context) {
            if (C0979o.m1500a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f8741a.get() == null) {
                    C2321c cVar = new C2321c();
                    if (f8741a.compareAndSet((Object) null, cVar)) {
                        C0801a.m954a(application);
                        C0801a.m953a().mo9609a((C0801a.C0802a) cVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$d */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C2322d implements Executor {

        /* renamed from: a */
        private static final Handler f8742a = new Handler(Looper.getMainLooper());

        private C2322d() {
        }

        /* synthetic */ C2322d(byte b) {
            this();
        }

        public final void execute(@NonNull Runnable runnable) {
            f8742a.post(runnable);
        }
    }
}
