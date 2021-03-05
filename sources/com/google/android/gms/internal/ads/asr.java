package com.google.android.gms.internal.ads;

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

class asr<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f2442a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<asy> f2443b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f2444c;

    /* renamed from: d */
    private boolean f2445d;

    /* renamed from: e */
    private volatile ata f2446e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f2447f;

    /* renamed from: g */
    private volatile asu f2448g;

    /* renamed from: a */
    static <FieldDescriptorType extends aqf<FieldDescriptorType>> asr<FieldDescriptorType, Object> m3821a(int i) {
        return new ass(i);
    }

    private asr(int i) {
        this.f2442a = i;
        this.f2443b = Collections.emptyList();
        this.f2444c = Collections.emptyMap();
        this.f2447f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo11122a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f2445d) {
            if (this.f2444c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f2444c);
            }
            this.f2444c = map;
            if (this.f2447f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f2447f);
            }
            this.f2447f = map2;
            this.f2445d = true;
        }
    }

    /* renamed from: b */
    public final boolean mo11124b() {
        return this.f2445d;
    }

    /* renamed from: c */
    public final int mo11125c() {
        return this.f2443b.size();
    }

    /* renamed from: b */
    public final Map.Entry<K, V> mo11123b(int i) {
        return this.f2443b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo11128d() {
        if (this.f2444c.isEmpty()) {
            return asv.m3839a();
        }
        return this.f2444c.entrySet();
    }

    public int size() {
        return this.f2443b.size() + this.f2444c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3820a(comparable) >= 0 || this.f2444c.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m3820a(comparable);
        if (a >= 0) {
            return this.f2443b.get(a).getValue();
        }
        return this.f2444c.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m3828f();
        int a = m3820a(k);
        if (a >= 0) {
            return this.f2443b.get(a).setValue(v);
        }
        m3828f();
        if (this.f2443b.isEmpty() && !(this.f2443b instanceof ArrayList)) {
            this.f2443b = new ArrayList(this.f2442a);
        }
        int i = -(a + 1);
        if (i >= this.f2442a) {
            return m3829g().put(k, v);
        }
        if (this.f2443b.size() == this.f2442a) {
            asy remove = this.f2443b.remove(this.f2442a - 1);
            m3829g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f2443b.add(i, new asy(this, k, v));
        return null;
    }

    public void clear() {
        m3828f();
        if (!this.f2443b.isEmpty()) {
            this.f2443b.clear();
        }
        if (!this.f2444c.isEmpty()) {
            this.f2444c.clear();
        }
    }

    public V remove(Object obj) {
        m3828f();
        Comparable comparable = (Comparable) obj;
        int a = m3820a(comparable);
        if (a >= 0) {
            return m3825c(a);
        }
        if (this.f2444c.isEmpty()) {
            return null;
        }
        return this.f2444c.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m3825c(int i) {
        m3828f();
        V value = this.f2443b.remove(i).getValue();
        if (!this.f2444c.isEmpty()) {
            Iterator it = m3829g().entrySet().iterator();
            this.f2443b.add(new asy(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m3820a(K k) {
        int size = this.f2443b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f2443b.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f2443b.get(i2).getKey());
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
        if (this.f2446e == null) {
            this.f2446e = new ata(this, (ass) null);
        }
        return this.f2446e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> mo11129e() {
        if (this.f2448g == null) {
            this.f2448g = new asu(this, (ass) null);
        }
        return this.f2448g;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m3828f() {
        if (this.f2445d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m3829g() {
        m3828f();
        if (this.f2444c.isEmpty() && !(this.f2444c instanceof TreeMap)) {
            this.f2444c = new TreeMap();
            this.f2447f = ((TreeMap) this.f2444c).descendingMap();
        }
        return (SortedMap) this.f2444c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asr)) {
            return super.equals(obj);
        }
        asr asr = (asr) obj;
        int size = size();
        if (size != asr.size()) {
            return false;
        }
        int c = mo11125c();
        if (c != asr.mo11125c()) {
            return entrySet().equals(asr.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo11123b(i).equals(asr.mo11123b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f2444c.equals(asr.f2444c);
        }
        return true;
    }

    public int hashCode() {
        int c = mo11125c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f2443b.get(i2).hashCode();
        }
        return this.f2444c.size() > 0 ? i + this.f2444c.hashCode() : i;
    }

    /* synthetic */ asr(int i, ass ass) {
        this(i);
    }
}
