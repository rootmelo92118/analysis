package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import android.text.TextUtils;
import p000a.p001a.p002a.p003a.C0139c;

/* renamed from: a.a.a.a.a.b.q */
/* compiled from: FirebaseInfo */
public class C0035q {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo56a(Context context) {
        int a = C0020i.m40a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C0139c.m394g().mo281a("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return mo57a(context.getResources().getString(a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo57a(String str) {
        return C0020i.m67b(str).substring(0, 40);
    }

    /* renamed from: b */
    public boolean mo58b(Context context) {
        if (C0020i.m61a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (!mo61e(context) || mo59c(context)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo59c(Context context) {
        if (!TextUtils.isEmpty(new C0018g().mo42c(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C0018g().mo43d(context));
    }

    /* renamed from: d */
    public boolean mo60d(Context context) {
        int a = C0020i.m40a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C0139c.m394g().mo281a("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo61e(Context context) {
        int a = C0020i.m40a(context, "google_app_id", "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }

    /* renamed from: f */
    public boolean mo62f(Context context) {
        C0033o a = C0034p.m98a(context);
        if (a == null) {
            return true;
        }
        return a.mo55a();
    }
}
