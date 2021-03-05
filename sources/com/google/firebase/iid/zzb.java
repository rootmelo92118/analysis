package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.support.p034v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.p042a.C0964a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    @VisibleForTesting

    /* renamed from: a */
    final ExecutorService f8938a;

    /* renamed from: b */
    private Binder f8939b;

    /* renamed from: c */
    private final Object f8940c;

    /* renamed from: d */
    private int f8941d;

    /* renamed from: e */
    private int f8942e;

    public zzb() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f8938a = Executors.newSingleThreadExecutor(new C0964a(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        this.f8940c = new Object();
        this.f8942e = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo14972a(Intent intent) {
        return intent;
    }

    /* renamed from: b */
    public abstract void mo14974b(Intent intent);

    /* renamed from: c */
    public boolean mo15049c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f8939b == null) {
            this.f8939b = new C2372ag(this);
        }
        return this.f8939b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f8940c) {
            this.f8941d = i2;
            this.f8942e++;
        }
        Intent a = mo14972a(intent);
        if (a == null) {
            m11780d(intent);
            return 2;
        } else if (mo15049c(a)) {
            m11780d(intent);
            return 2;
        } else {
            this.f8938a.execute(new C2369ad(this, a, intent));
            return 3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m11780d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f8940c) {
            this.f8942e--;
            if (this.f8942e == 0) {
                stopSelfResult(this.f8941d);
            }
        }
    }
}
