package com.p051vm.p052a;

import android.content.Context;
import com.p051vm.p053b.p054a.C2513a;

/* renamed from: com.vm.a.e */
/* compiled from: STSUserCache */
public class C2510e {

    /* renamed from: a */
    private static C2510e f8961a;

    /* renamed from: b */
    private Context f8962b;

    /* renamed from: c */
    private final String f8963c = "STS_USER_OPEN_TIME";

    /* renamed from: d */
    private final String f8964d = "STS_HAVA_RATE_FLAG";

    /* renamed from: e */
    private final String f8965e = "STS_DENY_RATE_TIME";

    private C2510e(Context context) {
        this.f8962b = context;
    }

    /* renamed from: a */
    public static C2510e m11806a(Context context) {
        if (f8961a == null) {
            f8961a = new C2510e(context);
        }
        return f8961a;
    }

    /* renamed from: a */
    public void mo15470a() {
        int i;
        String a = C2513a.m11818a(this.f8962b).mo15481a("STS_USER_OPEN_TIME");
        if (a == null) {
            i = 0;
        } else {
            i = Integer.parseInt(a);
        }
        C2513a a2 = C2513a.m11818a(this.f8962b);
        a2.mo15483b("STS_USER_OPEN_TIME", (i + 1) + "");
    }

    /* renamed from: b */
    public int mo15471b() {
        String a = C2513a.m11818a(this.f8962b).mo15481a("STS_USER_OPEN_TIME");
        if (a == null) {
            return 0;
        }
        return Integer.parseInt(a);
    }

    /* renamed from: c */
    public void mo15472c() {
        C2513a.m11818a(this.f8962b).mo15483b("STS_HAVA_RATE_FLAG", "1");
    }

    /* renamed from: d */
    public boolean mo15473d() {
        return C2513a.m11818a(this.f8962b).mo15481a("STS_HAVA_RATE_FLAG") != null;
    }

    /* renamed from: e */
    public void mo15474e() {
        int i;
        String a = C2513a.m11818a(this.f8962b).mo15481a("STS_DENY_RATE_TIME");
        if (a == null) {
            i = 0;
        } else {
            i = Integer.parseInt(a);
        }
        C2513a a2 = C2513a.m11818a(this.f8962b);
        a2.mo15483b("STS_DENY_RATE_TIME", (i + 1) + "");
    }

    /* renamed from: f */
    public int mo15475f() {
        String a = C2513a.m11818a(this.f8962b).mo15481a("STS_DENY_RATE_TIME");
        if (a == null) {
            return 0;
        }
        return Integer.parseInt(a);
    }
}
