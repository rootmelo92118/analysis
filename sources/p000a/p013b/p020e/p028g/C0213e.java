package p000a.p013b.p020e.p028g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: a.b.e.g.e */
/* compiled from: RxThreadFactory */
public final class C0213e extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f438a;

    /* renamed from: b */
    final int f439b;

    public C0213e(String str) {
        this(str, 5);
    }

    public C0213e(String str, int i) {
        this.f438a = str;
        this.f439b = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f438a + '-' + incrementAndGet());
        thread.setPriority(this.f439b);
        thread.setDaemon(true);
        return thread;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f438a + "]";
    }
}
