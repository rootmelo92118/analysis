package com.p051vm.p059g;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.gson.JsonObject;
import com.p051vm.constants.MemberType;
import com.p051vm.p052a.C2505a;
import com.p051vm.p052a.C2508c;
import com.p051vm.p052a.C2511f;
import com.p051vm.p062vo.invite.ActivateCouponResp;
import com.p051vm.p062vo.invite.CouponResp;
import com.p051vm.p062vo.login.LoginResp;
import com.p051vm.p062vo.user.UserInfoResp;
import com.p051vm.rest.ConfClient;
import com.p051vm.rest.InviteClient;
import com.p051vm.rest.LoginClient;
import com.p051vm.rest.MachineClient;
import com.p051vm.rest.UserClient;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.vm.g.a */
/* compiled from: BizASYNCTask */
public class C2523a {

    /* renamed from: a */
    private static Timer f8994a = new Timer();

    /* renamed from: a */
    public static void m11852a(final Context context, final Handler handler, final int i) {
        new Thread(new Runnable() {
            public void run() {
                LoginResp login;
                Message message = new Message();
                message.what = i;
                if (C2508c.m11798a(context).mo15464a() == null && (login = LoginClient.login(context)) != null) {
                    C2508c.m11798a(context).mo15465a(login.getToken(), login.getAuthKey());
                    JsonObject confInfo = ConfClient.getConfInfo(context);
                    if (confInfo != null) {
                        C2505a.m11786a(context).mo15455a(confInfo);
                    }
                }
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: a */
    public static void m11855a(final Context context, final Handler handler, final boolean z, final int i) {
        new Thread(new Runnable() {
            public void run() {
                Message message = new Message();
                message.what = i;
                if (!z) {
                    message.obj = MachineClient.getMachine(context);
                }
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: a */
    public static void m11851a(Context context, final Handler handler) {
        new Thread(new Runnable() {
            public void run() {
                Message message = new Message();
                message.what = 4;
                message.obj = null;
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: b */
    public static void m11856b(final Context context, final Handler handler, final int i) {
        new Thread(new Runnable() {
            public void run() {
                CouponResp coupon = InviteClient.getCoupon(context);
                Message message = new Message();
                message.what = i;
                message.obj = coupon;
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: a */
    public static void m11853a(final Context context, final Handler handler, final int i, final String str) {
        new Thread(new Runnable() {
            public void run() {
                ActivateCouponResp activateCoupon = InviteClient.activateCoupon(context, str);
                Message message = new Message();
                message.what = i;
                message.obj = activateCoupon;
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: a */
    public static void m11854a(final Context context, final Handler handler, final int i, final boolean z) {
        new Thread(new Runnable() {
            public void run() {
                UserInfoResp userInfo;
                Message message = new Message();
                message.what = i;
                C2511f.C2512a a = z ? C2511f.m11813a(context).mo15476a() : null;
                if (a == null && (userInfo = UserClient.getUserInfo(context)) != null) {
                    Long valueOf = Long.valueOf(userInfo.getMemberId());
                    Integer memberType = userInfo.getMemberType();
                    C2511f.C2512a aVar = new C2511f.C2512a(valueOf.longValue(), memberType);
                    MemberType memberType2 = MemberType.getMemberType(memberType.intValue());
                    if (memberType2 != null) {
                        aVar.mo15479a(Integer.valueOf(memberType2.getMsgId()));
                    }
                    C2511f.m11813a(context).mo15477a(aVar);
                    a = aVar;
                }
                message.obj = a;
                handler.sendMessage(message);
            }
        }).start();
    }

    /* renamed from: a */
    public static void m11850a(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                JsonObject confInfo = ConfClient.getConfInfo(context);
                if (confInfo != null) {
                    C2505a.m11786a(context).mo15455a(confInfo);
                }
            }
        }).start();
    }

    /* renamed from: c */
    public static void m11857c(final Context context, final Handler handler, final int i) {
        f8994a.schedule(new TimerTask() {
            public void run() {
                Message message = new Message();
                message.what = i;
                message.obj = MachineClient.getMachine(context);
                handler.sendMessage(message);
            }
        }, 0, Long.valueOf(((long) (C2505a.m11786a(context).mo15458d() * 1000)) * 60).longValue());
    }
}
