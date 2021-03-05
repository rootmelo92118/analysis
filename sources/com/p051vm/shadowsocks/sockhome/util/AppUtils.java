package com.p051vm.shadowsocks.sockhome.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import com.p051vm.shadowsocks.sockhome.bean.AppItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vm.shadowsocks.sockhome.util.AppUtils */
public class AppUtils {
    public static List<AppItem> getAllAppInfo(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(8192);
        ArrayList arrayList = new ArrayList();
        for (PackageInfo next : installedPackages) {
            Drawable loadLogo = next.applicationInfo.loadLogo(context.getPackageManager());
            String charSequence = next.applicationInfo.loadLabel(context.getPackageManager()).toString();
            AppItem appItem = new AppItem();
            appItem.appLogo = loadLogo;
            appItem.appName = charSequence;
            arrayList.add(appItem);
        }
        return arrayList;
    }
}
