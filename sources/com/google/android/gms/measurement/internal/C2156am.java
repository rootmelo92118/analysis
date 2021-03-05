package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.am */
public final class C2156am {

    /* renamed from: a */
    private final C2159ap f8088a;

    public C2156am(C2159ap apVar) {
        C0926p.m1306a(apVar);
        this.f8088a = apVar;
    }

    /* renamed from: a */
    public static boolean m10457a(Context context) {
        ActivityInfo receiverInfo;
        C0926p.m1306a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @MainThread
    /* renamed from: a */
    public final void mo14276a(Context context, Intent intent) {
        C2166aw a = C2166aw.m10527a(context, (C2290m) null);
        C2295r r = a.mo14235r();
        if (intent == null) {
            r.mo14833i().mo14841a("Receiver called with null intent");
            return;
        }
        a.mo14238u();
        String action = intent.getAction();
        r.mo14838x().mo14842a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            r.mo14838x().mo14841a("Starting wakeful intent.");
            this.f8088a.mo14177a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo14234q().mo14296a((Runnable) new C2157an(this, a, r));
            } catch (Exception e) {
                r.mo14833i().mo14842a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a2 = this.f8088a.mo14176a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                r.mo14838x().mo14841a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            r.mo14836v().mo14842a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a3 = a.mo14325j().mo14562a(Uri.parse(stringExtra));
            if (a3 == null) {
                r.mo14838x().mo14841a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                r.mo14833i().mo14841a("Install referrer is missing timestamp");
            }
            a.mo14234q().mo14296a((Runnable) new C2158ao(this, a, longExtra, a3, context, r, a2));
        }
    }
}
