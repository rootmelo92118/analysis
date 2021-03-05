package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.a.a.a.a.c.j */
/* compiled from: PriorityTask */
public class C0074j implements C0064b<C0077l>, C0073i, C0077l {
    private final List<C0077l> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference<>((Object) null);

    public synchronized Collection<C0077l> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public synchronized void addDependency(C0077l lVar) {
        this.dependencies.add(lVar);
    }

    public boolean areDependenciesMet() {
        for (C0077l isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public C0067e getPriority() {
        return C0067e.NORMAL;
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public Throwable getError() {
        return this.throwable.get();
    }

    public int compareTo(Object obj) {
        return C0067e.m192a(this, obj);
    }

    public static boolean isProperDelegate(Object obj) {
        try {
            C0064b bVar = (C0064b) obj;
            C0077l lVar = (C0077l) obj;
            C0073i iVar = (C0073i) obj;
            if (bVar == null || lVar == null || iVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
