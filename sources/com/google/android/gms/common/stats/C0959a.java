package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C0968d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C0959a {

    /* renamed from: a */
    private static final Object f1199a = new Object();

    /* renamed from: b */
    private static volatile C0959a f1200b;

    /* renamed from: c */
    private static boolean f1201c = false;

    /* renamed from: d */
    private final List<String> f1202d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f1203e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f1204f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f1205g = Collections.EMPTY_LIST;

    /* renamed from: a */
    public static C0959a m1447a() {
        if (f1200b == null) {
            synchronized (f1199a) {
                if (f1200b == null) {
                    f1200b = new C0959a();
                }
            }
        }
        return f1200b;
    }

    private C0959a() {
    }

    /* renamed from: a */
    public final boolean mo9989a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C0968d.m1466b(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: a */
    public boolean mo9988a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo9989a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo9987a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
