package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.p034v4.app.NotificationCompat;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.internal.measurement.C1875a;

/* renamed from: com.google.android.gms.measurement.internal.dy */
public final class C2249dy extends C2253eb {

    /* renamed from: b */
    private final AlarmManager f8395b = ((AlarmManager) mo14231n().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: c */
    private final C2281fb f8396c;

    /* renamed from: d */
    private Integer f8397d;

    protected C2249dy(C2254ec ecVar) {
        super(ecVar);
        this.f8396c = new C2250dz(this, ecVar.mo14540p(), ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        this.f8395b.cancel(m10878y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m10876w();
        return false;
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m10876w() {
        int x = m10877x();
        mo14235r().mo14838x().mo14842a("Cancelling job. JobID", Integer.valueOf(x));
        ((JobScheduler) mo14231n().getSystemService("jobscheduler")).cancel(x);
    }

    /* renamed from: a */
    public final void mo14502a(long j) {
        mo14508k();
        mo14238u();
        Context n = mo14231n();
        if (!C2156am.m10457a(n)) {
            mo14235r().mo14837w().mo14841a("Receiver not registered/enabled");
        }
        if (!C2264el.m11022a(n, false)) {
            mo14235r().mo14837w().mo14841a("Service not registered/enabled");
        }
        mo14503f();
        long b = mo14230m().mo9997b() + j;
        if (j < Math.max(0, C2284h.f8513F.mo14804b().longValue()) && !this.f8396c.mo14797b()) {
            mo14235r().mo14838x().mo14841a("Scheduling upload with DelayedRunnable");
            this.f8396c.mo14796a(j);
        }
        mo14238u();
        if (Build.VERSION.SDK_INT >= 24) {
            mo14235r().mo14838x().mo14841a("Scheduling upload with JobScheduler");
            Context n2 = mo14231n();
            ComponentName componentName = new ComponentName(n2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m10877x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo14235r().mo14838x().mo14842a("Scheduling job. JobID", Integer.valueOf(x));
            C1875a.m8860a(n2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo14235r().mo14838x().mo14841a("Scheduling upload with AlarmManager");
        this.f8395b.setInexactRepeating(2, b, Math.max(C2284h.f8508A.mo14804b().longValue(), j), m10878y());
    }

    /* renamed from: x */
    private final int m10877x() {
        if (this.f8397d == null) {
            String valueOf = String.valueOf(mo14231n().getPackageName());
            this.f8397d = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f8397d.intValue();
    }

    /* renamed from: f */
    public final void mo14503f() {
        mo14508k();
        this.f8395b.cancel(m10878y());
        this.f8396c.mo14798c();
        if (Build.VERSION.SDK_INT >= 24) {
            m10876w();
        }
    }

    /* renamed from: y */
    private final PendingIntent m10878y() {
        Context n = mo14231n();
        return PendingIntent.getBroadcast(n, 0, new Intent().setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2261ei mo14291g() {
        return super.mo14291g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2269eq mo14293h() {
        return super.mo14293h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2275ew mo14294i() {
        return super.mo14294i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
