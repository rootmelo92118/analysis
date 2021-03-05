package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.GuardedBy;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C2295r extends C2190bt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public char f8615a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f8616b = -1;
    @GuardedBy("this")

    /* renamed from: c */
    private String f8617c;

    /* renamed from: d */
    private final C2297t f8618d = new C2297t(this, 6, false, false);

    /* renamed from: e */
    private final C2297t f8619e = new C2297t(this, 6, true, false);

    /* renamed from: f */
    private final C2297t f8620f = new C2297t(this, 6, false, true);

    /* renamed from: g */
    private final C2297t f8621g = new C2297t(this, 5, false, false);

    /* renamed from: h */
    private final C2297t f8622h = new C2297t(this, 5, true, false);

    /* renamed from: i */
    private final C2297t f8623i = new C2297t(this, 5, false, true);

    /* renamed from: j */
    private final C2297t f8624j = new C2297t(this, 4, false, false);

    /* renamed from: k */
    private final C2297t f8625k = new C2297t(this, 3, false, false);

    /* renamed from: l */
    private final C2297t f8626l = new C2297t(this, 2, false, false);

    C2295r(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14253e() {
        return false;
    }

    /* renamed from: d_ */
    public final C2297t mo14830d_() {
        return this.f8618d;
    }

    /* renamed from: g */
    public final C2297t mo14831g() {
        return this.f8619e;
    }

    /* renamed from: h */
    public final C2297t mo14832h() {
        return this.f8620f;
    }

    /* renamed from: i */
    public final C2297t mo14833i() {
        return this.f8621g;
    }

    /* renamed from: j */
    public final C2297t mo14834j() {
        return this.f8622h;
    }

    /* renamed from: k */
    public final C2297t mo14835k() {
        return this.f8623i;
    }

    /* renamed from: v */
    public final C2297t mo14836v() {
        return this.f8624j;
    }

    /* renamed from: w */
    public final C2297t mo14837w() {
        return this.f8625k;
    }

    /* renamed from: x */
    public final C2297t mo14838x() {
        return this.f8626l;
    }

    /* renamed from: a */
    protected static Object m11413a(String str) {
        if (str == null) {
            return null;
        }
        return new C2298u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14828a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo14829a(i)) {
            mo14827a(i, m11415a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C0926p.m1306a(str);
            C2161ar g = this.f8222q.mo14322g();
            if (g == null) {
                mo14827a(6, "Scheduler not set. Not logging error/warn");
            } else if (!g.mo14380z()) {
                mo14827a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                g.mo14296a((Runnable) new C2296s(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14829a(int i) {
        return Log.isLoggable(m11409D(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14827a(int i, String str) {
        Log.println(i, m11409D(), str);
    }

    /* renamed from: D */
    private final String m11409D() {
        String str;
        synchronized (this) {
            if (this.f8617c == null) {
                if (this.f8222q.mo14331t() != null) {
                    this.f8617c = this.f8222q.mo14331t();
                } else {
                    this.f8617c = C2272et.m11152e();
                }
            }
            str = this.f8617c;
        }
        return str;
    }

    /* renamed from: a */
    static String m11415a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m11414a(z, obj);
        String a2 = m11414a(z, obj2);
        String a3 = m11414a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m11414a(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m11417b(AppMeasurement.class.getCanonicalName());
                String b2 = m11417b(C2166aw.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                        String b3 = m11417b(className);
                        if (b3.equals(b) || b3.equals(b2)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C2298u) {
                return ((C2298u) obj).f8637a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: b */
    private static String m11417b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: y */
    public final String mo14839y() {
        Pair<String, Long> a = mo14236s().f8043b.mo14267a();
        if (a == null || a == C2147ad.f8042a) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
