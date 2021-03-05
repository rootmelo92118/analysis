package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public final class avy extends CustomTabsServiceConnection {

    /* renamed from: a */
    private WeakReference<avz> f2742a;

    public avy(avz avz) {
        this.f2742a = new WeakReference<>(avz);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        avz avz = (avz) this.f2742a.get();
        if (avz != null) {
            avz.mo10729a(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        avz avz = (avz) this.f2742a.get();
        if (avz != null) {
            avz.mo10727a();
        }
    }
}
