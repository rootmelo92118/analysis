package com.p051vm.rest;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.p051vm.p052a.C2508c;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.feedback.FeedbackConnectReq;
import com.p051vm.p062vo.feedback.FeedbackConnectResp;
import java.util.ArrayList;

/* renamed from: com.vm.rest.FeedbackClient */
public class FeedbackClient {
    private static final String URL_RELATIV_PATH = "/feedback/v1/connect-feedback";

    public static FeedbackConnectResp getConnectInfo(Context context, String str) {
        JsonElement jsonElement;
        new ArrayList();
        String a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/feedback/v1/connect-feedback", new FeedbackConnectReq(new C2521a.C2522a(context), str), C2508c.m11798a(context).mo15464a());
        if (a == null || (jsonElement = new JsonParser().parse(a).getAsJsonObject().get("data")) == null) {
            return null;
        }
        return (FeedbackConnectResp) new Gson().fromJson(jsonElement, FeedbackConnectResp.class);
    }
}
