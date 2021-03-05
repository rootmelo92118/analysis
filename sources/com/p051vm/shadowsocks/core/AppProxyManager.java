package com.p051vm.shadowsocks.core;

import android.content.Context;
import android.os.Build;
import com.p051vm.constants.Constants;
import com.p051vm.p053b.p054a.C2513a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vm.shadowsocks.core.AppProxyManager */
public class AppProxyManager {
    private static final String PROXY_APPS = "PROXY_APPS";
    private static AppProxyManager instance;
    public static boolean isLollipopOrAbove = (Build.VERSION.SDK_INT >= 21);
    private static Context mContext;
    public static List<AppInfo> mlistAppInfo = new ArrayList();
    public static Map<String, AppInfo> proxyAppInfo = new HashMap();

    private AppProxyManager(Context context) {
        mContext = context;
        readProxyAppsList();
    }

    public static AppProxyManager getInstance(Context context) {
        if (instance == null) {
            instance = new AppProxyManager(context);
        }
        return instance;
    }

    public static void removeProxyApp(String str) {
        if (proxyAppInfo.get(str) != null) {
            proxyAppInfo.remove(str);
        }
        writeProxyAppsList();
    }

    public static void addProxyApp(String str) {
        Iterator<AppInfo> it = mlistAppInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AppInfo next = it.next();
            if (next.getPkgName().equals(str)) {
                proxyAppInfo.put(next.getPkgName(), next);
                break;
            }
        }
        writeProxyAppsList();
    }

    public static boolean isAppProxy(String str) {
        return proxyAppInfo.get(str) != null;
    }

    private void readProxyAppsList() {
        proxyAppInfo.clear();
        String a = C2513a.m11818a(mContext).mo15482a(Constants.IN_USE_PROXY_LIST, "");
        try {
            if (!a.isEmpty()) {
                JSONArray jSONArray = new JSONArray(a);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AppInfo appInfo = new AppInfo();
                    appInfo.setAppLabel(jSONObject.getString("label"));
                    appInfo.setPkgName(jSONObject.getString("pkg"));
                    proxyAppInfo.put(appInfo.getPkgName(), appInfo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeProxyAppsList() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, AppInfo> value : proxyAppInfo.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                AppInfo appInfo = (AppInfo) value.getValue();
                jSONObject.put("label", appInfo.getAppLabel());
                jSONObject.put("pkg", appInfo.getPkgName());
                jSONArray.put(jSONObject);
            }
            C2513a.m11818a(mContext).mo15483b(Constants.IN_USE_PROXY_LIST, jSONArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
