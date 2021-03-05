package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class bpg {

    /* renamed from: a */
    private final byte[] f4969a;

    /* renamed from: b */
    private int f4970b;

    /* renamed from: c */
    private int f4971c;

    /* renamed from: d */
    private final /* synthetic */ bpc f4972d;

    private bpg(bpc bpc, byte[] bArr) {
        this.f4972d = bpc;
        this.f4969a = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo12288a() {
        try {
            if (this.f4972d.f4966b) {
                this.f4972d.f4965a.mo11441a(this.f4969a);
                this.f4972d.f4965a.mo11438a(this.f4970b);
                this.f4972d.f4965a.mo11443b(this.f4971c);
                this.f4972d.f4965a.mo11442a((int[]) null);
                this.f4972d.f4965a.mo11437a();
            }
        } catch (RemoteException e) {
            aai.m1622a("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final bpg mo12287a(int i) {
        this.f4970b = i;
        return this;
    }

    /* renamed from: b */
    public final bpg mo12289b(int i) {
        this.f4971c = i;
        return this;
    }
}
