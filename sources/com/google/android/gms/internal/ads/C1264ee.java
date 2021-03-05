package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ee */
public class C1264ee {

    /* renamed from: a */
    public static boolean f5336a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static String f5337b = "Volley";

    /* renamed from: c */
    private static final String f5338c = C1264ee.class.getName();

    /* renamed from: a */
    public static void m6815a(String str, Object... objArr) {
        if (f5336a) {
            Log.v(f5337b, m6819d(str, objArr));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ee$a */
    static class C1265a {

        /* renamed from: a */
        public static final boolean f5339a = C1264ee.f5336a;

        /* renamed from: b */
        private final List<C1290fc> f5340b = new ArrayList();

        /* renamed from: c */
        private boolean f5341c = false;

        C1265a() {
        }

        /* renamed from: a */
        public final synchronized void mo12515a(String str, long j) {
            if (!this.f5341c) {
                this.f5340b.add(new C1290fc(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: a */
        public final synchronized void mo12514a(String str) {
            long j;
            this.f5341c = true;
            if (this.f5340b.size() == 0) {
                j = 0;
            } else {
                j = this.f5340b.get(this.f5340b.size() - 1).f5362c - this.f5340b.get(0).f5362c;
            }
            if (j > 0) {
                long j2 = this.f5340b.get(0).f5362c;
                C1264ee.m6817b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C1290fc next : this.f5340b) {
                    long j3 = next.f5362c;
                    C1264ee.m6817b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f5361b), next.f5360a);
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f5341c) {
                mo12514a("Request on the loose");
                C1264ee.m6818c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static void m6817b(String str, Object... objArr) {
        Log.d(f5337b, m6819d(str, objArr));
    }

    /* renamed from: c */
    public static void m6818c(String str, Object... objArr) {
        Log.e(f5337b, m6819d(str, objArr));
    }

    /* renamed from: a */
    public static void m6816a(Throwable th, String str, Object... objArr) {
        Log.e(f5337b, m6819d(str, objArr), th);
    }

    /* renamed from: d */
    private static String m6819d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (!stackTrace[i].getClassName().equals(f5338c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
