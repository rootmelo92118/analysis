package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;

/* renamed from: a.a.a.a.a.b.g */
/* compiled from: ApiKey */
public class C0018g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo39a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* renamed from: a */
    public String mo40a(Context context) {
        String c = mo42c(context);
        if (TextUtils.isEmpty(c)) {
            c = mo43d(context);
        }
        if (TextUtils.isEmpty(c)) {
            c = mo41b(context);
        }
        if (TextUtils.isEmpty(c)) {
            mo44e(context);
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo41b(Context context) {
        return new C0035q().mo56a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo42c(Context context) {
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C0139c.m394g().mo281a("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                C0139c.m394g().mo281a("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str = string;
                C0153l g = C0139c.m394g();
                g.mo281a("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
                return str;
            }
        } catch (Exception e2) {
            e = e2;
            C0153l g2 = C0139c.m394g();
            g2.mo281a("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo43d(Context context) {
        int a = C0020i.m40a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            C0139c.m394g().mo281a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = C0020i.m40a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo44e(Context context) {
        if (C0139c.m395h() || C0020i.m78i(context)) {
            throw new IllegalArgumentException(mo39a());
        }
        C0139c.m394g().mo290e("Fabric", mo39a());
    }
}
