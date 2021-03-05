package com.p051vm.rest;

import android.content.Context;
import android.support.p034v4.app.NotificationCompat;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.p051vm.p052a.C2506b;
import com.p051vm.p052a.C2508c;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.invite.ActivateCouponReq;
import com.p051vm.p062vo.invite.ActivateCouponResp;
import com.p051vm.p062vo.invite.CouponReq;
import com.p051vm.p062vo.invite.CouponResp;
import java.util.ArrayList;

/* renamed from: com.vm.rest.InviteClient */
public class InviteClient {
    private static final String ACTIVATE_URL_RELATIV_PATH = "/invite/v1/activate-coupon";
    private static final String GET_URL_RELATIV_PATH = "/invite/v1/invite-coupon";

    public static CouponResp getCoupon(Context context) {
        String a;
        C2506b.C2507a a2 = C2506b.m11792a(context).mo15459a();
        if (a2 == null) {
            new ArrayList();
            CouponReq couponReq = new CouponReq(new C2521a.C2522a(context));
            String a3 = C2508c.m11798a(context).mo15464a();
            if (a3 == null) {
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a3 = C2508c.m11798a(context).mo15464a();
            }
            if (a3 == null || (a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/invite/v1/invite-coupon", couponReq, a3)) == null) {
                return null;
            }
            JsonElement parse = new JsonParser().parse(a);
            CouponResp couponResp = (CouponResp) new Gson().fromJson(parse.getAsJsonObject().get("data"), CouponResp.class);
            if (couponResp == null) {
                couponResp = new CouponResp();
            }
            couponResp.setSuccess(Boolean.valueOf(parse.getAsJsonObject().get("success").getAsBoolean()));
            couponResp.setMsg(parse.getAsJsonObject().get(NotificationCompat.CATEGORY_MESSAGE).getAsString());
            if (!couponResp.isSuccess().booleanValue()) {
                return couponResp;
            }
            C2506b.m11792a(context).mo15460a(new C2506b.C2507a(couponResp.getCouponCode(), couponResp.getActivatedStatus(), couponResp.getActivateStatus()));
            return couponResp;
        }
        CouponResp couponResp2 = new CouponResp();
        couponResp2.setActivatedStatus(a2.mo15462b());
        couponResp2.setActivateStatus(a2.mo15463c());
        couponResp2.setCouponCode(a2.mo15461a());
        return couponResp2;
    }

    public static ActivateCouponResp activateCoupon(Context context, String str) {
        new ArrayList();
        String a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/invite/v1/activate-coupon", new ActivateCouponReq(new C2521a.C2522a(context), str), C2508c.m11798a(context).mo15464a());
        if (a == null) {
            return null;
        }
        JsonElement parse = new JsonParser().parse(a);
        Boolean valueOf = Boolean.valueOf(parse.getAsJsonObject().get("success").getAsBoolean());
        ActivateCouponResp activateCouponResp = (ActivateCouponResp) new Gson().fromJson(parse.getAsJsonObject().get("data"), ActivateCouponResp.class);
        if (activateCouponResp == null) {
            activateCouponResp = new ActivateCouponResp();
        }
        activateCouponResp.setSuccess(valueOf);
        activateCouponResp.setMsg(parse.getAsJsonObject().get(NotificationCompat.CATEGORY_MESSAGE).getAsString());
        if (activateCouponResp.isSuccess().booleanValue()) {
            C2506b.m11792a(context).mo15460a(new C2506b.C2507a(str, activateCouponResp.getActivatedStatus(), activateCouponResp.getActivateStatus()));
        }
        return activateCouponResp;
    }
}
