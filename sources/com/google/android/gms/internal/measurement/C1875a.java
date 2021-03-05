package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.a */
public final class C1875a {
    @Nullable

    /* renamed from: b */
    private static final Method f7325b = m8862b();
    @Nullable

    /* renamed from: c */
    private static final Method f7326c = m8863c();

    /* renamed from: d */
    private static volatile C1934c f7327d = C1907b.f7412a;

    /* renamed from: a */
    private final JobScheduler f7328a;

    /* renamed from: a */
    static final /* synthetic */ boolean m8861a() {
        return false;
    }

    @Nullable
    /* renamed from: b */
    private static Method m8862b() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    private static Method m8863c() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m8864d() {
        if (f7326c != null) {
            try {
                return ((Integer) f7326c.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    private C1875a(JobScheduler jobScheduler) {
        this.f7328a = jobScheduler;
    }

    /* renamed from: a */
    private final int m8859a(JobInfo jobInfo, String str, int i, String str2) {
        if (f7325b != null) {
            try {
                return ((Integer) f7325b.invoke(this.f7328a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f7328a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m8860a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f7325b == null || !f7327d.mo13507a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C1875a(jobScheduler).m8859a(jobInfo, str, m8864d(), str2);
    }
}
