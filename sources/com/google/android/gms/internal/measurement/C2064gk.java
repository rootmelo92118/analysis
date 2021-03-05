package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.gk */
class C2064gk<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f7831a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C2071gr> f7832b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f7833c;

    /* renamed from: d */
    private boolean f7834d;

    /* renamed from: e */
    private volatile C2073gt f7835e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f7836f;

    /* renamed from: g */
    private volatile C2067gn f7837g;

    /* renamed from: a */
    static <FieldDescriptorType extends C1996eb<FieldDescriptorType>> C2064gk<FieldDescriptorType, Object> m9891a(int i) {
        return new C2065gl(i);
    }

    private C2064gk(int i) {
        this.f7831a = i;
        this.f7832b = Collections.emptyList();
        this.f7833c = Collections.emptyMap();
        this.f7836f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo13943a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f7834d) {
            if (this.f7833c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f7833c);
            }
            this.f7833c = map;
            if (this.f7836f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f7836f);
            }
            this.f7836f = map2;
            this.f7834d = true;
        }
    }

    /* renamed from: b */
    public final boolean mo13945b() {
        return this.f7834d;
    }

    /* renamed from: c */
    public final int mo13946c() {
        return this.f7832b.size();
    }

    /* renamed from: b */
    public final Map.Entry<K, V> mo13944b(int i) {
        return this.f7832b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo13949d() {
        if (this.f7833c.isEmpty()) {
            return C2068go.m9909a();
        }
        return this.f7833c.entrySet();
    }

    public int size() {
        return this.f7832b.size() + this.f7833c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9890a(comparable) >= 0 || this.f7833c.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m9890a(comparable);
        if (a >= 0) {
            return this.f7832b.get(a).getValue();
        }
        return this.f7833c.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m9898f();
        int a = m9890a(k);
        if (a >= 0) {
            return this.f7832b.get(a).setValue(v);
        }
        m9898f();
        if (this.f7832b.isEmpty() && !(this.f7832b instanceof ArrayList)) {
            this.f7832b = new ArrayList(this.f7831a);
        }
        int i = -(a + 1);
        if (i >= this.f7831a) {
            return m9899g().put(k, v);
        }
        if (this.f7832b.size() == this.f7831a) {
            C2071gr remove = this.f7832b.remove(this.f7831a - 1);
            m9899g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f7832b.add(i, new C2071gr(this, k, v));
        return null;
    }

    public void clear() {
        m9898f();
        if (!this.f7832b.isEmpty()) {
            this.f7832b.clear();
        }
        if (!this.f7833c.isEmpty()) {
            this.f7833c.clear();
        }
    }

    public V remove(Object obj) {
        m9898f();
        Comparable comparable = (Comparable) obj;
        int a = m9890a(comparable);
        if (a >= 0) {
            return m9895c(a);
        }
        if (this.f7833c.isEmpty()) {
            return null;
        }
        return this.f7833c.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m9895c(int i) {
        m9898f();
        V value = this.f7832b.remove(i).getValue();
        if (!this.f7833c.isEmpty()) {
            Iterator it = m9899g().entrySet().iterator();
            this.f7832b.add(new C2071gr(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m9890a(K k) {
        int size = this.f7832b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f7832b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f7832b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f7835e == null) {
            this.f7835e = new C2073gt(this, (C2065gl) null);
        }
        return this.f7835e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> mo13950e() {
        if (this.f7837g == null) {
            this.f7837g = new C2067gn(this, (C2065gl) null);
        }
        return this.f7837g;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m9898f() {
        if (this.f7834d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m9899g() {
        m9898f();
        if (this.f7833c.isEmpty() && !(this.f7833c instanceof TreeMap)) {
            this.f7833c = new TreeMap();
            this.f7836f = ((TreeMap) this.f7833c).descendingMap();
        }
        return (SortedMap) this.f7833c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2064gk)) {
            return super.equals(obj);
        }
        C2064gk gkVar = (C2064gk) obj;
        int size = size();
        if (size != gkVar.size()) {
            return false;
        }
        int c = mo13946c();
        if (c != gkVar.mo13946c()) {
            return entrySet().equals(gkVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo13944b(i).equals(gkVar.mo13944b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f7833c.equals(gkVar.f7833c);
        }
        return true;
    }

    public int hashCode() {
        int c = mo13946c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f7832b.get(i2).hashCode();
        }
        return this.f7833c.size() > 0 ? i + this.f7833c.hashCode() : i;
    }

    /* synthetic */ C2064gk(int i, C2065gl glVar) {
        this(i);
    }
}
