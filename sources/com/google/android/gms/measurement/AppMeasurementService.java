package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2236dl;
import com.google.android.gms.measurement.internal.C2241dq;

public final class AppMeasurementService extends Service implements C2241dq {

    /* renamed from: a */
    private C2236dl<AppMeasurementService> f8025a;

    /* renamed from: a */
    private final C2236dl<AppMeasurementService> m10364a() {
        if (this.f8025a == null) {
            this.f8025a = new C2236dl<>(this);
        }
        return this.f8025a;
    }

    @MainThread
    public final void onCreate() {
        super.onCreate();
        m10364a().mo14477a();
    }

    @MainThread
    public final void onDestroy() {
        m10364a().mo14481b();
        super.onDestroy();
    }

    @MainThread
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m10364a().mo14475a(intent, i, i2);
    }

    @MainThread
    public final IBinder onBind(Intent intent) {
        return m10364a().mo14476a(intent);
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        return m10364a().mo14482b(intent);
    }

    @MainThread
    public final void onRebind(Intent intent) {
        m10364a().mo14483c(intent);
    }

    /* renamed from: a */
    public final boolean mo14181a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo14179a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo14180a(Intent intent) {
        AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
