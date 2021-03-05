package p000a.p013b.p020e.p028g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.g.g */
/* compiled from: SchedulerPoolFactory */
public final class C0215g {

    /* renamed from: a */
    public static final boolean f443a;

    /* renamed from: b */
    public static final int f444b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f445c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f446d = new ConcurrentHashMap();

    static {
        boolean z;
        Properties properties = System.getProperties();
        int i = 1;
        if (properties.containsKey("rx2.purge-enabled")) {
            z = Boolean.getBoolean("rx2.purge-enabled");
            if (z && properties.containsKey("rx2.purge-period-seconds")) {
                i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
            }
        } else {
            z = true;
        }
        f443a = z;
        f444b = i;
        m599a();
    }

    /* renamed from: a */
    public static void m599a() {
        while (true) {
            ScheduledExecutorService scheduledExecutorService = f445c.get();
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C0213e("RxSchedulerPurge"));
                if (f445c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
                        public void run() {
                            try {
                                Iterator it = new ArrayList(C0215g.f446d.keySet()).iterator();
                                while (it.hasNext()) {
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                                    if (scheduledThreadPoolExecutor.isShutdown()) {
                                        C0215g.f446d.remove(scheduledThreadPoolExecutor);
                                    } else {
                                        scheduledThreadPoolExecutor.purge();
                                    }
                                }
                            } catch (Throwable th) {
                                C0229a.m632a(th);
                            }
                        }
                    }, (long) f444b, (long) f444b, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m598a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            f446d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
