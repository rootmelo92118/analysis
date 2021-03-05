package com.p051vm.p052a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import com.p051vm.p062vo.user.PackageInfoReq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.vm.a.d */
/* compiled from: ProxyPackageCache */
public class C2509d {

    /* renamed from: b */
    private static C2509d f8959b;

    /* renamed from: a */
    private Context f8960a;

    private C2509d(Context context) {
        this.f8960a = context;
    }

    /* renamed from: a */
    public static C2509d m11803a(Context context) {
        if (f8959b == null) {
            f8959b = new C2509d(context);
        }
        return f8959b;
    }

    /* renamed from: a */
    public Map<String, String> mo15468a() {
        HashMap hashMap = new HashMap();
        String a = C2513a.m11818a(this.f8960a).mo15482a(Constants.IN_USE_PROXY_LIST, "");
        if (a == null || a.isEmpty()) {
            return hashMap;
        }
        JsonArray asJsonArray = new JsonParser().parse(a).getAsJsonArray();
        for (int i = 0; i < asJsonArray.size(); i++) {
            hashMap.put(asJsonArray.get(i).getAsJsonObject().get("pkg").getAsString(), "1");
        }
        return hashMap;
    }

    /* renamed from: b */
    public List<PackageInfoReq.PackageInfoVO> mo15469b() {
        PackageManager packageManager = this.f8960a.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        ArrayList arrayList = new ArrayList();
        Map<String, String> a = mo15468a();
        for (ResolveInfo next : queryIntentActivities) {
            String str = next.activityInfo.packageName;
            arrayList.add(new PackageInfoReq.PackageInfoVO((String) next.loadLabel(packageManager), str, Boolean.valueOf(a.get(str) != null)));
        }
        return arrayList;
    }
}
