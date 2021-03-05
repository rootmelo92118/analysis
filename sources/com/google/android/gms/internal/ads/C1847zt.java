package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zt */
public final class C1847zt {
    @GuardedBy("this")

    /* renamed from: a */
    private final BroadcastReceiver f6946a = new C1848zu(this);
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f6947b = new WeakHashMap();

    /* renamed from: c */
    private boolean f6948c = false;

    /* renamed from: d */
    private boolean f6949d;

    /* renamed from: e */
    private Context f6950e;

    /* renamed from: a */
    public final synchronized void mo13292a(Context context) {
        if (!this.f6948c) {
            this.f6950e = context.getApplicationContext();
            if (this.f6950e == null) {
                this.f6950e = context;
            }
            C1557p.m7741a(this.f6950e);
            this.f6949d = ((Boolean) bre.m6321e().mo12778a(C1557p.f5949bD)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f6950e.registerReceiver(this.f6946a, intentFilter);
            this.f6948c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo13294a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f6949d) {
            this.f6947b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13293a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f6949d) {
            this.f6947b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m8567a(Context context, Intent intent) {
        for (Map.Entry next : this.f6947b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) next.getKey()).onReceive(context, intent);
            }
        }
    }
}
