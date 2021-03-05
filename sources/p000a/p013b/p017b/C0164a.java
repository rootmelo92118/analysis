package p000a.p013b.p017b;

import java.util.ArrayList;
import p000a.p013b.p018c.C0171a;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p021a.C0183a;
import p000a.p013b.p020e.p022b.C0187a;
import p000a.p013b.p020e.p029h.C0224a;
import p000a.p013b.p020e.p029h.C0226b;

/* renamed from: a.b.b.a */
/* compiled from: CompositeDisposable */
public final class C0164a implements C0165b, C0183a {

    /* renamed from: a */
    C0226b<C0165b> f357a;

    /* renamed from: b */
    volatile boolean f358b;

    /* renamed from: a */
    public void mo348a() {
        if (!this.f358b) {
            synchronized (this) {
                if (!this.f358b) {
                    this.f358b = true;
                    C0226b<C0165b> bVar = this.f357a;
                    this.f357a = null;
                    mo350a(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo352b() {
        return this.f358b;
    }

    /* renamed from: a */
    public boolean mo351a(C0165b bVar) {
        C0187a.m524a(bVar, "d is null");
        if (!this.f358b) {
            synchronized (this) {
                if (!this.f358b) {
                    C0226b<C0165b> bVar2 = this.f357a;
                    if (bVar2 == null) {
                        bVar2 = new C0226b<>();
                        this.f357a = bVar2;
                    }
                    bVar2.mo425a(bVar);
                    return true;
                }
            }
        }
        bVar.mo348a();
        return false;
    }

    /* renamed from: b */
    public boolean mo353b(C0165b bVar) {
        if (!mo354c(bVar)) {
            return false;
        }
        bVar.mo348a();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo354c(p000a.p013b.p017b.C0165b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p000a.p013b.p020e.p022b.C0187a.m524a(r3, (java.lang.String) r0)
            boolean r0 = r2.f358b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f358b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            a.b.e.h.b<a.b.b.b> r0 = r2.f357a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo426b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p017b.C0164a.mo354c(a.b.b.b):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo350a(C0226b<C0165b> bVar) {
        if (bVar != null) {
            ArrayList arrayList = null;
            for (Object obj : bVar.mo427b()) {
                if (obj instanceof C0165b) {
                    try {
                        ((C0165b) obj).mo348a();
                    } catch (Throwable th) {
                        C0176b.m497b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C0224a.m615a((Throwable) arrayList.get(0));
            }
            throw new C0171a(arrayList);
        }
    }
}
