package com.google.firebase.components;

import com.google.android.gms.common.internal.C0926p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C2340a<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f8764a;

    /* renamed from: b */
    private final Set<C2346e> f8765b;

    /* renamed from: c */
    private final int f8766c;

    /* renamed from: d */
    private final C2344c<T> f8767d;

    /* renamed from: e */
    private final Set<Class<?>> f8768e;

    /* renamed from: a */
    static /* synthetic */ Object m11550a(Object obj) {
        return obj;
    }

    /* synthetic */ C2340a(Set set, Set set2, int i, C2344c cVar, Set set3, byte b) {
        this(set, set2, i, cVar, set3);
    }

    private C2340a(Set<Class<? super T>> set, Set<C2346e> set2, int i, C2344c<T> cVar, Set<Class<?>> set3) {
        this.f8764a = Collections.unmodifiableSet(set);
        this.f8765b = Collections.unmodifiableSet(set2);
        this.f8766c = i;
        this.f8767d = cVar;
        this.f8768e = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public final Set<Class<? super T>> mo14920a() {
        return this.f8764a;
    }

    /* renamed from: b */
    public final Set<C2346e> mo14921b() {
        return this.f8765b;
    }

    /* renamed from: c */
    public final C2344c<T> mo14922c() {
        return this.f8767d;
    }

    /* renamed from: d */
    public final Set<Class<?>> mo14923d() {
        return this.f8768e;
    }

    /* renamed from: e */
    public final boolean mo14924e() {
        return this.f8766c == 1;
    }

    /* renamed from: f */
    public final boolean mo14925f() {
        return this.f8766c == 2;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8764a.toArray()) + ">{" + this.f8766c + ", deps=" + Arrays.toString(this.f8765b.toArray()) + "}";
    }

    /* renamed from: a */
    public static <T> C2342a<T> m11547a(Class<T> cls) {
        return new C2342a<>(cls, new Class[0], (byte) 0);
    }

    /* renamed from: a */
    public static <T> C2342a<T> m11548a(Class<T> cls, Class<? super T>... clsArr) {
        return new C2342a<>(cls, clsArr, (byte) 0);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C2340a<T> m11549a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m11548a(cls, clsArr).mo14929a(C2351j.m11576a((Object) t)).mo14932c();
    }

    /* renamed from: com.google.firebase.components.a$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public static class C2342a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f8771a;

        /* renamed from: b */
        private final Set<C2346e> f8772b;

        /* renamed from: c */
        private int f8773c;

        /* renamed from: d */
        private C2344c<T> f8774d;

        /* renamed from: e */
        private Set<Class<?>> f8775e;

        /* synthetic */ C2342a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        private C2342a(Class<T> cls, Class<? super T>... clsArr) {
            this.f8771a = new HashSet();
            this.f8772b = new HashSet();
            this.f8773c = 0;
            this.f8775e = new HashSet();
            C0926p.m1307a(cls, (Object) "Null interface");
            this.f8771a.add(cls);
            for (Class<? super T> a : clsArr) {
                C0926p.m1307a(a, (Object) "Null interface");
            }
            Collections.addAll(this.f8771a, clsArr);
        }

        /* renamed from: a */
        public C2342a<T> mo14930a(C2346e eVar) {
            C0926p.m1307a(eVar, (Object) "Null dependency");
            C0926p.m1317b(!this.f8771a.contains(eVar.mo14935a()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f8772b.add(eVar);
            return this;
        }

        /* renamed from: a */
        public C2342a<T> mo14928a() {
            return m11562a(1);
        }

        /* renamed from: b */
        public C2342a<T> mo14931b() {
            return m11562a(2);
        }

        /* renamed from: a */
        private C2342a<T> m11562a(int i) {
            C0926p.m1313a(this.f8773c == 0, (Object) "Instantiation type has already been set.");
            this.f8773c = i;
            return this;
        }

        /* renamed from: a */
        public C2342a<T> mo14929a(C2344c<T> cVar) {
            this.f8774d = (C2344c) C0926p.m1307a(cVar, (Object) "Null factory");
            return this;
        }

        /* renamed from: c */
        public C2340a<T> mo14932c() {
            C0926p.m1313a(this.f8774d != null, (Object) "Missing required property: factory.");
            return new C2340a(new HashSet(this.f8771a), new HashSet(this.f8772b), this.f8773c, this.f8774d, this.f8775e, (byte) 0);
        }
    }
}
