package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.p004a.p005a.C0005b;
import p000a.p001a.p002a.p003a.p004a.p005a.C0007d;

/* renamed from: a.a.a.a.a.b.s */
/* compiled from: InstallerPackageNameProvider */
public class C0038s {

    /* renamed from: a */
    private final C0007d<String> f76a = new C0007d<String>() {
        /* renamed from: a */
        public String load(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };

    /* renamed from: b */
    private final C0005b<String> f77b = new C0005b<>();

    /* renamed from: a */
    public String mo75a(Context context) {
        try {
            String a = this.f77b.mo18a(context, this.f76a);
            if ("".equals(a)) {
                return null;
            }
            return a;
        } catch (Exception e) {
            C0139c.m394g().mo291e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
