package com.google.android.gms.internal.ads;

public final class brk<T> {

    /* renamed from: a */
    public final T f5185a;

    /* renamed from: b */
    public final awd f5186b;

    /* renamed from: c */
    public final C1236dd f5187c;

    /* renamed from: d */
    public boolean f5188d;

    /* renamed from: a */
    public static <T> brk<T> m6331a(T t, awd awd) {
        return new brk<>(t, awd);
    }

    /* renamed from: a */
    public static <T> brk<T> m6330a(C1236dd ddVar) {
        return new brk<>(ddVar);
    }

    private brk(T t, awd awd) {
        this.f5188d = false;
        this.f5185a = t;
        this.f5186b = awd;
        this.f5187c = null;
    }

    private brk(C1236dd ddVar) {
        this.f5188d = false;
        this.f5185a = null;
        this.f5186b = null;
        this.f5187c = ddVar;
    }
}
