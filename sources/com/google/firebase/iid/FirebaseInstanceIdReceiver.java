package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.p034v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C0979o;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static boolean f8819a = false;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: b */
    private static C2374ai f8820b;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: c */
    private static C2374ai f8821c;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m11640a(context, intent2, intent.getAction());
            } else {
                m11640a(context, intent, intent.getAction());
            }
        }
    }

    /* renamed from: a */
    private final void m11640a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            i = m11638a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m11638a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = C0979o.m1510k() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m11641b(broadcastReceiver, context, str, intent);
        }
        int a = C2414x.m11759a().mo15040a(context, str, intent);
        if (!C0979o.m1510k() || a != 402) {
            return a;
        }
        m11641b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m11641b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Binding to service: ".concat(valueOf) : new String("Binding to service: "));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m11639a(context, str).mo14988a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: a */
    private static synchronized C2374ai m11639a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f8821c == null) {
                    f8821c = new C2374ai(context, str);
                }
                C2374ai aiVar = f8821c;
                return aiVar;
            }
            if (f8820b == null) {
                f8820b = new C2374ai(context, str);
            }
            C2374ai aiVar2 = f8820b;
            return aiVar2;
        }
    }
}
