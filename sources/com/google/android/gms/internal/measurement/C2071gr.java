package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gr */
final class C2071gr implements Comparable<C2071gr>, Map.Entry<K, V> {

    /* renamed from: a */
    private final K f7844a;

    /* renamed from: b */
    private V f7845b;

    /* renamed from: c */
    private final /* synthetic */ C2064gk f7846c;

    C2071gr(C2064gk gkVar, Map.Entry<K, V> entry) {
        this(gkVar, (Comparable) entry.getKey(), entry.getValue());
    }

    C2071gr(C2064gk gkVar, K k, V v) {
        this.f7846c = gkVar;
        this.f7844a = k;
        this.f7845b = v;
    }

    public final V getValue() {
        return this.f7845b;
    }

    public final V setValue(V v) {
        this.f7846c.m9898f();
        V v2 = this.f7845b;
        this.f7845b = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m9911a(this.f7844a, entry.getKey()) && m9911a(this.f7845b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f7844a == null ? 0 : this.f7844a.hashCode();
        if (this.f7845b != null) {
            i = this.f7845b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7844a);
        String valueOf2 = String.valueOf(this.f7845b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m9911a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f7844a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2071gr) obj).getKey());
    }
}
