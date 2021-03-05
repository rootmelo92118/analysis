package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C0979o;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.p */
public final class C2406p {

    /* renamed from: a */
    private final Context f8905a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f8906b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f8907c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f8908d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f8909e = 0;

    public C2406p(Context context) {
        this.f8905a = context;
    }

    /* renamed from: a */
    public final synchronized int mo15032a() {
        if (this.f8909e != 0) {
            return this.f8909e;
        }
        PackageManager packageManager = this.f8905a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C0979o.m1510k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8909e = 1;
                return this.f8909e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C0979o.m1510k()) {
                this.f8909e = 2;
            } else {
                this.f8909e = 1;
            }
            return this.f8909e;
        }
        this.f8909e = 2;
        return this.f8909e;
    }

    /* renamed from: a */
    public static String m11738a(FirebaseApp firebaseApp) {
        String b = firebaseApp.mo14893c().mo14914b();
        if (b != null) {
            return b;
        }
        String a = firebaseApp.mo14893c().mo14913a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m11739a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized String mo15033b() {
        if (this.f8906b == null) {
            m11740e();
        }
        return this.f8906b;
    }

    /* renamed from: c */
    public final synchronized String mo15034c() {
        if (this.f8907c == null) {
            m11740e();
        }
        return this.f8907c;
    }

    /* renamed from: d */
    public final synchronized int mo15035d() {
        PackageInfo a;
        if (this.f8908d == 0 && (a = m11737a("com.google.android.gms")) != null) {
            this.f8908d = a.versionCode;
        }
        return this.f8908d;
    }

    /* renamed from: e */
    private final synchronized void m11740e() {
        PackageInfo a = m11737a(this.f8905a.getPackageName());
        if (a != null) {
            this.f8906b = Integer.toString(a.versionCode);
            this.f8907c = a.versionName;
        }
    }

    /* renamed from: a */
    private final PackageInfo m11737a(String str) {
        try {
            return this.f8905a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
