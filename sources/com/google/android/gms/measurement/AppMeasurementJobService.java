package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2236dl;
import com.google.android.gms.measurement.internal.C2241dq;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C2241dq {

    /* renamed from: a */
    private C2236dl<AppMeasurementJobService> f8023a;

    /* renamed from: a */
    private final C2236dl<AppMeasurementJobService> m10358a() {
        if (this.f8023a == null) {
            this.f8023a = new C2236dl<>(this);
        }
        return this.f8023a;
    }

    /* renamed from: a */
    public final void mo14180a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public final void onCreate() {
        super.onCreate();
        m10358a().mo14477a();
    }

    @MainThread
    public final void onDestroy() {
        m10358a().mo14481b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m10358a().mo14480a(jobParameters);
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        return m10358a().mo14482b(intent);
    }

    @MainThread
    public final void onRebind(Intent intent) {
        m10358a().mo14483c(intent);
    }

    /* renamed from: a */
    public final boolean mo14181a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo14179a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
