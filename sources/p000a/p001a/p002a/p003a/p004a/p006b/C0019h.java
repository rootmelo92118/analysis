package p000a.p001a.p002a.p003a.p004a.p006b;

import android.os.Process;

/* renamed from: a.a.a.a.a.b.h */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C0019h implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void onRun();

    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
