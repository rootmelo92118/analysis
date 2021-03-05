package com.p051vm.rest;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.p051vm.p052a.C2508c;
import com.p051vm.p052a.C2509d;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.user.PackageInfoReq;
import com.p051vm.p062vo.user.PackageInfoResp;
import com.p051vm.p062vo.user.UserInfoReq;
import com.p051vm.p062vo.user.UserInfoResp;
import java.util.ArrayList;

/* renamed from: com.vm.rest.UserClient */
public class UserClient {
    private static final String UPDATE_PACKAGE_URL_RELATIV_PATH = "/asset/v1/upload-pack";
    private static final String USER_INFO_URL_RELATIV_PATH = "/asset/v1/u-property";

    public static UserInfoResp getUserInfo(Context context) {
        String a;
        new ArrayList();
        UserInfoReq userInfoReq = new UserInfoReq(new C2521a.C2522a(context));
        String a2 = C2508c.m11798a(context).mo15464a();
        if (a2 == null || (a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/asset/v1/u-property", userInfoReq, a2)) == null) {
            return null;
        }
        return (UserInfoResp) new Gson().fromJson(new JsonParser().parse(a).getAsJsonObject().get("data"), UserInfoResp.class);
    }

    public static PackageInfoResp updatePackageList(Context context) {
        String a;
        PackageInfoReq packageInfoReq = new PackageInfoReq(new C2521a.C2522a(context));
        packageInfoReq.setPackageInfos(C2509d.m11803a(context).mo15469b());
        String a2 = C2508c.m11798a(context).mo15464a();
        if (a2 == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a2 = C2508c.m11798a(context).mo15464a();
        }
        if (a2 == null || (a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/asset/v1/upload-pack", packageInfoReq, a2)) == null) {
            return null;
        }
        return (PackageInfoResp) new Gson().fromJson(new JsonParser().parse(a).getAsJsonObject().get("data"), PackageInfoResp.class);
    }
}
