package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.ad */
final class C2369ad implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f8832a;

    /* renamed from: b */
    private final /* synthetic */ Intent f8833b;

    /* renamed from: c */
    private final /* synthetic */ zzb f8834c;

    C2369ad(zzb zzb, Intent intent, Intent intent2) {
        this.f8834c = zzb;
        this.f8832a = intent;
        this.f8833b = intent2;
    }

    public final void run() {
        this.f8834c.mo14974b(this.f8832a);
        this.f8834c.m11780d(this.f8833b);
    }
}
