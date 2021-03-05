package com.p051vm.p052a;

import android.content.Context;
import com.google.gson.Gson;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import java.io.Serializable;

/* renamed from: com.vm.a.b */
/* compiled from: CouponCache */
public class C2506b {

    /* renamed from: b */
    private static C2506b f8952b;

    /* renamed from: a */
    private Context f8953a;

    private C2506b(Context context) {
        this.f8953a = context;
    }

    /* renamed from: a */
    public static C2506b m11792a(Context context) {
        if (f8952b == null) {
            f8952b = new C2506b(context);
        }
        return f8952b;
    }

    /* renamed from: a */
    public void mo15460a(C2507a aVar) {
        C2513a.m11818a(this.f8953a).mo15483b(Constants.INVITE_COUPON_KEY, new Gson().toJson((Object) aVar));
    }

    /* renamed from: a */
    public C2507a mo15459a() {
        String a = C2513a.m11818a(this.f8953a).mo15481a(Constants.INVITE_COUPON_KEY);
        if (a == null) {
            return null;
        }
        return (C2507a) new Gson().fromJson(a, C2507a.class);
    }

    /* renamed from: com.vm.a.b$a */
    /* compiled from: CouponCache */
    public static class C2507a implements Serializable {

        /* renamed from: a */
        private String f8954a;

        /* renamed from: b */
        private String f8955b;

        /* renamed from: c */
        private String f8956c;

        public C2507a(String str, String str2, String str3) {
            this.f8954a = str;
            this.f8955b = str2;
            this.f8956c = str3;
        }

        /* renamed from: a */
        public String mo15461a() {
            return this.f8954a;
        }

        /* renamed from: b */
        public String mo15462b() {
            return this.f8955b;
        }

        /* renamed from: c */
        public String mo15463c() {
            return this.f8956c;
        }
    }
}
