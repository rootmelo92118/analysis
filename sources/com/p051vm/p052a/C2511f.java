package com.p051vm.p052a;

import android.content.Context;
import com.google.gson.Gson;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import java.io.Serializable;

/* renamed from: com.vm.a.f */
/* compiled from: UserInfoCache */
public class C2511f {

    /* renamed from: b */
    private static C2511f f8966b;

    /* renamed from: a */
    private Context f8967a;

    private C2511f(Context context) {
        this.f8967a = context;
    }

    /* renamed from: a */
    public static C2511f m11813a(Context context) {
        if (f8966b == null) {
            f8966b = new C2511f(context);
        }
        return f8966b;
    }

    /* renamed from: a */
    public void mo15477a(C2512a aVar) {
        if (aVar != null) {
            C2513a.m11818a(this.f8967a).mo15483b(Constants.USER_INFO_KEY, new Gson().toJson((Object) aVar));
        }
    }

    /* renamed from: a */
    public C2512a mo15476a() {
        String a = C2513a.m11818a(this.f8967a).mo15481a(Constants.USER_INFO_KEY);
        if (a == null) {
            return null;
        }
        return (C2512a) new Gson().fromJson(a, C2512a.class);
    }

    /* renamed from: com.vm.a.f$a */
    /* compiled from: UserInfoCache */
    public static class C2512a implements Serializable {

        /* renamed from: a */
        private long f8968a;

        /* renamed from: b */
        private Integer f8969b;

        /* renamed from: c */
        private int f8970c;

        public C2512a() {
        }

        public C2512a(long j, Integer num) {
            this.f8968a = j;
            this.f8969b = num;
        }

        /* renamed from: a */
        public Integer mo15478a() {
            return Integer.valueOf(this.f8970c);
        }

        /* renamed from: a */
        public void mo15479a(Integer num) {
            this.f8970c = num.intValue();
        }

        public String toString() {
            return "UserInfoVO{memberId=" + this.f8968a + ", memberType=" + this.f8969b + ", msgId=" + this.f8970c + '}';
        }
    }
}
