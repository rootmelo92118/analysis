package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.util.p042a.C0964a;
import com.google.android.gms.p040b.C0741g;
import com.google.android.gms.p040b.C0742h;
import com.google.android.gms.p040b.C0745j;
import com.google.firebase.C2327a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p047a.C2329b;
import com.google.firebase.p047a.C2331d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {

    /* renamed from: a */
    private static final long f8803a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private static C2415y f8804b;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f8805c;

    /* renamed from: d */
    private final Executor f8806d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final FirebaseApp f8807e;

    /* renamed from: f */
    private final C2406p f8808f;

    /* renamed from: g */
    private C2392b f8809g;

    /* renamed from: h */
    private final C2409s f8810h;

    /* renamed from: i */
    private final C2368ac f8811i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f8812j;

    /* renamed from: k */
    private final C2362a f8813k;

    /* renamed from: a */
    public static FirebaseInstanceId m11607a() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) firebaseApp.mo14891a(FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, C2331d dVar) {
        this(firebaseApp, new C2406p(firebaseApp.mo14890a()), C2375aj.m11664b(), C2375aj.m11664b(), dVar);
    }

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C2362a {

        /* renamed from: b */
        private final boolean f8815b = m11636c();

        /* renamed from: c */
        private final C2331d f8816c;
        @Nullable
        @GuardedBy("this")

        /* renamed from: d */
        private C2329b<C2327a> f8817d;
        @Nullable
        @GuardedBy("this")

        /* renamed from: e */
        private Boolean f8818e = m11635b();

        C2362a(C2331d dVar) {
            this.f8816c = dVar;
            if (this.f8818e == null && this.f8815b) {
                this.f8817d = new C2382aq(this);
                dVar.mo14906a(C2327a.class, this.f8817d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean mo14970a() {
            if (this.f8818e == null) {
                return this.f8815b && FirebaseInstanceId.this.f8807e.isDataCollectionDefaultEnabled();
            }
            return this.f8818e.booleanValue();
        }

        @Nullable
        /* renamed from: b */
        private final Boolean m11635b() {
            ApplicationInfo applicationInfo;
            Context a = FirebaseInstanceId.this.f8807e.mo14890a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        private final boolean m11636c() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f8807e.mo14890a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C2406p pVar, Executor executor, Executor executor2, C2331d dVar) {
        this.f8812j = false;
        if (C2406p.m11738a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f8804b == null) {
                    f8804b = new C2415y(firebaseApp.mo14890a());
                }
            }
            this.f8807e = firebaseApp;
            this.f8808f = pVar;
            if (this.f8809g == null) {
                C2392b bVar = (C2392b) firebaseApp.mo14891a(C2392b.class);
                if (bVar == null || !bVar.mo15003b()) {
                    this.f8809g = new C2383ar(firebaseApp, pVar, executor);
                } else {
                    this.f8809g = bVar;
                }
            }
            this.f8809g = this.f8809g;
            this.f8806d = executor2;
            this.f8811i = new C2368ac(f8804b);
            this.f8813k = new C2362a(dVar);
            this.f8810h = new C2409s(executor);
            if (this.f8813k.mo14970a()) {
                m11615l();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m11615l() {
        C2416z d = mo14963d();
        if (!mo14967i() || d == null || d.mo15048b(this.f8808f.mo15033b()) || this.f8811i.mo14981a()) {
            m11616m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final FirebaseApp mo14960b() {
        return this.f8807e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo14959a(boolean z) {
        this.f8812j = z;
    }

    /* renamed from: m */
    private final synchronized void m11616m() {
        if (!this.f8812j) {
            mo14955a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo14955a(long j) {
        m11609a((Runnable) new C2366aa(this, this.f8808f, this.f8811i, Math.min(Math.max(30, j << 1), f8803a)), j);
        this.f8812j = true;
    }

    /* renamed from: a */
    static void m11609a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f8805c == null) {
                f8805c = new ScheduledThreadPoolExecutor(1, new C0964a("FirebaseInstanceId"));
            }
            f8805c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public String mo14962c() {
        m11615l();
        return m11617n();
    }

    /* renamed from: n */
    private static String m11617n() {
        return C2406p.m11739a(f8804b.mo15045b("").mo15009a());
    }

    /* renamed from: b */
    private final C0741g<C2364a> m11610b(String str, String str2) {
        String c = m11613c(str2);
        C0742h hVar = new C0742h();
        this.f8806d.execute(new C2379an(this, str, str2, hVar, c));
        return hVar.mo9485a();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public final C2416z mo14963d() {
        return m11612c(C2406p.m11738a(this.f8807e), "*");
    }

    @Nullable
    /* renamed from: c */
    private static C2416z m11612c(String str, String str2) {
        return f8804b.mo15041a("", str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo14964e() {
        return mo14954a(C2406p.m11738a(this.f8807e), "*");
    }

    @WorkerThread
    /* renamed from: a */
    public String mo14954a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C2364a) m11608a(m11610b(str, str2))).mo14975a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    private final <T> T m11608a(C0741g<T> gVar) {
        try {
            return C0745j.m830a(gVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo14965g();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14956a(String str) {
        C2416z d = mo14963d();
        if (d == null || d.mo15048b(this.f8808f.mo15033b())) {
            throw new IOException("token not available");
        }
        m11608a(this.f8809g.mo14998a(m11617n(), d.f8935a, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14961b(String str) {
        C2416z d = mo14963d();
        if (d == null || d.mo15048b(this.f8808f.mo15033b())) {
            throw new IOException("token not available");
        }
        m11608a(this.f8809g.mo15002b(m11617n(), d.f8935a, str));
    }

    /* renamed from: f */
    static boolean m11614f() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo14965g() {
        f8804b.mo15046b();
        if (this.f8813k.mo14970a()) {
            m11616m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo14966h() {
        return this.f8809g.mo15003b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo14967i() {
        return this.f8809g.mo15001a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo14968j() {
        m11608a(this.f8809g.mo14997a(m11617n(), C2416z.m11776a(mo14963d())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo14969k() {
        f8804b.mo15047c("");
        m11616m();
    }

    /* renamed from: c */
    private static String m11613c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14957a(String str, String str2, C0742h hVar, String str3) {
        String n = m11617n();
        C2416z c = m11612c(str, str2);
        if (c == null || c.mo15048b(this.f8808f.mo15033b())) {
            this.f8810h.mo15037a(str, str3, new C2380ao(this, n, C2416z.m11776a(c), str, str3)).mo9475a(this.f8806d, new C2381ap(this, str, str3, hVar, n));
            return;
        }
        hVar.mo9487a(new C2389ax(n, c.f8935a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14958a(String str, String str2, C0742h hVar, String str3, C0741g gVar) {
        if (gVar.mo9481b()) {
            String str4 = (String) gVar.mo9483d();
            f8804b.mo15044a("", str, str2, str4, this.f8808f.mo15033b());
            hVar.mo9487a(new C2389ax(str3, str4));
            return;
        }
        hVar.mo9486a(gVar.mo9484e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C0741g mo14953a(String str, String str2, String str3, String str4) {
        return this.f8809g.mo14999a(str, str2, str3, str4);
    }
}
