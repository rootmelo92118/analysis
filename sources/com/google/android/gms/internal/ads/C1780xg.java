package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.xg */
public final class C1780xg {

    /* renamed from: a */
    public static final abk f6833a = abl.m1672a(new ThreadPoolExecutor(2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 10, TimeUnit.SECONDS, new SynchronousQueue(), m8355a("Default")));

    /* renamed from: b */
    public static final abk f6834b;

    /* renamed from: c */
    public static final ScheduledExecutorService f6835c = new ScheduledThreadPoolExecutor(3, m8355a("Schedule"));

    /* renamed from: a */
    public static <T> abg<T> m8354a(Callable<T> callable) {
        return f6833a.mo10039a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m8355a(String str) {
        return new C1781xh(str);
    }

    /* renamed from: a */
    public static abg<?> m8353a(Runnable runnable) {
        return f6833a.mo10038a(runnable);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m8355a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6834b = abl.m1672a(threadPoolExecutor);
    }
}
