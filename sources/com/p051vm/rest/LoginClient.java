package com.p051vm.rest;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.login.LoginReq;
import com.p051vm.p062vo.login.LoginResp;

/* renamed from: com.vm.rest.LoginClient */
public class LoginClient {
    private static final String URL_RELATIV_PATH = "/login/v1/silent-login";

    public static LoginResp login(Context context) {
        String a = C2534c.m11864a("http://api.happymobi.net:8899/happymobi-api/login/v1/silent-login", new LoginReq(new C2521a.C2522a(context)));
        if (a == null) {
            return null;
        }
        return (LoginResp) new Gson().fromJson(new JsonParser().parse(a).getAsJsonObject().get("data"), LoginResp.class);
    }
}
