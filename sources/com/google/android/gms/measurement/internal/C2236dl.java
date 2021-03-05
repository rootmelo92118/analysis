package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.measurement.internal.C2241dq;

/* renamed from: com.google.android.gms.measurement.internal.dl */
public final class C2236dl<T extends Context & C2241dq> {

    /* renamed from: a */
    private final T f8369a;

    public C2236dl(T t) {
        C0926p.m1306a(t);
        this.f8369a = t;
    }

    @MainThread
    /* renamed from: a */
    public final void mo14477a() {
        C2166aw a = C2166aw.m10527a((Context) this.f8369a, (C2290m) null);
        C2295r r = a.mo14235r();
        a.mo14238u();
        r.mo14838x().mo14841a("Local AppMeasurementService is starting up");
    }

    @MainThread
    /* renamed from: b */
    public final void mo14481b() {
        C2166aw a = C2166aw.m10527a((Context) this.f8369a, (C2290m) null);
        C2295r r = a.mo14235r();
        a.mo14238u();
        r.mo14838x().mo14841a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: a */
    public final int mo14475a(Intent intent, int i, int i2) {
        C2166aw a = C2166aw.m10527a((Context) this.f8369a, (C2290m) null);
        C2295r r = a.mo14235r();
        if (intent == null) {
            r.mo14833i().mo14841a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo14238u();
        r.mo14838x().mo14843a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m10815a((Runnable) new C2237dm(this, i2, r, intent));
        }
        return 2;
    }

    /* renamed from: a */
    private final void m10815a(Runnable runnable) {
        C2254ec a = C2254ec.m10911a((Context) this.f8369a);
        a.mo14234q().mo14296a((Runnable) new C2240dp(this, a, runnable));
    }

    @MainThread
    /* renamed from: a */
    public final IBinder mo14476a(Intent intent) {
        if (intent == null) {
            m10816c().mo14830d_().mo14841a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C2168ay(C2254ec.m10911a((Context) this.f8369a));
        }
        m10816c().mo14833i().mo14842a("onBind received unknown action", action);
        return null;
    }

    @MainThread
    /* renamed from: b */
    public final boolean mo14482b(Intent intent) {
        if (intent == null) {
            m10816c().mo14830d_().mo14841a("onUnbind called with null intent");
            return true;
        }
        m10816c().mo14838x().mo14842a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    @MainThread
    /* renamed from: a */
    public final boolean mo14480a(JobParameters jobParameters) {
        C2166aw a = C2166aw.m10527a((Context) this.f8369a, (C2290m) null);
        C2295r r = a.mo14235r();
        String string = jobParameters.getExtras().getString("action");
        a.mo14238u();
        r.mo14838x().mo14842a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m10815a((Runnable) new C2239do(this, r, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: c */
    public final void mo14483c(Intent intent) {
        if (intent == null) {
            m10816c().mo14830d_().mo14841a("onRebind called with null intent");
            return;
        }
        m10816c().mo14838x().mo14842a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    private final C2295r m10816c() {
        return C2166aw.m10527a((Context) this.f8369a, (C2290m) null).mo14235r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14479a(C2295r rVar, JobParameters jobParameters) {
        rVar.mo14838x().mo14841a("AppMeasurementJobService processed last upload request.");
        ((C2241dq) this.f8369a).mo14179a(jobParameters, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14478a(int i, C2295r rVar, Intent intent) {
        if (((C2241dq) this.f8369a).mo14181a(i)) {
            rVar.mo14838x().mo14842a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m10816c().mo14838x().mo14841a("Completed wakeful intent.");
            ((C2241dq) this.f8369a).mo14180a(intent);
        }
    }
}
