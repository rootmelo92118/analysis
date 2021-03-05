package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import android.util.Log;

@C1598qn
public class aai {
    /* renamed from: b */
    public static void m1624b(String str) {
        if (m1623a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: a */
    public static void m1622a(String str, Throwable th) {
        if (m1623a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m1626c(String str) {
        if (m1623a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m1625b(String str, Throwable th) {
        if (m1623a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m1628d(String str) {
        if (m1623a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: e */
    public static void m1630e(String str) {
        if (m1623a(5)) {
            Log.w("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m1627c(String str, Throwable th) {
        if (m1623a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: a */
    private static String m1621a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: d */
    public static void m1629d(String str, @Nullable Throwable th) {
        if (!m1623a(5)) {
            return;
        }
        if (th != null) {
            m1627c(m1621a(str), th);
        } else {
            m1630e(m1621a(str));
        }
    }

    /* renamed from: f */
    public static void m1631f(String str) {
        m1629d(str, (Throwable) null);
    }

    /* renamed from: a */
    public static boolean m1623a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
