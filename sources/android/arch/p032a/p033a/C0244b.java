package android.arch.p032a.p033a;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.arch.a.a.b */
/* compiled from: SafeIterableMap */
public class C0244b<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0248c<K, V> f496a;

    /* renamed from: b */
    private C0248c<K, V> f497b;

    /* renamed from: c */
    private WeakHashMap<Object<K, V>, Boolean> f498c = new WeakHashMap<>();

    /* renamed from: d */
    private int f499d = 0;

    /* renamed from: a */
    public int mo439a() {
        return this.f499d;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        C0246a aVar = new C0246a(this.f496a, this.f497b);
        this.f498c.put(aVar, false);
        return aVar;
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo440b() {
        C0247b bVar = new C0247b(this.f497b, this.f496a);
        this.f498c.put(bVar, false);
        return bVar;
    }

    /* renamed from: c */
    public C0244b<K, V>.d mo441c() {
        C0244b<K, V>.d dVar = new C0249d();
        this.f498c.put(dVar, false);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo442d() {
        return this.f496a;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo443e() {
        return this.f497b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0244b)) {
            return false;
        }
        C0244b bVar = (C0244b) obj;
        if (mo439a() != bVar.mo439a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: android.arch.a.a.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C0250e<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0248c<K, V> f507a;

        /* renamed from: b */
        C0248c<K, V> f508b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0248c<K, V> mo447a(C0248c<K, V> cVar);

        C0250e(C0248c<K, V> cVar, C0248c<K, V> cVar2) {
            this.f507a = cVar2;
            this.f508b = cVar;
        }

        public boolean hasNext() {
            return this.f508b != null;
        }

        /* renamed from: b */
        private C0248c<K, V> m660b() {
            if (this.f508b == this.f507a || this.f507a == null) {
                return null;
            }
            return mo447a(this.f508b);
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0248c<K, V> cVar = this.f508b;
            this.f508b = m660b();
            return cVar;
        }
    }

    /* renamed from: android.arch.a.a.b$a */
    /* compiled from: SafeIterableMap */
    static class C0246a<K, V> extends C0250e<K, V> {
        C0246a(C0248c<K, V> cVar, C0248c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0248c<K, V> mo447a(C0248c<K, V> cVar) {
            return cVar.f502c;
        }
    }

    /* renamed from: android.arch.a.a.b$b */
    /* compiled from: SafeIterableMap */
    private static class C0247b<K, V> extends C0250e<K, V> {
        C0247b(C0248c<K, V> cVar, C0248c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0248c<K, V> mo447a(C0248c<K, V> cVar) {
            return cVar.f503d;
        }
    }

    /* renamed from: android.arch.a.a.b$d */
    /* compiled from: SafeIterableMap */
    private class C0249d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0248c<K, V> f505b;

        /* renamed from: c */
        private boolean f506c;

        private C0249d() {
            this.f506c = true;
        }

        public boolean hasNext() {
            if (this.f506c) {
                if (C0244b.this.f496a != null) {
                    return true;
                }
                return false;
            } else if (this.f505b == null || this.f505b.f502c == null) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (this.f506c) {
                this.f506c = false;
                this.f505b = C0244b.this.f496a;
            } else {
                this.f505b = this.f505b != null ? this.f505b.f502c : null;
            }
            return this.f505b;
        }
    }

    /* renamed from: android.arch.a.a.b$c */
    /* compiled from: SafeIterableMap */
    static class C0248c<K, V> implements Map.Entry<K, V> {
        @NonNull

        /* renamed from: a */
        final K f500a;
        @NonNull

        /* renamed from: b */
        final V f501b;

        /* renamed from: c */
        C0248c<K, V> f502c;

        /* renamed from: d */
        C0248c<K, V> f503d;

        @NonNull
        public K getKey() {
            return this.f500a;
        }

        @NonNull
        public V getValue() {
            return this.f501b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f500a + "=" + this.f501b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0248c)) {
                return false;
            }
            C0248c cVar = (C0248c) obj;
            if (!this.f500a.equals(cVar.f500a) || !this.f501b.equals(cVar.f501b)) {
                return false;
            }
            return true;
        }
    }
}
