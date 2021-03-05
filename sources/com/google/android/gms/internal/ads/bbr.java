package com.google.android.gms.internal.ads;

public class bbr {

    /* renamed from: a */
    private int f3486a;

    /* renamed from: a */
    public void mo11644a() {
        this.f3486a = 0;
    }

    /* renamed from: b */
    public final boolean mo11647b() {
        return mo11649c(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean mo11648c() {
        return mo11649c(4);
    }

    /* renamed from: d */
    public final boolean mo11650d() {
        return mo11649c(1);
    }

    /* renamed from: a */
    public final void mo11645a(int i) {
        this.f3486a = i;
    }

    /* renamed from: b */
    public final void mo11646b(int i) {
        this.f3486a |= Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo11649c(int i) {
        return (this.f3486a & i) == i;
    }
}
