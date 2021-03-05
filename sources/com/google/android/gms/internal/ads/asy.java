package com.google.android.gms.internal.ads;

import java.util.Map;

final class asy implements Comparable<asy>, Map.Entry<K, V> {

    /* renamed from: a */
    private final K f2455a;

    /* renamed from: b */
    private V f2456b;

    /* renamed from: c */
    private final /* synthetic */ asr f2457c;

    asy(asr asr, Map.Entry<K, V> entry) {
        this(asr, (Comparable) entry.getKey(), entry.getValue());
    }

    asy(asr asr, K k, V v) {
        this.f2457c = asr;
        this.f2455a = k;
        this.f2456b = v;
    }

    public final V getValue() {
        return this.f2456b;
    }

    public final V setValue(V v) {
        this.f2457c.m3828f();
        V v2 = this.f2456b;
        this.f2456b = v;
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
        return m3841a(this.f2455a, entry.getKey()) && m3841a(this.f2456b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f2455a == null ? 0 : this.f2455a.hashCode();
        if (this.f2456b != null) {
            i = this.f2456b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2455a);
        String valueOf2 = String.valueOf(this.f2456b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m3841a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f2455a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((asy) obj).getKey());
    }
}
