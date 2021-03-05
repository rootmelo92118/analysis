package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.do */
final /* synthetic */ class C2239do implements Runnable {

    /* renamed from: a */
    private final C2236dl f8375a;

    /* renamed from: b */
    private final C2295r f8376b;

    /* renamed from: c */
    private final JobParameters f8377c;

    C2239do(C2236dl dlVar, C2295r rVar, JobParameters jobParameters) {
        this.f8375a = dlVar;
        this.f8376b = rVar;
        this.f8377c = jobParameters;
    }

    public final void run() {
        this.f8375a.mo14479a(this.f8376b, this.f8377c);
    }
}
