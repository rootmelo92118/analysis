package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C0732b {

    /* renamed from: a */
    private static final Lock f710a = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: b */
    private static C0732b f711b;

    /* renamed from: c */
    private final Lock f712c = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: d */
    private final SharedPreferences f713d;

    /* renamed from: a */
    public static C0732b m802a(Context context) {
        C0926p.m1306a(context);
        f710a.lock();
        try {
            if (f711b == null) {
                f711b = new C0732b(context.getApplicationContext());
            }
            return f711b;
        } finally {
            f710a.unlock();
        }
    }

    private C0732b(Context context) {
        this.f713d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo9464a() {
        return m801a(m804b("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m801a(String str) {
        String b;
        if (TextUtils.isEmpty(str) || (b = m804b(m803a("googleSignInAccount", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m773a(b);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    private final String m804b(String str) {
        this.f712c.lock();
        try {
            return this.f713d.getString(str, (String) null);
        } finally {
            this.f712c.unlock();
        }
    }

    /* renamed from: a */
    private static String m803a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
