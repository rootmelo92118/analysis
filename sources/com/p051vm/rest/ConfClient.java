package com.p051vm.rest;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.login.LoginReq;

/* renamed from: com.vm.rest.ConfClient */
public class ConfClient {
    private static final String URL_RELATIV_PATH = "/distribute/v1/conf";

    public static JsonObject getConfInfo(Context context) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        String a = C2534c.m11864a("http://api.happymobi.net:8899/happymobi-api/distribute/v1/conf", new LoginReq(new C2521a.C2522a(context)));
        if (a == null || (jsonElement = new JsonParser().parse(a).getAsJsonObject().get("data")) == null || (jsonElement2 = jsonElement.getAsJsonObject().get("confMap")) == null) {
            return null;
        }
        return jsonElement2.getAsJsonObject();
    }
}
