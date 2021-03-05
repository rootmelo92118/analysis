package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C1598qn
public final class aau {
    /* renamed from: a */
    public static <V> void m1653a(abg<V> abg, aar<V> aar, Executor executor) {
        abg.mo10059a(new aav(aar, abg), executor);
    }

    /* renamed from: a */
    public static <A, B> abg<B> m1649a(abg<A> abg, aaq<A, B> aaq, Executor executor) {
        abq abq = new abq();
        abg.mo10059a(new aaw(abq, aaq, abg), executor);
        m1655a(abq, abg);
        return abq;
    }

    /* renamed from: a */
    public static <A, B> abg<B> m1648a(abg<A> abg, aap<? super A, ? extends B> aap, Executor executor) {
        abq abq = new abq();
        abg.mo10059a(new aax(abq, aap, abg), executor);
        m1655a(abq, abg);
        return abq;
    }

    /* renamed from: a */
    public static <V> abg<V> m1647a(abg<V> abg, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        abq abq = new abq();
        m1655a(abq, abg);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new aay(abq), j, timeUnit);
        m1654a(abg, abq);
        abq.mo10059a(new aaz(schedule), abl.f1314b);
        return abq;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> abg<V> m1650a(abg<? extends V> abg, Class<X> cls, aap<? super X, ? extends V> aap, Executor executor) {
        abq abq = new abq();
        m1655a(abq, abg);
        abg.mo10059a(new aba(abq, abg, cls, aap, executor), abl.f1314b);
        return abq;
    }

    /* renamed from: a */
    public static <T> T m1651a(Future<T> future, T t) {
        try {
            return future.get(((Long) bre.m6321e().mo12778a(C1557p.f5972ba)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            C1772wz.m1627c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzlj().mo13122b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            C1772wz.m1625b("Error waiting for future.", e2);
            zzbv.zzlj().mo13122b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m1652a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            C1772wz.m1627c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzlj().mo13122b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            C1772wz.m1625b("Error waiting for future.", e2);
            zzbv.zzlj().mo13122b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> abf<T> m1646a(T t) {
        return new abf<>(t);
    }

    /* renamed from: a */
    public static <T> abd<T> m1645a(Throwable th) {
        return new abd<>(th);
    }

    /* renamed from: a */
    private static <V> void m1654a(abg<? extends V> abg, abq<V> abq) {
        m1655a(abq, abg);
        abg.mo10059a(new abb(abq, abg), abl.f1314b);
    }

    /* renamed from: a */
    private static <A, B> void m1655a(abg<A> abg, Future<B> future) {
        abg.mo10059a(new abc(abg, future), abl.f1314b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m1657a(com.google.android.gms.internal.ads.abq r1, com.google.android.gms.internal.ads.abg r2, java.lang.Class r3, com.google.android.gms.internal.ads.aap r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo10087b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.abf r2 = m1646a(r2)
            com.google.android.gms.internal.ads.abg r2 = m1648a(r2, r4, (java.util.concurrent.Executor) r5)
            m1654a(r2, r1)
            return
        L_0x002a:
            r1.mo10086a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aau.m1657a(com.google.android.gms.internal.ads.abq, com.google.android.gms.internal.ads.abg, java.lang.Class, com.google.android.gms.internal.ads.aap, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m1656a(abq abq, aap aap, abg abg) {
        if (!abq.isCancelled()) {
            try {
                m1654a(aap.zzf(abg.get()), abq);
            } catch (CancellationException unused) {
                abq.cancel(true);
            } catch (ExecutionException e) {
                abq.mo10086a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                abq.mo10086a(e2);
            } catch (Exception e3) {
                abq.mo10086a(e3);
            }
        }
    }
}
