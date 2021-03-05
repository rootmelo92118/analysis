package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: a.a.a.a.a.c.h */
/* compiled from: PriorityFutureTask */
public class C0072h<V> extends FutureTask<V> implements C0064b<C0077l>, C0073i, C0077l {

    /* renamed from: b */
    final Object f146b;

    public C0072h(Callable<V> callable) {
        super(callable);
        this.f146b = mo151a((Object) callable);
    }

    public C0072h(Runnable runnable, V v) {
        super(runnable, v);
        this.f146b = mo151a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((C0073i) mo150a()).compareTo(obj);
    }

    /* renamed from: a */
    public void addDependency(C0077l lVar) {
        ((C0064b) ((C0073i) mo150a())).addDependency(lVar);
    }

    public Collection<C0077l> getDependencies() {
        return ((C0064b) ((C0073i) mo150a())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((C0064b) ((C0073i) mo150a())).areDependenciesMet();
    }

    public C0067e getPriority() {
        return ((C0073i) mo150a()).getPriority();
    }

    public void setFinished(boolean z) {
        ((C0077l) ((C0073i) mo150a())).setFinished(z);
    }

    public boolean isFinished() {
        return ((C0077l) ((C0073i) mo150a())).isFinished();
    }

    public void setError(Throwable th) {
        ((C0077l) ((C0073i) mo150a())).setError(th);
    }

    /* renamed from: a */
    public <T extends C0064b<C0077l> & C0073i & C0077l> T mo150a() {
        return (C0064b) this.f146b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0064b<C0077l> & C0073i & C0077l> T mo151a(Object obj) {
        if (C0074j.isProperDelegate(obj)) {
            return (C0064b) obj;
        }
        return new C0074j();
    }
}
