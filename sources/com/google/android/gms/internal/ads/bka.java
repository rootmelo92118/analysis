package com.google.android.gms.internal.ads;

public final class bka {

    /* renamed from: a */
    private boolean f4538a;

    /* renamed from: a */
    public final synchronized boolean mo12040a() {
        if (this.f4538a) {
            return false;
        }
        this.f4538a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean mo12041b() {
        boolean z;
        z = this.f4538a;
        this.f4538a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized void mo12042c() {
        while (!this.f4538a) {
            wait();
        }
    }
}
