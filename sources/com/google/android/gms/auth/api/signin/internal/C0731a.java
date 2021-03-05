package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C0731a {

    /* renamed from: a */
    private static int f708a = 31;

    /* renamed from: b */
    private int f709b = 1;

    /* renamed from: a */
    public C0731a mo9462a(Object obj) {
        this.f709b = (f708a * this.f709b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C0731a mo9463a(boolean z) {
        this.f709b = (f708a * this.f709b) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public int mo9461a() {
        return this.f709b;
    }
}
