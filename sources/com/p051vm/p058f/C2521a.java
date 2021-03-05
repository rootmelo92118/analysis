package com.p051vm.p058f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import java.util.Locale;

/* renamed from: com.vm.f.a */
/* compiled from: MobileInfoUtil */
public class C2521a {
    /* renamed from: c */
    public static String m11835c() {
        return "com.vm.shadowsocks.sockhome";
    }

    /* renamed from: a */
    public static String m11832a(Context context) {
        return Settings.System.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: a */
    public static String m11831a() {
        return Build.BRAND;
    }

    /* renamed from: b */
    public static String m11833b() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public static String m11837d() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: e */
    public static String m11839e() {
        return System.getProperty("os.version");
    }

    /* renamed from: f */
    public static String m11840f() {
        return Build.VERSION.SDK;
    }

    /* renamed from: b */
    public static String m11834b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode + "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m11836c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m11838d(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: com.vm.f.a$a */
    /* compiled from: MobileInfoUtil */
    public static class C2522a {

        /* renamed from: a */
        private String f8984a;

        /* renamed from: b */
        private String f8985b;

        /* renamed from: c */
        private String f8986c;

        /* renamed from: d */
        private String f8987d;

        /* renamed from: e */
        private String f8988e;

        /* renamed from: f */
        private String f8989f;

        /* renamed from: g */
        private String f8990g;

        /* renamed from: h */
        private String f8991h;

        /* renamed from: i */
        private String f8992i;

        /* renamed from: j */
        private String f8993j;

        public C2522a() {
        }

        public C2522a(Context context) {
            this.f8984a = C2521a.m11832a(context);
            this.f8985b = C2521a.m11831a();
            this.f8986c = C2521a.m11837d();
            this.f8987d = C2521a.m11833b();
            this.f8988e = C2521a.m11835c();
            this.f8989f = C2521a.m11839e();
            this.f8990g = C2521a.m11840f();
            this.f8991h = C2521a.m11834b(context);
            this.f8992i = C2521a.m11836c(context);
            this.f8993j = C2521a.m11838d(context);
        }

        /* renamed from: a */
        public String mo15493a() {
            return this.f8984a;
        }

        /* renamed from: b */
        public String mo15494b() {
            return this.f8985b;
        }

        /* renamed from: c */
        public String mo15495c() {
            return this.f8986c;
        }

        /* renamed from: d */
        public String mo15496d() {
            return this.f8987d;
        }

        /* renamed from: e */
        public String mo15497e() {
            return this.f8988e;
        }

        /* renamed from: f */
        public String mo15498f() {
            return this.f8989f;
        }

        /* renamed from: g */
        public String mo15499g() {
            return this.f8991h;
        }

        /* renamed from: h */
        public String mo15500h() {
            return this.f8992i;
        }

        /* renamed from: i */
        public String mo15501i() {
            return this.f8993j;
        }

        public String toString() {
            return "MobileInfo{androidId='" + this.f8984a + '\'' + ", brand='" + this.f8985b + '\'' + ", language='" + this.f8986c + '\'' + ", model='" + this.f8987d + '\'' + ", packageName='" + this.f8988e + '\'' + ", system='" + this.f8989f + '\'' + ", apiLevel='" + this.f8990g + '\'' + ", versionCode='" + this.f8991h + '\'' + ", versionName='" + this.f8992i + '\'' + ", country='" + this.f8993j + '\'' + '}';
        }
    }
}
