package p000a.p013b.p020e.p028g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p020e.p021a.C0183a;

/* renamed from: a.b.e.g.f */
/* compiled from: ScheduledRunnable */
public final class C0214f extends AtomicReferenceArray<Object> implements C0165b, Runnable, Callable<Object> {

    /* renamed from: b */
    static final Object f440b = new Object();

    /* renamed from: c */
    static final Object f441c = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a */
    final Runnable f442a;

    public C0214f(Runnable runnable, C0183a aVar) {
        super(2);
        this.f442a = runnable;
        lazySet(0, aVar);
    }

    public Object call() {
        run();
        return null;
    }

    public void run() {
        Object obj;
        Object obj2;
        try {
            this.f442a.run();
        } catch (Throwable th) {
            Object obj3 = get(0);
            if (!(obj3 == f440b || obj3 == null || !compareAndSet(0, obj3, f441c))) {
                ((C0183a) obj3).mo354c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f440b || compareAndSet(1, obj2, f441c)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f441c));
            throw th;
        }
        Object obj4 = get(0);
        if (!(obj4 == f440b || obj4 == null || !compareAndSet(0, obj4, f441c))) {
            ((C0183a) obj4).mo354c(this);
        }
        do {
            obj = get(1);
            if (obj == f440b || compareAndSet(1, obj, f441c)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f441c));
    }

    /* renamed from: a */
    public void mo412a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f441c) {
                if (obj == f440b) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public void mo348a() {
        /*
            r3 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = f441c
            if (r1 == r2) goto L_0x001d
            java.lang.Object r2 = f440b
            if (r1 != r2) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            java.lang.Object r2 = f440b
            boolean r2 = r3.compareAndSet(r0, r1, r2)
            if (r2 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x001d
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r0)
        L_0x001d:
            r0 = 0
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = f441c
            if (r1 == r2) goto L_0x003b
            java.lang.Object r2 = f440b
            if (r1 == r2) goto L_0x003b
            if (r1 != 0) goto L_0x002d
            goto L_0x003b
        L_0x002d:
            java.lang.Object r2 = f440b
            boolean r0 = r3.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L_0x001d
            a.b.e.a.a r1 = (p000a.p013b.p020e.p021a.C0183a) r1
            r1.mo354c(r3)
            return
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p020e.p028g.C0214f.mo348a():void");
    }
}
