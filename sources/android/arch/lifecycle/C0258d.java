package android.arch.lifecycle;

import android.arch.lifecycle.C0254b;
import android.arch.p032a.p033a.C0243a;
import android.arch.p032a.p033a.C0244b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.d */
/* compiled from: LifecycleRegistry */
public class C0258d extends C0254b {

    /* renamed from: a */
    private C0243a<Object, C0260a> f522a = new C0243a<>();

    /* renamed from: b */
    private C0254b.C0256b f523b;

    /* renamed from: c */
    private final C0257c f524c;

    /* renamed from: d */
    private int f525d = 0;

    /* renamed from: e */
    private boolean f526e = false;

    /* renamed from: f */
    private boolean f527f = false;

    /* renamed from: g */
    private ArrayList<C0254b.C0256b> f528g = new ArrayList<>();

    public C0258d(@NonNull C0257c cVar) {
        this.f524c = cVar;
        this.f523b = C0254b.C0256b.INITIALIZED;
    }

    /* renamed from: a */
    public void mo464a(C0254b.C0256b bVar) {
        this.f523b = bVar;
    }

    /* renamed from: a */
    public void mo463a(C0254b.C0255a aVar) {
        this.f523b = m673b(aVar);
        if (this.f526e || this.f525d != 0) {
            this.f527f = true;
            return;
        }
        this.f526e = true;
        m680e();
        this.f526e = false;
    }

    /* renamed from: a */
    private boolean m672a() {
        if (this.f522a.mo439a() == 0) {
            return true;
        }
        C0254b.C0256b bVar = this.f522a.mo442d().getValue().f531a;
        C0254b.C0256b bVar2 = this.f522a.mo443e().getValue().f531a;
        if (bVar == bVar2 && this.f523b == bVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m674b() {
        this.f528g.remove(this.f528g.size() - 1);
    }

    /* renamed from: b */
    private void m675b(C0254b.C0256b bVar) {
        this.f528g.add(bVar);
    }

    /* renamed from: b */
    static C0254b.C0256b m673b(C0254b.C0255a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0254b.C0256b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0254b.C0256b.STARTED;
            case ON_RESUME:
                return C0254b.C0256b.RESUMED;
            case ON_DESTROY:
                return C0254b.C0256b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: c */
    private static C0254b.C0255a m676c(C0254b.C0256b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0254b.C0255a.ON_DESTROY;
            case STARTED:
                return C0254b.C0255a.ON_STOP;
            case RESUMED:
                return C0254b.C0255a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: d */
    private static C0254b.C0255a m678d(C0254b.C0256b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0254b.C0255a.ON_CREATE;
            case CREATED:
                return C0254b.C0255a.ON_START;
            case STARTED:
                return C0254b.C0255a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: c */
    private void m677c() {
        C0244b<K, V>.d c = this.f522a.mo441c();
        while (c.hasNext() && !this.f527f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0260a aVar = (C0260a) entry.getValue();
            while (aVar.f531a.compareTo(this.f523b) < 0 && !this.f527f && this.f522a.mo438a(entry.getKey())) {
                m675b(aVar.f531a);
                aVar.mo465a(this.f524c, m678d(aVar.f531a));
                m674b();
            }
        }
    }

    /* renamed from: d */
    private void m679d() {
        Iterator<Map.Entry<Object, C0260a>> b = this.f522a.mo440b();
        while (b.hasNext() && !this.f527f) {
            Map.Entry next = b.next();
            C0260a aVar = (C0260a) next.getValue();
            while (aVar.f531a.compareTo(this.f523b) > 0 && !this.f527f && this.f522a.mo438a(next.getKey())) {
                C0254b.C0255a c = m676c(aVar.f531a);
                m675b(m673b(c));
                aVar.mo465a(this.f524c, c);
                m674b();
            }
        }
    }

    /* renamed from: e */
    private void m680e() {
        while (!m672a()) {
            this.f527f = false;
            if (this.f523b.compareTo(this.f522a.mo442d().getValue().f531a) < 0) {
                m679d();
            }
            Map.Entry<Object, C0260a> e = this.f522a.mo443e();
            if (!this.f527f && e != null && this.f523b.compareTo(e.getValue().f531a) > 0) {
                m677c();
            }
        }
        this.f527f = false;
    }

    /* renamed from: a */
    static C0254b.C0256b m671a(@NonNull C0254b.C0256b bVar, @Nullable C0254b.C0256b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: android.arch.lifecycle.d$a */
    /* compiled from: LifecycleRegistry */
    static class C0260a {

        /* renamed from: a */
        C0254b.C0256b f531a;

        /* renamed from: b */
        C0253a f532b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo465a(C0257c cVar, C0254b.C0255a aVar) {
            C0254b.C0256b b = C0258d.m673b(aVar);
            this.f531a = C0258d.m671a(this.f531a, b);
            this.f532b.mo459a(cVar, aVar);
            this.f531a = b;
        }
    }
}
