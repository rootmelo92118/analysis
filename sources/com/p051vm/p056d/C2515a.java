package com.p051vm.p056d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import com.p051vm.shadowsocks.core.AppInfo;
import com.p051vm.shadowsocks.core.AppProxyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.vm.d.a */
/* compiled from: DefaultPackages */
public class C2515a {

    /* renamed from: a */
    public static HashMap<String, String> f8973a = new HashMap<>();

    /* renamed from: b */
    private static C2515a f8974b = null;

    /* renamed from: c */
    private static String[] f8975c = {"tv.pps.mobile", "com.qiyi.video", "com.tencent.qqlive", "com.tencent.qqmusic", "com.netease.cloudmusic", "com.kugou.android", "com.kugou.tv.android", "cn.kuwo.player", "fm.xiami.main", "tv.danmaku.bili", "com.tencent.qqmusiccar", "com.tudou.android", "com.letv.android.client", "cn.com.sina.sports", "com.sohu.sohuvideo", "tv.pps.pad", "com.kandian.vodapp", "com.ting.mp3.android", "com.duomi.android", "com.yinyuetai.ui", "com.tencent.karaoke", "com.changba", "com.qq.ac.android", "com.cctv.cctv5ultimate", "com.tencent.qqsports", "com.pplive.androidphone", "com.pplive.androidphone.sport", "com.wasu.wasuvideoplayer", "com.youku.phone"};

    private C2515a() {
        for (String put : f8975c) {
            f8973a.put(put, "Y");
        }
    }

    /* renamed from: a */
    public static C2515a m11824a() {
        if (f8974b == null) {
            f8974b = new C2515a();
        }
        return f8974b;
    }

    /* renamed from: a */
    private boolean m11825a(String str) {
        return f8973a.get(str) != null;
    }

    /* renamed from: a */
    public void mo15488a(Context context) {
        if (C2513a.m11818a(context).mo15481a(Constants.INIT_PROXY_FLAG_KEY) == null) {
            JsonArray jsonArray = new JsonArray();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
            AppProxyManager.proxyAppInfo.clear();
            for (ResolveInfo next : queryIntentActivities) {
                String str = next.activityInfo.packageName;
                if (m11825a(str)) {
                    String str2 = (String) next.loadLabel(packageManager);
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("label", str2);
                    jsonObject.addProperty("pkg", str);
                    jsonArray.add((JsonElement) jsonObject);
                    AppInfo appInfo = new AppInfo();
                    appInfo.setPkgName(str);
                    appInfo.setAppLabel(str2);
                    AppProxyManager.proxyAppInfo.put(appInfo.getPkgName(), appInfo);
                }
            }
            C2513a.m11818a(context).mo15483b(Constants.IN_USE_PROXY_LIST, jsonArray.toString());
            C2513a.m11818a(context).mo15483b(Constants.INIT_PROXY_FLAG_KEY, "YES");
            return;
        }
        AppProxyManager.proxyAppInfo.clear();
        String a = C2513a.m11818a(context).mo15482a(Constants.IN_USE_PROXY_LIST, "");
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    JsonArray asJsonArray = new JsonParser().parse(a).getAsJsonArray();
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
                        AppInfo appInfo2 = new AppInfo();
                        appInfo2.setAppLabel(asJsonObject.get("label").getAsString());
                        appInfo2.setPkgName(asJsonObject.get("pkg").getAsString());
                        AppProxyManager.proxyAppInfo.put(appInfo2.getPkgName(), appInfo2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
