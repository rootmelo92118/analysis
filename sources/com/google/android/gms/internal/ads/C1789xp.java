package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.xp */
final class C1789xp extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C1782xi f6857a;

    private C1789xp(C1782xi xiVar) {
        this.f6857a = xiVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.f6857a.f6840c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.f6857a.f6840c = false;
        }
    }

    /* synthetic */ C1789xp(C1782xi xiVar, C1785xl xlVar) {
        this(xiVar);
    }
}
