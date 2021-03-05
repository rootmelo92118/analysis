package p000a.p001a.p002a.p003a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.p001a.p002a.p003a.C0000a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0035q;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;
import p000a.p001a.p002a.p003a.p004a.p007c.C0066d;
import p000a.p001a.p002a.p003a.p004a.p007c.C0075k;
import p000a.p001a.p002a.p003a.p004a.p007c.C0078m;

/* renamed from: a.a.a.a.c */
/* compiled from: Fabric */
public class C0139c {

    /* renamed from: a */
    static volatile C0139c f300a;

    /* renamed from: b */
    static final C0153l f301b = new C0138b();

    /* renamed from: c */
    final C0153l f302c;

    /* renamed from: d */
    final boolean f303d;

    /* renamed from: e */
    private final Context f304e;

    /* renamed from: f */
    private final Map<Class<? extends C0150i>, C0150i> f305f;

    /* renamed from: g */
    private final ExecutorService f306g;

    /* renamed from: h */
    private final Handler f307h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0145f<C0139c> f308i;

    /* renamed from: j */
    private final C0145f<?> f309j;

    /* renamed from: k */
    private final C0036r f310k;

    /* renamed from: l */
    private C0000a f311l;

    /* renamed from: m */
    private WeakReference<Activity> f312m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AtomicBoolean f313n = new AtomicBoolean(false);

    /* renamed from: c */
    public String mo298c() {
        return "1.4.7.30";
    }

    /* renamed from: d */
    public String mo299d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: a.a.a.a.c$a */
    /* compiled from: Fabric */
    public static class C0142a {

        /* renamed from: a */
        private final Context f318a;

        /* renamed from: b */
        private C0150i[] f319b;

        /* renamed from: c */
        private C0075k f320c;

        /* renamed from: d */
        private Handler f321d;

        /* renamed from: e */
        private C0153l f322e;

        /* renamed from: f */
        private boolean f323f;

        /* renamed from: g */
        private String f324g;

        /* renamed from: h */
        private String f325h;

        /* renamed from: i */
        private C0145f<C0139c> f326i;

        public C0142a(Context context) {
            if (context != null) {
                this.f318a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C0142a mo304a(C0150i... iVarArr) {
            if (this.f319b == null) {
                if (!new C0035q().mo62f(this.f318a)) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C0150i iVar : iVarArr) {
                        String identifier = iVar.getIdentifier();
                        char c = 65535;
                        int hashCode = identifier.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && identifier.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c = 0;
                            }
                        } else if (identifier.equals("com.crashlytics.sdk.android:answers")) {
                            c = 1;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                arrayList.add(iVar);
                                break;
                            default:
                                if (z) {
                                    break;
                                } else {
                                    C0139c.m394g().mo288d("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                                    z = true;
                                    break;
                                }
                        }
                    }
                    iVarArr = (C0150i[]) arrayList.toArray(new C0150i[0]);
                }
                this.f319b = iVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C0139c mo305a() {
            Map a;
            if (this.f320c == null) {
                this.f320c = C0075k.m201a();
            }
            if (this.f321d == null) {
                this.f321d = new Handler(Looper.getMainLooper());
            }
            if (this.f322e == null) {
                if (this.f323f) {
                    this.f322e = new C0138b(3);
                } else {
                    this.f322e = new C0138b();
                }
            }
            if (this.f325h == null) {
                this.f325h = this.f318a.getPackageName();
            }
            if (this.f326i == null) {
                this.f326i = C0145f.f330d;
            }
            if (this.f319b == null) {
                a = new HashMap();
            } else {
                a = C0139c.m390b((Collection<? extends C0150i>) Arrays.asList(this.f319b));
            }
            Map map = a;
            Context applicationContext = this.f318a.getApplicationContext();
            return new C0139c(applicationContext, map, this.f320c, this.f321d, this.f322e, this.f323f, this.f326i, new C0036r(applicationContext, this.f325h, this.f324g, map.values()), C0139c.m393d(this.f318a));
        }
    }

