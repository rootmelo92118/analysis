package p000a.p013b;

import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p022b.C0187a;
import p000a.p013b.p020e.p025e.p026a.C0195b;
import p000a.p013b.p020e.p025e.p026a.C0197c;
import p000a.p013b.p020e.p025e.p026a.C0199d;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.c */
/* compiled from: Observable */
public abstract class C0170c<T> implements C0228f<T> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo364b(C0230g<? super T> gVar);

    /* renamed from: a */
    public static int m481a() {
        return C0163b.m462a();
    }

    /* renamed from: a */
    public static <T> C0170c<T> m482a(C0182e<T> eVar) {
        C0187a.m524a(eVar, "source is null");
        return C0229a.m624a(new C0195b(eVar));
    }

    /* renamed from: a */
    public final C0170c<T> mo360a(C0240h hVar) {
        return mo361a(hVar, false, m481a());
    }

    /* renamed from: a */
    public final C0170c<T> mo361a(C0240h hVar, boolean z, int i) {
        C0187a.m524a(hVar, "scheduler is null");
        C0187a.m522a(i, "bufferSize");
        return C0229a.m624a(new C0197c(this, hVar, z, i));
    }

    /* renamed from: a */
    public final void mo362a(C0230g<? super T> gVar) {
        C0187a.m524a(gVar, "observer is null");
        try {
            C0230g<? super Object> a = C0229a.m625a(this, gVar);
            C0187a.m524a(a, "Plugin returned null Observer");
            mo364b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C0176b.m497b(th);
            C0229a.m632a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C0170c<T> mo363b(C0240h hVar) {
        C0187a.m524a(hVar, "scheduler is null");
        return C0229a.m624a(new C0199d(this, hVar));
    }
}
