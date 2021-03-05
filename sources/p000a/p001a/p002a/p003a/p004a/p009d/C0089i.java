package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.a.d.i */
/* compiled from: TimeBasedFileRollOverRunnable */
public class C0089i implements Runnable {

    /* renamed from: a */
    private final Context f160a;

    /* renamed from: b */
    private final C0085e f161b;

    public C0089i(Context context, C0085e eVar) {
        this.f160a = context;
        this.f161b = eVar;
    }

    public void run() {
        try {
            C0020i.m55a(this.f160a, "Performing time based file roll over.");
            if (!this.f161b.rollFileOver()) {
                this.f161b.cancelTimeBasedFileRollOver();
            }
        } catch (Exception e) {
            C0020i.m56a(this.f160a, "Failed to roll over file", (Throwable) e);
        }
    }
}
