package p000a.p001a.p002a.p003a;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;
import p000a.p001a.p002a.p003a.p004a.p007c.C0066d;
import p000a.p001a.p002a.p003a.p004a.p007c.C0077l;

/* renamed from: a.a.a.a.i */
/* compiled from: Kit */
public abstract class C0150i<Result> implements Comparable<C0150i> {
    Context context;
    final C0066d dependsOnAnnotation = ((C0066d) getClass().getAnnotation(C0066d.class));
    C0139c fabric;
    C0036r idManager;
    C0145f<Result> initializationCallback;
    C0149h<Result> initializationTask = new C0149h<>(this);

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void injectParameters(Context context2, C0139c cVar, C0145f<Result> fVar, C0036r rVar) {
        this.fabric = cVar;
        this.context = new C0143d(context2, getIdentifier(), getPath());
        this.initializationCallback = fVar;
        this.idManager = rVar;
    }

    /* access modifiers changed from: package-private */
    public final void initialize() {
        this.initializationTask.mo142a(this.fabric.mo300e(), null);
    }

    /* access modifiers changed from: protected */
    public C0036r getIdManager() {
        return this.idManager;
    }

    public Context getContext() {
        return this.context;
    }

    public C0139c getFabric() {
        return this.fabric;
    }

    public String getPath() {
        return ".Fabric" + File.separator + getIdentifier();
    }

    public int compareTo(C0150i iVar) {
        if (containsAnnotatedDependency(iVar)) {
            return 1;
        }
        if (iVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !iVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !iVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean containsAnnotatedDependency(C0150i iVar) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.mo140a()) {
                if (isAssignableFrom.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    /* access modifiers changed from: protected */
    public Collection<C0077l> getDependencies() {
        return this.initializationTask.getDependencies();
    }
}
