package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.k */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C2352k implements C2353l<Context> {
    private C2352k() {
    }

    /* synthetic */ C2352k(byte b) {
        this();
    }

    /* renamed from: a */
    public final /* synthetic */ List mo14941a(Object obj) {
        Bundle a = m11578a((Context) obj);
        if (a == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Bundle m11578a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
            return null;
        }
    }
}
