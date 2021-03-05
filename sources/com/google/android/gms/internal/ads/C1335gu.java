package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.gu */
public final class C1335gu {

    /* renamed from: a */
    private static C1335gu f5406a = new C1335gu();

    /* renamed from: b */
    private int f5407b;

    /* renamed from: c */
    private int f5408c;

    /* renamed from: d */
    private int f5409d;

    /* renamed from: e */
    private int f5410e;

    /* renamed from: f */
    private int f5411f;

    /* renamed from: a */
    public static C1335gu m6945a() {
        return f5406a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12571a(int i) {
        this.f5407b += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12572b() {
        this.f5408c++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12573c() {
        this.f5409d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12574d() {
        this.f5410e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12575e() {
        this.f5411f++;
    }

    /* renamed from: f */
    public final int mo12576f() {
        return this.f5408c;
    }

    /* renamed from: g */
    public final int mo12577g() {
        return this.f5409d;
    }

    /* renamed from: h */
    public final int mo12578h() {
        return this.f5410e;
    }

    /* renamed from: i */
    public final int mo12579i() {
        return this.f5411f;
    }

    /* renamed from: j */
    public final Bundle mo12580j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f5407b);
        bundle.putInt("ipds", this.f5408c);
        bundle.putInt("ipde", this.f5409d);
        bundle.putInt("iph", this.f5410e);
        bundle.putInt("ipm", this.f5411f);
        return bundle;
    }
}