    /* renamed from: a */
    static C0139c m383a() {
        if (f300a != null) {
            return f300a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    C0139c(Context context, Map<Class<? extends C0150i>, C0150i> map, C0075k kVar, Handler handler, C0153l lVar, boolean z, C0145f fVar, C0036r rVar, Activity activity) {
        this.f304e = context;
        this.f305f = map;
        this.f306g = kVar;
        this.f307h = handler;
        this.f302c = lVar;
        this.f303d = z;
        this.f308i = fVar;
        this.f309j = mo293a(map.size());
        this.f310k = rVar;
        mo292a(activity);
    }

    /* renamed from: a */
    public static C0139c m384a(Context context, C0150i... iVarArr) {
        if (f300a == null) {
            synchronized (C0139c.class) {
                if (f300a == null) {
                    m392c(new C0142a(context).mo304a(iVarArr).mo305a());
                }
            }
        }
        return f300a;
    }

    /* renamed from: c */
    private static void m392c(C0139c cVar) {
        f300a = cVar;
        cVar.m396i();
    }

    /* renamed from: a */
    public C0139c mo292a(Activity activity) {
        this.f312m = new WeakReference<>(activity);
        return this;
    }

    /* renamed from: b */
    public Activity mo296b() {
        if (this.f312m != null) {
            return (Activity) this.f312m.get();
        }
        return null;
    }

    /* renamed from: i */
    private void m396i() {
        this.f311l = new C0000a(this.f304e);
        this.f311l.mo2a(new C0000a.C0003b() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C0139c.this.mo292a(activity);
            }

            public void onActivityStarted(Activity activity) {
                C0139c.this.mo292a(activity);
            }

            public void onActivityResumed(Activity activity) {
                C0139c.this.mo292a(activity);
            }
        });
        mo294a(this.f304e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo294a(Context context) {
        StringBuilder sb;
        Future<Map<String, C0152k>> b = mo297b(context);
        Collection<C0150i> f = mo301f();
        C0154m mVar = new C0154m(b, f);
        ArrayList<C0150i> arrayList = new ArrayList<>(f);
        Collections.sort(arrayList);
        mVar.injectParameters(context, this, C0145f.f330d, this.f310k);
        for (C0150i injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.f309j, this.f310k);
        }
        mVar.initialize();
        if (m394g().mo283a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo299d());
            sb.append(" [Version: ");
            sb.append(mo298c());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C0150i iVar : arrayList) {
            iVar.initializationTask.addDependency(mVar.initializationTask);
            mo295a(this.f305f, iVar);
            iVar.initialize();
            if (sb != null) {
                sb.append(iVar.getIdentifier());
                sb.append(" [Version: ");
                sb.append(iVar.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m394g().mo281a("Fabric", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo295a(Map<Class<? extends C0150i>, C0150i> map, C0150i iVar) {
        C0066d dVar = iVar.dependsOnAnnotation;
        if (dVar != null) {
            for (Class cls : dVar.mo140a()) {
                if (cls.isInterface()) {
                    for (C0150i next : map.values()) {
                        if (cls.isAssignableFrom(next.getClass())) {
                            iVar.initializationTask.addDependency(next.initializationTask);
                        }
                    }
                } else if (map.get(cls) != null) {
                    iVar.initializationTask.addDependency(map.get(cls).initializationTask);
                } else {
                    throw new C0078m("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m393d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: e */
    public ExecutorService mo300e() {
        return this.f306g;
    }

    /* renamed from: f */
    public Collection<C0150i> mo301f() {
        return this.f305f.values();
    }

    /* renamed from: a */
    public static <T extends C0150i> T m385a(Class<T> cls) {
        return (C0150i) m383a().f305f.get(cls);
    }

    /* renamed from: g */
    public static C0153l m394g() {
        if (f300a == null) {
            return f301b;
        }
        return f300a.f302c;
    }

    /* renamed from: h */
    public static boolean m395h() {
        if (f300a == null) {
            return false;
        }
        return f300a.f303d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C0150i>, C0150i> m390b(Collection<? extends C0150i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m388a((Map<Class<? extends C0150i>, C0150i>) hashMap, collection);
        return hashMap;
    }

    /* renamed from: a */
    private static void m388a(Map<Class<? extends C0150i>, C0150i> map, Collection<? extends C0150i> collection) {
        for (C0150i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof C0151j) {
                m388a(map, ((C0151j) iVar).getKits());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0145f<?> mo293a(final int i) {
        return new C0145f() {

            /* renamed from: a */
            final CountDownLatch f315a = new CountDownLatch(i);

            /* renamed from: a */
            public void mo303a(Object obj) {
                this.f315a.countDown();
                if (this.f315a.getCount() == 0) {
                    C0139c.this.f313n.set(true);
                    C0139c.this.f308i.mo303a(C0139c.this);
                }
            }

            /* renamed from: a */
            public void mo302a(Exception exc) {
                C0139c.this.f308i.mo302a(exc);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Future<Map<String, C0152k>> mo297b(Context context) {
        return mo300e().submit(new C0144e(context.getPackageCodePath()));
    }
}
