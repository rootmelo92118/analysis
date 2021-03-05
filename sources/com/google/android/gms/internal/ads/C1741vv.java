package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C0858g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.vv */
public final class C1741vv {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f6657a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f6658b = new Object();
    @Nullable
    @GuardedBy("mGmpAppIdLock")

    /* renamed from: c */
    private String f6659c = null;
    @Nullable
    @GuardedBy("mGmpAppIdLock")

    /* renamed from: d */
    private String f6660d = null;

    /* renamed from: e */
    private final AtomicBoolean f6661e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f6662f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f6663g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private final AtomicReference<Object> f6664h = new AtomicReference<>((Object) null);

    /* renamed from: i */
    private ConcurrentMap<String, Method> f6665i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<ahp> f6666j = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")

    /* renamed from: k */
    private final List<FutureTask> f6667k = new ArrayList();

    /* renamed from: a */
    public final boolean mo13075a(Context context) {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5921ac)).booleanValue() || this.f6661e.get()) {
            return false;
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5928aj)).booleanValue()) {
            return true;
        }
        if (this.f6662f.get() == -1) {
            bre.m6317a();
            if (!C1851zx.m8599c(context, C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                bre.m6317a();
                if (C1851zx.m8598c(context)) {
                    C1772wz.m1630e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f6662f.set(0);
                }
            }
            this.f6662f.set(1);
        }
        if (this.f6662f.get() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo13072a(Context context, String str) {
        if (mo13075a(context)) {
            m8178b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final void mo13077b(Context context, String str) {
        if (mo13075a(context)) {
            m8178b(context, str, "endAdUnitExposure");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo13076b(android.content.Context r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo13075a(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r5 = ""
            return r5
        L_0x0009:
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurement"
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.f6663g
            r2 = 1
            boolean r0 = r4.m8177a(r5, r0, r1, r2)
            if (r0 != 0) goto L_0x0017
            java.lang.String r5 = ""
            return r5
        L_0x0017:
            r0 = 0
            java.lang.String r1 = "getCurrentScreenName"
            java.lang.reflect.Method r1 = r4.m8181h(r5, r1)     // Catch:{ Exception -> 0x0049 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r4.f6663g     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0049 }
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = "getCurrentScreenClass"
            java.lang.reflect.Method r5 = r4.m8181h(r5, r1)     // Catch:{ Exception -> 0x0049 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.f6663g     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r5 = r5.invoke(r1, r2)     // Catch:{ Exception -> 0x0049 }
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0049 }
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r5 = ""
            return r5
        L_0x0049:
            r5 = move-exception
            java.lang.String r1 = "getCurrentScreenName"
            r4.m8176a((java.lang.Exception) r5, (java.lang.String) r1, (boolean) r0)
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1741vv.mo13076b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public final void mo13079c(Context context, String str) {
        if (mo13075a(context) && (context instanceof Activity) && m8177a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f6664h, false)) {
            Method i = m8182i(context, "setCurrentScreen");
            try {
                i.invoke(this.f6664h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                m8176a(e, "setCurrentScreen", false);
            }
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo13078c(Context context) {
        if (!mo13075a(context)) {
            return null;
        }
        synchronized (this.f6658b) {
            if (this.f6659c != null) {
                String str = this.f6659c;
                return str;
            }
            this.f6659c = (String) m8174a("getGmpAppId", context);
            String str2 = this.f6659c;
            return str2;
        }
    }

    @Nullable
    /* renamed from: d */
    public final String mo13080d(Context context) {
        if (!mo13075a(context)) {
            return null;
        }
        long longValue = ((Long) bre.m6321e().mo12778a(C1557p.f5926ah)).longValue();
        if (longValue < 0) {
            return (String) m8174a("getAppInstanceId", context);
        }
        if (this.f6657a.get() == null) {
            this.f6657a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) bre.m6321e().mo12778a(C1557p.f5927ai)).intValue(), ((Integer) bre.m6321e().mo12778a(C1557p.f5927ai)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C1743vx(this)));
        }
        Future submit = this.f6657a.get().submit(new C1742vw(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public final String mo13082e(Context context) {
        Object a;
        if (mo13075a(context) && (a = m8174a("generateEventId", context)) != null) {
            return a.toString();
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public final String mo13084f(Context context) {
        if (!mo13075a(context)) {
            return null;
        }
        synchronized (this.f6658b) {
            if (this.f6660d != null) {
                String str = this.f6660d;
                return str;
            }
            this.f6660d = "fa";
            String str2 = this.f6660d;
            return str2;
        }
    }

    /* renamed from: d */
    public final void mo13081d(Context context, String str) {
        mo13073a(context, "_ac", str);
    }

    /* renamed from: e */
    public final void mo13083e(Context context, String str) {
        mo13073a(context, "_ai", str);
    }

    /* renamed from: f */
    public final void mo13085f(Context context, String str) {
        mo13073a(context, "_aq", str);
    }

    /* renamed from: a */
    public final void mo13074a(Context context, String str, String str2, String str3, int i) {
        if (mo13075a(context)) {
            Bundle a = m8173a(str, false);
            a.putString("_ai", str2);
            a.putString("type", str3);
            a.putInt("value", i);
            m8175a(context, "_ar", a);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C1772wz.m8287a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo13073a(Context context, String str, String str2) {
        if (mo13075a(context)) {
            m8175a(context, str, m8173a(str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    private final void m8175a(Context context, String str, Bundle bundle) {
        if (mo13075a(context) && m8177a(context, "com.google.android.gms.measurement.AppMeasurement", this.f6663g, true)) {
            Method h = m8180h(context);
            try {
                h.invoke(this.f6663g.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m8176a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m8173a(String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            C1772wz.m1625b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: h */
    private final Method m8180h(Context context) {
        Method method = (Method) this.f6665i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f6665i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m8176a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: g */
    private final Method m8179g(Context context, String str) {
        Method method = (Method) this.f6665i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f6665i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m8176a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m8181h(Context context, String str) {
        Method method = (Method) this.f6665i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f6665i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m8176a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m8182i(Context context, String str) {
        Method method = (Method) this.f6665i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f6665i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m8176a(e, str, false);
            return null;
        }
    }

    /* renamed from: b */
    private final void m8178b(Context context, String str, String str2) {
        if (m8177a(context, "com.google.android.gms.measurement.AppMeasurement", this.f6663g, true)) {
            Method g = m8179g(context, str2);
            try {
                g.invoke(this.f6663g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C1772wz.m8287a(sb.toString());
            } catch (Exception e) {
                m8176a(e, str2, false);
            }
        }
    }

    /* renamed from: a */
    private final Object m8174a(String str, Context context) {
        if (!m8177a(context, "com.google.android.gms.measurement.AppMeasurement", this.f6663g, true)) {
            return null;
        }
        try {
            return m8181h(context, str).invoke(this.f6663g.get(), new Object[0]);
        } catch (Exception e) {
            m8176a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m8176a(Exception exc, String str, boolean z) {
        if (!this.f6661e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C1772wz.m1630e(sb.toString());
            if (z) {
                C1772wz.m1630e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f6661e.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m8177a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                m8176a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ String mo13086g(Context context) {
        return (String) m8174a("getAppInstanceId", context);
    }
}
