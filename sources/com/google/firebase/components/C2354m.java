package com.google.firebase.components;

import com.google.android.gms.common.internal.C0926p;
import com.google.firebase.components.C2340a;
import com.google.firebase.p047a.C2330c;
import com.google.firebase.p047a.C2331d;
import com.google.firebase.p048b.C2338a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.m */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C2354m extends C2350i {

    /* renamed from: a */
    private final List<C2340a<?>> f8781a;

    /* renamed from: b */
    private final Map<Class<?>, C2358q<?>> f8782b = new HashMap();

    /* renamed from: c */
    private final C2356o f8783c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14933a(Class cls) {
        return super.mo14933a(cls);
    }

    public C2354m(Executor executor, Iterable<C2345d> iterable, C2340a<?>... aVarArr) {
        this.f8783c = new C2356o(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2340a.m11549a(this.f8783c, C2356o.class, C2331d.class, C2330c.class));
        for (C2345d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        this.f8781a = Collections.unmodifiableList(C2340a.C23411.m11558a((List<C2340a<?>>) arrayList));
        for (C2340a<?> a : this.f8781a) {
            m11582a(a);
        }
        m11581a();
    }

    /* renamed from: b */
    public final <T> C2338a<T> mo14934b(Class<T> cls) {
        C0926p.m1307a(cls, (Object) "Null interface requested.");
        return this.f8782b.get(cls);
    }

    /* renamed from: a */
    public final void mo14942a(boolean z) {
        for (C2340a next : this.f8781a) {
            if (next.mo14924e() || (next.mo14925f() && z)) {
                mo14933a((Class) next.mo14920a().iterator().next());
            }
        }
        this.f8783c.mo14950a();
    }

    /* renamed from: a */
    private <T> void m11582a(C2340a<T> aVar) {
        C2358q qVar = new C2358q(aVar.mo14922c(), new C2360s(aVar, this));
        for (Class<? super T> put : aVar.mo14920a()) {
            this.f8782b.put(put, qVar);
        }
    }

    /* renamed from: a */
    private void m11581a() {
        for (C2340a next : this.f8781a) {
            Iterator<C2346e> it = next.mo14921b().iterator();
            while (true) {
                if (it.hasNext()) {
                    C2346e next2 = it.next();
                    if (next2.mo14936b() && !this.f8782b.containsKey(next2.mo14935a())) {
                        throw new C2349h(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo14935a()}));
                    }
                }
            }
        }
    }
}
