package com.google.firebase.components;

import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.firebase.components.e */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C2346e {

    /* renamed from: a */
    private final Class<?> f8776a;

    /* renamed from: b */
    private final int f8777b;

    /* renamed from: c */
    private final int f8778c;

    private C2346e(Class<?> cls, int i, int i2) {
        this.f8776a = (Class) C0926p.m1307a(cls, (Object) "Null dependency anInterface.");
        this.f8777b = i;
        this.f8778c = i2;
    }

    /* renamed from: a */
    public static C2346e m11571a(Class<?> cls) {
        return new C2346e(cls, 1, 0);
    }

    /* renamed from: a */
    public final Class<?> mo14935a() {
        return this.f8776a;
    }

    /* renamed from: b */
    public final boolean mo14936b() {
        return this.f8777b == 1;
    }

    /* renamed from: c */
    public final boolean mo14937c() {
        return this.f8778c == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2346e)) {
            return false;
        }
        C2346e eVar = (C2346e) obj;
        if (this.f8776a == eVar.f8776a && this.f8777b == eVar.f8777b && this.f8778c == eVar.f8778c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8776a.hashCode() ^ 1000003) * 1000003) ^ this.f8777b) * 1000003) ^ this.f8778c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8776a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f8777b == 1);
        sb.append(", direct=");
        if (this.f8778c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
