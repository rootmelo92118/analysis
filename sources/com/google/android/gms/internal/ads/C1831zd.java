package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* renamed from: com.google.android.gms.internal.ads.zd */
public class C1831zd extends avm implements Closeable {

    /* renamed from: f */
    private static avv f6923f = avv.m4301a(C1831zd.class);

    public C1831zd(avp avp, C1802yb ybVar) {
        mo11305a(avp, avp.mo10275a(), ybVar);
    }

    public void close() {
        this.f2710b.close();
    }

    public String toString() {
        String obj = this.f2710b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
