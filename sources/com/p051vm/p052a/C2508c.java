package com.p051vm.p052a;

import android.content.Context;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import com.p051vm.p062vo.login.LoginResp;
import com.p051vm.rest.LoginClient;

/* renamed from: com.vm.a.c */
/* compiled from: LoginCache */
public class C2508c {

    /* renamed from: b */
    private static C2508c f8957b;

    /* renamed from: a */
    private Context f8958a;

    private C2508c(Context context) {
        this.f8958a = context;
    }

    /* renamed from: a */
    public static C2508c m11798a(Context context) {
        if (f8957b == null) {
            f8957b = new C2508c(context);
        }
        return f8957b;
    }

    /* renamed from: a */
    public void mo15465a(String str, String str2) {
        C2513a.m11818a(this.f8958a).mo15483b(Constants.TOKEN_KEY, str);
        C2513a.m11818a(this.f8958a).mo15483b(Constants.AES_KEY, str2);
    }

    /* renamed from: a */
    public String mo15464a() {
        return C2513a.m11818a(this.f8958a).mo15481a(Constants.TOKEN_KEY);
    }

    /* renamed from: b */
    public String mo15466b() {
        LoginResp login;
        String a = C2513a.m11818a(this.f8958a).mo15481a(Constants.TOKEN_KEY);
        if (a != null || (login = LoginClient.login(this.f8958a)) == null) {
            return a;
        }
        String token = login.getToken();
        mo15465a(token, login.getAuthKey());
        return token;
    }

    /* renamed from: c */
    public String mo15467c() {
        return C2513a.m11818a(this.f8958a).mo15481a(Constants.AES_KEY);
    }
}
