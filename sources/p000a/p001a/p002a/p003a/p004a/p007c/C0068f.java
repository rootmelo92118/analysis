package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000a.p001a.p002a.p003a.p004a.p007c.C0048a;

/* renamed from: a.a.a.a.a.c.f */
/* compiled from: PriorityAsyncTask */
public abstract class C0068f<Params, Progress, Result> extends C0048a<Params, Progress, Result> implements C0064b<C0077l>, C0073i, C0077l {

    /* renamed from: a */
    private final C0074j f142a = new C0074j();

    /* renamed from: a */
    public final void mo142a(ExecutorService executorService, Params... paramsArr) {
        super.mo93a((Executor) new C0069a(executorService, this), paramsArr);
    }

    public int compareTo(Object obj) {
        return C0067e.m192a(this, obj);
    }

    /* renamed from: a */
    public void addDependency(C0077l lVar) {
        if (mo98b() == C0048a.C0057d.PENDING) {
            ((C0064b) ((C0073i) mo144e())).addDependency(lVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public Collection<C0077l> getDependencies() {
        return ((C0064b) ((C0073i) mo144e())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((C0064b) ((C0073i) mo144e())).areDependenciesMet();
    }

    public C0067e getPriority() {
        return ((C0073i) mo144e()).getPriority();
    }

    public void setFinished(boolean z) {
        ((C0077l) ((C0073i) mo144e())).setFinished(z);
    }

    public boolean isFinished() {
        return ((C0077l) ((C0073i) mo144e())).isFinished();
    }

    public void setError(Throwable th) {
        ((C0077l) ((C0073i) mo144e())).setError(th);
    }

    /* renamed from: e */
    public <T extends C0064b<C0077l> & C0073i & C0077l> T mo144e() {
        return this.f142a;
    }

    /* renamed from: a.a.a.a.a.c.f$a */
    /* compiled from: PriorityAsyncTask */
    private static class C0069a<Result> implements Executor {

        /* renamed from: a */
        private final Executor f143a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0068f f144b;

        public C0069a(Executor executor, C0068f fVar) {
            this.f143a = executor;
            this.f144b = fVar;
        }

        public void execute(Runnable runnable) {
            this.f143a.execute(new C0072h<Result>(runnable, (Object) null) {
                /* renamed from: a */
                public <T extends C0064b<C0077l> & C0073i & C0077l> T mo150a() {
                    return C0069a.this.f144b;
                }
            });
        }
    }
}
